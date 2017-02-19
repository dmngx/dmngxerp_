/*
               File: EntidadTelefonoConversion
        Description: Conversion for table EntidadTelefono
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:1:24.32
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entidadtelefonoconversion extends GXProcedure
{
   public entidadtelefonoconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entidadtelefonoconversion.class ), "" );
   }

   public entidadtelefonoconversion( int remoteHandle ,
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
      /* Using cursor ENTIDADTEL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A93EntidadTelefonoObs = ENTIDADTEL2_A93EntidadTelefonoObs[0] ;
         A92EntidadTelefono = ENTIDADTEL2_A92EntidadTelefono[0] ;
         A91EntidadTelefonoId = ENTIDADTEL2_A91EntidadTelefonoId[0] ;
         A81EntidadId = ENTIDADTEL2_A81EntidadId[0] ;
         A42EmpresaId = ENTIDADTEL2_A42EmpresaId[0] ;
         /*
            INSERT RECORD ON TABLE GXA0042

         */
         AV2EntidadId = A81EntidadId ;
         AV3EntidadTelefonoId = A91EntidadTelefonoId ;
         AV4EntidadTelefono = A92EntidadTelefono ;
         AV5EntidadTelefonoObs = A93EntidadTelefonoObs ;
         /* Using cursor ENTIDADTEL3 */
         pr_default.execute(1, new Object[] {new Integer(AV2EntidadId), new Short(AV3EntidadTelefonoId)});
         if ( (pr_default.getStatus(1) != 101) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
            /* Using cursor ENTIDADTEL4 */
            pr_default.execute(2, new Object[] {new Integer(AV2EntidadId), new Short(AV3EntidadTelefonoId), AV4EntidadTelefono, AV5EntidadTelefonoObs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0042") ;
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
      ENTIDADTEL2_A93EntidadTelefonoObs = new String[] {""} ;
      ENTIDADTEL2_A92EntidadTelefono = new String[] {""} ;
      ENTIDADTEL2_A91EntidadTelefonoId = new short[1] ;
      ENTIDADTEL2_A81EntidadId = new int[1] ;
      ENTIDADTEL2_A42EmpresaId = new int[1] ;
      A93EntidadTelefonoObs = "" ;
      A92EntidadTelefono = "" ;
      AV4EntidadTelefono = "" ;
      AV5EntidadTelefonoObs = "" ;
      ENTIDADTEL3_AV2EntidadId = new int[1] ;
      ENTIDADTEL3_AV3EntidadTelefonoId = new short[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.entidadtelefonoconversion__default(),
         new Object[] {
             new Object[] {
            ENTIDADTEL2_A93EntidadTelefonoObs, ENTIDADTEL2_A92EntidadTelefono, ENTIDADTEL2_A91EntidadTelefonoId, ENTIDADTEL2_A81EntidadId, ENTIDADTEL2_A42EmpresaId
            }
            , new Object[] {
            ENTIDADTEL3_AV2EntidadId, ENTIDADTEL3_AV3EntidadTelefonoId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A91EntidadTelefonoId ;
   private short AV3EntidadTelefonoId ;
   private short Gx_err ;
   private int A81EntidadId ;
   private int A42EmpresaId ;
   private int GIGXA0042 ;
   private int AV2EntidadId ;
   private String scmdbuf ;
   private String A92EntidadTelefono ;
   private String AV4EntidadTelefono ;
   private String Gx_emsg ;
   private String A93EntidadTelefonoObs ;
   private String AV5EntidadTelefonoObs ;
   private IDataStoreProvider pr_default ;
   private String[] ENTIDADTEL2_A93EntidadTelefonoObs ;
   private String[] ENTIDADTEL2_A92EntidadTelefono ;
   private short[] ENTIDADTEL2_A91EntidadTelefonoId ;
   private int[] ENTIDADTEL2_A81EntidadId ;
   private int[] ENTIDADTEL2_A42EmpresaId ;
   private int[] ENTIDADTEL3_AV2EntidadId ;
   private short[] ENTIDADTEL3_AV3EntidadTelefonoId ;
}

final  class entidadtelefonoconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("ENTIDADTEL2", "SELECT EntidadTelefonoObs, EntidadTelefono, EntidadTelefonoId, EntidadId, EmpresaId FROM EntidadTelefono ORDER BY EmpresaId, EntidadId, EntidadTelefonoId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("ENTIDADTEL3", "SELECT EntidadId, EntidadTelefonoId FROM GXA0042 WHERE EntidadId = ? AND EntidadTelefonoId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("ENTIDADTEL4", "INSERT INTO GXA0042(EntidadId, EntidadTelefonoId, EntidadTelefono, EntidadTelefonoObs) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
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
               stmt.setString(3, (String)parms[2], 20);
               stmt.setVarchar(4, (String)parms[3], 200, false);
               return;
      }
   }

}

