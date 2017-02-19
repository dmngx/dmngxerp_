/*
               File: gx00v5_impl
        Description: Selection List Articulo
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 15:45:19.94
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

public final  class gx00v5_impl extends GXDataArea
{
   public gx00v5_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00v5_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00v5_impl.class ));
   }

   public gx00v5_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            nRC_GXsfl_34 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_34_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_34_idx = httpContext.GetNextPar( ) ;
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
            AV6cArticuloId = httpContext.GetNextPar( ) ;
            AV7cComprobanteArticuloCantidad = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV8pEmpresaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9pCfgComprobanteId = httpContext.GetNextPar( ) ;
            AV10pCfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11pComprobanteNumero = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV12pCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cComprobanteArticuloCantidad, AV8pEmpresaId, AV9pCfgComprobanteId, AV10pCfgComprobantePrefijo, AV11pComprobanteNumero, AV12pCfgComprobanteDetalleLetra) ;
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
            AV8pEmpresaId = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8pEmpresaId", GXutil.ltrim( GXutil.str( AV8pEmpresaId, 6, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV9pCfgComprobanteId = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9pCfgComprobanteId", AV9pCfgComprobanteId);
               AV10pCfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV10pCfgComprobantePrefijo, 4, 0)));
               AV11pComprobanteNumero = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11pComprobanteNumero", GXutil.ltrim( GXutil.str( AV11pComprobanteNumero, 8, 0)));
               AV12pCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV12pCfgComprobanteDetalleLetra, 2, 0)));
               AV13pArticuloId = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pArticuloId", AV13pArticuloId);
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
      pa0W2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0W2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20172191545201");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx00v5") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8pEmpresaId,6,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV9pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pCfgComprobantePrefijo,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pComprobanteNumero,8,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pCfgComprobanteDetalleLetra,2,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV13pArticuloId))+"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCARTICULOID", AV6cArticuloId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCOMPROBANTEARTICULOCANTIDAD", GXutil.ltrim( localUtil.ntoc( AV7cComprobanteArticuloCantidad, (byte)(10), (byte)(3), ",", "")));
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_34", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPEMPRESAID", GXutil.ltrim( localUtil.ntoc( AV8pEmpresaId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEID", AV9pCfgComprobanteId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEPREFIJO", GXutil.ltrim( localUtil.ntoc( AV10pCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCOMPROBANTENUMERO", GXutil.ltrim( localUtil.ntoc( AV11pComprobanteNumero, (byte)(8), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEDETALLELETRA", GXutil.ltrim( localUtil.ntoc( AV12pCfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPARTICULOID", AV13pArticuloId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEMPRESAID", getSecureSignedToken( "", String.valueOf(AV8pEmpresaId)));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPCFGCOMPROBANTEID", getSecureSignedToken( "", String.valueOf(AV9pCfgComprobanteId)));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPCFGCOMPROBANTEPREFIJO", getSecureSignedToken( "", String.valueOf(AV10pCfgComprobantePrefijo)));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPCOMPROBANTENUMERO", getSecureSignedToken( "", String.valueOf(AV11pComprobanteNumero)));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPCFGCOMPROBANTEDETALLELETRA", getSecureSignedToken( "", String.valueOf(AV12pCfgComprobanteDetalleLetra)));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ARTICULOIDFILTERCONTAINER_Class", GXutil.rtrim( divArticuloidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "COMPROBANTEARTICULOCANTIDADFILTERCONTAINER_Class", GXutil.rtrim( divComprobantearticulocantidadfiltercontainer_Class));
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
         we0W2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0W2( ) ;
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
      return formatLink("com.kberp.gx00v5") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8pEmpresaId,6,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV9pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pCfgComprobantePrefijo,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pComprobanteNumero,8,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pCfgComprobanteDetalleLetra,2,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV13pArticuloId)) ;
   }

   public String getPgmname( )
   {
      return "Gx00V5" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Articulo" ;
   }

   public void wb0W0( )
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divArticuloidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divArticuloidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblarticuloidfilter_Internalname, "Articulo Id", "", "", lblLblarticuloidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110w1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00V5.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCarticuloid_Internalname, "Articulo Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCarticuloid_Internalname, AV6cArticuloId, GXutil.rtrim( localUtil.format( AV6cArticuloId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCarticuloid_Jsonclick, 0, "Attribute", "", "", "", edtavCarticuloid_Visible, edtavCarticuloid_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00V5.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divComprobantearticulocantidadfiltercontainer_Internalname, 1, 0, "px", 0, "px", divComprobantearticulocantidadfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcomprobantearticulocantidadfilter_Internalname, "Comprobante Articulo Cantidad", "", "", lblLblcomprobantearticulocantidadfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120w1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00V5.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcomprobantearticulocantidad_Internalname, "Comprobante Articulo Cantidad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcomprobantearticulocantidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cComprobanteArticuloCantidad, (byte)(10), (byte)(3), ",", "")), ((edtavCcomprobantearticulocantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV7cComprobanteArticuloCantidad, "ZZZZZ9.999")) : localUtil.format( AV7cComprobanteArticuloCantidad, "ZZZZZ9.999")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','3');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcomprobantearticulocantidad_Jsonclick, 0, "Attribute", "", "", "", edtavCcomprobantearticulocantidad_Visible, edtavCcomprobantearticulocantidad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00V5.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e130w1_client"+"'", TempTags, "", 2, "HLP_Gx00V5.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"34\">") ;
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
            httpContext.writeValue( "Articulo Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Articulo Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Precio Unit") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Articulo Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Empresa Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cfg Comprobante Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cfg Comprobante Prefijo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Comprobante Numero") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cfg Comprobante Detalle Letra") ;
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
            Grid1Column.AddObjectProperty("Value", A39ArticuloId);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A64ComprobanteArticuloCantidad, (byte)(10), (byte)(3), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A65ComprobanteArticuloPrecioUnit, (byte)(12), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A66ComprobanteArticuloTotal, (byte)(12), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A31CfgComprobanteId);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A55ComprobanteNumero, (byte)(8), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 34 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_34 = (short)(nGXsfl_34_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00V5.htm");
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

   public void start0W2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_2-109402", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Articulo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0W0( ) ;
   }

   public void ws0W2( )
   {
      start0W2( ) ;
      evt0W2( ) ;
   }

   public void evt0W2( )
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
                           nGXsfl_34_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_342( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))));
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection));
                           A39ArticuloId = httpContext.cgiGet( edtArticuloId_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtArticuloId_Internalname, A39ArticuloId);
                           A64ComprobanteArticuloCantidad = localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloCantidad_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloCantidad_Internalname, GXutil.ltrim( GXutil.str( A64ComprobanteArticuloCantidad, 10, 3)));
                           A65ComprobanteArticuloPrecioUnit = localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloPrecioUnit_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloPrecioUnit_Internalname, GXutil.ltrim( GXutil.str( A65ComprobanteArticuloPrecioUnit, 12, 2)));
                           A66ComprobanteArticuloTotal = localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloTotal_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloTotal_Internalname, GXutil.ltrim( GXutil.str( A66ComprobanteArticuloTotal, 12, 2)));
                           A42EmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( edtEmpresaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEmpresaId_Internalname, GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
                           A31CfgComprobanteId = httpContext.cgiGet( edtCfgComprobanteId_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteId_Internalname, A31CfgComprobanteId);
                           A32CfgComprobantePrefijo = (short)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobantePrefijo_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
                           A55ComprobanteNumero = (int)(localUtil.ctol( httpContext.cgiGet( edtComprobanteNumero_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtComprobanteNumero_Internalname, GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
                           cmbCfgComprobanteDetalleLetra.setName( cmbCfgComprobanteDetalleLetra.getInternalname() );
                           cmbCfgComprobanteDetalleLetra.setValue( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()) );
                           A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e140W2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e150W2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Carticuloid Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCARTICULOID"), AV6cArticuloId) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccomprobantearticulocantidad Changed */
                                    if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCCOMPROBANTEARTICULOCANTIDAD")), AV7cComprobanteArticuloCantidad) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e160W2 ();
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

   public void we0W2( )
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

   public void pa0W2( )
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
         GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_34_idx ;
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
      subsflControlProps_342( ) ;
      while ( nGXsfl_34_idx <= nRC_GXsfl_34 )
      {
         sendrow_342( ) ;
         nGXsfl_34_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_34_idx+1)) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cArticuloId ,
                                  java.math.BigDecimal AV7cComprobanteArticuloCantidad ,
                                  int AV8pEmpresaId ,
                                  String AV9pCfgComprobanteId ,
                                  short AV10pCfgComprobantePrefijo ,
                                  int AV11pComprobanteNumero ,
                                  byte AV12pCfgComprobanteDetalleLetra )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0W2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0W2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0W2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(34) ;
      nGXsfl_34_idx = (short)(1) ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_342( ) ;
      nGXsfl_34_Refreshing = (short)(1) ;
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
         subsflControlProps_342( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cComprobanteArticuloCantidad ,
                                              A64ComprobanteArticuloCantidad ,
                                              A39ArticuloId ,
                                              AV6cArticuloId ,
                                              new Integer(AV8pEmpresaId) ,
                                              AV9pCfgComprobanteId ,
                                              new Short(AV10pCfgComprobantePrefijo) ,
                                              new Integer(AV11pComprobanteNumero) ,
                                              new Byte(AV12pCfgComprobanteDetalleLetra) ,
                                              new Integer(A42EmpresaId) ,
                                              A31CfgComprobanteId ,
                                              new Short(A32CfgComprobantePrefijo) ,
                                              new Integer(A55ComprobanteNumero) ,
                                              new Byte(A35CfgComprobanteDetalleLetra) } ,
                                              new int[]{
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE
                                              }
         } ) ;
         lV6cArticuloId = GXutil.concat( GXutil.rtrim( AV6cArticuloId), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cArticuloId", AV6cArticuloId);
         /* Using cursor H000W2 */
         pr_default.execute(0, new Object[] {new Integer(AV8pEmpresaId), AV9pCfgComprobanteId, new Short(AV10pCfgComprobantePrefijo), new Integer(AV11pComprobanteNumero), new Byte(AV12pCfgComprobanteDetalleLetra), lV6cArticuloId, AV7cComprobanteArticuloCantidad, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_34_idx = (short)(1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_342( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A35CfgComprobanteDetalleLetra = H000W2_A35CfgComprobanteDetalleLetra[0] ;
            httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
            A55ComprobanteNumero = H000W2_A55ComprobanteNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtComprobanteNumero_Internalname, GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
            A32CfgComprobantePrefijo = H000W2_A32CfgComprobantePrefijo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            A31CfgComprobanteId = H000W2_A31CfgComprobanteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteId_Internalname, A31CfgComprobanteId);
            A42EmpresaId = H000W2_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaId_Internalname, GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            A66ComprobanteArticuloTotal = H000W2_A66ComprobanteArticuloTotal[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloTotal_Internalname, GXutil.ltrim( GXutil.str( A66ComprobanteArticuloTotal, 12, 2)));
            A65ComprobanteArticuloPrecioUnit = H000W2_A65ComprobanteArticuloPrecioUnit[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloPrecioUnit_Internalname, GXutil.ltrim( GXutil.str( A65ComprobanteArticuloPrecioUnit, 12, 2)));
            A64ComprobanteArticuloCantidad = H000W2_A64ComprobanteArticuloCantidad[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloCantidad_Internalname, GXutil.ltrim( GXutil.str( A64ComprobanteArticuloCantidad, 10, 3)));
            A39ArticuloId = H000W2_A39ArticuloId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtArticuloId_Internalname, A39ArticuloId);
            /* Execute user event: Load */
            e150W2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(34) ;
         wb0W0( ) ;
      }
      nGXsfl_34_Refreshing = (short)(0) ;
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
                                           AV7cComprobanteArticuloCantidad ,
                                           A64ComprobanteArticuloCantidad ,
                                           A39ArticuloId ,
                                           AV6cArticuloId ,
                                           new Integer(AV8pEmpresaId) ,
                                           AV9pCfgComprobanteId ,
                                           new Short(AV10pCfgComprobantePrefijo) ,
                                           new Integer(AV11pComprobanteNumero) ,
                                           new Byte(AV12pCfgComprobanteDetalleLetra) ,
                                           new Integer(A42EmpresaId) ,
                                           A31CfgComprobanteId ,
                                           new Short(A32CfgComprobantePrefijo) ,
                                           new Integer(A55ComprobanteNumero) ,
                                           new Byte(A35CfgComprobanteDetalleLetra) } ,
                                           new int[]{
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE
                                           }
      } ) ;
      lV6cArticuloId = GXutil.concat( GXutil.rtrim( AV6cArticuloId), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cArticuloId", AV6cArticuloId);
      /* Using cursor H000W3 */
      pr_default.execute(1, new Object[] {new Integer(AV8pEmpresaId), AV9pCfgComprobanteId, new Short(AV10pCfgComprobantePrefijo), new Integer(AV11pComprobanteNumero), new Byte(AV12pCfgComprobanteDetalleLetra), lV6cArticuloId, AV7cComprobanteArticuloCantidad});
      GRID1_nRecordCount = H000W3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cComprobanteArticuloCantidad, AV8pEmpresaId, AV9pCfgComprobanteId, AV10pCfgComprobantePrefijo, AV11pComprobanteNumero, AV12pCfgComprobanteDetalleLetra) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cComprobanteArticuloCantidad, AV8pEmpresaId, AV9pCfgComprobanteId, AV10pCfgComprobantePrefijo, AV11pComprobanteNumero, AV12pCfgComprobanteDetalleLetra) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cComprobanteArticuloCantidad, AV8pEmpresaId, AV9pCfgComprobanteId, AV10pCfgComprobantePrefijo, AV11pComprobanteNumero, AV12pCfgComprobanteDetalleLetra) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cComprobanteArticuloCantidad, AV8pEmpresaId, AV9pCfgComprobanteId, AV10pCfgComprobantePrefijo, AV11pComprobanteNumero, AV12pCfgComprobanteDetalleLetra) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cComprobanteArticuloCantidad, AV8pEmpresaId, AV9pCfgComprobanteId, AV10pCfgComprobantePrefijo, AV11pComprobanteNumero, AV12pCfgComprobanteDetalleLetra) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0W0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e140W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cArticuloId = httpContext.cgiGet( edtavCarticuloid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cArticuloId", AV6cArticuloId);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCcomprobantearticulocantidad_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcomprobantearticulocantidad_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCOMPROBANTEARTICULOCANTIDAD");
            GX_FocusControl = edtavCcomprobantearticulocantidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cComprobanteArticuloCantidad = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cComprobanteArticuloCantidad", GXutil.ltrim( GXutil.str( AV7cComprobanteArticuloCantidad, 10, 3)));
         }
         else
         {
            AV7cComprobanteArticuloCantidad = localUtil.ctond( httpContext.cgiGet( edtavCcomprobantearticulocantidad_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cComprobanteArticuloCantidad", GXutil.ltrim( GXutil.str( AV7cComprobanteArticuloCantidad, 10, 3)));
         }
         /* Read saved values. */
         nRC_GXsfl_34 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_34"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCARTICULOID"), AV6cArticuloId) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCCOMPROBANTEARTICULOCANTIDAD")), AV7cComprobanteArticuloCantidad) != 0 )
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
      e140W2 ();
      if (returnInSub) return;
   }

   public void e140W2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Articulo", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e150W2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_342( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ( nGXsfl_34_Refreshing == 0 ) )
      {
         httpContext.doAjaxLoad(34, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e160W2 ();
      if (returnInSub) return;
   }

   public void e160W2( )
   {
      /* Enter Routine */
      AV13pArticuloId = A39ArticuloId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pArticuloId", AV13pArticuloId);
      httpContext.setWebReturnParms(new Object[] {AV13pArticuloId});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV8pEmpresaId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8pEmpresaId", GXutil.ltrim( GXutil.str( AV8pEmpresaId, 6, 0)));
      AV9pCfgComprobanteId = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pCfgComprobanteId", AV9pCfgComprobanteId);
      AV10pCfgComprobantePrefijo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV10pCfgComprobantePrefijo, 4, 0)));
      AV11pComprobanteNumero = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pComprobanteNumero", GXutil.ltrim( GXutil.str( AV11pComprobanteNumero, 8, 0)));
      AV12pCfgComprobanteDetalleLetra = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV12pCfgComprobanteDetalleLetra, 2, 0)));
      AV13pArticuloId = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pArticuloId", AV13pArticuloId);
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
      pa0W2( ) ;
      ws0W2( ) ;
      we0W2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?15445365");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721915452089");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx00v5.js", "?201721915452089");
      /* End function include_jscripts */
   }

   public void subsflControlProps_342( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_34_idx ;
      edtArticuloId_Internalname = "ARTICULOID_"+sGXsfl_34_idx ;
      edtComprobanteArticuloCantidad_Internalname = "COMPROBANTEARTICULOCANTIDAD_"+sGXsfl_34_idx ;
      edtComprobanteArticuloPrecioUnit_Internalname = "COMPROBANTEARTICULOPRECIOUNIT_"+sGXsfl_34_idx ;
      edtComprobanteArticuloTotal_Internalname = "COMPROBANTEARTICULOTOTAL_"+sGXsfl_34_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_34_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_34_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_34_idx ;
      edtComprobanteNumero_Internalname = "COMPROBANTENUMERO_"+sGXsfl_34_idx ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_34_idx );
   }

   public void subsflControlProps_fel_342( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_34_fel_idx ;
      edtArticuloId_Internalname = "ARTICULOID_"+sGXsfl_34_fel_idx ;
      edtComprobanteArticuloCantidad_Internalname = "COMPROBANTEARTICULOCANTIDAD_"+sGXsfl_34_fel_idx ;
      edtComprobanteArticuloPrecioUnit_Internalname = "COMPROBANTEARTICULOPRECIOUNIT_"+sGXsfl_34_fel_idx ;
      edtComprobanteArticuloTotal_Internalname = "COMPROBANTEARTICULOTOTAL_"+sGXsfl_34_fel_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_34_fel_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_34_fel_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_34_fel_idx ;
      edtComprobanteNumero_Internalname = "COMPROBANTENUMERO_"+sGXsfl_34_fel_idx ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_34_fel_idx );
   }

   public void sendrow_342( )
   {
      subsflControlProps_342( ) ;
      wb0W0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_34_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_34_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_34_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A39ArticuloId)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArticuloId_Internalname,A39ArticuloId,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArticuloId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"IdArticulo","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteArticuloCantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A64ComprobanteArticuloCantidad, (byte)(10), (byte)(3), ",", "")),localUtil.format( A64ComprobanteArticuloCantidad, "ZZZZZ9.999"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteArticuloCantidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Cantidades","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteArticuloPrecioUnit_Internalname,GXutil.ltrim( localUtil.ntoc( A65ComprobanteArticuloPrecioUnit, (byte)(12), (byte)(2), ",", "")),localUtil.format( A65ComprobanteArticuloPrecioUnit, "ZZZZZZZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteArticuloPrecioUnit_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(12),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Importes","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteArticuloTotal_Internalname,GXutil.ltrim( localUtil.ntoc( A66ComprobanteArticuloTotal, (byte)(12), (byte)(2), ",", "")),localUtil.format( A66ComprobanteArticuloTotal, "ZZZZZZZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteArticuloTotal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(12),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Importes","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaId_Internalname,GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasMaestras","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteId_Internalname,A31CfgComprobanteId,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobanteId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"IdCfgComprobanteId","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobantePrefijo_Internalname,GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A32CfgComprobantePrefijo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobantePrefijo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobantePrefijo","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteNumero_Internalname,GXutil.ltrim( localUtil.ntoc( A55ComprobanteNumero, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A55ComprobanteNumero), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteNumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobanteNumero","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_34_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_34_idx ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCfgComprobanteDetalleLetra,cmbCfgComprobanteDetalleLetra.getInternalname(),GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)),new Integer(1),cmbCfgComprobanteDetalleLetra.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","","","",new Boolean(true)});
         cmbCfgComprobanteDetalleLetra.setValue( GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Values", cmbCfgComprobanteDetalleLetra.ToJavascriptSource());
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_34_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_34_idx+1)) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      /* End function sendrow_342 */
   }

   public void init_default_properties( )
   {
      lblLblarticuloidfilter_Internalname = "LBLARTICULOIDFILTER" ;
      edtavCarticuloid_Internalname = "vCARTICULOID" ;
      divArticuloidfiltercontainer_Internalname = "ARTICULOIDFILTERCONTAINER" ;
      lblLblcomprobantearticulocantidadfilter_Internalname = "LBLCOMPROBANTEARTICULOCANTIDADFILTER" ;
      edtavCcomprobantearticulocantidad_Internalname = "vCCOMPROBANTEARTICULOCANTIDAD" ;
      divComprobantearticulocantidadfiltercontainer_Internalname = "COMPROBANTEARTICULOCANTIDADFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtArticuloId_Internalname = "ARTICULOID" ;
      edtComprobanteArticuloCantidad_Internalname = "COMPROBANTEARTICULOCANTIDAD" ;
      edtComprobanteArticuloPrecioUnit_Internalname = "COMPROBANTEARTICULOPRECIOUNIT" ;
      edtComprobanteArticuloTotal_Internalname = "COMPROBANTEARTICULOTOTAL" ;
      edtEmpresaId_Internalname = "EMPRESAID" ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID" ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO" ;
      edtComprobanteNumero_Internalname = "COMPROBANTENUMERO" ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA" );
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
      cmbCfgComprobanteDetalleLetra.setJsonclick( "" );
      edtComprobanteNumero_Jsonclick = "" ;
      edtCfgComprobantePrefijo_Jsonclick = "" ;
      edtCfgComprobanteId_Jsonclick = "" ;
      edtEmpresaId_Jsonclick = "" ;
      edtComprobanteArticuloTotal_Jsonclick = "" ;
      edtComprobanteArticuloPrecioUnit_Jsonclick = "" ;
      edtComprobanteArticuloCantidad_Jsonclick = "" ;
      edtArticuloId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCcomprobantearticulocantidad_Jsonclick = "" ;
      edtavCcomprobantearticulocantidad_Enabled = 1 ;
      edtavCcomprobantearticulocantidad_Visible = 1 ;
      edtavCarticuloid_Jsonclick = "" ;
      edtavCarticuloid_Enabled = 1 ;
      edtavCarticuloid_Visible = 1 ;
      divComprobantearticulocantidadfiltercontainer_Class = "AdvancedContainerItem" ;
      divArticuloidfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Articulo" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cComprobanteArticuloCantidad',fld:'vCCOMPROBANTEARTICULOCANTIDAD'},{av:'AV8pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV9pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV10pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true},{av:'AV11pComprobanteNumero',fld:'vPCOMPROBANTENUMERO',hsh:true},{av:'AV12pCfgComprobanteDetalleLetra',fld:'vPCFGCOMPROBANTEDETALLELETRA',hsh:true}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e130W1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLARTICULOIDFILTER.CLICK","{handler:'e110W1',iparms:[{av:'divArticuloidfiltercontainer_Class',ctrl:'ARTICULOIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divArticuloidfiltercontainer_Class',ctrl:'ARTICULOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCarticuloid_Visible',ctrl:'vCARTICULOID',prop:'Visible'}]}");
      setEventMetadata("LBLCOMPROBANTEARTICULOCANTIDADFILTER.CLICK","{handler:'e120W1',iparms:[{av:'divComprobantearticulocantidadfiltercontainer_Class',ctrl:'COMPROBANTEARTICULOCANTIDADFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divComprobantearticulocantidadfiltercontainer_Class',ctrl:'COMPROBANTEARTICULOCANTIDADFILTERCONTAINER',prop:'Class'},{av:'edtavCcomprobantearticulocantidad_Visible',ctrl:'vCCOMPROBANTEARTICULOCANTIDAD',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e160W2',iparms:[{av:'A39ArticuloId',fld:'ARTICULOID'}],oparms:[{av:'AV13pArticuloId',fld:'vPARTICULOID'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cComprobanteArticuloCantidad',fld:'vCCOMPROBANTEARTICULOCANTIDAD'},{av:'AV8pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV9pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV10pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true},{av:'AV11pComprobanteNumero',fld:'vPCOMPROBANTENUMERO',hsh:true},{av:'AV12pCfgComprobanteDetalleLetra',fld:'vPCFGCOMPROBANTEDETALLELETRA',hsh:true}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cComprobanteArticuloCantidad',fld:'vCCOMPROBANTEARTICULOCANTIDAD'},{av:'AV8pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV9pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV10pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true},{av:'AV11pComprobanteNumero',fld:'vPCOMPROBANTENUMERO',hsh:true},{av:'AV12pCfgComprobanteDetalleLetra',fld:'vPCFGCOMPROBANTEDETALLELETRA',hsh:true}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cComprobanteArticuloCantidad',fld:'vCCOMPROBANTEARTICULOCANTIDAD'},{av:'AV8pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV9pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV10pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true},{av:'AV11pComprobanteNumero',fld:'vPCOMPROBANTENUMERO',hsh:true},{av:'AV12pCfgComprobanteDetalleLetra',fld:'vPCFGCOMPROBANTEDETALLELETRA',hsh:true}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cComprobanteArticuloCantidad',fld:'vCCOMPROBANTEARTICULOCANTIDAD'},{av:'AV8pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV9pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID',hsh:true},{av:'AV10pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO',hsh:true},{av:'AV11pComprobanteNumero',fld:'vPCOMPROBANTENUMERO',hsh:true},{av:'AV12pCfgComprobanteDetalleLetra',fld:'vPCFGCOMPROBANTEDETALLELETRA',hsh:true}],oparms:[]}");
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
      wcpOAV9pCfgComprobanteId = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6cArticuloId = "" ;
      AV7cComprobanteArticuloCantidad = DecimalUtil.ZERO ;
      AV13pArticuloId = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblarticuloidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblcomprobantearticulocantidadfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A39ArticuloId = "" ;
      A64ComprobanteArticuloCantidad = DecimalUtil.ZERO ;
      A65ComprobanteArticuloPrecioUnit = DecimalUtil.ZERO ;
      A66ComprobanteArticuloTotal = DecimalUtil.ZERO ;
      A31CfgComprobanteId = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXKey = "" ;
      GXCCtl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV6cArticuloId = "" ;
      H000W2_A35CfgComprobanteDetalleLetra = new byte[1] ;
      H000W2_A55ComprobanteNumero = new int[1] ;
      H000W2_A32CfgComprobantePrefijo = new short[1] ;
      H000W2_A31CfgComprobanteId = new String[] {""} ;
      H000W2_A42EmpresaId = new int[1] ;
      H000W2_A66ComprobanteArticuloTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H000W2_A65ComprobanteArticuloPrecioUnit = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H000W2_A64ComprobanteArticuloCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H000W2_A39ArticuloId = new String[] {""} ;
      H000W3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx00v5__default(),
         new Object[] {
             new Object[] {
            H000W2_A35CfgComprobanteDetalleLetra, H000W2_A55ComprobanteNumero, H000W2_A32CfgComprobantePrefijo, H000W2_A31CfgComprobanteId, H000W2_A42EmpresaId, H000W2_A66ComprobanteArticuloTotal, H000W2_A65ComprobanteArticuloPrecioUnit, H000W2_A64ComprobanteArticuloCantidad, H000W2_A39ArticuloId
            }
            , new Object[] {
            H000W3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV12pCfgComprobanteDetalleLetra ;
   private byte nGotPars ;
   private byte GxWebError ;
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
   private short wcpOAV10pCfgComprobantePrefijo ;
   private short nRC_GXsfl_34 ;
   private short nGXsfl_34_idx=1 ;
   private short AV10pCfgComprobantePrefijo ;
   private short wbEnd ;
   private short wbStart ;
   private short A32CfgComprobantePrefijo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_34_Refreshing=0 ;
   private int wcpOAV8pEmpresaId ;
   private int wcpOAV11pComprobanteNumero ;
   private int subGrid1_Rows ;
   private int AV8pEmpresaId ;
   private int AV11pComprobanteNumero ;
   private int edtavCarticuloid_Visible ;
   private int edtavCarticuloid_Enabled ;
   private int edtavCcomprobantearticulocantidad_Enabled ;
   private int edtavCcomprobantearticulocantidad_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A42EmpresaId ;
   private int A55ComprobanteNumero ;
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
   private java.math.BigDecimal AV7cComprobanteArticuloCantidad ;
   private java.math.BigDecimal A64ComprobanteArticuloCantidad ;
   private java.math.BigDecimal A65ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal A66ComprobanteArticuloTotal ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divArticuloidfiltercontainer_Class ;
   private String divComprobantearticulocantidadfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_34_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divArticuloidfiltercontainer_Internalname ;
   private String lblLblarticuloidfilter_Internalname ;
   private String lblLblarticuloidfilter_Jsonclick ;
   private String edtavCarticuloid_Internalname ;
   private String TempTags ;
   private String edtavCarticuloid_Jsonclick ;
   private String divComprobantearticulocantidadfiltercontainer_Internalname ;
   private String lblLblcomprobantearticulocantidadfilter_Internalname ;
   private String lblLblcomprobantearticulocantidadfilter_Jsonclick ;
   private String edtavCcomprobantearticulocantidad_Internalname ;
   private String edtavCcomprobantearticulocantidad_Jsonclick ;
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
   private String edtArticuloId_Internalname ;
   private String edtComprobanteArticuloCantidad_Internalname ;
   private String edtComprobanteArticuloPrecioUnit_Internalname ;
   private String edtComprobanteArticuloTotal_Internalname ;
   private String edtEmpresaId_Internalname ;
   private String edtCfgComprobanteId_Internalname ;
   private String edtCfgComprobantePrefijo_Internalname ;
   private String edtComprobanteNumero_Internalname ;
   private String GXKey ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtArticuloId_Jsonclick ;
   private String edtComprobanteArticuloCantidad_Jsonclick ;
   private String edtComprobanteArticuloPrecioUnit_Jsonclick ;
   private String edtComprobanteArticuloTotal_Jsonclick ;
   private String edtEmpresaId_Jsonclick ;
   private String edtCfgComprobanteId_Jsonclick ;
   private String edtCfgComprobantePrefijo_Jsonclick ;
   private String edtComprobanteNumero_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String wcpOAV9pCfgComprobanteId ;
   private String AV6cArticuloId ;
   private String AV9pCfgComprobanteId ;
   private String AV13pArticuloId ;
   private String A39ArticuloId ;
   private String A31CfgComprobanteId ;
   private String AV17Linkselection_GXI ;
   private String lV6cArticuloId ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbCfgComprobanteDetalleLetra ;
   private IDataStoreProvider pr_default ;
   private byte[] H000W2_A35CfgComprobanteDetalleLetra ;
   private int[] H000W2_A55ComprobanteNumero ;
   private short[] H000W2_A32CfgComprobantePrefijo ;
   private String[] H000W2_A31CfgComprobanteId ;
   private int[] H000W2_A42EmpresaId ;
   private java.math.BigDecimal[] H000W2_A66ComprobanteArticuloTotal ;
   private java.math.BigDecimal[] H000W2_A65ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal[] H000W2_A64ComprobanteArticuloCantidad ;
   private String[] H000W2_A39ArticuloId ;
   private long[] H000W3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00v5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.math.BigDecimal AV7cComprobanteArticuloCantidad ,
                                          java.math.BigDecimal A64ComprobanteArticuloCantidad ,
                                          String A39ArticuloId ,
                                          String AV6cArticuloId ,
                                          int AV8pEmpresaId ,
                                          String AV9pCfgComprobanteId ,
                                          short AV10pCfgComprobantePrefijo ,
                                          int AV11pComprobanteNumero ,
                                          byte AV12pCfgComprobanteDetalleLetra ,
                                          int A42EmpresaId ,
                                          String A31CfgComprobanteId ,
                                          short A32CfgComprobantePrefijo ,
                                          int A55ComprobanteNumero ,
                                          byte A35CfgComprobanteDetalleLetra )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [10] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " CfgComprobanteDetalleLetra, ComprobanteNumero, CfgComprobantePrefijo, CfgComprobanteId," ;
      sSelectString = sSelectString + " EmpresaId, ComprobanteArticuloTotal, ComprobanteArticuloPrecioUnit, ComprobanteArticuloCantidad," ;
      sSelectString = sSelectString + " ArticuloId" ;
      sFromString = " FROM ComprobanteArticulo" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (EmpresaId = ? and CfgComprobanteId = ( ?) and CfgComprobantePrefijo = ? and ComprobanteNumero = ? and CfgComprobanteDetalleLetra = ?)" ;
      sWhereString = sWhereString + " and (ArticuloId like ?)" ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV7cComprobanteArticuloCantidad)==0) )
      {
         sWhereString = sWhereString + " and (ComprobanteArticuloCantidad >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY EmpresaId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ArticuloId" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000W3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.math.BigDecimal AV7cComprobanteArticuloCantidad ,
                                          java.math.BigDecimal A64ComprobanteArticuloCantidad ,
                                          String A39ArticuloId ,
                                          String AV6cArticuloId ,
                                          int AV8pEmpresaId ,
                                          String AV9pCfgComprobanteId ,
                                          short AV10pCfgComprobantePrefijo ,
                                          int AV11pComprobanteNumero ,
                                          byte AV12pCfgComprobanteDetalleLetra ,
                                          int A42EmpresaId ,
                                          String A31CfgComprobanteId ,
                                          short A32CfgComprobantePrefijo ,
                                          int A55ComprobanteNumero ,
                                          byte A35CfgComprobanteDetalleLetra )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ComprobanteArticulo" ;
      scmdbuf = scmdbuf + " WHERE (EmpresaId = ? and CfgComprobanteId = ( ?) and CfgComprobantePrefijo = ? and ComprobanteNumero = ? and CfgComprobanteDetalleLetra = ?)" ;
      scmdbuf = scmdbuf + " and (ArticuloId like ?)" ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV7cComprobanteArticuloCantidad)==0) )
      {
         sWhereString = sWhereString + " and (ComprobanteArticuloCantidad >= ?)" ;
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
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
                  return conditional_H000W2(context, remoteHandle, httpContext, (java.math.BigDecimal)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() );
            case 1 :
                  return conditional_H000W3(context, remoteHandle, httpContext, (java.math.BigDecimal)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2) ;
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2) ;
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 15);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 15);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[13], 3);
               }
               return;
      }
   }

}

