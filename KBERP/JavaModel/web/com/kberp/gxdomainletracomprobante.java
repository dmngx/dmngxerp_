/*
               File: LetraComprobante
        Description: LetraComprobante
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:35:2.3
       Program type: Callable routine
          Main DBMS: postgresql
*/
package com.kberp ;
import com.kberp.*;
import com.genexus.*;

public final  class gxdomainletracomprobante
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Byte((byte)1), "A");
      domain.put(new Byte((byte)2), "B");
      domain.put(new Byte((byte)3), "C");
      domain.put(new Byte((byte)4), "E");
      domain.put(new Byte((byte)5), "M");
      domain.put(new Byte((byte)6), "R");
      domain.put(new Byte((byte)7), "X");
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

