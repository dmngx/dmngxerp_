/*
               File: AlicuotaIvaConversion
        Description: Conversion for table AlicuotaIva
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:43.32
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class alicuotaivaconversion extends GXProcedure
{
   public alicuotaivaconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alicuotaivaconversion.class ), "" );
   }

   public alicuotaivaconversion( int remoteHandle ,
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
      /* Using cursor ALICUOTAIV2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A19AlicuotaIvaPorcentaje = ALICUOTAIV2_A19AlicuotaIvaPorcentaje[0] ;
         A18AlicuotaIvaNombre = ALICUOTAIV2_A18AlicuotaIvaNombre[0] ;
         A17AlicuotaIvaId = ALICUOTAIV2_A17AlicuotaIvaId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0009

         */
         AV2AlicuotaIvaId = A17AlicuotaIvaId ;
         AV3AlicuotaIvaNombre = A18AlicuotaIvaNombre ;
         AV4AlicuotaIvaPorcentaje = A19AlicuotaIvaPorcentaje ;
         /* Using cursor ALICUOTAIV3 */
         pr_default.execute(1, new Object[] {new Short(AV2AlicuotaIvaId), AV3AlicuotaIvaNombre, AV4AlicuotaIvaPorcentaje});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0009") ;
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
      ALICUOTAIV2_A19AlicuotaIvaPorcentaje = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      ALICUOTAIV2_A18AlicuotaIvaNombre = new String[] {""} ;
      ALICUOTAIV2_A17AlicuotaIvaId = new short[1] ;
      A19AlicuotaIvaPorcentaje = DecimalUtil.ZERO ;
      A18AlicuotaIvaNombre = "" ;
      AV3AlicuotaIvaNombre = "" ;
      AV4AlicuotaIvaPorcentaje = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.alicuotaivaconversion__default(),
         new Object[] {
             new Object[] {
            ALICUOTAIV2_A19AlicuotaIvaPorcentaje, ALICUOTAIV2_A18AlicuotaIvaNombre, ALICUOTAIV2_A17AlicuotaIvaId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A17AlicuotaIvaId ;
   private short AV2AlicuotaIvaId ;
   private short Gx_err ;
   private int GIGXA0009 ;
   private java.math.BigDecimal A19AlicuotaIvaPorcentaje ;
   private java.math.BigDecimal AV4AlicuotaIvaPorcentaje ;
   private String scmdbuf ;
   private String A18AlicuotaIvaNombre ;
   private String Gx_emsg ;
   private String AV3AlicuotaIvaNombre ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] ALICUOTAIV2_A19AlicuotaIvaPorcentaje ;
   private String[] ALICUOTAIV2_A18AlicuotaIvaNombre ;
   private short[] ALICUOTAIV2_A17AlicuotaIvaId ;
}

final  class alicuotaivaconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("ALICUOTAIV2", "SELECT AlicuotaIvaPorcentaje, AlicuotaIvaNombre, AlicuotaIvaId FROM AlicuotaIva ORDER BY AlicuotaIvaId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("ALICUOTAIV3", "INSERT INTO GXA0009(AlicuotaIvaId, AlicuotaIvaNombre, AlicuotaIvaPorcentaje) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 250) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 1);
               return;
      }
   }

}

