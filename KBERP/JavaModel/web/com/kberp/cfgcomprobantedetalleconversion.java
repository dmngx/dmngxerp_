/*
               File: CfgComprobanteDetalleConversion
        Description: Conversion for table CfgComprobanteDetalle
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:43.59
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cfgcomprobantedetalleconversion extends GXProcedure
{
   public cfgcomprobantedetalleconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cfgcomprobantedetalleconversion.class ), "" );
   }

   public cfgcomprobantedetalleconversion( int remoteHandle ,
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
         A38CfgComprobanteDetalleNroUltimo = CFGCOMPROB2_A38CfgComprobanteDetalleNroUltimo[0] ;
         A37CfgComprobanteDetalleNroHasta = CFGCOMPROB2_A37CfgComprobanteDetalleNroHasta[0] ;
         A36CfgComprobanteDetalleNroDesde = CFGCOMPROB2_A36CfgComprobanteDetalleNroDesde[0] ;
         A35CfgComprobanteDetalleLetra = CFGCOMPROB2_A35CfgComprobanteDetalleLetra[0] ;
         A32CfgComprobantePrefijo = CFGCOMPROB2_A32CfgComprobantePrefijo[0] ;
         A31CfgComprobanteId = CFGCOMPROB2_A31CfgComprobanteId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0012

         */
         AV2CfgComprobanteId = A31CfgComprobanteId ;
         AV3CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         AV4CfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
         AV5CfgComprobanteDetalleNroDesde = A36CfgComprobanteDetalleNroDesde ;
         AV6CfgComprobanteDetalleNroHasta = A37CfgComprobanteDetalleNroHasta ;
         AV7CfgComprobanteDetalleNroUltimo = A38CfgComprobanteDetalleNroUltimo ;
         /* Using cursor CFGCOMPROB3 */
         pr_default.execute(1, new Object[] {AV2CfgComprobanteId, new Short(AV3CfgComprobantePrefijo), new Byte(AV4CfgComprobanteDetalleLetra), new Integer(AV5CfgComprobanteDetalleNroDesde), new Integer(AV6CfgComprobanteDetalleNroHasta), new Integer(AV7CfgComprobanteDetalleNroUltimo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0012") ;
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
      CFGCOMPROB2_A38CfgComprobanteDetalleNroUltimo = new int[1] ;
      CFGCOMPROB2_A37CfgComprobanteDetalleNroHasta = new int[1] ;
      CFGCOMPROB2_A36CfgComprobanteDetalleNroDesde = new int[1] ;
      CFGCOMPROB2_A35CfgComprobanteDetalleLetra = new byte[1] ;
      CFGCOMPROB2_A32CfgComprobantePrefijo = new short[1] ;
      CFGCOMPROB2_A31CfgComprobanteId = new String[] {""} ;
      A31CfgComprobanteId = "" ;
      AV2CfgComprobanteId = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.cfgcomprobantedetalleconversion__default(),
         new Object[] {
             new Object[] {
            CFGCOMPROB2_A38CfgComprobanteDetalleNroUltimo, CFGCOMPROB2_A37CfgComprobanteDetalleNroHasta, CFGCOMPROB2_A36CfgComprobanteDetalleNroDesde, CFGCOMPROB2_A35CfgComprobanteDetalleLetra, CFGCOMPROB2_A32CfgComprobantePrefijo, CFGCOMPROB2_A31CfgComprobanteId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A35CfgComprobanteDetalleLetra ;
   private byte AV4CfgComprobanteDetalleLetra ;
   private short A32CfgComprobantePrefijo ;
   private short AV3CfgComprobantePrefijo ;
   private short Gx_err ;
   private int A38CfgComprobanteDetalleNroUltimo ;
   private int A37CfgComprobanteDetalleNroHasta ;
   private int A36CfgComprobanteDetalleNroDesde ;
   private int GIGXA0012 ;
   private int AV5CfgComprobanteDetalleNroDesde ;
   private int AV6CfgComprobanteDetalleNroHasta ;
   private int AV7CfgComprobanteDetalleNroUltimo ;
   private String scmdbuf ;
   private String A31CfgComprobanteId ;
   private String Gx_emsg ;
   private String AV2CfgComprobanteId ;
   private IDataStoreProvider pr_default ;
   private int[] CFGCOMPROB2_A38CfgComprobanteDetalleNroUltimo ;
   private int[] CFGCOMPROB2_A37CfgComprobanteDetalleNroHasta ;
   private int[] CFGCOMPROB2_A36CfgComprobanteDetalleNroDesde ;
   private byte[] CFGCOMPROB2_A35CfgComprobanteDetalleLetra ;
   private short[] CFGCOMPROB2_A32CfgComprobantePrefijo ;
   private String[] CFGCOMPROB2_A31CfgComprobanteId ;
}

final  class cfgcomprobantedetalleconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("CFGCOMPROB2", "SELECT CfgComprobanteDetalleNroUltimo, CfgComprobanteDetalleNroHasta, CfgComprobanteDetalleNroDesde, CfgComprobanteDetalleLetra, CfgComprobantePrefijo, CfgComprobanteId FROM CfgComprobanteDetalle ORDER BY CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("CFGCOMPROB3", "INSERT INTO GXA0012(CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra, CfgComprobanteDetalleNroDesde, CfgComprobanteDetalleNroHasta, CfgComprobanteDetalleNroUltimo) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 10) ;
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

