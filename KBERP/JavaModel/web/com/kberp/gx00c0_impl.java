/*
               File: gx00c0_impl
        Description: Selection List Detalle
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:32:29.52
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

public final  class gx00c0_impl extends GXDataArea
{
   public gx00c0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00c0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00c0_impl.class ));
   }

   public gx00c0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCcfgcomprobantedetalleletra = new HTMLChoice();
      cmbCfgComprobanteDetalleLetra = new HTMLChoice();
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
            nRC_GXsfl_74 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_74_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_74_idx = httpContext.GetNextPar( ) ;
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
            AV8cCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cCfgComprobanteDetalleNroDesde = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10cCfgComprobanteDetalleNroHasta = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11cCfgComprobanteDetalleNroUltimo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteDetalleLetra, AV9cCfgComprobanteDetalleNroDesde, AV10cCfgComprobanteDetalleNroHasta, AV11cCfgComprobanteDetalleNroUltimo) ;
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
            AV12pCfgComprobanteId = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12pCfgComprobanteId", AV12pCfgComprobanteId);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV13pCfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV13pCfgComprobantePrefijo, 4, 0)));
               AV14pCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV14pCfgComprobanteDetalleLetra, 2, 0)));
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
      pa0O2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0O2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721917322961");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx00c0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV12pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pCfgComprobantePrefijo,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pCfgComprobanteDetalleLetra,2,0)))+"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEDETALLELETRA", GXutil.ltrim( localUtil.ntoc( AV8cCfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEDETALLENRODESDE", GXutil.ltrim( localUtil.ntoc( AV9cCfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEDETALLENROHASTA", GXutil.ltrim( localUtil.ntoc( AV10cCfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEDETALLENROULTIMO", GXutil.ltrim( localUtil.ntoc( AV11cCfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", "")));
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEID", AV12pCfgComprobanteId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEPREFIJO", GXutil.ltrim( localUtil.ntoc( AV13pCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEDETALLELETRA", GXutil.ltrim( localUtil.ntoc( AV14pCfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEIDFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobanteidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEPREFIJOFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobanteprefijofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobantedetalleletrafiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEDETALLENRODESDEFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobantedetallenrodesdefiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEDETALLENROHASTAFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobantedetallenrohastafiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEDETALLENROULTIMOFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobantedetallenroultimofiltercontainer_Class));
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
         we0O2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0O2( ) ;
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
      return formatLink("com.kberp.gx00c0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV12pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pCfgComprobantePrefijo,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pCfgComprobanteDetalleLetra,2,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00C0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Detalle" ;
   }

   public void wb0O0( )
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobanteidfilter_Internalname, "Cfg Comprobante Id", "", "", lblLblcfgcomprobanteidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobanteid_Internalname, AV6cCfgComprobanteId, GXutil.rtrim( localUtil.format( AV6cCfgComprobanteId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobanteid_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobanteid_Visible, edtavCcfgcomprobanteid_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00C0.htm");
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobanteprefijofilter_Internalname, "Cfg Comprobante Prefijo", "", "", lblLblcfgcomprobanteprefijofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobanteprefijo_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")), ((edtavCcfgcomprobanteprefijo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cCfgComprobantePrefijo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cCfgComprobantePrefijo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobanteprefijo_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobanteprefijo_Visible, edtavCcfgcomprobanteprefijo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00C0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divCfgcomprobantedetalleletrafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCfgcomprobantedetalleletrafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantedetalleletrafilter_Internalname, "Cfg Comprobante Detalle Letra", "", "", lblLblcfgcomprobantedetalleletrafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, cmbavCcfgcomprobantedetalleletra.getInternalname(), "Cfg Comprobante Detalle Letra", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         /* ComboBox */
         com.kberp.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCcfgcomprobantedetalleletra, cmbavCcfgcomprobantedetalleletra.getInternalname(), GXutil.trim( GXutil.str( AV8cCfgComprobanteDetalleLetra, 2, 0)), 1, cmbavCcfgcomprobantedetalleletra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavCcfgcomprobantedetalleletra.getVisible(), cmbavCcfgcomprobantedetalleletra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, "HLP_Gx00C0.htm");
         cmbavCcfgcomprobantedetalleletra.setValue( GXutil.trim( GXutil.str( AV8cCfgComprobanteDetalleLetra, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCcfgcomprobantedetalleletra.getInternalname(), "Values", cmbavCcfgcomprobantedetalleletra.ToJavascriptSource());
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divCfgcomprobantedetallenrodesdefiltercontainer_Internalname, 1, 0, "px", 0, "px", divCfgcomprobantedetallenrodesdefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantedetallenrodesdefilter_Internalname, "Cfg Comprobante Detalle Nro Desde", "", "", lblLblcfgcomprobantedetallenrodesdefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcfgcomprobantedetallenrodesde_Internalname, "Cfg Comprobante Detalle Nro Desde", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobantedetallenrodesde_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cCfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", "")), ((edtavCcfgcomprobantedetallenrodesde_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cCfgComprobanteDetalleNroDesde), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cCfgComprobanteDetalleNroDesde), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobantedetallenrodesde_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobantedetallenrodesde_Visible, edtavCcfgcomprobantedetallenrodesde_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00C0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divCfgcomprobantedetallenrohastafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCfgcomprobantedetallenrohastafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantedetallenrohastafilter_Internalname, "Cfg Comprobante Detalle Nro Hasta", "", "", lblLblcfgcomprobantedetallenrohastafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcfgcomprobantedetallenrohasta_Internalname, "Cfg Comprobante Detalle Nro Hasta", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobantedetallenrohasta_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cCfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", "")), ((edtavCcfgcomprobantedetallenrohasta_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cCfgComprobanteDetalleNroHasta), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cCfgComprobanteDetalleNroHasta), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobantedetallenrohasta_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobantedetallenrohasta_Visible, edtavCcfgcomprobantedetallenrohasta_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00C0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divCfgcomprobantedetallenroultimofiltercontainer_Internalname, 1, 0, "px", 0, "px", divCfgcomprobantedetallenroultimofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantedetallenroultimofilter_Internalname, "Cfg Comprobante Detalle Nro Ultimo", "", "", lblLblcfgcomprobantedetallenroultimofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcfgcomprobantedetallenroultimo_Internalname, "Cfg Comprobante Detalle Nro Ultimo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobantedetallenroultimo_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cCfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", "")), ((edtavCcfgcomprobantedetallenroultimo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11cCfgComprobanteDetalleNroUltimo), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11cCfgComprobanteDetalleNroUltimo), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobantedetallenroultimo_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobantedetallenroultimo_Visible, edtavCcfgcomprobantedetallenroultimo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00C0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e170o1_client"+"'", TempTags, "", 2, "HLP_Gx00C0.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"74\">") ;
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
            httpContext.writeValue( "Cfg Comprobante Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cfg Comprobante Prefijo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Detalle Letra") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nro Desde") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtCfgComprobanteDetalleNroDesde_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 74 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_74 = (short)(nGXsfl_74_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00C0.htm");
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

   public void start0O2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_2-109402", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Detalle", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0O0( ) ;
   }

   public void ws0O2( )
   {
      start0O2( ) ;
      evt0O2( ) ;
   }

   public void evt0O2( )
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
                           nGXsfl_74_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_742( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))));
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection));
                           A31CfgComprobanteId = httpContext.cgiGet( edtCfgComprobanteId_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteId_Internalname, A31CfgComprobanteId);
                           A32CfgComprobantePrefijo = (short)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobantePrefijo_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
                           cmbCfgComprobanteDetalleLetra.setName( cmbCfgComprobanteDetalleLetra.getInternalname() );
                           cmbCfgComprobanteDetalleLetra.setValue( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()) );
                           A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
                           A36CfgComprobanteDetalleNroDesde = (int)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroDesde_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroDesde_Internalname, GXutil.ltrim( GXutil.str( A36CfgComprobanteDetalleNroDesde, 8, 0)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e180O2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e190O2 ();
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
                                    /* Set Refresh If Ccfgcomprobantedetalleletra Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLELETRA"), ",", ".") != AV8cCfgComprobanteDetalleLetra )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobantedetallenrodesde Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENRODESDE"), ",", ".") != AV9cCfgComprobanteDetalleNroDesde )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobantedetallenrohasta Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENROHASTA"), ",", ".") != AV10cCfgComprobanteDetalleNroHasta )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobantedetallenroultimo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENROULTIMO"), ",", ".") != AV11cCfgComprobanteDetalleNroUltimo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e200O2 ();
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

   public void we0O2( )
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

   public void pa0O2( )
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
         cmbavCcfgcomprobantedetalleletra.setName( "vCCFGCOMPROBANTEDETALLELETRA" );
         cmbavCcfgcomprobantedetalleletra.setWebtags( "" );
         cmbavCcfgcomprobantedetalleletra.addItem("1", "A", (short)(0));
         cmbavCcfgcomprobantedetalleletra.addItem("2", "B", (short)(0));
         cmbavCcfgcomprobantedetalleletra.addItem("3", "C", (short)(0));
         cmbavCcfgcomprobantedetalleletra.addItem("4", "E", (short)(0));
         cmbavCcfgcomprobantedetalleletra.addItem("5", "M", (short)(0));
         cmbavCcfgcomprobantedetalleletra.addItem("6", "R", (short)(0));
         cmbavCcfgcomprobantedetalleletra.addItem("7", "X", (short)(0));
         if ( cmbavCcfgcomprobantedetalleletra.getItemCount() > 0 )
         {
            AV8cCfgComprobanteDetalleLetra = (byte)(GXutil.lval( cmbavCcfgcomprobantedetalleletra.getValidValue(GXutil.trim( GXutil.str( AV8cCfgComprobanteDetalleLetra, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV8cCfgComprobanteDetalleLetra, 2, 0)));
         }
         GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_74_idx ;
         cmbCfgComprobanteDetalleLetra.setName( GXCCtl );
         cmbCfgComprobanteDetalleLetra.setWebtags( "" );
         cmbCfgComprobanteDetalleLetra.addItem("1", "A", (short)(0));
         cmbCfgComprobanteDetalleLetra.addItem("2", "B", (short)(0));
         cmbCfgComprobanteDetalleLetra.addItem("3", "C", (short)(0));
         cmbCfgComprobanteDetalleLetra.addItem("4", "E", (short)(0));
         cmbCfgComprobanteDetalleLetra.addItem("5", "M", (short)(0));
         cmbCfgComprobanteDetalleLetra.addItem("6", "R", (short)(0));
         cmbCfgComprobanteDetalleLetra.addItem("7", "X", (short)(0));
         if ( cmbCfgComprobanteDetalleLetra.getItemCount() > 0 )
         {
            A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( cmbCfgComprobanteDetalleLetra.getValidValue(GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
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
      subsflControlProps_742( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         sendrow_742( ) ;
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cCfgComprobanteId ,
                                  short AV7cCfgComprobantePrefijo ,
                                  byte AV8cCfgComprobanteDetalleLetra ,
                                  int AV9cCfgComprobanteDetalleNroDesde ,
                                  int AV10cCfgComprobanteDetalleNroHasta ,
                                  int AV11cCfgComprobanteDetalleNroUltimo )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0O2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0O2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0O2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(74) ;
      nGXsfl_74_idx = (short)(1) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_742( ) ;
      nGXsfl_74_Refreshing = (short)(1) ;
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
         subsflControlProps_742( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              new Integer(AV9cCfgComprobanteDetalleNroDesde) ,
                                              new Integer(AV10cCfgComprobanteDetalleNroHasta) ,
                                              new Integer(AV11cCfgComprobanteDetalleNroUltimo) ,
                                              new Integer(A36CfgComprobanteDetalleNroDesde) ,
                                              new Integer(A37CfgComprobanteDetalleNroHasta) ,
                                              new Integer(A38CfgComprobanteDetalleNroUltimo) ,
                                              A31CfgComprobanteId ,
                                              AV6cCfgComprobanteId ,
                                              new Short(A32CfgComprobantePrefijo) ,
                                              new Short(AV7cCfgComprobantePrefijo) ,
                                              new Byte(A35CfgComprobanteDetalleLetra) ,
                                              new Byte(AV8cCfgComprobanteDetalleLetra) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.BYTE, TypeConstants.BYTE
                                              }
         } ) ;
         lV6cCfgComprobanteId = GXutil.concat( GXutil.rtrim( AV6cCfgComprobanteId), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cCfgComprobanteId", AV6cCfgComprobanteId);
         /* Using cursor H000O2 */
         pr_default.execute(0, new Object[] {lV6cCfgComprobanteId, new Short(AV7cCfgComprobantePrefijo), new Byte(AV8cCfgComprobanteDetalleLetra), new Integer(AV9cCfgComprobanteDetalleNroDesde), new Integer(AV10cCfgComprobanteDetalleNroHasta), new Integer(AV11cCfgComprobanteDetalleNroUltimo), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_74_idx = (short)(1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A38CfgComprobanteDetalleNroUltimo = H000O2_A38CfgComprobanteDetalleNroUltimo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A38CfgComprobanteDetalleNroUltimo", GXutil.ltrim( GXutil.str( A38CfgComprobanteDetalleNroUltimo, 8, 0)));
            A37CfgComprobanteDetalleNroHasta = H000O2_A37CfgComprobanteDetalleNroHasta[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A37CfgComprobanteDetalleNroHasta", GXutil.ltrim( GXutil.str( A37CfgComprobanteDetalleNroHasta, 8, 0)));
            A36CfgComprobanteDetalleNroDesde = H000O2_A36CfgComprobanteDetalleNroDesde[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroDesde_Internalname, GXutil.ltrim( GXutil.str( A36CfgComprobanteDetalleNroDesde, 8, 0)));
            A35CfgComprobanteDetalleLetra = H000O2_A35CfgComprobanteDetalleLetra[0] ;
            httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
            A32CfgComprobantePrefijo = H000O2_A32CfgComprobantePrefijo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            A31CfgComprobanteId = H000O2_A31CfgComprobanteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteId_Internalname, A31CfgComprobanteId);
            /* Execute user event: Load */
            e190O2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(74) ;
         wb0O0( ) ;
      }
      nGXsfl_74_Refreshing = (short)(0) ;
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
                                           new Integer(AV9cCfgComprobanteDetalleNroDesde) ,
                                           new Integer(AV10cCfgComprobanteDetalleNroHasta) ,
                                           new Integer(AV11cCfgComprobanteDetalleNroUltimo) ,
                                           new Integer(A36CfgComprobanteDetalleNroDesde) ,
                                           new Integer(A37CfgComprobanteDetalleNroHasta) ,
                                           new Integer(A38CfgComprobanteDetalleNroUltimo) ,
                                           A31CfgComprobanteId ,
                                           AV6cCfgComprobanteId ,
                                           new Short(A32CfgComprobantePrefijo) ,
                                           new Short(AV7cCfgComprobantePrefijo) ,
                                           new Byte(A35CfgComprobanteDetalleLetra) ,
                                           new Byte(AV8cCfgComprobanteDetalleLetra) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      } ) ;
      lV6cCfgComprobanteId = GXutil.concat( GXutil.rtrim( AV6cCfgComprobanteId), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cCfgComprobanteId", AV6cCfgComprobanteId);
      /* Using cursor H000O3 */
      pr_default.execute(1, new Object[] {lV6cCfgComprobanteId, new Short(AV7cCfgComprobantePrefijo), new Byte(AV8cCfgComprobanteDetalleLetra), new Integer(AV9cCfgComprobanteDetalleNroDesde), new Integer(AV10cCfgComprobanteDetalleNroHasta), new Integer(AV11cCfgComprobanteDetalleNroUltimo)});
      GRID1_nRecordCount = H000O3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteDetalleLetra, AV9cCfgComprobanteDetalleNroDesde, AV10cCfgComprobanteDetalleNroHasta, AV11cCfgComprobanteDetalleNroUltimo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteDetalleLetra, AV9cCfgComprobanteDetalleNroDesde, AV10cCfgComprobanteDetalleNroHasta, AV11cCfgComprobanteDetalleNroUltimo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteDetalleLetra, AV9cCfgComprobanteDetalleNroDesde, AV10cCfgComprobanteDetalleNroHasta, AV11cCfgComprobanteDetalleNroUltimo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteDetalleLetra, AV9cCfgComprobanteDetalleNroDesde, AV10cCfgComprobanteDetalleNroHasta, AV11cCfgComprobanteDetalleNroUltimo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteId, AV7cCfgComprobantePrefijo, AV8cCfgComprobanteDetalleLetra, AV9cCfgComprobanteDetalleNroDesde, AV10cCfgComprobanteDetalleNroHasta, AV11cCfgComprobanteDetalleNroUltimo) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0O0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e180O2 ();
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
         cmbavCcfgcomprobantedetalleletra.setName( cmbavCcfgcomprobantedetalleletra.getInternalname() );
         cmbavCcfgcomprobantedetalleletra.setValue( httpContext.cgiGet( cmbavCcfgcomprobantedetalleletra.getInternalname()) );
         AV8cCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.cgiGet( cmbavCcfgcomprobantedetalleletra.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV8cCfgComprobanteDetalleLetra, 2, 0)));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrodesde_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrodesde_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFGCOMPROBANTEDETALLENRODESDE");
            GX_FocusControl = edtavCcfgcomprobantedetallenrodesde_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cCfgComprobanteDetalleNroDesde = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cCfgComprobanteDetalleNroDesde", GXutil.ltrim( GXutil.str( AV9cCfgComprobanteDetalleNroDesde, 8, 0)));
         }
         else
         {
            AV9cCfgComprobanteDetalleNroDesde = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrodesde_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cCfgComprobanteDetalleNroDesde", GXutil.ltrim( GXutil.str( AV9cCfgComprobanteDetalleNroDesde, 8, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrohasta_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrohasta_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFGCOMPROBANTEDETALLENROHASTA");
            GX_FocusControl = edtavCcfgcomprobantedetallenrohasta_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cCfgComprobanteDetalleNroHasta = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCfgComprobanteDetalleNroHasta", GXutil.ltrim( GXutil.str( AV10cCfgComprobanteDetalleNroHasta, 8, 0)));
         }
         else
         {
            AV10cCfgComprobanteDetalleNroHasta = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrohasta_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCfgComprobanteDetalleNroHasta", GXutil.ltrim( GXutil.str( AV10cCfgComprobanteDetalleNroHasta, 8, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenroultimo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenroultimo_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFGCOMPROBANTEDETALLENROULTIMO");
            GX_FocusControl = edtavCcfgcomprobantedetallenroultimo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cCfgComprobanteDetalleNroUltimo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cCfgComprobanteDetalleNroUltimo", GXutil.ltrim( GXutil.str( AV11cCfgComprobanteDetalleNroUltimo, 8, 0)));
         }
         else
         {
            AV11cCfgComprobanteDetalleNroUltimo = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenroultimo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cCfgComprobanteDetalleNroUltimo", GXutil.ltrim( GXutil.str( AV11cCfgComprobanteDetalleNroUltimo, 8, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_74 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), ",", ".")) ;
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
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLELETRA"), ",", ".") != AV8cCfgComprobanteDetalleLetra )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENRODESDE"), ",", ".") != AV9cCfgComprobanteDetalleNroDesde )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENROHASTA"), ",", ".") != AV10cCfgComprobanteDetalleNroHasta )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENROULTIMO"), ",", ".") != AV11cCfgComprobanteDetalleNroUltimo )
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
      e180O2 ();
      if (returnInSub) return;
   }

   public void e180O2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Detalle", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV15ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e190O2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV18Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_742( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ( nGXsfl_74_Refreshing == 0 ) )
      {
         httpContext.doAjaxLoad(74, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e200O2 ();
      if (returnInSub) return;
   }

   public void e200O2( )
   {
      /* Enter Routine */
      AV12pCfgComprobanteId = A31CfgComprobanteId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pCfgComprobanteId", AV12pCfgComprobanteId);
      AV13pCfgComprobantePrefijo = A32CfgComprobantePrefijo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV13pCfgComprobantePrefijo, 4, 0)));
      AV14pCfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV14pCfgComprobanteDetalleLetra, 2, 0)));
      httpContext.setWebReturnParms(new Object[] {AV12pCfgComprobanteId,new Short(AV13pCfgComprobantePrefijo),new Byte(AV14pCfgComprobanteDetalleLetra)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV12pCfgComprobanteId = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pCfgComprobanteId", AV12pCfgComprobanteId);
      AV13pCfgComprobantePrefijo = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV13pCfgComprobantePrefijo, 4, 0)));
      AV14pCfgComprobanteDetalleLetra = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV14pCfgComprobanteDetalleLetra, 2, 0)));
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
      pa0O2( ) ;
      ws0O2( ) ;
      we0O2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721917323139");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx00c0.js", "?201721917323139");
      /* End function include_jscripts */
   }

   public void subsflControlProps_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_74_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_74_idx ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_74_idx );
      edtCfgComprobanteDetalleNroDesde_Internalname = "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_fel_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_74_fel_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_74_fel_idx ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_74_fel_idx );
      edtCfgComprobanteDetalleNroDesde_Internalname = "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_74_fel_idx ;
   }

   public void sendrow_742( )
   {
      subsflControlProps_742( ) ;
      wb0O0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_74_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_74_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A31CfgComprobanteId)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV18Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteId_Internalname,A31CfgComprobanteId,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobanteId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"IdCfgComprobanteId","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobantePrefijo_Internalname,GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A32CfgComprobantePrefijo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobantePrefijo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobantePrefijo","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_74_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_74_idx ;
            cmbCfgComprobanteDetalleLetra.setName( GXCCtl );
            cmbCfgComprobanteDetalleLetra.setWebtags( "" );
            cmbCfgComprobanteDetalleLetra.addItem("1", "A", (short)(0));
            cmbCfgComprobanteDetalleLetra.addItem("2", "B", (short)(0));
            cmbCfgComprobanteDetalleLetra.addItem("3", "C", (short)(0));
            cmbCfgComprobanteDetalleLetra.addItem("4", "E", (short)(0));
            cmbCfgComprobanteDetalleLetra.addItem("5", "M", (short)(0));
            cmbCfgComprobanteDetalleLetra.addItem("6", "R", (short)(0));
            cmbCfgComprobanteDetalleLetra.addItem("7", "X", (short)(0));
            if ( cmbCfgComprobanteDetalleLetra.getItemCount() > 0 )
            {
               A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( cmbCfgComprobanteDetalleLetra.getValidValue(GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCfgComprobanteDetalleLetra,cmbCfgComprobanteDetalleLetra.getInternalname(),GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)),new Integer(1),cmbCfgComprobanteDetalleLetra.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn","","",new Boolean(true)});
         cmbCfgComprobanteDetalleLetra.setValue( GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Values", cmbCfgComprobanteDetalleLetra.ToJavascriptSource());
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtCfgComprobanteDetalleNroDesde_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A31CfgComprobanteId)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteDetalleNroDesde_Internalname, "Link", edtCfgComprobanteDetalleNroDesde_Link);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteDetalleNroDesde_Internalname,GXutil.ltrim( localUtil.ntoc( A36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A36CfgComprobanteDetalleNroDesde), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtCfgComprobanteDetalleNroDesde_Link,"","","",edtCfgComprobanteDetalleNroDesde_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobanteNumero","right"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      /* End function sendrow_742 */
   }

   public void init_default_properties( )
   {
      lblLblcfgcomprobanteidfilter_Internalname = "LBLCFGCOMPROBANTEIDFILTER" ;
      edtavCcfgcomprobanteid_Internalname = "vCCFGCOMPROBANTEID" ;
      divCfgcomprobanteidfiltercontainer_Internalname = "CFGCOMPROBANTEIDFILTERCONTAINER" ;
      lblLblcfgcomprobanteprefijofilter_Internalname = "LBLCFGCOMPROBANTEPREFIJOFILTER" ;
      edtavCcfgcomprobanteprefijo_Internalname = "vCCFGCOMPROBANTEPREFIJO" ;
      divCfgcomprobanteprefijofiltercontainer_Internalname = "CFGCOMPROBANTEPREFIJOFILTERCONTAINER" ;
      lblLblcfgcomprobantedetalleletrafilter_Internalname = "LBLCFGCOMPROBANTEDETALLELETRAFILTER" ;
      cmbavCcfgcomprobantedetalleletra.setInternalname( "vCCFGCOMPROBANTEDETALLELETRA" );
      divCfgcomprobantedetalleletrafiltercontainer_Internalname = "CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER" ;
      lblLblcfgcomprobantedetallenrodesdefilter_Internalname = "LBLCFGCOMPROBANTEDETALLENRODESDEFILTER" ;
      edtavCcfgcomprobantedetallenrodesde_Internalname = "vCCFGCOMPROBANTEDETALLENRODESDE" ;
      divCfgcomprobantedetallenrodesdefiltercontainer_Internalname = "CFGCOMPROBANTEDETALLENRODESDEFILTERCONTAINER" ;
      lblLblcfgcomprobantedetallenrohastafilter_Internalname = "LBLCFGCOMPROBANTEDETALLENROHASTAFILTER" ;
      edtavCcfgcomprobantedetallenrohasta_Internalname = "vCCFGCOMPROBANTEDETALLENROHASTA" ;
      divCfgcomprobantedetallenrohastafiltercontainer_Internalname = "CFGCOMPROBANTEDETALLENROHASTAFILTERCONTAINER" ;
      lblLblcfgcomprobantedetallenroultimofilter_Internalname = "LBLCFGCOMPROBANTEDETALLENROULTIMOFILTER" ;
      edtavCcfgcomprobantedetallenroultimo_Internalname = "vCCFGCOMPROBANTEDETALLENROULTIMO" ;
      divCfgcomprobantedetallenroultimofiltercontainer_Internalname = "CFGCOMPROBANTEDETALLENROULTIMOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID" ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO" ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA" );
      edtCfgComprobanteDetalleNroDesde_Internalname = "CFGCOMPROBANTEDETALLENRODESDE" ;
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
      edtCfgComprobanteDetalleNroDesde_Jsonclick = "" ;
      cmbCfgComprobanteDetalleLetra.setJsonclick( "" );
      edtCfgComprobantePrefijo_Jsonclick = "" ;
      edtCfgComprobanteId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtCfgComprobanteDetalleNroDesde_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCcfgcomprobantedetallenroultimo_Jsonclick = "" ;
      edtavCcfgcomprobantedetallenroultimo_Enabled = 1 ;
      edtavCcfgcomprobantedetallenroultimo_Visible = 1 ;
      edtavCcfgcomprobantedetallenrohasta_Jsonclick = "" ;
      edtavCcfgcomprobantedetallenrohasta_Enabled = 1 ;
      edtavCcfgcomprobantedetallenrohasta_Visible = 1 ;
      edtavCcfgcomprobantedetallenrodesde_Jsonclick = "" ;
      edtavCcfgcomprobantedetallenrodesde_Enabled = 1 ;
      edtavCcfgcomprobantedetallenrodesde_Visible = 1 ;
      cmbavCcfgcomprobantedetalleletra.setJsonclick( "" );
      cmbavCcfgcomprobantedetalleletra.setEnabled( 1 );
      cmbavCcfgcomprobantedetalleletra.setVisible( 1 );
      edtavCcfgcomprobanteprefijo_Jsonclick = "" ;
      edtavCcfgcomprobanteprefijo_Enabled = 1 ;
      edtavCcfgcomprobanteprefijo_Visible = 1 ;
      edtavCcfgcomprobanteid_Jsonclick = "" ;
      edtavCcfgcomprobanteid_Enabled = 1 ;
      edtavCcfgcomprobanteid_Visible = 1 ;
      divCfgcomprobantedetallenroultimofiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobantedetallenrohastafiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobantedetallenrodesdefiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobantedetalleletrafiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobanteprefijofiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobanteidfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Detalle" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV8cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV9cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV10cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV11cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e170O1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEIDFILTER.CLICK","{handler:'e110O1',iparms:[{av:'divCfgcomprobanteidfiltercontainer_Class',ctrl:'CFGCOMPROBANTEIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobanteidfiltercontainer_Class',ctrl:'CFGCOMPROBANTEIDFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobanteid_Visible',ctrl:'vCCFGCOMPROBANTEID',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEPREFIJOFILTER.CLICK","{handler:'e120O1',iparms:[{av:'divCfgcomprobanteprefijofiltercontainer_Class',ctrl:'CFGCOMPROBANTEPREFIJOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobanteprefijofiltercontainer_Class',ctrl:'CFGCOMPROBANTEPREFIJOFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobanteprefijo_Visible',ctrl:'vCCFGCOMPROBANTEPREFIJO',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEDETALLELETRAFILTER.CLICK","{handler:'e130O1',iparms:[{av:'divCfgcomprobantedetalleletrafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantedetalleletrafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER',prop:'Class'},{av:'cmbavCcfgcomprobantedetalleletra'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEDETALLENRODESDEFILTER.CLICK","{handler:'e140O1',iparms:[{av:'divCfgcomprobantedetallenrodesdefiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENRODESDEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantedetallenrodesdefiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENRODESDEFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobantedetallenrodesde_Visible',ctrl:'vCCFGCOMPROBANTEDETALLENRODESDE',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEDETALLENROHASTAFILTER.CLICK","{handler:'e150O1',iparms:[{av:'divCfgcomprobantedetallenrohastafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENROHASTAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantedetallenrohastafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENROHASTAFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobantedetallenrohasta_Visible',ctrl:'vCCFGCOMPROBANTEDETALLENROHASTA',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEDETALLENROULTIMOFILTER.CLICK","{handler:'e160O1',iparms:[{av:'divCfgcomprobantedetallenroultimofiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENROULTIMOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantedetallenroultimofiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENROULTIMOFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobantedetallenroultimo_Visible',ctrl:'vCCFGCOMPROBANTEDETALLENROULTIMO',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e200O2',iparms:[{av:'A31CfgComprobanteId',fld:'CFGCOMPROBANTEID'},{av:'A32CfgComprobantePrefijo',fld:'CFGCOMPROBANTEPREFIJO'},{av:'cmbCfgComprobanteDetalleLetra'},{av:'A35CfgComprobanteDetalleLetra',fld:'CFGCOMPROBANTEDETALLELETRA'}],oparms:[{av:'AV12pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID'},{av:'AV13pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO'},{av:'AV14pCfgComprobanteDetalleLetra',fld:'vPCFGCOMPROBANTEDETALLELETRA'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV8cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV9cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV10cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV11cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV8cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV9cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV10cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV11cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV8cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV9cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV10cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV11cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV7cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV8cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV9cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV10cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV11cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'}],oparms:[]}");
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
      AV12pCfgComprobanteId = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblcfgcomprobanteidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblcfgcomprobanteprefijofilter_Jsonclick = "" ;
      lblLblcfgcomprobantedetalleletrafilter_Jsonclick = "" ;
      lblLblcfgcomprobantedetallenrodesdefilter_Jsonclick = "" ;
      lblLblcfgcomprobantedetallenrohastafilter_Jsonclick = "" ;
      lblLblcfgcomprobantedetallenroultimofilter_Jsonclick = "" ;
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
      AV18Linkselection_GXI = "" ;
      GXKey = "" ;
      GXCCtl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV6cCfgComprobanteId = "" ;
      H000O2_A38CfgComprobanteDetalleNroUltimo = new int[1] ;
      H000O2_A37CfgComprobanteDetalleNroHasta = new int[1] ;
      H000O2_A36CfgComprobanteDetalleNroDesde = new int[1] ;
      H000O2_A35CfgComprobanteDetalleLetra = new byte[1] ;
      H000O2_A32CfgComprobantePrefijo = new short[1] ;
      H000O2_A31CfgComprobanteId = new String[] {""} ;
      H000O3_AGRID1_nRecordCount = new long[1] ;
      AV15ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx00c0__default(),
         new Object[] {
             new Object[] {
            H000O2_A38CfgComprobanteDetalleNroUltimo, H000O2_A37CfgComprobanteDetalleNroHasta, H000O2_A36CfgComprobanteDetalleNroDesde, H000O2_A35CfgComprobanteDetalleLetra, H000O2_A32CfgComprobantePrefijo, H000O2_A31CfgComprobanteId
            }
            , new Object[] {
            H000O3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV8cCfgComprobanteDetalleLetra ;
   private byte AV14pCfgComprobanteDetalleLetra ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte A35CfgComprobanteDetalleLetra ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_74 ;
   private short nGXsfl_74_idx=1 ;
   private short AV7cCfgComprobantePrefijo ;
   private short AV13pCfgComprobantePrefijo ;
   private short wbEnd ;
   private short wbStart ;
   private short A32CfgComprobantePrefijo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_74_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int AV9cCfgComprobanteDetalleNroDesde ;
   private int AV10cCfgComprobanteDetalleNroHasta ;
   private int AV11cCfgComprobanteDetalleNroUltimo ;
   private int edtavCcfgcomprobanteid_Visible ;
   private int edtavCcfgcomprobanteid_Enabled ;
   private int edtavCcfgcomprobanteprefijo_Enabled ;
   private int edtavCcfgcomprobanteprefijo_Visible ;
   private int edtavCcfgcomprobantedetallenrodesde_Enabled ;
   private int edtavCcfgcomprobantedetallenrodesde_Visible ;
   private int edtavCcfgcomprobantedetallenrohasta_Enabled ;
   private int edtavCcfgcomprobantedetallenrohasta_Visible ;
   private int edtavCcfgcomprobantedetallenroultimo_Enabled ;
   private int edtavCcfgcomprobantedetallenroultimo_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A36CfgComprobanteDetalleNroDesde ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A37CfgComprobanteDetalleNroHasta ;
   private int A38CfgComprobanteDetalleNroUltimo ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divCfgcomprobanteidfiltercontainer_Class ;
   private String divCfgcomprobanteprefijofiltercontainer_Class ;
   private String divCfgcomprobantedetalleletrafiltercontainer_Class ;
   private String divCfgcomprobantedetallenrodesdefiltercontainer_Class ;
   private String divCfgcomprobantedetallenrohastafiltercontainer_Class ;
   private String divCfgcomprobantedetallenroultimofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_74_idx="0001" ;
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
   private String divCfgcomprobantedetalleletrafiltercontainer_Internalname ;
   private String lblLblcfgcomprobantedetalleletrafilter_Internalname ;
   private String lblLblcfgcomprobantedetalleletrafilter_Jsonclick ;
   private String divCfgcomprobantedetallenrodesdefiltercontainer_Internalname ;
   private String lblLblcfgcomprobantedetallenrodesdefilter_Internalname ;
   private String lblLblcfgcomprobantedetallenrodesdefilter_Jsonclick ;
   private String edtavCcfgcomprobantedetallenrodesde_Internalname ;
   private String edtavCcfgcomprobantedetallenrodesde_Jsonclick ;
   private String divCfgcomprobantedetallenrohastafiltercontainer_Internalname ;
   private String lblLblcfgcomprobantedetallenrohastafilter_Internalname ;
   private String lblLblcfgcomprobantedetallenrohastafilter_Jsonclick ;
   private String edtavCcfgcomprobantedetallenrohasta_Internalname ;
   private String edtavCcfgcomprobantedetallenrohasta_Jsonclick ;
   private String divCfgcomprobantedetallenroultimofiltercontainer_Internalname ;
   private String lblLblcfgcomprobantedetallenroultimofilter_Internalname ;
   private String lblLblcfgcomprobantedetallenroultimofilter_Jsonclick ;
   private String edtavCcfgcomprobantedetallenroultimo_Internalname ;
   private String edtavCcfgcomprobantedetallenroultimo_Jsonclick ;
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
   private String edtCfgComprobanteDetalleNroDesde_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtCfgComprobanteId_Internalname ;
   private String edtCfgComprobantePrefijo_Internalname ;
   private String edtCfgComprobanteDetalleNroDesde_Internalname ;
   private String GXKey ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV15ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtCfgComprobanteId_Jsonclick ;
   private String edtCfgComprobantePrefijo_Jsonclick ;
   private String edtCfgComprobanteDetalleNroDesde_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV6cCfgComprobanteId ;
   private String AV12pCfgComprobanteId ;
   private String A31CfgComprobanteId ;
   private String AV18Linkselection_GXI ;
   private String lV6cCfgComprobanteId ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCcfgcomprobantedetalleletra ;
   private HTMLChoice cmbCfgComprobanteDetalleLetra ;
   private IDataStoreProvider pr_default ;
   private int[] H000O2_A38CfgComprobanteDetalleNroUltimo ;
   private int[] H000O2_A37CfgComprobanteDetalleNroHasta ;
   private int[] H000O2_A36CfgComprobanteDetalleNroDesde ;
   private byte[] H000O2_A35CfgComprobanteDetalleLetra ;
   private short[] H000O2_A32CfgComprobantePrefijo ;
   private String[] H000O2_A31CfgComprobanteId ;
   private long[] H000O3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00c0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000O2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV9cCfgComprobanteDetalleNroDesde ,
                                          int AV10cCfgComprobanteDetalleNroHasta ,
                                          int AV11cCfgComprobanteDetalleNroUltimo ,
                                          int A36CfgComprobanteDetalleNroDesde ,
                                          int A37CfgComprobanteDetalleNroHasta ,
                                          int A38CfgComprobanteDetalleNroUltimo ,
                                          String A31CfgComprobanteId ,
                                          String AV6cCfgComprobanteId ,
                                          short A32CfgComprobantePrefijo ,
                                          short AV7cCfgComprobantePrefijo ,
                                          byte A35CfgComprobanteDetalleLetra ,
                                          byte AV8cCfgComprobanteDetalleLetra )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [9] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " CfgComprobanteDetalleNroUltimo, CfgComprobanteDetalleNroHasta, CfgComprobanteDetalleNroDesde," ;
      sSelectString = sSelectString + " CfgComprobanteDetalleLetra, CfgComprobantePrefijo, CfgComprobanteId" ;
      sFromString = " FROM CfgComprobanteDetalle" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (CfgComprobanteId like ?)" ;
      sWhereString = sWhereString + " and (CfgComprobantePrefijo >= ?)" ;
      sWhereString = sWhereString + " and (CfgComprobanteDetalleLetra >= ?)" ;
      if ( ! (0==AV9cCfgComprobanteDetalleNroDesde) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroDesde >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCfgComprobanteDetalleNroHasta) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroHasta >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cCfgComprobanteDetalleNroUltimo) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroUltimo >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000O3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV9cCfgComprobanteDetalleNroDesde ,
                                          int AV10cCfgComprobanteDetalleNroHasta ,
                                          int AV11cCfgComprobanteDetalleNroUltimo ,
                                          int A36CfgComprobanteDetalleNroDesde ,
                                          int A37CfgComprobanteDetalleNroHasta ,
                                          int A38CfgComprobanteDetalleNroUltimo ,
                                          String A31CfgComprobanteId ,
                                          String AV6cCfgComprobanteId ,
                                          short A32CfgComprobantePrefijo ,
                                          short AV7cCfgComprobantePrefijo ,
                                          byte A35CfgComprobanteDetalleLetra ,
                                          byte AV8cCfgComprobanteDetalleLetra )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [6] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM CfgComprobanteDetalle" ;
      scmdbuf = scmdbuf + " WHERE (CfgComprobanteId like ?)" ;
      scmdbuf = scmdbuf + " and (CfgComprobantePrefijo >= ?)" ;
      scmdbuf = scmdbuf + " and (CfgComprobanteDetalleLetra >= ?)" ;
      if ( ! (0==AV9cCfgComprobanteDetalleNroDesde) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroDesde >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCfgComprobanteDetalleNroHasta) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroHasta >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cCfgComprobanteDetalleNroUltimo) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroUltimo >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
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
                  return conditional_H000O2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() );
            case 1 :
                  return conditional_H000O3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000O2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000O3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
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
                  stmt.setVarchar(sIdx, (String)parms[9], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 1 :
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
      }
   }

}

