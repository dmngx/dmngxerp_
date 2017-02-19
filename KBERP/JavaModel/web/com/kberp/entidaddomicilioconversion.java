/*
               File: EntidadDomicilioConversion
        Description: Conversion for table EntidadDomicilio
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:1:24.23
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entidaddomicilioconversion extends GXProcedure
{
   public entidaddomicilioconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entidaddomicilioconversion.class ), "" );
   }

   public entidaddomicilioconversion( int remoteHandle ,
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
      /* Using cursor ENTIDADDOM2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A89EntidadDomicilioCPostal = ENTIDADDOM2_A89EntidadDomicilioCPostal[0] ;
         A88EntidadDomicilioDepto = ENTIDADDOM2_A88EntidadDomicilioDepto[0] ;
         A87EntidadDomicilioPiso = ENTIDADDOM2_A87EntidadDomicilioPiso[0] ;
         A86EntidadDomicilioNumero = ENTIDADDOM2_A86EntidadDomicilioNumero[0] ;
         A85EntidadDomicilioCalle = ENTIDADDOM2_A85EntidadDomicilioCalle[0] ;
         A84EntidadDomicilioId = ENTIDADDOM2_A84EntidadDomicilioId[0] ;
         A81EntidadId = ENTIDADDOM2_A81EntidadId[0] ;
         A42EmpresaId = ENTIDADDOM2_A42EmpresaId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0043

         */
         AV2EntidadId = A81EntidadId ;
         AV3EntidadDomicilioId = A84EntidadDomicilioId ;
         AV4EntidadDomicilioCalle = A85EntidadDomicilioCalle ;
         AV5EntidadDomicilioNumero = A86EntidadDomicilioNumero ;
         AV6EntidadDomicilioPiso = A87EntidadDomicilioPiso ;
         AV7EntidadDomicilioDepto = A88EntidadDomicilioDepto ;
         AV8EntidadDomicilioCPostal = A89EntidadDomicilioCPostal ;
         /* Using cursor ENTIDADDOM3 */
         pr_default.execute(1, new Object[] {new Integer(AV2EntidadId), new Short(AV3EntidadDomicilioId)});
         if ( (pr_default.getStatus(1) != 101) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
            /* Using cursor ENTIDADDOM4 */
            pr_default.execute(2, new Object[] {new Integer(AV2EntidadId), new Short(AV3EntidadDomicilioId), AV4EntidadDomicilioCalle, new Integer(AV5EntidadDomicilioNumero), new Short(AV6EntidadDomicilioPiso), AV7EntidadDomicilioDepto, AV8EntidadDomicilioCPostal});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0043") ;
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
      ENTIDADDOM2_A89EntidadDomicilioCPostal = new String[] {""} ;
      ENTIDADDOM2_A88EntidadDomicilioDepto = new String[] {""} ;
      ENTIDADDOM2_A87EntidadDomicilioPiso = new short[1] ;
      ENTIDADDOM2_A86EntidadDomicilioNumero = new int[1] ;
      ENTIDADDOM2_A85EntidadDomicilioCalle = new String[] {""} ;
      ENTIDADDOM2_A84EntidadDomicilioId = new short[1] ;
      ENTIDADDOM2_A81EntidadId = new int[1] ;
      ENTIDADDOM2_A42EmpresaId = new int[1] ;
      A89EntidadDomicilioCPostal = "" ;
      A88EntidadDomicilioDepto = "" ;
      A85EntidadDomicilioCalle = "" ;
      AV4EntidadDomicilioCalle = "" ;
      AV7EntidadDomicilioDepto = "" ;
      AV8EntidadDomicilioCPostal = "" ;
      ENTIDADDOM3_AV2EntidadId = new int[1] ;
      ENTIDADDOM3_AV3EntidadDomicilioId = new short[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.entidaddomicilioconversion__default(),
         new Object[] {
             new Object[] {
            ENTIDADDOM2_A89EntidadDomicilioCPostal, ENTIDADDOM2_A88EntidadDomicilioDepto, ENTIDADDOM2_A87EntidadDomicilioPiso, ENTIDADDOM2_A86EntidadDomicilioNumero, ENTIDADDOM2_A85EntidadDomicilioCalle, ENTIDADDOM2_A84EntidadDomicilioId, ENTIDADDOM2_A81EntidadId, ENTIDADDOM2_A42EmpresaId
            }
            , new Object[] {
            ENTIDADDOM3_AV2EntidadId, ENTIDADDOM3_AV3EntidadDomicilioId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A87EntidadDomicilioPiso ;
   private short A84EntidadDomicilioId ;
   private short AV3EntidadDomicilioId ;
   private short AV6EntidadDomicilioPiso ;
   private short Gx_err ;
   private int A86EntidadDomicilioNumero ;
   private int A81EntidadId ;
   private int A42EmpresaId ;
   private int GIGXA0043 ;
   private int AV2EntidadId ;
   private int AV5EntidadDomicilioNumero ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String A89EntidadDomicilioCPostal ;
   private String A88EntidadDomicilioDepto ;
   private String A85EntidadDomicilioCalle ;
   private String AV4EntidadDomicilioCalle ;
   private String AV7EntidadDomicilioDepto ;
   private String AV8EntidadDomicilioCPostal ;
   private IDataStoreProvider pr_default ;
   private String[] ENTIDADDOM2_A89EntidadDomicilioCPostal ;
   private String[] ENTIDADDOM2_A88EntidadDomicilioDepto ;
   private short[] ENTIDADDOM2_A87EntidadDomicilioPiso ;
   private int[] ENTIDADDOM2_A86EntidadDomicilioNumero ;
   private String[] ENTIDADDOM2_A85EntidadDomicilioCalle ;
   private short[] ENTIDADDOM2_A84EntidadDomicilioId ;
   private int[] ENTIDADDOM2_A81EntidadId ;
   private int[] ENTIDADDOM2_A42EmpresaId ;
   private int[] ENTIDADDOM3_AV2EntidadId ;
   private short[] ENTIDADDOM3_AV3EntidadDomicilioId ;
}

final  class entidaddomicilioconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("ENTIDADDOM2", "SELECT EntidadDomicilioCPostal, EntidadDomicilioDepto, EntidadDomicilioPiso, EntidadDomicilioNumero, EntidadDomicilioCalle, EntidadDomicilioId, EntidadId, EmpresaId FROM EntidadDomicilio ORDER BY EmpresaId, EntidadId, EntidadDomicilioId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("ENTIDADDOM3", "SELECT EntidadId, EntidadDomicilioId FROM GXA0043 WHERE EntidadId = ? AND EntidadDomicilioId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("ENTIDADDOM4", "INSERT INTO GXA0043(EntidadId, EntidadDomicilioId, EntidadDomicilioCalle, EntidadDomicilioNumero, EntidadDomicilioPiso, EntidadDomicilioDepto, EntidadDomicilioCPostal) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 150, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 10, false);
               stmt.setVarchar(7, (String)parms[6], 10, false);
               return;
      }
   }

}

