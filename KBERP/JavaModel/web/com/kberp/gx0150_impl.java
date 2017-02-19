/*
               File: gx0150_impl
        Description: Selection List Entidad
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:2:0.55
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

public final  class gx0150_impl extends GXDataArea
{
   public gx0150_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0150_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0150_impl.class ));
   }

   public gx0150_impl( int remoteHandle ,
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
            AV6cEntidadId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cEntidadNumeroDocumento = httpContext.GetNextPar( ) ;
            AV8cTipoDocumentoId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cCondicionCpraVtaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10cCondicionIvaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11cProvinciaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV12cPaisId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEntidadNumeroDocumento, AV8cTipoDocumentoId, AV9cCondicionCpraVtaId, AV10cCondicionIvaId, AV11cProvinciaId, AV12cPaisId) ;
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
            AV13pEntidadId = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pEntidadId", GXutil.ltrim( GXutil.str( AV13pEntidadId, 6, 0)));
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
      pa122( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start122( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2017219172067");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx0150") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEntidadId,6,0)))+"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENTIDADNUMERODOCUMENTO", GXutil.rtrim( AV7cEntidadNumeroDocumento));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTIPODOCUMENTOID", GXutil.ltrim( localUtil.ntoc( AV8cTipoDocumentoId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCONDICIONCPRAVTAID", GXutil.ltrim( localUtil.ntoc( AV9cCondicionCpraVtaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCONDICIONIVAID", GXutil.ltrim( localUtil.ntoc( AV10cCondicionIvaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPROVINCIAID", GXutil.ltrim( localUtil.ntoc( AV11cProvinciaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPAISID", GXutil.ltrim( localUtil.ntoc( AV12cPaisId, (byte)(4), (byte)(0), ",", "")));
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPENTIDADID", GXutil.ltrim( localUtil.ntoc( AV13pEntidadId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADIDFILTERCONTAINER_Class", GXutil.rtrim( divEntidadidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADNUMERODOCUMENTOFILTERCONTAINER_Class", GXutil.rtrim( divEntidadnumerodocumentofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "TIPODOCUMENTOIDFILTERCONTAINER_Class", GXutil.rtrim( divTipodocumentoidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CONDICIONCPRAVTAIDFILTERCONTAINER_Class", GXutil.rtrim( divCondicioncpravtaidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CONDICIONIVAIDFILTERCONTAINER_Class", GXutil.rtrim( divCondicionivaidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "PROVINCIAIDFILTERCONTAINER_Class", GXutil.rtrim( divProvinciaidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "PAISIDFILTERCONTAINER_Class", GXutil.rtrim( divPaisidfiltercontainer_Class));
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
         we122( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt122( ) ;
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
      return formatLink("com.kberp.gx0150") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEntidadId,6,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx0150" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Entidad" ;
   }

   public void wb120( )
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidadidfilter_Internalname, "Entidad Id", "", "", lblLblentidadidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0150.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCentidadid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cEntidadId, (byte)(6), (byte)(0), ",", "")), ((edtavCentidadid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cEntidadId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cEntidadId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCentidadid_Jsonclick, 0, "Attribute", "", "", "", edtavCentidadid_Visible, edtavCentidadid_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0150.htm");
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidadnumerodocumentofilter_Internalname, "Entidad Numero Documento", "", "", lblLblentidadnumerodocumentofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0150.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCentidadnumerodocumento_Internalname, GXutil.rtrim( AV7cEntidadNumeroDocumento), GXutil.rtrim( localUtil.format( AV7cEntidadNumeroDocumento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCentidadnumerodocumento_Jsonclick, 0, "Attribute", "", "", "", edtavCentidadnumerodocumento_Visible, edtavCentidadnumerodocumento_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0150.htm");
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLbltipodocumentoidfilter_Internalname, "Tipo Documento Id", "", "", lblLbltipodocumentoidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0150.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCtipodocumentoid_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cTipoDocumentoId, (byte)(4), (byte)(0), ",", "")), ((edtavCtipodocumentoid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cTipoDocumentoId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cTipoDocumentoId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtipodocumentoid_Jsonclick, 0, "Attribute", "", "", "", edtavCtipodocumentoid_Visible, edtavCtipodocumentoid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0150.htm");
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcondicioncpravtaidfilter_Internalname, "Condicion Cpra Vta Id", "", "", lblLblcondicioncpravtaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0150.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcondicioncpravtaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cCondicionCpraVtaId, (byte)(4), (byte)(0), ",", "")), ((edtavCcondicioncpravtaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cCondicionCpraVtaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cCondicionCpraVtaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcondicioncpravtaid_Jsonclick, 0, "Attribute", "", "", "", edtavCcondicioncpravtaid_Visible, edtavCcondicioncpravtaid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0150.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divCondicionivaidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCondicionivaidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblcondicionivaidfilter_Internalname, "Condicion Iva Id", "", "", lblLblcondicionivaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0150.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCcondicionivaid_Internalname, "Condicion Iva Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCcondicionivaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cCondicionIvaId, (byte)(4), (byte)(0), ",", "")), ((edtavCcondicionivaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cCondicionIvaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cCondicionIvaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcondicionivaid_Jsonclick, 0, "Attribute", "", "", "", edtavCcondicionivaid_Visible, edtavCcondicionivaid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0150.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divProvinciaidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divProvinciaidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblprovinciaidfilter_Internalname, "Provincia Id", "", "", lblLblprovinciaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0150.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCprovinciaid_Internalname, "Provincia Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCprovinciaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cProvinciaId, (byte)(4), (byte)(0), ",", "")), ((edtavCprovinciaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11cProvinciaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11cProvinciaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCprovinciaid_Jsonclick, 0, "Attribute", "", "", "", edtavCprovinciaid_Visible, edtavCprovinciaid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0150.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divPaisidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divPaisidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblpaisidfilter_Internalname, "Pais Id", "", "", lblLblpaisidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0150.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCpaisid_Internalname, "Pais Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCpaisid_Internalname, GXutil.ltrim( localUtil.ntoc( AV12cPaisId, (byte)(4), (byte)(0), ",", "")), ((edtavCpaisid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12cPaisId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12cPaisId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpaisid_Jsonclick, 0, "Attribute", "", "", "", edtavCpaisid_Visible, edtavCpaisid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0150.htm");
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
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18121_client"+"'", TempTags, "", 2, "HLP_Gx0150.htm");
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
            httpContext.writeValue( "Tipo Documento Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Condicion Cpra Vta Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Condicion Iva Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Provincia Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Pais Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Localidad Id") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A81EntidadId, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A83EntidadNumeroDocumento));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9TipoDocumentoId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A15CondicionCpraVtaId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13CondicionIvaId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1ProvinciaId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3PaisId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5LocalidadId, (byte)(4), (byte)(0), ".", "")));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0150.htm");
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

   public void start122( )
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
      strup120( ) ;
   }

   public void ws122( )
   {
      start122( ) ;
      evt122( ) ;
   }

   public void evt122( )
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
                           A81EntidadId = (int)(localUtil.ctol( httpContext.cgiGet( edtEntidadId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadId_Internalname, GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
                           A83EntidadNumeroDocumento = httpContext.cgiGet( edtEntidadNumeroDocumento_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadNumeroDocumento_Internalname, A83EntidadNumeroDocumento);
                           A9TipoDocumentoId = (short)(localUtil.ctol( httpContext.cgiGet( edtTipoDocumentoId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtTipoDocumentoId_Internalname, GXutil.ltrim( GXutil.str( A9TipoDocumentoId, 4, 0)));
                           A15CondicionCpraVtaId = (short)(localUtil.ctol( httpContext.cgiGet( edtCondicionCpraVtaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCondicionCpraVtaId_Internalname, GXutil.ltrim( GXutil.str( A15CondicionCpraVtaId, 4, 0)));
                           A13CondicionIvaId = (short)(localUtil.ctol( httpContext.cgiGet( edtCondicionIvaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtCondicionIvaId_Internalname, GXutil.ltrim( GXutil.str( A13CondicionIvaId, 4, 0)));
                           A1ProvinciaId = (short)(localUtil.ctol( httpContext.cgiGet( edtProvinciaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtProvinciaId_Internalname, GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
                           A3PaisId = (short)(localUtil.ctol( httpContext.cgiGet( edtPaisId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtPaisId_Internalname, GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
                           A5LocalidadId = (short)(localUtil.ctol( httpContext.cgiGet( edtLocalidadId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtLocalidadId_Internalname, GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19122 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e20122 ();
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
                                    /* Set Refresh If Centidadnumerodocumento Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENTIDADNUMERODOCUMENTO"), AV7cEntidadNumeroDocumento) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctipodocumentoid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTIPODOCUMENTOID"), ",", ".") != AV8cTipoDocumentoId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccondicioncpravtaid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCONDICIONCPRAVTAID"), ",", ".") != AV9cCondicionCpraVtaId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccondicionivaid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCONDICIONIVAID"), ",", ".") != AV10cCondicionIvaId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cprovinciaid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPROVINCIAID"), ",", ".") != AV11cProvinciaId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cpaisid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPAISID"), ",", ".") != AV12cPaisId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e21122 ();
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

   public void we122( )
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

   public void pa122( )
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
                                  int AV6cEntidadId ,
                                  String AV7cEntidadNumeroDocumento ,
                                  short AV8cTipoDocumentoId ,
                                  short AV9cCondicionCpraVtaId ,
                                  short AV10cCondicionIvaId ,
                                  short AV11cProvinciaId ,
                                  short AV12cPaisId )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf122( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf122( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf122( )
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
                                              AV7cEntidadNumeroDocumento ,
                                              new Short(AV8cTipoDocumentoId) ,
                                              new Short(AV9cCondicionCpraVtaId) ,
                                              new Short(AV10cCondicionIvaId) ,
                                              new Short(AV11cProvinciaId) ,
                                              new Short(AV12cPaisId) ,
                                              A83EntidadNumeroDocumento ,
                                              new Short(A9TipoDocumentoId) ,
                                              new Short(A15CondicionCpraVtaId) ,
                                              new Short(A13CondicionIvaId) ,
                                              new Short(A1ProvinciaId) ,
                                              new Short(A3PaisId) ,
                                              new Integer(AV6cEntidadId) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT
                                              }
         } ) ;
         lV7cEntidadNumeroDocumento = GXutil.padr( GXutil.rtrim( AV7cEntidadNumeroDocumento), 13, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cEntidadNumeroDocumento", AV7cEntidadNumeroDocumento);
         /* Using cursor H00122 */
         pr_default.execute(0, new Object[] {new Integer(AV6cEntidadId), lV7cEntidadNumeroDocumento, new Short(AV8cTipoDocumentoId), new Short(AV9cCondicionCpraVtaId), new Short(AV10cCondicionIvaId), new Short(AV11cProvinciaId), new Short(AV12cPaisId), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A5LocalidadId = H00122_A5LocalidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtLocalidadId_Internalname, GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
            A3PaisId = H00122_A3PaisId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtPaisId_Internalname, GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
            A1ProvinciaId = H00122_A1ProvinciaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtProvinciaId_Internalname, GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
            A13CondicionIvaId = H00122_A13CondicionIvaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCondicionIvaId_Internalname, GXutil.ltrim( GXutil.str( A13CondicionIvaId, 4, 0)));
            A15CondicionCpraVtaId = H00122_A15CondicionCpraVtaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtCondicionCpraVtaId_Internalname, GXutil.ltrim( GXutil.str( A15CondicionCpraVtaId, 4, 0)));
            A9TipoDocumentoId = H00122_A9TipoDocumentoId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtTipoDocumentoId_Internalname, GXutil.ltrim( GXutil.str( A9TipoDocumentoId, 4, 0)));
            A83EntidadNumeroDocumento = H00122_A83EntidadNumeroDocumento[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadNumeroDocumento_Internalname, A83EntidadNumeroDocumento);
            A81EntidadId = H00122_A81EntidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadId_Internalname, GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
            /* Execute user event: Load */
            e20122 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb120( ) ;
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
                                           AV7cEntidadNumeroDocumento ,
                                           new Short(AV8cTipoDocumentoId) ,
                                           new Short(AV9cCondicionCpraVtaId) ,
                                           new Short(AV10cCondicionIvaId) ,
                                           new Short(AV11cProvinciaId) ,
                                           new Short(AV12cPaisId) ,
                                           A83EntidadNumeroDocumento ,
                                           new Short(A9TipoDocumentoId) ,
                                           new Short(A15CondicionCpraVtaId) ,
                                           new Short(A13CondicionIvaId) ,
                                           new Short(A1ProvinciaId) ,
                                           new Short(A3PaisId) ,
                                           new Integer(AV6cEntidadId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT
                                           }
      } ) ;
      lV7cEntidadNumeroDocumento = GXutil.padr( GXutil.rtrim( AV7cEntidadNumeroDocumento), 13, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cEntidadNumeroDocumento", AV7cEntidadNumeroDocumento);
      /* Using cursor H00123 */
      pr_default.execute(1, new Object[] {new Integer(AV6cEntidadId), lV7cEntidadNumeroDocumento, new Short(AV8cTipoDocumentoId), new Short(AV9cCondicionCpraVtaId), new Short(AV10cCondicionIvaId), new Short(AV11cProvinciaId), new Short(AV12cPaisId)});
      GRID1_nRecordCount = H00123_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEntidadNumeroDocumento, AV8cTipoDocumentoId, AV9cCondicionCpraVtaId, AV10cCondicionIvaId, AV11cProvinciaId, AV12cPaisId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEntidadNumeroDocumento, AV8cTipoDocumentoId, AV9cCondicionCpraVtaId, AV10cCondicionIvaId, AV11cProvinciaId, AV12cPaisId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEntidadNumeroDocumento, AV8cTipoDocumentoId, AV9cCondicionCpraVtaId, AV10cCondicionIvaId, AV11cProvinciaId, AV12cPaisId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEntidadNumeroDocumento, AV8cTipoDocumentoId, AV9cCondicionCpraVtaId, AV10cCondicionIvaId, AV11cProvinciaId, AV12cPaisId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadId, AV7cEntidadNumeroDocumento, AV8cTipoDocumentoId, AV9cCondicionCpraVtaId, AV10cCondicionIvaId, AV11cProvinciaId, AV12cPaisId) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup120( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19122 ();
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
         AV7cEntidadNumeroDocumento = httpContext.cgiGet( edtavCentidadnumerodocumento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cEntidadNumeroDocumento", AV7cEntidadNumeroDocumento);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtipodocumentoid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtipodocumentoid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTIPODOCUMENTOID");
            GX_FocusControl = edtavCtipodocumentoid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cTipoDocumentoId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTipoDocumentoId", GXutil.ltrim( GXutil.str( AV8cTipoDocumentoId, 4, 0)));
         }
         else
         {
            AV8cTipoDocumentoId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCtipodocumentoid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTipoDocumentoId", GXutil.ltrim( GXutil.str( AV8cTipoDocumentoId, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcondicioncpravtaid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcondicioncpravtaid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCONDICIONCPRAVTAID");
            GX_FocusControl = edtavCcondicioncpravtaid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cCondicionCpraVtaId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cCondicionCpraVtaId", GXutil.ltrim( GXutil.str( AV9cCondicionCpraVtaId, 4, 0)));
         }
         else
         {
            AV9cCondicionCpraVtaId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcondicioncpravtaid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cCondicionCpraVtaId", GXutil.ltrim( GXutil.str( AV9cCondicionCpraVtaId, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcondicionivaid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcondicionivaid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCONDICIONIVAID");
            GX_FocusControl = edtavCcondicionivaid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cCondicionIvaId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCondicionIvaId", GXutil.ltrim( GXutil.str( AV10cCondicionIvaId, 4, 0)));
         }
         else
         {
            AV10cCondicionIvaId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcondicionivaid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCondicionIvaId", GXutil.ltrim( GXutil.str( AV10cCondicionIvaId, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCprovinciaid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCprovinciaid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCPROVINCIAID");
            GX_FocusControl = edtavCprovinciaid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cProvinciaId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cProvinciaId", GXutil.ltrim( GXutil.str( AV11cProvinciaId, 4, 0)));
         }
         else
         {
            AV11cProvinciaId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCprovinciaid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cProvinciaId", GXutil.ltrim( GXutil.str( AV11cProvinciaId, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCpaisid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCpaisid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCPAISID");
            GX_FocusControl = edtavCpaisid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cPaisId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cPaisId", GXutil.ltrim( GXutil.str( AV12cPaisId, 4, 0)));
         }
         else
         {
            AV12cPaisId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCpaisid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cPaisId", GXutil.ltrim( GXutil.str( AV12cPaisId, 4, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
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
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENTIDADNUMERODOCUMENTO"), AV7cEntidadNumeroDocumento) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTIPODOCUMENTOID"), ",", ".") != AV8cTipoDocumentoId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCONDICIONCPRAVTAID"), ",", ".") != AV9cCondicionCpraVtaId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCONDICIONIVAID"), ",", ".") != AV10cCondicionIvaId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPROVINCIAID"), ",", ".") != AV11cProvinciaId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPAISID"), ",", ".") != AV12cPaisId )
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
      e19122 ();
      if (returnInSub) return;
   }

   public void e19122( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Entidad", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e20122( )
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
      e21122 ();
      if (returnInSub) return;
   }

   public void e21122( )
   {
      /* Enter Routine */
      AV13pEntidadId = A81EntidadId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pEntidadId", GXutil.ltrim( GXutil.str( AV13pEntidadId, 6, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pEntidadId)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pEntidadId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pEntidadId", GXutil.ltrim( GXutil.str( AV13pEntidadId, 6, 0)));
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
      pa122( ) ;
      ws122( ) ;
      we122( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2017219172319");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx0150.js", "?2017219172319");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtEntidadId_Internalname = "ENTIDADID_"+sGXsfl_84_idx ;
      edtEntidadNumeroDocumento_Internalname = "ENTIDADNUMERODOCUMENTO_"+sGXsfl_84_idx ;
      edtTipoDocumentoId_Internalname = "TIPODOCUMENTOID_"+sGXsfl_84_idx ;
      edtCondicionCpraVtaId_Internalname = "CONDICIONCPRAVTAID_"+sGXsfl_84_idx ;
      edtCondicionIvaId_Internalname = "CONDICIONIVAID_"+sGXsfl_84_idx ;
      edtProvinciaId_Internalname = "PROVINCIAID_"+sGXsfl_84_idx ;
      edtPaisId_Internalname = "PAISID_"+sGXsfl_84_idx ;
      edtLocalidadId_Internalname = "LOCALIDADID_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtEntidadId_Internalname = "ENTIDADID_"+sGXsfl_84_fel_idx ;
      edtEntidadNumeroDocumento_Internalname = "ENTIDADNUMERODOCUMENTO_"+sGXsfl_84_fel_idx ;
      edtTipoDocumentoId_Internalname = "TIPODOCUMENTOID_"+sGXsfl_84_fel_idx ;
      edtCondicionCpraVtaId_Internalname = "CONDICIONCPRAVTAID_"+sGXsfl_84_fel_idx ;
      edtCondicionIvaId_Internalname = "CONDICIONIVAID_"+sGXsfl_84_fel_idx ;
      edtProvinciaId_Internalname = "PROVINCIAID_"+sGXsfl_84_fel_idx ;
      edtPaisId_Internalname = "PAISID_"+sGXsfl_84_fel_idx ;
      edtLocalidadId_Internalname = "LOCALIDADID_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb120( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A81EntidadId, (byte)(6), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadId_Internalname,GXutil.ltrim( localUtil.ntoc( A81EntidadId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A81EntidadId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasMaestras","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadNumeroDocumento_Internalname,GXutil.rtrim( A83EntidadNumeroDocumento),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadNumeroDocumento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(13),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"NumeroDocumento","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipoDocumentoId_Internalname,GXutil.ltrim( localUtil.ntoc( A9TipoDocumentoId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A9TipoDocumentoId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipoDocumentoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCondicionCpraVtaId_Internalname,GXutil.ltrim( localUtil.ntoc( A15CondicionCpraVtaId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A15CondicionCpraVtaId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCondicionCpraVtaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCondicionIvaId_Internalname,GXutil.ltrim( localUtil.ntoc( A13CondicionIvaId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A13CondicionIvaId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCondicionIvaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProvinciaId_Internalname,GXutil.ltrim( localUtil.ntoc( A1ProvinciaId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A1ProvinciaId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProvinciaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLocalidadId_Internalname,GXutil.ltrim( localUtil.ntoc( A5LocalidadId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A5LocalidadId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLocalidadId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblentidadidfilter_Internalname = "LBLENTIDADIDFILTER" ;
      edtavCentidadid_Internalname = "vCENTIDADID" ;
      divEntidadidfiltercontainer_Internalname = "ENTIDADIDFILTERCONTAINER" ;
      lblLblentidadnumerodocumentofilter_Internalname = "LBLENTIDADNUMERODOCUMENTOFILTER" ;
      edtavCentidadnumerodocumento_Internalname = "vCENTIDADNUMERODOCUMENTO" ;
      divEntidadnumerodocumentofiltercontainer_Internalname = "ENTIDADNUMERODOCUMENTOFILTERCONTAINER" ;
      lblLbltipodocumentoidfilter_Internalname = "LBLTIPODOCUMENTOIDFILTER" ;
      edtavCtipodocumentoid_Internalname = "vCTIPODOCUMENTOID" ;
      divTipodocumentoidfiltercontainer_Internalname = "TIPODOCUMENTOIDFILTERCONTAINER" ;
      lblLblcondicioncpravtaidfilter_Internalname = "LBLCONDICIONCPRAVTAIDFILTER" ;
      edtavCcondicioncpravtaid_Internalname = "vCCONDICIONCPRAVTAID" ;
      divCondicioncpravtaidfiltercontainer_Internalname = "CONDICIONCPRAVTAIDFILTERCONTAINER" ;
      lblLblcondicionivaidfilter_Internalname = "LBLCONDICIONIVAIDFILTER" ;
      edtavCcondicionivaid_Internalname = "vCCONDICIONIVAID" ;
      divCondicionivaidfiltercontainer_Internalname = "CONDICIONIVAIDFILTERCONTAINER" ;
      lblLblprovinciaidfilter_Internalname = "LBLPROVINCIAIDFILTER" ;
      edtavCprovinciaid_Internalname = "vCPROVINCIAID" ;
      divProvinciaidfiltercontainer_Internalname = "PROVINCIAIDFILTERCONTAINER" ;
      lblLblpaisidfilter_Internalname = "LBLPAISIDFILTER" ;
      edtavCpaisid_Internalname = "vCPAISID" ;
      divPaisidfiltercontainer_Internalname = "PAISIDFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtEntidadId_Internalname = "ENTIDADID" ;
      edtEntidadNumeroDocumento_Internalname = "ENTIDADNUMERODOCUMENTO" ;
      edtTipoDocumentoId_Internalname = "TIPODOCUMENTOID" ;
      edtCondicionCpraVtaId_Internalname = "CONDICIONCPRAVTAID" ;
      edtCondicionIvaId_Internalname = "CONDICIONIVAID" ;
      edtProvinciaId_Internalname = "PROVINCIAID" ;
      edtPaisId_Internalname = "PAISID" ;
      edtLocalidadId_Internalname = "LOCALIDADID" ;
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
      edtLocalidadId_Jsonclick = "" ;
      edtPaisId_Jsonclick = "" ;
      edtProvinciaId_Jsonclick = "" ;
      edtCondicionIvaId_Jsonclick = "" ;
      edtCondicionCpraVtaId_Jsonclick = "" ;
      edtTipoDocumentoId_Jsonclick = "" ;
      edtEntidadNumeroDocumento_Jsonclick = "" ;
      edtEntidadId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCpaisid_Jsonclick = "" ;
      edtavCpaisid_Enabled = 1 ;
      edtavCpaisid_Visible = 1 ;
      edtavCprovinciaid_Jsonclick = "" ;
      edtavCprovinciaid_Enabled = 1 ;
      edtavCprovinciaid_Visible = 1 ;
      edtavCcondicionivaid_Jsonclick = "" ;
      edtavCcondicionivaid_Enabled = 1 ;
      edtavCcondicionivaid_Visible = 1 ;
      edtavCcondicioncpravtaid_Jsonclick = "" ;
      edtavCcondicioncpravtaid_Enabled = 1 ;
      edtavCcondicioncpravtaid_Visible = 1 ;
      edtavCtipodocumentoid_Jsonclick = "" ;
      edtavCtipodocumentoid_Enabled = 1 ;
      edtavCtipodocumentoid_Visible = 1 ;
      edtavCentidadnumerodocumento_Jsonclick = "" ;
      edtavCentidadnumerodocumento_Enabled = 1 ;
      edtavCentidadnumerodocumento_Visible = 1 ;
      edtavCentidadid_Jsonclick = "" ;
      edtavCentidadid_Enabled = 1 ;
      edtavCentidadid_Visible = 1 ;
      divPaisidfiltercontainer_Class = "AdvancedContainerItem" ;
      divProvinciaidfiltercontainer_Class = "AdvancedContainerItem" ;
      divCondicionivaidfiltercontainer_Class = "AdvancedContainerItem" ;
      divCondicioncpravtaidfiltercontainer_Class = "AdvancedContainerItem" ;
      divTipodocumentoidfiltercontainer_Class = "AdvancedContainerItem" ;
      divEntidadnumerodocumentofiltercontainer_Class = "AdvancedContainerItem" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV8cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV9cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'AV10cCondicionIvaId',fld:'vCCONDICIONIVAID'},{av:'AV11cProvinciaId',fld:'vCPROVINCIAID'},{av:'AV12cPaisId',fld:'vCPAISID'}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e18121',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLENTIDADIDFILTER.CLICK","{handler:'e11121',iparms:[{av:'divEntidadidfiltercontainer_Class',ctrl:'ENTIDADIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidadidfiltercontainer_Class',ctrl:'ENTIDADIDFILTERCONTAINER',prop:'Class'},{av:'edtavCentidadid_Visible',ctrl:'vCENTIDADID',prop:'Visible'}]}");
      setEventMetadata("LBLENTIDADNUMERODOCUMENTOFILTER.CLICK","{handler:'e12121',iparms:[{av:'divEntidadnumerodocumentofiltercontainer_Class',ctrl:'ENTIDADNUMERODOCUMENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidadnumerodocumentofiltercontainer_Class',ctrl:'ENTIDADNUMERODOCUMENTOFILTERCONTAINER',prop:'Class'},{av:'edtavCentidadnumerodocumento_Visible',ctrl:'vCENTIDADNUMERODOCUMENTO',prop:'Visible'}]}");
      setEventMetadata("LBLTIPODOCUMENTOIDFILTER.CLICK","{handler:'e13121',iparms:[{av:'divTipodocumentoidfiltercontainer_Class',ctrl:'TIPODOCUMENTOIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTipodocumentoidfiltercontainer_Class',ctrl:'TIPODOCUMENTOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCtipodocumentoid_Visible',ctrl:'vCTIPODOCUMENTOID',prop:'Visible'}]}");
      setEventMetadata("LBLCONDICIONCPRAVTAIDFILTER.CLICK","{handler:'e14121',iparms:[{av:'divCondicioncpravtaidfiltercontainer_Class',ctrl:'CONDICIONCPRAVTAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCondicioncpravtaidfiltercontainer_Class',ctrl:'CONDICIONCPRAVTAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCcondicioncpravtaid_Visible',ctrl:'vCCONDICIONCPRAVTAID',prop:'Visible'}]}");
      setEventMetadata("LBLCONDICIONIVAIDFILTER.CLICK","{handler:'e15121',iparms:[{av:'divCondicionivaidfiltercontainer_Class',ctrl:'CONDICIONIVAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCondicionivaidfiltercontainer_Class',ctrl:'CONDICIONIVAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCcondicionivaid_Visible',ctrl:'vCCONDICIONIVAID',prop:'Visible'}]}");
      setEventMetadata("LBLPROVINCIAIDFILTER.CLICK","{handler:'e16121',iparms:[{av:'divProvinciaidfiltercontainer_Class',ctrl:'PROVINCIAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divProvinciaidfiltercontainer_Class',ctrl:'PROVINCIAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCprovinciaid_Visible',ctrl:'vCPROVINCIAID',prop:'Visible'}]}");
      setEventMetadata("LBLPAISIDFILTER.CLICK","{handler:'e17121',iparms:[{av:'divPaisidfiltercontainer_Class',ctrl:'PAISIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPaisidfiltercontainer_Class',ctrl:'PAISIDFILTERCONTAINER',prop:'Class'},{av:'edtavCpaisid_Visible',ctrl:'vCPAISID',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e21122',iparms:[{av:'A81EntidadId',fld:'ENTIDADID'}],oparms:[{av:'AV13pEntidadId',fld:'vPENTIDADID'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV8cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV9cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'AV10cCondicionIvaId',fld:'vCCONDICIONIVAID'},{av:'AV11cProvinciaId',fld:'vCPROVINCIAID'},{av:'AV12cPaisId',fld:'vCPAISID'}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV8cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV9cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'AV10cCondicionIvaId',fld:'vCCONDICIONIVAID'},{av:'AV11cProvinciaId',fld:'vCPROVINCIAID'},{av:'AV12cPaisId',fld:'vCPAISID'}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV8cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV9cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'AV10cCondicionIvaId',fld:'vCCONDICIONIVAID'},{av:'AV11cProvinciaId',fld:'vCPROVINCIAID'},{av:'AV12cPaisId',fld:'vCPAISID'}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumeroDocumento',fld:'vCENTIDADNUMERODOCUMENTO'},{av:'AV8cTipoDocumentoId',fld:'vCTIPODOCUMENTOID'},{av:'AV9cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'},{av:'AV10cCondicionIvaId',fld:'vCCONDICIONIVAID'},{av:'AV11cProvinciaId',fld:'vCPROVINCIAID'},{av:'AV12cPaisId',fld:'vCPAISID'}],oparms:[]}");
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
      AV7cEntidadNumeroDocumento = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblentidadidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblentidadnumerodocumentofilter_Jsonclick = "" ;
      lblLbltipodocumentoidfilter_Jsonclick = "" ;
      lblLblcondicioncpravtaidfilter_Jsonclick = "" ;
      lblLblcondicionivaidfilter_Jsonclick = "" ;
      lblLblprovinciaidfilter_Jsonclick = "" ;
      lblLblpaisidfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A83EntidadNumeroDocumento = "" ;
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
      lV7cEntidadNumeroDocumento = "" ;
      H00122_A5LocalidadId = new short[1] ;
      H00122_A3PaisId = new short[1] ;
      H00122_A1ProvinciaId = new short[1] ;
      H00122_A13CondicionIvaId = new short[1] ;
      H00122_A15CondicionCpraVtaId = new short[1] ;
      H00122_A9TipoDocumentoId = new short[1] ;
      H00122_A83EntidadNumeroDocumento = new String[] {""} ;
      H00122_A81EntidadId = new int[1] ;
      H00123_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx0150__default(),
         new Object[] {
             new Object[] {
            H00122_A5LocalidadId, H00122_A3PaisId, H00122_A1ProvinciaId, H00122_A13CondicionIvaId, H00122_A15CondicionCpraVtaId, H00122_A9TipoDocumentoId, H00122_A83EntidadNumeroDocumento, H00122_A81EntidadId
            }
            , new Object[] {
            H00123_AGRID1_nRecordCount
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
   private short AV8cTipoDocumentoId ;
   private short AV9cCondicionCpraVtaId ;
   private short AV10cCondicionIvaId ;
   private short AV11cProvinciaId ;
   private short AV12cPaisId ;
   private short wbEnd ;
   private short wbStart ;
   private short A9TipoDocumentoId ;
   private short A15CondicionCpraVtaId ;
   private short A13CondicionIvaId ;
   private short A1ProvinciaId ;
   private short A3PaisId ;
   private short A5LocalidadId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_84_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int AV6cEntidadId ;
   private int AV13pEntidadId ;
   private int edtavCentidadid_Enabled ;
   private int edtavCentidadid_Visible ;
   private int edtavCentidadnumerodocumento_Visible ;
   private int edtavCentidadnumerodocumento_Enabled ;
   private int edtavCtipodocumentoid_Enabled ;
   private int edtavCtipodocumentoid_Visible ;
   private int edtavCcondicioncpravtaid_Enabled ;
   private int edtavCcondicioncpravtaid_Visible ;
   private int edtavCcondicionivaid_Enabled ;
   private int edtavCcondicionivaid_Visible ;
   private int edtavCprovinciaid_Enabled ;
   private int edtavCprovinciaid_Visible ;
   private int edtavCpaisid_Enabled ;
   private int edtavCpaisid_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A81EntidadId ;
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
   private String divEntidadnumerodocumentofiltercontainer_Class ;
   private String divTipodocumentoidfiltercontainer_Class ;
   private String divCondicioncpravtaidfiltercontainer_Class ;
   private String divCondicionivaidfiltercontainer_Class ;
   private String divProvinciaidfiltercontainer_Class ;
   private String divPaisidfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV7cEntidadNumeroDocumento ;
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
   private String divCondicionivaidfiltercontainer_Internalname ;
   private String lblLblcondicionivaidfilter_Internalname ;
   private String lblLblcondicionivaidfilter_Jsonclick ;
   private String edtavCcondicionivaid_Internalname ;
   private String edtavCcondicionivaid_Jsonclick ;
   private String divProvinciaidfiltercontainer_Internalname ;
   private String lblLblprovinciaidfilter_Internalname ;
   private String lblLblprovinciaidfilter_Jsonclick ;
   private String edtavCprovinciaid_Internalname ;
   private String edtavCprovinciaid_Jsonclick ;
   private String divPaisidfiltercontainer_Internalname ;
   private String lblLblpaisidfilter_Internalname ;
   private String lblLblpaisidfilter_Jsonclick ;
   private String edtavCpaisid_Internalname ;
   private String edtavCpaisid_Jsonclick ;
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
   private String A83EntidadNumeroDocumento ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtEntidadId_Internalname ;
   private String edtEntidadNumeroDocumento_Internalname ;
   private String edtTipoDocumentoId_Internalname ;
   private String edtCondicionCpraVtaId_Internalname ;
   private String edtCondicionIvaId_Internalname ;
   private String edtProvinciaId_Internalname ;
   private String edtPaisId_Internalname ;
   private String edtLocalidadId_Internalname ;
   private String GXKey ;
   private String scmdbuf ;
   private String lV7cEntidadNumeroDocumento ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtEntidadId_Jsonclick ;
   private String edtEntidadNumeroDocumento_Jsonclick ;
   private String edtTipoDocumentoId_Jsonclick ;
   private String edtCondicionCpraVtaId_Jsonclick ;
   private String edtCondicionIvaId_Jsonclick ;
   private String edtProvinciaId_Jsonclick ;
   private String edtPaisId_Jsonclick ;
   private String edtLocalidadId_Jsonclick ;
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
   private IDataStoreProvider pr_default ;
   private short[] H00122_A5LocalidadId ;
   private short[] H00122_A3PaisId ;
   private short[] H00122_A1ProvinciaId ;
   private short[] H00122_A13CondicionIvaId ;
   private short[] H00122_A15CondicionCpraVtaId ;
   private short[] H00122_A9TipoDocumentoId ;
   private String[] H00122_A83EntidadNumeroDocumento ;
   private int[] H00122_A81EntidadId ;
   private long[] H00123_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0150__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00122( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cEntidadNumeroDocumento ,
                                          short AV8cTipoDocumentoId ,
                                          short AV9cCondicionCpraVtaId ,
                                          short AV10cCondicionIvaId ,
                                          short AV11cProvinciaId ,
                                          short AV12cPaisId ,
                                          String A83EntidadNumeroDocumento ,
                                          short A9TipoDocumentoId ,
                                          short A15CondicionCpraVtaId ,
                                          short A13CondicionIvaId ,
                                          short A1ProvinciaId ,
                                          short A3PaisId ,
                                          int AV6cEntidadId )
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
      sSelectString = " LocalidadId, PaisId, ProvinciaId, CondicionIvaId, CondicionCpraVtaId, TipoDocumentoId," ;
      sSelectString = sSelectString + " EntidadNumeroDocumento, EntidadId" ;
      sFromString = " FROM Entidad" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (EntidadId >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cEntidadNumeroDocumento)==0) )
      {
         sWhereString = sWhereString + " and (EntidadNumeroDocumento like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cTipoDocumentoId) )
      {
         sWhereString = sWhereString + " and (TipoDocumentoId >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cCondicionCpraVtaId) )
      {
         sWhereString = sWhereString + " and (CondicionCpraVtaId >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCondicionIvaId) )
      {
         sWhereString = sWhereString + " and (CondicionIvaId >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cProvinciaId) )
      {
         sWhereString = sWhereString + " and (ProvinciaId >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (0==AV12cPaisId) )
      {
         sWhereString = sWhereString + " and (PaisId >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY EntidadId" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00123( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cEntidadNumeroDocumento ,
                                          short AV8cTipoDocumentoId ,
                                          short AV9cCondicionCpraVtaId ,
                                          short AV10cCondicionIvaId ,
                                          short AV11cProvinciaId ,
                                          short AV12cPaisId ,
                                          String A83EntidadNumeroDocumento ,
                                          short A9TipoDocumentoId ,
                                          short A15CondicionCpraVtaId ,
                                          short A13CondicionIvaId ,
                                          short A1ProvinciaId ,
                                          short A3PaisId ,
                                          int AV6cEntidadId )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM Entidad" ;
      scmdbuf = scmdbuf + " WHERE (EntidadId >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cEntidadNumeroDocumento)==0) )
      {
         sWhereString = sWhereString + " and (EntidadNumeroDocumento like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cTipoDocumentoId) )
      {
         sWhereString = sWhereString + " and (TipoDocumentoId >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cCondicionCpraVtaId) )
      {
         sWhereString = sWhereString + " and (CondicionCpraVtaId >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCondicionIvaId) )
      {
         sWhereString = sWhereString + " and (CondicionIvaId >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cProvinciaId) )
      {
         sWhereString = sWhereString + " and (ProvinciaId >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (0==AV12cPaisId) )
      {
         sWhereString = sWhereString + " and (PaisId >= ?)" ;
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
                  return conditional_H00122(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H00123(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00122", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00123", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 13) ;
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
                  stmt.setString(sIdx, (String)parms[11], 13);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
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
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
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

