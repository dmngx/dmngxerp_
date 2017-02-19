/*
               File: gx00y2_impl
        Description: Selection List Domicilio
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 16:35:22.84
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

public final  class gx00y2_impl extends GXDataArea
{
   public gx00y2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00y2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00y2_impl.class ));
   }

   public gx00y2_impl( int remoteHandle ,
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
            nRC_GXsfl_64 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_64_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_64_idx = httpContext.GetNextPar( ) ;
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
            AV6cEntidadDomicilioId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cEntidadDomicilioNumero = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cEntidadDomicilioPiso = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cEntidadDomicilioDepto = httpContext.GetNextPar( ) ;
            AV10cEntidadDomicilioCPostal = httpContext.GetNextPar( ) ;
            AV11pEmpresaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV12pEntidadId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadDomicilioId, AV7cEntidadDomicilioNumero, AV8cEntidadDomicilioPiso, AV9cEntidadDomicilioDepto, AV10cEntidadDomicilioCPostal, AV11pEmpresaId, AV12pEntidadId) ;
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
            AV11pEmpresaId = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11pEmpresaId", GXutil.ltrim( GXutil.str( AV11pEmpresaId, 6, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV12pEntidadId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12pEntidadId", GXutil.ltrim( GXutil.str( AV12pEntidadId, 6, 0)));
               AV13pEntidadDomicilioId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pEntidadDomicilioId", GXutil.ltrim( GXutil.str( AV13pEntidadDomicilioId, 4, 0)));
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
      pa0Z2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0Z2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721916352292");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx00y2") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pEmpresaId,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pEntidadId,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEntidadDomicilioId,4,0)))+"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENTIDADDOMICILIOID", GXutil.ltrim( localUtil.ntoc( AV6cEntidadDomicilioId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENTIDADDOMICILIONUMERO", GXutil.ltrim( localUtil.ntoc( AV7cEntidadDomicilioNumero, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENTIDADDOMICILIOPISO", GXutil.ltrim( localUtil.ntoc( AV8cEntidadDomicilioPiso, (byte)(3), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENTIDADDOMICILIODEPTO", AV9cEntidadDomicilioDepto);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENTIDADDOMICILIOCPOSTAL", AV10cEntidadDomicilioCPostal);
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_64", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_64, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPEMPRESAID", GXutil.ltrim( localUtil.ntoc( AV11pEmpresaId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPENTIDADID", GXutil.ltrim( localUtil.ntoc( AV12pEntidadId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPENTIDADDOMICILIOID", GXutil.ltrim( localUtil.ntoc( AV13pEntidadDomicilioId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEMPRESAID", getSecureSignedToken( "", String.valueOf(AV11pEmpresaId)));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPENTIDADID", getSecureSignedToken( "", String.valueOf(AV12pEntidadId)));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIOIDFILTERCONTAINER_Class", GXutil.rtrim( divEntidaddomicilioidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIONUMEROFILTERCONTAINER_Class", GXutil.rtrim( divEntidaddomicilionumerofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIOPISOFILTERCONTAINER_Class", GXutil.rtrim( divEntidaddomiciliopisofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIODEPTOFILTERCONTAINER_Class", GXutil.rtrim( divEntidaddomiciliodeptofiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIOCPOSTALFILTERCONTAINER_Class", GXutil.rtrim( divEntidaddomiciliocpostalfiltercontainer_Class));
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
         we0Z2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0Z2( ) ;
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
      return formatLink("com.kberp.gx00y2") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pEmpresaId,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pEntidadId,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pEntidadDomicilioId,4,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00Y2" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Domicilio" ;
   }

   public void wb0Z0( )
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEntidaddomicilioidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divEntidaddomicilioidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidaddomicilioidfilter_Internalname, "Entidad Domicilio Id", "", "", lblLblentidaddomicilioidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Y2.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCentidaddomicilioid_Internalname, "Entidad Domicilio Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCentidaddomicilioid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cEntidadDomicilioId, (byte)(4), (byte)(0), ",", "")), ((edtavCentidaddomicilioid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cEntidadDomicilioId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cEntidadDomicilioId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCentidaddomicilioid_Jsonclick, 0, "Attribute", "", "", "", edtavCentidaddomicilioid_Visible, edtavCentidaddomicilioid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00Y2.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEntidaddomicilionumerofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEntidaddomicilionumerofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidaddomicilionumerofilter_Internalname, "Entidad Domicilio Numero", "", "", lblLblentidaddomicilionumerofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Y2.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCentidaddomicilionumero_Internalname, "Entidad Domicilio Numero", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCentidaddomicilionumero_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cEntidadDomicilioNumero, (byte)(6), (byte)(0), ",", "")), ((edtavCentidaddomicilionumero_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cEntidadDomicilioNumero), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cEntidadDomicilioNumero), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCentidaddomicilionumero_Jsonclick, 0, "Attribute", "", "", "", edtavCentidaddomicilionumero_Visible, edtavCentidaddomicilionumero_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00Y2.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEntidaddomiciliopisofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEntidaddomiciliopisofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidaddomiciliopisofilter_Internalname, "Entidad Domicilio Piso", "", "", lblLblentidaddomiciliopisofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Y2.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCentidaddomiciliopiso_Internalname, "Entidad Domicilio Piso", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCentidaddomiciliopiso_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cEntidadDomicilioPiso, (byte)(3), (byte)(0), ",", "")), ((edtavCentidaddomiciliopiso_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cEntidadDomicilioPiso), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cEntidadDomicilioPiso), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCentidaddomiciliopiso_Jsonclick, 0, "Attribute", "", "", "", edtavCentidaddomiciliopiso_Visible, edtavCentidaddomiciliopiso_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00Y2.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEntidaddomiciliodeptofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEntidaddomiciliodeptofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidaddomiciliodeptofilter_Internalname, "Entidad Domicilio Depto", "", "", lblLblentidaddomiciliodeptofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Y2.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCentidaddomiciliodepto_Internalname, "Entidad Domicilio Depto", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCentidaddomiciliodepto_Internalname, AV9cEntidadDomicilioDepto, GXutil.rtrim( localUtil.format( AV9cEntidadDomicilioDepto, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCentidaddomiciliodepto_Jsonclick, 0, "Attribute", "", "", "", edtavCentidaddomiciliodepto_Visible, edtavCentidaddomiciliodepto_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00Y2.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divEntidaddomiciliocpostalfiltercontainer_Internalname, 1, 0, "px", 0, "px", divEntidaddomiciliocpostalfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblentidaddomiciliocpostalfilter_Internalname, "Entidad Domicilio CPostal", "", "", lblLblentidaddomiciliocpostalfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00Y2.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCentidaddomiciliocpostal_Internalname, "Entidad Domicilio CPostal", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCentidaddomiciliocpostal_Internalname, AV10cEntidadDomicilioCPostal, GXutil.rtrim( localUtil.format( AV10cEntidadDomicilioCPostal, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCentidaddomiciliocpostal_Jsonclick, 0, "Attribute", "", "", "", edtavCentidaddomiciliocpostal_Visible, edtavCentidaddomiciliocpostal_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00Y2.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e160z1_client"+"'", TempTags, "", 2, "HLP_Gx00Y2.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"64\">") ;
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
            httpContext.writeValue( "Domicilio Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Domicilio Numero") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Domicilio Piso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Domicilio Depto") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Domicilio CPostal") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Empresa Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Entidad Id") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A84EntidadDomicilioId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A86EntidadDomicilioNumero, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A87EntidadDomicilioPiso, (byte)(3), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A88EntidadDomicilioDepto);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A89EntidadDomicilioCPostal);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A81EntidadId, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 64 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_64 = (short)(nGXsfl_64_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00Y2.htm");
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

   public void start0Z2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_2-109402", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Domicilio", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0Z0( ) ;
   }

   public void ws0Z2( )
   {
      start0Z2( ) ;
      evt0Z2( ) ;
   }

   public void evt0Z2( )
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
                           nGXsfl_64_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_642( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))));
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection));
                           A84EntidadDomicilioId = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioId_Internalname, GXutil.ltrim( GXutil.str( A84EntidadDomicilioId, 4, 0)));
                           A86EntidadDomicilioNumero = (int)(localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioNumero_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioNumero_Internalname, GXutil.ltrim( GXutil.str( A86EntidadDomicilioNumero, 6, 0)));
                           A87EntidadDomicilioPiso = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioPiso_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioPiso_Internalname, GXutil.ltrim( GXutil.str( A87EntidadDomicilioPiso, 3, 0)));
                           A88EntidadDomicilioDepto = httpContext.cgiGet( edtEntidadDomicilioDepto_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioDepto_Internalname, A88EntidadDomicilioDepto);
                           A89EntidadDomicilioCPostal = httpContext.cgiGet( edtEntidadDomicilioCPostal_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCPostal_Internalname, A89EntidadDomicilioCPostal);
                           A42EmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( edtEmpresaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEmpresaId_Internalname, GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
                           A81EntidadId = (int)(localUtil.ctol( httpContext.cgiGet( edtEntidadId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtEntidadId_Internalname, GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e170Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e180Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Centidaddomicilioid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADDOMICILIOID"), ",", ".") != AV6cEntidadDomicilioId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Centidaddomicilionumero Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADDOMICILIONUMERO"), ",", ".") != AV7cEntidadDomicilioNumero )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Centidaddomiciliopiso Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADDOMICILIOPISO"), ",", ".") != AV8cEntidadDomicilioPiso )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Centidaddomiciliodepto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENTIDADDOMICILIODEPTO"), AV9cEntidadDomicilioDepto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Centidaddomiciliocpostal Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENTIDADDOMICILIOCPOSTAL"), AV10cEntidadDomicilioCPostal) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e190Z2 ();
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

   public void we0Z2( )
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

   public void pa0Z2( )
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
      subsflControlProps_642( ) ;
      while ( nGXsfl_64_idx <= nRC_GXsfl_64 )
      {
         sendrow_642( ) ;
         nGXsfl_64_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_64_idx+1)) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  short AV6cEntidadDomicilioId ,
                                  int AV7cEntidadDomicilioNumero ,
                                  short AV8cEntidadDomicilioPiso ,
                                  String AV9cEntidadDomicilioDepto ,
                                  String AV10cEntidadDomicilioCPostal ,
                                  int AV11pEmpresaId ,
                                  int AV12pEntidadId )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0Z2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0Z2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0Z2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(64) ;
      nGXsfl_64_idx = (short)(1) ;
      sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_642( ) ;
      nGXsfl_64_Refreshing = (short)(1) ;
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
         subsflControlProps_642( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              new Integer(AV7cEntidadDomicilioNumero) ,
                                              new Short(AV8cEntidadDomicilioPiso) ,
                                              AV9cEntidadDomicilioDepto ,
                                              AV10cEntidadDomicilioCPostal ,
                                              new Integer(A86EntidadDomicilioNumero) ,
                                              new Short(A87EntidadDomicilioPiso) ,
                                              A88EntidadDomicilioDepto ,
                                              A89EntidadDomicilioCPostal ,
                                              new Integer(AV11pEmpresaId) ,
                                              new Integer(AV12pEntidadId) ,
                                              new Short(AV6cEntidadDomicilioId) ,
                                              new Integer(A42EmpresaId) ,
                                              new Integer(A81EntidadId) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT
                                              }
         } ) ;
         lV9cEntidadDomicilioDepto = GXutil.concat( GXutil.rtrim( AV9cEntidadDomicilioDepto), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cEntidadDomicilioDepto", AV9cEntidadDomicilioDepto);
         lV10cEntidadDomicilioCPostal = GXutil.concat( GXutil.rtrim( AV10cEntidadDomicilioCPostal), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cEntidadDomicilioCPostal", AV10cEntidadDomicilioCPostal);
         /* Using cursor H000Z2 */
         pr_default.execute(0, new Object[] {new Integer(AV11pEmpresaId), new Integer(AV12pEntidadId), new Short(AV6cEntidadDomicilioId), new Integer(AV7cEntidadDomicilioNumero), new Short(AV8cEntidadDomicilioPiso), lV9cEntidadDomicilioDepto, lV10cEntidadDomicilioCPostal, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_64_idx = (short)(1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_642( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A81EntidadId = H000Z2_A81EntidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadId_Internalname, GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
            A42EmpresaId = H000Z2_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEmpresaId_Internalname, GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            A89EntidadDomicilioCPostal = H000Z2_A89EntidadDomicilioCPostal[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCPostal_Internalname, A89EntidadDomicilioCPostal);
            A88EntidadDomicilioDepto = H000Z2_A88EntidadDomicilioDepto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioDepto_Internalname, A88EntidadDomicilioDepto);
            A87EntidadDomicilioPiso = H000Z2_A87EntidadDomicilioPiso[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioPiso_Internalname, GXutil.ltrim( GXutil.str( A87EntidadDomicilioPiso, 3, 0)));
            A86EntidadDomicilioNumero = H000Z2_A86EntidadDomicilioNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioNumero_Internalname, GXutil.ltrim( GXutil.str( A86EntidadDomicilioNumero, 6, 0)));
            A84EntidadDomicilioId = H000Z2_A84EntidadDomicilioId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioId_Internalname, GXutil.ltrim( GXutil.str( A84EntidadDomicilioId, 4, 0)));
            /* Execute user event: Load */
            e180Z2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(64) ;
         wb0Z0( ) ;
      }
      nGXsfl_64_Refreshing = (short)(0) ;
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
                                           new Integer(AV7cEntidadDomicilioNumero) ,
                                           new Short(AV8cEntidadDomicilioPiso) ,
                                           AV9cEntidadDomicilioDepto ,
                                           AV10cEntidadDomicilioCPostal ,
                                           new Integer(A86EntidadDomicilioNumero) ,
                                           new Short(A87EntidadDomicilioPiso) ,
                                           A88EntidadDomicilioDepto ,
                                           A89EntidadDomicilioCPostal ,
                                           new Integer(AV11pEmpresaId) ,
                                           new Integer(AV12pEntidadId) ,
                                           new Short(AV6cEntidadDomicilioId) ,
                                           new Integer(A42EmpresaId) ,
                                           new Integer(A81EntidadId) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT
                                           }
      } ) ;
      lV9cEntidadDomicilioDepto = GXutil.concat( GXutil.rtrim( AV9cEntidadDomicilioDepto), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cEntidadDomicilioDepto", AV9cEntidadDomicilioDepto);
      lV10cEntidadDomicilioCPostal = GXutil.concat( GXutil.rtrim( AV10cEntidadDomicilioCPostal), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cEntidadDomicilioCPostal", AV10cEntidadDomicilioCPostal);
      /* Using cursor H000Z3 */
      pr_default.execute(1, new Object[] {new Integer(AV11pEmpresaId), new Integer(AV12pEntidadId), new Short(AV6cEntidadDomicilioId), new Integer(AV7cEntidadDomicilioNumero), new Short(AV8cEntidadDomicilioPiso), lV9cEntidadDomicilioDepto, lV10cEntidadDomicilioCPostal});
      GRID1_nRecordCount = H000Z3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadDomicilioId, AV7cEntidadDomicilioNumero, AV8cEntidadDomicilioPiso, AV9cEntidadDomicilioDepto, AV10cEntidadDomicilioCPostal, AV11pEmpresaId, AV12pEntidadId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadDomicilioId, AV7cEntidadDomicilioNumero, AV8cEntidadDomicilioPiso, AV9cEntidadDomicilioDepto, AV10cEntidadDomicilioCPostal, AV11pEmpresaId, AV12pEntidadId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadDomicilioId, AV7cEntidadDomicilioNumero, AV8cEntidadDomicilioPiso, AV9cEntidadDomicilioDepto, AV10cEntidadDomicilioCPostal, AV11pEmpresaId, AV12pEntidadId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadDomicilioId, AV7cEntidadDomicilioNumero, AV8cEntidadDomicilioPiso, AV9cEntidadDomicilioDepto, AV10cEntidadDomicilioCPostal, AV11pEmpresaId, AV12pEntidadId) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cEntidadDomicilioId, AV7cEntidadDomicilioNumero, AV8cEntidadDomicilioPiso, AV9cEntidadDomicilioDepto, AV10cEntidadDomicilioCPostal, AV11pEmpresaId, AV12pEntidadId) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0Z0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e170Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCentidaddomicilioid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCentidaddomicilioid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCENTIDADDOMICILIOID");
            GX_FocusControl = edtavCentidaddomicilioid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cEntidadDomicilioId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cEntidadDomicilioId", GXutil.ltrim( GXutil.str( AV6cEntidadDomicilioId, 4, 0)));
         }
         else
         {
            AV6cEntidadDomicilioId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCentidaddomicilioid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cEntidadDomicilioId", GXutil.ltrim( GXutil.str( AV6cEntidadDomicilioId, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCentidaddomicilionumero_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCentidaddomicilionumero_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCENTIDADDOMICILIONUMERO");
            GX_FocusControl = edtavCentidaddomicilionumero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cEntidadDomicilioNumero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cEntidadDomicilioNumero", GXutil.ltrim( GXutil.str( AV7cEntidadDomicilioNumero, 6, 0)));
         }
         else
         {
            AV7cEntidadDomicilioNumero = (int)(localUtil.ctol( httpContext.cgiGet( edtavCentidaddomicilionumero_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cEntidadDomicilioNumero", GXutil.ltrim( GXutil.str( AV7cEntidadDomicilioNumero, 6, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCentidaddomiciliopiso_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCentidaddomiciliopiso_Internalname), ",", ".") > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCENTIDADDOMICILIOPISO");
            GX_FocusControl = edtavCentidaddomiciliopiso_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cEntidadDomicilioPiso = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cEntidadDomicilioPiso", GXutil.ltrim( GXutil.str( AV8cEntidadDomicilioPiso, 3, 0)));
         }
         else
         {
            AV8cEntidadDomicilioPiso = (short)(localUtil.ctol( httpContext.cgiGet( edtavCentidaddomiciliopiso_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cEntidadDomicilioPiso", GXutil.ltrim( GXutil.str( AV8cEntidadDomicilioPiso, 3, 0)));
         }
         AV9cEntidadDomicilioDepto = httpContext.cgiGet( edtavCentidaddomiciliodepto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cEntidadDomicilioDepto", AV9cEntidadDomicilioDepto);
         AV10cEntidadDomicilioCPostal = httpContext.cgiGet( edtavCentidaddomiciliocpostal_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cEntidadDomicilioCPostal", AV10cEntidadDomicilioCPostal);
         /* Read saved values. */
         nRC_GXsfl_64 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_64"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADDOMICILIOID"), ",", ".") != AV6cEntidadDomicilioId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADDOMICILIONUMERO"), ",", ".") != AV7cEntidadDomicilioNumero )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCENTIDADDOMICILIOPISO"), ",", ".") != AV8cEntidadDomicilioPiso )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENTIDADDOMICILIODEPTO"), AV9cEntidadDomicilioDepto) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENTIDADDOMICILIOCPOSTAL"), AV10cEntidadDomicilioCPostal) != 0 )
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
      e170Z2 ();
      if (returnInSub) return;
   }

   public void e170Z2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Domicilio", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e180Z2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_642( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ( nGXsfl_64_Refreshing == 0 ) )
      {
         httpContext.doAjaxLoad(64, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e190Z2 ();
      if (returnInSub) return;
   }

   public void e190Z2( )
   {
      /* Enter Routine */
      AV13pEntidadDomicilioId = A84EntidadDomicilioId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pEntidadDomicilioId", GXutil.ltrim( GXutil.str( AV13pEntidadDomicilioId, 4, 0)));
      httpContext.setWebReturnParms(new Object[] {new Short(AV13pEntidadDomicilioId)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV11pEmpresaId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pEmpresaId", GXutil.ltrim( GXutil.str( AV11pEmpresaId, 6, 0)));
      AV12pEntidadId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pEntidadId", GXutil.ltrim( GXutil.str( AV12pEntidadId, 6, 0)));
      AV13pEntidadDomicilioId = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pEntidadDomicilioId", GXutil.ltrim( GXutil.str( AV13pEntidadDomicilioId, 4, 0)));
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
      pa0Z2( ) ;
      ws0Z2( ) ;
      we0Z2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721916352429");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx00y2.js", "?201721916352429");
      /* End function include_jscripts */
   }

   public void subsflControlProps_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_idx ;
      edtEntidadDomicilioId_Internalname = "ENTIDADDOMICILIOID_"+sGXsfl_64_idx ;
      edtEntidadDomicilioNumero_Internalname = "ENTIDADDOMICILIONUMERO_"+sGXsfl_64_idx ;
      edtEntidadDomicilioPiso_Internalname = "ENTIDADDOMICILIOPISO_"+sGXsfl_64_idx ;
      edtEntidadDomicilioDepto_Internalname = "ENTIDADDOMICILIODEPTO_"+sGXsfl_64_idx ;
      edtEntidadDomicilioCPostal_Internalname = "ENTIDADDOMICILIOCPOSTAL_"+sGXsfl_64_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_64_idx ;
      edtEntidadId_Internalname = "ENTIDADID_"+sGXsfl_64_idx ;
   }

   public void subsflControlProps_fel_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_fel_idx ;
      edtEntidadDomicilioId_Internalname = "ENTIDADDOMICILIOID_"+sGXsfl_64_fel_idx ;
      edtEntidadDomicilioNumero_Internalname = "ENTIDADDOMICILIONUMERO_"+sGXsfl_64_fel_idx ;
      edtEntidadDomicilioPiso_Internalname = "ENTIDADDOMICILIOPISO_"+sGXsfl_64_fel_idx ;
      edtEntidadDomicilioDepto_Internalname = "ENTIDADDOMICILIODEPTO_"+sGXsfl_64_fel_idx ;
      edtEntidadDomicilioCPostal_Internalname = "ENTIDADDOMICILIOCPOSTAL_"+sGXsfl_64_fel_idx ;
      edtEmpresaId_Internalname = "EMPRESAID_"+sGXsfl_64_fel_idx ;
      edtEntidadId_Internalname = "ENTIDADID_"+sGXsfl_64_fel_idx ;
   }

   public void sendrow_642( )
   {
      subsflControlProps_642( ) ;
      wb0Z0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_64_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_64_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_64_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A84EntidadDomicilioId, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioId_Internalname,GXutil.ltrim( localUtil.ntoc( A84EntidadDomicilioId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A84EntidadDomicilioId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioNumero_Internalname,GXutil.ltrim( localUtil.ntoc( A86EntidadDomicilioNumero, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A86EntidadDomicilioNumero), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioNumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"DomicilioNumero","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioPiso_Internalname,GXutil.ltrim( localUtil.ntoc( A87EntidadDomicilioPiso, (byte)(3), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A87EntidadDomicilioPiso), "ZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioPiso_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"DomicilioPiso","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioDepto_Internalname,A88EntidadDomicilioDepto,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioDepto_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"DomicilioDepto","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioCPostal_Internalname,A89EntidadDomicilioCPostal,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioCPostal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"DomicilioCPostal","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresaId_Internalname,GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasMaestras","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadId_Internalname,GXutil.ltrim( localUtil.ntoc( A81EntidadId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A81EntidadId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasMaestras","right"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_64_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_64_idx+1)) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      /* End function sendrow_642 */
   }

   public void init_default_properties( )
   {
      lblLblentidaddomicilioidfilter_Internalname = "LBLENTIDADDOMICILIOIDFILTER" ;
      edtavCentidaddomicilioid_Internalname = "vCENTIDADDOMICILIOID" ;
      divEntidaddomicilioidfiltercontainer_Internalname = "ENTIDADDOMICILIOIDFILTERCONTAINER" ;
      lblLblentidaddomicilionumerofilter_Internalname = "LBLENTIDADDOMICILIONUMEROFILTER" ;
      edtavCentidaddomicilionumero_Internalname = "vCENTIDADDOMICILIONUMERO" ;
      divEntidaddomicilionumerofiltercontainer_Internalname = "ENTIDADDOMICILIONUMEROFILTERCONTAINER" ;
      lblLblentidaddomiciliopisofilter_Internalname = "LBLENTIDADDOMICILIOPISOFILTER" ;
      edtavCentidaddomiciliopiso_Internalname = "vCENTIDADDOMICILIOPISO" ;
      divEntidaddomiciliopisofiltercontainer_Internalname = "ENTIDADDOMICILIOPISOFILTERCONTAINER" ;
      lblLblentidaddomiciliodeptofilter_Internalname = "LBLENTIDADDOMICILIODEPTOFILTER" ;
      edtavCentidaddomiciliodepto_Internalname = "vCENTIDADDOMICILIODEPTO" ;
      divEntidaddomiciliodeptofiltercontainer_Internalname = "ENTIDADDOMICILIODEPTOFILTERCONTAINER" ;
      lblLblentidaddomiciliocpostalfilter_Internalname = "LBLENTIDADDOMICILIOCPOSTALFILTER" ;
      edtavCentidaddomiciliocpostal_Internalname = "vCENTIDADDOMICILIOCPOSTAL" ;
      divEntidaddomiciliocpostalfiltercontainer_Internalname = "ENTIDADDOMICILIOCPOSTALFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtEntidadDomicilioId_Internalname = "ENTIDADDOMICILIOID" ;
      edtEntidadDomicilioNumero_Internalname = "ENTIDADDOMICILIONUMERO" ;
      edtEntidadDomicilioPiso_Internalname = "ENTIDADDOMICILIOPISO" ;
      edtEntidadDomicilioDepto_Internalname = "ENTIDADDOMICILIODEPTO" ;
      edtEntidadDomicilioCPostal_Internalname = "ENTIDADDOMICILIOCPOSTAL" ;
      edtEmpresaId_Internalname = "EMPRESAID" ;
      edtEntidadId_Internalname = "ENTIDADID" ;
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
      edtEntidadId_Jsonclick = "" ;
      edtEmpresaId_Jsonclick = "" ;
      edtEntidadDomicilioCPostal_Jsonclick = "" ;
      edtEntidadDomicilioDepto_Jsonclick = "" ;
      edtEntidadDomicilioPiso_Jsonclick = "" ;
      edtEntidadDomicilioNumero_Jsonclick = "" ;
      edtEntidadDomicilioId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCentidaddomiciliocpostal_Jsonclick = "" ;
      edtavCentidaddomiciliocpostal_Enabled = 1 ;
      edtavCentidaddomiciliocpostal_Visible = 1 ;
      edtavCentidaddomiciliodepto_Jsonclick = "" ;
      edtavCentidaddomiciliodepto_Enabled = 1 ;
      edtavCentidaddomiciliodepto_Visible = 1 ;
      edtavCentidaddomiciliopiso_Jsonclick = "" ;
      edtavCentidaddomiciliopiso_Enabled = 1 ;
      edtavCentidaddomiciliopiso_Visible = 1 ;
      edtavCentidaddomicilionumero_Jsonclick = "" ;
      edtavCentidaddomicilionumero_Enabled = 1 ;
      edtavCentidaddomicilionumero_Visible = 1 ;
      edtavCentidaddomicilioid_Jsonclick = "" ;
      edtavCentidaddomicilioid_Enabled = 1 ;
      edtavCentidaddomicilioid_Visible = 1 ;
      divEntidaddomiciliocpostalfiltercontainer_Class = "AdvancedContainerItem" ;
      divEntidaddomiciliodeptofiltercontainer_Class = "AdvancedContainerItem" ;
      divEntidaddomiciliopisofiltercontainer_Class = "AdvancedContainerItem" ;
      divEntidaddomicilionumerofiltercontainer_Class = "AdvancedContainerItem" ;
      divEntidaddomicilioidfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Domicilio" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadDomicilioId',fld:'vCENTIDADDOMICILIOID'},{av:'AV7cEntidadDomicilioNumero',fld:'vCENTIDADDOMICILIONUMERO'},{av:'AV8cEntidadDomicilioPiso',fld:'vCENTIDADDOMICILIOPISO'},{av:'AV9cEntidadDomicilioDepto',fld:'vCENTIDADDOMICILIODEPTO'},{av:'AV10cEntidadDomicilioCPostal',fld:'vCENTIDADDOMICILIOCPOSTAL'},{av:'AV11pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV12pEntidadId',fld:'vPENTIDADID',hsh:true}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e160Z1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLENTIDADDOMICILIOIDFILTER.CLICK","{handler:'e110Z1',iparms:[{av:'divEntidaddomicilioidfiltercontainer_Class',ctrl:'ENTIDADDOMICILIOIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidaddomicilioidfiltercontainer_Class',ctrl:'ENTIDADDOMICILIOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCentidaddomicilioid_Visible',ctrl:'vCENTIDADDOMICILIOID',prop:'Visible'}]}");
      setEventMetadata("LBLENTIDADDOMICILIONUMEROFILTER.CLICK","{handler:'e120Z1',iparms:[{av:'divEntidaddomicilionumerofiltercontainer_Class',ctrl:'ENTIDADDOMICILIONUMEROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidaddomicilionumerofiltercontainer_Class',ctrl:'ENTIDADDOMICILIONUMEROFILTERCONTAINER',prop:'Class'},{av:'edtavCentidaddomicilionumero_Visible',ctrl:'vCENTIDADDOMICILIONUMERO',prop:'Visible'}]}");
      setEventMetadata("LBLENTIDADDOMICILIOPISOFILTER.CLICK","{handler:'e130Z1',iparms:[{av:'divEntidaddomiciliopisofiltercontainer_Class',ctrl:'ENTIDADDOMICILIOPISOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidaddomiciliopisofiltercontainer_Class',ctrl:'ENTIDADDOMICILIOPISOFILTERCONTAINER',prop:'Class'},{av:'edtavCentidaddomiciliopiso_Visible',ctrl:'vCENTIDADDOMICILIOPISO',prop:'Visible'}]}");
      setEventMetadata("LBLENTIDADDOMICILIODEPTOFILTER.CLICK","{handler:'e140Z1',iparms:[{av:'divEntidaddomiciliodeptofiltercontainer_Class',ctrl:'ENTIDADDOMICILIODEPTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidaddomiciliodeptofiltercontainer_Class',ctrl:'ENTIDADDOMICILIODEPTOFILTERCONTAINER',prop:'Class'},{av:'edtavCentidaddomiciliodepto_Visible',ctrl:'vCENTIDADDOMICILIODEPTO',prop:'Visible'}]}");
      setEventMetadata("LBLENTIDADDOMICILIOCPOSTALFILTER.CLICK","{handler:'e150Z1',iparms:[{av:'divEntidaddomiciliocpostalfiltercontainer_Class',ctrl:'ENTIDADDOMICILIOCPOSTALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEntidaddomiciliocpostalfiltercontainer_Class',ctrl:'ENTIDADDOMICILIOCPOSTALFILTERCONTAINER',prop:'Class'},{av:'edtavCentidaddomiciliocpostal_Visible',ctrl:'vCENTIDADDOMICILIOCPOSTAL',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e190Z2',iparms:[{av:'A84EntidadDomicilioId',fld:'ENTIDADDOMICILIOID'}],oparms:[{av:'AV13pEntidadDomicilioId',fld:'vPENTIDADDOMICILIOID'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadDomicilioId',fld:'vCENTIDADDOMICILIOID'},{av:'AV7cEntidadDomicilioNumero',fld:'vCENTIDADDOMICILIONUMERO'},{av:'AV8cEntidadDomicilioPiso',fld:'vCENTIDADDOMICILIOPISO'},{av:'AV9cEntidadDomicilioDepto',fld:'vCENTIDADDOMICILIODEPTO'},{av:'AV10cEntidadDomicilioCPostal',fld:'vCENTIDADDOMICILIOCPOSTAL'},{av:'AV11pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV12pEntidadId',fld:'vPENTIDADID',hsh:true}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadDomicilioId',fld:'vCENTIDADDOMICILIOID'},{av:'AV7cEntidadDomicilioNumero',fld:'vCENTIDADDOMICILIONUMERO'},{av:'AV8cEntidadDomicilioPiso',fld:'vCENTIDADDOMICILIOPISO'},{av:'AV9cEntidadDomicilioDepto',fld:'vCENTIDADDOMICILIODEPTO'},{av:'AV10cEntidadDomicilioCPostal',fld:'vCENTIDADDOMICILIOCPOSTAL'},{av:'AV11pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV12pEntidadId',fld:'vPENTIDADID',hsh:true}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadDomicilioId',fld:'vCENTIDADDOMICILIOID'},{av:'AV7cEntidadDomicilioNumero',fld:'vCENTIDADDOMICILIONUMERO'},{av:'AV8cEntidadDomicilioPiso',fld:'vCENTIDADDOMICILIOPISO'},{av:'AV9cEntidadDomicilioDepto',fld:'vCENTIDADDOMICILIODEPTO'},{av:'AV10cEntidadDomicilioCPostal',fld:'vCENTIDADDOMICILIOCPOSTAL'},{av:'AV11pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV12pEntidadId',fld:'vPENTIDADID',hsh:true}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadDomicilioId',fld:'vCENTIDADDOMICILIOID'},{av:'AV7cEntidadDomicilioNumero',fld:'vCENTIDADDOMICILIONUMERO'},{av:'AV8cEntidadDomicilioPiso',fld:'vCENTIDADDOMICILIOPISO'},{av:'AV9cEntidadDomicilioDepto',fld:'vCENTIDADDOMICILIODEPTO'},{av:'AV10cEntidadDomicilioCPostal',fld:'vCENTIDADDOMICILIOCPOSTAL'},{av:'AV11pEmpresaId',fld:'vPEMPRESAID',hsh:true},{av:'AV12pEntidadId',fld:'vPENTIDADID',hsh:true}],oparms:[]}");
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
      AV9cEntidadDomicilioDepto = "" ;
      AV10cEntidadDomicilioCPostal = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblentidaddomicilioidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblentidaddomicilionumerofilter_Jsonclick = "" ;
      lblLblentidaddomiciliopisofilter_Jsonclick = "" ;
      lblLblentidaddomiciliodeptofilter_Jsonclick = "" ;
      lblLblentidaddomiciliocpostalfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A88EntidadDomicilioDepto = "" ;
      A89EntidadDomicilioCPostal = "" ;
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
      lV9cEntidadDomicilioDepto = "" ;
      lV10cEntidadDomicilioCPostal = "" ;
      H000Z2_A81EntidadId = new int[1] ;
      H000Z2_A42EmpresaId = new int[1] ;
      H000Z2_A89EntidadDomicilioCPostal = new String[] {""} ;
      H000Z2_A88EntidadDomicilioDepto = new String[] {""} ;
      H000Z2_A87EntidadDomicilioPiso = new short[1] ;
      H000Z2_A86EntidadDomicilioNumero = new int[1] ;
      H000Z2_A84EntidadDomicilioId = new short[1] ;
      H000Z3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx00y2__default(),
         new Object[] {
             new Object[] {
            H000Z2_A81EntidadId, H000Z2_A42EmpresaId, H000Z2_A89EntidadDomicilioCPostal, H000Z2_A88EntidadDomicilioDepto, H000Z2_A87EntidadDomicilioPiso, H000Z2_A86EntidadDomicilioNumero, H000Z2_A84EntidadDomicilioId
            }
            , new Object[] {
            H000Z3_AGRID1_nRecordCount
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
   private short nRC_GXsfl_64 ;
   private short nGXsfl_64_idx=1 ;
   private short AV6cEntidadDomicilioId ;
   private short AV8cEntidadDomicilioPiso ;
   private short AV13pEntidadDomicilioId ;
   private short wbEnd ;
   private short wbStart ;
   private short A84EntidadDomicilioId ;
   private short A87EntidadDomicilioPiso ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_64_Refreshing=0 ;
   private int wcpOAV11pEmpresaId ;
   private int wcpOAV12pEntidadId ;
   private int subGrid1_Rows ;
   private int AV7cEntidadDomicilioNumero ;
   private int AV11pEmpresaId ;
   private int AV12pEntidadId ;
   private int edtavCentidaddomicilioid_Enabled ;
   private int edtavCentidaddomicilioid_Visible ;
   private int edtavCentidaddomicilionumero_Enabled ;
   private int edtavCentidaddomicilionumero_Visible ;
   private int edtavCentidaddomiciliopiso_Enabled ;
   private int edtavCentidaddomiciliopiso_Visible ;
   private int edtavCentidaddomiciliodepto_Visible ;
   private int edtavCentidaddomiciliodepto_Enabled ;
   private int edtavCentidaddomiciliocpostal_Visible ;
   private int edtavCentidaddomiciliocpostal_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A86EntidadDomicilioNumero ;
   private int A42EmpresaId ;
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
   private String divEntidaddomicilioidfiltercontainer_Class ;
   private String divEntidaddomicilionumerofiltercontainer_Class ;
   private String divEntidaddomiciliopisofiltercontainer_Class ;
   private String divEntidaddomiciliodeptofiltercontainer_Class ;
   private String divEntidaddomiciliocpostalfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_64_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divEntidaddomicilioidfiltercontainer_Internalname ;
   private String lblLblentidaddomicilioidfilter_Internalname ;
   private String lblLblentidaddomicilioidfilter_Jsonclick ;
   private String edtavCentidaddomicilioid_Internalname ;
   private String TempTags ;
   private String edtavCentidaddomicilioid_Jsonclick ;
   private String divEntidaddomicilionumerofiltercontainer_Internalname ;
   private String lblLblentidaddomicilionumerofilter_Internalname ;
   private String lblLblentidaddomicilionumerofilter_Jsonclick ;
   private String edtavCentidaddomicilionumero_Internalname ;
   private String edtavCentidaddomicilionumero_Jsonclick ;
   private String divEntidaddomiciliopisofiltercontainer_Internalname ;
   private String lblLblentidaddomiciliopisofilter_Internalname ;
   private String lblLblentidaddomiciliopisofilter_Jsonclick ;
   private String edtavCentidaddomiciliopiso_Internalname ;
   private String edtavCentidaddomiciliopiso_Jsonclick ;
   private String divEntidaddomiciliodeptofiltercontainer_Internalname ;
   private String lblLblentidaddomiciliodeptofilter_Internalname ;
   private String lblLblentidaddomiciliodeptofilter_Jsonclick ;
   private String edtavCentidaddomiciliodepto_Internalname ;
   private String edtavCentidaddomiciliodepto_Jsonclick ;
   private String divEntidaddomiciliocpostalfiltercontainer_Internalname ;
   private String lblLblentidaddomiciliocpostalfilter_Internalname ;
   private String lblLblentidaddomiciliocpostalfilter_Jsonclick ;
   private String edtavCentidaddomiciliocpostal_Internalname ;
   private String edtavCentidaddomiciliocpostal_Jsonclick ;
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
   private String edtEntidadDomicilioId_Internalname ;
   private String edtEntidadDomicilioNumero_Internalname ;
   private String edtEntidadDomicilioPiso_Internalname ;
   private String edtEntidadDomicilioDepto_Internalname ;
   private String edtEntidadDomicilioCPostal_Internalname ;
   private String edtEmpresaId_Internalname ;
   private String edtEntidadId_Internalname ;
   private String GXKey ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_64_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtEntidadDomicilioId_Jsonclick ;
   private String edtEntidadDomicilioNumero_Jsonclick ;
   private String edtEntidadDomicilioPiso_Jsonclick ;
   private String edtEntidadDomicilioDepto_Jsonclick ;
   private String edtEntidadDomicilioCPostal_Jsonclick ;
   private String edtEmpresaId_Jsonclick ;
   private String edtEntidadId_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV9cEntidadDomicilioDepto ;
   private String AV10cEntidadDomicilioCPostal ;
   private String A88EntidadDomicilioDepto ;
   private String A89EntidadDomicilioCPostal ;
   private String AV17Linkselection_GXI ;
   private String lV9cEntidadDomicilioDepto ;
   private String lV10cEntidadDomicilioCPostal ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] H000Z2_A81EntidadId ;
   private int[] H000Z2_A42EmpresaId ;
   private String[] H000Z2_A89EntidadDomicilioCPostal ;
   private String[] H000Z2_A88EntidadDomicilioDepto ;
   private short[] H000Z2_A87EntidadDomicilioPiso ;
   private int[] H000Z2_A86EntidadDomicilioNumero ;
   private short[] H000Z2_A84EntidadDomicilioId ;
   private long[] H000Z3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00y2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cEntidadDomicilioNumero ,
                                          short AV8cEntidadDomicilioPiso ,
                                          String AV9cEntidadDomicilioDepto ,
                                          String AV10cEntidadDomicilioCPostal ,
                                          int A86EntidadDomicilioNumero ,
                                          short A87EntidadDomicilioPiso ,
                                          String A88EntidadDomicilioDepto ,
                                          String A89EntidadDomicilioCPostal ,
                                          int AV11pEmpresaId ,
                                          int AV12pEntidadId ,
                                          short AV6cEntidadDomicilioId ,
                                          int A42EmpresaId ,
                                          int A81EntidadId )
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
      sSelectString = " EntidadId, EmpresaId, EntidadDomicilioCPostal, EntidadDomicilioDepto, EntidadDomicilioPiso," ;
      sSelectString = sSelectString + " EntidadDomicilioNumero, EntidadDomicilioId" ;
      sFromString = " FROM EntidadDomicilio" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (EmpresaId = ? and EntidadId = ? and EntidadDomicilioId >= ?)" ;
      if ( ! (0==AV7cEntidadDomicilioNumero) )
      {
         sWhereString = sWhereString + " and (EntidadDomicilioNumero >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV8cEntidadDomicilioPiso) )
      {
         sWhereString = sWhereString + " and (EntidadDomicilioPiso >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cEntidadDomicilioDepto)==0) )
      {
         sWhereString = sWhereString + " and (EntidadDomicilioDepto like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cEntidadDomicilioCPostal)==0) )
      {
         sWhereString = sWhereString + " and (EntidadDomicilioCPostal like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY EmpresaId, EntidadId, EntidadDomicilioId" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cEntidadDomicilioNumero ,
                                          short AV8cEntidadDomicilioPiso ,
                                          String AV9cEntidadDomicilioDepto ,
                                          String AV10cEntidadDomicilioCPostal ,
                                          int A86EntidadDomicilioNumero ,
                                          short A87EntidadDomicilioPiso ,
                                          String A88EntidadDomicilioDepto ,
                                          String A89EntidadDomicilioCPostal ,
                                          int AV11pEmpresaId ,
                                          int AV12pEntidadId ,
                                          short AV6cEntidadDomicilioId ,
                                          int A42EmpresaId ,
                                          int A81EntidadId )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM EntidadDomicilio" ;
      scmdbuf = scmdbuf + " WHERE (EmpresaId = ? and EntidadId = ? and EntidadDomicilioId >= ?)" ;
      if ( ! (0==AV7cEntidadDomicilioNumero) )
      {
         sWhereString = sWhereString + " and (EntidadDomicilioNumero >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV8cEntidadDomicilioPiso) )
      {
         sWhereString = sWhereString + " and (EntidadDomicilioPiso >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cEntidadDomicilioDepto)==0) )
      {
         sWhereString = sWhereString + " and (EntidadDomicilioDepto like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cEntidadDomicilioCPostal)==0) )
      {
         sWhereString = sWhereString + " and (EntidadDomicilioCPostal like ?)" ;
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
                  return conditional_H000Z2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H000Z3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
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
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
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
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 10);
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
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
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 10);
               }
               return;
      }
   }

}

