/*
               File: cfgcomprobante_impl
        Description: Cfg Comprobante
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:32:5.58
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

public final  class cfgcomprobante_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridcfgcomprobante_detalle") == 0 )
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
         gxnrgridcfgcomprobante_detalle_newrow( ) ;
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
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
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
      cmbCfgComprobanteSistema.setName( "CFGCOMPROBANTESISTEMA" );
      cmbCfgComprobanteSistema.setWebtags( "" );
      cmbCfgComprobanteSistema.addItem("1", "Ventas", (short)(0));
      cmbCfgComprobanteSistema.addItem("2", "Compras", (short)(0));
      cmbCfgComprobanteSistema.addItem("3", "Contable", (short)(0));
      cmbCfgComprobanteSistema.addItem("4", "Stock", (short)(0));
      if ( cmbCfgComprobanteSistema.getItemCount() > 0 )
      {
         A34CfgComprobanteSistema = (byte)(GXutil.lval( cmbCfgComprobanteSistema.getValidValue(GXutil.trim( GXutil.str( A34CfgComprobanteSistema, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34CfgComprobanteSistema", GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_2-109402", (short)(0)) ;
         Form.getMeta().addItem("description", "Cfg Comprobante", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtCfgComprobanteId_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public cfgcomprobante_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cfgcomprobante_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cfgcomprobante_impl.class ));
   }

   public cfgcomprobante_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCfgComprobanteSistema = new HTMLChoice();
      cmbCfgComprobanteDetalleLetra = new HTMLChoice();
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj = new com.kberp.rwdmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,false);
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

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! com.kberp.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Cfg Comprobante", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "BtnFirst" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.kberp.gx00b0"+"',["+"{Ctrl:gx.dom.el('"+"CFGCOMPROBANTEID"+"'), id:'"+"CFGCOMPROBANTEID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"CFGCOMPROBANTEPREFIJO"+"'), id:'"+"CFGCOMPROBANTEPREFIJO"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtCfgComprobanteId_Internalname, "Comprobante Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtCfgComprobanteId_Internalname, A31CfgComprobanteId, GXutil.rtrim( localUtil.format( A31CfgComprobanteId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCfgComprobanteId_Jsonclick, 0, "Attribute", "", "", "", 1, edtCfgComprobanteId_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "IdCfgComprobanteId", "left", "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtCfgComprobantePrefijo_Internalname, "Comprobante Prefijo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")), ((edtCfgComprobantePrefijo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A32CfgComprobantePrefijo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A32CfgComprobantePrefijo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCfgComprobantePrefijo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCfgComprobantePrefijo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "CfgComprobantePrefijo", "right", "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtCfgComprobanteNombre_Internalname, "Comprobante Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_html_textarea( httpContext, edtCfgComprobanteNombre_Internalname, A33CfgComprobanteNombre, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", (short)(0), 1, edtCfgComprobanteNombre_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "250", -1, 0, "", "", (byte)(-1), true, "NombreTablasGenerales", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, cmbCfgComprobanteSistema.getInternalname(), "Comprobante Sistema", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         /* ComboBox */
         com.kberp.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCfgComprobanteSistema, cmbCfgComprobanteSistema.getInternalname(), GXutil.trim( GXutil.str( A34CfgComprobanteSistema, 2, 0)), 1, cmbCfgComprobanteSistema.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbCfgComprobanteSistema.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, "HLP_CfgComprobante.htm");
         cmbCfgComprobanteSistema.setValue( GXutil.trim( GXutil.str( A34CfgComprobanteSistema, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteSistema.getInternalname(), "Values", cmbCfgComprobanteSistema.ToJavascriptSource());
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divDetalletable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblTitledetalle_Internalname, "Detalle", "", "", lblTitledetalle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridcfgcomprobante_detalle( ) ;
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CfgComprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      /* Execute Exit event if defined. */
   }

   public void gxdraw_gridcfgcomprobante_detalle( )
   {
      /*  Grid Control  */
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("GridName", "Gridcfgcomprobante_detalle");
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Class", "Grid");
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcfgcomprobante_detalle_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("CmpContext", "");
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("InMasterPage", "false");
      Gridcfgcomprobante_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcfgcomprobante_detalleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCfgComprobanteDetalleLetra.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddColumnProperties(Gridcfgcomprobante_detalleColumn);
      Gridcfgcomprobante_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcfgcomprobante_detalleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroDesde_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddColumnProperties(Gridcfgcomprobante_detalleColumn);
      Gridcfgcomprobante_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcfgcomprobante_detalleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A37CfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroHasta_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddColumnProperties(Gridcfgcomprobante_detalleColumn);
      Gridcfgcomprobante_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcfgcomprobante_detalleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A38CfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroUltimo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddColumnProperties(Gridcfgcomprobante_detalleColumn);
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridcfgcomprobante_detalle_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridcfgcomprobante_detalle_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridcfgcomprobante_detalle_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridcfgcomprobante_detalle_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridcfgcomprobante_detalle_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridcfgcomprobante_detalleContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridcfgcomprobante_detalle_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_54_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount12 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_12 = (short)(1) ;
            scanStart0B12( ) ;
            while ( RcdFound12 != 0 )
            {
               init_level_properties12( ) ;
               getByPrimaryKey0B12( ) ;
               addRow0B12( ) ;
               scanNext0B12( ) ;
            }
            scanEnd0B12( ) ;
            nBlankRcdCount12 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0B12( ) ;
         standaloneModal0B12( ) ;
         sMode12 = Gx_mode ;
         while ( nGXsfl_54_idx < nRC_GXsfl_54 )
         {
            readRow0B12( ) ;
            cmbCfgComprobanteDetalleLetra.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_54_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCfgComprobanteDetalleLetra.getEnabled(), 5, 0)));
            edtCfgComprobanteDetalleNroDesde_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteDetalleNroDesde_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobanteDetalleNroDesde_Enabled, 5, 0)));
            edtCfgComprobanteDetalleNroHasta_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CFGCOMPROBANTEDETALLENROHASTA_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteDetalleNroHasta_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobanteDetalleNroHasta_Enabled, 5, 0)));
            edtCfgComprobanteDetalleNroUltimo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CFGCOMPROBANTEDETALLENROULTIMO_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteDetalleNroUltimo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobanteDetalleNroUltimo_Enabled, 5, 0)));
            if ( ( nRcdExists_12 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0B12( ) ;
            }
            sendRow0B12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount12 = (short)(5) ;
         nRcdExists_12 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0B12( ) ;
            while ( RcdFound12 != 0 )
            {
               sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_5412( ) ;
               init_level_properties12( ) ;
               standaloneNotModal0B12( ) ;
               getByPrimaryKey0B12( ) ;
               standaloneModal0B12( ) ;
               addRow0B12( ) ;
               scanNext0B12( ) ;
            }
            scanEnd0B12( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode12 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx+1, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5412( ) ;
      initAll0B12( ) ;
      init_level_properties12( ) ;
      standaloneNotModal0B12( ) ;
      standaloneModal0B12( ) ;
      nRcdExists_12 = (short)(0) ;
      nIsMod_12 = (short)(0) ;
      nRcdDeleted_12 = (short)(0) ;
      nBlankRcdCount12 = (short)(nBlankRcdUsr12+nBlankRcdCount12) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount12 > 0 )
      {
         addRow0B12( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = cmbCfgComprobanteDetalleLetra.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount12 = (short)(nBlankRcdCount12-1) ;
      }
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridcfgcomprobante_detalleContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridcfgcomprobante_detalle", Gridcfgcomprobante_detalleContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "Gridcfgcomprobante_detalleContainerData", Gridcfgcomprobante_detalleContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "Gridcfgcomprobante_detalleContainerData"+"V", Gridcfgcomprobante_detalleContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcfgcomprobante_detalleContainerData"+"V"+"\" value='"+Gridcfgcomprobante_detalleContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A31CfgComprobanteId = httpContext.cgiGet( edtCfgComprobanteId_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCfgComprobantePrefijo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCfgComprobantePrefijo_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CFGCOMPROBANTEPREFIJO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCfgComprobantePrefijo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A32CfgComprobantePrefijo = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            }
            else
            {
               A32CfgComprobantePrefijo = (short)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobantePrefijo_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            }
            A33CfgComprobanteNombre = httpContext.cgiGet( edtCfgComprobanteNombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33CfgComprobanteNombre", A33CfgComprobanteNombre);
            cmbCfgComprobanteSistema.setName( cmbCfgComprobanteSistema.getInternalname() );
            cmbCfgComprobanteSistema.setValue( httpContext.cgiGet( cmbCfgComprobanteSistema.getInternalname()) );
            A34CfgComprobanteSistema = (byte)(GXutil.lval( httpContext.cgiGet( cmbCfgComprobanteSistema.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34CfgComprobanteSistema", GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
            /* Read saved values. */
            Z31CfgComprobanteId = httpContext.cgiGet( "Z31CfgComprobanteId") ;
            Z32CfgComprobantePrefijo = (short)(localUtil.ctol( httpContext.cgiGet( "Z32CfgComprobantePrefijo"), ",", ".")) ;
            Z33CfgComprobanteNombre = httpContext.cgiGet( "Z33CfgComprobanteNombre") ;
            Z34CfgComprobanteSistema = (byte)(localUtil.ctol( httpContext.cgiGet( "Z34CfgComprobanteSistema"), ",", ".")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_54 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_54"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A31CfgComprobanteId = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
               A32CfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0B11( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)));
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)));
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_first_Visible, 5, 0)));
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_previous_Visible, 5, 0)));
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_next_Visible, 5, 0)));
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_last_Visible, 5, 0)));
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_select_Visible, 5, 0)));
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)));
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_enter_Visible, 5, 0)));
      }
      disableAttributes0B11( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_0B12( )
   {
      nGXsfl_54_idx = (short)(0) ;
      while ( nGXsfl_54_idx < nRC_GXsfl_54 )
      {
         readRow0B12( ) ;
         if ( ( nRcdExists_12 != 0 ) || ( nIsMod_12 != 0 ) )
         {
            getKey0B12( ) ;
            if ( ( nRcdExists_12 == 0 ) && ( nRcdDeleted_12 == 0 ) )
            {
               if ( RcdFound12 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0B12( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0B12( ) ;
                     closeExtendedTableCursors0B12( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_54_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = cmbCfgComprobanteDetalleLetra.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound12 != 0 )
               {
                  if ( nRcdDeleted_12 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0B12( ) ;
                     load0B12( ) ;
                     beforeValidate0B12( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0B12( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_12 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0B12( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0B12( ) ;
                           closeExtendedTableCursors0B12( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_12 == 0 )
                  {
                     GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_54_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = cmbCfgComprobanteDetalleLetra.getInternalname() ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtCfgComprobanteDetalleNroDesde_Internalname, GXutil.ltrim( localUtil.ntoc( A36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCfgComprobanteDetalleNroHasta_Internalname, GXutil.ltrim( localUtil.ntoc( A37CfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCfgComprobanteDetalleNroUltimo_Internalname, GXutil.ltrim( localUtil.ntoc( A38CfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z35CfgComprobanteDetalleLetra_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z36CfgComprobanteDetalleNroDesde_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z37CfgComprobanteDetalleNroHasta_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z37CfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z38CfgComprobanteDetalleNroUltimo_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z38CfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_12_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_12, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_12_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_12, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_12_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_12, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_12 != 0 )
         {
            httpContext.changePostValue( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCfgComprobanteDetalleLetra.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroDesde_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CFGCOMPROBANTEDETALLENROHASTA_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroHasta_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CFGCOMPROBANTEDETALLENROULTIMO_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroUltimo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0B0( )
   {
   }

   public void zm0B11( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z33CfgComprobanteNombre = T000B5_A33CfgComprobanteNombre[0] ;
            Z34CfgComprobanteSistema = T000B5_A34CfgComprobanteSistema[0] ;
         }
         else
         {
            Z33CfgComprobanteNombre = A33CfgComprobanteNombre ;
            Z34CfgComprobanteSistema = A34CfgComprobanteSistema ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z31CfgComprobanteId = A31CfgComprobanteId ;
         Z32CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         Z33CfgComprobanteNombre = A33CfgComprobanteNombre ;
         Z34CfgComprobanteSistema = A34CfgComprobanteSistema ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)));
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)));
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_enter_Enabled, 5, 0)));
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_enter_Enabled, 5, 0)));
      }
   }

   public void load0B11( )
   {
      /* Using cursor T000B6 */
      pr_default.execute(4, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A33CfgComprobanteNombre = T000B6_A33CfgComprobanteNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33CfgComprobanteNombre", A33CfgComprobanteNombre);
         A34CfgComprobanteSistema = T000B6_A34CfgComprobanteSistema[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34CfgComprobanteSistema", GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
         zm0B11( -3) ;
      }
      pr_default.close(4);
      onLoadActions0B11( ) ;
   }

   public void onLoadActions0B11( )
   {
   }

   public void checkExtendedTable0B11( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( A34CfgComprobanteSistema == 1 ) || ( A34CfgComprobanteSistema == 2 ) || ( A34CfgComprobanteSistema == 3 ) || ( A34CfgComprobanteSistema == 4 ) ) )
      {
         httpContext.GX_msglist.addItem("Campo Cfg Comprobante Sistema fuera de rango", "OutOfRange", 1, "CFGCOMPROBANTESISTEMA");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCfgComprobanteSistema.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0B11( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0B11( )
   {
      /* Using cursor T000B7 */
      pr_default.execute(5, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000B5 */
      pr_default.execute(3, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm0B11( 3) ;
         RcdFound11 = (short)(1) ;
         A31CfgComprobanteId = T000B5_A31CfgComprobanteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
         A32CfgComprobantePrefijo = T000B5_A32CfgComprobantePrefijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
         A33CfgComprobanteNombre = T000B5_A33CfgComprobanteNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33CfgComprobanteNombre", A33CfgComprobanteNombre);
         A34CfgComprobanteSistema = T000B5_A34CfgComprobanteSistema[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34CfgComprobanteSistema", GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
         Z31CfgComprobanteId = A31CfgComprobanteId ;
         Z32CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0B11( ) ;
         if ( AnyError == 1 )
         {
            RcdFound11 = (short)(0) ;
            initializeNonKey0B11( ) ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey0B11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound11 = (short)(0) ;
      /* Using cursor T000B8 */
      pr_default.execute(6, new Object[] {A31CfgComprobanteId, A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000B8_A31CfgComprobanteId[0], A31CfgComprobanteId) < 0 ) || ( GXutil.strcmp(T000B8_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000B8_A32CfgComprobantePrefijo[0] < A32CfgComprobantePrefijo ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000B8_A31CfgComprobanteId[0], A31CfgComprobanteId) > 0 ) || ( GXutil.strcmp(T000B8_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000B8_A32CfgComprobantePrefijo[0] > A32CfgComprobantePrefijo ) ) )
         {
            A31CfgComprobanteId = T000B8_A31CfgComprobanteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
            A32CfgComprobantePrefijo = T000B8_A32CfgComprobantePrefijo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound11 = (short)(0) ;
      /* Using cursor T000B9 */
      pr_default.execute(7, new Object[] {A31CfgComprobanteId, A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000B9_A31CfgComprobanteId[0], A31CfgComprobanteId) > 0 ) || ( GXutil.strcmp(T000B9_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000B9_A32CfgComprobantePrefijo[0] > A32CfgComprobantePrefijo ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000B9_A31CfgComprobanteId[0], A31CfgComprobanteId) < 0 ) || ( GXutil.strcmp(T000B9_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000B9_A32CfgComprobantePrefijo[0] < A32CfgComprobantePrefijo ) ) )
         {
            A31CfgComprobanteId = T000B9_A31CfgComprobanteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
            A32CfgComprobantePrefijo = T000B9_A32CfgComprobantePrefijo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0B11( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtCfgComprobanteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0B11( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound11 == 1 )
         {
            if ( ( GXutil.strcmp(A31CfgComprobanteId, Z31CfgComprobanteId) != 0 ) || ( A32CfgComprobantePrefijo != Z32CfgComprobantePrefijo ) )
            {
               A31CfgComprobanteId = Z31CfgComprobanteId ;
               httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
               A32CfgComprobantePrefijo = Z32CfgComprobantePrefijo ;
               httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CFGCOMPROBANTEID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCfgComprobanteId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCfgComprobanteId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0B11( ) ;
               GX_FocusControl = edtCfgComprobanteId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A31CfgComprobanteId, Z31CfgComprobanteId) != 0 ) || ( A32CfgComprobantePrefijo != Z32CfgComprobantePrefijo ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCfgComprobanteId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0B11( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CFGCOMPROBANTEID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCfgComprobanteId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtCfgComprobanteId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0B11( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A31CfgComprobanteId, Z31CfgComprobanteId) != 0 ) || ( A32CfgComprobantePrefijo != Z32CfgComprobantePrefijo ) )
      {
         A31CfgComprobanteId = Z31CfgComprobanteId ;
         httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
         A32CfgComprobantePrefijo = Z32CfgComprobantePrefijo ;
         httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CFGCOMPROBANTEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCfgComprobanteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCfgComprobanteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "CFGCOMPROBANTEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCfgComprobanteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCfgComprobanteNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCfgComprobanteNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0B11( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_previous( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCfgComprobanteNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_next( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCfgComprobanteNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound11 != 0 )
         {
            scanNext0B11( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCfgComprobanteNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0B11( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0B11( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000B4 */
         pr_default.execute(2, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"CfgComprobante"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z33CfgComprobanteNombre, T000B4_A33CfgComprobanteNombre[0]) != 0 ) || ( Z34CfgComprobanteSistema != T000B4_A34CfgComprobanteSistema[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"CfgComprobante"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0B11( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0B11( 0) ;
         checkOptimisticConcurrency0B11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B11( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0B11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B10 */
                  pr_default.execute(8, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), A33CfgComprobanteNombre, new Byte(A34CfgComprobanteSistema)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("CfgComprobante") ;
                  if ( (pr_default.getStatus(8) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0B11( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption0B0( ) ;
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load0B11( ) ;
         }
         endLevel0B11( ) ;
      }
      closeExtendedTableCursors0B11( ) ;
   }

   public void update0B11( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B11( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0B11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B11 */
                  pr_default.execute(9, new Object[] {A33CfgComprobanteNombre, new Byte(A34CfgComprobanteSistema), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("CfgComprobante") ;
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"CfgComprobante"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0B11( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0B11( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                           resetCaption0B0( ) ;
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel0B11( ) ;
      }
      closeExtendedTableCursors0B11( ) ;
   }

   public void deferredUpdate0B11( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0B11( ) ;
         afterConfirm0B11( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0B11( ) ;
            if ( AnyError == 0 )
            {
               scanStart0B12( ) ;
               while ( RcdFound12 != 0 )
               {
                  getByPrimaryKey0B12( ) ;
                  delete0B12( ) ;
                  scanNext0B12( ) ;
               }
               scanEnd0B12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B12 */
                  pr_default.execute(10, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("CfgComprobante") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound11 == 0 )
                        {
                           initAll0B11( ) ;
                           Gx_mode = "INS" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        else
                        {
                           getByPrimaryKey( ) ;
                           Gx_mode = "UPD" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), "SuccessfullyDeleted", 0, "", true);
                        resetCaption0B0( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
      }
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0B11( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0B11( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000B13 */
         pr_default.execute(11, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Comprobante"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void processNestedLevel0B12( )
   {
      nGXsfl_54_idx = (short)(0) ;
      while ( nGXsfl_54_idx < nRC_GXsfl_54 )
      {
         readRow0B12( ) ;
         if ( ( nRcdExists_12 != 0 ) || ( nIsMod_12 != 0 ) )
         {
            standaloneNotModal0B12( ) ;
            getKey0B12( ) ;
            if ( ( nRcdExists_12 == 0 ) && ( nRcdDeleted_12 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0B12( ) ;
            }
            else
            {
               if ( RcdFound12 != 0 )
               {
                  if ( ( nRcdDeleted_12 != 0 ) && ( nRcdExists_12 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0B12( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_12 != 0 ) && ( nRcdExists_12 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0B12( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_12 == 0 )
                  {
                     GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_54_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = cmbCfgComprobanteDetalleLetra.getInternalname() ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( localUtil.ntoc( A35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtCfgComprobanteDetalleNroDesde_Internalname, GXutil.ltrim( localUtil.ntoc( A36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCfgComprobanteDetalleNroHasta_Internalname, GXutil.ltrim( localUtil.ntoc( A37CfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCfgComprobanteDetalleNroUltimo_Internalname, GXutil.ltrim( localUtil.ntoc( A38CfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z35CfgComprobanteDetalleLetra_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z36CfgComprobanteDetalleNroDesde_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z37CfgComprobanteDetalleNroHasta_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z37CfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z38CfgComprobanteDetalleNroUltimo_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z38CfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_12_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_12, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_12_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_12, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_12_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_12, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_12 != 0 )
         {
            httpContext.changePostValue( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCfgComprobanteDetalleLetra.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroDesde_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CFGCOMPROBANTEDETALLENROHASTA_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroHasta_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CFGCOMPROBANTEDETALLENROULTIMO_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroUltimo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0B12( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_12 = (short)(0) ;
      nIsMod_12 = (short)(0) ;
      nRcdDeleted_12 = (short)(0) ;
   }

   public void processLevel0B11( )
   {
      /* Save parent mode. */
      sMode11 = Gx_mode ;
      processNestedLevel0B12( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel0B11( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "cfgcomprobante");
         if ( AnyError == 0 )
         {
            confirmValues0B0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "cfgcomprobante");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0B11( )
   {
      /* Using cursor T000B14 */
      pr_default.execute(12);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A31CfgComprobanteId = T000B14_A31CfgComprobanteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
         A32CfgComprobantePrefijo = T000B14_A32CfgComprobantePrefijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0B11( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A31CfgComprobanteId = T000B14_A31CfgComprobanteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
         A32CfgComprobantePrefijo = T000B14_A32CfgComprobantePrefijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
      }
   }

   public void scanEnd0B11( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0B11( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0B11( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0B11( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0B11( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0B11( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0B11( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0B11( )
   {
      edtCfgComprobanteId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobanteId_Enabled, 5, 0)));
      edtCfgComprobantePrefijo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobantePrefijo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobantePrefijo_Enabled, 5, 0)));
      edtCfgComprobanteNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobanteNombre_Enabled, 5, 0)));
      cmbCfgComprobanteSistema.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteSistema.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCfgComprobanteSistema.getEnabled(), 5, 0)));
   }

   public void zm0B12( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z36CfgComprobanteDetalleNroDesde = T000B3_A36CfgComprobanteDetalleNroDesde[0] ;
            Z37CfgComprobanteDetalleNroHasta = T000B3_A37CfgComprobanteDetalleNroHasta[0] ;
            Z38CfgComprobanteDetalleNroUltimo = T000B3_A38CfgComprobanteDetalleNroUltimo[0] ;
         }
         else
         {
            Z36CfgComprobanteDetalleNroDesde = A36CfgComprobanteDetalleNroDesde ;
            Z37CfgComprobanteDetalleNroHasta = A37CfgComprobanteDetalleNroHasta ;
            Z38CfgComprobanteDetalleNroUltimo = A38CfgComprobanteDetalleNroUltimo ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z31CfgComprobanteId = A31CfgComprobanteId ;
         Z32CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         Z35CfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
         Z36CfgComprobanteDetalleNroDesde = A36CfgComprobanteDetalleNroDesde ;
         Z37CfgComprobanteDetalleNroHasta = A37CfgComprobanteDetalleNroHasta ;
         Z38CfgComprobanteDetalleNroUltimo = A38CfgComprobanteDetalleNroUltimo ;
      }
   }

   public void standaloneNotModal0B12( )
   {
   }

   public void standaloneModal0B12( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         cmbCfgComprobanteDetalleLetra.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCfgComprobanteDetalleLetra.getEnabled(), 5, 0)));
      }
      else
      {
         cmbCfgComprobanteDetalleLetra.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCfgComprobanteDetalleLetra.getEnabled(), 5, 0)));
      }
   }

   public void load0B12( )
   {
      /* Using cursor T000B15 */
      pr_default.execute(13, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A36CfgComprobanteDetalleNroDesde = T000B15_A36CfgComprobanteDetalleNroDesde[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroDesde_Internalname, GXutil.ltrim( GXutil.str( A36CfgComprobanteDetalleNroDesde, 8, 0)));
         A37CfgComprobanteDetalleNroHasta = T000B15_A37CfgComprobanteDetalleNroHasta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroHasta_Internalname, GXutil.ltrim( GXutil.str( A37CfgComprobanteDetalleNroHasta, 8, 0)));
         A38CfgComprobanteDetalleNroUltimo = T000B15_A38CfgComprobanteDetalleNroUltimo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroUltimo_Internalname, GXutil.ltrim( GXutil.str( A38CfgComprobanteDetalleNroUltimo, 8, 0)));
         zm0B12( -4) ;
      }
      pr_default.close(13);
      onLoadActions0B12( ) ;
   }

   public void onLoadActions0B12( )
   {
   }

   public void checkExtendedTable0B12( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0B12( ) ;
      if ( ! ( ( A35CfgComprobanteDetalleLetra == 1 ) || ( A35CfgComprobanteDetalleLetra == 2 ) || ( A35CfgComprobanteDetalleLetra == 3 ) || ( A35CfgComprobanteDetalleLetra == 4 ) || ( A35CfgComprobanteDetalleLetra == 5 ) || ( A35CfgComprobanteDetalleLetra == 6 ) || ( A35CfgComprobanteDetalleLetra == 7 ) ) )
      {
         GXCCtl = "CFGCOMPROBANTEDETALLELETRA_" + sGXsfl_54_idx ;
         httpContext.GX_msglist.addItem("Campo Cfg Comprobante Detalle Letra fuera de rango", "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCfgComprobanteDetalleLetra.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0B12( )
   {
   }

   public void enableDisable0B12( )
   {
   }

   public void getKey0B12( )
   {
      /* Using cursor T000B16 */
      pr_default.execute(14, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey0B12( )
   {
      /* Using cursor T000B3 */
      pr_default.execute(1, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0B12( 4) ;
         RcdFound12 = (short)(1) ;
         initializeNonKey0B12( ) ;
         A35CfgComprobanteDetalleLetra = T000B3_A35CfgComprobanteDetalleLetra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
         A36CfgComprobanteDetalleNroDesde = T000B3_A36CfgComprobanteDetalleNroDesde[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroDesde_Internalname, GXutil.ltrim( GXutil.str( A36CfgComprobanteDetalleNroDesde, 8, 0)));
         A37CfgComprobanteDetalleNroHasta = T000B3_A37CfgComprobanteDetalleNroHasta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroHasta_Internalname, GXutil.ltrim( GXutil.str( A37CfgComprobanteDetalleNroHasta, 8, 0)));
         A38CfgComprobanteDetalleNroUltimo = T000B3_A38CfgComprobanteDetalleNroUltimo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroUltimo_Internalname, GXutil.ltrim( GXutil.str( A38CfgComprobanteDetalleNroUltimo, 8, 0)));
         Z31CfgComprobanteId = A31CfgComprobanteId ;
         Z32CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         Z35CfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0B12( ) ;
         load0B12( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey0B12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0B12( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0B12( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0B12( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000B2 */
         pr_default.execute(0, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"CfgComprobanteDetalle"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z36CfgComprobanteDetalleNroDesde != T000B2_A36CfgComprobanteDetalleNroDesde[0] ) || ( Z37CfgComprobanteDetalleNroHasta != T000B2_A37CfgComprobanteDetalleNroHasta[0] ) || ( Z38CfgComprobanteDetalleNroUltimo != T000B2_A38CfgComprobanteDetalleNroUltimo[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"CfgComprobanteDetalle"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0B12( )
   {
      beforeValidate0B12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0B12( 0) ;
         checkOptimisticConcurrency0B12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0B12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B17 */
                  pr_default.execute(15, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra), new Integer(A36CfgComprobanteDetalleNroDesde), new Integer(A37CfgComprobanteDetalleNroHasta), new Integer(A38CfgComprobanteDetalleNroUltimo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("CfgComprobanteDetalle") ;
                  if ( (pr_default.getStatus(15) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load0B12( ) ;
         }
         endLevel0B12( ) ;
      }
      closeExtendedTableCursors0B12( ) ;
   }

   public void update0B12( )
   {
      beforeValidate0B12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0B12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B18 */
                  pr_default.execute(16, new Object[] {new Integer(A36CfgComprobanteDetalleNroDesde), new Integer(A37CfgComprobanteDetalleNroHasta), new Integer(A38CfgComprobanteDetalleNroUltimo), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("CfgComprobanteDetalle") ;
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"CfgComprobanteDetalle"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0B12( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0B12( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel0B12( ) ;
      }
      closeExtendedTableCursors0B12( ) ;
   }

   public void deferredUpdate0B12( )
   {
   }

   public void delete0B12( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0B12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0B12( ) ;
         afterConfirm0B12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0B12( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000B19 */
               pr_default.execute(17, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("CfgComprobanteDetalle") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0B12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0B12( )
   {
      standaloneModal0B12( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000B20 */
         pr_default.execute(18, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Comprobante"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevel0B12( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0B12( )
   {
      /* Scan By routine */
      /* Using cursor T000B21 */
      pr_default.execute(19, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo)});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A35CfgComprobanteDetalleLetra = T000B21_A35CfgComprobanteDetalleLetra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0B12( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A35CfgComprobanteDetalleLetra = T000B21_A35CfgComprobanteDetalleLetra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
      }
   }

   public void scanEnd0B12( )
   {
      pr_default.close(19);
   }

   public void afterConfirm0B12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0B12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0B12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0B12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0B12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0B12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0B12( )
   {
      cmbCfgComprobanteDetalleLetra.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCfgComprobanteDetalleLetra.getEnabled(), 5, 0)));
      edtCfgComprobanteDetalleNroDesde_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteDetalleNroDesde_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobanteDetalleNroDesde_Enabled, 5, 0)));
      edtCfgComprobanteDetalleNroHasta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteDetalleNroHasta_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobanteDetalleNroHasta_Enabled, 5, 0)));
      edtCfgComprobanteDetalleNroUltimo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteDetalleNroUltimo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobanteDetalleNroUltimo_Enabled, 5, 0)));
   }

   public void subsflControlProps_5412( )
   {
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_54_idx );
      edtCfgComprobanteDetalleNroDesde_Internalname = "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_54_idx ;
      edtCfgComprobanteDetalleNroHasta_Internalname = "CFGCOMPROBANTEDETALLENROHASTA_"+sGXsfl_54_idx ;
      edtCfgComprobanteDetalleNroUltimo_Internalname = "CFGCOMPROBANTEDETALLENROULTIMO_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_5412( )
   {
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_54_fel_idx );
      edtCfgComprobanteDetalleNroDesde_Internalname = "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_54_fel_idx ;
      edtCfgComprobanteDetalleNroHasta_Internalname = "CFGCOMPROBANTEDETALLENROHASTA_"+sGXsfl_54_fel_idx ;
      edtCfgComprobanteDetalleNroUltimo_Internalname = "CFGCOMPROBANTEDETALLENROULTIMO_"+sGXsfl_54_fel_idx ;
   }

   public void addRow0B12( )
   {
      nGXsfl_54_idx = (short)(nGXsfl_54_idx+1) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5412( ) ;
      sendRow0B12( ) ;
   }

   public void sendRow0B12( )
   {
      Gridcfgcomprobante_detalleRow = GXWebRow.GetNew(context) ;
      if ( subGridcfgcomprobante_detalle_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridcfgcomprobante_detalle_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridcfgcomprobante_detalle_Class, "") != 0 )
         {
            subGridcfgcomprobante_detalle_Linesclass = subGridcfgcomprobante_detalle_Class+"Odd" ;
         }
      }
      else if ( subGridcfgcomprobante_detalle_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridcfgcomprobante_detalle_Backstyle = (byte)(0) ;
         subGridcfgcomprobante_detalle_Backcolor = subGridcfgcomprobante_detalle_Allbackcolor ;
         if ( GXutil.strcmp(subGridcfgcomprobante_detalle_Class, "") != 0 )
         {
            subGridcfgcomprobante_detalle_Linesclass = subGridcfgcomprobante_detalle_Class+"Uniform" ;
         }
      }
      else if ( subGridcfgcomprobante_detalle_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridcfgcomprobante_detalle_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridcfgcomprobante_detalle_Class, "") != 0 )
         {
            subGridcfgcomprobante_detalle_Linesclass = subGridcfgcomprobante_detalle_Class+"Odd" ;
         }
         subGridcfgcomprobante_detalle_Backcolor = (int)(0x0) ;
      }
      else if ( subGridcfgcomprobante_detalle_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridcfgcomprobante_detalle_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
         {
            subGridcfgcomprobante_detalle_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridcfgcomprobante_detalle_Class, "") != 0 )
            {
               subGridcfgcomprobante_detalle_Linesclass = subGridcfgcomprobante_detalle_Class+"Even" ;
            }
         }
         else
         {
            subGridcfgcomprobante_detalle_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridcfgcomprobante_detalle_Class, "") != 0 )
            {
               subGridcfgcomprobante_detalle_Linesclass = subGridcfgcomprobante_detalle_Class+"Odd" ;
            }
         }
      }
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.kberp.gx00c2"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CFGCOMPROBANTEID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"CFGCOMPROBANTEID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CFGCOMPROBANTEPREFIJO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"CFGCOMPROBANTEPREFIJO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CFGCOMPROBANTEDETALLELETRA_"',3),t(+,5),t(sGXsfl_54_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"CFGCOMPROBANTEDETALLELETRA_"',3),t(+,5),t(sGXsfl_54_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_12_"',3),t(+,5),t(sGXsfl_54_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_31_32,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_12_" + sGXsfl_54_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_54_idx + "',54)\"" ;
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
      /* ComboBox */
      Gridcfgcomprobante_detalleRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCfgComprobanteDetalleLetra,cmbCfgComprobanteDetalleLetra.getInternalname(),GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)),new Integer(1),cmbCfgComprobanteDetalleLetra.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",new Integer(-1),new Integer(cmbCfgComprobanteDetalleLetra.getEnabled()),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","",new Boolean(true)});
      cmbCfgComprobanteDetalleLetra.setValue( GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Values", cmbCfgComprobanteDetalleLetra.ToJavascriptSource());
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_12_" + sGXsfl_54_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_54_idx + "',54)\"" ;
      ROClassString = "Attribute" ;
      Gridcfgcomprobante_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteDetalleNroDesde_Internalname,GXutil.ltrim( localUtil.ntoc( A36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", "")),((edtCfgComprobanteDetalleNroDesde_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A36CfgComprobanteDetalleNroDesde), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A36CfgComprobanteDetalleNroDesde), "ZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobanteDetalleNroDesde_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtCfgComprobanteDetalleNroDesde_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobanteNumero","right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_12_" + sGXsfl_54_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_54_idx + "',54)\"" ;
      ROClassString = "Attribute" ;
      Gridcfgcomprobante_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteDetalleNroHasta_Internalname,GXutil.ltrim( localUtil.ntoc( A37CfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", "")),((edtCfgComprobanteDetalleNroHasta_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A37CfgComprobanteDetalleNroHasta), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A37CfgComprobanteDetalleNroHasta), "ZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobanteDetalleNroHasta_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtCfgComprobanteDetalleNroHasta_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobanteNumero","right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_12_" + sGXsfl_54_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_54_idx + "',54)\"" ;
      ROClassString = "Attribute" ;
      Gridcfgcomprobante_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCfgComprobanteDetalleNroUltimo_Internalname,GXutil.ltrim( localUtil.ntoc( A38CfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", "")),((edtCfgComprobanteDetalleNroUltimo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A38CfgComprobanteDetalleNroUltimo), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A38CfgComprobanteDetalleNroUltimo), "ZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCfgComprobanteDetalleNroUltimo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtCfgComprobanteDetalleNroUltimo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"CfgComprobanteNumero","right"});
      httpContext.ajax_sending_grid_row(Gridcfgcomprobante_detalleRow);
      GXCCtl = "Z35CfgComprobanteDetalleLetra_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      GXCCtl = "Z36CfgComprobanteDetalleNroDesde_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z36CfgComprobanteDetalleNroDesde, (byte)(8), (byte)(0), ",", "")));
      GXCCtl = "Z37CfgComprobanteDetalleNroHasta_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z37CfgComprobanteDetalleNroHasta, (byte)(8), (byte)(0), ",", "")));
      GXCCtl = "Z38CfgComprobanteDetalleNroUltimo_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z38CfgComprobanteDetalleNroUltimo, (byte)(8), (byte)(0), ",", "")));
      GXCCtl = "nRcdDeleted_12_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_12, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_12_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_12, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_12_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_12, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCfgComprobanteDetalleLetra.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroDesde_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEDETALLENROHASTA_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroHasta_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CFGCOMPROBANTEDETALLENROULTIMO_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCfgComprobanteDetalleNroUltimo_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridcfgcomprobante_detalleContainer.AddRow(Gridcfgcomprobante_detalleRow);
   }

   public void readRow0B12( )
   {
      nGXsfl_54_idx = (short)(nGXsfl_54_idx+1) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5412( ) ;
      cmbCfgComprobanteDetalleLetra.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CFGCOMPROBANTEDETALLELETRA_"+sGXsfl_54_idx+"Enabled"), ",", ".")) );
      edtCfgComprobanteDetalleNroDesde_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CFGCOMPROBANTEDETALLENRODESDE_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
      edtCfgComprobanteDetalleNroHasta_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CFGCOMPROBANTEDETALLENROHASTA_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
      edtCfgComprobanteDetalleNroUltimo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CFGCOMPROBANTEDETALLENROULTIMO_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
      cmbCfgComprobanteDetalleLetra.setName( cmbCfgComprobanteDetalleLetra.getInternalname() );
      cmbCfgComprobanteDetalleLetra.setValue( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()) );
      A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroDesde_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroDesde_Internalname), ",", ".") > 99999999 ) ) )
      {
         GXCCtl = "CFGCOMPROBANTEDETALLENRODESDE_" + sGXsfl_54_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCfgComprobanteDetalleNroDesde_Internalname ;
         wbErr = true ;
         A36CfgComprobanteDetalleNroDesde = 0 ;
      }
      else
      {
         A36CfgComprobanteDetalleNroDesde = (int)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroDesde_Internalname), ",", ".")) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroHasta_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroHasta_Internalname), ",", ".") > 99999999 ) ) )
      {
         GXCCtl = "CFGCOMPROBANTEDETALLENROHASTA_" + sGXsfl_54_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCfgComprobanteDetalleNroHasta_Internalname ;
         wbErr = true ;
         A37CfgComprobanteDetalleNroHasta = 0 ;
      }
      else
      {
         A37CfgComprobanteDetalleNroHasta = (int)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroHasta_Internalname), ",", ".")) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroUltimo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroUltimo_Internalname), ",", ".") > 99999999 ) ) )
      {
         GXCCtl = "CFGCOMPROBANTEDETALLENROULTIMO_" + sGXsfl_54_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCfgComprobanteDetalleNroUltimo_Internalname ;
         wbErr = true ;
         A38CfgComprobanteDetalleNroUltimo = 0 ;
      }
      else
      {
         A38CfgComprobanteDetalleNroUltimo = (int)(localUtil.ctol( httpContext.cgiGet( edtCfgComprobanteDetalleNroUltimo_Internalname), ",", ".")) ;
      }
      GXCCtl = "Z35CfgComprobanteDetalleLetra_" + sGXsfl_54_idx ;
      Z35CfgComprobanteDetalleLetra = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z36CfgComprobanteDetalleNroDesde_" + sGXsfl_54_idx ;
      Z36CfgComprobanteDetalleNroDesde = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z37CfgComprobanteDetalleNroHasta_" + sGXsfl_54_idx ;
      Z37CfgComprobanteDetalleNroHasta = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z38CfgComprobanteDetalleNroUltimo_" + sGXsfl_54_idx ;
      Z38CfgComprobanteDetalleNroUltimo = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdDeleted_12_" + sGXsfl_54_idx ;
      nRcdDeleted_12 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_12_" + sGXsfl_54_idx ;
      nRcdExists_12 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_12_" + sGXsfl_54_idx ;
      nIsMod_12 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defcmbCfgComprobanteDetalleLetra_Enabled = cmbCfgComprobanteDetalleLetra.getEnabled() ;
   }

   public void confirmValues0B0( )
   {
      nGXsfl_54_idx = (short)(0) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5412( ) ;
      while ( nGXsfl_54_idx < nRC_GXsfl_54 )
      {
         nGXsfl_54_idx = (short)(nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_5412( ) ;
         httpContext.changePostValue( "Z35CfgComprobanteDetalleLetra_"+sGXsfl_54_idx, httpContext.cgiGet( "ZT_"+"Z35CfgComprobanteDetalleLetra_"+sGXsfl_54_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z35CfgComprobanteDetalleLetra_"+sGXsfl_54_idx) ;
         httpContext.changePostValue( "Z36CfgComprobanteDetalleNroDesde_"+sGXsfl_54_idx, httpContext.cgiGet( "ZT_"+"Z36CfgComprobanteDetalleNroDesde_"+sGXsfl_54_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z36CfgComprobanteDetalleNroDesde_"+sGXsfl_54_idx) ;
         httpContext.changePostValue( "Z37CfgComprobanteDetalleNroHasta_"+sGXsfl_54_idx, httpContext.cgiGet( "ZT_"+"Z37CfgComprobanteDetalleNroHasta_"+sGXsfl_54_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z37CfgComprobanteDetalleNroHasta_"+sGXsfl_54_idx) ;
         httpContext.changePostValue( "Z38CfgComprobanteDetalleNroUltimo_"+sGXsfl_54_idx, httpContext.cgiGet( "ZT_"+"Z38CfgComprobanteDetalleNroUltimo_"+sGXsfl_54_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z38CfgComprobanteDetalleNroUltimo_"+sGXsfl_54_idx) ;
      }
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
      MasterPageObj.master_styles();
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("gxcfg.js", "?20172191732917");
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
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.cfgcomprobante") +"\">") ;
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
      /* Send saved values. */
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z31CfgComprobanteId", Z31CfgComprobanteId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z32CfgComprobantePrefijo", GXutil.ltrim( localUtil.ntoc( Z32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z33CfgComprobanteNombre", Z33CfgComprobanteNombre);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z34CfgComprobanteSistema", GXutil.ltrim( localUtil.ntoc( Z34CfgComprobanteSistema, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nGXsfl_54_idx, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
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

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      com.kberp.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
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
      return formatLink("com.kberp.cfgcomprobante")  ;
   }

   public String getPgmname( )
   {
      return "CfgComprobante" ;
   }

   public String getPgmdesc( )
   {
      return "Cfg Comprobante" ;
   }

   public void initializeNonKey0B11( )
   {
      A33CfgComprobanteNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A33CfgComprobanteNombre", A33CfgComprobanteNombre);
      A34CfgComprobanteSistema = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A34CfgComprobanteSistema", GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
      Z33CfgComprobanteNombre = "" ;
      Z34CfgComprobanteSistema = (byte)(0) ;
   }

   public void initAll0B11( )
   {
      A31CfgComprobanteId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
      A32CfgComprobantePrefijo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
      initializeNonKey0B11( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0B12( )
   {
      A36CfgComprobanteDetalleNroDesde = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroDesde_Internalname, GXutil.ltrim( GXutil.str( A36CfgComprobanteDetalleNroDesde, 8, 0)));
      A37CfgComprobanteDetalleNroHasta = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroHasta_Internalname, GXutil.ltrim( GXutil.str( A37CfgComprobanteDetalleNroHasta, 8, 0)));
      A38CfgComprobanteDetalleNroUltimo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, edtCfgComprobanteDetalleNroUltimo_Internalname, GXutil.ltrim( GXutil.str( A38CfgComprobanteDetalleNroUltimo, 8, 0)));
      Z36CfgComprobanteDetalleNroDesde = 0 ;
      Z37CfgComprobanteDetalleNroHasta = 0 ;
      Z38CfgComprobanteDetalleNroUltimo = 0 ;
   }

   public void initAll0B12( )
   {
      A35CfgComprobanteDetalleLetra = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
      initializeNonKey0B12( ) ;
   }

   public void standaloneModalInsert0B12( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1731551");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20172191732928");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("cfgcomprobante.js", "?20172191732928");
      /* End function include_jscripts */
   }

   public void init_level_properties12( )
   {
      cmbCfgComprobanteDetalleLetra.setEnabled( defcmbCfgComprobanteDetalleLetra_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCfgComprobanteDetalleLetra.getEnabled(), 5, 0)));
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID" ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO" ;
      edtCfgComprobanteNombre_Internalname = "CFGCOMPROBANTENOMBRE" ;
      cmbCfgComprobanteSistema.setInternalname( "CFGCOMPROBANTESISTEMA" );
      lblTitledetalle_Internalname = "TITLEDETALLE" ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA" );
      edtCfgComprobanteDetalleNroDesde_Internalname = "CFGCOMPROBANTEDETALLENRODESDE" ;
      edtCfgComprobanteDetalleNroHasta_Internalname = "CFGCOMPROBANTEDETALLENROHASTA" ;
      edtCfgComprobanteDetalleNroUltimo_Internalname = "CFGCOMPROBANTEDETALLENROULTIMO" ;
      divDetalletable_Internalname = "DETALLETABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridcfgcomprobante_detalle_Internalname = "GRIDCFGCOMPROBANTE_DETALLE" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Cfg Comprobante" );
      edtCfgComprobanteDetalleNroUltimo_Jsonclick = "" ;
      edtCfgComprobanteDetalleNroHasta_Jsonclick = "" ;
      edtCfgComprobanteDetalleNroDesde_Jsonclick = "" ;
      cmbCfgComprobanteDetalleLetra.setJsonclick( "" );
      subGridcfgcomprobante_detalle_Class = "Grid" ;
      subGridcfgcomprobante_detalle_Backcolorstyle = (byte)(0) ;
      subGridcfgcomprobante_detalle_Allowcollapsing = (byte)(0) ;
      subGridcfgcomprobante_detalle_Allowselection = (byte)(0) ;
      edtCfgComprobanteDetalleNroUltimo_Enabled = 1 ;
      edtCfgComprobanteDetalleNroHasta_Enabled = 1 ;
      edtCfgComprobanteDetalleNroDesde_Enabled = 1 ;
      cmbCfgComprobanteDetalleLetra.setEnabled( 1 );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbCfgComprobanteSistema.setJsonclick( "" );
      cmbCfgComprobanteSistema.setEnabled( 1 );
      edtCfgComprobanteNombre_Enabled = 1 ;
      edtCfgComprobantePrefijo_Jsonclick = "" ;
      edtCfgComprobantePrefijo_Enabled = 1 ;
      edtCfgComprobanteId_Jsonclick = "" ;
      edtCfgComprobanteId_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridcfgcomprobante_detalle_newrow( )
   {
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_5412( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0B12( ) ;
         standaloneModal0B12( ) ;
         cmbCfgComprobanteSistema.setName( "CFGCOMPROBANTESISTEMA" );
         cmbCfgComprobanteSistema.setWebtags( "" );
         cmbCfgComprobanteSistema.addItem("1", "Ventas", (short)(0));
         cmbCfgComprobanteSistema.addItem("2", "Compras", (short)(0));
         cmbCfgComprobanteSistema.addItem("3", "Contable", (short)(0));
         cmbCfgComprobanteSistema.addItem("4", "Stock", (short)(0));
         if ( cmbCfgComprobanteSistema.getItemCount() > 0 )
         {
            A34CfgComprobanteSistema = (byte)(GXutil.lval( cmbCfgComprobanteSistema.getValidValue(GXutil.trim( GXutil.str( A34CfgComprobanteSistema, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34CfgComprobanteSistema", GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)));
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
         dynload_actions( ) ;
         sendRow0B12( ) ;
         nGXsfl_54_idx = (short)(nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_5412( ) ;
      }
      httpContext.GX_webresponse.addString(Gridcfgcomprobante_detalleContainer.ToJavascriptSource());
      /* End function gxnrGridcfgcomprobante_detalle_newrow */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtCfgComprobanteNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Cfgcomprobanteprefijo( String GX_Parm1 ,
                                            short GX_Parm2 ,
                                            String GX_Parm3 ,
                                            com.genexus.webpanels.HTMLChoice GX_Parm4 )
   {
      A31CfgComprobanteId = GX_Parm1 ;
      A32CfgComprobantePrefijo = GX_Parm2 ;
      A33CfgComprobanteNombre = GX_Parm3 ;
      cmbCfgComprobanteSistema = GX_Parm4 ;
      A34CfgComprobanteSistema = (byte)(GXutil.lval( cmbCfgComprobanteSistema.getValue())) ;
      cmbCfgComprobanteSistema.setValue( GXutil.ltrim( GXutil.str( A34CfgComprobanteSistema, 2, 0)) );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A33CfgComprobanteNombre);
      cmbCfgComprobanteSistema.setValue( GXutil.trim( GXutil.str( A34CfgComprobanteSistema, 2, 0)) );
      isValidOutput.add(cmbCfgComprobanteSistema);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(Z31CfgComprobanteId);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(Z33CfgComprobanteNombre);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z34CfgComprobanteSistema, (byte)(2), (byte)(0), ",", "")));
      isValidOutput.add(Gridcfgcomprobante_detalleContainer);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
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
      sPrefix = "" ;
      Z31CfgComprobanteId = "" ;
      Z33CfgComprobanteNombre = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      GXCCtl = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A31CfgComprobanteId = "" ;
      A33CfgComprobanteNombre = "" ;
      lblTitledetalle_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridcfgcomprobante_detalleContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridcfgcomprobante_detalleColumn = new com.genexus.webpanels.GXWebColumn();
      Gx_mode = "" ;
      sMode12 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T000B6_A31CfgComprobanteId = new String[] {""} ;
      T000B6_A32CfgComprobantePrefijo = new short[1] ;
      T000B6_A33CfgComprobanteNombre = new String[] {""} ;
      T000B6_A34CfgComprobanteSistema = new byte[1] ;
      T000B7_A31CfgComprobanteId = new String[] {""} ;
      T000B7_A32CfgComprobantePrefijo = new short[1] ;
      T000B5_A31CfgComprobanteId = new String[] {""} ;
      T000B5_A32CfgComprobantePrefijo = new short[1] ;
      T000B5_A33CfgComprobanteNombre = new String[] {""} ;
      T000B5_A34CfgComprobanteSistema = new byte[1] ;
      sMode11 = "" ;
      T000B8_A31CfgComprobanteId = new String[] {""} ;
      T000B8_A32CfgComprobantePrefijo = new short[1] ;
      T000B9_A31CfgComprobanteId = new String[] {""} ;
      T000B9_A32CfgComprobantePrefijo = new short[1] ;
      T000B4_A31CfgComprobanteId = new String[] {""} ;
      T000B4_A32CfgComprobantePrefijo = new short[1] ;
      T000B4_A33CfgComprobanteNombre = new String[] {""} ;
      T000B4_A34CfgComprobanteSistema = new byte[1] ;
      T000B13_A42EmpresaId = new int[1] ;
      T000B13_A81EntidadId = new int[1] ;
      T000B13_A31CfgComprobanteId = new String[] {""} ;
      T000B13_A32CfgComprobantePrefijo = new short[1] ;
      T000B13_A55ComprobanteNumero = new int[1] ;
      T000B13_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000B14_A31CfgComprobanteId = new String[] {""} ;
      T000B14_A32CfgComprobantePrefijo = new short[1] ;
      T000B15_A31CfgComprobanteId = new String[] {""} ;
      T000B15_A32CfgComprobantePrefijo = new short[1] ;
      T000B15_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000B15_A36CfgComprobanteDetalleNroDesde = new int[1] ;
      T000B15_A37CfgComprobanteDetalleNroHasta = new int[1] ;
      T000B15_A38CfgComprobanteDetalleNroUltimo = new int[1] ;
      T000B16_A31CfgComprobanteId = new String[] {""} ;
      T000B16_A32CfgComprobantePrefijo = new short[1] ;
      T000B16_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000B3_A31CfgComprobanteId = new String[] {""} ;
      T000B3_A32CfgComprobantePrefijo = new short[1] ;
      T000B3_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000B3_A36CfgComprobanteDetalleNroDesde = new int[1] ;
      T000B3_A37CfgComprobanteDetalleNroHasta = new int[1] ;
      T000B3_A38CfgComprobanteDetalleNroUltimo = new int[1] ;
      T000B2_A31CfgComprobanteId = new String[] {""} ;
      T000B2_A32CfgComprobantePrefijo = new short[1] ;
      T000B2_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000B2_A36CfgComprobanteDetalleNroDesde = new int[1] ;
      T000B2_A37CfgComprobanteDetalleNroHasta = new int[1] ;
      T000B2_A38CfgComprobanteDetalleNroUltimo = new int[1] ;
      T000B20_A42EmpresaId = new int[1] ;
      T000B20_A81EntidadId = new int[1] ;
      T000B20_A31CfgComprobanteId = new String[] {""} ;
      T000B20_A32CfgComprobantePrefijo = new short[1] ;
      T000B20_A55ComprobanteNumero = new int[1] ;
      T000B20_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000B21_A31CfgComprobanteId = new String[] {""} ;
      T000B21_A32CfgComprobantePrefijo = new short[1] ;
      T000B21_A35CfgComprobanteDetalleLetra = new byte[1] ;
      Gridcfgcomprobante_detalleRow = new com.genexus.webpanels.GXWebRow();
      subGridcfgcomprobante_detalle_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.cfgcomprobante__default(),
         new Object[] {
             new Object[] {
            T000B2_A31CfgComprobanteId, T000B2_A32CfgComprobantePrefijo, T000B2_A35CfgComprobanteDetalleLetra, T000B2_A36CfgComprobanteDetalleNroDesde, T000B2_A37CfgComprobanteDetalleNroHasta, T000B2_A38CfgComprobanteDetalleNroUltimo
            }
            , new Object[] {
            T000B3_A31CfgComprobanteId, T000B3_A32CfgComprobantePrefijo, T000B3_A35CfgComprobanteDetalleLetra, T000B3_A36CfgComprobanteDetalleNroDesde, T000B3_A37CfgComprobanteDetalleNroHasta, T000B3_A38CfgComprobanteDetalleNroUltimo
            }
            , new Object[] {
            T000B4_A31CfgComprobanteId, T000B4_A32CfgComprobantePrefijo, T000B4_A33CfgComprobanteNombre, T000B4_A34CfgComprobanteSistema
            }
            , new Object[] {
            T000B5_A31CfgComprobanteId, T000B5_A32CfgComprobantePrefijo, T000B5_A33CfgComprobanteNombre, T000B5_A34CfgComprobanteSistema
            }
            , new Object[] {
            T000B6_A31CfgComprobanteId, T000B6_A32CfgComprobantePrefijo, T000B6_A33CfgComprobanteNombre, T000B6_A34CfgComprobanteSistema
            }
            , new Object[] {
            T000B7_A31CfgComprobanteId, T000B7_A32CfgComprobantePrefijo
            }
            , new Object[] {
            T000B8_A31CfgComprobanteId, T000B8_A32CfgComprobantePrefijo
            }
            , new Object[] {
            T000B9_A31CfgComprobanteId, T000B9_A32CfgComprobantePrefijo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000B13_A42EmpresaId, T000B13_A81EntidadId, T000B13_A31CfgComprobanteId, T000B13_A32CfgComprobantePrefijo, T000B13_A55ComprobanteNumero, T000B13_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            T000B14_A31CfgComprobanteId, T000B14_A32CfgComprobantePrefijo
            }
            , new Object[] {
            T000B15_A31CfgComprobanteId, T000B15_A32CfgComprobantePrefijo, T000B15_A35CfgComprobanteDetalleLetra, T000B15_A36CfgComprobanteDetalleNroDesde, T000B15_A37CfgComprobanteDetalleNroHasta, T000B15_A38CfgComprobanteDetalleNroUltimo
            }
            , new Object[] {
            T000B16_A31CfgComprobanteId, T000B16_A32CfgComprobantePrefijo, T000B16_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000B20_A42EmpresaId, T000B20_A81EntidadId, T000B20_A31CfgComprobanteId, T000B20_A32CfgComprobantePrefijo, T000B20_A55ComprobanteNumero, T000B20_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            T000B21_A31CfgComprobanteId, T000B21_A32CfgComprobantePrefijo, T000B21_A35CfgComprobanteDetalleLetra
            }
         }
      );
   }

   private byte Z34CfgComprobanteSistema ;
   private byte GxWebError ;
   private byte A34CfgComprobanteSistema ;
   private byte A35CfgComprobanteDetalleLetra ;
   private byte nKeyPressed ;
   private byte subGridcfgcomprobante_detalle_Backcolorstyle ;
   private byte subGridcfgcomprobante_detalle_Allowselection ;
   private byte subGridcfgcomprobante_detalle_Allowhovering ;
   private byte subGridcfgcomprobante_detalle_Allowcollapsing ;
   private byte subGridcfgcomprobante_detalle_Collapsed ;
   private byte Z35CfgComprobanteDetalleLetra ;
   private byte Gx_BScreen ;
   private byte subGridcfgcomprobante_detalle_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z32CfgComprobantePrefijo ;
   private short nRC_GXsfl_54 ;
   private short nGXsfl_54_idx=1 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A32CfgComprobantePrefijo ;
   private short nBlankRcdCount12 ;
   private short nRcdExists_12 ;
   private short RcdFound12 ;
   private short nIsMod_12 ;
   private short nRcdDeleted_12 ;
   private short nBlankRcdUsr12 ;
   private short RcdFound11 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtCfgComprobanteId_Enabled ;
   private int edtCfgComprobantePrefijo_Enabled ;
   private int edtCfgComprobanteNombre_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int A36CfgComprobanteDetalleNroDesde ;
   private int edtCfgComprobanteDetalleNroDesde_Enabled ;
   private int A37CfgComprobanteDetalleNroHasta ;
   private int edtCfgComprobanteDetalleNroHasta_Enabled ;
   private int A38CfgComprobanteDetalleNroUltimo ;
   private int edtCfgComprobanteDetalleNroUltimo_Enabled ;
   private int subGridcfgcomprobante_detalle_Selectioncolor ;
   private int subGridcfgcomprobante_detalle_Hoveringcolor ;
   private int fRowAdded ;
   private int Z36CfgComprobanteDetalleNroDesde ;
   private int Z37CfgComprobanteDetalleNroHasta ;
   private int Z38CfgComprobanteDetalleNroUltimo ;
   private int GX_JID ;
   private int subGridcfgcomprobante_detalle_Backcolor ;
   private int subGridcfgcomprobante_detalle_Allbackcolor ;
   private int defcmbCfgComprobanteDetalleLetra_Enabled ;
   private int idxLst ;
   private long GRIDCFGCOMPROBANTE_DETALLE_nFirstRecordOnPage ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_54_idx="0001" ;
   private String GXKey ;
   private String GXCCtl ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCfgComprobanteId_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtCfgComprobanteId_Jsonclick ;
   private String edtCfgComprobantePrefijo_Internalname ;
   private String edtCfgComprobantePrefijo_Jsonclick ;
   private String edtCfgComprobanteNombre_Internalname ;
   private String divDetalletable_Internalname ;
   private String lblTitledetalle_Internalname ;
   private String lblTitledetalle_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sMode12 ;
   private String edtCfgComprobanteDetalleNroDesde_Internalname ;
   private String edtCfgComprobanteDetalleNroHasta_Internalname ;
   private String edtCfgComprobanteDetalleNroUltimo_Internalname ;
   private String sStyleString ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode11 ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String subGridcfgcomprobante_detalle_Class ;
   private String subGridcfgcomprobante_detalle_Linesclass ;
   private String ROClassString ;
   private String edtCfgComprobanteDetalleNroDesde_Jsonclick ;
   private String edtCfgComprobanteDetalleNroHasta_Jsonclick ;
   private String edtCfgComprobanteDetalleNroUltimo_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridcfgcomprobante_detalle_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private String Z31CfgComprobanteId ;
   private String Z33CfgComprobanteNombre ;
   private String A31CfgComprobanteId ;
   private String A33CfgComprobanteNombre ;
   private com.genexus.webpanels.GXWebGrid Gridcfgcomprobante_detalleContainer ;
   private com.genexus.webpanels.GXWebRow Gridcfgcomprobante_detalleRow ;
   private com.genexus.webpanels.GXWebColumn Gridcfgcomprobante_detalleColumn ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbCfgComprobanteSistema ;
   private HTMLChoice cmbCfgComprobanteDetalleLetra ;
   private IDataStoreProvider pr_default ;
   private String[] T000B6_A31CfgComprobanteId ;
   private short[] T000B6_A32CfgComprobantePrefijo ;
   private String[] T000B6_A33CfgComprobanteNombre ;
   private byte[] T000B6_A34CfgComprobanteSistema ;
   private String[] T000B7_A31CfgComprobanteId ;
   private short[] T000B7_A32CfgComprobantePrefijo ;
   private String[] T000B5_A31CfgComprobanteId ;
   private short[] T000B5_A32CfgComprobantePrefijo ;
   private String[] T000B5_A33CfgComprobanteNombre ;
   private byte[] T000B5_A34CfgComprobanteSistema ;
   private String[] T000B8_A31CfgComprobanteId ;
   private short[] T000B8_A32CfgComprobantePrefijo ;
   private String[] T000B9_A31CfgComprobanteId ;
   private short[] T000B9_A32CfgComprobantePrefijo ;
   private String[] T000B4_A31CfgComprobanteId ;
   private short[] T000B4_A32CfgComprobantePrefijo ;
   private String[] T000B4_A33CfgComprobanteNombre ;
   private byte[] T000B4_A34CfgComprobanteSistema ;
   private int[] T000B13_A42EmpresaId ;
   private int[] T000B13_A81EntidadId ;
   private String[] T000B13_A31CfgComprobanteId ;
   private short[] T000B13_A32CfgComprobantePrefijo ;
   private int[] T000B13_A55ComprobanteNumero ;
   private byte[] T000B13_A35CfgComprobanteDetalleLetra ;
   private String[] T000B14_A31CfgComprobanteId ;
   private short[] T000B14_A32CfgComprobantePrefijo ;
   private String[] T000B15_A31CfgComprobanteId ;
   private short[] T000B15_A32CfgComprobantePrefijo ;
   private byte[] T000B15_A35CfgComprobanteDetalleLetra ;
   private int[] T000B15_A36CfgComprobanteDetalleNroDesde ;
   private int[] T000B15_A37CfgComprobanteDetalleNroHasta ;
   private int[] T000B15_A38CfgComprobanteDetalleNroUltimo ;
   private String[] T000B16_A31CfgComprobanteId ;
   private short[] T000B16_A32CfgComprobantePrefijo ;
   private byte[] T000B16_A35CfgComprobanteDetalleLetra ;
   private String[] T000B3_A31CfgComprobanteId ;
   private short[] T000B3_A32CfgComprobantePrefijo ;
   private byte[] T000B3_A35CfgComprobanteDetalleLetra ;
   private int[] T000B3_A36CfgComprobanteDetalleNroDesde ;
   private int[] T000B3_A37CfgComprobanteDetalleNroHasta ;
   private int[] T000B3_A38CfgComprobanteDetalleNroUltimo ;
   private String[] T000B2_A31CfgComprobanteId ;
   private short[] T000B2_A32CfgComprobantePrefijo ;
   private byte[] T000B2_A35CfgComprobanteDetalleLetra ;
   private int[] T000B2_A36CfgComprobanteDetalleNroDesde ;
   private int[] T000B2_A37CfgComprobanteDetalleNroHasta ;
   private int[] T000B2_A38CfgComprobanteDetalleNroUltimo ;
   private int[] T000B20_A42EmpresaId ;
   private int[] T000B20_A81EntidadId ;
   private String[] T000B20_A31CfgComprobanteId ;
   private short[] T000B20_A32CfgComprobantePrefijo ;
   private int[] T000B20_A55ComprobanteNumero ;
   private byte[] T000B20_A35CfgComprobanteDetalleLetra ;
   private String[] T000B21_A31CfgComprobanteId ;
   private short[] T000B21_A32CfgComprobantePrefijo ;
   private byte[] T000B21_A35CfgComprobanteDetalleLetra ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class cfgcomprobante__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000B2", "SELECT CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra, CfgComprobanteDetalleNroDesde, CfgComprobanteDetalleNroHasta, CfgComprobanteDetalleNroUltimo FROM CfgComprobanteDetalle WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND CfgComprobanteDetalleLetra = ?  FOR UPDATE OF CfgComprobanteDetalle NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B3", "SELECT CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra, CfgComprobanteDetalleNroDesde, CfgComprobanteDetalleNroHasta, CfgComprobanteDetalleNroUltimo FROM CfgComprobanteDetalle WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND CfgComprobanteDetalleLetra = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B4", "SELECT CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteNombre, CfgComprobanteSistema FROM CfgComprobante WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ?  FOR UPDATE OF CfgComprobante NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B5", "SELECT CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteNombre, CfgComprobanteSistema FROM CfgComprobante WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B6", "SELECT TM1.CfgComprobanteId, TM1.CfgComprobantePrefijo, TM1.CfgComprobanteNombre, TM1.CfgComprobanteSistema FROM CfgComprobante TM1 WHERE TM1.CfgComprobanteId = ( ?) and TM1.CfgComprobantePrefijo = ? ORDER BY TM1.CfgComprobanteId, TM1.CfgComprobantePrefijo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000B7", "SELECT CfgComprobanteId, CfgComprobantePrefijo FROM CfgComprobante WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B8", "SELECT CfgComprobanteId, CfgComprobantePrefijo FROM CfgComprobante WHERE ( CfgComprobanteId > ( ?) or CfgComprobanteId = ( ?) and CfgComprobantePrefijo > ?) ORDER BY CfgComprobanteId, CfgComprobantePrefijo  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000B9", "SELECT CfgComprobanteId, CfgComprobantePrefijo FROM CfgComprobante WHERE ( CfgComprobanteId < ( ?) or CfgComprobanteId = ( ?) and CfgComprobantePrefijo < ?) ORDER BY CfgComprobanteId DESC, CfgComprobantePrefijo DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000B10", "SAVEPOINT gxupdate;INSERT INTO CfgComprobante(CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteNombre, CfgComprobanteSistema) VALUES(?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000B11", "SAVEPOINT gxupdate;UPDATE CfgComprobante SET CfgComprobanteNombre=?, CfgComprobanteSistema=?  WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000B12", "SAVEPOINT gxupdate;DELETE FROM CfgComprobante  WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000B13", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra FROM Comprobante WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000B14", "SELECT CfgComprobanteId, CfgComprobantePrefijo FROM CfgComprobante ORDER BY CfgComprobanteId, CfgComprobantePrefijo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000B15", "SELECT CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra, CfgComprobanteDetalleNroDesde, CfgComprobanteDetalleNroHasta, CfgComprobanteDetalleNroUltimo FROM CfgComprobanteDetalle WHERE CfgComprobanteId = ( ?) and CfgComprobantePrefijo = ? and CfgComprobanteDetalleLetra = ? ORDER BY CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000B16", "SELECT CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra FROM CfgComprobanteDetalle WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND CfgComprobanteDetalleLetra = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000B17", "SAVEPOINT gxupdate;INSERT INTO CfgComprobanteDetalle(CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra, CfgComprobanteDetalleNroDesde, CfgComprobanteDetalleNroHasta, CfgComprobanteDetalleNroUltimo) VALUES(?, ?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000B18", "SAVEPOINT gxupdate;UPDATE CfgComprobanteDetalle SET CfgComprobanteDetalleNroDesde=?, CfgComprobanteDetalleNroHasta=?, CfgComprobanteDetalleNroUltimo=?  WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND CfgComprobanteDetalleLetra = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000B19", "SAVEPOINT gxupdate;DELETE FROM CfgComprobanteDetalle  WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND CfgComprobanteDetalleLetra = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000B20", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra FROM Comprobante WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND CfgComprobanteDetalleLetra = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000B21", "SELECT CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra FROM CfgComprobanteDetalle WHERE CfgComprobanteId = ( ?) and CfgComprobantePrefijo = ? ORDER BY CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra ",true, GX_NOMASK, false, this,11,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 250, false);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 250, false);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setVarchar(4, (String)parms[3], 10, false);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

