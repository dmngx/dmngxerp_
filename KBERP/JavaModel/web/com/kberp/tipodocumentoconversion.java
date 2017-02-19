/*
               File: TipoDocumentoConversion
        Description: Conversion for table TipoDocumento
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:44.65
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tipodocumentoconversion extends GXProcedure
{
   public tipodocumentoconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tipodocumentoconversion.class ), "" );
   }

   public tipodocumentoconversion( int remoteHandle ,
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
      /* Using cursor TIPODOCUME2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10TipoDocumentoNombre = TIPODOCUME2_A10TipoDocumentoNombre[0] ;
         A9TipoDocumentoId = TIPODOCUME2_A9TipoDocumentoId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0005

         */
         AV2TipoDocumentoId = A9TipoDocumentoId ;
         AV3TipoDocumentoNombre = A10TipoDocumentoNombre ;
         /* Using cursor TIPODOCUME3 */
         pr_default.execute(1, new Object[] {new Short(AV2TipoDocumentoId), AV3TipoDocumentoNombre});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0005") ;
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
      TIPODOCUME2_A10TipoDocumentoNombre = new String[] {""} ;
      TIPODOCUME2_A9TipoDocumentoId = new short[1] ;
      A10TipoDocumentoNombre = "" ;
      AV3TipoDocumentoNombre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.tipodocumentoconversion__default(),
         new Object[] {
             new Object[] {
            TIPODOCUME2_A10TipoDocumentoNombre, TIPODOCUME2_A9TipoDocumentoId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A9TipoDocumentoId ;
   private short AV2TipoDocumentoId ;
   private short Gx_err ;
   private int GIGXA0005 ;
   private String scmdbuf ;
   private String A10TipoDocumentoNombre ;
   private String Gx_emsg ;
   private String AV3TipoDocumentoNombre ;
   private IDataStoreProvider pr_default ;
   private String[] TIPODOCUME2_A10TipoDocumentoNombre ;
   private short[] TIPODOCUME2_A9TipoDocumentoId ;
}

final  class tipodocumentoconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TIPODOCUME2", "SELECT TipoDocumentoNombre, TipoDocumentoId FROM TipoDocumento ORDER BY TipoDocumentoId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("TIPODOCUME3", "INSERT INTO GXA0005(TipoDocumentoId, TipoDocumentoNombre) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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

