/*
               File: TableId41UpdateReferentialIntegrity
        Description: Load referential integrity
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:28:21.79
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tableid41updatereferentialintegrity extends GXProcedure
{
   public tableid41updatereferentialintegrity( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tableid41updatereferentialintegrity.class ), "" );
   }

   public tableid41updatereferentialintegrity( int remoteHandle ,
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
      /* Using cursor TABLEID41U2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A81EntidadId = TABLEID41U2_A81EntidadId[0] ;
         A42EmpresaId = TABLEID41U2_A42EmpresaId[0] ;
         A31CfgComprobanteId = TABLEID41U2_A31CfgComprobanteId[0] ;
         A32CfgComprobantePrefijo = TABLEID41U2_A32CfgComprobantePrefijo[0] ;
         A55ComprobanteNumero = TABLEID41U2_A55ComprobanteNumero[0] ;
         A35CfgComprobanteDetalleLetra = TABLEID41U2_A35CfgComprobanteDetalleLetra[0] ;
         /*
            INSERT RECORD ON TABLE Entidad

         */
         W81EntidadId = A81EntidadId ;
         W82EntidadNombre = A82EntidadNombre ;
         W82EntidadNombre = A82EntidadNombre ;
         W83EntidadNumeroDocumento = A83EntidadNumeroDocumento ;
         W83EntidadNumeroDocumento = A83EntidadNumeroDocumento ;
         W9TipoDocumentoId = A9TipoDocumentoId ;
         W9TipoDocumentoId = A9TipoDocumentoId ;
         W15CondicionCpraVtaId = A15CondicionCpraVtaId ;
         W15CondicionCpraVtaId = A15CondicionCpraVtaId ;
         W13CondicionIvaId = A13CondicionIvaId ;
         W13CondicionIvaId = A13CondicionIvaId ;
         W1ProvinciaId = A1ProvinciaId ;
         W1ProvinciaId = A1ProvinciaId ;
         W3PaisId = A3PaisId ;
         W3PaisId = A3PaisId ;
         W5LocalidadId = A5LocalidadId ;
         W5LocalidadId = A5LocalidadId ;
         W94EntidadTipo = A94EntidadTipo ;
         W94EntidadTipo = A94EntidadTipo ;
         W95EntidadActiva = A95EntidadActiva ;
         W95EntidadActiva = A95EntidadActiva ;
         if ( (GXutil.strcmp("", A82EntidadNombre)==0) )
         {
            A82EntidadNombre = " " ;
         }
         else
         {
         }
         if ( (GXutil.strcmp("", A83EntidadNumeroDocumento)==0) )
         {
            A83EntidadNumeroDocumento = " " ;
         }
         else
         {
         }
         if ( (0==A9TipoDocumentoId) )
         {
            A9TipoDocumentoId = (short)(0) ;
         }
         else
         {
         }
         if ( (0==A15CondicionCpraVtaId) )
         {
            A15CondicionCpraVtaId = (short)(0) ;
         }
         else
         {
         }
         if ( (0==A13CondicionIvaId) )
         {
            A13CondicionIvaId = (short)(0) ;
         }
         else
         {
         }
         if ( (0==A1ProvinciaId) )
         {
            A1ProvinciaId = (short)(0) ;
         }
         else
         {
         }
         if ( (0==A3PaisId) )
         {
            A3PaisId = (short)(0) ;
         }
         else
         {
         }
         if ( (0==A5LocalidadId) )
         {
            A5LocalidadId = (short)(0) ;
         }
         else
         {
         }
         if ( (0==A94EntidadTipo) )
         {
            A94EntidadTipo = (byte)(0) ;
         }
         else
         {
         }
         if ( (false==A95EntidadActiva) )
         {
            A95EntidadActiva = false ;
         }
         else
         {
         }
         /* Using cursor TABLEID41U3 */
         pr_default.execute(1, new Object[] {new Integer(A81EntidadId)});
         if ( (pr_default.getStatus(1) != 101) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
            /* Using cursor TABLEID41U4 */
            pr_default.execute(2, new Object[] {new Integer(A81EntidadId), A82EntidadNombre, A83EntidadNumeroDocumento, new Short(A9TipoDocumentoId), new Short(A15CondicionCpraVtaId), new Short(A13CondicionIvaId), new Short(A1ProvinciaId), new Short(A3PaisId), new Short(A5LocalidadId), new Byte(A94EntidadTipo), new Boolean(A95EntidadActiva)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("Entidad") ;
         }
         A81EntidadId = W81EntidadId ;
         A82EntidadNombre = W82EntidadNombre ;
         A82EntidadNombre = W82EntidadNombre ;
         A83EntidadNumeroDocumento = W83EntidadNumeroDocumento ;
         A83EntidadNumeroDocumento = W83EntidadNumeroDocumento ;
         A9TipoDocumentoId = W9TipoDocumentoId ;
         A9TipoDocumentoId = W9TipoDocumentoId ;
         A15CondicionCpraVtaId = W15CondicionCpraVtaId ;
         A15CondicionCpraVtaId = W15CondicionCpraVtaId ;
         A13CondicionIvaId = W13CondicionIvaId ;
         A13CondicionIvaId = W13CondicionIvaId ;
         A1ProvinciaId = W1ProvinciaId ;
         A1ProvinciaId = W1ProvinciaId ;
         A3PaisId = W3PaisId ;
         A3PaisId = W3PaisId ;
         A5LocalidadId = W5LocalidadId ;
         A5LocalidadId = W5LocalidadId ;
         A94EntidadTipo = W94EntidadTipo ;
         A94EntidadTipo = W94EntidadTipo ;
         A95EntidadActiva = W95EntidadActiva ;
         A95EntidadActiva = W95EntidadActiva ;
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
      TABLEID41U2_A81EntidadId = new int[1] ;
      TABLEID41U2_A42EmpresaId = new int[1] ;
      TABLEID41U2_A31CfgComprobanteId = new String[] {""} ;
      TABLEID41U2_A32CfgComprobantePrefijo = new short[1] ;
      TABLEID41U2_A55ComprobanteNumero = new int[1] ;
      TABLEID41U2_A35CfgComprobanteDetalleLetra = new byte[1] ;
      A31CfgComprobanteId = "" ;
      W82EntidadNombre = "" ;
      A82EntidadNombre = "" ;
      W83EntidadNumeroDocumento = "" ;
      A83EntidadNumeroDocumento = "" ;
      TABLEID41U3_A81EntidadId = new int[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.tableid41updatereferentialintegrity__default(),
         new Object[] {
             new Object[] {
            TABLEID41U2_A81EntidadId, TABLEID41U2_A42EmpresaId, TABLEID41U2_A31CfgComprobanteId, TABLEID41U2_A32CfgComprobantePrefijo, TABLEID41U2_A55ComprobanteNumero, TABLEID41U2_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            TABLEID41U3_A81EntidadId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A35CfgComprobanteDetalleLetra ;
   private byte W94EntidadTipo ;
   private byte A94EntidadTipo ;
   private short A32CfgComprobantePrefijo ;
   private short W9TipoDocumentoId ;
   private short A9TipoDocumentoId ;
   private short W15CondicionCpraVtaId ;
   private short A15CondicionCpraVtaId ;
   private short W13CondicionIvaId ;
   private short A13CondicionIvaId ;
   private short W1ProvinciaId ;
   private short A1ProvinciaId ;
   private short W3PaisId ;
   private short A3PaisId ;
   private short W5LocalidadId ;
   private short A5LocalidadId ;
   private short Gx_err ;
   private int A81EntidadId ;
   private int A42EmpresaId ;
   private int A55ComprobanteNumero ;
   private int GX_INS41 ;
   private int W81EntidadId ;
   private String scmdbuf ;
   private String W83EntidadNumeroDocumento ;
   private String A83EntidadNumeroDocumento ;
   private String Gx_emsg ;
   private boolean W95EntidadActiva ;
   private boolean A95EntidadActiva ;
   private String A31CfgComprobanteId ;
   private String W82EntidadNombre ;
   private String A82EntidadNombre ;
   private IDataStoreProvider pr_default ;
   private int[] TABLEID41U2_A81EntidadId ;
   private int[] TABLEID41U2_A42EmpresaId ;
   private String[] TABLEID41U2_A31CfgComprobanteId ;
   private short[] TABLEID41U2_A32CfgComprobantePrefijo ;
   private int[] TABLEID41U2_A55ComprobanteNumero ;
   private byte[] TABLEID41U2_A35CfgComprobanteDetalleLetra ;
   private int[] TABLEID41U3_A81EntidadId ;
}

final  class tableid41updatereferentialintegrity__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TABLEID41U2", "SELECT EntidadId, EmpresaId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra FROM Comprobante ORDER BY EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("TABLEID41U3", "SELECT EntidadId FROM Entidad WHERE EntidadId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("TABLEID41U4", "INSERT INTO Entidad(EntidadId, EntidadNombre, EntidadNumeroDocumento, TipoDocumentoId, CondicionCpraVtaId, CondicionIvaId, ProvinciaId, PaisId, LocalidadId, EntidadTipo, EntidadActiva) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 250, false);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setBoolean(11, ((Boolean) parms[10]).booleanValue());
               return;
      }
   }

}

