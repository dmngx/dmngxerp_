/*
               File: CfgComprobanteConversion
        Description: Conversion for table CfgComprobante
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:43.51
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cfgcomprobanteconversion extends GXProcedure
{
   public cfgcomprobanteconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cfgcomprobanteconversion.class ), "" );
   }

   public cfgcomprobanteconversion( int remoteHandle ,
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
      /* Using cursor CFGCOMPROB2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A34CfgComprobanteSistema = CFGCOMPROB2_A34CfgComprobanteSistema[0] ;
         A33CfgComprobanteNombre = CFGCOMPROB2_A33CfgComprobanteNombre[0] ;
         A32CfgComprobantePrefijo = CFGCOMPROB2_A32CfgComprobantePrefijo[0] ;
         A31CfgComprobanteId = CFGCOMPROB2_A31CfgComprobanteId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0011

         */
         AV2CfgComprobanteId = A31CfgComprobanteId ;
         AV3CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         AV4CfgComprobanteNombre = A33CfgComprobanteNombre ;
         AV5CfgComprobanteSistema = A34CfgComprobanteSistema ;
         /* Using cursor CFGCOMPROB3 */
         pr_default.execute(1, new Object[] {AV2CfgComprobanteId, new Short(AV3CfgComprobantePrefijo), AV4CfgComprobanteNombre, new Byte(AV5CfgComprobanteSistema)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0011") ;
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
      CFGCOMPROB2_A34CfgComprobanteSistema = new byte[1] ;
      CFGCOMPROB2_A33CfgComprobanteNombre = new String[] {""} ;
      CFGCOMPROB2_A32CfgComprobantePrefijo = new short[1] ;
      CFGCOMPROB2_A31CfgComprobanteId = new String[] {""} ;
      A33CfgComprobanteNombre = "" ;
      A31CfgComprobanteId = "" ;
      AV2CfgComprobanteId = "" ;
      AV4CfgComprobanteNombre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.cfgcomprobanteconversion__default(),
         new Object[] {
             new Object[] {
            CFGCOMPROB2_A34CfgComprobanteSistema, CFGCOMPROB2_A33CfgComprobanteNombre, CFGCOMPROB2_A32CfgComprobantePrefijo, CFGCOMPROB2_A31CfgComprobanteId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A34CfgComprobanteSistema ;
   private byte AV5CfgComprobanteSistema ;
   private short A32CfgComprobantePrefijo ;
   private short AV3CfgComprobantePrefijo ;
   private short Gx_err ;
   private int GIGXA0011 ;
   private String scmdbuf ;
   private String A33CfgComprobanteNombre ;
   private String A31CfgComprobanteId ;
   private String Gx_emsg ;
   private String AV2CfgComprobanteId ;
   private String AV4CfgComprobanteNombre ;
   private IDataStoreProvider pr_default ;
   private byte[] CFGCOMPROB2_A34CfgComprobanteSistema ;
   private String[] CFGCOMPROB2_A33CfgComprobanteNombre ;
   private short[] CFGCOMPROB2_A32CfgComprobantePrefijo ;
   private String[] CFGCOMPROB2_A31CfgComprobanteId ;
}

final  class cfgcomprobanteconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("CFGCOMPROB2", "SELECT CfgComprobanteSistema, CfgComprobanteNombre, CfgComprobantePrefijo, CfgComprobanteId FROM CfgComprobante ORDER BY CfgComprobanteId, CfgComprobantePrefijo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("CFGCOMPROB3", "INSERT INTO GXA0011(CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteNombre, CfgComprobanteSistema) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 250) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 10) ;
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
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 250, false);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

