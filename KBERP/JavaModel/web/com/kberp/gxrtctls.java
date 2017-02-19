/*
               File: GXRTCtls
        Description: Run time reorganization controls
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 16:38:54.74
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gxrtctls extends GXProcedure
{
   public gxrtctls( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gxrtctls.class ), "" );
   }

   public gxrtctls( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( )
   {
      gxrtctls.this.aP0 = aP0;
      gxrtctls.this.aP0 = new byte[] {0};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( byte[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( byte[] aP0 )
   {
      gxrtctls.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV2Status = (byte)(0) ;
      System.out.println( "=== Starting run time controls" );
      System.out.println( "Checking that table Comprobante does NOT contain records." );
      AV3NotFound = (byte)(0) ;
      AV6GXLvl5 = (byte)(0) ;
      /* Using cursor LTCTLS2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A42EmpresaId = LTCTLS2_A42EmpresaId[0] ;
         AV6GXLvl5 = (byte)(1) ;
         AV7GXLvl8 = (byte)(0) ;
         /* Using cursor LTCTLS3 */
         pr_default.execute(1, new Object[] {new Integer(A42EmpresaId)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A81EntidadId = LTCTLS3_A81EntidadId[0] ;
            AV7GXLvl8 = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV7GXLvl8 == 0 )
         {
            AV2Status = (byte)(1) ;
            System.out.println( "Fail: Table Comprobante has records but referenced key value in table Entidad does _not_ exist." );
            System.out.println( "Recovery: See recovery information for reorganization message rgz0029." );
            AV3NotFound = (byte)(1) ;
         }
         if ( AV3NotFound == 1 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV6GXLvl5 == 0 )
      {
         System.out.println( "Success: Table Comprobante does NOT have records." );
         AV3NotFound = (byte)(1) ;
      }
      if ( AV3NotFound == 0 )
      {
         System.out.println( "Success: Table Comprobantehas records but all referenced key values in table Entidad exist." );
      }
      System.out.println( "====================" );
      System.out.println( "=== End of run time controls" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = gxrtctls.this.AV2Status;
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
      LTCTLS2_A42EmpresaId = new int[1] ;
      LTCTLS3_A42EmpresaId = new int[1] ;
      LTCTLS3_A81EntidadId = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gxrtctls__default(),
         new Object[] {
             new Object[] {
            LTCTLS2_A42EmpresaId
            }
            , new Object[] {
            LTCTLS3_A42EmpresaId, LTCTLS3_A81EntidadId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV2Status ;
   private byte AV3NotFound ;
   private byte AV6GXLvl5 ;
   private byte AV7GXLvl8 ;
   private short Gx_err ;
   private int A42EmpresaId ;
   private int A81EntidadId ;
   private String scmdbuf ;
   private byte[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] LTCTLS2_A42EmpresaId ;
   private int[] LTCTLS3_A42EmpresaId ;
   private int[] LTCTLS3_A81EntidadId ;
}

final  class gxrtctls__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("LTCTLS2", "SELECT DISTINCT EmpresaId FROM Comprobante ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("LTCTLS3", "SELECT EmpresaId, EntidadId FROM Entidad WHERE (EmpresaId = ?) AND (EntidadId = 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
      }
   }

}

