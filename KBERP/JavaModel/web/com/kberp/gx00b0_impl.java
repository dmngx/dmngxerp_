/*
               File: gx00b0_impl
        Description: Selection List Cfg Comprobante
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:32:25.72
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

public final  class gx00b0_impl extends GXDataArea
{
   public gx00b0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00b0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00b0_impl.class ));
   }

   public gx00b0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCcfgcomprobantesistema = new HTMLChoice();
      cmbCfgComprobanteSistema = new HTMLChoice();
   }

   public void initweb( )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_44 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_44_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_44_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV6cCfgComprobanteId = httpContext.GetNextPar( ) ;
            AV7cCfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cCfgComprobanteSistema = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteSistema) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV9pCfgComprobanteId = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9pCfgComprobanteId", AV9pCfgComprobanteId);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10pCfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV10pCfgComprobantePrefijo, 4, 0)));
            }
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj = new com.kberp.rwdpromptmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,true);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa0H2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0H2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      com.kberp.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gxcfg.js", "?201721917322577");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx00b0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV9pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pCfgComprobantePrefijo,4,0)))+"\">") ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void renderHtmlCloseForm( )
   {
      /* Send hidden variables. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEID", AV6cCfgComprobanteId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEPREFIJO", GXutil.ltrim( localUtil.ntoc( AV7cCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTESISTEMA", GXutil.ltrim( localUtil.ntoc( AV8cCfgComprobanteSistema, (byte)(2), (byte)(0), ",", "")));
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_44, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEID", AV9pCfgComprobanteId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEPREFIJO", GXutil.ltrim( localUtil.ntoc( AV10pCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEIDFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobanteidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEPREFIJOFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobanteprefijofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTESISTEMAFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobantesistemafiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.kberp.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we0H2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0H2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.kberp.gx00b0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV9pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pCfgComprobantePrefijo,4,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00B0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Cfg Comprobante" ;
   }

   public void wb0H0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         com.kberp.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divCfgcomprobanteidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCfgcomprobanteidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobanteidfilter_Internalname, "Cfg Comprobante Id", "", "", lblLblcfgcomprobanteidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110h1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcfgcomprobanteid_Internalname, "Cfg Comprobante Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobanteid_Internalname, AV6cCfgComprobanteId, GXutil.rtrim( localUtil.format( AV6cCfgComprobanteId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobanteid_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobanteid_Visible, edtavCcfgcomprobanteid_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00B0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divCfgcomprobanteprefijofiltercontainer_Internalname, 1, 0, "px", 0, "px", divCfgcomprobanteprefijofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobanteprefijofilter_Internalname, "Cfg Comprobante Prefijo", "", "", lblLblcfgcomprobanteprefijofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120h1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcfgcomprobanteprefijo_Internalname, "Cfg Comprobante Prefijo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobanteprefijo_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")), ((edtavCcfgcomprobanteprefijo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cCfgComprobantePrefijo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cCfgComprobantePrefijo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobanteprefijo_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobanteprefijo_Visible, edtavCcfgcomprobanteprefijo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00B0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divCfgcomprobantesistemafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCfgcomprobantesistemafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantesistemafilter_Internalname, "Cfg Comprobante Sistema", "", "", lblLblcfgcomprobantesistemafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130h1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, cmbavCcfgcomprobantesistema.getInternalname(), "Cfg Comprobante Sistema", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         /* ComboBox */
         com.kberp.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCcfgcomprobantesistema, cmbavCcfgcomprobantesistema.getInternalname(), GXutil.trim( GXutil.str( AV8cCfgComprobanteSistema, 2, 0)), 1, cmbavCcfgcomprobantesistema.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavCcfgcomprobantesistema.getVisible(), cmbavCcfgcomprobantesistema.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, "HLP_Gx00B0.htm");
         cmbavCcfgcomprobantesistema.setValue( GXutil.trim( GXutil.str( AV8cCfgComprobanteSistema, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCcfgcomprobantesistema.getInternalname(), "Values", cmbavCcfgcomprobantesistema.ToJavascriptSource());
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e140h1_client"+"'", TempTags, "", 2, "HLP_Gx00B0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"44\">") ;
            sStyleString = "" ;
            com.kberp.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Comprobante Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Comprobante Prefijo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Comprobante Sistema") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A31CfgComprobanteId);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A34CfgComprobanteSistema, (byte)(2), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_44 = (short)(nGXsfl_44_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.kberp.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.kberp.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00B0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start0H2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_2-109402", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Cfg Comprobante", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0H0( ) ;
   }

   public void ws0H2( )
   {
      start0H2( ) ;
      evt0H2( ) ;
   }

   public void evt0H2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_44_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_442( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV14Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))));
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection));
                           A31CfgComprobanteId = httpContext.cgiGet( edtCfgComprobanteId_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteId_Internalname, A31CfgComprobanteId);
                           A32CfgComprobantePrefijo = (short)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobantePrefijo_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
                           cmbCfgComprobanteSistema.setName( cmbCfgComprobanteSistema.getInternalname() );
                           cmbCfgComprobanteSistema.setValue( httpContext.cgiGet( cmbCfgComprobanteSistema.getInternalname()) );
                           A34CfgComprobanteSistema = (byte)(GXutil.lval( httpContext.cgiGet( cmbCfgComprobanteSistema.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteSistema.getInternalname(), GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e150H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e160H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ccfgcomprobanteid Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEID"), AV6cCfgComprobanteId) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobanteprefijo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEPREFIJO"), ",", ".") != AV7cCfgComprobantePrefijo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobantesistema Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTESISTEMA"), ",", ".") != AV8cCfgComprobanteSistema )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e170H2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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

   public void we0H2( )
   {
      if ( ! com.kberp.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.kberp.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa0H2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         cmbavCcfgcomprobantesistema.setName( "vCCFGCOMPROBANTESISTEMA" );
         cmbavCcfgcomprobantesistema.setWebtags( "" );
         cmbavCcfgcomprobantesistema.addItem("1", "Ventas", (short)(0));
         cmbavCcfgcomprobantesistema.addItem("2", "Compras", (short)(0));
         cmbavCcfgcomprobantesistema.addItem("3", "Contable", (short)(0));
         cmbavCcfgcomprobantesistema.addItem("4", "Stock", (short)(0));
         if ( cmbavCcfgcomprobantesistema.getItemCount() > 0 )
         {
            AV8cCfgComprobanteSistema = (byte)(GXutil.lval( cmbavCcfgcomprobantesistema.getValidValue(GXutil.trim( GXutil.str( AV8cCfgComprobanteSistema, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cCfgComprobanteSistema", GXutil.ltrim( GXutil.str( AV8cCfgComprobanteSistema, 2, 0)));
         }
         GXCCtl = "CFGCOMPROBANTESISTEMA_" + sGXsfl_44_idx ;
         cmbCfgComprobanteSistema.setName( GXCCtl );
         cmbCfgComprobanteSistema.setWebtags( "" );
         cmbCfgComprobanteSistema.addItem("1", "Ventas", (short)(0));
         cmbCfgComprobanteSistema.addItem("2", "Compras", (short)(0));
         cmbCfgComprobanteSistema.addItem("3", "Contable", (short)(0));
         cmbCfgComprobanteSistema.addItem("4", "Stock", (short)(0));
         if ( cmbCfgComprobanteSistema.getItemCount() > 0 )
         {
            A34CfgComprobanteSistema = (byte)(GXutil.lval( cmbCfgComprobanteSistema.getValidValue(GXutil.trim( GXutil.str( A34CfgComprobanteSistema, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteSistema.getInternalname(), GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_442( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         sendrow_442( ) ;
         nGXsfl_44_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_44_idx+1)) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cCfgComprobanteId ,
                                  short AV7cCfgComprobantePrefijo ,
                                  byte AV8cCfgComprobanteSistema )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0H2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0H2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0H2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(44) ;
      nGXsfl_44_idx = (short)(1) ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      nGXsfl_44_Refreshing = (short)(1) ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_442( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              new Byte(AV8cCfgComprobanteSistema) ,
                                              new Byte(A34CfgComprobanteSistema) ,
                                              A31CfgComprobanteId ,
                                              AV6cCfgComprobanteId ,
                                              new Short(A32CfgComprobantePrefijo) ,
                                              new Short(AV7cCfgComprobantePrefijo) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                              }
         } ) ;
         lV6cCfgComprobanteId = GXutil.concat( GXutil.rtrim( AV6cCfgComprobanteId), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cCfgComprobanteId", AV6cCfgComprobanteId);
         /* Using cursor H000H2 */
         pr_default.execute(0, new Object[] {lV6cCfgComprobanteId, new Short(AV7cCfgComprobantePrefijo), new Byte(AV8cCfgComprobanteSistema), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_44_idx = (short)(1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_442( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A34CfgComprobanteSistema = H000H2_A34CfgComprobanteSistema[0] ;
            httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteSistema.getInternalname(), GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
            A32CfgComprobantePrefijo = H000H2_A32CfgComprobantePrefijo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            A31CfgComprobanteId = H000H2_A31CfgComprobanteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteId_Internalname, A31CfgComprobanteId);
            /* Execute user event: Load */
            e160H2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(44) ;
         wb0H0( ) ;
      }
      nGXsfl_44_Refreshing = (short)(0) ;
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           new Byte(AV8cCfgComprobanteSistema) ,
                                           new Byte(A34CfgComprobanteSistema) ,
                                           A31CfgComprobanteId ,
                                           AV6cCfgComprobanteId ,
                                           new Short(A32CfgComprobantePrefijo) ,
                                           new Short(AV7cCfgComprobantePrefijo) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      } ) ;
      lV6cCfgComprobanteId = GXutil.concat( GXutil.rtrim( AV6cCfgComprobanteId), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cCfgComprobanteId", AV6cCfgComprobanteId);
      /* Using cursor H000H3 */
      pr_default.execute(1, new Object[] {lV6cCfgComprobanteId, new Short(AV7cCfgComprobantePrefijo), new Byte(AV8cCfgComprobanteSistema)});
      GRID1_nRecordCount = H000H3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteSistema) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteSistema) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteSistema) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteSistema) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteSistema) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0H0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e150H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cCfgComprobanteId = httpContext.cgiGet( edtavCcfgcomprobanteid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cCfgComprobanteId", AV6cCfgComprobanteId);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobanteprefijo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobanteprefijo_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFGCOMPROBANTEPREFIJO");
            GX_FocusControl = edtavCcfgcomprobanteprefijo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cCfgComprobantePrefijo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV7cCfgComprobantePrefijo, 4, 0)));
         }
         else
         {
            AV7cCfgComprobantePrefijo = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobanteprefijo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV7cCfgComprobantePrefijo, 4, 0)));
         }
         cmbavCcfgcomprobantesistema.setName( cmbavCcfgcomprobantesistema.getInternalname() );
         cmbavCcfgcomprobantesistema.setValue( httpContext.cgiGet( cmbavCcfgcomprobantesistema.getInternalname()) );
         AV8cCfgComprobanteSistema = (byte)(GXutil.lval( httpContext.cgiGet( cmbavCcfgcomprobantesistema.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cCfgComprobanteSistema", GXutil.ltrim( GXutil.str( AV8cCfgComprobanteSistema, 2, 0)));
         /* Read saved values. */
         nRC_GXsfl_44 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_44"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEID"), AV6cCfgComprobanteId) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEPREFIJO"), ",", ".") != AV7cCfgComprobantePrefijo )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTESISTEMA"), ",", ".") != AV8cCfgComprobanteSistema )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e150H2 ();
      if (returnInSub) return;
   }

   public void e150H2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Cfg Comprobante", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV11ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e160H2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV14Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_442( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ( nGXsfl_44_Refreshing == 0 ) )
      {
         httpContext.doAjaxLoad(44, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e170H2 ();
      if (returnInSub) return;
   }

   public void e170H2( )
   {
      /* Enter Routine */
      AV9pCfgComprobanteId = A31CfgComprobanteId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pCfgComprobanteId", AV9pCfgComprobanteId);
      AV10pCfgComprobantePrefijo = A32CfgComprobantePrefijo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV10pCfgComprobantePrefijo, 4, 0)));
      httpContext.setWebReturnParms(new Object[] {AV9pCfgComprobanteId,new Short(AV10pCfgComprobantePrefijo)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV9pCfgComprobanteId = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pCfgComprobanteId", AV9pCfgComprobanteId);
      AV10pCfgComprobantePrefijo = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV10pCfgComprobantePrefijo, 4, 0)));
   }

   public String getresponse( String sGXDynURL )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa0H2( ) ;
      ws0H2( ) ;
      we0H2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1731551");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721917322672");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx00b0.js", "?201721917322672");
      /* End function include_jscripts */
   }

   public void subsflControlProps_442( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_44_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_44_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_44_idx ;
      cmbCfgComprobanteSistema.setInternalname( "CFGCOMPROBANTESISTEMA_"+sGXsfl_44_idx );
   }

   public void subsflControlProps_fel_442( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_44_fel_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_44_fel_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_44_fel_idx ;
      cmbCfgComprobanteSistema.setInternalname( "CFGCOMPROBANTESISTEMA_"+sGXsfl_44_fel_idx );
   }

   public void sendrow_442( )
   {
      subsflControlProps_442( ) ;
      wb0H0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_44_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_44_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A31CfgComprobanteId)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV14Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV14Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteId_Internalname,A31CfgComprobanteId,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobanteId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(44),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"IdCfgComprobanteId","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobantePrefijo_Internalname,GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A32CfgComprobantePrefijo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobantePrefijo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(44),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobantePrefijo","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_44_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CFGCOMPROBANTESISTEMA_" + sGXsfl_44_idx ;
            cmbCfgComprobanteSistema.setName( GXCCtl );
            cmbCfgComprobanteSistema.setWebtags( "" );
            cmbCfgComprobanteSistema.addItem("1", "Ventas", (short)(0));
            cmbCfgComprobanteSistema.addItem("2", "Compras", (short)(0));
            cmbCfgComprobanteSistema.addItem("3", "Contable", (short)(0));
            cmbCfgComprobanteSistema.addItem("4", "Stock", (short)(0));
            if ( cmbCfgComprobanteSistema.getItemCount() > 0 )
            {
               A34CfgComprobanteSistema = (byte)(GXutil.lval( cmbCfgComprobanteSistema.getValidValue(GXutil.trim( GXutil.str( A34CfgComprobanteSistema, 2, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteSistema.getInternalname(), GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCfgComprobanteSistema,cmbCfgComprobanteSistema.getInternalname(),GXutil.trim( GXutil.str( A34CfgComprobanteSistema, 2, 0)),new Integer(1),cmbCfgComprobanteSistema.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbCfgComprobanteSistema.setValue( GXutil.trim( GXutil.str( A34CfgComprobanteSistema, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteSistema.getInternalname(), "Values", cmbCfgComprobanteSistema.ToJavascriptSource());
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_44_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_44_idx+1)) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      /* End function sendrow_442 */
   }

   public void init_default_properties( )
   {
      lblLblcfgcomprobanteidfilter_Internalname = "LBLCFGCOMPROBANTEIDFILTER" ;
      edtavCcfgcomprobanteid_Internalname = "vCCFGCOMPROBANTEID" ;
      divCfgcomprobanteidfiltercontainer_Internalname = "CFGCOMPROBANTEIDFILTERCONTAINER" ;
      lblLblcfgcomprobanteprefijofilter_Internalname = "LBLCFGCOMPROBANTEPREFIJOFILTER" ;
      edtavCcfgcomprobanteprefijo_Internalname = "vCCFGCOMPROBANTEPREFIJO" ;
      divCfgcomprobanteprefijofiltercontainer_Internalname = "CFGCOMPROBANTEPREFIJOFILTERCONTAINER" ;
      lblLblcfgcomprobantesistemafilter_Internalname = "LBLCFGCOMPROBANTESISTEMAFILTER" ;
      cmbavCcfgcomprobantesistema.setInternalname( "vCCFGCOMPROBANTESISTEMA" );
      divCfgcomprobantesistemafiltercontainer_Internalname = "CFGCOMPROBANTESISTEMAFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID" ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO" ;
      cmbCfgComprobanteSistema.setInternalname( "CFGCOMPROBANTESISTEMA" );
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      cmbCfgComprobanteSistema.setJsonclick( "" );
      edtCfgComprobantePrefijo_Jsonclick = "" ;
      edtCfgComprobanteId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCcfgcomprobantesistema.setJsonclick( "" );
      cmbavCcfgcomprobantesistema.setEnabled( 1 );
      cmbavCcfgcomprobantesistema.setVisible( 1 );
      edtavCcfgcomprobanteprefijo_Jsonclick = "" ;
      edtavCcfgcomprobanteprefijo_Enabled = 1 ;
      edtavCcfgcomprobanteprefijo_Visible = 1 ;
      edtavCcfgcomprobanteid_Jsonclick = "" ;
      edtavCcfgcomprobanteid_Enabled = 1 ;
      edtavCcfgcomprobanteid_Visible = 1 ;
      divCfgcomprobantesistemafiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobanteprefijofiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobanteidfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Cfg Comprobante" );
      subGrid1_Rows = 10 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantesistema'},{av:'AV8cCfgComprobanteSistema',fld:'vCCFGCOMPROBANTESISTEMA'}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e140H1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEIDFILTER.CLICK","{handler:'e110H1',iparms:[{av:'divCfgcomprobanteidfiltercontainer_Class',ctrl:'CFGCOMPROBANTEIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobanteidfiltercontainer_Class',ctrl:'CFGCOMPROBANTEIDFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobanteid_Visible',ctrl:'vCCFGCOMPROBANTEID',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEPREFIJOFILTER.CLICK","{handler:'e120H1',iparms:[{av:'divCfgcomprobanteprefijofiltercontainer_Class',ctrl:'CFGCOMPROBANTEPREFIJOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobanteprefijofiltercontainer_Class',ctrl:'CFGCOMPROBANTEPREFIJOFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobanteprefijo_Visible',ctrl:'vCCFGCOMPROBANTEPREFIJO',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTESISTEMAFILTER.CLICK","{handler:'e130H1',iparms:[{av:'divCfgcomprobantesistemafiltercontainer_Class',ctrl:'CFGCOMPROBANTESISTEMAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantesistemafiltercontainer_Class',ctrl:'CFGCOMPROBANTESISTEMAFILTERCONTAINER',prop:'Class'},{av:'cmbavCcfgcomprobantesistema'}]}");
      setEventMetadata("ENTER","{handler:'e170H2',iparms:[{av:'A31CfgComprobanteId',fld:'CFGCOMPROBANTEID'},{av:'A32CfgComprobantePrefijo',fld:'CFGCOMPROBANTEPREFIJO'}],oparms:[{av:'AV9pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID'},{av:'AV10pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantesistema'},{av:'AV8cCfgComprobanteSistema',fld:'vCCFGCOMPROBANTESISTEMA'}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantesistema'},{av:'AV8cCfgComprobanteSistema',fld:'vCCFGCOMPROBANTESISTEMA'}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantesistema'},{av:'AV8cCfgComprobanteSistema',fld:'vCCFGCOMPROBANTESISTEMA'}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantesistema'},{av:'AV8cCfgComprobanteSistema',fld:'vCCFGCOMPROBANTESISTEMA'}],oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6cCfgComprobanteId = "" ;
      AV9pCfgComprobanteId = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblcfgcomprobanteidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblcfgcomprobanteprefijofilter_Jsonclick = "" ;
      lblLblcfgcomprobantesistemafilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A31CfgComprobanteId = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Linkselection_GXI = "" ;
      GXKey = "" ;
      GXCCtl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV6cCfgComprobanteId = "" ;
      H000H2_A34CfgComprobanteSistema = new byte[1] ;
      H000H2_A32CfgComprobantePrefijo = new short[1] ;
      H000H2_A31CfgComprobanteId = new String[] {""} ;
      H000H3_AGRID1_nRecordCount = new long[1] ;
      AV11ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx00b0__default(),
         new Object[] {
             new Object[] {
            H000H2_A34CfgComprobanteSistema, H000H2_A32CfgComprobantePrefijo, H000H2_A31CfgComprobanteId
            }
            , new Object[] {
            H000H3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV8cCfgComprobanteSistema ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte A34CfgComprobanteSistema ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_44 ;
   private short nGXsfl_44_idx=1 ;
   private short AV7cCfgComprobantePrefijo ;
   private short AV10pCfgComprobantePrefijo ;
   private short wbEnd ;
   private short wbStart ;
   private short A32CfgComprobantePrefijo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_44_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int edtavCcfgcomprobanteid_Visible ;
   private int edtavCcfgcomprobanteid_Enabled ;
   private int edtavCcfgcomprobanteprefijo_Enabled ;
   private int edtavCcfgcomprobanteprefijo_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divCfgcomprobanteidfiltercontainer_Class ;
   private String divCfgcomprobanteprefijofiltercontainer_Class ;
   private String divCfgcomprobantesistemafiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_44_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divCfgcomprobanteidfiltercontainer_Internalname ;
   private String lblLblcfgcomprobanteidfilter_Internalname ;
   private String lblLblcfgcomprobanteidfilter_Jsonclick ;
   private String edtavCcfgcomprobanteid_Internalname ;
   private String TempTags ;
   private String edtavCcfgcomprobanteid_Jsonclick ;
   private String divCfgcomprobanteprefijofiltercontainer_Internalname ;
   private String lblLblcfgcomprobanteprefijofilter_Internalname ;
   private String lblLblcfgcomprobanteprefijofilter_Jsonclick ;
   private String edtavCcfgcomprobanteprefijo_Internalname ;
   private String edtavCcfgcomprobanteprefijo_Jsonclick ;
   private String divCfgcomprobantesistemafiltercontainer_Internalname ;
   private String lblLblcfgcomprobantesistemafilter_Internalname ;
   private String lblLblcfgcomprobantesistemafilter_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtCfgComprobanteId_Internalname ;
   private String edtCfgComprobantePrefijo_Internalname ;
   private String GXKey ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV11ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtCfgComprobanteId_Jsonclick ;
   private String edtCfgComprobantePrefijo_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV6cCfgComprobanteId ;
   private String AV9pCfgComprobanteId ;
   private String A31CfgComprobanteId ;
   private String AV14Linkselection_GXI ;
   private String lV6cCfgComprobanteId ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCcfgcomprobantesistema ;
   private HTMLChoice cmbCfgComprobanteSistema ;
   private IDataStoreProvider pr_default ;
   private byte[] H000H2_A34CfgComprobanteSistema ;
   private short[] H000H2_A32CfgComprobantePrefijo ;
   private String[] H000H2_A31CfgComprobanteId ;
   private long[] H000H3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00b0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          byte AV8cCfgComprobanteSistema ,
                                          byte A34CfgComprobanteSistema ,
                                          String A31CfgComprobanteId ,
                                          String AV6cCfgComprobanteId ,
                                          short A32CfgComprobantePrefijo ,
                                          short AV7cCfgComprobantePrefijo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [6] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " CfgComprobanteSistema, CfgComprobantePrefijo, CfgComprobanteId" ;
      sFromString = " FROM CfgComprobante" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (CfgComprobanteId like ?)" ;
      sWhereString = sWhereString + " and (CfgComprobantePrefijo >= ?)" ;
      if ( ! (0==AV8cCfgComprobanteSistema) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteSistema >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY CfgComprobanteId, CfgComprobantePrefijo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          byte AV8cCfgComprobanteSistema ,
                                          byte A34CfgComprobanteSistema ,
                                          String A31CfgComprobanteId ,
                                          String AV6cCfgComprobanteId ,
                                          short A32CfgComprobantePrefijo ,
                                          short AV7cCfgComprobantePrefijo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [3] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM CfgComprobante" ;
      scmdbuf = scmdbuf + " WHERE (CfgComprobanteId like ?)" ;
      scmdbuf = scmdbuf + " and (CfgComprobantePrefijo >= ?)" ;
      if ( ! (0==AV8cCfgComprobanteSistema) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteSistema >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H000H2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() );
            case 1 :
                  return conditional_H000H3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[5]).byteValue());
               }
               return;
      }
   }

}

