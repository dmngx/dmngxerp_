/*
               File: CondicionIvaConversion
        Description: Conversion for table CondicionIva
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:43.81
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class condicionivaconversion extends GXProcedure
{
   public condicionivaconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( condicionivaconversion.class ), "" );
   }

   public condicionivaconversion( int remoteHandle ,
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
      /* Using cursor CONDICIONI2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14CondicionIvaNombre = CONDICIONI2_A14CondicionIvaNombre[0] ;
         A13CondicionIvaId = CONDICIONI2_A13CondicionIvaId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0007

         */
         AV2CondicionIvaId = A13CondicionIvaId ;
         AV3CondicionIvaNombre = A14CondicionIvaNombre ;
         /* Using cursor CONDICIONI3 */
         pr_default.execute(1, new Object[] {new Short(AV2CondicionIvaId), AV3CondicionIvaNombre});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0007") ;
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
      CONDICIONI2_A14CondicionIvaNombre = new String[] {""} ;
      CONDICIONI2_A13CondicionIvaId = new short[1] ;
      A14CondicionIvaNombre = "" ;
      AV3CondicionIvaNombre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.condicionivaconversion__default(),
         new Object[] {
             new Object[] {
            CONDICIONI2_A14CondicionIvaNombre, CONDICIONI2_A13CondicionIvaId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A13CondicionIvaId ;
   private short AV2CondicionIvaId ;
   private short Gx_err ;
   private int GIGXA0007 ;
   private String scmdbuf ;
   private String A14CondicionIvaNombre ;
   private String Gx_emsg ;
   private String AV3CondicionIvaNombre ;
   private IDataStoreProvider pr_default ;
   private String[] CONDICIONI2_A14CondicionIvaNombre ;
   private short[] CONDICIONI2_A13CondicionIvaId ;
}

final  class condicionivaconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("CONDICIONI2", "SELECT CondicionIvaNombre, CondicionIvaId FROM CondicionIva ORDER BY CondicionIvaId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("CONDICIONI3", "INSERT INTO GXA0007(CondicionIvaId, CondicionIvaNombre) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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

