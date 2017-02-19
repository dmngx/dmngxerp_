/*
               File: RubroConversion
        Description: Conversion for table Rubro
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:44.60
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rubroconversion extends GXProcedure
{
   public rubroconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rubroconversion.class ), "" );
   }

   public rubroconversion( int remoteHandle ,
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
      /* Using cursor RUBROCONVE2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12RubroNombre = RUBROCONVE2_A12RubroNombre[0] ;
         A11RubroId = RUBROCONVE2_A11RubroId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0006

         */
         AV2RubroId = A11RubroId ;
         AV3RubroNombre = A12RubroNombre ;
         /* Using cursor RUBROCONVE3 */
         pr_default.execute(1, new Object[] {new Short(AV2RubroId), AV3RubroNombre});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0006") ;
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
      RUBROCONVE2_A12RubroNombre = new String[] {""} ;
      RUBROCONVE2_A11RubroId = new short[1] ;
      A12RubroNombre = "" ;
      AV3RubroNombre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.rubroconversion__default(),
         new Object[] {
             new Object[] {
            RUBROCONVE2_A12RubroNombre, RUBROCONVE2_A11RubroId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A11RubroId ;
   private short AV2RubroId ;
   private short Gx_err ;
   private int GIGXA0006 ;
   private String scmdbuf ;
   private String A12RubroNombre ;
   private String Gx_emsg ;
   private String AV3RubroNombre ;
   private IDataStoreProvider pr_default ;
   private String[] RUBROCONVE2_A12RubroNombre ;
   private short[] RUBROCONVE2_A11RubroId ;
}

final  class rubroconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("RUBROCONVE2", "SELECT RubroNombre, RubroId FROM Rubro ORDER BY RubroId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("RUBROCONVE3", "INSERT INTO GXA0006(RubroId, RubroNombre) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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

