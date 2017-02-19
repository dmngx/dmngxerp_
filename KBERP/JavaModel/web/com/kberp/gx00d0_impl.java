/*
               File: gx00d0_impl
        Description: Selection List Articulo
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:32:20.58
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

public final  class gx00d0_impl extends GXDataArea
{
   public gx00d0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00d0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00d0_impl.class ));
   }

   public gx00d0_impl( int remoteHandle ,
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
            AV6cArticuloId = httpContext.GetNextPar( ) ;
            AV7cMarcaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cRubroId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cAlicuotaIvaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10cArticuloCosto = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cMarcaId, AV8cRubroId, AV9cAlicuotaIvaId, AV10cArticuloCosto) ;
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
            AV11pArticuloId = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11pArticuloId", AV11pArticuloId);
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
      pa0J2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0J2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721917322067");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.gx00d0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV11pArticuloId))+"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCMARCAID", GXutil.ltrim( localUtil.ntoc( AV7cMarcaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRUBROID", GXutil.ltrim( localUtil.ntoc( AV8cRubroId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCALICUOTAIVAID", GXutil.ltrim( localUtil.ntoc( AV9cAlicuotaIvaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GXH_vCARTICULOCOSTO", GXutil.ltrim( localUtil.ntoc( AV10cArticuloCosto, (byte)(12), (byte)(2), ",", "")));
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_64", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_64, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vPARTICULOID", AV11pArticuloId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ARTICULOIDFILTERCONTAINER_Class", GXutil.rtrim( divArticuloidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "MARCAIDFILTERCONTAINER_Class", GXutil.rtrim( divMarcaidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "RUBROIDFILTERCONTAINER_Class", GXutil.rtrim( divRubroidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ALICUOTAIVAIDFILTERCONTAINER_Class", GXutil.rtrim( divAlicuotaivaidfiltercontainer_Class));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ARTICULOCOSTOFILTERCONTAINER_Class", GXutil.rtrim( divArticulocostofiltercontainer_Class));
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
         we0J2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0J2( ) ;
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
      return formatLink("com.kberp.gx00d0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV11pArticuloId)) ;
   }

   public String getPgmname( )
   {
      return "Gx00D0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Articulo" ;
   }

   public void wb0J0( )
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblarticuloidfilter_Internalname, "Articulo Id", "", "", lblLblarticuloidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00D0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCarticuloid_Internalname, AV6cArticuloId, GXutil.rtrim( localUtil.format( AV6cArticuloId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCarticuloid_Jsonclick, 0, "Attribute", "", "", "", edtavCarticuloid_Visible, edtavCarticuloid_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00D0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divMarcaidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divMarcaidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblmarcaidfilter_Internalname, "Marca Id", "", "", lblLblmarcaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00D0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCmarcaid_Internalname, "Marca Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCmarcaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cMarcaId, (byte)(4), (byte)(0), ",", "")), ((edtavCmarcaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cMarcaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cMarcaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmarcaid_Jsonclick, 0, "Attribute", "", "", "", edtavCmarcaid_Visible, edtavCmarcaid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00D0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divRubroidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRubroidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblrubroidfilter_Internalname, "Rubro Id", "", "", lblLblrubroidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00D0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCrubroid_Internalname, "Rubro Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCrubroid_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cRubroId, (byte)(4), (byte)(0), ",", "")), ((edtavCrubroid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cRubroId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cRubroId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrubroid_Jsonclick, 0, "Attribute", "", "", "", edtavCrubroid_Visible, edtavCrubroid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00D0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divAlicuotaivaidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divAlicuotaivaidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblalicuotaivaidfilter_Internalname, "Alicuota Iva Id", "", "", lblLblalicuotaivaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00D0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCalicuotaivaid_Internalname, "Alicuota Iva Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCalicuotaivaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cAlicuotaIvaId, (byte)(4), (byte)(0), ",", "")), ((edtavCalicuotaivaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cAlicuotaIvaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cAlicuotaIvaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalicuotaivaid_Jsonclick, 0, "Attribute", "", "", "", edtavCalicuotaivaid_Visible, edtavCalicuotaivaid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00D0.htm");
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
         com.kberp.GxWebStd.gx_div_start( httpContext, divArticulocostofiltercontainer_Internalname, 1, 0, "px", 0, "px", divArticulocostofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblLblarticulocostofilter_Internalname, "Articulo Costo", "", "", lblLblarticulocostofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00D0.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtavCarticulocosto_Internalname, "Articulo Costo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtavCarticulocosto_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cArticuloCosto, (byte)(12), (byte)(2), ",", "")), ((edtavCarticulocosto_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV10cArticuloCosto, "ZZZZZZZZ9.99")) : localUtil.format( AV10cArticuloCosto, "ZZZZZZZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCarticulocosto_Jsonclick, 0, "Attribute", "", "", "", edtavCarticulocosto_Visible, edtavCarticulocosto_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00D0.htm");
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
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e160j1_client"+"'", TempTags, "", 2, "HLP_Gx00D0.htm");
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Marca Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Rubro Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Alicuota Iva Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7MarcaId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11RubroId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A17AlicuotaIvaId, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A41ArticuloCosto, (byte)(12), (byte)(2), ".", "")));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00D0.htm");
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

   public void start0J2( )
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
      strup0J0( ) ;
   }

   public void ws0J2( )
   {
      start0J2( ) ;
      evt0J2( ) ;
   }

   public void evt0J2( )
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
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV15Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))));
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection));
                           A39ArticuloId = httpContext.cgiGet( edtArticuloId_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtArticuloId_Internalname, A39ArticuloId);
                           A7MarcaId = (short)(localUtil.ctol( httpContext.cgiGet( edtMarcaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtMarcaId_Internalname, GXutil.ltrim( GXutil.str( A7MarcaId, 4, 0)));
                           A11RubroId = (short)(localUtil.ctol( httpContext.cgiGet( edtRubroId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtRubroId_Internalname, GXutil.ltrim( GXutil.str( A11RubroId, 4, 0)));
                           A17AlicuotaIvaId = (short)(localUtil.ctol( httpContext.cgiGet( edtAlicuotaIvaId_Internalname), ",", ".")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtAlicuotaIvaId_Internalname, GXutil.ltrim( GXutil.str( A17AlicuotaIvaId, 4, 0)));
                           A41ArticuloCosto = localUtil.ctond( httpContext.cgiGet( edtArticuloCosto_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtArticuloCosto_Internalname, GXutil.ltrim( GXutil.str( A41ArticuloCosto, 12, 2)));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e170J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e180J2 ();
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
                                    /* Set Refresh If Cmarcaid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCMARCAID"), ",", ".") != AV7cMarcaId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crubroid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRUBROID"), ",", ".") != AV8cRubroId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Calicuotaivaid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCALICUOTAIVAID"), ",", ".") != AV9cAlicuotaIvaId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Carticulocosto Changed */
                                    if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCARTICULOCOSTO")), AV10cArticuloCosto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e190J2 ();
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

   public void we0J2( )
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

   public void pa0J2( )
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
                                  String AV6cArticuloId ,
                                  short AV7cMarcaId ,
                                  short AV8cRubroId ,
                                  short AV9cAlicuotaIvaId ,
                                  java.math.BigDecimal AV10cArticuloCosto )
   {
      initialize_formulas( ) ;
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0J2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0J2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0J2( )
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
                                              new Short(AV7cMarcaId) ,
                                              new Short(AV8cRubroId) ,
                                              new Short(AV9cAlicuotaIvaId) ,
                                              AV10cArticuloCosto ,
                                              new Short(A7MarcaId) ,
                                              new Short(A11RubroId) ,
                                              new Short(A17AlicuotaIvaId) ,
                                              A41ArticuloCosto ,
                                              A39ArticuloId ,
                                              AV6cArticuloId } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV6cArticuloId = GXutil.concat( GXutil.rtrim( AV6cArticuloId), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cArticuloId", AV6cArticuloId);
         /* Using cursor H000J2 */
         pr_default.execute(0, new Object[] {lV6cArticuloId, new Short(AV7cMarcaId), new Short(AV8cRubroId), new Short(AV9cAlicuotaIvaId), AV10cArticuloCosto, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_64_idx = (short)(1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_642( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A41ArticuloCosto = H000J2_A41ArticuloCosto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtArticuloCosto_Internalname, GXutil.ltrim( GXutil.str( A41ArticuloCosto, 12, 2)));
            A17AlicuotaIvaId = H000J2_A17AlicuotaIvaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtAlicuotaIvaId_Internalname, GXutil.ltrim( GXutil.str( A17AlicuotaIvaId, 4, 0)));
            A11RubroId = H000J2_A11RubroId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtRubroId_Internalname, GXutil.ltrim( GXutil.str( A11RubroId, 4, 0)));
            A7MarcaId = H000J2_A7MarcaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtMarcaId_Internalname, GXutil.ltrim( GXutil.str( A7MarcaId, 4, 0)));
            A39ArticuloId = H000J2_A39ArticuloId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtArticuloId_Internalname, A39ArticuloId);
            /* Execute user event: Load */
            e180J2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(64) ;
         wb0J0( ) ;
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
                                           new Short(AV7cMarcaId) ,
                                           new Short(AV8cRubroId) ,
                                           new Short(AV9cAlicuotaIvaId) ,
                                           AV10cArticuloCosto ,
                                           new Short(A7MarcaId) ,
                                           new Short(A11RubroId) ,
                                           new Short(A17AlicuotaIvaId) ,
                                           A41ArticuloCosto ,
                                           A39ArticuloId ,
                                           AV6cArticuloId } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV6cArticuloId = GXutil.concat( GXutil.rtrim( AV6cArticuloId), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cArticuloId", AV6cArticuloId);
      /* Using cursor H000J3 */
      pr_default.execute(1, new Object[] {lV6cArticuloId, new Short(AV7cMarcaId), new Short(AV8cRubroId), new Short(AV9cAlicuotaIvaId), AV10cArticuloCosto});
      GRID1_nRecordCount = H000J3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cMarcaId, AV8cRubroId, AV9cAlicuotaIvaId, AV10cArticuloCosto) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cMarcaId, AV8cRubroId, AV9cAlicuotaIvaId, AV10cArticuloCosto) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cMarcaId, AV8cRubroId, AV9cAlicuotaIvaId, AV10cArticuloCosto) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cMarcaId, AV8cRubroId, AV9cAlicuotaIvaId, AV10cArticuloCosto) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cArticuloId, AV7cMarcaId, AV8cRubroId, AV9cAlicuotaIvaId, AV10cArticuloCosto) ;
      }
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0J0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e170J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cArticuloId = httpContext.cgiGet( edtavCarticuloid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cArticuloId", AV6cArticuloId);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCmarcaid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCmarcaid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCMARCAID");
            GX_FocusControl = edtavCmarcaid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cMarcaId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cMarcaId", GXutil.ltrim( GXutil.str( AV7cMarcaId, 4, 0)));
         }
         else
         {
            AV7cMarcaId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCmarcaid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cMarcaId", GXutil.ltrim( GXutil.str( AV7cMarcaId, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCrubroid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCrubroid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRUBROID");
            GX_FocusControl = edtavCrubroid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cRubroId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cRubroId", GXutil.ltrim( GXutil.str( AV8cRubroId, 4, 0)));
         }
         else
         {
            AV8cRubroId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCrubroid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cRubroId", GXutil.ltrim( GXutil.str( AV8cRubroId, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCalicuotaivaid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCalicuotaivaid_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCALICUOTAIVAID");
            GX_FocusControl = edtavCalicuotaivaid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cAlicuotaIvaId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cAlicuotaIvaId", GXutil.ltrim( GXutil.str( AV9cAlicuotaIvaId, 4, 0)));
         }
         else
         {
            AV9cAlicuotaIvaId = (short)(localUtil.ctol( httpContext.cgiGet( edtavCalicuotaivaid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cAlicuotaIvaId", GXutil.ltrim( GXutil.str( AV9cAlicuotaIvaId, 4, 0)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCarticulocosto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCarticulocosto_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCARTICULOCOSTO");
            GX_FocusControl = edtavCarticulocosto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cArticuloCosto = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cArticuloCosto", GXutil.ltrim( GXutil.str( AV10cArticuloCosto, 12, 2)));
         }
         else
         {
            AV10cArticuloCosto = localUtil.ctond( httpContext.cgiGet( edtavCarticulocosto_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cArticuloCosto", GXutil.ltrim( GXutil.str( AV10cArticuloCosto, 12, 2)));
         }
         /* Read saved values. */
         nRC_GXsfl_64 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_64"), ",", ".")) ;
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
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCMARCAID"), ",", ".") != AV7cMarcaId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRUBROID"), ",", ".") != AV8cRubroId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCALICUOTAIVAID"), ",", ".") != AV9cAlicuotaIvaId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCARTICULOCOSTO")), AV10cArticuloCosto) != 0 )
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
      e170J2 ();
      if (returnInSub) return;
   }

   public void e170J2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Articulo", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV12ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e180J2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV15Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      e190J2 ();
      if (returnInSub) return;
   }

   public void e190J2( )
   {
      /* Enter Routine */
      AV11pArticuloId = A39ArticuloId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pArticuloId", AV11pArticuloId);
      httpContext.setWebReturnParms(new Object[] {AV11pArticuloId});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV11pArticuloId = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pArticuloId", AV11pArticuloId);
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
      pa0J2( ) ;
      ws0J2( ) ;
      we0J2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721917322238");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gx00d0.js", "?201721917322238");
      /* End function include_jscripts */
   }

   public void subsflControlProps_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_idx ;
      edtArticuloId_Internalname = "ARTICULOID_"+sGXsfl_64_idx ;
      edtMarcaId_Internalname = "MARCAID_"+sGXsfl_64_idx ;
      edtRubroId_Internalname = "RUBROID_"+sGXsfl_64_idx ;
      edtAlicuotaIvaId_Internalname = "ALICUOTAIVAID_"+sGXsfl_64_idx ;
      edtArticuloCosto_Internalname = "ARTICULOCOSTO_"+sGXsfl_64_idx ;
   }

   public void subsflControlProps_fel_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_fel_idx ;
      edtArticuloId_Internalname = "ARTICULOID_"+sGXsfl_64_fel_idx ;
      edtMarcaId_Internalname = "MARCAID_"+sGXsfl_64_fel_idx ;
      edtRubroId_Internalname = "RUBROID_"+sGXsfl_64_fel_idx ;
      edtAlicuotaIvaId_Internalname = "ALICUOTAIVAID_"+sGXsfl_64_fel_idx ;
      edtArticuloCosto_Internalname = "ARTICULOCOSTO_"+sGXsfl_64_fel_idx ;
   }

   public void sendrow_642( )
   {
      subsflControlProps_642( ) ;
      wb0J0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A39ArticuloId)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV15Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV15Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArticuloId_Internalname,A39ArticuloId,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArticuloId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"IdArticulo","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMarcaId_Internalname,GXutil.ltrim( localUtil.ntoc( A7MarcaId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A7MarcaId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMarcaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRubroId_Internalname,GXutil.ltrim( localUtil.ntoc( A11RubroId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A11RubroId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRubroId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlicuotaIvaId_Internalname,GXutil.ltrim( localUtil.ntoc( A17AlicuotaIvaId, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A17AlicuotaIvaId), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlicuotaIvaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArticuloCosto_Internalname,GXutil.ltrim( localUtil.ntoc( A41ArticuloCosto, (byte)(12), (byte)(2), ",", "")),localUtil.format( A41ArticuloCosto, "ZZZZZZZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArticuloCosto_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(12),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"PreciosArticulo","right"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_64_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_64_idx+1)) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      /* End function sendrow_642 */
   }

   public void init_default_properties( )
   {
      lblLblarticuloidfilter_Internalname = "LBLARTICULOIDFILTER" ;
      edtavCarticuloid_Internalname = "vCARTICULOID" ;
      divArticuloidfiltercontainer_Internalname = "ARTICULOIDFILTERCONTAINER" ;
      lblLblmarcaidfilter_Internalname = "LBLMARCAIDFILTER" ;
      edtavCmarcaid_Internalname = "vCMARCAID" ;
      divMarcaidfiltercontainer_Internalname = "MARCAIDFILTERCONTAINER" ;
      lblLblrubroidfilter_Internalname = "LBLRUBROIDFILTER" ;
      edtavCrubroid_Internalname = "vCRUBROID" ;
      divRubroidfiltercontainer_Internalname = "RUBROIDFILTERCONTAINER" ;
      lblLblalicuotaivaidfilter_Internalname = "LBLALICUOTAIVAIDFILTER" ;
      edtavCalicuotaivaid_Internalname = "vCALICUOTAIVAID" ;
      divAlicuotaivaidfiltercontainer_Internalname = "ALICUOTAIVAIDFILTERCONTAINER" ;
      lblLblarticulocostofilter_Internalname = "LBLARTICULOCOSTOFILTER" ;
      edtavCarticulocosto_Internalname = "vCARTICULOCOSTO" ;
      divArticulocostofiltercontainer_Internalname = "ARTICULOCOSTOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtArticuloId_Internalname = "ARTICULOID" ;
      edtMarcaId_Internalname = "MARCAID" ;
      edtRubroId_Internalname = "RUBROID" ;
      edtAlicuotaIvaId_Internalname = "ALICUOTAIVAID" ;
      edtArticuloCosto_Internalname = "ARTICULOCOSTO" ;
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
      edtArticuloCosto_Jsonclick = "" ;
      edtAlicuotaIvaId_Jsonclick = "" ;
      edtRubroId_Jsonclick = "" ;
      edtMarcaId_Jsonclick = "" ;
      edtArticuloId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCarticulocosto_Jsonclick = "" ;
      edtavCarticulocosto_Enabled = 1 ;
      edtavCarticulocosto_Visible = 1 ;
      edtavCalicuotaivaid_Jsonclick = "" ;
      edtavCalicuotaivaid_Enabled = 1 ;
      edtavCalicuotaivaid_Visible = 1 ;
      edtavCrubroid_Jsonclick = "" ;
      edtavCrubroid_Enabled = 1 ;
      edtavCrubroid_Visible = 1 ;
      edtavCmarcaid_Jsonclick = "" ;
      edtavCmarcaid_Enabled = 1 ;
      edtavCmarcaid_Visible = 1 ;
      edtavCarticuloid_Jsonclick = "" ;
      edtavCarticuloid_Enabled = 1 ;
      edtavCarticuloid_Visible = 1 ;
      divArticulocostofiltercontainer_Class = "AdvancedContainerItem" ;
      divAlicuotaivaidfiltercontainer_Class = "AdvancedContainerItem" ;
      divRubroidfiltercontainer_Class = "AdvancedContainerItem" ;
      divMarcaidfiltercontainer_Class = "AdvancedContainerItem" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cMarcaId',fld:'vCMARCAID'},{av:'AV8cRubroId',fld:'vCRUBROID'},{av:'AV9cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV10cArticuloCosto',fld:'vCARTICULOCOSTO'}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e160J1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLARTICULOIDFILTER.CLICK","{handler:'e110J1',iparms:[{av:'divArticuloidfiltercontainer_Class',ctrl:'ARTICULOIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divArticuloidfiltercontainer_Class',ctrl:'ARTICULOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCarticuloid_Visible',ctrl:'vCARTICULOID',prop:'Visible'}]}");
      setEventMetadata("LBLMARCAIDFILTER.CLICK","{handler:'e120J1',iparms:[{av:'divMarcaidfiltercontainer_Class',ctrl:'MARCAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divMarcaidfiltercontainer_Class',ctrl:'MARCAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCmarcaid_Visible',ctrl:'vCMARCAID',prop:'Visible'}]}");
      setEventMetadata("LBLRUBROIDFILTER.CLICK","{handler:'e130J1',iparms:[{av:'divRubroidfiltercontainer_Class',ctrl:'RUBROIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRubroidfiltercontainer_Class',ctrl:'RUBROIDFILTERCONTAINER',prop:'Class'},{av:'edtavCrubroid_Visible',ctrl:'vCRUBROID',prop:'Visible'}]}");
      setEventMetadata("LBLALICUOTAIVAIDFILTER.CLICK","{handler:'e140J1',iparms:[{av:'divAlicuotaivaidfiltercontainer_Class',ctrl:'ALICUOTAIVAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlicuotaivaidfiltercontainer_Class',ctrl:'ALICUOTAIVAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCalicuotaivaid_Visible',ctrl:'vCALICUOTAIVAID',prop:'Visible'}]}");
      setEventMetadata("LBLARTICULOCOSTOFILTER.CLICK","{handler:'e150J1',iparms:[{av:'divArticulocostofiltercontainer_Class',ctrl:'ARTICULOCOSTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divArticulocostofiltercontainer_Class',ctrl:'ARTICULOCOSTOFILTERCONTAINER',prop:'Class'},{av:'edtavCarticulocosto_Visible',ctrl:'vCARTICULOCOSTO',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e190J2',iparms:[{av:'A39ArticuloId',fld:'ARTICULOID'}],oparms:[{av:'AV11pArticuloId',fld:'vPARTICULOID'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cMarcaId',fld:'vCMARCAID'},{av:'AV8cRubroId',fld:'vCRUBROID'},{av:'AV9cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV10cArticuloCosto',fld:'vCARTICULOCOSTO'}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cMarcaId',fld:'vCMARCAID'},{av:'AV8cRubroId',fld:'vCRUBROID'},{av:'AV9cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV10cArticuloCosto',fld:'vCARTICULOCOSTO'}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cMarcaId',fld:'vCMARCAID'},{av:'AV8cRubroId',fld:'vCRUBROID'},{av:'AV9cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV10cArticuloCosto',fld:'vCARTICULOCOSTO'}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cArticuloId',fld:'vCARTICULOID'},{av:'AV7cMarcaId',fld:'vCMARCAID'},{av:'AV8cRubroId',fld:'vCRUBROID'},{av:'AV9cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV10cArticuloCosto',fld:'vCARTICULOCOSTO'}],oparms:[]}");
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
      AV6cArticuloId = "" ;
      AV10cArticuloCosto = DecimalUtil.ZERO ;
      AV11pArticuloId = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblarticuloidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblmarcaidfilter_Jsonclick = "" ;
      lblLblrubroidfilter_Jsonclick = "" ;
      lblLblalicuotaivaidfilter_Jsonclick = "" ;
      lblLblarticulocostofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A39ArticuloId = "" ;
      A41ArticuloCosto = DecimalUtil.ZERO ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Linkselection_GXI = "" ;
      GXKey = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV6cArticuloId = "" ;
      H000J2_A41ArticuloCosto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H000J2_A17AlicuotaIvaId = new short[1] ;
      H000J2_A11RubroId = new short[1] ;
      H000J2_A7MarcaId = new short[1] ;
      H000J2_A39ArticuloId = new String[] {""} ;
      H000J3_AGRID1_nRecordCount = new long[1] ;
      AV12ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.gx00d0__default(),
         new Object[] {
             new Object[] {
            H000J2_A41ArticuloCosto, H000J2_A17AlicuotaIvaId, H000J2_A11RubroId, H000J2_A7MarcaId, H000J2_A39ArticuloId
            }
            , new Object[] {
            H000J3_AGRID1_nRecordCount
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
   private short AV7cMarcaId ;
   private short AV8cRubroId ;
   private short AV9cAlicuotaIvaId ;
   private short wbEnd ;
   private short wbStart ;
   private short A7MarcaId ;
   private short A11RubroId ;
   private short A17AlicuotaIvaId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_64_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int edtavCarticuloid_Visible ;
   private int edtavCarticuloid_Enabled ;
   private int edtavCmarcaid_Enabled ;
   private int edtavCmarcaid_Visible ;
   private int edtavCrubroid_Enabled ;
   private int edtavCrubroid_Visible ;
   private int edtavCalicuotaivaid_Enabled ;
   private int edtavCalicuotaivaid_Visible ;
   private int edtavCarticulocosto_Enabled ;
   private int edtavCarticulocosto_Visible ;
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
   private java.math.BigDecimal AV10cArticuloCosto ;
   private java.math.BigDecimal A41ArticuloCosto ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divArticuloidfiltercontainer_Class ;
   private String divMarcaidfiltercontainer_Class ;
   private String divRubroidfiltercontainer_Class ;
   private String divAlicuotaivaidfiltercontainer_Class ;
   private String divArticulocostofiltercontainer_Class ;
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
   private String divArticuloidfiltercontainer_Internalname ;
   private String lblLblarticuloidfilter_Internalname ;
   private String lblLblarticuloidfilter_Jsonclick ;
   private String edtavCarticuloid_Internalname ;
   private String TempTags ;
   private String edtavCarticuloid_Jsonclick ;
   private String divMarcaidfiltercontainer_Internalname ;
   private String lblLblmarcaidfilter_Internalname ;
   private String lblLblmarcaidfilter_Jsonclick ;
   private String edtavCmarcaid_Internalname ;
   private String edtavCmarcaid_Jsonclick ;
   private String divRubroidfiltercontainer_Internalname ;
   private String lblLblrubroidfilter_Internalname ;
   private String lblLblrubroidfilter_Jsonclick ;
   private String edtavCrubroid_Internalname ;
   private String edtavCrubroid_Jsonclick ;
   private String divAlicuotaivaidfiltercontainer_Internalname ;
   private String lblLblalicuotaivaidfilter_Internalname ;
   private String lblLblalicuotaivaidfilter_Jsonclick ;
   private String edtavCalicuotaivaid_Internalname ;
   private String edtavCalicuotaivaid_Jsonclick ;
   private String divArticulocostofiltercontainer_Internalname ;
   private String lblLblarticulocostofilter_Internalname ;
   private String lblLblarticulocostofilter_Jsonclick ;
   private String edtavCarticulocosto_Internalname ;
   private String edtavCarticulocosto_Jsonclick ;
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
   private String edtMarcaId_Internalname ;
   private String edtRubroId_Internalname ;
   private String edtAlicuotaIvaId_Internalname ;
   private String edtArticuloCosto_Internalname ;
   private String GXKey ;
   private String scmdbuf ;
   private String AV12ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_64_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtArticuloId_Jsonclick ;
   private String edtMarcaId_Jsonclick ;
   private String edtRubroId_Jsonclick ;
   private String edtAlicuotaIvaId_Jsonclick ;
   private String edtArticuloCosto_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV6cArticuloId ;
   private String AV11pArticuloId ;
   private String A39ArticuloId ;
   private String AV15Linkselection_GXI ;
   private String lV6cArticuloId ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H000J2_A41ArticuloCosto ;
   private short[] H000J2_A17AlicuotaIvaId ;
   private short[] H000J2_A11RubroId ;
   private short[] H000J2_A7MarcaId ;
   private String[] H000J2_A39ArticuloId ;
   private long[] H000J3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00d0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          short AV7cMarcaId ,
                                          short AV8cRubroId ,
                                          short AV9cAlicuotaIvaId ,
                                          java.math.BigDecimal AV10cArticuloCosto ,
                                          short A7MarcaId ,
                                          short A11RubroId ,
                                          short A17AlicuotaIvaId ,
                                          java.math.BigDecimal A41ArticuloCosto ,
                                          String A39ArticuloId ,
                                          String AV6cArticuloId )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [8] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " ArticuloCosto, AlicuotaIvaId, RubroId, MarcaId, ArticuloId" ;
      sFromString = " FROM Articulo" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (ArticuloId like ?)" ;
      if ( ! (0==AV7cMarcaId) )
      {
         sWhereString = sWhereString + " and (MarcaId >= ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cRubroId) )
      {
         sWhereString = sWhereString + " and (RubroId >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cAlicuotaIvaId) )
      {
         sWhereString = sWhereString + " and (AlicuotaIvaId >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV10cArticuloCosto)==0) )
      {
         sWhereString = sWhereString + " and (ArticuloCosto >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY ArticuloId" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000J3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          short AV7cMarcaId ,
                                          short AV8cRubroId ,
                                          short AV9cAlicuotaIvaId ,
                                          java.math.BigDecimal AV10cArticuloCosto ,
                                          short A7MarcaId ,
                                          short A11RubroId ,
                                          short A17AlicuotaIvaId ,
                                          java.math.BigDecimal A41ArticuloCosto ,
                                          String A39ArticuloId ,
                                          String AV6cArticuloId )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [5] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM Articulo" ;
      scmdbuf = scmdbuf + " WHERE (ArticuloId like ?)" ;
      if ( ! (0==AV7cMarcaId) )
      {
         sWhereString = sWhereString + " and (MarcaId >= ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cRubroId) )
      {
         sWhereString = sWhereString + " and (RubroId >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cAlicuotaIvaId) )
      {
         sWhereString = sWhereString + " and (AlicuotaIvaId >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV10cArticuloCosto)==0) )
      {
         sWhereString = sWhereString + " and (ArticuloCosto >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
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
                  return conditional_H000J2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_H000J3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000J3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
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
                  stmt.setVarchar(sIdx, (String)parms[8], 15);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 15);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[9], 2);
               }
               return;
      }
   }

}

