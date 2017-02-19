/*
               File: MarcaConversion
        Description: Conversion for table Marca
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:44.37
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class marcaconversion extends GXProcedure
{
   public marcaconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( marcaconversion.class ), "" );
   }

   public marcaconversion( int remoteHandle ,
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
      /* Using cursor MARCACONVE2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8MarcaNombre = MARCACONVE2_A8MarcaNombre[0] ;
         A7MarcaId = MARCACONVE2_A7MarcaId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0004

         */
         AV2MarcaId = A7MarcaId ;
         AV3MarcaNombre = A8MarcaNombre ;
         /* Using cursor MARCACONVE3 */
         pr_default.execute(1, new Object[] {new Short(AV2MarcaId), AV3MarcaNombre});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0004") ;
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
      MARCACONVE2_A8MarcaNombre = new String[] {""} ;
      MARCACONVE2_A7MarcaId = new short[1] ;
      A8MarcaNombre = "" ;
      AV3MarcaNombre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.marcaconversion__default(),
         new Object[] {
             new Object[] {
            MARCACONVE2_A8MarcaNombre, MARCACONVE2_A7MarcaId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A7MarcaId ;
   private short AV2MarcaId ;
   private short Gx_err ;
   private int GIGXA0004 ;
   private String scmdbuf ;
   private String A8MarcaNombre ;
   private String Gx_emsg ;
   private String AV3MarcaNombre ;
   private IDataStoreProvider pr_default ;
   private String[] MARCACONVE2_A8MarcaNombre ;
   private short[] MARCACONVE2_A7MarcaId ;
}

final  class marcaconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("MARCACONVE2", "SELECT MarcaNombre, MarcaId FROM Marca ORDER BY MarcaId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("MARCACONVE3", "INSERT INTO GXA0004(MarcaId, MarcaNombre) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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

