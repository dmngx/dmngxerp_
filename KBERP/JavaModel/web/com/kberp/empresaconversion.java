/*
               File: EmpresaConversion
        Description: Conversion for table Empresa
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:43.88
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class empresaconversion extends GXProcedure
{
   public empresaconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( empresaconversion.class ), "" );
   }

   public empresaconversion( int remoteHandle ,
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
      /* Using cursor EMPRESACON2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A52EmpresaLogo = EMPRESACON2_A52EmpresaLogo[0] ;
         A51EmpresaNumeroIIBB = EMPRESACON2_A51EmpresaNumeroIIBB[0] ;
         A50EmpresaFechaContrato = EMPRESACON2_A50EmpresaFechaContrato[0] ;
         A13CondicionIvaId = EMPRESACON2_A13CondicionIvaId[0] ;
         A1ProvinciaId = EMPRESACON2_A1ProvinciaId[0] ;
         A3PaisId = EMPRESACON2_A3PaisId[0] ;
         A5LocalidadId = EMPRESACON2_A5LocalidadId[0] ;
         A49EmpresaCPostal = EMPRESACON2_A49EmpresaCPostal[0] ;
         A48EmpresaDepto = EMPRESACON2_A48EmpresaDepto[0] ;
         A47EmpresaPiso = EMPRESACON2_A47EmpresaPiso[0] ;
         A46EmpresaNumero = EMPRESACON2_A46EmpresaNumero[0] ;
         A45EmpresaCalle = EMPRESACON2_A45EmpresaCalle[0] ;
         A44EmpresaNumeroDocumento = EMPRESACON2_A44EmpresaNumeroDocumento[0] ;
         A42EmpresaId = EMPRESACON2_A42EmpresaId[0] ;
         A43EmpresaNombre = EMPRESACON2_A43EmpresaNombre[0] ;
         A40000GXC1 = EMPRESACON2_A40000GXC1[0] ;
         /*
            INSERT RECORD ON TABLE GXA0014

         */
         AV2EmpresaId = A42EmpresaId ;
         AV3EmpresaNombre = A40000GXC1 ;
         AV4EmpresaNumeroDocumento = A44EmpresaNumeroDocumento ;
         AV5EmpresaCalle = A45EmpresaCalle ;
         AV6EmpresaNumero = A46EmpresaNumero ;
         AV7EmpresaPiso = A47EmpresaPiso ;
         AV8EmpresaDepto = A48EmpresaDepto ;
         AV9EmpresaCPostal = A49EmpresaCPostal ;
         AV10LocalidadId = A5LocalidadId ;
         AV11PaisId = A3PaisId ;
         AV12ProvinciaId = A1ProvinciaId ;
         AV13CondicionIvaId = A13CondicionIvaId ;
         AV14EmpresaFechaContrato = A50EmpresaFechaContrato ;
         AV15EmpresaNumeroIIBB = A51EmpresaNumeroIIBB ;
         AV16EmpresaLogo = A52EmpresaLogo ;
         /* Using cursor EMPRESACON3 */
         pr_default.execute(1, new Object[] {new Integer(AV2EmpresaId), AV3EmpresaNombre, AV4EmpresaNumeroDocumento, AV5EmpresaCalle, new Integer(AV6EmpresaNumero), new Short(AV7EmpresaPiso), AV8EmpresaDepto, AV9EmpresaCPostal, new Short(AV10LocalidadId), new Short(AV11PaisId), new Short(AV12ProvinciaId), new Short(AV13CondicionIvaId), AV14EmpresaFechaContrato, AV15EmpresaNumeroIIBB, AV16EmpresaLogo});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0014") ;
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
      EMPRESACON2_A52EmpresaLogo = new String[] {""} ;
      EMPRESACON2_A51EmpresaNumeroIIBB = new String[] {""} ;
      EMPRESACON2_A50EmpresaFechaContrato = new java.util.Date[] {GXutil.nullDate()} ;
      EMPRESACON2_A13CondicionIvaId = new short[1] ;
      EMPRESACON2_A1ProvinciaId = new short[1] ;
      EMPRESACON2_A3PaisId = new short[1] ;
      EMPRESACON2_A5LocalidadId = new short[1] ;
      EMPRESACON2_A49EmpresaCPostal = new String[] {""} ;
      EMPRESACON2_A48EmpresaDepto = new String[] {""} ;
      EMPRESACON2_A47EmpresaPiso = new short[1] ;
      EMPRESACON2_A46EmpresaNumero = new int[1] ;
      EMPRESACON2_A45EmpresaCalle = new String[] {""} ;
      EMPRESACON2_A44EmpresaNumeroDocumento = new String[] {""} ;
      EMPRESACON2_A42EmpresaId = new int[1] ;
      EMPRESACON2_A43EmpresaNombre = new String[] {""} ;
      EMPRESACON2_A40000GXC1 = new String[] {""} ;
      A52EmpresaLogo = "" ;
      A51EmpresaNumeroIIBB = "" ;
      A50EmpresaFechaContrato = GXutil.nullDate() ;
      A49EmpresaCPostal = "" ;
      A48EmpresaDepto = "" ;
      A45EmpresaCalle = "" ;
      A44EmpresaNumeroDocumento = "" ;
      A43EmpresaNombre = "" ;
      A40000GXC1 = "" ;
      AV3EmpresaNombre = "" ;
      AV4EmpresaNumeroDocumento = "" ;
      AV5EmpresaCalle = "" ;
      AV8EmpresaDepto = "" ;
      AV9EmpresaCPostal = "" ;
      AV14EmpresaFechaContrato = GXutil.nullDate() ;
      AV15EmpresaNumeroIIBB = "" ;
      AV16EmpresaLogo = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.empresaconversion__default(),
         new Object[] {
             new Object[] {
            EMPRESACON2_A52EmpresaLogo, EMPRESACON2_A51EmpresaNumeroIIBB, EMPRESACON2_A50EmpresaFechaContrato, EMPRESACON2_A13CondicionIvaId, EMPRESACON2_A1ProvinciaId, EMPRESACON2_A3PaisId, EMPRESACON2_A5LocalidadId, EMPRESACON2_A49EmpresaCPostal, EMPRESACON2_A48EmpresaDepto, EMPRESACON2_A47EmpresaPiso,
            EMPRESACON2_A46EmpresaNumero, EMPRESACON2_A45EmpresaCalle, EMPRESACON2_A44EmpresaNumeroDocumento, EMPRESACON2_A42EmpresaId, EMPRESACON2_A43EmpresaNombre, EMPRESACON2_A40000GXC1
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A13CondicionIvaId ;
   private short A1ProvinciaId ;
   private short A3PaisId ;
   private short A5LocalidadId ;
   private short A47EmpresaPiso ;
   private short AV7EmpresaPiso ;
   private short AV10LocalidadId ;
   private short AV11PaisId ;
   private short AV12ProvinciaId ;
   private short AV13CondicionIvaId ;
   private short Gx_err ;
   private int A46EmpresaNumero ;
   private int A42EmpresaId ;
   private int GIGXA0014 ;
   private int AV2EmpresaId ;
   private int AV6EmpresaNumero ;
   private String scmdbuf ;
   private String A51EmpresaNumeroIIBB ;
   private String A49EmpresaCPostal ;
   private String A48EmpresaDepto ;
   private String A45EmpresaCalle ;
   private String A44EmpresaNumeroDocumento ;
   private String A43EmpresaNombre ;
   private String AV4EmpresaNumeroDocumento ;
   private String AV15EmpresaNumeroIIBB ;
   private String Gx_emsg ;
   private java.util.Date A50EmpresaFechaContrato ;
   private java.util.Date AV14EmpresaFechaContrato ;
   private String A52EmpresaLogo ;
   private String AV16EmpresaLogo ;
   private String A40000GXC1 ;
   private String AV3EmpresaNombre ;
   private String AV5EmpresaCalle ;
   private String AV8EmpresaDepto ;
   private String AV9EmpresaCPostal ;
   private IDataStoreProvider pr_default ;
   private String[] EMPRESACON2_A52EmpresaLogo ;
   private String[] EMPRESACON2_A51EmpresaNumeroIIBB ;
   private java.util.Date[] EMPRESACON2_A50EmpresaFechaContrato ;
   private short[] EMPRESACON2_A13CondicionIvaId ;
   private short[] EMPRESACON2_A1ProvinciaId ;
   private short[] EMPRESACON2_A3PaisId ;
   private short[] EMPRESACON2_A5LocalidadId ;
   private String[] EMPRESACON2_A49EmpresaCPostal ;
   private String[] EMPRESACON2_A48EmpresaDepto ;
   private short[] EMPRESACON2_A47EmpresaPiso ;
   private int[] EMPRESACON2_A46EmpresaNumero ;
   private String[] EMPRESACON2_A45EmpresaCalle ;
   private String[] EMPRESACON2_A44EmpresaNumeroDocumento ;
   private int[] EMPRESACON2_A42EmpresaId ;
   private String[] EMPRESACON2_A43EmpresaNombre ;
   private String[] EMPRESACON2_A40000GXC1 ;
}

final  class empresaconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("EMPRESACON2", "SELECT EmpresaLogo, EmpresaNumeroIIBB, EmpresaFechaContrato, CondicionIvaId, ProvinciaId, PaisId, LocalidadId, EmpresaCPostal, EmpresaDepto, EmpresaPiso, EmpresaNumero, EmpresaCalle, EmpresaNumeroDocumento, EmpresaId, EmpresaNombre, SUBSTR(EmpresaNombre, 1, 250) AS GXC1 FROM Empresa ORDER BY EmpresaId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("EMPRESACON3", "INSERT INTO GXA0014(EmpresaId, EmpresaNombre, EmpresaNumeroDocumento, EmpresaCalle, EmpresaNumero, EmpresaPiso, EmpresaDepto, EmpresaCPostal, LocalidadId, PaisId, ProvinciaId, CondicionIvaId, EmpresaFechaContrato, EmpresaNumeroIIBB, EmpresaLogo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getBLOBFile(1, "tmp", "") ;
               ((String[]) buf[1])[0] = rslt.getString(2, 13) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 10) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 10) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((int[]) buf[10])[0] = rslt.getInt(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 150) ;
               ((String[]) buf[12])[0] = rslt.getString(13, 13) ;
               ((int[]) buf[13])[0] = rslt.getInt(14) ;
               ((String[]) buf[14])[0] = rslt.getString(15, 350) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(16) ;
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
               stmt.setVarchar(2, (String)parms[1], 250, false);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setVarchar(4, (String)parms[3], 150, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 10, false);
               stmt.setVarchar(8, (String)parms[7], 10, false);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setString(14, (String)parms[13], 13);
               stmt.setBLOBFile(15, (String)parms[14]);
               return;
      }
   }

}

