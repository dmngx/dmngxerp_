/*
               File: PaisConversion
        Description: Conversion for table Pais
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:44.44
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paisconversion extends GXProcedure
{
   public paisconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paisconversion.class ), "" );
   }

   public paisconversion( int remoteHandle ,
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
      /* Using cursor PAISCONVER2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4PaisNombre = PAISCONVER2_A4PaisNombre[0] ;
         A3PaisId = PAISCONVER2_A3PaisId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0002

         */
         AV2PaisId = A3PaisId ;
         AV3PaisNombre = A4PaisNombre ;
         /* Using cursor PAISCONVER3 */
         pr_default.execute(1, new Object[] {new Short(AV2PaisId), AV3PaisNombre});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0002") ;
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
      PAISCONVER2_A4PaisNombre = new String[] {""} ;
      PAISCONVER2_A3PaisId = new short[1] ;
      A4PaisNombre = "" ;
      AV3PaisNombre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.paisconversion__default(),
         new Object[] {
             new Object[] {
            PAISCONVER2_A4PaisNombre, PAISCONVER2_A3PaisId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A3PaisId ;
   private short AV2PaisId ;
   private short Gx_err ;
   private int GIGXA0002 ;
   private String scmdbuf ;
   private String A4PaisNombre ;
   private String Gx_emsg ;
   private String AV3PaisNombre ;
   private IDataStoreProvider pr_default ;
   private String[] PAISCONVER2_A4PaisNombre ;
   private short[] PAISCONVER2_A3PaisId ;
}

final  class paisconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("PAISCONVER2", "SELECT PaisNombre, PaisId FROM Pais ORDER BY PaisId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("PAISCONVER3", "INSERT INTO GXA0002(PaisId, PaisNombre) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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

