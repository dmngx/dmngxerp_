/*
               File: ArticuloConversion
        Description: Conversion for table Articulo
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:43.41
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class articuloconversion extends GXProcedure
{
   public articuloconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( articuloconversion.class ), "" );
   }

   public articuloconversion( int remoteHandle ,
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
      /* Using cursor ARTICULOCO2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A41ArticuloCosto = ARTICULOCO2_A41ArticuloCosto[0] ;
         A17AlicuotaIvaId = ARTICULOCO2_A17AlicuotaIvaId[0] ;
         A11RubroId = ARTICULOCO2_A11RubroId[0] ;
         A7MarcaId = ARTICULOCO2_A7MarcaId[0] ;
         A39ArticuloId = ARTICULOCO2_A39ArticuloId[0] ;
         A40ArticuloNombre = ARTICULOCO2_A40ArticuloNombre[0] ;
         A40000GXC1 = ARTICULOCO2_A40000GXC1[0] ;
         /*
            INSERT RECORD ON TABLE GXA0013

         */
         AV2ArticuloId = A39ArticuloId ;
         AV3ArticuloNombre = A40000GXC1 ;
         AV4MarcaId = A7MarcaId ;
         AV5RubroId = A11RubroId ;
         AV6AlicuotaIvaId = A17AlicuotaIvaId ;
         AV7ArticuloCosto = A41ArticuloCosto ;
         /* Using cursor ARTICULOCO3 */
         pr_default.execute(1, new Object[] {AV2ArticuloId, AV3ArticuloNombre, new Short(AV4MarcaId), new Short(AV5RubroId), new Short(AV6AlicuotaIvaId), AV7ArticuloCosto});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0013") ;
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
      ARTICULOCO2_A41ArticuloCosto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      ARTICULOCO2_A17AlicuotaIvaId = new short[1] ;
      ARTICULOCO2_A11RubroId = new short[1] ;
      ARTICULOCO2_A7MarcaId = new short[1] ;
      ARTICULOCO2_A39ArticuloId = new String[] {""} ;
      ARTICULOCO2_A40ArticuloNombre = new String[] {""} ;
      ARTICULOCO2_A40000GXC1 = new String[] {""} ;
      A41ArticuloCosto = DecimalUtil.ZERO ;
      A39ArticuloId = "" ;
      A40ArticuloNombre = "" ;
      A40000GXC1 = "" ;
      AV2ArticuloId = "" ;
      AV3ArticuloNombre = "" ;
      AV7ArticuloCosto = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.articuloconversion__default(),
         new Object[] {
             new Object[] {
            ARTICULOCO2_A41ArticuloCosto, ARTICULOCO2_A17AlicuotaIvaId, ARTICULOCO2_A11RubroId, ARTICULOCO2_A7MarcaId, ARTICULOCO2_A39ArticuloId, ARTICULOCO2_A40ArticuloNombre, ARTICULOCO2_A40000GXC1
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A17AlicuotaIvaId ;
   private short A11RubroId ;
   private short A7MarcaId ;
   private short AV4MarcaId ;
   private short AV5RubroId ;
   private short AV6AlicuotaIvaId ;
   private short Gx_err ;
   private int GIGXA0013 ;
   private java.math.BigDecimal A41ArticuloCosto ;
   private java.math.BigDecimal AV7ArticuloCosto ;
   private String scmdbuf ;
   private String A39ArticuloId ;
   private String A40ArticuloNombre ;
   private String Gx_emsg ;
   private String A40000GXC1 ;
   private String AV2ArticuloId ;
   private String AV3ArticuloNombre ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] ARTICULOCO2_A41ArticuloCosto ;
   private short[] ARTICULOCO2_A17AlicuotaIvaId ;
   private short[] ARTICULOCO2_A11RubroId ;
   private short[] ARTICULOCO2_A7MarcaId ;
   private String[] ARTICULOCO2_A39ArticuloId ;
   private String[] ARTICULOCO2_A40ArticuloNombre ;
   private String[] ARTICULOCO2_A40000GXC1 ;
}

final  class articuloconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("ARTICULOCO2", "SELECT ArticuloCosto, AlicuotaIvaId, RubroId, MarcaId, ArticuloId, ArticuloNombre, SUBSTR(ArticuloNombre, 1, 250) AS GXC1 FROM Articulo ORDER BY ArticuloId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("ARTICULOCO3", "INSERT INTO GXA0013(ArticuloId, ArticuloNombre, MarcaId, RubroId, AlicuotaIvaId, ArticuloCosto) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 15) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 350) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
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
               stmt.setVarchar(1, (String)parms[0], 15, false);
               stmt.setVarchar(2, (String)parms[1], 250, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
      }
   }

}

