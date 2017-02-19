/*
               File: Sistema
        Description: Sistema
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:35:2.5
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import com.genexus.*;

public final  class gxdomainsistema
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Byte((byte)1), "Ventas");
      domain.put(new Byte((byte)2), "Compras");
      domain.put(new Byte((byte)3), "Contable");
      domain.put(new Byte((byte)4), "Stock");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        byte key )
   {
      if (domain.containsKey( key ))
      {
         return (String)domain.get( key );
      }
      else
      {
         return "";
      }
   }

   public static GXSimpleCollection<Byte> getValues( )
   {
      GXSimpleCollection<Byte> value = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Byte) itr.next());
      }
      return value;
   }

}

