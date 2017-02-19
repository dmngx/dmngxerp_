/*
               File: reorg
        Description: Table Manager
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:35:1.83
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.util.*;

public final  class reorg extends GXProcedure
{
   public reorg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reorg.class ), "" );
   }

   public reorg( int remoteHandle ,
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
      if ( previousCheck() )
      {
         executeReorganization( ) ;
      }
   }

   private void FirstActions( )
   {
      /* Load data into tables. */
   }

   public void ReorganizeEntidad( ) throws SQLException
   {
      String cmdBufferCreate = "" ;
      String cmdBuffer ;
      /* Indices for table Entidad */
      cmdBuffer = " ALTER TABLE Entidad ADD EntidadActiva BOOLEAN NOT NULL DEFAULT '0' ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE Entidad ALTER COLUMN EntidadActiva DROP DEFAULT ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
   }

   private void tablesCount( )
   {
      if ( ! GXReorganization.isResumeMode( ) )
      {
         /* Using cursor P00012 */
         pr_default.execute(0);
         EntidadCount = P00012_AEntidadCount[0] ;
         pr_default.close(0);
         GXReorganization.printRecordCount ( "Entidad" ,  EntidadCount );
      }
   }

   private boolean previousCheck( )
   {
      if ( ! GXReorganization.mustRunCheck( ) )
      {
         return true ;
      }
      sSchemaVar = context.getUserId( "Server", remoteHandle, pr_default) ;
      if ( ColumnExist("Entidad",sSchemaVar,"EntidadActiva") )
      {
         GXReorganization.setCheckError ( localUtil.getMessages().getMessage("GXM_column_exist", new Object[] {"EntidadActiva","Entidad"}) ) ;
         return false ;
      }
      return true ;
   }

   private boolean ColumnExist( String sTableName ,
                                String sMySchemaName ,
                                String sMyColumnName )
   {
      boolean result ;
      result = false ;
      /* Using cursor P00023 */
      pr_default.execute(1, new Object[] {sTableName, sMySchemaName, sMyColumnName});
      while ( (pr_default.getStatus(1) != 101) )
      {
         tablename = P00023_Atablename[0] ;
         ntablename = P00023_ntablename[0] ;
         schemaname = P00023_Aschemaname[0] ;
         nschemaname = P00023_nschemaname[0] ;
         columnname = P00023_Acolumnname[0] ;
         ncolumnname = P00023_ncolumnname[0] ;
         attrelid = P00023_Aattrelid[0] ;
         nattrelid = P00023_nattrelid[0] ;
         oid = P00023_Aoid[0] ;
         noid = P00023_noid[0] ;
         relname = P00023_Arelname[0] ;
         nrelname = P00023_nrelname[0] ;
         result = true ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      return result ;
   }

   private void executeOnlyTablesReorganization( )
   {
      callSubmit( "ReorganizeEntidad" ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"Entidad",""}) ,  1 , new Object[]{ });
   }

   private void executeOnlyRisReorganization( )
   {
   }

   private void executeTablesReorganization( )
   {
      executeOnlyTablesReorganization( ) ;
      executeOnlyRisReorganization( ) ;
      ReorgSubmitThreadPool.startProcess();
   }

   private void setPrecedence( )
   {
      setPrecedencetables( ) ;
      setPrecedenceris( ) ;
   }

   private void setPrecedencetables( )
   {
      GXReorganization.addMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"Entidad",""}) );
      ReorgSubmitThreadPool.addBlock( "ReorganizeEntidad" );
   }

   private void setPrecedenceris( )
   {
   }

   private void executeReorganization( )
   {
      if ( ErrCode == 0 )
      {
         tablesCount( ) ;
         if ( ! GXReorganization.getRecordCount( ) )
         {
            FirstActions( ) ;
            setPrecedence( ) ;
            executeTablesReorganization( ) ;
         }
      }
   }

   public void UtilsCleanup( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void submitReorg( int submitId ,
                            Object [] submitParms ) throws SQLException
   {
      UserInformation submitUI = Application.getConnectionManager().createUserInformation(Namespace.getNamespace(context.getNAME_SPACE()));
      switch ( submitId )
      {
            case 1 :
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"Entidad",""})+" STARTED" );
               ReorganizeEntidad( ) ;
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"Entidad",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
      }
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P00012_AEntidadCount = new int[1] ;
      sSchemaVar = "" ;
      sTableName = "" ;
      sMySchemaName = "" ;
      sMyColumnName = "" ;
      tablename = "" ;
      ntablename = false ;
      schemaname = "" ;
      nschemaname = false ;
      columnname = "" ;
      ncolumnname = false ;
      attrelid = "" ;
      nattrelid = false ;
      oid = "" ;
      noid = false ;
      relname = "" ;
      nrelname = false ;
      P00023_Atablename = new String[] {""} ;
      P00023_ntablename = new boolean[] {false} ;
      P00023_Aschemaname = new String[] {""} ;
      P00023_nschemaname = new boolean[] {false} ;
      P00023_Acolumnname = new String[] {""} ;
      P00023_ncolumnname = new boolean[] {false} ;
      P00023_Aattrelid = new String[] {""} ;
      P00023_nattrelid = new boolean[] {false} ;
      P00023_Aoid = new String[] {""} ;
      P00023_noid = new boolean[] {false} ;
      P00023_Arelname = new String[] {""} ;
      P00023_nrelname = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.reorg__default(),
         new Object[] {
             new Object[] {
            P00012_AEntidadCount
            }
            , new Object[] {
            P00023_Atablename, P00023_Aschemaname, P00023_Acolumnname, P00023_Aattrelid, P00023_Aoid, P00023_Arelname
            }
         }
      );
      /* GeneXus formulas. */
   }

   protected short ErrCode ;
   protected int EntidadCount ;
   protected String scmdbuf ;
   protected String sSchemaVar ;
   protected String sTableName ;
   protected String sMySchemaName ;
   protected String sMyColumnName ;
   protected boolean ntablename ;
   protected boolean nschemaname ;
   protected boolean ncolumnname ;
   protected boolean nattrelid ;
   protected boolean noid ;
   protected boolean nrelname ;
   protected String tablename ;
   protected String schemaname ;
   protected String columnname ;
   protected String attrelid ;
   protected String oid ;
   protected String relname ;
   protected IDataStoreProvider pr_default ;
   protected int[] P00012_AEntidadCount ;
   protected String[] P00023_Atablename ;
   protected boolean[] P00023_ntablename ;
   protected String[] P00023_Aschemaname ;
   protected boolean[] P00023_nschemaname ;
   protected String[] P00023_Acolumnname ;
   protected boolean[] P00023_ncolumnname ;
   protected String[] P00023_Aattrelid ;
   protected boolean[] P00023_nattrelid ;
   protected String[] P00023_Aoid ;
   protected boolean[] P00023_noid ;
   protected String[] P00023_Arelname ;
   protected boolean[] P00023_nrelname ;
}

final  class reorg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00012", "SELECT COUNT(*) FROM Entidad ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00023", "SELECT T.TABLENAME, T.TABLEOWNER, T1.ATTNAME, T1.ATTRELID, T2.OID, T2.RELNAME FROM PG_TABLES T, PG_ATTRIBUTE T1, PG_CLASS T2 WHERE (UPPER(T.TABLENAME) = ( UPPER(?))) AND (UPPER(T.TABLEOWNER) = ( UPPER(?))) AND (UPPER(T1.ATTNAME) = ( UPPER(?))) AND (T2.OID = ( T1.ATTRELID)) AND (T2.RELNAME = ( T.TABLENAME)) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
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
               stmt.setString(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 255);
               stmt.setString(3, (String)parms[2], 255);
               return;
      }
   }

}

