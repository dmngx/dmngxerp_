/*
               File: gx00c2_impl
        Description: Selection List Detalle
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:32:27.31
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

public final  class gx00c2_impl extends GXDataArea
{
   public gx00c2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00c2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00c2_impl.class ));
   }

   public gx00c2_impl( int remoteHandle ,
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
            nRC_GXsfl_54 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_54_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_54_idx = httpContext.GetNextPar( ) ;
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
            AV6cCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cCfgComprobanteDetalleNroDesde = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cCfgComprobanteDetalleNroHasta = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cCfgComprobanteDetalleNroUltimo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10pCfgComprobanteId = httpContext.GetNextPar( ) ;
            AV11pCfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteDetalleLetra, AV7cCfgComprobanteDetalleNroDesde, AV8cCfgComprobanteDetalleNroHasta, AV9cCfgComprobanteDetalleNroUltimo, AV10pCfgComprobanteId, AV11pCfgComprobantePrefijo) ;
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
            AV10pCfgComprobanteId = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10pCfgComprobanteId", AV10pCfgComprobanteId);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV11pCfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV11pCfgComprobantePrefijo, 4, 0)));
               AV12pCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV12pCfgComprobanteDetalleLetra, 2, 0)));
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
      pa0I2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0I2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721917322738");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx00c2") + "?" + GXutil.URLEncode(GXutil.rtrim(AV10pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pCfgComprobantePrefijo,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pCfgComprobanteDetalleLetra,2,0)))+"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEDETALLELETRA", GXutil.ltrim( localUtil.ntoc( AV6cCfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEDETALLENRODESDE", GXutil.ltrim( localUtil.ntoc( AV7cCfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEDETALLENROHASTA", GXutil.ltrim( localUtil.ntoc( AV8cCfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEDETALLENROULTIMO", GXutil.ltrim( localUtil.ntoc( AV9cCfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", "")));
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEID", AV10pCfgComprobanteId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEPREFIJO", GXutil.ltrim( localUtil.ntoc( AV11pCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEDETALLELETRA", GXutil.ltrim( localUtil.ntoc( AV12pCfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPCFGCOMPROBANTEID", getSecureSignedToken( "", String.valueOf(AV10pCfgComprobanteId)));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPCFGCOMPROBANTEPREFIJO", getSecureSignedToken( "", String.valueOf(AV11pCfgComprobantePrefijo)));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
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
         we0I2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0I2( ) ;
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
      return formatLink("com.kberp.gx00c2") + "?" + GXutil.URLEncode(GXutil.rtrim(AV10pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pCfgComprobantePrefijo,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pCfgComprobanteDetalleLetra,2,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00C2" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Detalle" ;
   }

   public void wb0I0( )
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divCfgcomprobantedetalleletrafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCfgcomprobantedetalleletrafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantedetalleletrafilter_Internalname, "Cfg Comprobante Detalle Letra", "", "", lblLblcfgcomprobantedetalleletrafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C2.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         /* ComboBox */
         com.kberp.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCcfgcomprobantedetalleletra, cmbavCcfgcomprobantedetalleletra.getInternalname(), GXutil.trim( GXutil.str( AV6cCfgComprobanteDetalleLetra, 2, 0)), 1, cmbavCcfgcomprobantedetalleletra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavCcfgcomprobantedetalleletra.getVisible(), cmbavCcfgcomprobantedetalleletra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "", true, "HLP_Gx00C2.htm");
         cmbavCcfgcomprobantedetalleletra.setValue( GXutil.trim( GXutil.str( AV6cCfgComprobanteDetalleLetra, 2, 0)) );
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantedetallenrodesdefilter_Internalname, "Cfg Comprobante Detalle Nro Desde", "", "", lblLblcfgcomprobantedetallenrodesdefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C2.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobantedetallenrodesde_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cCfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", "")), ((edtavCcfgcomprobantedetallenrodesde_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cCfgComprobanteDetalleNroDesde), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cCfgComprobanteDetalleNroDesde), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobantedetallenrodesde_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobantedetallenrodesde_Visible, edtavCcfgcomprobantedetallenrodesde_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00C2.htm");
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantedetallenrohastafilter_Internalname, "Cfg Comprobante Detalle Nro Hasta", "", "", lblLblcfgcomprobantedetallenrohastafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C2.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobantedetallenrohasta_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cCfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", "")), ((edtavCcfgcomprobantedetallenrohasta_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cCfgComprobanteDetalleNroHasta), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cCfgComprobanteDetalleNroHasta), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobantedetallenrohasta_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobantedetallenrohasta_Visible, edtavCcfgcomprobantedetallenrohasta_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00C2.htm");
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantedetallenroultimofilter_Internalname, "Cfg Comprobante Detalle Nro Ultimo", "", "", lblLblcfgcomprobantedetallenroultimofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00C2.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobantedetallenroultimo_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cCfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", "")), ((edtavCcfgcomprobantedetallenroultimo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cCfgComprobanteDetalleNroUltimo), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cCfgComprobanteDetalleNroUltimo), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobantedetallenroultimo_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobantedetallenroultimo_Visible, edtavCcfgcomprobantedetallenroultimo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00C2.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e150i1_client"+"'", TempTags, "", 2, "HLP_Gx00C2.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"54\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Detalle Letra") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nro Desde") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nro Hasta") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cfg Comprobante Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cfg Comprobante Prefijo") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtCfgComprobanteDetalleNroDesde_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A37CfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A31CfgComprobanteId);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_54 = (short)(nGXsfl_54_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00C2.htm");
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

   public void start0I2( )
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
      strup0I0( ) ;
   }

   public void ws0I2( )
   {
      start0I2( ) ;
      evt0I2( ) ;
   }

   public void evt0I2( )
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
                           nGXsfl_54_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_542( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV16Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))));
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection));
                           cmbCfgComprobanteDetalleLetra.setName( cmbCfgComprobanteDetalleLetra.getInternalname() );
                           cmbCfgComprobanteDetalleLetra.setValue( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()) );
                           A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
                           A36CfgComprobanteDetalleNroDesde = (int)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroDesde_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroDesde_Internalname, GXutil.ltrim( GXutil.str( A36CfgComprobanteDetalleNroDesde, 8, 0)));
                           A37CfgComprobanteDetalleNroHasta = (int)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroHasta_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroHasta_Internalname, GXutil.ltrim( GXutil.str( A37CfgComprobanteDetalleNroHasta, 8, 0)));
                           A31CfgComprobanteId = httpContext.cgiGet( edtCfgComprobanteId_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteId_Internalname, A31CfgComprobanteId);
                           A32CfgComprobantePrefijo = (short)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobantePrefijo_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e160I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e170I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ccfgcomprobantedetalleletra Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLELETRA"), ",", ".") != AV6cCfgComprobanteDetalleLetra )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobantedetallenrodesde Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENRODESDE"), ",", ".") != AV7cCfgComprobanteDetalleNroDesde )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobantedetallenrohasta Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENROHASTA"), ",", ".") != AV8cCfgComprobanteDetalleNroHasta )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobantedetallenroultimo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENROULTIMO"), ",", ".") != AV9cCfgComprobanteDetalleNroUltimo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e180I2 ();
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

   public void we0I2( )
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

   public void pa0I2( )
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
            AV6cCfgComprobanteDetalleLetra = (byte)(GXutil.lval( cmbavCcfgcomprobantedetalleletra.getValidValue(GXutil.trim( GXutil.str( AV6cCfgComprobanteDetalleLetra, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV6cCfgComprobanteDetalleLetra, 2, 0)));
         }
         GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_54_idx ;
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
      subsflControlProps_542( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         sendrow_542( ) ;
         nGXsfl_54_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_idx+1)) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  byte AV6cCfgComprobanteDetalleLetra ,
                                  int AV7cCfgComprobanteDetalleNroDesde ,
                                  int AV8cCfgComprobanteDetalleNroHasta ,
                                  int AV9cCfgComprobanteDetalleNroUltimo ,
                                  String AV10pCfgComprobanteId ,
                                  short AV11pCfgComprobantePrefijo )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0I2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0I2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0I2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(54) ;
      nGXsfl_54_idx = (short)(1) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      nGXsfl_54_Refreshing = (short)(1) ;
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
         subsflControlProps_542( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              new Integer(AV7cCfgComprobanteDetalleNroDesde) ,
                                              new Integer(AV8cCfgComprobanteDetalleNroHasta) ,
                                              new Integer(AV9cCfgComprobanteDetalleNroUltimo) ,
                                              new Integer(A36CfgComprobanteDetalleNroDesde) ,
                                              new Integer(A37CfgComprobanteDetalleNroHasta) ,
                                              new Integer(A38CfgComprobanteDetalleNroUltimo) ,
                                              AV10pCfgComprobanteId ,
                                              new Short(AV11pCfgComprobantePrefijo) ,
                                              new Byte(AV6cCfgComprobanteDetalleLetra) ,
                                              A31CfgComprobanteId ,
                                              new Short(A32CfgComprobantePrefijo) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.SHORT
                                              }
         } ) ;
         /* Using cursor H000I2 */
         pr_default.execute(0, new Object[] {AV10pCfgComprobanteId, new Short(AV11pCfgComprobantePrefijo), new Byte(AV6cCfgComprobanteDetalleLetra), new Integer(AV7cCfgComprobanteDetalleNroDesde), new Integer(AV8cCfgComprobanteDetalleNroHasta), new Integer(AV9cCfgComprobanteDetalleNroUltimo), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_54_idx = (short)(1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A38CfgComprobanteDetalleNroUltimo = H000I2_A38CfgComprobanteDetalleNroUltimo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A38CfgComprobanteDetalleNroUltimo", GXutil.ltrim( GXutil.str( A38CfgComprobanteDetalleNroUltimo, 8, 0)));
            A32CfgComprobantePrefijo = H000I2_A32CfgComprobantePrefijo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            A31CfgComprobanteId = H000I2_A31CfgComprobanteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteId_Internalname, A31CfgComprobanteId);
            A37CfgComprobanteDetalleNroHasta = H000I2_A37CfgComprobanteDetalleNroHasta[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroHasta_Internalname, GXutil.ltrim( GXutil.str( A37CfgComprobanteDetalleNroHasta, 8, 0)));
            A36CfgComprobanteDetalleNroDesde = H000I2_A36CfgComprobanteDetalleNroDesde[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroDesde_Internalname, GXutil.ltrim( GXutil.str( A36CfgComprobanteDetalleNroDesde, 8, 0)));
            A35CfgComprobanteDetalleLetra = H000I2_A35CfgComprobanteDetalleLetra[0] ;
            httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
            /* Execute user event: Load */
            e170I2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(54) ;
         wb0I0( ) ;
      }
      nGXsfl_54_Refreshing = (short)(0) ;
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
                                           new Integer(AV7cCfgComprobanteDetalleNroDesde) ,
                                           new Integer(AV8cCfgComprobanteDetalleNroHasta) ,
                                           new Integer(AV9cCfgComprobanteDetalleNroUltimo) ,
                                           new Integer(A36CfgComprobanteDetalleNroDesde) ,
                                           new Integer(A37CfgComprobanteDetalleNroHasta) ,
                                           new Integer(A38CfgComprobanteDetalleNroUltimo) ,
                                           AV10pCfgComprobanteId ,
                                           new Short(AV11pCfgComprobantePrefijo) ,
                                           new Byte(AV6cCfgComprobanteDetalleLetra) ,
                                           A31CfgComprobanteId ,
                                           new Short(A32CfgComprobantePrefijo) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT
                                           }
      } ) ;
      /* Using cursor H000I3 */
      pr_default.execute(1, new Object[] {AV10pCfgComprobanteId, new Short(AV11pCfgComprobantePrefijo), new Byte(AV6cCfgComprobanteDetalleLetra), new Integer(AV7cCfgComprobanteDetalleNroDesde), new Integer(AV8cCfgComprobanteDetalleNroHasta), new Integer(AV9cCfgComprobanteDetalleNroUltimo)});
      GRID1_nRecordCount = H000I3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteDetalleLetra, AV7cCfgComprobanteDetalleNroDesde, AV8cCfgComprobanteDetalleNroHasta, AV9cCfgComprobanteDetalleNroUltimo, AV10pCfgComprobanteId, AV11pCfgComprobantePrefijo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteDetalleLetra, AV7cCfgComprobanteDetalleNroDesde, AV8cCfgComprobanteDetalleNroHasta, AV9cCfgComprobanteDetalleNroUltimo, AV10pCfgComprobanteId, AV11pCfgComprobantePrefijo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteDetalleLetra, AV7cCfgComprobanteDetalleNroDesde, AV8cCfgComprobanteDetalleNroHasta, AV9cCfgComprobanteDetalleNroUltimo, AV10pCfgComprobanteId, AV11pCfgComprobantePrefijo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteDetalleLetra, AV7cCfgComprobanteDetalleNroDesde, AV8cCfgComprobanteDetalleNroHasta, AV9cCfgComprobanteDetalleNroUltimo, AV10pCfgComprobanteId, AV11pCfgComprobantePrefijo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCfgComprobanteDetalleLetra, AV7cCfgComprobanteDetalleNroDesde, AV8cCfgComprobanteDetalleNroHasta, AV9cCfgComprobanteDetalleNroUltimo, AV10pCfgComprobanteId, AV11pCfgComprobantePrefijo) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0I0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e160I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         cmbavCcfgcomprobantedetalleletra.setName( cmbavCcfgcomprobantedetalleletra.getInternalname() );
         cmbavCcfgcomprobantedetalleletra.setValue( httpContext.cgiGet( cmbavCcfgcomprobantedetalleletra.getInternalname()) );
         AV6cCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.cgiGet( cmbavCcfgcomprobantedetalleletra.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV6cCfgComprobanteDetalleLetra, 2, 0)));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrodesde_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrodesde_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFGCOMPROBANTEDETALLENRODESDE");
            GX_FocusControl = edtavCcfgcomprobantedetallenrodesde_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cCfgComprobanteDetalleNroDesde = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cCfgComprobanteDetalleNroDesde", GXutil.ltrim( GXutil.str( AV7cCfgComprobanteDetalleNroDesde, 8, 0)));
         }
         else
         {
            AV7cCfgComprobanteDetalleNroDesde = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrodesde_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cCfgComprobanteDetalleNroDesde", GXutil.ltrim( GXutil.str( AV7cCfgComprobanteDetalleNroDesde, 8, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrohasta_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrohasta_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFGCOMPROBANTEDETALLENROHASTA");
            GX_FocusControl = edtavCcfgcomprobantedetallenrohasta_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cCfgComprobanteDetalleNroHasta = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cCfgComprobanteDetalleNroHasta", GXutil.ltrim( GXutil.str( AV8cCfgComprobanteDetalleNroHasta, 8, 0)));
         }
         else
         {
            AV8cCfgComprobanteDetalleNroHasta = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenrohasta_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cCfgComprobanteDetalleNroHasta", GXutil.ltrim( GXutil.str( AV8cCfgComprobanteDetalleNroHasta, 8, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenroultimo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenroultimo_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFGCOMPROBANTEDETALLENROULTIMO");
            GX_FocusControl = edtavCcfgcomprobantedetallenroultimo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cCfgComprobanteDetalleNroUltimo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cCfgComprobanteDetalleNroUltimo", GXutil.ltrim( GXutil.str( AV9cCfgComprobanteDetalleNroUltimo, 8, 0)));
         }
         else
         {
            AV9cCfgComprobanteDetalleNroUltimo = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobantedetallenroultimo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cCfgComprobanteDetalleNroUltimo", GXutil.ltrim( GXutil.str( AV9cCfgComprobanteDetalleNroUltimo, 8, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_54 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_54"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLELETRA"), ",", ".") != AV6cCfgComprobanteDetalleLetra )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENRODESDE"), ",", ".") != AV7cCfgComprobanteDetalleNroDesde )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENROHASTA"), ",", ".") != AV8cCfgComprobanteDetalleNroHasta )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLENROULTIMO"), ",", ".") != AV9cCfgComprobanteDetalleNroUltimo )
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
      e160I2 ();
      if (returnInSub) return;
   }

   public void e160I2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Detalle", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV13ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e170I2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV16Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_542( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ( nGXsfl_54_Refreshing == 0 ) )
      {
         httpContext.doAjaxLoad(54, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e180I2 ();
      if (returnInSub) return;
   }

   public void e180I2( )
   {
      /* Enter Routine */
      AV12pCfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV12pCfgComprobanteDetalleLetra, 2, 0)));
      httpContext.setWebReturnParms(new Object[] {new Byte(AV12pCfgComprobanteDetalleLetra)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV10pCfgComprobanteId = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pCfgComprobanteId", AV10pCfgComprobanteId);
      AV11pCfgComprobantePrefijo = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV11pCfgComprobantePrefijo, 4, 0)));
      AV12pCfgComprobanteDetalleLetra = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV12pCfgComprobanteDetalleLetra, 2, 0)));
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
      pa0I2( ) ;
      ws0I2( ) ;
      we0I2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721917322866");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx00c2.js", "?201721917322866");
      /* End function include_jscripts */
   }

   public void subsflControlProps_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_idx ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_54_idx );
      edtCfgComprobanteDetalleNroDesde_Internalname = "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_54_idx ;
      edtCfgComprobanteDetalleNroHasta_Internalname = "CFGCOMPROBANTEDETALLENROHASTA_"+sGXsfl_54_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_54_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_fel_idx ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_54_fel_idx );
      edtCfgComprobanteDetalleNroDesde_Internalname = "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_54_fel_idx ;
      edtCfgComprobanteDetalleNroHasta_Internalname = "CFGCOMPROBANTEDETALLENROHASTA_"+sGXsfl_54_fel_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_54_fel_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_54_fel_idx ;
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wb0I0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_54_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV16Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV16Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_54_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_54_idx ;
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
         edtCfgComprobanteDetalleNroDesde_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteDetalleNroDesde_Internalname, "Link", edtCfgComprobanteDetalleNroDesde_Link);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteDetalleNroDesde_Internalname,GXutil.ltrim( localUtil.ntoc( A36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A36CfgComprobanteDetalleNroDesde), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtCfgComprobanteDetalleNroDesde_Link,"","","",edtCfgComprobanteDetalleNroDesde_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobanteNumero","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteDetalleNroHasta_Internalname,GXutil.ltrim( localUtil.ntoc( A37CfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A37CfgComprobanteDetalleNroHasta), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobanteDetalleNroHasta_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobanteNumero","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteId_Internalname,A31CfgComprobanteId,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobanteId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"IdCfgComprobanteId","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobantePrefijo_Internalname,GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A32CfgComprobantePrefijo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobantePrefijo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobantePrefijo","right"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_54_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_idx+1)) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void init_default_properties( )
   {
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
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA" );
      edtCfgComprobanteDetalleNroDesde_Internalname = "CFGCOMPROBANTEDETALLENRODESDE" ;
      edtCfgComprobanteDetalleNroHasta_Internalname = "CFGCOMPROBANTEDETALLENROHASTA" ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID" ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO" ;
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
      edtCfgComprobantePrefijo_Jsonclick = "" ;
      edtCfgComprobanteId_Jsonclick = "" ;
      edtCfgComprobanteDetalleNroHasta_Jsonclick = "" ;
      edtCfgComprobanteDetalleNroDesde_Jsonclick = "" ;
      cmbCfgComprobanteDetalleLetra.setJsonclick( "" );
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
      divCfgcomprobantedetallenroultimofiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobantedetallenrohastafiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobantedetallenrodesdefiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobantedetalleletrafiltercontainer_Class = "AdvancedContainerItem" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV6cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV7cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV8cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV9cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'},{av:'AV10pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV11pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e150I1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEDETALLELETRAFILTER.CLICK","{handler:'e110I1',iparms:[{av:'divCfgcomprobantedetalleletrafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantedetalleletrafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER',prop:'Class'},{av:'cmbavCcfgcomprobantedetalleletra'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEDETALLENRODESDEFILTER.CLICK","{handler:'e120I1',iparms:[{av:'divCfgcomprobantedetallenrodesdefiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENRODESDEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantedetallenrodesdefiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENRODESDEFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobantedetallenrodesde_Visible',ctrl:'vCCFGCOMPROBANTEDETALLENRODESDE',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEDETALLENROHASTAFILTER.CLICK","{handler:'e130I1',iparms:[{av:'divCfgcomprobantedetallenrohastafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENROHASTAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantedetallenrohastafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENROHASTAFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobantedetallenrohasta_Visible',ctrl:'vCCFGCOMPROBANTEDETALLENROHASTA',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEDETALLENROULTIMOFILTER.CLICK","{handler:'e140I1',iparms:[{av:'divCfgcomprobantedetallenroultimofiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENROULTIMOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantedetallenroultimofiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLENROULTIMOFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobantedetallenroultimo_Visible',ctrl:'vCCFGCOMPROBANTEDETALLENROULTIMO',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e180I2',iparms:[{av:'cmbCfgComprobanteDetalleLetra'},{av:'A35CfgComprobanteDetalleLetra',fld:'CFGCOMPROBANTEDETALLELETRA'}],oparms:[{av:'AV12pCfgComprobanteDetalleLetra',fld:'vPCFGCOMPROBANTEDETALLELETRA'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV6cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV7cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV8cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV9cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'},{av:'AV10pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV11pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV6cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV7cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV8cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV9cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'},{av:'AV10pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV11pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV6cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV7cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV8cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV9cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'},{av:'AV10pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV11pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV6cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV7cCfgComprobanteDetalleNroDesde',fld:'vCCFGCOMPROBANTEDETALLENRODESDE'},{av:'AV8cCfgComprobanteDetalleNroHasta',fld:'vCCFGCOMPROBANTEDETALLENROHASTA'},{av:'AV9cCfgComprobanteDetalleNroUltimo',fld:'vCCFGCOMPROBANTEDETALLENROULTIMO'},{av:'AV10pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV11pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true}],oparms:[]}");
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
      wcpOAV10pCfgComprobanteId = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblcfgcomprobantedetalleletrafilter_Jsonclick = "" ;
      TempTags = "" ;
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
      AV16Linkselection_GXI = "" ;
      GXKey = "" ;
      GXCCtl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      H000I2_A38CfgComprobanteDetalleNroUltimo = new int[1] ;
      H000I2_A32CfgComprobantePrefijo = new short[1] ;
      H000I2_A31CfgComprobanteId = new String[] {""} ;
      H000I2_A37CfgComprobanteDetalleNroHasta = new int[1] ;
      H000I2_A36CfgComprobanteDetalleNroDesde = new int[1] ;
      H000I2_A35CfgComprobanteDetalleLetra = new byte[1] ;
      H000I3_AGRID1_nRecordCount = new long[1] ;
      AV13ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx00c2__default(),
         new Object[] {
             new Object[] {
            H000I2_A38CfgComprobanteDetalleNroUltimo, H000I2_A32CfgComprobantePrefijo, H000I2_A31CfgComprobanteId, H000I2_A37CfgComprobanteDetalleNroHasta, H000I2_A36CfgComprobanteDetalleNroDesde, H000I2_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            H000I3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV6cCfgComprobanteDetalleLetra ;
   private byte AV12pCfgComprobanteDetalleLetra ;
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
   private short wcpOAV11pCfgComprobantePrefijo ;
   private short nRC_GXsfl_54 ;
   private short nGXsfl_54_idx=1 ;
   private short AV11pCfgComprobantePrefijo ;
   private short wbEnd ;
   private short wbStart ;
   private short A32CfgComprobantePrefijo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_54_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int AV7cCfgComprobanteDetalleNroDesde ;
   private int AV8cCfgComprobanteDetalleNroHasta ;
   private int AV9cCfgComprobanteDetalleNroUltimo ;
   private int edtavCcfgcomprobantedetallenrodesde_Enabled ;
   private int edtavCcfgcomprobantedetallenrodesde_Visible ;
   private int edtavCcfgcomprobantedetallenrohasta_Enabled ;
   private int edtavCcfgcomprobantedetallenrohasta_Visible ;
   private int edtavCcfgcomprobantedetallenroultimo_Enabled ;
   private int edtavCcfgcomprobantedetallenroultimo_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A36CfgComprobanteDetalleNroDesde ;
   private int A37CfgComprobanteDetalleNroHasta ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A38CfgComprobanteDetalleNroUltimo ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divCfgcomprobantedetalleletrafiltercontainer_Class ;
   private String divCfgcomprobantedetallenrodesdefiltercontainer_Class ;
   private String divCfgcomprobantedetallenrohastafiltercontainer_Class ;
   private String divCfgcomprobantedetallenroultimofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_54_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divCfgcomprobantedetalleletrafiltercontainer_Internalname ;
   private String lblLblcfgcomprobantedetalleletrafilter_Internalname ;
   private String lblLblcfgcomprobantedetalleletrafilter_Jsonclick ;
   private String TempTags ;
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
   private String edtCfgComprobanteDetalleNroDesde_Internalname ;
   private String edtCfgComprobanteDetalleNroHasta_Internalname ;
   private String edtCfgComprobanteId_Internalname ;
   private String edtCfgComprobantePrefijo_Internalname ;
   private String GXKey ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV13ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtCfgComprobanteDetalleNroDesde_Jsonclick ;
   private String edtCfgComprobanteDetalleNroHasta_Jsonclick ;
   private String edtCfgComprobanteId_Jsonclick ;
   private String edtCfgComprobantePrefijo_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String wcpOAV10pCfgComprobanteId ;
   private String AV10pCfgComprobanteId ;
   private String A31CfgComprobanteId ;
   private String AV16Linkselection_GXI ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCcfgcomprobantedetalleletra ;
   private HTMLChoice cmbCfgComprobanteDetalleLetra ;
   private IDataStoreProvider pr_default ;
   private int[] H000I2_A38CfgComprobanteDetalleNroUltimo ;
   private short[] H000I2_A32CfgComprobantePrefijo ;
   private String[] H000I2_A31CfgComprobanteId ;
   private int[] H000I2_A37CfgComprobanteDetalleNroHasta ;
   private int[] H000I2_A36CfgComprobanteDetalleNroDesde ;
   private byte[] H000I2_A35CfgComprobanteDetalleLetra ;
   private long[] H000I3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00c2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cCfgComprobanteDetalleNroDesde ,
                                          int AV8cCfgComprobanteDetalleNroHasta ,
                                          int AV9cCfgComprobanteDetalleNroUltimo ,
                                          int A36CfgComprobanteDetalleNroDesde ,
                                          int A37CfgComprobanteDetalleNroHasta ,
                                          int A38CfgComprobanteDetalleNroUltimo ,
                                          String AV10pCfgComprobanteId ,
                                          short AV11pCfgComprobantePrefijo ,
                                          byte AV6cCfgComprobanteDetalleLetra ,
                                          String A31CfgComprobanteId ,
                                          short A32CfgComprobantePrefijo )
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
      sSelectString = " CfgComprobanteDetalleNroUltimo, CfgComprobantePrefijo, CfgComprobanteId, CfgComprobanteDetalleNroHasta," ;
      sSelectString = sSelectString + " CfgComprobanteDetalleNroDesde, CfgComprobanteDetalleLetra" ;
      sFromString = " FROM CfgComprobanteDetalle" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (CfgComprobanteId = ( ?) and CfgComprobantePrefijo = ? and CfgComprobanteDetalleLetra >= ?)" ;
      if ( ! (0==AV7cCfgComprobanteDetalleNroDesde) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroDesde >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV8cCfgComprobanteDetalleNroHasta) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroHasta >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV9cCfgComprobanteDetalleNroUltimo) )
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

   protected Object[] conditional_H000I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cCfgComprobanteDetalleNroDesde ,
                                          int AV8cCfgComprobanteDetalleNroHasta ,
                                          int AV9cCfgComprobanteDetalleNroUltimo ,
                                          int A36CfgComprobanteDetalleNroDesde ,
                                          int A37CfgComprobanteDetalleNroHasta ,
                                          int A38CfgComprobanteDetalleNroUltimo ,
                                          String AV10pCfgComprobanteId ,
                                          short AV11pCfgComprobantePrefijo ,
                                          byte AV6cCfgComprobanteDetalleLetra ,
                                          String A31CfgComprobanteId ,
                                          short A32CfgComprobantePrefijo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [6] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM CfgComprobanteDetalle" ;
      scmdbuf = scmdbuf + " WHERE (CfgComprobanteId = ( ?) and CfgComprobantePrefijo = ? and CfgComprobanteDetalleLetra >= ?)" ;
      if ( ! (0==AV7cCfgComprobanteDetalleNroDesde) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroDesde >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV8cCfgComprobanteDetalleNroHasta) )
      {
         sWhereString = sWhereString + " and (CfgComprobanteDetalleNroHasta >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV9cCfgComprobanteDetalleNroUltimo) )
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
                  return conditional_H000I2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() );
            case 1 :
                  return conditional_H000I3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
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

