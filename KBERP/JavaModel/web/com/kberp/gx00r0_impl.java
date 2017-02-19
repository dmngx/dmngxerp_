/*
               File: gx00r0_impl
        Description: Selection List Entidad
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 14:16:59.5
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

public final  class gx00r0_impl extends GXDataArea
{
   public gx00r0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00r0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00r0_impl.class ));
   }

   public gx00r0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCentidadtipo = new HTMLChoice();
      cmbEntidadTipo = new HTMLChoice();
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
            AV6cEntidadId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cEmpresaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cEntidadNumeroDocumento = httpContext.GetNextPar( ) ;
            AV9cTipoDocumentoId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10cCondicionCpraVtaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11cEntidadTipo = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEmpresaId, AV8cEntidadNumeroDocumento, AV9cTipoDocumentoId, AV10cCondicionCpraVtaId, AV11cEntidadTipo) ;
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
            AV12pEntidadId = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12pEntidadId", GXutil.ltrim( GXutil.str( AV12pEntidadId, 6, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV13pEmpresaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pEmpresaId", GXutil.ltrim( GXutil.str( AV13pEmpresaId, 6, 0)));
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
      pa0S2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0S2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721914165914");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx00r0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pEntidadId,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEmpresaId,6,0)))+"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENTIDADID", GXutil.ltrim( localUtil.ntoc( AV6cEntidadId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEMPRESAID", GXutil.ltrim( localUtil.ntoc( AV7cEmpresaId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENTIDADNUMERODOCUMENTO", GXutil.rtrim( AV8cEntidadNumeroDocumento));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTIPODOCUMENTOID", GXutil.ltrim( localUtil.ntoc( AV9cTipoDocumentoId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCONDICIONCPRAVTAID", GXutil.ltrim( localUtil.ntoc( AV10cCondicionCpraVtaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENTIDADTIPO", GXutil.ltrim( localUtil.ntoc( AV11cEntidadTipo, (byte)(2), (byte)(0), ",", "")));
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPENTIDADID", GXutil.ltrim( localUtil.ntoc( AV12pEntidadId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPEMPRESAID", GXutil.ltrim( localUtil.ntoc( AV13pEmpresaId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADIDFILTERCONTAINER_Class", GXutil.rtrim( divEntidadidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESAIDFILTERCONTAINER_Class", GXutil.rtrim( divEmpresaidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADNUMERODOCUMENTOFILTERCONTAINER_Class", GXutil.rtrim( divEntidadnumerodocumentofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "TIPODOCUMENTOIDFILTERCONTAINER_Class", GXutil.rtrim( divTipodocumentoidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CONDICIONCPRAVTAIDFILTERCONTAINER_Class", GXutil.rtrim( divCondicioncpravtaidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADTIPOFILTERCONTAINER_Class", GXutil.rtrim( divEntidadtipofiltercontainer_Class));
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
         we0S2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0S2( ) ;
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
      return formatLink("com.kberp.gx00r0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pEntidadId,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEmpresaId,6,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00R0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Entidad" ;
   }

   public void wb0S0( )
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEntidadidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divEntidadidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidadidfilter_Internalname, "Entidad Id", "", "", lblLblentidadidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCentidadid_Internalname, "Entidad Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCentidadid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cEntidadId, (byte)(6), (byte)(0), ",", "")), ((edtavCentidadid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cEntidadId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cEntidadId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCentidadid_Jsonclick, 0, "Attribute", "", "", "", edtavCentidadid_Visible, edtavCentidadid_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00R0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEmpresaidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divEmpresaidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblempresaidfilter_Internalname, "Empresa Id", "", "", lblLblempresaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCempresaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cEmpresaId, (byte)(6), (byte)(0), ",", "")), ((edtavCempresaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cEmpresaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cEmpresaId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCempresaid_Jsonclick, 0, "Attribute", "", "", "", edtavCempresaid_Visible, edtavCempresaid_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00R0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEntidadnumerodocumentofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEntidadnumerodocumentofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidadnumerodocumentofilter_Internalname, "Entidad Numero Documento", "", "", lblLblentidadnumerodocumentofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCentidadnumerodocumento_Internalname, "Entidad Numero Documento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCentidadnumerodocumento_Internalname, GXutil.rtrim( AV8cEntidadNumeroDocumento), GXutil.rtrim( localUtil.format( AV8cEntidadNumeroDocumento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCentidadnumerodocumento_Jsonclick, 0, "Attribute", "", "", "", edtavCentidadnumerodocumento_Visible, edtavCentidadnumerodocumento_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00R0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divTipodocumentoidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTipodocumentoidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLbltipodocumentoidfilter_Internalname, "Tipo Documento Id", "", "", lblLbltipodocumentoidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCtipodocumentoid_Internalname, "Tipo Documento Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCtipodocumentoid_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cTipoDocumentoId, (byte)(4), (byte)(0), ",", "")), ((edtavCtipodocumentoid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cTipoDocumentoId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cTipoDocumentoId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtipodocumentoid_Jsonclick, 0, "Attribute", "", "", "", edtavCtipodocumentoid_Visible, edtavCtipodocumentoid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00R0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divCondicioncpravtaidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCondicioncpravtaidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcondicioncpravtaidfilter_Internalname, "Condicion Cpra Vta Id", "", "", lblLblcondicioncpravtaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcondicioncpravtaid_Internalname, "Condicion Cpra Vta Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcondicioncpravtaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cCondicionCpraVtaId, (byte)(4), (byte)(0), ",", "")), ((edtavCcondicioncpravtaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cCondicionCpraVtaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cCondicionCpraVtaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcondicioncpravtaid_Jsonclick, 0, "Attribute", "", "", "", edtavCcondicioncpravtaid_Visible, edtavCcondicioncpravtaid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00R0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEntidadtipofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEntidadtipofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidadtipofilter_Internalname, "Entidad Tipo", "", "", lblLblentidadtipofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00R0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, cmbavCentidadtipo.getInternalname(), "Entidad Tipo", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         /* ComboBox */
         com.kberp.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCentidadtipo, cmbavCentidadtipo.getInternalname(), GXutil.trim( GXutil.str( AV11cEntidadTipo, 2, 0)), 1, cmbavCentidadtipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavCentidadtipo.getVisible(), cmbavCentidadtipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "", true, "HLP_Gx00R0.htm");
         cmbavCentidadtipo.setValue( GXutil.trim( GXutil.str( AV11cEntidadTipo, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCentidadtipo.getInternalname(), "Values", cmbavCentidadtipo.ToJavascriptSource());
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
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e170s1_client"+"'", TempTags, "", 2, "HLP_Gx00R0.htm");
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Empresa Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Numero Documento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Documento Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Condicion Cpra Vta Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A20EntidadId, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A29EntidadNumeroDocumento));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9TipoDocumentoId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A15CondicionCpraVtaId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A27EntidadTipo, (byte)(2), (byte)(0), ".", "")));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00R0.htm");
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

   public void start0S2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_2-109402", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Entidad", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0S0( ) ;
   }

   public void ws0S2( )
   {
      start0S2( ) ;
      evt0S2( ) ;
   }

   public void evt0S2( )
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
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))));
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection));
                           A20EntidadId = (int)(localUtil.ctol( httpContext.cgiGet( edtEntidadId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadId_Internalname, GXutil.ltrim( GXutil.str( A20EntidadId, 6, 0)));
                           A42EmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( edtEmpresaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEmpresaId_Internalname, GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
                           A29EntidadNumeroDocumento = httpContext.cgiGet( edtEntidadNumeroDocumento_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadNumeroDocumento_Internalname, A29EntidadNumeroDocumento);
                           A9TipoDocumentoId = (short)(localUtil.ctol( httpContext.cgiGet( edtTipoDocumentoId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtTipoDocumentoId_Internalname, GXutil.ltrim( GXutil.str( A9TipoDocumentoId, 4, 0)));
                           A15CondicionCpraVtaId = (short)(localUtil.ctol( httpContext.cgiGet( edtCondicionCpraVtaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCondicionCpraVtaId_Internalname, GXutil.ltrim( GXutil.str( A15CondicionCpraVtaId, 4, 0)));
                           cmbEntidadTipo.setName( cmbEntidadTipo.getInternalname() );
                           cmbEntidadTipo.setValue( httpContext.cgiGet( cmbEntidadTipo.getInternalname()) );
                           A27EntidadTipo = (byte)(GXutil.lval( httpContext.cgiGet( cmbEntidadTipo.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbEntidadTipo.getInternalname(), GXutil.ltrim( GXutil.str( A27EntidadTipo, 2, 0)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e180S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e190S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Centidadid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADID"), ",", ".") != AV6cEntidadId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cempresaid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEMPRESAID"), ",", ".") != AV7cEmpresaId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Centidadnumerodocumento Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENTIDADNUMERODOCUMENTO"), AV8cEntidadNumeroDocumento) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctipodocumentoid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTIPODOCUMENTOID"), ",", ".") != AV9cTipoDocumentoId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccondicioncpravtaid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCONDICIONCPRAVTAID"), ",", ".") != AV10cCondicionCpraVtaId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Centidadtipo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADTIPO"), ",", ".") != AV11cEntidadTipo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e200S2 ();
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

   public void we0S2( )
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

   public void pa0S2( )
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
         cmbavCentidadtipo.setName( "vCENTIDADTIPO" );
         cmbavCentidadtipo.setWebtags( "" );
         cmbavCentidadtipo.addItem("1", "Cliente", (short)(0));
         cmbavCentidadtipo.addItem("1", "Proveedor", (short)(0));
         if ( cmbavCentidadtipo.getItemCount() > 0 )
         {
            AV11cEntidadTipo = (byte)(GXutil.lval( cmbavCentidadtipo.getValidValue(GXutil.trim( GXutil.str( AV11cEntidadTipo, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cEntidadTipo", GXutil.ltrim( GXutil.str( AV11cEntidadTipo, 2, 0)));
         }
         GXCCtl = "ENTIDADTIPO_" + sGXsfl_74_idx ;
         cmbEntidadTipo.setName( GXCCtl );
         cmbEntidadTipo.setWebtags( "" );
         cmbEntidadTipo.addItem("1", "Cliente", (short)(0));
         cmbEntidadTipo.addItem("1", "Proveedor", (short)(0));
         if ( cmbEntidadTipo.getItemCount() > 0 )
         {
            A27EntidadTipo = (byte)(GXutil.lval( cmbEntidadTipo.getValidValue(GXutil.trim( GXutil.str( A27EntidadTipo, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbEntidadTipo.getInternalname(), GXutil.ltrim( GXutil.str( A27EntidadTipo, 2, 0)));
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
                                  int AV6cEntidadId ,
                                  int AV7cEmpresaId ,
                                  String AV8cEntidadNumeroDocumento ,
                                  short AV9cTipoDocumentoId ,
                                  short AV10cCondicionCpraVtaId ,
                                  byte AV11cEntidadTipo )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0S2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0S2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0S2( )
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
                                              AV8cEntidadNumeroDocumento ,
                                              new Short(AV9cTipoDocumentoId) ,
                                              new Short(AV10cCondicionCpraVtaId) ,
                                              new Byte(AV11cEntidadTipo) ,
                                              A29EntidadNumeroDocumento ,
                                              new Short(A9TipoDocumentoId) ,
                                              new Short(A15CondicionCpraVtaId) ,
                                              new Byte(A27EntidadTipo) ,
                                              new Integer(AV6cEntidadId) ,
                                              new Integer(AV7cEmpresaId) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT
                                              }
         } ) ;
         lV8cEntidadNumeroDocumento = GXutil.padr( GXutil.rtrim( AV8cEntidadNumeroDocumento), 13, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cEntidadNumeroDocumento", AV8cEntidadNumeroDocumento);
         /* Using cursor H000S2 */
         pr_default.execute(0, new Object[] {new Integer(AV6cEntidadId), new Integer(AV7cEmpresaId), lV8cEntidadNumeroDocumento, new Short(AV9cTipoDocumentoId), new Short(AV10cCondicionCpraVtaId), new Byte(AV11cEntidadTipo), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_74_idx = (short)(1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A27EntidadTipo = H000S2_A27EntidadTipo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, cmbEntidadTipo.getInternalname(), GXutil.ltrim( GXutil.str( A27EntidadTipo, 2, 0)));
            A15CondicionCpraVtaId = H000S2_A15CondicionCpraVtaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCondicionCpraVtaId_Internalname, GXutil.ltrim( GXutil.str( A15CondicionCpraVtaId, 4, 0)));
            A9TipoDocumentoId = H000S2_A9TipoDocumentoId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtTipoDocumentoId_Internalname, GXutil.ltrim( GXutil.str( A9TipoDocumentoId, 4, 0)));
            A29EntidadNumeroDocumento = H000S2_A29EntidadNumeroDocumento[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadNumeroDocumento_Internalname, A29EntidadNumeroDocumento);
            A42EmpresaId = H000S2_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaId_Internalname, GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            A20EntidadId = H000S2_A20EntidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadId_Internalname, GXutil.ltrim( GXutil.str( A20EntidadId, 6, 0)));
            /* Execute user event: Load */
            e190S2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(74) ;
         wb0S0( ) ;
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
                                           AV8cEntidadNumeroDocumento ,
                                           new Short(AV9cTipoDocumentoId) ,
                                           new Short(AV10cCondicionCpraVtaId) ,
                                           new Byte(AV11cEntidadTipo) ,
                                           A29EntidadNumeroDocumento ,
                                           new Short(A9TipoDocumentoId) ,
                                           new Short(A15CondicionCpraVtaId) ,
                                           new Byte(A27EntidadTipo) ,
                                           new Integer(AV6cEntidadId) ,
                                           new Integer(AV7cEmpresaId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT
                                           }
      } ) ;
      lV8cEntidadNumeroDocumento = GXutil.padr( GXutil.rtrim( AV8cEntidadNumeroDocumento), 13, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cEntidadNumeroDocumento", AV8cEntidadNumeroDocumento);
      /* Using cursor H000S3 */
      pr_default.execute(1, new Object[] {new Integer(AV6cEntidadId), new Integer(AV7cEmpresaId), lV8cEntidadNumeroDocumento, new Short(AV9cTipoDocumentoId), new Short(AV10cCondicionCpraVtaId), new Byte(AV11cEntidadTipo)});
      GRID1_nRecordCount = H000S3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEmpresaId, AV8cEntidadNumeroDocumento, AV9cTipoDocumentoId, AV10cCondicionCpraVtaId, AV11cEntidadTipo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEmpresaId, AV8cEntidadNumeroDocumento, AV9cTipoDocumentoId, AV10cCondicionCpraVtaId, AV11cEntidadTipo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEmpresaId, AV8cEntidadNumeroDocumento, AV9cTipoDocumentoId, AV10cCondicionCpraVtaId, AV11cEntidadTipo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEmpresaId, AV8cEntidadNumeroDocumento, AV9cTipoDocumentoId, AV10cCondicionCpraVtaId, AV11cEntidadTipo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEmpresaId, AV8cEntidadNumeroDocumento, AV9cTipoDocumentoId, AV10cCondicionCpraVtaId, AV11cEntidadTipo) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0S0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e180S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCentidadid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCentidadid_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCENTIDADID");
            GX_FocusControl = edtavCentidadid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cEntidadId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cEntidadId", GXutil.ltrim( GXutil.str( AV6cEntidadId, 6, 0)));
         }
         else
         {
            AV6cEntidadId = (int)(localUtil.ctol( httpContext.cgiGet( edtavCentidadid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cEntidadId", GXutil.ltrim( GXutil.str( AV6cEntidadId, 6, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCempresaid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCempresaid_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCEMPRESAID");
            GX_FocusControl = edtavCempresaid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cEmpresaId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cEmpresaId", GXutil.ltrim( GXutil.str( AV7cEmpresaId, 6, 0)));
         }
         else
         {
            AV7cEmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( edtavCempresaid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cEmpresaId", GXutil.ltrim( GXutil.str( AV7cEmpresaId, 6, 0)));
         }
         AV8cEntidadNumeroDocumento = httpContext.cgiGet( edtavCentidadnumerodocumento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cEntidadNumeroDocumento", AV8cEntidadNumeroDocumento);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtipodocumentoid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtipodocumentoid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTIPODOCUMENTOID");
            GX_FocusControl = edtavCtipodocumentoid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cTipoDocumentoId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTipoDocumentoId", GXutil.ltrim( GXutil.str( AV9cTipoDocumentoId, 4, 0)));
         }
         else
         {
            AV9cTipoDocumentoId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCtipodocumentoid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTipoDocumentoId", GXutil.ltrim( GXutil.str( AV9cTipoDocumentoId, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcondicioncpravtaid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcondicioncpravtaid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCONDICIONCPRAVTAID");
            GX_FocusControl = edtavCcondicioncpravtaid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cCondicionCpraVtaId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCondicionCpraVtaId", GXutil.ltrim( GXutil.str( AV10cCondicionCpraVtaId, 4, 0)));
         }
         else
         {
            AV10cCondicionCpraVtaId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcondicioncpravtaid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCondicionCpraVtaId", GXutil.ltrim( GXutil.str( AV10cCondicionCpraVtaId, 4, 0)));
         }
         cmbavCentidadtipo.setName( cmbavCentidadtipo.getInternalname() );
         cmbavCentidadtipo.setValue( httpContext.cgiGet( cmbavCentidadtipo.getInternalname()) );
         AV11cEntidadTipo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavCentidadtipo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cEntidadTipo", GXutil.ltrim( GXutil.str( AV11cEntidadTipo, 2, 0)));
         /* Read saved values. */
         nRC_GXsfl_74 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADID"), ",", ".") != AV6cEntidadId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEMPRESAID"), ",", ".") != AV7cEmpresaId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENTIDADNUMERODOCUMENTO"), AV8cEntidadNumeroDocumento) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTIPODOCUMENTOID"), ",", ".") != AV9cTipoDocumentoId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCONDICIONCPRAVTAID"), ",", ".") != AV10cCondicionCpraVtaId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADTIPO"), ",", ".") != AV11cEntidadTipo )
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
      e180S2 ();
      if (returnInSub) return;
   }

   public void e180S2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Entidad", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e190S2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      e200S2 ();
      if (returnInSub) return;
   }

   public void e200S2( )
   {
      /* Enter Routine */
      AV12pEntidadId = A20EntidadId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pEntidadId", GXutil.ltrim( GXutil.str( AV12pEntidadId, 6, 0)));
      AV13pEmpresaId = A42EmpresaId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pEmpresaId", GXutil.ltrim( GXutil.str( AV13pEmpresaId, 6, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV12pEntidadId),new Integer(AV13pEmpresaId)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV12pEntidadId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pEntidadId", GXutil.ltrim( GXutil.str( AV12pEntidadId, 6, 0)));
      AV13pEmpresaId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
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
      pa0S2( ) ;
      ws0S2( ) ;
      we0S2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14162187");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2017219141712");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx00r0.js", "?2017219141712");
      /* End function include_jscripts */
   }

   public void subsflControlProps_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_idx ;
      edtEntidadId_Internalname = "ENTIDADID_"+sGXsfl_74_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_74_idx ;
      edtEntidadNumeroDocumento_Internalname = "ENTIDADNUMERODOCUMENTO_"+sGXsfl_74_idx ;
      edtTipoDocumentoId_Internalname = "TIPODOCUMENTOID_"+sGXsfl_74_idx ;
      edtCondicionCpraVtaId_Internalname = "CONDICIONCPRAVTAID_"+sGXsfl_74_idx ;
      cmbEntidadTipo.setInternalname( "ENTIDADTIPO_"+sGXsfl_74_idx );
   }

   public void subsflControlProps_fel_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_fel_idx ;
      edtEntidadId_Internalname = "ENTIDADID_"+sGXsfl_74_fel_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_74_fel_idx ;
      edtEntidadNumeroDocumento_Internalname = "ENTIDADNUMERODOCUMENTO_"+sGXsfl_74_fel_idx ;
      edtTipoDocumentoId_Internalname = "TIPODOCUMENTOID_"+sGXsfl_74_fel_idx ;
      edtCondicionCpraVtaId_Internalname = "CONDICIONCPRAVTAID_"+sGXsfl_74_fel_idx ;
      cmbEntidadTipo.setInternalname( "ENTIDADTIPO_"+sGXsfl_74_fel_idx );
   }

   public void sendrow_742( )
   {
      subsflControlProps_742( ) ;
      wb0S0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A20EntidadId, (byte)(6), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadId_Internalname,GXutil.ltrim( localUtil.ntoc( A20EntidadId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A20EntidadId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasMaestras","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaId_Internalname,GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasMaestras","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadNumeroDocumento_Internalname,GXutil.rtrim( A29EntidadNumeroDocumento),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadNumeroDocumento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(13),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"NumeroDocumento","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipoDocumentoId_Internalname,GXutil.ltrim( localUtil.ntoc( A9TipoDocumentoId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A9TipoDocumentoId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipoDocumentoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCondicionCpraVtaId_Internalname,GXutil.ltrim( localUtil.ntoc( A15CondicionCpraVtaId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A15CondicionCpraVtaId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCondicionCpraVtaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_74_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ENTIDADTIPO_" + sGXsfl_74_idx ;
            cmbEntidadTipo.setName( GXCCtl );
            cmbEntidadTipo.setWebtags( "" );
            cmbEntidadTipo.addItem("1", "Cliente", (short)(0));
            cmbEntidadTipo.addItem("1", "Proveedor", (short)(0));
            if ( cmbEntidadTipo.getItemCount() > 0 )
            {
               A27EntidadTipo = (byte)(GXutil.lval( cmbEntidadTipo.getValidValue(GXutil.trim( GXutil.str( A27EntidadTipo, 2, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbEntidadTipo.getInternalname(), GXutil.ltrim( GXutil.str( A27EntidadTipo, 2, 0)));
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbEntidadTipo,cmbEntidadTipo.getInternalname(),GXutil.trim( GXutil.str( A27EntidadTipo, 2, 0)),new Integer(1),cmbEntidadTipo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbEntidadTipo.setValue( GXutil.trim( GXutil.str( A27EntidadTipo, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbEntidadTipo.getInternalname(), "Values", cmbEntidadTipo.ToJavascriptSource());
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      /* End function sendrow_742 */
   }

   public void init_default_properties( )
   {
      lblLblentidadidfilter_Internalname = "LBLENTIDADIDFILTER" ;
      edtavCentidadid_Internalname = "vCENTIDADID" ;
      divEntidadidfiltercontainer_Internalname = "ENTIDADIDFILTERCONTAINER" ;
      lblLblempresaidfilter_Internalname = "LBLEMPRESAIDFILTER" ;
      edtavCempresaid_Internalname = "vCEMPRESAID" ;
      divEmpresaidfiltercontainer_Internalname = "EMPRESAIDFILTERCONTAINER" ;
      lblLblentidadnumerodocumentofilter_Internalname = "LBLENTIDADNUMERODOCUMENTOFILTER" ;
      edtavCentidadnumerodocumento_Internalname = "vCENTIDADNUMERODOCUMENTO" ;
      divEntidadnumerodocumentofiltercontainer_Internalname = "ENTIDADNUMERODOCUMENTOFILTERCONTAINER" ;
      lblLbltipodocumentoidfilter_Internalname = "LBLTIPODOCUMENTOIDFILTER" ;
      edtavCtipodocumentoid_Internalname = "vCTIPODOCUMENTOID" ;
      divTipodocumentoidfiltercontainer_Internalname = "TIPODOCUMENTOIDFILTERCONTAINER" ;
      lblLblcondicioncpravtaidfilter_Internalname = "LBLCONDICIONCPRAVTAIDFILTER" ;
      edtavCcondicioncpravtaid_Internalname = "vCCONDICIONCPRAVTAID" ;
      divCondicioncpravtaidfiltercontainer_Internalname = "CONDICIONCPRAVTAIDFILTERCONTAINER" ;
      lblLblentidadtipofilter_Internalname = "LBLENTIDADTIPOFILTER" ;
      cmbavCentidadtipo.setInternalname( "vCENTIDADTIPO" );
      divEntidadtipofiltercontainer_Internalname = "ENTIDADTIPOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtEntidadId_Internalname = "ENTIDADID" ;
      edtEmpresaId_Internalname = "EMPRESAID" ;
      edtEntidadNumeroDocumento_Internalname = "ENTIDADNUMERODOCUMENTO" ;
      edtTipoDocumentoId_Internalname = "TIPODOCUMENTOID" ;
      edtCondicionCpraVtaId_Internalname = "CONDICIONCPRAVTAID" ;
      cmbEntidadTipo.setInternalname( "ENTIDADTIPO" );
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
      cmbEntidadTipo.setJsonclick( "" );
      edtCondicionCpraVtaId_Jsonclick = "" ;
      edtTipoDocumentoId_Jsonclick = "" ;
      edtEntidadNumeroDocumento_Jsonclick = "" ;
      edtEmpresaId_Jsonclick = "" ;
      edtEntidadId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCentidadtipo.setJsonclick( "" );
      cmbavCentidadtipo.setEnabled( 1 );
      cmbavCentidadtipo.setVisible( 1 );
      edtavCcondicioncpravtaid_Jsonclick = "" ;
      edtavCcondicioncpravtaid_Enabled = 1 ;
      edtavCcondicioncpravtaid_Visible = 1 ;
      edtavCtipodocumentoid_Jsonclick = "" ;
      edtavCtipodocumentoid_Enabled = 1 ;
      edtavCtipodocumentoid_Visible = 1 ;
      edtavCentidadnumerodocumento_Jsonclick = "" ;
      edtavCentidadnumerodocumento_Enabled = 1 ;
      edtavCentidadnumerodocumento_Visible = 1 ;
      edtavCempresaid_Jsonclick = "" ;
      edtavCempresaid_Enabled = 1 ;
      edtavCempresaid_Visible = 1 ;
      edtavCentidadid_Jsonclick = "" ;
      edtavCentidadid_Enabled = 1 ;
      edtavCentidadid_Visible = 1 ;
      divEntidadtipofiltercontainer_Class = "AdvancedContainerItem" ;
      divCondicioncpravtaidfiltercontainer_Class = "AdvancedContainerItem" ;
      divTipodocumentoidfiltercontainer_Class = "AdvancedContainerItem" ;
      divEntidadnumerodocumentofiltercontainer_Class = "AdvancedContainerItem" ;
      divEmpresaidfiltercontainer_Class = "AdvancedContainerItem" ;
      divEntidadidfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Entidad" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEmpresaId',fld:'vCEMPRESAID'},{av:'AV8cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV9cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV10cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'cmbavCentidadtipo'},{av:'AV11cEntidadTipo',fld:'vCENTIDADTIPO'}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e170S1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLENTIDADIDFILTER.CLICK","{handler:'e110S1',iparms:[{av:'divEntidadidfiltercontainer_Class',ctrl:'ENTIDADIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidadidfiltercontainer_Class',ctrl:'ENTIDADIDFILTERCONTAINER',prop:'Class'},{av:'edtavCentidadid_Visible',ctrl:'vCENTIDADID',prop:'Visible'}]}");
      setEventMetadata("LBLEMPRESAIDFILTER.CLICK","{handler:'e120S1',iparms:[{av:'divEmpresaidfiltercontainer_Class',ctrl:'EMPRESAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEmpresaidfiltercontainer_Class',ctrl:'EMPRESAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCempresaid_Visible',ctrl:'vCEMPRESAID',prop:'Visible'}]}");
      setEventMetadata("LBLENTIDADNUMERODOCUMENTOFILTER.CLICK","{handler:'e130S1',iparms:[{av:'divEntidadnumerodocumentofiltercontainer_Class',ctrl:'ENTIDADNUMERODOCUMENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidadnumerodocumentofiltercontainer_Class',ctrl:'ENTIDADNUMERODOCUMENTOFILTERCONTAINER',prop:'Class'},{av:'edtavCentidadnumerodocumento_Visible',ctrl:'vCENTIDADNUMERODOCUMENTO',prop:'Visible'}]}");
      setEventMetadata("LBLTIPODOCUMENTOIDFILTER.CLICK","{handler:'e140S1',iparms:[{av:'divTipodocumentoidfiltercontainer_Class',ctrl:'TIPODOCUMENTOIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTipodocumentoidfiltercontainer_Class',ctrl:'TIPODOCUMENTOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCtipodocumentoid_Visible',ctrl:'vCTIPODOCUMENTOID',prop:'Visible'}]}");
      setEventMetadata("LBLCONDICIONCPRAVTAIDFILTER.CLICK","{handler:'e150S1',iparms:[{av:'divCondicioncpravtaidfiltercontainer_Class',ctrl:'CONDICIONCPRAVTAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCondicioncpravtaidfiltercontainer_Class',ctrl:'CONDICIONCPRAVTAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCcondicioncpravtaid_Visible',ctrl:'vCCONDICIONCPRAVTAID',prop:'Visible'}]}");
      setEventMetadata("LBLENTIDADTIPOFILTER.CLICK","{handler:'e160S1',iparms:[{av:'divEntidadtipofiltercontainer_Class',ctrl:'ENTIDADTIPOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidadtipofiltercontainer_Class',ctrl:'ENTIDADTIPOFILTERCONTAINER',prop:'Class'},{av:'cmbavCentidadtipo'}]}");
      setEventMetadata("ENTER","{handler:'e200S2',iparms:[{av:'A20EntidadId',fld:'ENTIDADID'},{av:'A42EmpresaId',fld:'EMPRESAID'}],oparms:[{av:'AV12pEntidadId',fld:'vPENTIDADID'},{av:'AV13pEmpresaId',fld:'vPEMPRESAID'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEmpresaId',fld:'vCEMPRESAID'},{av:'AV8cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV9cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV10cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'cmbavCentidadtipo'},{av:'AV11cEntidadTipo',fld:'vCENTIDADTIPO'}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEmpresaId',fld:'vCEMPRESAID'},{av:'AV8cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV9cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV10cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'cmbavCentidadtipo'},{av:'AV11cEntidadTipo',fld:'vCENTIDADTIPO'}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEmpresaId',fld:'vCEMPRESAID'},{av:'AV8cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV9cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV10cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'cmbavCentidadtipo'},{av:'AV11cEntidadTipo',fld:'vCENTIDADTIPO'}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEmpresaId',fld:'vCEMPRESAID'},{av:'AV8cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV9cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV10cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'cmbavCentidadtipo'},{av:'AV11cEntidadTipo',fld:'vCENTIDADTIPO'}],oparms:[]}");
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
      AV8cEntidadNumeroDocumento = "00-00000000-0" ;
      AV11cEntidadTipo = (byte)(1) ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblentidadidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblempresaidfilter_Jsonclick = "" ;
      lblLblentidadnumerodocumentofilter_Jsonclick = "" ;
      lblLbltipodocumentoidfilter_Jsonclick = "" ;
      lblLblcondicioncpravtaidfilter_Jsonclick = "" ;
      lblLblentidadtipofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A29EntidadNumeroDocumento = "" ;
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
      lV8cEntidadNumeroDocumento = "" ;
      H000S2_A27EntidadTipo = new byte[1] ;
      H000S2_A15CondicionCpraVtaId = new short[1] ;
      H000S2_A9TipoDocumentoId = new short[1] ;
      H000S2_A29EntidadNumeroDocumento = new String[] {""} ;
      H000S2_A42EmpresaId = new int[1] ;
      H000S2_A20EntidadId = new int[1] ;
      H000S3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx00r0__default(),
         new Object[] {
             new Object[] {
            H000S2_A27EntidadTipo, H000S2_A15CondicionCpraVtaId, H000S2_A9TipoDocumentoId, H000S2_A29EntidadNumeroDocumento, H000S2_A42EmpresaId, H000S2_A20EntidadId
            }
            , new Object[] {
            H000S3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11cEntidadTipo ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte A27EntidadTipo ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_74 ;
   private short nGXsfl_74_idx=1 ;
   private short AV9cTipoDocumentoId ;
   private short AV10cCondicionCpraVtaId ;
   private short wbEnd ;
   private short wbStart ;
   private short A9TipoDocumentoId ;
   private short A15CondicionCpraVtaId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_74_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int AV6cEntidadId ;
   private int AV7cEmpresaId ;
   private int AV12pEntidadId ;
   private int AV13pEmpresaId ;
   private int edtavCentidadid_Enabled ;
   private int edtavCentidadid_Visible ;
   private int edtavCempresaid_Enabled ;
   private int edtavCempresaid_Visible ;
   private int edtavCentidadnumerodocumento_Visible ;
   private int edtavCentidadnumerodocumento_Enabled ;
   private int edtavCtipodocumentoid_Enabled ;
   private int edtavCtipodocumentoid_Visible ;
   private int edtavCcondicioncpravtaid_Enabled ;
   private int edtavCcondicioncpravtaid_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A20EntidadId ;
   private int A42EmpresaId ;
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
   private String divEntidadidfiltercontainer_Class ;
   private String divEmpresaidfiltercontainer_Class ;
   private String divEntidadnumerodocumentofiltercontainer_Class ;
   private String divTipodocumentoidfiltercontainer_Class ;
   private String divCondicioncpravtaidfiltercontainer_Class ;
   private String divEntidadtipofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_74_idx="0001" ;
   private String AV8cEntidadNumeroDocumento ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divEntidadidfiltercontainer_Internalname ;
   private String lblLblentidadidfilter_Internalname ;
   private String lblLblentidadidfilter_Jsonclick ;
   private String edtavCentidadid_Internalname ;
   private String TempTags ;
   private String edtavCentidadid_Jsonclick ;
   private String divEmpresaidfiltercontainer_Internalname ;
   private String lblLblempresaidfilter_Internalname ;
   private String lblLblempresaidfilter_Jsonclick ;
   private String edtavCempresaid_Internalname ;
   private String edtavCempresaid_Jsonclick ;
   private String divEntidadnumerodocumentofiltercontainer_Internalname ;
   private String lblLblentidadnumerodocumentofilter_Internalname ;
   private String lblLblentidadnumerodocumentofilter_Jsonclick ;
   private String edtavCentidadnumerodocumento_Internalname ;
   private String edtavCentidadnumerodocumento_Jsonclick ;
   private String divTipodocumentoidfiltercontainer_Internalname ;
   private String lblLbltipodocumentoidfilter_Internalname ;
   private String lblLbltipodocumentoidfilter_Jsonclick ;
   private String edtavCtipodocumentoid_Internalname ;
   private String edtavCtipodocumentoid_Jsonclick ;
   private String divCondicioncpravtaidfiltercontainer_Internalname ;
   private String lblLblcondicioncpravtaidfilter_Internalname ;
   private String lblLblcondicioncpravtaidfilter_Jsonclick ;
   private String edtavCcondicioncpravtaid_Internalname ;
   private String edtavCcondicioncpravtaid_Jsonclick ;
   private String divEntidadtipofiltercontainer_Internalname ;
   private String lblLblentidadtipofilter_Internalname ;
   private String lblLblentidadtipofilter_Jsonclick ;
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
   private String A29EntidadNumeroDocumento ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtEntidadId_Internalname ;
   private String edtEmpresaId_Internalname ;
   private String edtEntidadNumeroDocumento_Internalname ;
   private String edtTipoDocumentoId_Internalname ;
   private String edtCondicionCpraVtaId_Internalname ;
   private String GXKey ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV8cEntidadNumeroDocumento ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtEntidadId_Jsonclick ;
   private String edtEmpresaId_Jsonclick ;
   private String edtEntidadNumeroDocumento_Jsonclick ;
   private String edtTipoDocumentoId_Jsonclick ;
   private String edtCondicionCpraVtaId_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV17Linkselection_GXI ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCentidadtipo ;
   private HTMLChoice cmbEntidadTipo ;
   private IDataStoreProvider pr_default ;
   private byte[] H000S2_A27EntidadTipo ;
   private short[] H000S2_A15CondicionCpraVtaId ;
   private short[] H000S2_A9TipoDocumentoId ;
   private String[] H000S2_A29EntidadNumeroDocumento ;
   private int[] H000S2_A42EmpresaId ;
   private int[] H000S2_A20EntidadId ;
   private long[] H000S3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00r0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cEntidadNumeroDocumento ,
                                          short AV9cTipoDocumentoId ,
                                          short AV10cCondicionCpraVtaId ,
                                          byte AV11cEntidadTipo ,
                                          String A29EntidadNumeroDocumento ,
                                          short A9TipoDocumentoId ,
                                          short A15CondicionCpraVtaId ,
                                          byte A27EntidadTipo ,
                                          int AV6cEntidadId ,
                                          int AV7cEmpresaId )
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
      sSelectString = " EntidadTipo, CondicionCpraVtaId, TipoDocumentoId, EntidadNumeroDocumento, EmpresaId," ;
      sSelectString = sSelectString + " EntidadId" ;
      sFromString = " FROM Entidad" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (EntidadId >= ? and EmpresaId >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cEntidadNumeroDocumento)==0) )
      {
         sWhereString = sWhereString + " and (EntidadNumeroDocumento like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cTipoDocumentoId) )
      {
         sWhereString = sWhereString + " and (TipoDocumentoId >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCondicionCpraVtaId) )
      {
         sWhereString = sWhereString + " and (CondicionCpraVtaId >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cEntidadTipo) )
      {
         sWhereString = sWhereString + " and (EntidadTipo >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY EntidadId, EmpresaId" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000S3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cEntidadNumeroDocumento ,
                                          short AV9cTipoDocumentoId ,
                                          short AV10cCondicionCpraVtaId ,
                                          byte AV11cEntidadTipo ,
                                          String A29EntidadNumeroDocumento ,
                                          short A9TipoDocumentoId ,
                                          short A15CondicionCpraVtaId ,
                                          byte A27EntidadTipo ,
                                          int AV6cEntidadId ,
                                          int AV7cEmpresaId )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [6] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM Entidad" ;
      scmdbuf = scmdbuf + " WHERE (EntidadId >= ? and EmpresaId >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cEntidadNumeroDocumento)==0) )
      {
         sWhereString = sWhereString + " and (EntidadNumeroDocumento like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cTipoDocumentoId) )
      {
         sWhereString = sWhereString + " and (TipoDocumentoId >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCondicionCpraVtaId) )
      {
         sWhereString = sWhereString + " and (CondicionCpraVtaId >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cEntidadTipo) )
      {
         sWhereString = sWhereString + " and (EntidadTipo >= ?)" ;
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
                  return conditional_H000S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() );
            case 1 :
                  return conditional_H000S3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000S3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 13) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
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
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
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
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

