/*
               File: gx00u0_impl
        Description: Selection List Comprobante
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 15:45:19.15
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

public final  class gx00u0_impl extends GXDataArea
{
   public gx00u0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00u0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00u0_impl.class ));
   }

   public gx00u0_impl( int remoteHandle ,
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
            nRC_GXsfl_84 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_84_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_84_idx = httpContext.GetNextPar( ) ;
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
            AV6cEmpresaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cCfgComprobanteId = httpContext.GetNextPar( ) ;
            AV8cCfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cComprobanteNumero = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10cCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11cComprobanteFecha = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            AV12cComprobanteFechaSubdiario = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cCfgComprobanteId, AV8cCfgComprobantePrefijo, AV9cComprobanteNumero, AV10cCfgComprobanteDetalleLetra, AV11cComprobanteFecha, AV12cComprobanteFechaSubdiario) ;
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
            AV13pEmpresaId = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pEmpresaId", GXutil.ltrim( GXutil.str( AV13pEmpresaId, 6, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14pCfgComprobanteId = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pCfgComprobanteId", AV14pCfgComprobanteId);
               AV15pCfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV15pCfgComprobantePrefijo, 4, 0)));
               AV16pComprobanteNumero = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16pComprobanteNumero", GXutil.ltrim( GXutil.str( AV16pComprobanteNumero, 8, 0)));
               AV17pCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV17pCfgComprobanteDetalleLetra, 2, 0)));
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
      pa0V2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0V2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721915451925");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 109402));
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx00u0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEmpresaId,6,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15pCfgComprobantePrefijo,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16pComprobanteNumero,8,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17pCfgComprobanteDetalleLetra,2,0)))+"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEMPRESAID", GXutil.ltrim( localUtil.ntoc( AV6cEmpresaId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEID", AV7cCfgComprobanteId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEPREFIJO", GXutil.ltrim( localUtil.ntoc( AV8cCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCOMPROBANTENUMERO", GXutil.ltrim( localUtil.ntoc( AV9cComprobanteNumero, (byte)(8), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCFGCOMPROBANTEDETALLELETRA", GXutil.ltrim( localUtil.ntoc( AV10cCfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCOMPROBANTEFECHA", localUtil.format(AV11cComprobanteFecha, "99/99/99"));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCOMPROBANTEFECHASUBDIARIO", localUtil.format(AV12cComprobanteFechaSubdiario, "99/99/99"));
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPEMPRESAID", GXutil.ltrim( localUtil.ntoc( AV13pEmpresaId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEID", AV14pCfgComprobanteId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEPREFIJO", GXutil.ltrim( localUtil.ntoc( AV15pCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCOMPROBANTENUMERO", GXutil.ltrim( localUtil.ntoc( AV16pComprobanteNumero, (byte)(8), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPCFGCOMPROBANTEDETALLELETRA", GXutil.ltrim( localUtil.ntoc( AV17pCfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESAIDFILTERCONTAINER_Class", GXutil.rtrim( divEmpresaidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEIDFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobanteidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEPREFIJOFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobanteprefijofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "COMPROBANTENUMEROFILTERCONTAINER_Class", GXutil.rtrim( divComprobantenumerofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER_Class", GXutil.rtrim( divCfgcomprobantedetalleletrafiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "COMPROBANTEFECHAFILTERCONTAINER_Class", GXutil.rtrim( divComprobantefechafiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "COMPROBANTEFECHASUBDIARIOFILTERCONTAINER_Class", GXutil.rtrim( divComprobantefechasubdiariofiltercontainer_Class));
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
         we0V2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0V2( ) ;
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
      return formatLink("com.kberp.gx00u0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEmpresaId,6,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pCfgComprobanteId)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15pCfgComprobantePrefijo,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16pComprobanteNumero,8,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17pCfgComprobanteDetalleLetra,2,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00U0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Comprobante" ;
   }

   public void wb0V0( )
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEmpresaidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divEmpresaidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblempresaidfilter_Internalname, "Empresa Id", "", "", lblLblempresaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00U0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCempresaid_Internalname, "Empresa Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCempresaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cEmpresaId, (byte)(6), (byte)(0), ",", "")), ((edtavCempresaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cEmpresaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cEmpresaId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCempresaid_Jsonclick, 0, "Attribute", "", "", "", edtavCempresaid_Visible, edtavCempresaid_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00U0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divCfgcomprobanteidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCfgcomprobanteidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobanteidfilter_Internalname, "Cfg Comprobante Id", "", "", lblLblcfgcomprobanteidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00U0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobanteid_Internalname, AV7cCfgComprobanteId, GXutil.rtrim( localUtil.format( AV7cCfgComprobanteId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobanteid_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobanteid_Visible, edtavCcfgcomprobanteid_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00U0.htm");
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobanteprefijofilter_Internalname, "Cfg Comprobante Prefijo", "", "", lblLblcfgcomprobanteprefijofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00U0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcfgcomprobanteprefijo_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cCfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")), ((edtavCcfgcomprobanteprefijo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cCfgComprobantePrefijo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cCfgComprobantePrefijo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfgcomprobanteprefijo_Jsonclick, 0, "Attribute", "", "", "", edtavCcfgcomprobanteprefijo_Visible, edtavCcfgcomprobanteprefijo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00U0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divComprobantenumerofiltercontainer_Internalname, 1, 0, "px", 0, "px", divComprobantenumerofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcomprobantenumerofilter_Internalname, "Comprobante Numero", "", "", lblLblcomprobantenumerofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00U0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcomprobantenumero_Internalname, "Comprobante Numero", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcomprobantenumero_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cComprobanteNumero, (byte)(8), (byte)(0), ",", "")), ((edtavCcomprobantenumero_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cComprobanteNumero), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cComprobanteNumero), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcomprobantenumero_Jsonclick, 0, "Attribute", "", "", "", edtavCcomprobantenumero_Visible, edtavCcomprobantenumero_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00U0.htm");
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcfgcomprobantedetalleletrafilter_Internalname, "Cfg Comprobante Detalle Letra", "", "", lblLblcfgcomprobantedetalleletrafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00U0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.kberp.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCcfgcomprobantedetalleletra, cmbavCcfgcomprobantedetalleletra.getInternalname(), GXutil.trim( GXutil.str( AV10cCfgComprobanteDetalleLetra, 2, 0)), 1, cmbavCcfgcomprobantedetalleletra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavCcfgcomprobantedetalleletra.getVisible(), cmbavCcfgcomprobantedetalleletra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "", true, "HLP_Gx00U0.htm");
         cmbavCcfgcomprobantedetalleletra.setValue( GXutil.trim( GXutil.str( AV10cCfgComprobanteDetalleLetra, 2, 0)) );
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divComprobantefechafiltercontainer_Internalname, 1, 0, "px", 0, "px", divComprobantefechafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcomprobantefechafilter_Internalname, "Comprobante Fecha", "", "", lblLblcomprobantefechafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160v1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00U0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcomprobantefecha_Internalname, "Comprobante Fecha", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCcomprobantefecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcomprobantefecha_Internalname, localUtil.format(AV11cComprobanteFecha, "99/99/99"), localUtil.format( AV11cComprobanteFecha, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcomprobantefecha_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCcomprobantefecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00U0.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divComprobantefechasubdiariofiltercontainer_Internalname, 1, 0, "px", 0, "px", divComprobantefechasubdiariofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcomprobantefechasubdiariofilter_Internalname, "Comprobante Fecha Subdiario", "", "", lblLblcomprobantefechasubdiariofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e170v1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00U0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcomprobantefechasubdiario_Internalname, "Comprobante Fecha Subdiario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCcomprobantefechasubdiario_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcomprobantefechasubdiario_Internalname, localUtil.format(AV12cComprobanteFechaSubdiario, "99/99/99"), localUtil.format( AV12cComprobanteFechaSubdiario, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcomprobantefechasubdiario_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCcomprobantefechasubdiario_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00U0.htm");
         httpContext.writeTextNL( "</div>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e180v1_client"+"'", TempTags, "", 2, "HLP_Gx00U0.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"84\">") ;
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
            httpContext.writeValue( "Empresa Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cfg Comprobante Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cfg Comprobante Prefijo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Numero") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cfg Comprobante Detalle Letra") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Moneda Id") ;
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
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A61ComprobanteFecha, "99/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A67MonedaId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 84 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_84 = (short)(nGXsfl_84_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00U0.htm");
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

   public void start0V2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_2-109402", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Comprobante", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0V0( ) ;
   }

   public void ws0V2( )
   {
      start0V2( ) ;
      evt0V2( ) ;
   }

   public void evt0V2( )
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
                           nGXsfl_84_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_842( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV21Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))));
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection));
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
                           A61ComprobanteFecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtComprobanteFecha_Internalname), 0)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtComprobanteFecha_Internalname, localUtil.format(A61ComprobanteFecha, "99/99/99"));
                           A67MonedaId = (short)(localUtil.ctol( httpContext.cgiGet( edtMonedaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtMonedaId_Internalname, GXutil.ltrim( GXutil.str( A67MonedaId, 4, 0)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e190V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e200V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cempresaid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEMPRESAID"), ",", ".") != AV6cEmpresaId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobanteid Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEID"), AV7cCfgComprobanteId) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobanteprefijo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEPREFIJO"), ",", ".") != AV8cCfgComprobantePrefijo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccomprobantenumero Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCOMPROBANTENUMERO"), ",", ".") != AV9cComprobanteNumero )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccfgcomprobantedetalleletra Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLELETRA"), ",", ".") != AV10cCfgComprobanteDetalleLetra )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccomprobantefecha Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCCOMPROBANTEFECHA"), 0), AV11cComprobanteFecha) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccomprobantefechasubdiario Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCCOMPROBANTEFECHASUBDIARIO"), 0), AV12cComprobanteFechaSubdiario) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e210V2 ();
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

   public void we0V2( )
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

   public void pa0V2( )
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
            AV10cCfgComprobanteDetalleLetra = (byte)(GXutil.lval( cmbavCcfgcomprobantedetalleletra.getValidValue(GXutil.trim( GXutil.str( AV10cCfgComprobanteDetalleLetra, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV10cCfgComprobanteDetalleLetra, 2, 0)));
         }
         GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_84_idx ;
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
      subsflControlProps_842( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         sendrow_842( ) ;
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int AV6cEmpresaId ,
                                  String AV7cCfgComprobanteId ,
                                  short AV8cCfgComprobantePrefijo ,
                                  int AV9cComprobanteNumero ,
                                  byte AV10cCfgComprobanteDetalleLetra ,
                                  java.util.Date AV11cComprobanteFecha ,
                                  java.util.Date AV12cComprobanteFechaSubdiario )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0V2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0V2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0V2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(84) ;
      nGXsfl_84_idx = (short)(1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_842( ) ;
      nGXsfl_84_Refreshing = (short)(1) ;
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
         subsflControlProps_842( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV11cComprobanteFecha ,
                                              AV12cComprobanteFechaSubdiario ,
                                              A61ComprobanteFecha ,
                                              A62ComprobanteFechaSubdiario ,
                                              A31CfgComprobanteId ,
                                              AV7cCfgComprobanteId ,
                                              new Short(A32CfgComprobantePrefijo) ,
                                              new Short(AV8cCfgComprobantePrefijo) ,
                                              new Integer(A55ComprobanteNumero) ,
                                              new Integer(AV9cComprobanteNumero) ,
                                              new Byte(A35CfgComprobanteDetalleLetra) ,
                                              new Byte(AV10cCfgComprobanteDetalleLetra) ,
                                              new Integer(AV6cEmpresaId) } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT
                                              }
         } ) ;
         lV7cCfgComprobanteId = GXutil.concat( GXutil.rtrim( AV7cCfgComprobanteId), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cCfgComprobanteId", AV7cCfgComprobanteId);
         /* Using cursor H000V2 */
         pr_default.execute(0, new Object[] {new Integer(AV6cEmpresaId), lV7cCfgComprobanteId, new Short(AV8cCfgComprobantePrefijo), new Integer(AV9cComprobanteNumero), new Byte(AV10cCfgComprobanteDetalleLetra), AV11cComprobanteFecha, AV12cComprobanteFechaSubdiario, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A62ComprobanteFechaSubdiario = H000V2_A62ComprobanteFechaSubdiario[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A62ComprobanteFechaSubdiario", localUtil.format(A62ComprobanteFechaSubdiario, "99/99/99"));
            A67MonedaId = H000V2_A67MonedaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtMonedaId_Internalname, GXutil.ltrim( GXutil.str( A67MonedaId, 4, 0)));
            A61ComprobanteFecha = H000V2_A61ComprobanteFecha[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtComprobanteFecha_Internalname, localUtil.format(A61ComprobanteFecha, "99/99/99"));
            A35CfgComprobanteDetalleLetra = H000V2_A35CfgComprobanteDetalleLetra[0] ;
            httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
            A55ComprobanteNumero = H000V2_A55ComprobanteNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtComprobanteNumero_Internalname, GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
            A32CfgComprobantePrefijo = H000V2_A32CfgComprobantePrefijo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            A31CfgComprobanteId = H000V2_A31CfgComprobanteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteId_Internalname, A31CfgComprobanteId);
            A42EmpresaId = H000V2_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaId_Internalname, GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            /* Execute user event: Load */
            e200V2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb0V0( ) ;
      }
      nGXsfl_84_Refreshing = (short)(0) ;
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
                                           AV11cComprobanteFecha ,
                                           AV12cComprobanteFechaSubdiario ,
                                           A61ComprobanteFecha ,
                                           A62ComprobanteFechaSubdiario ,
                                           A31CfgComprobanteId ,
                                           AV7cCfgComprobanteId ,
                                           new Short(A32CfgComprobantePrefijo) ,
                                           new Short(AV8cCfgComprobantePrefijo) ,
                                           new Integer(A55ComprobanteNumero) ,
                                           new Integer(AV9cComprobanteNumero) ,
                                           new Byte(A35CfgComprobanteDetalleLetra) ,
                                           new Byte(AV10cCfgComprobanteDetalleLetra) ,
                                           new Integer(AV6cEmpresaId) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT
                                           }
      } ) ;
      lV7cCfgComprobanteId = GXutil.concat( GXutil.rtrim( AV7cCfgComprobanteId), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cCfgComprobanteId", AV7cCfgComprobanteId);
      /* Using cursor H000V3 */
      pr_default.execute(1, new Object[] {new Integer(AV6cEmpresaId), lV7cCfgComprobanteId, new Short(AV8cCfgComprobantePrefijo), new Integer(AV9cComprobanteNumero), new Byte(AV10cCfgComprobanteDetalleLetra), AV11cComprobanteFecha, AV12cComprobanteFechaSubdiario});
      GRID1_nRecordCount = H000V3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cCfgComprobanteId, AV8cCfgComprobantePrefijo, AV9cComprobanteNumero, AV10cCfgComprobanteDetalleLetra, AV11cComprobanteFecha, AV12cComprobanteFechaSubdiario) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cCfgComprobanteId, AV8cCfgComprobantePrefijo, AV9cComprobanteNumero, AV10cCfgComprobanteDetalleLetra, AV11cComprobanteFecha, AV12cComprobanteFechaSubdiario) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cCfgComprobanteId, AV8cCfgComprobantePrefijo, AV9cComprobanteNumero, AV10cCfgComprobanteDetalleLetra, AV11cComprobanteFecha, AV12cComprobanteFechaSubdiario) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cCfgComprobanteId, AV8cCfgComprobantePrefijo, AV9cComprobanteNumero, AV10cCfgComprobanteDetalleLetra, AV11cComprobanteFecha, AV12cComprobanteFechaSubdiario) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cCfgComprobanteId, AV8cCfgComprobantePrefijo, AV9cComprobanteNumero, AV10cCfgComprobanteDetalleLetra, AV11cComprobanteFecha, AV12cComprobanteFechaSubdiario) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0V0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e190V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCempresaid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCempresaid_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCEMPRESAID");
            GX_FocusControl = edtavCempresaid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cEmpresaId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cEmpresaId", GXutil.ltrim( GXutil.str( AV6cEmpresaId, 6, 0)));
         }
         else
         {
            AV6cEmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( edtavCempresaid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cEmpresaId", GXutil.ltrim( GXutil.str( AV6cEmpresaId, 6, 0)));
         }
         AV7cCfgComprobanteId = httpContext.cgiGet( edtavCcfgcomprobanteid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cCfgComprobanteId", AV7cCfgComprobanteId);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobanteprefijo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobanteprefijo_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCFGCOMPROBANTEPREFIJO");
            GX_FocusControl = edtavCcfgcomprobanteprefijo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cCfgComprobantePrefijo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV8cCfgComprobantePrefijo, 4, 0)));
         }
         else
         {
            AV8cCfgComprobantePrefijo = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcfgcomprobanteprefijo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV8cCfgComprobantePrefijo, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcomprobantenumero_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcomprobantenumero_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCOMPROBANTENUMERO");
            GX_FocusControl = edtavCcomprobantenumero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cComprobanteNumero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cComprobanteNumero", GXutil.ltrim( GXutil.str( AV9cComprobanteNumero, 8, 0)));
         }
         else
         {
            AV9cComprobanteNumero = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcomprobantenumero_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cComprobanteNumero", GXutil.ltrim( GXutil.str( AV9cComprobanteNumero, 8, 0)));
         }
         cmbavCcfgcomprobantedetalleletra.setName( cmbavCcfgcomprobantedetalleletra.getInternalname() );
         cmbavCcfgcomprobantedetalleletra.setValue( httpContext.cgiGet( cmbavCcfgcomprobantedetalleletra.getInternalname()) );
         AV10cCfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.cgiGet( cmbavCcfgcomprobantedetalleletra.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV10cCfgComprobanteDetalleLetra, 2, 0)));
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCcomprobantefecha_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCOMPROBANTEFECHA");
            GX_FocusControl = edtavCcomprobantefecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cComprobanteFecha = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cComprobanteFecha", localUtil.format(AV11cComprobanteFecha, "99/99/99"));
         }
         else
         {
            AV11cComprobanteFecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCcomprobantefecha_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cComprobanteFecha", localUtil.format(AV11cComprobanteFecha, "99/99/99"));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCcomprobantefechasubdiario_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCOMPROBANTEFECHASUBDIARIO");
            GX_FocusControl = edtavCcomprobantefechasubdiario_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cComprobanteFechaSubdiario = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cComprobanteFechaSubdiario", localUtil.format(AV12cComprobanteFechaSubdiario, "99/99/99"));
         }
         else
         {
            AV12cComprobanteFechaSubdiario = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCcomprobantefechasubdiario_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cComprobanteFechaSubdiario", localUtil.format(AV12cComprobanteFechaSubdiario, "99/99/99"));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEMPRESAID"), ",", ".") != AV6cEmpresaId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEID"), AV7cCfgComprobanteId) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEPREFIJO"), ",", ".") != AV8cCfgComprobantePrefijo )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCOMPROBANTENUMERO"), ",", ".") != AV9cComprobanteNumero )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCFGCOMPROBANTEDETALLELETRA"), ",", ".") != AV10cCfgComprobanteDetalleLetra )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCCOMPROBANTEFECHA"), 0), AV11cComprobanteFecha) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCCOMPROBANTEFECHASUBDIARIO"), 0), AV12cComprobanteFechaSubdiario) ) )
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
      e190V2 ();
      if (returnInSub) return;
   }

   public void e190V2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Comprobante", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV18ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e200V2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV21Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_842( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ( nGXsfl_84_Refreshing == 0 ) )
      {
         httpContext.doAjaxLoad(84, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e210V2 ();
      if (returnInSub) return;
   }

   public void e210V2( )
   {
      /* Enter Routine */
      AV13pEmpresaId = A42EmpresaId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pEmpresaId", GXutil.ltrim( GXutil.str( AV13pEmpresaId, 6, 0)));
      AV14pCfgComprobanteId = A31CfgComprobanteId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pCfgComprobanteId", AV14pCfgComprobanteId);
      AV15pCfgComprobantePrefijo = A32CfgComprobantePrefijo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV15pCfgComprobantePrefijo, 4, 0)));
      AV16pComprobanteNumero = A55ComprobanteNumero ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16pComprobanteNumero", GXutil.ltrim( GXutil.str( AV16pComprobanteNumero, 8, 0)));
      AV17pCfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV17pCfgComprobanteDetalleLetra, 2, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pEmpresaId),AV14pCfgComprobanteId,new Short(AV15pCfgComprobantePrefijo),new Integer(AV16pComprobanteNumero),new Byte(AV17pCfgComprobanteDetalleLetra)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pEmpresaId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pEmpresaId", GXutil.ltrim( GXutil.str( AV13pEmpresaId, 6, 0)));
      AV14pCfgComprobanteId = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pCfgComprobanteId", AV14pCfgComprobanteId);
      AV15pCfgComprobantePrefijo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pCfgComprobantePrefijo", GXutil.ltrim( GXutil.str( AV15pCfgComprobantePrefijo, 4, 0)));
      AV16pComprobanteNumero = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16pComprobanteNumero", GXutil.ltrim( GXutil.str( AV16pComprobanteNumero, 8, 0)));
      AV17pCfgComprobanteDetalleLetra = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17pCfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( AV17pCfgComprobanteDetalleLetra, 2, 0)));
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
      pa0V2( ) ;
      ws0V2( ) ;
      we0V2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "?131246");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?15445365");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721915452123");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx00u0.js", "?201721915452123");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_84_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_84_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_84_idx ;
      edtComprobanteNumero_Internalname = "COMPROBANTENUMERO_"+sGXsfl_84_idx ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_84_idx );
      edtComprobanteFecha_Internalname = "COMPROBANTEFECHA_"+sGXsfl_84_idx ;
      edtMonedaId_Internalname = "MONEDAID_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_84_fel_idx ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID_"+sGXsfl_84_fel_idx ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO_"+sGXsfl_84_fel_idx ;
      edtComprobanteNumero_Internalname = "COMPROBANTENUMERO_"+sGXsfl_84_fel_idx ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_84_fel_idx );
      edtComprobanteFecha_Internalname = "COMPROBANTEFECHA_"+sGXsfl_84_fel_idx ;
      edtMonedaId_Internalname = "MONEDAID_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb0V0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_84_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_84_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A31CfgComprobanteId)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A55ComprobanteNumero, (byte)(8), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV21Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV21Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaId_Internalname,GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasMaestras","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteId_Internalname,A31CfgComprobanteId,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobanteId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"IdCfgComprobanteId","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobantePrefijo_Internalname,GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A32CfgComprobantePrefijo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobantePrefijo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobantePrefijo","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteNumero_Internalname,GXutil.ltrim( localUtil.ntoc( A55ComprobanteNumero, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A55ComprobanteNumero), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteNumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobanteNumero","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_84_idx ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCfgComprobanteDetalleLetra,cmbCfgComprobanteDetalleLetra.getInternalname(),GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)),new Integer(1),cmbCfgComprobanteDetalleLetra.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbCfgComprobanteDetalleLetra.setValue( GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Values", cmbCfgComprobanteDetalleLetra.ToJavascriptSource());
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteFecha_Internalname,localUtil.format(A61ComprobanteFecha, "99/99/99"),localUtil.format( A61ComprobanteFecha, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteFecha_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMonedaId_Internalname,GXutil.ltrim( localUtil.ntoc( A67MonedaId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A67MonedaId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMonedaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblempresaidfilter_Internalname = "LBLEMPRESAIDFILTER" ;
      edtavCempresaid_Internalname = "vCEMPRESAID" ;
      divEmpresaidfiltercontainer_Internalname = "EMPRESAIDFILTERCONTAINER" ;
      lblLblcfgcomprobanteidfilter_Internalname = "LBLCFGCOMPROBANTEIDFILTER" ;
      edtavCcfgcomprobanteid_Internalname = "vCCFGCOMPROBANTEID" ;
      divCfgcomprobanteidfiltercontainer_Internalname = "CFGCOMPROBANTEIDFILTERCONTAINER" ;
      lblLblcfgcomprobanteprefijofilter_Internalname = "LBLCFGCOMPROBANTEPREFIJOFILTER" ;
      edtavCcfgcomprobanteprefijo_Internalname = "vCCFGCOMPROBANTEPREFIJO" ;
      divCfgcomprobanteprefijofiltercontainer_Internalname = "CFGCOMPROBANTEPREFIJOFILTERCONTAINER" ;
      lblLblcomprobantenumerofilter_Internalname = "LBLCOMPROBANTENUMEROFILTER" ;
      edtavCcomprobantenumero_Internalname = "vCCOMPROBANTENUMERO" ;
      divComprobantenumerofiltercontainer_Internalname = "COMPROBANTENUMEROFILTERCONTAINER" ;
      lblLblcfgcomprobantedetalleletrafilter_Internalname = "LBLCFGCOMPROBANTEDETALLELETRAFILTER" ;
      cmbavCcfgcomprobantedetalleletra.setInternalname( "vCCFGCOMPROBANTEDETALLELETRA" );
      divCfgcomprobantedetalleletrafiltercontainer_Internalname = "CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER" ;
      lblLblcomprobantefechafilter_Internalname = "LBLCOMPROBANTEFECHAFILTER" ;
      edtavCcomprobantefecha_Internalname = "vCCOMPROBANTEFECHA" ;
      divComprobantefechafiltercontainer_Internalname = "COMPROBANTEFECHAFILTERCONTAINER" ;
      lblLblcomprobantefechasubdiariofilter_Internalname = "LBLCOMPROBANTEFECHASUBDIARIOFILTER" ;
      edtavCcomprobantefechasubdiario_Internalname = "vCCOMPROBANTEFECHASUBDIARIO" ;
      divComprobantefechasubdiariofiltercontainer_Internalname = "COMPROBANTEFECHASUBDIARIOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtEmpresaId_Internalname = "EMPRESAID" ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID" ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO" ;
      edtComprobanteNumero_Internalname = "COMPROBANTENUMERO" ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA" );
      edtComprobanteFecha_Internalname = "COMPROBANTEFECHA" ;
      edtMonedaId_Internalname = "MONEDAID" ;
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
      edtMonedaId_Jsonclick = "" ;
      edtComprobanteFecha_Jsonclick = "" ;
      cmbCfgComprobanteDetalleLetra.setJsonclick( "" );
      edtComprobanteNumero_Jsonclick = "" ;
      edtCfgComprobantePrefijo_Jsonclick = "" ;
      edtCfgComprobanteId_Jsonclick = "" ;
      edtEmpresaId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCcomprobantefechasubdiario_Jsonclick = "" ;
      edtavCcomprobantefechasubdiario_Enabled = 1 ;
      edtavCcomprobantefecha_Jsonclick = "" ;
      edtavCcomprobantefecha_Enabled = 1 ;
      cmbavCcfgcomprobantedetalleletra.setJsonclick( "" );
      cmbavCcfgcomprobantedetalleletra.setEnabled( 1 );
      cmbavCcfgcomprobantedetalleletra.setVisible( 1 );
      edtavCcomprobantenumero_Jsonclick = "" ;
      edtavCcomprobantenumero_Enabled = 1 ;
      edtavCcomprobantenumero_Visible = 1 ;
      edtavCcfgcomprobanteprefijo_Jsonclick = "" ;
      edtavCcfgcomprobanteprefijo_Enabled = 1 ;
      edtavCcfgcomprobanteprefijo_Visible = 1 ;
      edtavCcfgcomprobanteid_Jsonclick = "" ;
      edtavCcfgcomprobanteid_Enabled = 1 ;
      edtavCcfgcomprobanteid_Visible = 1 ;
      edtavCempresaid_Jsonclick = "" ;
      edtavCempresaid_Enabled = 1 ;
      edtavCempresaid_Visible = 1 ;
      divComprobantefechasubdiariofiltercontainer_Class = "AdvancedContainerItem" ;
      divComprobantefechafiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobantedetalleletrafiltercontainer_Class = "AdvancedContainerItem" ;
      divComprobantenumerofiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobanteprefijofiltercontainer_Class = "AdvancedContainerItem" ;
      divCfgcomprobanteidfiltercontainer_Class = "AdvancedContainerItem" ;
      divEmpresaidfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Comprobante" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV8cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'AV9cComprobanteNumero',fld:'vCCOMPROBANTENUMERO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV10cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV11cComprobanteFecha',fld:'vCCOMPROBANTEFECHA'},{av:'AV12cComprobanteFechaSubdiario',fld:'vCCOMPROBANTEFECHASUBDIARIO'}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e180V1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLEMPRESAIDFILTER.CLICK","{handler:'e110V1',iparms:[{av:'divEmpresaidfiltercontainer_Class',ctrl:'EMPRESAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEmpresaidfiltercontainer_Class',ctrl:'EMPRESAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCempresaid_Visible',ctrl:'vCEMPRESAID',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEIDFILTER.CLICK","{handler:'e120V1',iparms:[{av:'divCfgcomprobanteidfiltercontainer_Class',ctrl:'CFGCOMPROBANTEIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobanteidfiltercontainer_Class',ctrl:'CFGCOMPROBANTEIDFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobanteid_Visible',ctrl:'vCCFGCOMPROBANTEID',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEPREFIJOFILTER.CLICK","{handler:'e130V1',iparms:[{av:'divCfgcomprobanteprefijofiltercontainer_Class',ctrl:'CFGCOMPROBANTEPREFIJOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobanteprefijofiltercontainer_Class',ctrl:'CFGCOMPROBANTEPREFIJOFILTERCONTAINER',prop:'Class'},{av:'edtavCcfgcomprobanteprefijo_Visible',ctrl:'vCCFGCOMPROBANTEPREFIJO',prop:'Visible'}]}");
      setEventMetadata("LBLCOMPROBANTENUMEROFILTER.CLICK","{handler:'e140V1',iparms:[{av:'divComprobantenumerofiltercontainer_Class',ctrl:'COMPROBANTENUMEROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divComprobantenumerofiltercontainer_Class',ctrl:'COMPROBANTENUMEROFILTERCONTAINER',prop:'Class'},{av:'edtavCcomprobantenumero_Visible',ctrl:'vCCOMPROBANTENUMERO',prop:'Visible'}]}");
      setEventMetadata("LBLCFGCOMPROBANTEDETALLELETRAFILTER.CLICK","{handler:'e150V1',iparms:[{av:'divCfgcomprobantedetalleletrafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCfgcomprobantedetalleletrafiltercontainer_Class',ctrl:'CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER',prop:'Class'},{av:'cmbavCcfgcomprobantedetalleletra'}]}");
      setEventMetadata("LBLCOMPROBANTEFECHAFILTER.CLICK","{handler:'e160V1',iparms:[{av:'divComprobantefechafiltercontainer_Class',ctrl:'COMPROBANTEFECHAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divComprobantefechafiltercontainer_Class',ctrl:'COMPROBANTEFECHAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLCOMPROBANTEFECHASUBDIARIOFILTER.CLICK","{handler:'e170V1',iparms:[{av:'divComprobantefechasubdiariofiltercontainer_Class',ctrl:'COMPROBANTEFECHASUBDIARIOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divComprobantefechasubdiariofiltercontainer_Class',ctrl:'COMPROBANTEFECHASUBDIARIOFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e210V2',iparms:[{av:'A42EmpresaId',fld:'EMPRESAID'},{av:'A31CfgComprobanteId',fld:'CFGCOMPROBANTEID'},{av:'A32CfgComprobantePrefijo',fld:'CFGCOMPROBANTEPREFIJO'},{av:'A55ComprobanteNumero',fld:'COMPROBANTENUMERO'},{av:'cmbCfgComprobanteDetalleLetra'},{av:'A35CfgComprobanteDetalleLetra',fld:'CFGCOMPROBANTEDETALLELETRA'}],oparms:[{av:'AV13pEmpresaId',fld:'vPEMPRESAID'},{av:'AV14pCfgComprobanteId',fld:'vPCFGCOMPROBANTEID'},{av:'AV15pCfgComprobantePrefijo',fld:'vPCFGCOMPROBANTEPREFIJO'},{av:'AV16pComprobanteNumero',fld:'vPCOMPROBANTENUMERO'},{av:'AV17pCfgComprobanteDetalleLetra',fld:'vPCFGCOMPROBANTEDETALLELETRA'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV8cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'AV9cComprobanteNumero',fld:'vCCOMPROBANTENUMERO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV10cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV11cComprobanteFecha',fld:'vCCOMPROBANTEFECHA'},{av:'AV12cComprobanteFechaSubdiario',fld:'vCCOMPROBANTEFECHASUBDIARIO'}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV8cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'AV9cComprobanteNumero',fld:'vCCOMPROBANTENUMERO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV10cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV11cComprobanteFecha',fld:'vCCOMPROBANTEFECHA'},{av:'AV12cComprobanteFechaSubdiario',fld:'vCCOMPROBANTEFECHASUBDIARIO'}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV8cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'AV9cComprobanteNumero',fld:'vCCOMPROBANTENUMERO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV10cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV11cComprobanteFecha',fld:'vCCOMPROBANTEFECHA'},{av:'AV12cComprobanteFechaSubdiario',fld:'vCCOMPROBANTEFECHASUBDIARIO'}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cCfgComprobanteId',fld:'vCCFGCOMPROBANTEID'},{av:'AV8cCfgComprobantePrefijo',fld:'vCCFGCOMPROBANTEPREFIJO'},{av:'AV9cComprobanteNumero',fld:'vCCOMPROBANTENUMERO'},{av:'cmbavCcfgcomprobantedetalleletra'},{av:'AV10cCfgComprobanteDetalleLetra',fld:'vCCFGCOMPROBANTEDETALLELETRA'},{av:'AV11cComprobanteFecha',fld:'vCCOMPROBANTEFECHA'},{av:'AV12cComprobanteFechaSubdiario',fld:'vCCOMPROBANTEFECHASUBDIARIO'}],oparms:[]}");
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
      AV7cCfgComprobanteId = "" ;
      AV11cComprobanteFecha = GXutil.nullDate() ;
      AV12cComprobanteFechaSubdiario = GXutil.nullDate() ;
      AV14pCfgComprobanteId = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblempresaidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblcfgcomprobanteidfilter_Jsonclick = "" ;
      lblLblcfgcomprobanteprefijofilter_Jsonclick = "" ;
      lblLblcomprobantenumerofilter_Jsonclick = "" ;
      lblLblcfgcomprobantedetalleletrafilter_Jsonclick = "" ;
      lblLblcomprobantefechafilter_Jsonclick = "" ;
      lblLblcomprobantefechasubdiariofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A31CfgComprobanteId = "" ;
      A61ComprobanteFecha = GXutil.nullDate() ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21Linkselection_GXI = "" ;
      GXKey = "" ;
      GXCCtl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV7cCfgComprobanteId = "" ;
      A62ComprobanteFechaSubdiario = GXutil.nullDate() ;
      H000V2_A62ComprobanteFechaSubdiario = new java.util.Date[] {GXutil.nullDate()} ;
      H000V2_A67MonedaId = new short[1] ;
      H000V2_A61ComprobanteFecha = new java.util.Date[] {GXutil.nullDate()} ;
      H000V2_A35CfgComprobanteDetalleLetra = new byte[1] ;
      H000V2_A55ComprobanteNumero = new int[1] ;
      H000V2_A32CfgComprobantePrefijo = new short[1] ;
      H000V2_A31CfgComprobanteId = new String[] {""} ;
      H000V2_A42EmpresaId = new int[1] ;
      H000V3_AGRID1_nRecordCount = new long[1] ;
      AV18ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx00u0__default(),
         new Object[] {
             new Object[] {
            H000V2_A62ComprobanteFechaSubdiario, H000V2_A67MonedaId, H000V2_A61ComprobanteFecha, H000V2_A35CfgComprobanteDetalleLetra, H000V2_A55ComprobanteNumero, H000V2_A32CfgComprobantePrefijo, H000V2_A31CfgComprobanteId, H000V2_A42EmpresaId
            }
            , new Object[] {
            H000V3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV10cCfgComprobanteDetalleLetra ;
   private byte AV17pCfgComprobanteDetalleLetra ;
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
   private short nRC_GXsfl_84 ;
   private short nGXsfl_84_idx=1 ;
   private short AV8cCfgComprobantePrefijo ;
   private short AV15pCfgComprobantePrefijo ;
   private short wbEnd ;
   private short wbStart ;
   private short A32CfgComprobantePrefijo ;
   private short A67MonedaId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_84_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int AV6cEmpresaId ;
   private int AV9cComprobanteNumero ;
   private int AV13pEmpresaId ;
   private int AV16pComprobanteNumero ;
   private int edtavCempresaid_Enabled ;
   private int edtavCempresaid_Visible ;
   private int edtavCcfgcomprobanteid_Visible ;
   private int edtavCcfgcomprobanteid_Enabled ;
   private int edtavCcfgcomprobanteprefijo_Enabled ;
   private int edtavCcfgcomprobanteprefijo_Visible ;
   private int edtavCcomprobantenumero_Enabled ;
   private int edtavCcomprobantenumero_Visible ;
   private int edtavCcomprobantefecha_Enabled ;
   private int edtavCcomprobantefechasubdiario_Enabled ;
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
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divEmpresaidfiltercontainer_Class ;
   private String divCfgcomprobanteidfiltercontainer_Class ;
   private String divCfgcomprobanteprefijofiltercontainer_Class ;
   private String divComprobantenumerofiltercontainer_Class ;
   private String divCfgcomprobantedetalleletrafiltercontainer_Class ;
   private String divComprobantefechafiltercontainer_Class ;
   private String divComprobantefechasubdiariofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divEmpresaidfiltercontainer_Internalname ;
   private String lblLblempresaidfilter_Internalname ;
   private String lblLblempresaidfilter_Jsonclick ;
   private String edtavCempresaid_Internalname ;
   private String TempTags ;
   private String edtavCempresaid_Jsonclick ;
   private String divCfgcomprobanteidfiltercontainer_Internalname ;
   private String lblLblcfgcomprobanteidfilter_Internalname ;
   private String lblLblcfgcomprobanteidfilter_Jsonclick ;
   private String edtavCcfgcomprobanteid_Internalname ;
   private String edtavCcfgcomprobanteid_Jsonclick ;
   private String divCfgcomprobanteprefijofiltercontainer_Internalname ;
   private String lblLblcfgcomprobanteprefijofilter_Internalname ;
   private String lblLblcfgcomprobanteprefijofilter_Jsonclick ;
   private String edtavCcfgcomprobanteprefijo_Internalname ;
   private String edtavCcfgcomprobanteprefijo_Jsonclick ;
   private String divComprobantenumerofiltercontainer_Internalname ;
   private String lblLblcomprobantenumerofilter_Internalname ;
   private String lblLblcomprobantenumerofilter_Jsonclick ;
   private String edtavCcomprobantenumero_Internalname ;
   private String edtavCcomprobantenumero_Jsonclick ;
   private String divCfgcomprobantedetalleletrafiltercontainer_Internalname ;
   private String lblLblcfgcomprobantedetalleletrafilter_Internalname ;
   private String lblLblcfgcomprobantedetalleletrafilter_Jsonclick ;
   private String divComprobantefechafiltercontainer_Internalname ;
   private String lblLblcomprobantefechafilter_Internalname ;
   private String lblLblcomprobantefechafilter_Jsonclick ;
   private String edtavCcomprobantefecha_Internalname ;
   private String edtavCcomprobantefecha_Jsonclick ;
   private String divComprobantefechasubdiariofiltercontainer_Internalname ;
   private String lblLblcomprobantefechasubdiariofilter_Internalname ;
   private String lblLblcomprobantefechasubdiariofilter_Jsonclick ;
   private String edtavCcomprobantefechasubdiario_Internalname ;
   private String edtavCcomprobantefechasubdiario_Jsonclick ;
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
   private String edtEmpresaId_Internalname ;
   private String edtCfgComprobanteId_Internalname ;
   private String edtCfgComprobantePrefijo_Internalname ;
   private String edtComprobanteNumero_Internalname ;
   private String edtComprobanteFecha_Internalname ;
   private String edtMonedaId_Internalname ;
   private String GXKey ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV18ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtEmpresaId_Jsonclick ;
   private String edtCfgComprobanteId_Jsonclick ;
   private String edtCfgComprobantePrefijo_Jsonclick ;
   private String edtComprobanteNumero_Jsonclick ;
   private String edtComprobanteFecha_Jsonclick ;
   private String edtMonedaId_Jsonclick ;
   private java.util.Date AV11cComprobanteFecha ;
   private java.util.Date AV12cComprobanteFechaSubdiario ;
   private java.util.Date A61ComprobanteFecha ;
   private java.util.Date A62ComprobanteFechaSubdiario ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV7cCfgComprobanteId ;
   private String AV14pCfgComprobanteId ;
   private String A31CfgComprobanteId ;
   private String AV21Linkselection_GXI ;
   private String lV7cCfgComprobanteId ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCcfgcomprobantedetalleletra ;
   private HTMLChoice cmbCfgComprobanteDetalleLetra ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H000V2_A62ComprobanteFechaSubdiario ;
   private short[] H000V2_A67MonedaId ;
   private java.util.Date[] H000V2_A61ComprobanteFecha ;
   private byte[] H000V2_A35CfgComprobanteDetalleLetra ;
   private int[] H000V2_A55ComprobanteNumero ;
   private short[] H000V2_A32CfgComprobantePrefijo ;
   private String[] H000V2_A31CfgComprobanteId ;
   private int[] H000V2_A42EmpresaId ;
   private long[] H000V3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00u0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV11cComprobanteFecha ,
                                          java.util.Date AV12cComprobanteFechaSubdiario ,
                                          java.util.Date A61ComprobanteFecha ,
                                          java.util.Date A62ComprobanteFechaSubdiario ,
                                          String A31CfgComprobanteId ,
                                          String AV7cCfgComprobanteId ,
                                          short A32CfgComprobantePrefijo ,
                                          short AV8cCfgComprobantePrefijo ,
                                          int A55ComprobanteNumero ,
                                          int AV9cComprobanteNumero ,
                                          byte A35CfgComprobanteDetalleLetra ,
                                          byte AV10cCfgComprobanteDetalleLetra ,
                                          int AV6cEmpresaId )
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
      sSelectString = " ComprobanteFechaSubdiario, MonedaId, ComprobanteFecha, CfgComprobanteDetalleLetra," ;
      sSelectString = sSelectString + " ComprobanteNumero, CfgComprobantePrefijo, CfgComprobanteId, EmpresaId" ;
      sFromString = " FROM Comprobante" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (EmpresaId >= ?)" ;
      sWhereString = sWhereString + " and (CfgComprobanteId like ?)" ;
      sWhereString = sWhereString + " and (CfgComprobantePrefijo >= ?)" ;
      sWhereString = sWhereString + " and (ComprobanteNumero >= ?)" ;
      sWhereString = sWhereString + " and (CfgComprobanteDetalleLetra >= ?)" ;
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cComprobanteFecha) )
      {
         sWhereString = sWhereString + " and (ComprobanteFecha >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cComprobanteFechaSubdiario) )
      {
         sWhereString = sWhereString + " and (ComprobanteFechaSubdiario >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY EmpresaId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000V3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV11cComprobanteFecha ,
                                          java.util.Date AV12cComprobanteFechaSubdiario ,
                                          java.util.Date A61ComprobanteFecha ,
                                          java.util.Date A62ComprobanteFechaSubdiario ,
                                          String A31CfgComprobanteId ,
                                          String AV7cCfgComprobanteId ,
                                          short A32CfgComprobantePrefijo ,
                                          short AV8cCfgComprobantePrefijo ,
                                          int A55ComprobanteNumero ,
                                          int AV9cComprobanteNumero ,
                                          byte A35CfgComprobanteDetalleLetra ,
                                          byte AV10cCfgComprobanteDetalleLetra ,
                                          int AV6cEmpresaId )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM Comprobante" ;
      scmdbuf = scmdbuf + " WHERE (EmpresaId >= ?)" ;
      scmdbuf = scmdbuf + " and (CfgComprobanteId like ?)" ;
      scmdbuf = scmdbuf + " and (CfgComprobantePrefijo >= ?)" ;
      scmdbuf = scmdbuf + " and (ComprobanteNumero >= ?)" ;
      scmdbuf = scmdbuf + " and (CfgComprobanteDetalleLetra >= ?)" ;
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cComprobanteFecha) )
      {
         sWhereString = sWhereString + " and (ComprobanteFecha >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cComprobanteFechaSubdiario) )
      {
         sWhereString = sWhereString + " and (ComprobanteFechaSubdiario >= ?)" ;
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
                  return conditional_H000V2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H000V3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000V3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
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
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
      }
   }

}

