/*
               File: EntidadConversion
        Description: Conversion for table Entidad
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:1:24.12
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entidadconversion extends GXProcedure
{
   public entidadconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entidadconversion.class ), "" );
   }

   public entidadconversion( int remoteHandle ,
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
      /* Using cursor ENTIDADCON2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A42EmpresaId = ENTIDADCON2_A42EmpresaId[0] ;
         A95EntidadActiva = ENTIDADCON2_A95EntidadActiva[0] ;
         A94EntidadTipo = ENTIDADCON2_A94EntidadTipo[0] ;
         A5LocalidadId = ENTIDADCON2_A5LocalidadId[0] ;
         A3PaisId = ENTIDADCON2_A3PaisId[0] ;
         A1ProvinciaId = ENTIDADCON2_A1ProvinciaId[0] ;
         A13CondicionIvaId = ENTIDADCON2_A13CondicionIvaId[0] ;
         A15CondicionCpraVtaId = ENTIDADCON2_A15CondicionCpraVtaId[0] ;
         A9TipoDocumentoId = ENTIDADCON2_A9TipoDocumentoId[0] ;
         A83EntidadNumeroDocumento = ENTIDADCON2_A83EntidadNumeroDocumento[0] ;
         A82EntidadNombre = ENTIDADCON2_A82EntidadNombre[0] ;
         A81EntidadId = ENTIDADCON2_A81EntidadId[0] ;
         A5LocalidadId = ENTIDADCON2_A5LocalidadId[0] ;
         A3PaisId = ENTIDADCON2_A3PaisId[0] ;
         A1ProvinciaId = ENTIDADCON2_A1ProvinciaId[0] ;
         A13CondicionIvaId = ENTIDADCON2_A13CondicionIvaId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0041

         */
         AV2EntidadId = A81EntidadId ;
         AV3EntidadNombre = A82EntidadNombre ;
         AV4EntidadNumeroDocumento = A83EntidadNumeroDocumento ;
         AV5TipoDocumentoId = A9TipoDocumentoId ;
         AV6CondicionCpraVtaId = A15CondicionCpraVtaId ;
         if ( ENTIDADCON2_n13CondicionIvaId[0] )
         {
            AV7CondicionIvaId = (short)(0) ;
         }
         else
         {
            AV7CondicionIvaId = A13CondicionIvaId ;
         }
         if ( ENTIDADCON2_n1ProvinciaId[0] )
         {
            AV8ProvinciaId = (short)(0) ;
         }
         else
         {
            AV8ProvinciaId = A1ProvinciaId ;
         }
         if ( ENTIDADCON2_n3PaisId[0] )
         {
            AV9PaisId = (short)(0) ;
         }
         else
         {
            AV9PaisId = A3PaisId ;
         }
         if ( ENTIDADCON2_n5LocalidadId[0] )
         {
            AV10LocalidadId = (short)(0) ;
         }
         else
         {
            AV10LocalidadId = A5LocalidadId ;
         }
         AV11EntidadTipo = A94EntidadTipo ;
         AV12EntidadActiva = A95EntidadActiva ;
         /* Using cursor ENTIDADCON3 */
         pr_default.execute(1, new Object[] {new Integer(AV2EntidadId)});
         if ( (pr_default.getStatus(1) != 101) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
            /* Using cursor ENTIDADCON4 */
            pr_default.execute(2, new Object[] {new Integer(AV2EntidadId), AV3EntidadNombre, AV4EntidadNumeroDocumento, new Short(AV5TipoDocumentoId), new Short(AV6CondicionCpraVtaId), new Short(AV7CondicionIvaId), new Short(AV8ProvinciaId), new Short(AV9PaisId), new Short(AV10LocalidadId), new Byte(AV11EntidadTipo), new Boolean(AV12EntidadActiva)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0041") ;
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
      ENTIDADCON2_A42EmpresaId = new int[1] ;
      ENTIDADCON2_A95EntidadActiva = new boolean[] {false} ;
      ENTIDADCON2_A94EntidadTipo = new byte[1] ;
      ENTIDADCON2_A5LocalidadId = new short[1] ;
      ENTIDADCON2_A3PaisId = new short[1] ;
      ENTIDADCON2_A1ProvinciaId = new short[1] ;
      ENTIDADCON2_A13CondicionIvaId = new short[1] ;
      ENTIDADCON2_A15CondicionCpraVtaId = new short[1] ;
      ENTIDADCON2_A9TipoDocumentoId = new short[1] ;
      ENTIDADCON2_A83EntidadNumeroDocumento = new String[] {""} ;
      ENTIDADCON2_A82EntidadNombre = new String[] {""} ;
      ENTIDADCON2_A81EntidadId = new int[1] ;
      A83EntidadNumeroDocumento = "" ;
      A82EntidadNombre = "" ;
      AV3EntidadNombre = "" ;
      AV4EntidadNumeroDocumento = "" ;
      ENTIDADCON2_n13CondicionIvaId = new boolean[] {false} ;
      ENTIDADCON2_n1ProvinciaId = new boolean[] {false} ;
      ENTIDADCON2_n3PaisId = new boolean[] {false} ;
      ENTIDADCON2_n5LocalidadId = new boolean[] {false} ;
      ENTIDADCON3_AV2EntidadId = new int[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.entidadconversion__default(),
         new Object[] {
             new Object[] {
            ENTIDADCON2_A42EmpresaId, ENTIDADCON2_A95EntidadActiva, ENTIDADCON2_A94EntidadTipo, ENTIDADCON2_A5LocalidadId, ENTIDADCON2_A3PaisId, ENTIDADCON2_A1ProvinciaId, ENTIDADCON2_A13CondicionIvaId, ENTIDADCON2_A15CondicionCpraVtaId, ENTIDADCON2_A9TipoDocumentoId, ENTIDADCON2_A83EntidadNumeroDocumento,
            ENTIDADCON2_A82EntidadNombre, ENTIDADCON2_A81EntidadId
            }
            , new Object[] {
            ENTIDADCON3_AV2EntidadId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A94EntidadTipo ;
   private byte AV11EntidadTipo ;
   private short A5LocalidadId ;
   private short A3PaisId ;
   private short A1ProvinciaId ;
   private short A13CondicionIvaId ;
   private short A15CondicionCpraVtaId ;
   private short A9TipoDocumentoId ;
   private short AV5TipoDocumentoId ;
   private short AV6CondicionCpraVtaId ;
   private short AV7CondicionIvaId ;
   private short AV8ProvinciaId ;
   private short AV9PaisId ;
   private short AV10LocalidadId ;
   private short Gx_err ;
   private int A42EmpresaId ;
   private int A81EntidadId ;
   private int GIGXA0041 ;
   private int AV2EntidadId ;
   private String scmdbuf ;
   private String A83EntidadNumeroDocumento ;
   private String AV4EntidadNumeroDocumento ;
   private String Gx_emsg ;
   private boolean A95EntidadActiva ;
   private boolean AV12EntidadActiva ;
   private String A82EntidadNombre ;
   private String AV3EntidadNombre ;
   private IDataStoreProvider pr_default ;
   private int[] ENTIDADCON2_A42EmpresaId ;
   private boolean[] ENTIDADCON2_A95EntidadActiva ;
   private byte[] ENTIDADCON2_A94EntidadTipo ;
   private short[] ENTIDADCON2_A5LocalidadId ;
   private short[] ENTIDADCON2_A3PaisId ;
   private short[] ENTIDADCON2_A1ProvinciaId ;
   private short[] ENTIDADCON2_A13CondicionIvaId ;
   private short[] ENTIDADCON2_A15CondicionCpraVtaId ;
   private short[] ENTIDADCON2_A9TipoDocumentoId ;
   private String[] ENTIDADCON2_A83EntidadNumeroDocumento ;
   private String[] ENTIDADCON2_A82EntidadNombre ;
   private int[] ENTIDADCON2_A81EntidadId ;
   private boolean[] ENTIDADCON2_n13CondicionIvaId ;
   private boolean[] ENTIDADCON2_n1ProvinciaId ;
   private boolean[] ENTIDADCON2_n3PaisId ;
   private boolean[] ENTIDADCON2_n5LocalidadId ;
   private int[] ENTIDADCON3_AV2EntidadId ;
}

final  class entidadconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("ENTIDADCON2", "SELECT T1.EmpresaId, T1.EntidadActiva, T1.EntidadTipo, T2.LocalidadId, T2.PaisId, T2.ProvinciaId, T2.CondicionIvaId, T1.CondicionCpraVtaId, T1.TipoDocumentoId, T1.EntidadNumeroDocumento, T1.EntidadNombre, T1.EntidadId FROM (Entidad T1 INNER JOIN Empresa T2 ON T2.EmpresaId = T1.EmpresaId) ORDER BY T1.EmpresaId, T1.EntidadId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("ENTIDADCON3", "SELECT EntidadId FROM GXA0041 WHERE EntidadId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("ENTIDADCON4", "INSERT INTO GXA0041(EntidadId, EntidadNombre, EntidadNumeroDocumento, TipoDocumentoId, CondicionCpraVtaId, CondicionIvaId, ProvinciaId, PaisId, LocalidadId, EntidadTipo, EntidadActiva) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((boolean[]) buf[1])[0] = rslt.getBoolean(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((String[]) buf[9])[0] = rslt.getString(10, 13) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((int[]) buf[11])[0] = rslt.getInt(12) ;
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

