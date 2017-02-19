/*
               File: LocalidadConversion
        Description: Conversion for table Localidad
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 16, 2017 23:10:44.32
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class localidadconversion extends GXProcedure
{
   public localidadconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( localidadconversion.class ), "" );
   }

   public localidadconversion( int remoteHandle ,
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
      /* Using cursor LOCALIDADC2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6LocalidadNombre = LOCALIDADC2_A6LocalidadNombre[0] ;
         A5LocalidadId = LOCALIDADC2_A5LocalidadId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0003

         */
         AV2LocalidadId = A5LocalidadId ;
         AV3LocalidadNombre = A6LocalidadNombre ;
         /* Using cursor LOCALIDADC3 */
         pr_default.execute(1, new Object[] {new Short(AV2LocalidadId), AV3LocalidadNombre});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0003") ;
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
      LOCALIDADC2_A6LocalidadNombre = new String[] {""} ;
      LOCALIDADC2_A5LocalidadId = new short[1] ;
      A6LocalidadNombre = "" ;
      AV3LocalidadNombre = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.localidadconversion__default(),
         new Object[] {
             new Object[] {
            LOCALIDADC2_A6LocalidadNombre, LOCALIDADC2_A5LocalidadId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5LocalidadId ;
   private short AV2LocalidadId ;
   private short Gx_err ;
   private int GIGXA0003 ;
   private String scmdbuf ;
   private String A6LocalidadNombre ;
   private String Gx_emsg ;
   private String AV3LocalidadNombre ;
   private IDataStoreProvider pr_default ;
   private String[] LOCALIDADC2_A6LocalidadNombre ;
   private short[] LOCALIDADC2_A5LocalidadId ;
}

final  class localidadconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("LOCALIDADC2", "SELECT LocalidadNombre, LocalidadId FROM Localidad ORDER BY LocalidadId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("LOCALIDADC3", "INSERT INTO GXA0003(LocalidadId, LocalidadNombre) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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

