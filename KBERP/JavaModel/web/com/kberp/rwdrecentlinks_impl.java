/*
               File: rwdrecentlinks_impl
        Description: Responsive Recent Links
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:31:56.30
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

public final  class rwdrecentlinks_impl extends GXWebComponent
{
   public rwdrecentlinks_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rwdrecentlinks_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rwdrecentlinks_impl.class ));
   }

   public rwdrecentlinks_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetNextPar( ) ;
            gxfirstwebparm_bkp = gxfirstwebparm ;
            gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
            if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
            {
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               dyncall( httpContext.GetNextPar( )) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetNextPar( ) ;
               sSFPrefix = httpContext.GetNextPar( ) ;
               AV6FormCaption = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FormCaption", AV6FormCaption);
               AV7FormPgmName = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7FormPgmName", AV7FormPgmName);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV6FormCaption,AV7FormPgmName});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetNextPar( ) ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetNextPar( ) ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Links") == 0 )
            {
               nRC_GXsfl_8 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               nGXsfl_8_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               sGXsfl_8_idx = httpContext.GetNextPar( ) ;
               sPrefix = httpContext.GetNextPar( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxnrlinks_newrow( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Links") == 0 )
            {
               AV6FormCaption = httpContext.GetNextPar( ) ;
               sPrefix = httpContext.GetNextPar( ) ;
               init_default_properties( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrlinks_refresh( AV6FormCaption, sPrefix) ;
               httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
               return  ;
            }
            else
            {
               if ( ! httpContext.IsValidAjaxCall( false) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = gxfirstwebparm_bkp ;
            }
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa052( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      com.kberp.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( "Responsive Recent Links") ;
         httpContext.writeTextNL( "</title>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         if ( GXutil.len( sDynURL) > 0 )
         {
            httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
         }
         define_styles( ) ;
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gxcfg.js", "?201721917315635");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.rwdrecentlinks") + "?" + GXutil.URLEncode(GXutil.rtrim(AV6FormCaption)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7FormPgmName))+"\">") ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form");
      }
      else
      {
         httpContext.writeText( "<div") ;
         com.kberp.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void renderHtmlCloseForm052( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_8", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_8, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6FormCaption", GXutil.rtrim( wcpOAV6FormCaption));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7FormPgmName", wcpOAV7FormPgmName);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORMCAPTION", GXutil.rtrim( AV6FormCaption));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORMPGMNAME", AV7FormPgmName);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAINTABLE_Class", GXutil.rtrim( divMaintable_Class));
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("rwdrecentlinks.js", "?201721917315637");
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
         httpContext.SendComponentObjects();
         httpContext.SendServerCommands();
         httpContext.SendState();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         httpContext.writeTextNL( "</form>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         include_jscripts( ) ;
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "RwdRecentLinks" ;
   }

   public String getPgmdesc( )
   {
      return "Responsive Recent Links" ;
   }

   public void wb050( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.kberp.rwdrecentlinks");
         }
         com.kberp.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", divMaintable_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-md-1", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblRecenttext_Internalname, "Recents", "", "", lblRecenttext_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+"e11051_client"+"'", "", "RecentsTitle", 7, "", 1, 1, (short)(0), "HLP_RwdRecentLinks.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 col-md-11", "left", "top", "", "", "div");
         /*  Grid Control  */
         LinksContainer.SetIsFreestyle(true);
         LinksContainer.SetWrapped(nGXWrapped);
         if ( LinksContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+sPrefix+"LinksContainer"+"DivS\" data-gxgridid=\"8\">") ;
            sStyleString = "" ;
            com.kberp.GxWebStd.gx_table_start( httpContext, subLinks_Internalname, subLinks_Internalname, "", "RecentLinksGrid", 0, "", "", 1, 2, sStyleString, "", 0);
            LinksContainer.AddObjectProperty("GridName", "Links");
         }
         else
         {
            LinksContainer.AddObjectProperty("GridName", "Links");
            LinksContainer.AddObjectProperty("Class", GXutil.rtrim( "RecentLinksGrid"));
            LinksContainer.AddObjectProperty("Class", "RecentLinksGrid");
            LinksContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subLinks_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("CmpContext", sPrefix);
            LinksContainer.AddObjectProperty("InMasterPage", "false");
            LinksColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            LinksContainer.AddColumnProperties(LinksColumn);
            LinksColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            LinksContainer.AddColumnProperties(LinksColumn);
            LinksColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            LinksContainer.AddColumnProperties(LinksColumn);
            LinksColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            LinksColumn.AddObjectProperty("Value", lblPlace_Caption);
            LinksContainer.AddColumnProperties(LinksColumn);
            LinksContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subLinks_Allowselection, (byte)(1), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subLinks_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subLinks_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subLinks_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subLinks_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subLinks_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 8 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_8 = (short)(nGXsfl_8_idx-1) ;
         if ( LinksContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"LinksContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Links", LinksContainer);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LinksContainerData", LinksContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LinksContainerData"+"V", LinksContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"LinksContainerData"+"V"+"\" value='"+LinksContainer.GridValuesHidden()+"'/>") ;
            }
         }
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start052( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_2-109402", (short)(0)) ;
            Form.getMeta().addItem("description", "Responsive Recent Links", (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup050( ) ;
         }
      }
   }

   public void ws052( )
   {
      start052( ) ;
      evt052( ) ;
   }

   public void evt052( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup050( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup050( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "LINKS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup050( ) ;
                           }
                           nGXsfl_8_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_8_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_8_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_82( ) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "LINKS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e12052 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup050( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we052( )
   {
      if ( ! com.kberp.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.kberp.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm052( ) ;
         }
      }
   }

   public void pa052( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
            }
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrlinks_newrow( )
   {
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_82( ) ;
      while ( nGXsfl_8_idx <= nRC_GXsfl_8 )
      {
         sendrow_82( ) ;
         nGXsfl_8_idx = (short)(((subLinks_Islastpage==1)&&(nGXsfl_8_idx+1>sublinks_recordsperpage( )) ? 1 : nGXsfl_8_idx+1)) ;
         sGXsfl_8_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_8_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_82( ) ;
      }
      httpContext.GX_webresponse.addString(LinksContainer.ToJavascriptSource());
      /* End function gxnrLinks_newrow */
   }

   public void gxgrlinks_refresh( String AV6FormCaption ,
                                  String sPrefix )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      LINKS_nCurrentRecord = 0 ;
      rf052( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrLinks_refresh */
   }

   public void refresh( )
   {
      rf052( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf052( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         LinksContainer.ClearRows();
      }
      wbStart = (short)(8) ;
      nGXsfl_8_idx = (short)(1) ;
      sGXsfl_8_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_8_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_82( ) ;
      nGXsfl_8_Refreshing = (short)(1) ;
      LinksContainer.AddObjectProperty("GridName", "Links");
      LinksContainer.AddObjectProperty("CmpContext", sPrefix);
      LinksContainer.AddObjectProperty("InMasterPage", "false");
      LinksContainer.AddObjectProperty("Class", GXutil.rtrim( "RecentLinksGrid"));
      LinksContainer.AddObjectProperty("Class", "RecentLinksGrid");
      LinksContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      LinksContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      LinksContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subLinks_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      LinksContainer.setPageSize( sublinks_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_82( ) ;
         e12052 ();
         wbEnd = (short)(8) ;
         wb050( ) ;
      }
      nGXsfl_8_Refreshing = (short)(0) ;
   }

   public int sublinks_pagecount( )
   {
      return -1 ;
   }

   public int sublinks_recordcount( )
   {
      return -1 ;
   }

   public int sublinks_recordsperpage( )
   {
      return -1 ;
   }

   public int sublinks_currentpage( )
   {
      return -1 ;
   }

   public void strup050( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         /* Read saved values. */
         nRC_GXsfl_8 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_8"), ",", ".")) ;
         wcpOAV6FormCaption = httpContext.cgiGet( sPrefix+"wcpOAV6FormCaption") ;
         wcpOAV7FormPgmName = httpContext.cgiGet( sPrefix+"wcpOAV7FormPgmName") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   private void e12052( )
   {
      /* Links_Load Routine */
      AV11RecentLinksItems.fromxml(AV8Session.getValue("RecentLinks"), null, null);
      AV9i = 1 ;
      while ( AV9i <= AV11RecentLinksItems.size() )
      {
         AV12RecentLinksItem = (com.kberp.SdtLinkList_LinkItem)((com.kberp.SdtLinkList_LinkItem)AV11RecentLinksItems.elementAt(-1+AV9i));
         if ( GXutil.strcmp(GXutil.trim( AV12RecentLinksItem.getgxTv_SdtLinkList_LinkItem_Caption()), GXutil.trim( AV6FormCaption)) == 0 )
         {
            AV11RecentLinksItems.removeItem(AV9i);
         }
         else
         {
            AV9i = (int)(AV9i+1) ;
         }
      }
      while ( AV11RecentLinksItems.size() > 8 - 1 )
      {
         AV11RecentLinksItems.removeItem(1);
      }
      AV12RecentLinksItem = (com.kberp.SdtLinkList_LinkItem)new com.kberp.SdtLinkList_LinkItem(remoteHandle, context);
      AV12RecentLinksItem.setgxTv_SdtLinkList_LinkItem_Caption( GXutil.trim( AV6FormCaption) );
      AV12RecentLinksItem.setgxTv_SdtLinkList_LinkItem_Url( AV10Request.getScriptName()+"?"+AV10Request.getQuerystring() );
      AV11RecentLinksItems.add(AV12RecentLinksItem, 0);
      AV8Session.setValue("RecentLinks", AV11RecentLinksItems.toxml(false, true, "LinkList", "GeneXus"));
      AV9i = 1 ;
      while ( AV9i <= AV11RecentLinksItems.size() )
      {
         AV12RecentLinksItem = (com.kberp.SdtLinkList_LinkItem)((com.kberp.SdtLinkList_LinkItem)AV11RecentLinksItems.elementAt(-1+AV9i));
         AV13PlaceCaption = AV12RecentLinksItem.getgxTv_SdtLinkList_LinkItem_Caption() ;
         if ( GXutil.len( AV13PlaceCaption) > 20 )
         {
            AV13PlaceCaption = GXutil.format( "%1...", GXutil.substring( AV13PlaceCaption, 1, 18), "", "", "", "", "", "", "", "") ;
         }
         lblPlace_Caption = AV13PlaceCaption ;
         if ( AV9i < AV11RecentLinksItems.size() )
         {
            lblPlace_Link = formatLink(AV12RecentLinksItem.getgxTv_SdtLinkList_LinkItem_Url())  ;
         }
         else
         {
            lblPlace_Link = "" ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(8) ;
         }
         sendrow_82( ) ;
         if ( isFullAjaxMode( ) && ( nGXsfl_8_Refreshing == 0 ) )
         {
            httpContext.doAjaxLoad(8, LinksRow);
         }
         AV9i = (int)(AV9i+1) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV6FormCaption = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FormCaption", AV6FormCaption);
      AV7FormPgmName = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7FormPgmName", AV7FormPgmName);
   }

   public String getresponse( String sGXDynURL )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa052( ) ;
      ws052( ) ;
      we052( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV6FormCaption = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV7FormPgmName = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa052( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "rwdrecentlinks");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa052( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV6FormCaption = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FormCaption", AV6FormCaption);
         AV7FormPgmName = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7FormPgmName", AV7FormPgmName);
      }
      wcpOAV6FormCaption = httpContext.cgiGet( sPrefix+"wcpOAV6FormCaption") ;
      wcpOAV7FormPgmName = httpContext.cgiGet( sPrefix+"wcpOAV7FormPgmName") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV6FormCaption, wcpOAV6FormCaption) != 0 ) || ( GXutil.strcmp(AV7FormPgmName, wcpOAV7FormPgmName) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV6FormCaption = AV6FormCaption ;
      wcpOAV7FormPgmName = AV7FormPgmName ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV6FormCaption = httpContext.cgiGet( sPrefix+"AV6FormCaption_CTRL") ;
      if ( GXutil.len( sCtrlAV6FormCaption) > 0 )
      {
         AV6FormCaption = httpContext.cgiGet( sCtrlAV6FormCaption) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FormCaption", AV6FormCaption);
      }
      else
      {
         AV6FormCaption = httpContext.cgiGet( sPrefix+"AV6FormCaption_PARM") ;
      }
      sCtrlAV7FormPgmName = httpContext.cgiGet( sPrefix+"AV7FormPgmName_CTRL") ;
      if ( GXutil.len( sCtrlAV7FormPgmName) > 0 )
      {
         AV7FormPgmName = httpContext.cgiGet( sCtrlAV7FormPgmName) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7FormPgmName", AV7FormPgmName);
      }
      else
      {
         AV7FormPgmName = httpContext.cgiGet( sPrefix+"AV7FormPgmName_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa052( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws052( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws052( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6FormCaption_PARM", GXutil.rtrim( AV6FormCaption));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6FormCaption)) > 0 )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6FormCaption_CTRL", GXutil.rtrim( sCtrlAV6FormCaption));
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7FormPgmName_PARM", AV7FormPgmName);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7FormPgmName)) > 0 )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7FormPgmName_CTRL", GXutil.rtrim( sCtrlAV7FormPgmName));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we052( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName ;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1731551");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721917315678");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("rwdrecentlinks.js", "?201721917315678");
      /* End function include_jscripts */
   }

   public void subsflControlProps_82( )
   {
      lblPlace_Internalname = sPrefix+"PLACE_"+sGXsfl_8_idx ;
   }

   public void subsflControlProps_fel_82( )
   {
      lblPlace_Internalname = sPrefix+"PLACE_"+sGXsfl_8_fel_idx ;
   }

   public void sendrow_82( )
   {
      subsflControlProps_82( ) ;
      wb050( ) ;
      LinksRow = GXWebRow.GetNew(context,LinksContainer) ;
      if ( subLinks_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subLinks_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subLinks_Class, "") != 0 )
         {
            subLinks_Linesclass = subLinks_Class+"Odd" ;
         }
      }
      else if ( subLinks_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subLinks_Backstyle = (byte)(0) ;
         subLinks_Backcolor = subLinks_Allbackcolor ;
         if ( GXutil.strcmp(subLinks_Class, "") != 0 )
         {
            subLinks_Linesclass = subLinks_Class+"Uniform" ;
         }
      }
      else if ( subLinks_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subLinks_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subLinks_Class, "") != 0 )
         {
            subLinks_Linesclass = subLinks_Class+"Odd" ;
         }
         subLinks_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subLinks_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subLinks_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_8_idx) % (2))) == 0 )
         {
            subLinks_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subLinks_Class, "") != 0 )
            {
               subLinks_Linesclass = subLinks_Class+"Even" ;
            }
         }
         else
         {
            subLinks_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subLinks_Class, "") != 0 )
            {
               subLinks_Linesclass = subLinks_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( LinksContainer.GetWrapped() == 1 )
      {
         if ( ( 1 == 0 ) && ( nGXsfl_8_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subLinks_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_8_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)((nGXsfl_8_idx) % (1))) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subLinks_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_8_idx+"\">") ;
            }
         }
      }
      /* Div Control */
      LinksRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divLinkstable_Internalname+"_"+sGXsfl_8_idx,new Integer(1),new Integer(0),"px",new Integer(0),"px","RecentLinksTable","left","top","","","div"});
      /* Div Control */
      LinksRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",new Integer(1),new Integer(0),"px",new Integer(0),"px","row","left","top","","","div"});
      /* Div Control */
      LinksRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",new Integer(1),new Integer(0),"px",new Integer(0),"px","col-xs-12","left","top","","","div"});
      /* Text block */
      LinksRow.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblPlace_Internalname,lblPlace_Caption,lblPlace_Link,"",lblPlace_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+""+"'","","RecentLinkItem",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      LinksRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      LinksRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      LinksRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* End of Columns property logic. */
      LinksContainer.AddRow(LinksRow);
      nGXsfl_8_idx = (short)(((subLinks_Islastpage==1)&&(nGXsfl_8_idx+1>sublinks_recordsperpage( )) ? 1 : nGXsfl_8_idx+1)) ;
      sGXsfl_8_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_8_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_82( ) ;
      /* End function sendrow_82 */
   }

   public void init_default_properties( )
   {
      lblRecenttext_Internalname = sPrefix+"RECENTTEXT" ;
      lblPlace_Internalname = sPrefix+"PLACE" ;
      divLinkstable_Internalname = sPrefix+"LINKSTABLE" ;
      divMaintable_Internalname = sPrefix+"MAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subLinks_Internalname = sPrefix+"LINKS" ;
   }

   public void initialize_properties( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      lblPlace_Link = "" ;
      lblPlace_Caption = "Place." ;
      subLinks_Class = "RecentLinksGrid" ;
      subLinks_Allowcollapsing = (byte)(0) ;
      lblPlace_Caption = "Place." ;
      subLinks_Backcolorstyle = (byte)(0) ;
      divMaintable_Class = "RecentLinksMainTable" ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'LINKS_nFirstRecordOnPage'},{av:'LINKS_nEOF'},{av:'AV6FormCaption',fld:'vFORMCAPTION'},{av:'sPrefix'}],oparms:[]}");
      setEventMetadata("RECENTTEXT.CLICK","{handler:'e11051',iparms:[{av:'divMaintable_Class',ctrl:'MAINTABLE',prop:'Class'}],oparms:[{av:'divMaintable_Class',ctrl:'MAINTABLE',prop:'Class'}]}");
      setEventMetadata("LINKS.LOAD","{handler:'e12052',iparms:[{av:'AV6FormCaption',fld:'vFORMCAPTION'}],oparms:[{av:'lblPlace_Caption',ctrl:'PLACE',prop:'Caption'},{av:'lblPlace_Link',ctrl:'PLACE',prop:'Link'}]}");
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

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV6FormCaption = "" ;
      wcpOAV7FormPgmName = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV6FormCaption = "" ;
      AV7FormPgmName = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      lblRecenttext_Jsonclick = "" ;
      LinksContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      LinksColumn = new com.genexus.webpanels.GXWebColumn();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXKey = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV11RecentLinksItems = new GXBaseCollection<com.kberp.SdtLinkList_LinkItem>(com.kberp.SdtLinkList_LinkItem.class, "LinkList.LinkItem", "GeneXus", remoteHandle);
      AV8Session = httpContext.getWebSession();
      AV12RecentLinksItem = new com.kberp.SdtLinkList_LinkItem(remoteHandle, context);
      AV10Request = httpContext.getHttpRequest();
      AV13PlaceCaption = "" ;
      LinksRow = new com.genexus.webpanels.GXWebRow();
      sCtrlAV6FormCaption = "" ;
      sCtrlAV7FormPgmName = "" ;
      subLinks_Linesclass = "" ;
      lblPlace_Jsonclick = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte subLinks_Backcolorstyle ;
   private byte subLinks_Allowselection ;
   private byte subLinks_Allowhovering ;
   private byte subLinks_Allowcollapsing ;
   private byte subLinks_Collapsed ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subLinks_Backstyle ;
   private byte LINKS_nEOF ;
   private short nRC_GXsfl_8 ;
   private short nGXsfl_8_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_8_Refreshing=0 ;
   private int subLinks_Selectioncolor ;
   private int subLinks_Hoveringcolor ;
   private int subLinks_Islastpage ;
   private int AV9i ;
   private int idxLst ;
   private int subLinks_Backcolor ;
   private int subLinks_Allbackcolor ;
   private long LINKS_nCurrentRecord ;
   private long LINKS_nFirstRecordOnPage ;
   private String wcpOAV6FormCaption ;
   private String divMaintable_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV6FormCaption ;
   private String sGXsfl_8_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String divMaintable_Internalname ;
   private String lblRecenttext_Internalname ;
   private String lblRecenttext_Jsonclick ;
   private String sStyleString ;
   private String subLinks_Internalname ;
   private String lblPlace_Caption ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXKey ;
   private String lblPlace_Link ;
   private String sCtrlAV6FormCaption ;
   private String sCtrlAV7FormPgmName ;
   private String lblPlace_Internalname ;
   private String sGXsfl_8_fel_idx="0001" ;
   private String subLinks_Class ;
   private String subLinks_Linesclass ;
   private String divLinkstable_Internalname ;
   private String lblPlace_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private String wcpOAV7FormPgmName ;
   private String AV7FormPgmName ;
   private String AV13PlaceCaption ;
   private com.genexus.webpanels.GXWebGrid LinksContainer ;
   private com.genexus.webpanels.GXWebRow LinksRow ;
   private com.genexus.webpanels.GXWebColumn LinksColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10Request ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private GXBaseCollection<com.kberp.SdtLinkList_LinkItem> AV11RecentLinksItems ;
   private com.kberp.SdtLinkList_LinkItem AV12RecentLinksItem ;
}

