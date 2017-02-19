/*
               File: ComprobanteConversion
        Description: Conversion for table Comprobante
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 16:38:54.67
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class comprobanteconversion extends GXProcedure
{
   public comprobanteconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( comprobanteconversion.class ), "" );
   }

   public comprobanteconversion( int remoteHandle ,
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
      /* Optimized copy (Insert w/Subselect). */
      /* Using cursor COMPROBANT2 */
      pr_default.execute(0);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("Comprobante") ;
      /* End optimized group. */
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.comprobanteconversion__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private IDataStoreProvider pr_default ;
}

final  class comprobanteconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("COMPROBANT2", "INSERT INTO GXA0035(EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ComprobanteEntidadNombre, ComprobanteFecha, ComprobanteFechaSubdiario, ComprobanteVto, MonedaId) SELECT EmpresaId, 0 AS EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ComprobanteEntidadNombre, ComprobanteFecha, ComprobanteFechaSubdiario, ComprobanteVto, MonedaId  FROM Comprobante", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

