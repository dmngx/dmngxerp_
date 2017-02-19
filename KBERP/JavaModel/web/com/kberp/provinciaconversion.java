/*
               File: ProvinciaConversion
        Description: Conversion for table Provincia
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:44.50
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class provinciaconversion extends GXProcedure
{
   public provinciaconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( provinciaconversion.class ), "" );
   }

   public provinciaconversion( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor PROVINCIAC2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2ProvinciaNombre = PROVINCIAC2_A2ProvinciaNombre[0] ;
         A1ProvinciaId = PROVINCIAC2_A1ProvinciaId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0001

         */
         AV2ProvinciaId = A1ProvinciaId ;
         AV3ProvinciaNombre = A2ProvinciaNombre ;
         /* Using cursor PROVINCIAC3 */
         pr_default.execute(1, new Object[] {new Short(AV2ProvinciaId), AV3ProvinciaNombre});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0001") ;
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PROVINCIAC2_A2ProvinciaNombre = new String[] {""} ;
      PROVINCIAC2_A1ProvinciaId = new short[1] ;
      A2ProvinciaNombre = "" ;
      AV3ProvinciaNombre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.provinciaconversion__default(),
         new Object[] {
             new Object[] {
            PROVINCIAC2_A2ProvinciaNombre, PROVINCIAC2_A1ProvinciaId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1ProvinciaId ;
   private short AV2ProvinciaId ;
   private short Gx_err ;
   private int GIGXA0001 ;
   private String scmdbuf ;
   private String A2ProvinciaNombre ;
   private String Gx_emsg ;
   private String AV3ProvinciaNombre ;
   private IDataStoreProvider pr_default ;
   private String[] PROVINCIAC2_A2ProvinciaNombre ;
   private short[] PROVINCIAC2_A1ProvinciaId ;
}

final  class provinciaconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("PROVINCIAC2", "SELECT ProvinciaNombre, ProvinciaId FROM Provincia ORDER BY ProvinciaId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("PROVINCIAC3", "INSERT INTO GXA0001(ProvinciaId, ProvinciaNombre) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 250) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 250, false);
               return;
      }
   }

}

