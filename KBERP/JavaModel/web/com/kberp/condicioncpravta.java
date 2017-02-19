/*
               File: CondicionCpraVta
        Description: Condicion Cpra Vta
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:32:3.26
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.kberp.condicioncpravta")
public final  class condicioncpravta extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new condicioncpravta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new condicioncpravta_impl(context);
   }

   public String getServletInfo( )
   {
      return "Condicion Cpra Vta";
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

