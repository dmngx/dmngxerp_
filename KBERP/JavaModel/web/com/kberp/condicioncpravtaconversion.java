/*
               File: CondicionCpraVtaConversion
        Description: Conversion for table CondicionCpraVta
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:43.71
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class condicioncpravtaconversion extends GXProcedure
{
   public condicioncpravtaconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( condicioncpravtaconversion.class ), "" );
   }

   public condicioncpravtaconversion( int remoteHandle ,
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
      /* Using cursor CONDICIONC2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A16CondicionCpraVtaNombre = CONDICIONC2_A16CondicionCpraVtaNombre[0] ;
         A15CondicionCpraVtaId = CONDICIONC2_A15CondicionCpraVtaId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0008

         */
         AV2CondicionCpraVtaId = A15CondicionCpraVtaId ;
         AV3CondicionCpraVtaNombre = A16CondicionCpraVtaNombre ;
         /* Using cursor CONDICIONC3 */
         pr_default.execute(1, new Object[] {new Short(AV2CondicionCpraVtaId), AV3CondicionCpraVtaNombre});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0008") ;
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
      CONDICIONC2_A16CondicionCpraVtaNombre = new String[] {""} ;
      CONDICIONC2_A15CondicionCpraVtaId = new short[1] ;
      A16CondicionCpraVtaNombre = "" ;
      AV3CondicionCpraVtaNombre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.condicioncpravtaconversion__default(),
         new Object[] {
             new Object[] {
            CONDICIONC2_A16CondicionCpraVtaNombre, CONDICIONC2_A15CondicionCpraVtaId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A15CondicionCpraVtaId ;
   private short AV2CondicionCpraVtaId ;
   private short Gx_err ;
   private int GIGXA0008 ;
   private String scmdbuf ;
   private String A16CondicionCpraVtaNombre ;
   private String Gx_emsg ;
   private String AV3CondicionCpraVtaNombre ;
   private IDataStoreProvider pr_default ;
   private String[] CONDICIONC2_A16CondicionCpraVtaNombre ;
   private short[] CONDICIONC2_A15CondicionCpraVtaId ;
}

final  class condicioncpravtaconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("CONDICIONC2", "SELECT CondicionCpraVtaNombre, CondicionCpraVtaId FROM CondicionCpraVta ORDER BY CondicionCpraVtaId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("CONDICIONC3", "INSERT INTO GXA0008(CondicionCpraVtaId, CondicionCpraVtaNombre) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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

