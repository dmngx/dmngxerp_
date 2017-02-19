/*
               File: ComprobanteArticuloConversion
        Description: Conversion for table ComprobanteArticulo
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 15:34:34.94
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class comprobantearticuloconversion extends GXProcedure
{
   public comprobantearticuloconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( comprobantearticuloconversion.class ), "" );
   }

   public comprobantearticuloconversion( int remoteHandle ,
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
      /* Using cursor COMPROBANT2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A66ComprobanteArticuloTotal = COMPROBANT2_A66ComprobanteArticuloTotal[0] ;
         A65ComprobanteArticuloPrecioUnit = COMPROBANT2_A65ComprobanteArticuloPrecioUnit[0] ;
         A64ComprobanteArticuloCantidad = COMPROBANT2_A64ComprobanteArticuloCantidad[0] ;
         A63ComprobanteArticuloNombre = COMPROBANT2_A63ComprobanteArticuloNombre[0] ;
         A39ArticuloId = COMPROBANT2_A39ArticuloId[0] ;
         A35CfgComprobanteDetalleLetra = COMPROBANT2_A35CfgComprobanteDetalleLetra[0] ;
         A55ComprobanteNumero = COMPROBANT2_A55ComprobanteNumero[0] ;
         A32CfgComprobantePrefijo = COMPROBANT2_A32CfgComprobantePrefijo[0] ;
         A31CfgComprobanteId = COMPROBANT2_A31CfgComprobanteId[0] ;
         A42EmpresaId = COMPROBANT2_A42EmpresaId[0] ;
         A20EntidadId = COMPROBANT2_A20EntidadId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0031

         */
         AV2EmpresaId = A42EmpresaId ;
         AV3CfgComprobanteId = A31CfgComprobanteId ;
         AV4CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         AV5ComprobanteNumero = A55ComprobanteNumero ;
         AV6CfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
         AV7ArticuloId = A39ArticuloId ;
         AV8ComprobanteArticuloNombre = A63ComprobanteArticuloNombre ;
         AV9ComprobanteArticuloCantidad = A64ComprobanteArticuloCantidad ;
         AV10ComprobanteArticuloPrecioUnit = A65ComprobanteArticuloPrecioUnit ;
         AV11ComprobanteArticuloTotal = A66ComprobanteArticuloTotal ;
         /* Using cursor COMPROBANT3 */
         pr_default.execute(1, new Object[] {new Integer(AV2EmpresaId), AV3CfgComprobanteId, new Short(AV4CfgComprobantePrefijo), new Integer(AV5ComprobanteNumero), new Byte(AV6CfgComprobanteDetalleLetra), AV7ArticuloId});
         if ( (pr_default.getStatus(1) != 101) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
            /* Using cursor COMPROBANT4 */
            pr_default.execute(2, new Object[] {new Integer(AV2EmpresaId), AV3CfgComprobanteId, new Short(AV4CfgComprobantePrefijo), new Integer(AV5ComprobanteNumero), new Byte(AV6CfgComprobanteDetalleLetra), AV7ArticuloId, AV8ComprobanteArticuloNombre, AV9ComprobanteArticuloCantidad, AV10ComprobanteArticuloPrecioUnit, AV11ComprobanteArticuloTotal});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0031") ;
         }
         /* End Insert */
         pr_default.close(1);
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
      COMPROBANT2_A66ComprobanteArticuloTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      COMPROBANT2_A65ComprobanteArticuloPrecioUnit = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      COMPROBANT2_A64ComprobanteArticuloCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      COMPROBANT2_A63ComprobanteArticuloNombre = new String[] {""} ;
      COMPROBANT2_A39ArticuloId = new String[] {""} ;
      COMPROBANT2_A35CfgComprobanteDetalleLetra = new byte[1] ;
      COMPROBANT2_A55ComprobanteNumero = new int[1] ;
      COMPROBANT2_A32CfgComprobantePrefijo = new short[1] ;
      COMPROBANT2_A31CfgComprobanteId = new String[] {""} ;
      COMPROBANT2_A42EmpresaId = new int[1] ;
      COMPROBANT2_A20EntidadId = new int[1] ;
      A66ComprobanteArticuloTotal = DecimalUtil.ZERO ;
      A65ComprobanteArticuloPrecioUnit = DecimalUtil.ZERO ;
      A64ComprobanteArticuloCantidad = DecimalUtil.ZERO ;
      A63ComprobanteArticuloNombre = "" ;
      A39ArticuloId = "" ;
      A31CfgComprobanteId = "" ;
      AV3CfgComprobanteId = "" ;
      AV7ArticuloId = "" ;
      AV8ComprobanteArticuloNombre = "" ;
      AV9ComprobanteArticuloCantidad = DecimalUtil.ZERO ;
      AV10ComprobanteArticuloPrecioUnit = DecimalUtil.ZERO ;
      AV11ComprobanteArticuloTotal = DecimalUtil.ZERO ;
      COMPROBANT3_AV2EmpresaId = new int[1] ;
      COMPROBANT3_AV3CfgComprobanteId = new String[] {""} ;
      COMPROBANT3_AV4CfgComprobantePrefijo = new short[1] ;
      COMPROBANT3_AV5ComprobanteNumero = new int[1] ;
      COMPROBANT3_AV6CfgComprobanteDetalleLetra = new byte[1] ;
      COMPROBANT3_AV7ArticuloId = new String[] {""} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.comprobantearticuloconversion__default(),
         new Object[] {
             new Object[] {
            COMPROBANT2_A66ComprobanteArticuloTotal, COMPROBANT2_A65ComprobanteArticuloPrecioUnit, COMPROBANT2_A64ComprobanteArticuloCantidad, COMPROBANT2_A63ComprobanteArticuloNombre, COMPROBANT2_A39ArticuloId, COMPROBANT2_A35CfgComprobanteDetalleLetra, COMPROBANT2_A55ComprobanteNumero, COMPROBANT2_A32CfgComprobantePrefijo, COMPROBANT2_A31CfgComprobanteId, COMPROBANT2_A42EmpresaId,
            COMPROBANT2_A20EntidadId
            }
            , new Object[] {
            COMPROBANT3_AV2EmpresaId, COMPROBANT3_AV3CfgComprobanteId, COMPROBANT3_AV4CfgComprobantePrefijo, COMPROBANT3_AV5ComprobanteNumero, COMPROBANT3_AV6CfgComprobanteDetalleLetra, COMPROBANT3_AV7ArticuloId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A35CfgComprobanteDetalleLetra ;
   private byte AV6CfgComprobanteDetalleLetra ;
   private short A32CfgComprobantePrefijo ;
   private short AV4CfgComprobantePrefijo ;
   private short Gx_err ;
   private int A55ComprobanteNumero ;
   private int A42EmpresaId ;
   private int A20EntidadId ;
   private int GIGXA0031 ;
   private int AV2EmpresaId ;
   private int AV5ComprobanteNumero ;
   private java.math.BigDecimal A66ComprobanteArticuloTotal ;
   private java.math.BigDecimal A65ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal A64ComprobanteArticuloCantidad ;
   private java.math.BigDecimal AV9ComprobanteArticuloCantidad ;
   private java.math.BigDecimal AV10ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal AV11ComprobanteArticuloTotal ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String A63ComprobanteArticuloNombre ;
   private String A39ArticuloId ;
   private String A31CfgComprobanteId ;
   private String AV3CfgComprobanteId ;
   private String AV7ArticuloId ;
   private String AV8ComprobanteArticuloNombre ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] COMPROBANT2_A66ComprobanteArticuloTotal ;
   private java.math.BigDecimal[] COMPROBANT2_A65ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal[] COMPROBANT2_A64ComprobanteArticuloCantidad ;
   private String[] COMPROBANT2_A63ComprobanteArticuloNombre ;
   private String[] COMPROBANT2_A39ArticuloId ;
   private byte[] COMPROBANT2_A35CfgComprobanteDetalleLetra ;
   private int[] COMPROBANT2_A55ComprobanteNumero ;
   private short[] COMPROBANT2_A32CfgComprobantePrefijo ;
   private String[] COMPROBANT2_A31CfgComprobanteId ;
   private int[] COMPROBANT2_A42EmpresaId ;
   private int[] COMPROBANT2_A20EntidadId ;
   private int[] COMPROBANT3_AV2EmpresaId ;
   private String[] COMPROBANT3_AV3CfgComprobanteId ;
   private short[] COMPROBANT3_AV4CfgComprobantePrefijo ;
   private int[] COMPROBANT3_AV5ComprobanteNumero ;
   private byte[] COMPROBANT3_AV6CfgComprobanteDetalleLetra ;
   private String[] COMPROBANT3_AV7ArticuloId ;
}

final  class comprobantearticuloconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("COMPROBANT2", "SELECT ComprobanteArticuloTotal, ComprobanteArticuloPrecioUnit, ComprobanteArticuloCantidad, ComprobanteArticuloNombre, ArticuloId, CfgComprobanteDetalleLetra, ComprobanteNumero, CfgComprobantePrefijo, CfgComprobanteId, EmpresaId, EntidadId FROM ComprobanteArticulo ORDER BY EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ArticuloId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("COMPROBANT3", "SELECT EmpresaId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ArticuloId FROM GXA0031 WHERE EmpresaId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ? AND ArticuloId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("COMPROBANT4", "INSERT INTO GXA0031(EmpresaId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ArticuloId, ComprobanteArticuloNombre, ComprobanteArticuloCantidad, ComprobanteArticuloPrecioUnit, ComprobanteArticuloTotal) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((int[]) buf[9])[0] = rslt.getInt(10) ;
               ((int[]) buf[10])[0] = rslt.getInt(11) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((byte[]) buf[4])[0] = rslt.getByte(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setVarchar(6, (String)parms[5], 15, false);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setVarchar(6, (String)parms[5], 15, false);
               stmt.setVarchar(7, (String)parms[6], 250, false);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 3);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               return;
      }
   }

}

