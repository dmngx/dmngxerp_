/*
               File: Gx00R0
        Description: Selection List Entidad
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 14:16:59.4
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/com.kberp.gx00r0")
public final  class gx00r0 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx00r0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx00r0_impl(context);
   }

   public String getServletInfo( )
   {
      return "Selection List Entidad";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}
