/*
               File: gx00e0_impl
        Description: Selection List Empresa
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:32:23.32
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

public final  class gx00e0_impl extends GXDataArea
{
   public gx00e0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00e0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00e0_impl.class ));
   }

   public gx00e0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            AV7cEmpresaNumeroDocumento = httpContext.GetNextPar( ) ;
            AV8cEmpresaNumero = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cEmpresaPiso = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10cEmpresaDepto = httpContext.GetNextPar( ) ;
            AV11cEmpresaCPostal = httpContext.GetNextPar( ) ;
            AV12cLocalidadId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cEmpresaNumeroDocumento, AV8cEmpresaNumero, AV9cEmpresaPiso, AV10cEmpresaDepto, AV11cEmpresaCPostal, AV12cLocalidadId) ;
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
      pa0K2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0K2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721917322343");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx00e0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEmpresaId,6,0)))+"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEMPRESANUMERODOCUMENTO", GXutil.rtrim( AV7cEmpresaNumeroDocumento));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEMPRESANUMERO", GXutil.ltrim( localUtil.ntoc( AV8cEmpresaNumero, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEMPRESAPISO", GXutil.ltrim( localUtil.ntoc( AV9cEmpresaPiso, (byte)(3), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEMPRESADEPTO", AV10cEmpresaDepto);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEMPRESACPOSTAL", AV11cEmpresaCPostal);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLOCALIDADID", GXutil.ltrim( localUtil.ntoc( AV12cLocalidadId, (byte)(4), (byte)(0), ",", "")));
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPEMPRESAID", GXutil.ltrim( localUtil.ntoc( AV13pEmpresaId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESAIDFILTERCONTAINER_Class", GXutil.rtrim( divEmpresaidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESANUMERODOCUMENTOFILTERCONTAINER_Class", GXutil.rtrim( divEmpresanumerodocumentofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESANUMEROFILTERCONTAINER_Class", GXutil.rtrim( divEmpresanumerofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESAPISOFILTERCONTAINER_Class", GXutil.rtrim( divEmpresapisofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESADEPTOFILTERCONTAINER_Class", GXutil.rtrim( divEmpresadeptofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESACPOSTALFILTERCONTAINER_Class", GXutil.rtrim( divEmpresacpostalfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "LOCALIDADIDFILTERCONTAINER_Class", GXutil.rtrim( divLocalidadidfiltercontainer_Class));
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
         we0K2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0K2( ) ;
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
      return formatLink("com.kberp.gx00e0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEmpresaId,6,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00E0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Empresa" ;
   }

   public void wb0K0( )
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblempresaidfilter_Internalname, "Empresa Id", "", "", lblLblempresaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00E0.htm");
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
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCempresaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cEmpresaId, (byte)(6), (byte)(0), ",", "")), ((edtavCempresaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cEmpresaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cEmpresaId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCempresaid_Jsonclick, 0, "Attribute", "", "", "", edtavCempresaid_Visible, edtavCempresaid_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00E0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEmpresanumerodocumentofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEmpresanumerodocumentofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblempresanumerodocumentofilter_Internalname, "Empresa Numero Documento", "", "", lblLblempresanumerodocumentofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00E0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCempresanumerodocumento_Internalname, "Empresa Numero Documento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCempresanumerodocumento_Internalname, GXutil.rtrim( AV7cEmpresaNumeroDocumento), GXutil.rtrim( localUtil.format( AV7cEmpresaNumeroDocumento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCempresanumerodocumento_Jsonclick, 0, "Attribute", "", "", "", edtavCempresanumerodocumento_Visible, edtavCempresanumerodocumento_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00E0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEmpresanumerofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEmpresanumerofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblempresanumerofilter_Internalname, "Empresa Numero", "", "", lblLblempresanumerofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00E0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCempresanumero_Internalname, "Empresa Numero", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCempresanumero_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cEmpresaNumero, (byte)(6), (byte)(0), ",", "")), ((edtavCempresanumero_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cEmpresaNumero), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cEmpresaNumero), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCempresanumero_Jsonclick, 0, "Attribute", "", "", "", edtavCempresanumero_Visible, edtavCempresanumero_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00E0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEmpresapisofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEmpresapisofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblempresapisofilter_Internalname, "Empresa Piso", "", "", lblLblempresapisofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00E0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCempresapiso_Internalname, "Empresa Piso", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCempresapiso_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cEmpresaPiso, (byte)(3), (byte)(0), ",", "")), ((edtavCempresapiso_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cEmpresaPiso), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cEmpresaPiso), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCempresapiso_Jsonclick, 0, "Attribute", "", "", "", edtavCempresapiso_Visible, edtavCempresapiso_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00E0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEmpresadeptofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEmpresadeptofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblempresadeptofilter_Internalname, "Empresa Depto", "", "", lblLblempresadeptofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00E0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCempresadepto_Internalname, "Empresa Depto", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCempresadepto_Internalname, AV10cEmpresaDepto, GXutil.rtrim( localUtil.format( AV10cEmpresaDepto, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCempresadepto_Jsonclick, 0, "Attribute", "", "", "", edtavCempresadepto_Visible, edtavCempresadepto_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00E0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEmpresacpostalfiltercontainer_Internalname, 1, 0, "px", 0, "px", divEmpresacpostalfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblempresacpostalfilter_Internalname, "Empresa CPostal", "", "", lblLblempresacpostalfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00E0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCempresacpostal_Internalname, "Empresa CPostal", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCempresacpostal_Internalname, AV11cEmpresaCPostal, GXutil.rtrim( localUtil.format( AV11cEmpresaCPostal, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCempresacpostal_Jsonclick, 0, "Attribute", "", "", "", edtavCempresacpostal_Visible, edtavCempresacpostal_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00E0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divLocalidadidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divLocalidadidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLbllocalidadidfilter_Internalname, "Localidad Id", "", "", lblLbllocalidadidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e170k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00E0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavClocalidadid_Internalname, "Localidad Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavClocalidadid_Internalname, GXutil.ltrim( localUtil.ntoc( AV12cLocalidadId, (byte)(4), (byte)(0), ",", "")), ((edtavClocalidadid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12cLocalidadId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12cLocalidadId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClocalidadid_Jsonclick, 0, "Attribute", "", "", "", edtavClocalidadid_Visible, edtavClocalidadid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00E0.htm");
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
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e180k1_client"+"'", TempTags, "", 2, "HLP_Gx00E0.htm");
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
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Numero Documento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Numero") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Piso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Depto") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CPostal") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Localidad Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Pais Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Provincia Id") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A44EmpresaNumeroDocumento));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A46EmpresaNumero, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47EmpresaPiso, (byte)(3), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A48EmpresaDepto);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A49EmpresaCPostal);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5LocalidadId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3PaisId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1ProvinciaId, (byte)(4), (byte)(0), ".", "")));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00E0.htm");
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

   public void start0K2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_2-109402", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Empresa", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0K0( ) ;
   }

   public void ws0K2( )
   {
      start0K2( ) ;
      evt0K2( ) ;
   }

   public void evt0K2( )
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
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))));
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection));
                           A42EmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( edtEmpresaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEmpresaId_Internalname, GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
                           A44EmpresaNumeroDocumento = httpContext.cgiGet( edtEmpresaNumeroDocumento_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEmpresaNumeroDocumento_Internalname, A44EmpresaNumeroDocumento);
                           A46EmpresaNumero = (int)(localUtil.ctol( httpContext.cgiGet( edtEmpresaNumero_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEmpresaNumero_Internalname, GXutil.ltrim( GXutil.str( A46EmpresaNumero, 6, 0)));
                           A47EmpresaPiso = (short)(localUtil.ctol( httpContext.cgiGet( edtEmpresaPiso_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEmpresaPiso_Internalname, GXutil.ltrim( GXutil.str( A47EmpresaPiso, 3, 0)));
                           A48EmpresaDepto = httpContext.cgiGet( edtEmpresaDepto_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEmpresaDepto_Internalname, A48EmpresaDepto);
                           A49EmpresaCPostal = httpContext.cgiGet( edtEmpresaCPostal_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEmpresaCPostal_Internalname, A49EmpresaCPostal);
                           A5LocalidadId = (short)(localUtil.ctol( httpContext.cgiGet( edtLocalidadId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtLocalidadId_Internalname, GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
                           A3PaisId = (short)(localUtil.ctol( httpContext.cgiGet( edtPaisId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtPaisId_Internalname, GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
                           A1ProvinciaId = (short)(localUtil.ctol( httpContext.cgiGet( edtProvinciaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtProvinciaId_Internalname, GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e190K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e200K2 ();
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
                                    /* Set Refresh If Cempresanumerodocumento Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEMPRESANUMERODOCUMENTO"), AV7cEmpresaNumeroDocumento) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cempresanumero Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEMPRESANUMERO"), ",", ".") != AV8cEmpresaNumero )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cempresapiso Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEMPRESAPISO"), ",", ".") != AV9cEmpresaPiso )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cempresadepto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEMPRESADEPTO"), AV10cEmpresaDepto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cempresacpostal Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEMPRESACPOSTAL"), AV11cEmpresaCPostal) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clocalidadid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLOCALIDADID"), ",", ".") != AV12cLocalidadId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e210K2 ();
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

   public void we0K2( )
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

   public void pa0K2( )
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
                                  String AV7cEmpresaNumeroDocumento ,
                                  int AV8cEmpresaNumero ,
                                  short AV9cEmpresaPiso ,
                                  String AV10cEmpresaDepto ,
                                  String AV11cEmpresaCPostal ,
                                  short AV12cLocalidadId )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0K2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0K2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0K2( )
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
                                              AV7cEmpresaNumeroDocumento ,
                                              new Integer(AV8cEmpresaNumero) ,
                                              new Short(AV9cEmpresaPiso) ,
                                              AV10cEmpresaDepto ,
                                              AV11cEmpresaCPostal ,
                                              new Short(AV12cLocalidadId) ,
                                              A44EmpresaNumeroDocumento ,
                                              new Integer(A46EmpresaNumero) ,
                                              new Short(A47EmpresaPiso) ,
                                              A48EmpresaDepto ,
                                              A49EmpresaCPostal ,
                                              new Short(A5LocalidadId) ,
                                              new Integer(AV6cEmpresaId) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT
                                              }
         } ) ;
         lV7cEmpresaNumeroDocumento = GXutil.padr( GXutil.rtrim( AV7cEmpresaNumeroDocumento), 13, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cEmpresaNumeroDocumento", AV7cEmpresaNumeroDocumento);
         lV10cEmpresaDepto = GXutil.concat( GXutil.rtrim( AV10cEmpresaDepto), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cEmpresaDepto", AV10cEmpresaDepto);
         lV11cEmpresaCPostal = GXutil.concat( GXutil.rtrim( AV11cEmpresaCPostal), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cEmpresaCPostal", AV11cEmpresaCPostal);
         /* Using cursor H000K2 */
         pr_default.execute(0, new Object[] {new Integer(AV6cEmpresaId), lV7cEmpresaNumeroDocumento, new Integer(AV8cEmpresaNumero), new Short(AV9cEmpresaPiso), lV10cEmpresaDepto, lV11cEmpresaCPostal, new Short(AV12cLocalidadId), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A1ProvinciaId = H000K2_A1ProvinciaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtProvinciaId_Internalname, GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
            A3PaisId = H000K2_A3PaisId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtPaisId_Internalname, GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
            A5LocalidadId = H000K2_A5LocalidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtLocalidadId_Internalname, GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
            A49EmpresaCPostal = H000K2_A49EmpresaCPostal[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaCPostal_Internalname, A49EmpresaCPostal);
            A48EmpresaDepto = H000K2_A48EmpresaDepto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaDepto_Internalname, A48EmpresaDepto);
            A47EmpresaPiso = H000K2_A47EmpresaPiso[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaPiso_Internalname, GXutil.ltrim( GXutil.str( A47EmpresaPiso, 3, 0)));
            A46EmpresaNumero = H000K2_A46EmpresaNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaNumero_Internalname, GXutil.ltrim( GXutil.str( A46EmpresaNumero, 6, 0)));
            A44EmpresaNumeroDocumento = H000K2_A44EmpresaNumeroDocumento[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaNumeroDocumento_Internalname, A44EmpresaNumeroDocumento);
            A42EmpresaId = H000K2_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaId_Internalname, GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            /* Execute user event: Load */
            e200K2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb0K0( ) ;
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
                                           AV7cEmpresaNumeroDocumento ,
                                           new Integer(AV8cEmpresaNumero) ,
                                           new Short(AV9cEmpresaPiso) ,
                                           AV10cEmpresaDepto ,
                                           AV11cEmpresaCPostal ,
                                           new Short(AV12cLocalidadId) ,
                                           A44EmpresaNumeroDocumento ,
                                           new Integer(A46EmpresaNumero) ,
                                           new Short(A47EmpresaPiso) ,
                                           A48EmpresaDepto ,
                                           A49EmpresaCPostal ,
                                           new Short(A5LocalidadId) ,
                                           new Integer(AV6cEmpresaId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT
                                           }
      } ) ;
      lV7cEmpresaNumeroDocumento = GXutil.padr( GXutil.rtrim( AV7cEmpresaNumeroDocumento), 13, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cEmpresaNumeroDocumento", AV7cEmpresaNumeroDocumento);
      lV10cEmpresaDepto = GXutil.concat( GXutil.rtrim( AV10cEmpresaDepto), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cEmpresaDepto", AV10cEmpresaDepto);
      lV11cEmpresaCPostal = GXutil.concat( GXutil.rtrim( AV11cEmpresaCPostal), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cEmpresaCPostal", AV11cEmpresaCPostal);
      /* Using cursor H000K3 */
      pr_default.execute(1, new Object[] {new Integer(AV6cEmpresaId), lV7cEmpresaNumeroDocumento, new Integer(AV8cEmpresaNumero), new Short(AV9cEmpresaPiso), lV10cEmpresaDepto, lV11cEmpresaCPostal, new Short(AV12cLocalidadId)});
      GRID1_nRecordCount = H000K3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cEmpresaNumeroDocumento, AV8cEmpresaNumero, AV9cEmpresaPiso, AV10cEmpresaDepto, AV11cEmpresaCPostal, AV12cLocalidadId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cEmpresaNumeroDocumento, AV8cEmpresaNumero, AV9cEmpresaPiso, AV10cEmpresaDepto, AV11cEmpresaCPostal, AV12cLocalidadId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cEmpresaNumeroDocumento, AV8cEmpresaNumero, AV9cEmpresaPiso, AV10cEmpresaDepto, AV11cEmpresaCPostal, AV12cLocalidadId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cEmpresaNumeroDocumento, AV8cEmpresaNumero, AV9cEmpresaPiso, AV10cEmpresaDepto, AV11cEmpresaCPostal, AV12cLocalidadId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEmpresaId, AV7cEmpresaNumeroDocumento, AV8cEmpresaNumero, AV9cEmpresaPiso, AV10cEmpresaDepto, AV11cEmpresaCPostal, AV12cLocalidadId) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0K0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e190K2 ();
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
         AV7cEmpresaNumeroDocumento = httpContext.cgiGet( edtavCempresanumerodocumento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cEmpresaNumeroDocumento", AV7cEmpresaNumeroDocumento);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCempresanumero_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCempresanumero_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCEMPRESANUMERO");
            GX_FocusControl = edtavCempresanumero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cEmpresaNumero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cEmpresaNumero", GXutil.ltrim( GXutil.str( AV8cEmpresaNumero, 6, 0)));
         }
         else
         {
            AV8cEmpresaNumero = (int)(localUtil.ctol( httpContext.cgiGet( edtavCempresanumero_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cEmpresaNumero", GXutil.ltrim( GXutil.str( AV8cEmpresaNumero, 6, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCempresapiso_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCempresapiso_Internalname), ",", ".") > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCEMPRESAPISO");
            GX_FocusControl = edtavCempresapiso_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cEmpresaPiso = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cEmpresaPiso", GXutil.ltrim( GXutil.str( AV9cEmpresaPiso, 3, 0)));
         }
         else
         {
            AV9cEmpresaPiso = (short)(localUtil.ctol( httpContext.cgiGet( edtavCempresapiso_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cEmpresaPiso", GXutil.ltrim( GXutil.str( AV9cEmpresaPiso, 3, 0)));
         }
         AV10cEmpresaDepto = httpContext.cgiGet( edtavCempresadepto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cEmpresaDepto", AV10cEmpresaDepto);
         AV11cEmpresaCPostal = httpContext.cgiGet( edtavCempresacpostal_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cEmpresaCPostal", AV11cEmpresaCPostal);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClocalidadid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClocalidadid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLOCALIDADID");
            GX_FocusControl = edtavClocalidadid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cLocalidadId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cLocalidadId", GXutil.ltrim( GXutil.str( AV12cLocalidadId, 4, 0)));
         }
         else
         {
            AV12cLocalidadId = (short)(localUtil.ctol( httpContext.cgiGet( edtavClocalidadid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cLocalidadId", GXutil.ltrim( GXutil.str( AV12cLocalidadId, 4, 0)));
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
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEMPRESANUMERODOCUMENTO"), AV7cEmpresaNumeroDocumento) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEMPRESANUMERO"), ",", ".") != AV8cEmpresaNumero )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEMPRESAPISO"), ",", ".") != AV9cEmpresaPiso )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEMPRESADEPTO"), AV10cEmpresaDepto) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEMPRESACPOSTAL"), AV11cEmpresaCPostal) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLOCALIDADID"), ",", ".") != AV12cLocalidadId )
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
      e190K2 ();
      if (returnInSub) return;
   }

   public void e190K2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Empresa", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e200K2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      e210K2 ();
      if (returnInSub) return;
   }

   public void e210K2( )
   {
      /* Enter Routine */
      AV13pEmpresaId = A42EmpresaId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pEmpresaId", GXutil.ltrim( GXutil.str( AV13pEmpresaId, 6, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pEmpresaId)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pEmpresaId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pEmpresaId", GXutil.ltrim( GXutil.str( AV13pEmpresaId, 6, 0)));
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
      pa0K2( ) ;
      ws0K2( ) ;
      we0K2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721917322569");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx00e0.js", "?201721917322569");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_84_idx ;
      edtEmpresaNumeroDocumento_Internalname = "EMPRESANUMERODOCUMENTO_"+sGXsfl_84_idx ;
      edtEmpresaNumero_Internalname = "EMPRESANUMERO_"+sGXsfl_84_idx ;
      edtEmpresaPiso_Internalname = "EMPRESAPISO_"+sGXsfl_84_idx ;
      edtEmpresaDepto_Internalname = "EMPRESADEPTO_"+sGXsfl_84_idx ;
      edtEmpresaCPostal_Internalname = "EMPRESACPOSTAL_"+sGXsfl_84_idx ;
      edtLocalidadId_Internalname = "LOCALIDADID_"+sGXsfl_84_idx ;
      edtPaisId_Internalname = "PAISID_"+sGXsfl_84_idx ;
      edtProvinciaId_Internalname = "PROVINCIAID_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_84_fel_idx ;
      edtEmpresaNumeroDocumento_Internalname = "EMPRESANUMERODOCUMENTO_"+sGXsfl_84_fel_idx ;
      edtEmpresaNumero_Internalname = "EMPRESANUMERO_"+sGXsfl_84_fel_idx ;
      edtEmpresaPiso_Internalname = "EMPRESAPISO_"+sGXsfl_84_fel_idx ;
      edtEmpresaDepto_Internalname = "EMPRESADEPTO_"+sGXsfl_84_fel_idx ;
      edtEmpresaCPostal_Internalname = "EMPRESACPOSTAL_"+sGXsfl_84_fel_idx ;
      edtLocalidadId_Internalname = "LOCALIDADID_"+sGXsfl_84_fel_idx ;
      edtPaisId_Internalname = "PAISID_"+sGXsfl_84_fel_idx ;
      edtProvinciaId_Internalname = "PROVINCIAID_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb0K0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaId_Internalname,GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasMaestras","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaNumeroDocumento_Internalname,GXutil.rtrim( A44EmpresaNumeroDocumento),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaNumeroDocumento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(13),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"NumeroDocumento","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaNumero_Internalname,GXutil.ltrim( localUtil.ntoc( A46EmpresaNumero, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A46EmpresaNumero), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaNumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"DomicilioNumero","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaPiso_Internalname,GXutil.ltrim( localUtil.ntoc( A47EmpresaPiso, (byte)(3), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A47EmpresaPiso), "ZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaPiso_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"DomicilioPiso","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaDepto_Internalname,A48EmpresaDepto,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaDepto_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"DomicilioDepto","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaCPostal_Internalname,A49EmpresaCPostal,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaCPostal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"DomicilioCPostal","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLocalidadId_Internalname,GXutil.ltrim( localUtil.ntoc( A5LocalidadId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A5LocalidadId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLocalidadId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPaisId_Internalname,GXutil.ltrim( localUtil.ntoc( A3PaisId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A3PaisId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPaisId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProvinciaId_Internalname,GXutil.ltrim( localUtil.ntoc( A1ProvinciaId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A1ProvinciaId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProvinciaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
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
      lblLblempresanumerodocumentofilter_Internalname = "LBLEMPRESANUMERODOCUMENTOFILTER" ;
      edtavCempresanumerodocumento_Internalname = "vCEMPRESANUMERODOCUMENTO" ;
      divEmpresanumerodocumentofiltercontainer_Internalname = "EMPRESANUMERODOCUMENTOFILTERCONTAINER" ;
      lblLblempresanumerofilter_Internalname = "LBLEMPRESANUMEROFILTER" ;
      edtavCempresanumero_Internalname = "vCEMPRESANUMERO" ;
      divEmpresanumerofiltercontainer_Internalname = "EMPRESANUMEROFILTERCONTAINER" ;
      lblLblempresapisofilter_Internalname = "LBLEMPRESAPISOFILTER" ;
      edtavCempresapiso_Internalname = "vCEMPRESAPISO" ;
      divEmpresapisofiltercontainer_Internalname = "EMPRESAPISOFILTERCONTAINER" ;
      lblLblempresadeptofilter_Internalname = "LBLEMPRESADEPTOFILTER" ;
      edtavCempresadepto_Internalname = "vCEMPRESADEPTO" ;
      divEmpresadeptofiltercontainer_Internalname = "EMPRESADEPTOFILTERCONTAINER" ;
      lblLblempresacpostalfilter_Internalname = "LBLEMPRESACPOSTALFILTER" ;
      edtavCempresacpostal_Internalname = "vCEMPRESACPOSTAL" ;
      divEmpresacpostalfiltercontainer_Internalname = "EMPRESACPOSTALFILTERCONTAINER" ;
      lblLbllocalidadidfilter_Internalname = "LBLLOCALIDADIDFILTER" ;
      edtavClocalidadid_Internalname = "vCLOCALIDADID" ;
      divLocalidadidfiltercontainer_Internalname = "LOCALIDADIDFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtEmpresaId_Internalname = "EMPRESAID" ;
      edtEmpresaNumeroDocumento_Internalname = "EMPRESANUMERODOCUMENTO" ;
      edtEmpresaNumero_Internalname = "EMPRESANUMERO" ;
      edtEmpresaPiso_Internalname = "EMPRESAPISO" ;
      edtEmpresaDepto_Internalname = "EMPRESADEPTO" ;
      edtEmpresaCPostal_Internalname = "EMPRESACPOSTAL" ;
      edtLocalidadId_Internalname = "LOCALIDADID" ;
      edtPaisId_Internalname = "PAISID" ;
      edtProvinciaId_Internalname = "PROVINCIAID" ;
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
      edtProvinciaId_Jsonclick = "" ;
      edtPaisId_Jsonclick = "" ;
      edtLocalidadId_Jsonclick = "" ;
      edtEmpresaCPostal_Jsonclick = "" ;
      edtEmpresaDepto_Jsonclick = "" ;
      edtEmpresaPiso_Jsonclick = "" ;
      edtEmpresaNumero_Jsonclick = "" ;
      edtEmpresaNumeroDocumento_Jsonclick = "" ;
      edtEmpresaId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavClocalidadid_Jsonclick = "" ;
      edtavClocalidadid_Enabled = 1 ;
      edtavClocalidadid_Visible = 1 ;
      edtavCempresacpostal_Jsonclick = "" ;
      edtavCempresacpostal_Enabled = 1 ;
      edtavCempresacpostal_Visible = 1 ;
      edtavCempresadepto_Jsonclick = "" ;
      edtavCempresadepto_Enabled = 1 ;
      edtavCempresadepto_Visible = 1 ;
      edtavCempresapiso_Jsonclick = "" ;
      edtavCempresapiso_Enabled = 1 ;
      edtavCempresapiso_Visible = 1 ;
      edtavCempresanumero_Jsonclick = "" ;
      edtavCempresanumero_Enabled = 1 ;
      edtavCempresanumero_Visible = 1 ;
      edtavCempresanumerodocumento_Jsonclick = "" ;
      edtavCempresanumerodocumento_Enabled = 1 ;
      edtavCempresanumerodocumento_Visible = 1 ;
      edtavCempresaid_Jsonclick = "" ;
      edtavCempresaid_Enabled = 1 ;
      edtavCempresaid_Visible = 1 ;
      divLocalidadidfiltercontainer_Class = "AdvancedContainerItem" ;
      divEmpresacpostalfiltercontainer_Class = "AdvancedContainerItem" ;
      divEmpresadeptofiltercontainer_Class = "AdvancedContainerItem" ;
      divEmpresapisofiltercontainer_Class = "AdvancedContainerItem" ;
      divEmpresanumerofiltercontainer_Class = "AdvancedContainerItem" ;
      divEmpresanumerodocumentofiltercontainer_Class = "AdvancedContainerItem" ;
      divEmpresaidfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Empresa" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cEmpresaNumeroDocumento',fld:'vCEMPRESANUMERODOCUMENTO'},{av:'AV8cEmpresaNumero',fld:'vCEMPRESANUMERO'},{av:'AV9cEmpresaPiso',fld:'vCEMPRESAPISO'},{av:'AV10cEmpresaDepto',fld:'vCEMPRESADEPTO'},{av:'AV11cEmpresaCPostal',fld:'vCEMPRESACPOSTAL'},{av:'AV12cLocalidadId',fld:'vCLOCALIDADID'}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e180K1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLEMPRESAIDFILTER.CLICK","{handler:'e110K1',iparms:[{av:'divEmpresaidfiltercontainer_Class',ctrl:'EMPRESAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEmpresaidfiltercontainer_Class',ctrl:'EMPRESAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCempresaid_Visible',ctrl:'vCEMPRESAID',prop:'Visible'}]}");
      setEventMetadata("LBLEMPRESANUMERODOCUMENTOFILTER.CLICK","{handler:'e120K1',iparms:[{av:'divEmpresanumerodocumentofiltercontainer_Class',ctrl:'EMPRESANUMERODOCUMENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEmpresanumerodocumentofiltercontainer_Class',ctrl:'EMPRESANUMERODOCUMENTOFILTERCONTAINER',prop:'Class'},{av:'edtavCempresanumerodocumento_Visible',ctrl:'vCEMPRESANUMERODOCUMENTO',prop:'Visible'}]}");
      setEventMetadata("LBLEMPRESANUMEROFILTER.CLICK","{handler:'e130K1',iparms:[{av:'divEmpresanumerofiltercontainer_Class',ctrl:'EMPRESANUMEROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEmpresanumerofiltercontainer_Class',ctrl:'EMPRESANUMEROFILTERCONTAINER',prop:'Class'},{av:'edtavCempresanumero_Visible',ctrl:'vCEMPRESANUMERO',prop:'Visible'}]}");
      setEventMetadata("LBLEMPRESAPISOFILTER.CLICK","{handler:'e140K1',iparms:[{av:'divEmpresapisofiltercontainer_Class',ctrl:'EMPRESAPISOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEmpresapisofiltercontainer_Class',ctrl:'EMPRESAPISOFILTERCONTAINER',prop:'Class'},{av:'edtavCempresapiso_Visible',ctrl:'vCEMPRESAPISO',prop:'Visible'}]}");
      setEventMetadata("LBLEMPRESADEPTOFILTER.CLICK","{handler:'e150K1',iparms:[{av:'divEmpresadeptofiltercontainer_Class',ctrl:'EMPRESADEPTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEmpresadeptofiltercontainer_Class',ctrl:'EMPRESADEPTOFILTERCONTAINER',prop:'Class'},{av:'edtavCempresadepto_Visible',ctrl:'vCEMPRESADEPTO',prop:'Visible'}]}");
      setEventMetadata("LBLEMPRESACPOSTALFILTER.CLICK","{handler:'e160K1',iparms:[{av:'divEmpresacpostalfiltercontainer_Class',ctrl:'EMPRESACPOSTALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEmpresacpostalfiltercontainer_Class',ctrl:'EMPRESACPOSTALFILTERCONTAINER',prop:'Class'},{av:'edtavCempresacpostal_Visible',ctrl:'vCEMPRESACPOSTAL',prop:'Visible'}]}");
      setEventMetadata("LBLLOCALIDADIDFILTER.CLICK","{handler:'e170K1',iparms:[{av:'divLocalidadidfiltercontainer_Class',ctrl:'LOCALIDADIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divLocalidadidfiltercontainer_Class',ctrl:'LOCALIDADIDFILTERCONTAINER',prop:'Class'},{av:'edtavClocalidadid_Visible',ctrl:'vCLOCALIDADID',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e210K2',iparms:[{av:'A42EmpresaId',fld:'EMPRESAID'}],oparms:[{av:'AV13pEmpresaId',fld:'vPEMPRESAID'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cEmpresaNumeroDocumento',fld:'vCEMPRESANUMERODOCUMENTO'},{av:'AV8cEmpresaNumero',fld:'vCEMPRESANUMERO'},{av:'AV9cEmpresaPiso',fld:'vCEMPRESAPISO'},{av:'AV10cEmpresaDepto',fld:'vCEMPRESADEPTO'},{av:'AV11cEmpresaCPostal',fld:'vCEMPRESACPOSTAL'},{av:'AV12cLocalidadId',fld:'vCLOCALIDADID'}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cEmpresaNumeroDocumento',fld:'vCEMPRESANUMERODOCUMENTO'},{av:'AV8cEmpresaNumero',fld:'vCEMPRESANUMERO'},{av:'AV9cEmpresaPiso',fld:'vCEMPRESAPISO'},{av:'AV10cEmpresaDepto',fld:'vCEMPRESADEPTO'},{av:'AV11cEmpresaCPostal',fld:'vCEMPRESACPOSTAL'},{av:'AV12cLocalidadId',fld:'vCLOCALIDADID'}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cEmpresaNumeroDocumento',fld:'vCEMPRESANUMERODOCUMENTO'},{av:'AV8cEmpresaNumero',fld:'vCEMPRESANUMERO'},{av:'AV9cEmpresaPiso',fld:'vCEMPRESAPISO'},{av:'AV10cEmpresaDepto',fld:'vCEMPRESADEPTO'},{av:'AV11cEmpresaCPostal',fld:'vCEMPRESACPOSTAL'},{av:'AV12cLocalidadId',fld:'vCLOCALIDADID'}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEmpresaId',fld:'vCEMPRESAID'},{av:'AV7cEmpresaNumeroDocumento',fld:'vCEMPRESANUMERODOCUMENTO'},{av:'AV8cEmpresaNumero',fld:'vCEMPRESANUMERO'},{av:'AV9cEmpresaPiso',fld:'vCEMPRESAPISO'},{av:'AV10cEmpresaDepto',fld:'vCEMPRESADEPTO'},{av:'AV11cEmpresaCPostal',fld:'vCEMPRESACPOSTAL'},{av:'AV12cLocalidadId',fld:'vCLOCALIDADID'}],oparms:[]}");
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
      AV7cEmpresaNumeroDocumento = "" ;
      AV10cEmpresaDepto = "" ;
      AV11cEmpresaCPostal = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblempresaidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblempresanumerodocumentofilter_Jsonclick = "" ;
      lblLblempresanumerofilter_Jsonclick = "" ;
      lblLblempresapisofilter_Jsonclick = "" ;
      lblLblempresadeptofilter_Jsonclick = "" ;
      lblLblempresacpostalfilter_Jsonclick = "" ;
      lblLbllocalidadidfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A44EmpresaNumeroDocumento = "" ;
      A48EmpresaDepto = "" ;
      A49EmpresaCPostal = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXKey = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV7cEmpresaNumeroDocumento = "" ;
      lV10cEmpresaDepto = "" ;
      lV11cEmpresaCPostal = "" ;
      H000K2_A1ProvinciaId = new short[1] ;
      H000K2_A3PaisId = new short[1] ;
      H000K2_A5LocalidadId = new short[1] ;
      H000K2_A49EmpresaCPostal = new String[] {""} ;
      H000K2_A48EmpresaDepto = new String[] {""} ;
      H000K2_A47EmpresaPiso = new short[1] ;
      H000K2_A46EmpresaNumero = new int[1] ;
      H000K2_A44EmpresaNumeroDocumento = new String[] {""} ;
      H000K2_A42EmpresaId = new int[1] ;
      H000K3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx00e0__default(),
         new Object[] {
             new Object[] {
            H000K2_A1ProvinciaId, H000K2_A3PaisId, H000K2_A5LocalidadId, H000K2_A49EmpresaCPostal, H000K2_A48EmpresaDepto, H000K2_A47EmpresaPiso, H000K2_A46EmpresaNumero, H000K2_A44EmpresaNumeroDocumento, H000K2_A42EmpresaId
            }
            , new Object[] {
            H000K3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_84 ;
   private short nGXsfl_84_idx=1 ;
   private short AV9cEmpresaPiso ;
   private short AV12cLocalidadId ;
   private short wbEnd ;
   private short wbStart ;
   private short A47EmpresaPiso ;
   private short A5LocalidadId ;
   private short A3PaisId ;
   private short A1ProvinciaId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_84_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int AV6cEmpresaId ;
   private int AV8cEmpresaNumero ;
   private int AV13pEmpresaId ;
   private int edtavCempresaid_Enabled ;
   private int edtavCempresaid_Visible ;
   private int edtavCempresanumerodocumento_Visible ;
   private int edtavCempresanumerodocumento_Enabled ;
   private int edtavCempresanumero_Enabled ;
   private int edtavCempresanumero_Visible ;
   private int edtavCempresapiso_Enabled ;
   private int edtavCempresapiso_Visible ;
   private int edtavCempresadepto_Visible ;
   private int edtavCempresadepto_Enabled ;
   private int edtavCempresacpostal_Visible ;
   private int edtavCempresacpostal_Enabled ;
   private int edtavClocalidadid_Enabled ;
   private int edtavClocalidadid_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A42EmpresaId ;
   private int A46EmpresaNumero ;
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
   private String divEmpresanumerodocumentofiltercontainer_Class ;
   private String divEmpresanumerofiltercontainer_Class ;
   private String divEmpresapisofiltercontainer_Class ;
   private String divEmpresadeptofiltercontainer_Class ;
   private String divEmpresacpostalfiltercontainer_Class ;
   private String divLocalidadidfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV7cEmpresaNumeroDocumento ;
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
   private String divEmpresanumerodocumentofiltercontainer_Internalname ;
   private String lblLblempresanumerodocumentofilter_Internalname ;
   private String lblLblempresanumerodocumentofilter_Jsonclick ;
   private String edtavCempresanumerodocumento_Internalname ;
   private String edtavCempresanumerodocumento_Jsonclick ;
   private String divEmpresanumerofiltercontainer_Internalname ;
   private String lblLblempresanumerofilter_Internalname ;
   private String lblLblempresanumerofilter_Jsonclick ;
   private String edtavCempresanumero_Internalname ;
   private String edtavCempresanumero_Jsonclick ;
   private String divEmpresapisofiltercontainer_Internalname ;
   private String lblLblempresapisofilter_Internalname ;
   private String lblLblempresapisofilter_Jsonclick ;
   private String edtavCempresapiso_Internalname ;
   private String edtavCempresapiso_Jsonclick ;
   private String divEmpresadeptofiltercontainer_Internalname ;
   private String lblLblempresadeptofilter_Internalname ;
   private String lblLblempresadeptofilter_Jsonclick ;
   private String edtavCempresadepto_Internalname ;
   private String edtavCempresadepto_Jsonclick ;
   private String divEmpresacpostalfiltercontainer_Internalname ;
   private String lblLblempresacpostalfilter_Internalname ;
   private String lblLblempresacpostalfilter_Jsonclick ;
   private String edtavCempresacpostal_Internalname ;
   private String edtavCempresacpostal_Jsonclick ;
   private String divLocalidadidfiltercontainer_Internalname ;
   private String lblLbllocalidadidfilter_Internalname ;
   private String lblLbllocalidadidfilter_Jsonclick ;
   private String edtavClocalidadid_Internalname ;
   private String edtavClocalidadid_Jsonclick ;
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
   private String A44EmpresaNumeroDocumento ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtEmpresaId_Internalname ;
   private String edtEmpresaNumeroDocumento_Internalname ;
   private String edtEmpresaNumero_Internalname ;
   private String edtEmpresaPiso_Internalname ;
   private String edtEmpresaDepto_Internalname ;
   private String edtEmpresaCPostal_Internalname ;
   private String edtLocalidadId_Internalname ;
   private String edtPaisId_Internalname ;
   private String edtProvinciaId_Internalname ;
   private String GXKey ;
   private String scmdbuf ;
   private String lV7cEmpresaNumeroDocumento ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtEmpresaId_Jsonclick ;
   private String edtEmpresaNumeroDocumento_Jsonclick ;
   private String edtEmpresaNumero_Jsonclick ;
   private String edtEmpresaPiso_Jsonclick ;
   private String edtEmpresaDepto_Jsonclick ;
   private String edtEmpresaCPostal_Jsonclick ;
   private String edtLocalidadId_Jsonclick ;
   private String edtPaisId_Jsonclick ;
   private String edtProvinciaId_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV10cEmpresaDepto ;
   private String AV11cEmpresaCPostal ;
   private String A48EmpresaDepto ;
   private String A49EmpresaCPostal ;
   private String AV17Linkselection_GXI ;
   private String lV10cEmpresaDepto ;
   private String lV11cEmpresaCPostal ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private short[] H000K2_A1ProvinciaId ;
   private short[] H000K2_A3PaisId ;
   private short[] H000K2_A5LocalidadId ;
   private String[] H000K2_A49EmpresaCPostal ;
   private String[] H000K2_A48EmpresaDepto ;
   private short[] H000K2_A47EmpresaPiso ;
   private int[] H000K2_A46EmpresaNumero ;
   private String[] H000K2_A44EmpresaNumeroDocumento ;
   private int[] H000K2_A42EmpresaId ;
   private long[] H000K3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00e0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cEmpresaNumeroDocumento ,
                                          int AV8cEmpresaNumero ,
                                          short AV9cEmpresaPiso ,
                                          String AV10cEmpresaDepto ,
                                          String AV11cEmpresaCPostal ,
                                          short AV12cLocalidadId ,
                                          String A44EmpresaNumeroDocumento ,
                                          int A46EmpresaNumero ,
                                          short A47EmpresaPiso ,
                                          String A48EmpresaDepto ,
                                          String A49EmpresaCPostal ,
                                          short A5LocalidadId ,
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
      sSelectString = " ProvinciaId, PaisId, LocalidadId, EmpresaCPostal, EmpresaDepto, EmpresaPiso, EmpresaNumero," ;
      sSelectString = sSelectString + " EmpresaNumeroDocumento, EmpresaId" ;
      sFromString = " FROM Empresa" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (EmpresaId >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cEmpresaNumeroDocumento)==0) )
      {
         sWhereString = sWhereString + " and (EmpresaNumeroDocumento like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cEmpresaNumero) )
      {
         sWhereString = sWhereString + " and (EmpresaNumero >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cEmpresaPiso) )
      {
         sWhereString = sWhereString + " and (EmpresaPiso >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cEmpresaDepto)==0) )
      {
         sWhereString = sWhereString + " and (EmpresaDepto like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cEmpresaCPostal)==0) )
      {
         sWhereString = sWhereString + " and (EmpresaCPostal like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (0==AV12cLocalidadId) )
      {
         sWhereString = sWhereString + " and (LocalidadId >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY EmpresaId" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000K3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cEmpresaNumeroDocumento ,
                                          int AV8cEmpresaNumero ,
                                          short AV9cEmpresaPiso ,
                                          String AV10cEmpresaDepto ,
                                          String AV11cEmpresaCPostal ,
                                          short AV12cLocalidadId ,
                                          String A44EmpresaNumeroDocumento ,
                                          int A46EmpresaNumero ,
                                          short A47EmpresaPiso ,
                                          String A48EmpresaDepto ,
                                          String A49EmpresaCPostal ,
                                          short A5LocalidadId ,
                                          int AV6cEmpresaId )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM Empresa" ;
      scmdbuf = scmdbuf + " WHERE (EmpresaId >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cEmpresaNumeroDocumento)==0) )
      {
         sWhereString = sWhereString + " and (EmpresaNumeroDocumento like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cEmpresaNumero) )
      {
         sWhereString = sWhereString + " and (EmpresaNumero >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cEmpresaPiso) )
      {
         sWhereString = sWhereString + " and (EmpresaPiso >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cEmpresaDepto)==0) )
      {
         sWhereString = sWhereString + " and (EmpresaDepto like ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cEmpresaCPostal)==0) )
      {
         sWhereString = sWhereString + " and (EmpresaCPostal like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (0==AV12cLocalidadId) )
      {
         sWhereString = sWhereString + " and (LocalidadId >= ?)" ;
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
                  return conditional_H000K2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H000K3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000K3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 13) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
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
                  stmt.setString(sIdx, (String)parms[11], 13);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
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
                  stmt.setString(sIdx, (String)parms[8], 13);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               return;
      }
   }

}

