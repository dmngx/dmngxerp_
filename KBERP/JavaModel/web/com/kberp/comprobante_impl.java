/*
               File: comprobante_impl
        Description: Comprobante
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:35:27.33
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

public final  class comprobante_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A42EmpresaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         A81EntidadId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A42EmpresaId, A81EntidadId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A31CfgComprobanteId = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
         A32CfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
         A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A31CfgComprobanteId, A32CfgComprobantePrefijo, A35CfgComprobanteDetalleLetra) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A67MonedaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A67MonedaId", GXutil.ltrim( GXutil.str( A67MonedaId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A67MonedaId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A39ArticuloId = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, edtArticuloId_Internalname, A39ArticuloId);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A39ArticuloId) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridcomprobante_articulo") == 0 )
      {
         nRC_GXsfl_82 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_82_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_82_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridcomprobante_articulo_newrow( ) ;
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
      cmbCfgComprobanteDetalleLetra.setName( "CFGCOMPROBANTEDETALLELETRA" );
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
         httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
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
         Form.getMeta().addItem("description", "Comprobante", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtEmpresaId_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public comprobante_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public comprobante_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( comprobante_impl.class ));
   }

   public comprobante_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Comprobante", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_Comprobante.htm");
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
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.kberp.gx00z0"+"',["+"{Ctrl:gx.dom.el('"+"EMPRESAID"+"'), id:'"+"EMPRESAID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ENTIDADID"+"'), id:'"+"ENTIDADID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"CFGCOMPROBANTEID"+"'), id:'"+"CFGCOMPROBANTEID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"CFGCOMPROBANTEPREFIJO"+"'), id:'"+"CFGCOMPROBANTEPREFIJO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"COMPROBANTENUMERO"+"'), id:'"+"COMPROBANTENUMERO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"CFGCOMPROBANTEDETALLELETRA"+"'), id:'"+"CFGCOMPROBANTEDETALLELETRA"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_Comprobante.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaId_Internalname, "Empresa Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaId_Internalname, GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")), ((edtEmpresaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasMaestras", "right", "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadId_Internalname, "Entidad Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEntidadId_Internalname, GXutil.ltrim( localUtil.ntoc( A81EntidadId, (byte)(6), (byte)(0), ",", "")), ((edtEntidadId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A81EntidadId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A81EntidadId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntidadId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEntidadId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasMaestras", "right", "HLP_Comprobante.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_42_81_Internalname, sImgUrl, imgprompt_42_81_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_42_81_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Comprobante.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtCfgComprobanteId_Internalname, "Cfg Comprobante Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtCfgComprobanteId_Internalname, A31CfgComprobanteId, GXutil.rtrim( localUtil.format( A31CfgComprobanteId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCfgComprobanteId_Jsonclick, 0, "Attribute", "", "", "", 1, edtCfgComprobanteId_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "IdCfgComprobanteId", "left", "HLP_Comprobante.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtCfgComprobantePrefijo_Internalname, "Cfg Comprobante Prefijo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtCfgComprobantePrefijo_Internalname, GXutil.ltrim( localUtil.ntoc( A32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")), ((edtCfgComprobantePrefijo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A32CfgComprobantePrefijo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A32CfgComprobantePrefijo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCfgComprobantePrefijo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCfgComprobantePrefijo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "CfgComprobantePrefijo", "right", "HLP_Comprobante.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtComprobanteNumero_Internalname, "Numero", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtComprobanteNumero_Internalname, GXutil.ltrim( localUtil.ntoc( A55ComprobanteNumero, (byte)(8), (byte)(0), ",", "")), ((edtComprobanteNumero_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A55ComprobanteNumero), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A55ComprobanteNumero), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtComprobanteNumero_Jsonclick, 0, "Attribute", "", "", "", 1, edtComprobanteNumero_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "CfgComprobanteNumero", "right", "HLP_Comprobante.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, cmbCfgComprobanteDetalleLetra.getInternalname(), "Cfg Comprobante Detalle Letra", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         /* ComboBox */
         com.kberp.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCfgComprobanteDetalleLetra, cmbCfgComprobanteDetalleLetra.getInternalname(), GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)), 1, cmbCfgComprobanteDetalleLetra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbCfgComprobanteDetalleLetra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "", true, "HLP_Comprobante.htm");
         cmbCfgComprobanteDetalleLetra.setValue( GXutil.trim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Values", cmbCfgComprobanteDetalleLetra.ToJavascriptSource());
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_31_32_35_Internalname, sImgUrl, imgprompt_31_32_35_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_31_32_35_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Comprobante.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtComprobanteEntidadNombre_Internalname, "Entidad Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_html_textarea( httpContext, edtComprobanteEntidadNombre_Internalname, A57ComprobanteEntidadNombre, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", (short)(0), 1, edtComprobanteEntidadNombre_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "250", -1, 0, "", "", (byte)(-1), true, "NombreTablasMaestras", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Comprobante.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtComprobanteFecha_Internalname, "Fecha", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtComprobanteFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtComprobanteFecha_Internalname, localUtil.format(A61ComprobanteFecha, "99/99/99"), localUtil.format( A61ComprobanteFecha, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtComprobanteFecha_Jsonclick, 0, "Attribute", "", "", "", 1, edtComprobanteFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_bitmap( httpContext, edtComprobanteFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtComprobanteFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Comprobante.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtComprobanteFechaSubdiario_Internalname, "Fecha Subdiario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtComprobanteFechaSubdiario_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtComprobanteFechaSubdiario_Internalname, localUtil.format(A62ComprobanteFechaSubdiario, "99/99/99"), localUtil.format( A62ComprobanteFechaSubdiario, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtComprobanteFechaSubdiario_Jsonclick, 0, "Attribute", "", "", "", 1, edtComprobanteFechaSubdiario_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_bitmap( httpContext, edtComprobanteFechaSubdiario_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtComprobanteFechaSubdiario_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Comprobante.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtComprobanteVto_Internalname, "Vto", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtComprobanteVto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtComprobanteVto_Internalname, localUtil.format(A60ComprobanteVto, "99/99/99"), localUtil.format( A60ComprobanteVto, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtComprobanteVto_Jsonclick, 0, "Attribute", "", "", "", 1, edtComprobanteVto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_bitmap( httpContext, edtComprobanteVto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtComprobanteVto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Comprobante.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtMonedaId_Internalname, "Moneda Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtMonedaId_Internalname, GXutil.ltrim( localUtil.ntoc( A67MonedaId, (byte)(4), (byte)(0), ",", "")), ((edtMonedaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A67MonedaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A67MonedaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMonedaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtMonedaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Comprobante.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_67_Internalname, sImgUrl, imgprompt_67_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_67_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divArticulotable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblTitlearticulo_Internalname, "Articulo", "", "", lblTitlearticulo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridcomprobante_articulo( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Comprobante.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      /* Execute Exit event if defined. */
   }

   public void gxdraw_gridcomprobante_articulo( )
   {
      /*  Grid Control  */
      Gridcomprobante_articuloContainer.AddObjectProperty("GridName", "Gridcomprobante_articulo");
      Gridcomprobante_articuloContainer.AddObjectProperty("Class", "Grid");
      Gridcomprobante_articuloContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcomprobante_articulo_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddObjectProperty("CmpContext", "");
      Gridcomprobante_articuloContainer.AddObjectProperty("InMasterPage", "false");
      Gridcomprobante_articuloColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcomprobante_articuloColumn.AddObjectProperty("Value", A39ArticuloId);
      Gridcomprobante_articuloColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArticuloId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddColumnProperties(Gridcomprobante_articuloColumn);
      Gridcomprobante_articuloColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcomprobante_articuloContainer.AddColumnProperties(Gridcomprobante_articuloColumn);
      Gridcomprobante_articuloColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcomprobante_articuloColumn.AddObjectProperty("Value", A63ComprobanteArticuloNombre);
      Gridcomprobante_articuloColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloNombre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddColumnProperties(Gridcomprobante_articuloColumn);
      Gridcomprobante_articuloColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcomprobante_articuloColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A64ComprobanteArticuloCantidad, (byte)(10), (byte)(3), ".", "")));
      Gridcomprobante_articuloColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloCantidad_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddColumnProperties(Gridcomprobante_articuloColumn);
      Gridcomprobante_articuloColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcomprobante_articuloColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A65ComprobanteArticuloPrecioUnit, (byte)(12), (byte)(2), ".", "")));
      Gridcomprobante_articuloColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloPrecioUnit_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddColumnProperties(Gridcomprobante_articuloColumn);
      Gridcomprobante_articuloColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridcomprobante_articuloColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A70ComprobanteArticuloTotalCalcul, (byte)(12), (byte)(2), ".", "")));
      Gridcomprobante_articuloColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloTotalCalcul_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddColumnProperties(Gridcomprobante_articuloColumn);
      Gridcomprobante_articuloContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridcomprobante_articulo_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridcomprobante_articulo_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridcomprobante_articulo_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridcomprobante_articulo_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridcomprobante_articulo_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridcomprobante_articuloContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridcomprobante_articulo_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_82_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount36 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_36 = (short)(1) ;
            scanStart0F36( ) ;
            while ( RcdFound36 != 0 )
            {
               init_level_properties36( ) ;
               getByPrimaryKey0F36( ) ;
               addRow0F36( ) ;
               scanNext0F36( ) ;
            }
            scanEnd0F36( ) ;
            nBlankRcdCount36 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0F36( ) ;
         standaloneModal0F36( ) ;
         sMode36 = Gx_mode ;
         while ( nGXsfl_82_idx < nRC_GXsfl_82 )
         {
            readRow0F36( ) ;
            edtArticuloId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTICULOID_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArticuloId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtArticuloId_Enabled, 5, 0)));
            edtComprobanteArticuloNombre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMPROBANTEARTICULONOMBRE_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloNombre_Enabled, 5, 0)));
            edtComprobanteArticuloCantidad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMPROBANTEARTICULOCANTIDAD_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloCantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloCantidad_Enabled, 5, 0)));
            edtComprobanteArticuloPrecioUnit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMPROBANTEARTICULOPRECIOUNIT_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloPrecioUnit_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloPrecioUnit_Enabled, 5, 0)));
            edtComprobanteArticuloTotalCalcul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMPROBANTEARTICULOTOTALCALCUL_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloTotalCalcul_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloTotalCalcul_Enabled, 5, 0)));
            imgprompt_42_81_Link = httpContext.cgiGet( "PROMPT_39_"+sGXsfl_82_idx+"Link") ;
            if ( ( nRcdExists_36 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0F36( ) ;
            }
            sendRow0F36( ) ;
         }
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount36 = (short)(5) ;
         nRcdExists_36 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0F36( ) ;
            while ( RcdFound36 != 0 )
            {
               sGXsfl_82_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_82_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_8236( ) ;
               init_level_properties36( ) ;
               standaloneNotModal0F36( ) ;
               getByPrimaryKey0F36( ) ;
               standaloneModal0F36( ) ;
               addRow0F36( ) ;
               scanNext0F36( ) ;
            }
            scanEnd0F36( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode36 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_82_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_82_idx+1, 4, 0)), (short)(4), "0") ;
      subsflControlProps_8236( ) ;
      initAll0F36( ) ;
      init_level_properties36( ) ;
      standaloneNotModal0F36( ) ;
      standaloneModal0F36( ) ;
      nRcdExists_36 = (short)(0) ;
      nIsMod_36 = (short)(0) ;
      nRcdDeleted_36 = (short)(0) ;
      nBlankRcdCount36 = (short)(nBlankRcdUsr36+nBlankRcdCount36) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount36 > 0 )
      {
         addRow0F36( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtArticuloId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount36 = (short)(nBlankRcdCount36-1) ;
      }
      Gx_mode = sMode36 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridcomprobante_articuloContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridcomprobante_articulo", Gridcomprobante_articuloContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "Gridcomprobante_articuloContainerData", Gridcomprobante_articuloContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "Gridcomprobante_articuloContainerData"+"V", Gridcomprobante_articuloContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcomprobante_articuloContainerData"+"V"+"\" value='"+Gridcomprobante_articuloContainer.GridValuesHidden()+"'/>") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEmpresaId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEmpresaId_Internalname), ",", ".") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPRESAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmpresaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A42EmpresaId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            }
            else
            {
               A42EmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( edtEmpresaId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadId_Internalname), ",", ".") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTIDADID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntidadId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A81EntidadId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
            }
            else
            {
               A81EntidadId = (int)(localUtil.ctol( httpContext.cgiGet( edtEntidadId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
            }
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtComprobanteNumero_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtComprobanteNumero_Internalname), ",", ".") > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COMPROBANTENUMERO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtComprobanteNumero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A55ComprobanteNumero = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
            }
            else
            {
               A55ComprobanteNumero = (int)(localUtil.ctol( httpContext.cgiGet( edtComprobanteNumero_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
            }
            cmbCfgComprobanteDetalleLetra.setName( cmbCfgComprobanteDetalleLetra.getInternalname() );
            cmbCfgComprobanteDetalleLetra.setValue( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()) );
            A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.cgiGet( cmbCfgComprobanteDetalleLetra.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
            A57ComprobanteEntidadNombre = httpContext.cgiGet( edtComprobanteEntidadNombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57ComprobanteEntidadNombre", A57ComprobanteEntidadNombre);
            if ( localUtil.vcdate( httpContext.cgiGet( edtComprobanteFecha_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "COMPROBANTEFECHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtComprobanteFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A61ComprobanteFecha = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A61ComprobanteFecha", localUtil.format(A61ComprobanteFecha, "99/99/99"));
            }
            else
            {
               A61ComprobanteFecha = localUtil.ctod( httpContext.cgiGet( edtComprobanteFecha_Internalname), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A61ComprobanteFecha", localUtil.format(A61ComprobanteFecha, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtComprobanteFechaSubdiario_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "COMPROBANTEFECHASUBDIARIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtComprobanteFechaSubdiario_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A62ComprobanteFechaSubdiario = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A62ComprobanteFechaSubdiario", localUtil.format(A62ComprobanteFechaSubdiario, "99/99/99"));
            }
            else
            {
               A62ComprobanteFechaSubdiario = localUtil.ctod( httpContext.cgiGet( edtComprobanteFechaSubdiario_Internalname), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A62ComprobanteFechaSubdiario", localUtil.format(A62ComprobanteFechaSubdiario, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtComprobanteVto_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "COMPROBANTEVTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtComprobanteVto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A60ComprobanteVto = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A60ComprobanteVto", localUtil.format(A60ComprobanteVto, "99/99/99"));
            }
            else
            {
               A60ComprobanteVto = localUtil.ctod( httpContext.cgiGet( edtComprobanteVto_Internalname), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60ComprobanteVto", localUtil.format(A60ComprobanteVto, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMonedaId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMonedaId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MONEDAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMonedaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A67MonedaId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A67MonedaId", GXutil.ltrim( GXutil.str( A67MonedaId, 4, 0)));
            }
            else
            {
               A67MonedaId = (short)(localUtil.ctol( httpContext.cgiGet( edtMonedaId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A67MonedaId", GXutil.ltrim( GXutil.str( A67MonedaId, 4, 0)));
            }
            /* Read saved values. */
            Z42EmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( "Z42EmpresaId"), ",", ".")) ;
            Z81EntidadId = (int)(localUtil.ctol( httpContext.cgiGet( "Z81EntidadId"), ",", ".")) ;
            Z31CfgComprobanteId = httpContext.cgiGet( "Z31CfgComprobanteId") ;
            Z32CfgComprobantePrefijo = (short)(localUtil.ctol( httpContext.cgiGet( "Z32CfgComprobantePrefijo"), ",", ".")) ;
            Z55ComprobanteNumero = (int)(localUtil.ctol( httpContext.cgiGet( "Z55ComprobanteNumero"), ",", ".")) ;
            Z35CfgComprobanteDetalleLetra = (byte)(localUtil.ctol( httpContext.cgiGet( "Z35CfgComprobanteDetalleLetra"), ",", ".")) ;
            Z57ComprobanteEntidadNombre = httpContext.cgiGet( "Z57ComprobanteEntidadNombre") ;
            Z61ComprobanteFecha = localUtil.ctod( httpContext.cgiGet( "Z61ComprobanteFecha"), 0) ;
            Z62ComprobanteFechaSubdiario = localUtil.ctod( httpContext.cgiGet( "Z62ComprobanteFechaSubdiario"), 0) ;
            Z60ComprobanteVto = localUtil.ctod( httpContext.cgiGet( "Z60ComprobanteVto"), 0) ;
            Z67MonedaId = (short)(localUtil.ctol( httpContext.cgiGet( "Z67MonedaId"), ",", ".")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_82 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_82"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            A66ComprobanteArticuloTotal = localUtil.ctond( httpContext.cgiGet( "COMPROBANTEARTICULOTOTAL")) ;
            A40ArticuloNombre = httpContext.cgiGet( "ARTICULONOMBRE") ;
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
               A42EmpresaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
               A81EntidadId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
               A31CfgComprobanteId = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
               A32CfgComprobantePrefijo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
               A55ComprobanteNumero = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
               A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
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
            initAll0F35( ) ;
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
      disableAttributes0F35( ) ;
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

   public void confirm_0F36( )
   {
      nGXsfl_82_idx = (short)(0) ;
      while ( nGXsfl_82_idx < nRC_GXsfl_82 )
      {
         readRow0F36( ) ;
         if ( ( nRcdExists_36 != 0 ) || ( nIsMod_36 != 0 ) )
         {
            getKey0F36( ) ;
            if ( ( nRcdExists_36 == 0 ) && ( nRcdDeleted_36 == 0 ) )
            {
               if ( RcdFound36 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0F36( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0F36( ) ;
                     closeExtendedTableCursors0F36( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ARTICULOID_" + sGXsfl_82_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtArticuloId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound36 != 0 )
               {
                  if ( nRcdDeleted_36 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0F36( ) ;
                     load0F36( ) ;
                     beforeValidate0F36( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0F36( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_36 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0F36( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0F36( ) ;
                           closeExtendedTableCursors0F36( ) ;
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
                  if ( nRcdDeleted_36 == 0 )
                  {
                     GXCCtl = "ARTICULOID_" + sGXsfl_82_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtArticuloId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtArticuloId_Internalname, A39ArticuloId) ;
         httpContext.changePostValue( edtComprobanteArticuloNombre_Internalname, A63ComprobanteArticuloNombre) ;
         httpContext.changePostValue( edtComprobanteArticuloCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A64ComprobanteArticuloCantidad, (byte)(10), (byte)(3), ",", ""))) ;
         httpContext.changePostValue( edtComprobanteArticuloPrecioUnit_Internalname, GXutil.ltrim( localUtil.ntoc( A65ComprobanteArticuloPrecioUnit, (byte)(12), (byte)(2), ",", ""))) ;
         httpContext.changePostValue( edtComprobanteArticuloTotalCalcul_Internalname, GXutil.ltrim( localUtil.ntoc( A70ComprobanteArticuloTotalCalcul, (byte)(12), (byte)(2), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z39ArticuloId_"+sGXsfl_82_idx, Z39ArticuloId) ;
         httpContext.changePostValue( "ZT_"+"Z63ComprobanteArticuloNombre_"+sGXsfl_82_idx, Z63ComprobanteArticuloNombre) ;
         httpContext.changePostValue( "ZT_"+"Z64ComprobanteArticuloCantidad_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( Z64ComprobanteArticuloCantidad, (byte)(10), (byte)(3), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z65ComprobanteArticuloPrecioUnit_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( Z65ComprobanteArticuloPrecioUnit, (byte)(12), (byte)(2), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z66ComprobanteArticuloTotal_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( Z66ComprobanteArticuloTotal, (byte)(12), (byte)(2), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_36_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_36, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_36_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_36, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_36_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_36, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_36 != 0 )
         {
            httpContext.changePostValue( "ARTICULOID_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArticuloId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMPROBANTEARTICULONOMBRE_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloNombre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMPROBANTEARTICULOCANTIDAD_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloCantidad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMPROBANTEARTICULOPRECIOUNIT_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloPrecioUnit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMPROBANTEARTICULOTOTALCALCUL_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloTotalCalcul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0F0( )
   {
   }

   public void zm0F35( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z57ComprobanteEntidadNombre = T000F6_A57ComprobanteEntidadNombre[0] ;
            Z61ComprobanteFecha = T000F6_A61ComprobanteFecha[0] ;
            Z62ComprobanteFechaSubdiario = T000F6_A62ComprobanteFechaSubdiario[0] ;
            Z60ComprobanteVto = T000F6_A60ComprobanteVto[0] ;
            Z67MonedaId = T000F6_A67MonedaId[0] ;
         }
         else
         {
            Z57ComprobanteEntidadNombre = A57ComprobanteEntidadNombre ;
            Z61ComprobanteFecha = A61ComprobanteFecha ;
            Z62ComprobanteFechaSubdiario = A62ComprobanteFechaSubdiario ;
            Z60ComprobanteVto = A60ComprobanteVto ;
            Z67MonedaId = A67MonedaId ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z55ComprobanteNumero = A55ComprobanteNumero ;
         Z57ComprobanteEntidadNombre = A57ComprobanteEntidadNombre ;
         Z61ComprobanteFecha = A61ComprobanteFecha ;
         Z62ComprobanteFechaSubdiario = A62ComprobanteFechaSubdiario ;
         Z60ComprobanteVto = A60ComprobanteVto ;
         Z42EmpresaId = A42EmpresaId ;
         Z81EntidadId = A81EntidadId ;
         Z31CfgComprobanteId = A31CfgComprobanteId ;
         Z32CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         Z35CfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
         Z67MonedaId = A67MonedaId ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_42_81_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0180"+"',["+"{Ctrl:gx.dom.el('"+"EMPRESAID"+"'), id:'"+"EMPRESAID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ENTIDADID"+"'), id:'"+"ENTIDADID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      imgprompt_31_32_35_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx00c0"+"',["+"{Ctrl:gx.dom.el('"+"CFGCOMPROBANTEID"+"'), id:'"+"CFGCOMPROBANTEID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"CFGCOMPROBANTEPREFIJO"+"'), id:'"+"CFGCOMPROBANTEPREFIJO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"CFGCOMPROBANTEDETALLELETRA"+"'), id:'"+"CFGCOMPROBANTEDETALLELETRA"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      imgprompt_67_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx00m0"+"',["+"{Ctrl:gx.dom.el('"+"MONEDAID"+"'), id:'"+"MONEDAID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
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

   public void load0F35( )
   {
      /* Using cursor T000F10 */
      pr_default.execute(8, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A57ComprobanteEntidadNombre = T000F10_A57ComprobanteEntidadNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57ComprobanteEntidadNombre", A57ComprobanteEntidadNombre);
         A61ComprobanteFecha = T000F10_A61ComprobanteFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61ComprobanteFecha", localUtil.format(A61ComprobanteFecha, "99/99/99"));
         A62ComprobanteFechaSubdiario = T000F10_A62ComprobanteFechaSubdiario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62ComprobanteFechaSubdiario", localUtil.format(A62ComprobanteFechaSubdiario, "99/99/99"));
         A60ComprobanteVto = T000F10_A60ComprobanteVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60ComprobanteVto", localUtil.format(A60ComprobanteVto, "99/99/99"));
         A67MonedaId = T000F10_A67MonedaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67MonedaId", GXutil.ltrim( GXutil.str( A67MonedaId, 4, 0)));
         zm0F35( -6) ;
      }
      pr_default.close(8);
      onLoadActions0F35( ) ;
   }

   public void onLoadActions0F35( )
   {
   }

   public void checkExtendedTable0F35( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T000F7 */
      pr_default.execute(5, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Entidad'.", "ForeignKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T000F8 */
      pr_default.execute(6, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Detalle'.", "ForeignKeyNotFound", 1, "CFGCOMPROBANTEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCfgComprobanteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      if ( ! ( ( A35CfgComprobanteDetalleLetra == 1 ) || ( A35CfgComprobanteDetalleLetra == 2 ) || ( A35CfgComprobanteDetalleLetra == 3 ) || ( A35CfgComprobanteDetalleLetra == 4 ) || ( A35CfgComprobanteDetalleLetra == 5 ) || ( A35CfgComprobanteDetalleLetra == 6 ) || ( A35CfgComprobanteDetalleLetra == 7 ) ) )
      {
         httpContext.GX_msglist.addItem("Campo Cfg Comprobante Detalle Letra fuera de rango", "OutOfRange", 1, "CFGCOMPROBANTEDETALLELETRA");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCfgComprobanteDetalleLetra.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T000F9 */
      pr_default.execute(7, new Object[] {new Short(A67MonedaId)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Moneda'.", "ForeignKeyNotFound", 1, "MONEDAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMonedaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursors0F35( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_7( int A42EmpresaId ,
                         int A81EntidadId )
   {
      /* Using cursor T000F11 */
      pr_default.execute(9, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Entidad'.", "ForeignKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(9);
   }

   public void gxload_8( String A31CfgComprobanteId ,
                         short A32CfgComprobantePrefijo ,
                         byte A35CfgComprobanteDetalleLetra )
   {
      /* Using cursor T000F12 */
      pr_default.execute(10, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Detalle'.", "ForeignKeyNotFound", 1, "CFGCOMPROBANTEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCfgComprobanteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(10);
   }

   public void gxload_9( short A67MonedaId )
   {
      /* Using cursor T000F13 */
      pr_default.execute(11, new Object[] {new Short(A67MonedaId)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Moneda'.", "ForeignKeyNotFound", 1, "MONEDAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMonedaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void getKey0F35( )
   {
      /* Using cursor T000F14 */
      pr_default.execute(12, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000F6 */
      pr_default.execute(4, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0F35( 6) ;
         RcdFound35 = (short)(1) ;
         A55ComprobanteNumero = T000F6_A55ComprobanteNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
         A57ComprobanteEntidadNombre = T000F6_A57ComprobanteEntidadNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57ComprobanteEntidadNombre", A57ComprobanteEntidadNombre);
         A61ComprobanteFecha = T000F6_A61ComprobanteFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61ComprobanteFecha", localUtil.format(A61ComprobanteFecha, "99/99/99"));
         A62ComprobanteFechaSubdiario = T000F6_A62ComprobanteFechaSubdiario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62ComprobanteFechaSubdiario", localUtil.format(A62ComprobanteFechaSubdiario, "99/99/99"));
         A60ComprobanteVto = T000F6_A60ComprobanteVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60ComprobanteVto", localUtil.format(A60ComprobanteVto, "99/99/99"));
         A42EmpresaId = T000F6_A42EmpresaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         A81EntidadId = T000F6_A81EntidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
         A31CfgComprobanteId = T000F6_A31CfgComprobanteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
         A32CfgComprobantePrefijo = T000F6_A32CfgComprobantePrefijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
         A35CfgComprobanteDetalleLetra = T000F6_A35CfgComprobanteDetalleLetra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
         A67MonedaId = T000F6_A67MonedaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67MonedaId", GXutil.ltrim( GXutil.str( A67MonedaId, 4, 0)));
         Z42EmpresaId = A42EmpresaId ;
         Z81EntidadId = A81EntidadId ;
         Z31CfgComprobanteId = A31CfgComprobanteId ;
         Z32CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         Z55ComprobanteNumero = A55ComprobanteNumero ;
         Z35CfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0F35( ) ;
         if ( AnyError == 1 )
         {
            RcdFound35 = (short)(0) ;
            initializeNonKey0F35( ) ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey0F35( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey0F35( ) ;
      if ( RcdFound35 == 0 )
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
      RcdFound35 = (short)(0) ;
      /* Using cursor T000F15 */
      pr_default.execute(13, new Object[] {new Integer(A42EmpresaId), new Integer(A42EmpresaId), new Integer(A81EntidadId), new Integer(A81EntidadId), new Integer(A42EmpresaId), A31CfgComprobanteId, A31CfgComprobanteId, new Integer(A81EntidadId), new Integer(A42EmpresaId), new Short(A32CfgComprobantePrefijo), new Short(A32CfgComprobantePrefijo), A31CfgComprobanteId, new Integer(A81EntidadId), new Integer(A42EmpresaId), new Integer(A55ComprobanteNumero), new Integer(A55ComprobanteNumero), new Short(A32CfgComprobantePrefijo), A31CfgComprobanteId, new Integer(A81EntidadId), new Integer(A42EmpresaId), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T000F15_A42EmpresaId[0] < A42EmpresaId ) || ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( T000F15_A81EntidadId[0] < A81EntidadId ) || ( T000F15_A81EntidadId[0] == A81EntidadId ) && ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( GXutil.strcmp(T000F15_A31CfgComprobanteId[0], A31CfgComprobanteId) < 0 ) || ( GXutil.strcmp(T000F15_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F15_A81EntidadId[0] == A81EntidadId ) && ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( T000F15_A32CfgComprobantePrefijo[0] < A32CfgComprobantePrefijo ) || ( T000F15_A32CfgComprobantePrefijo[0] == A32CfgComprobantePrefijo ) && ( GXutil.strcmp(T000F15_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F15_A81EntidadId[0] == A81EntidadId ) && ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( T000F15_A55ComprobanteNumero[0] < A55ComprobanteNumero ) || ( T000F15_A55ComprobanteNumero[0] == A55ComprobanteNumero ) && ( T000F15_A32CfgComprobantePrefijo[0] == A32CfgComprobantePrefijo ) && ( GXutil.strcmp(T000F15_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F15_A81EntidadId[0] == A81EntidadId ) && ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( T000F15_A35CfgComprobanteDetalleLetra[0] < A35CfgComprobanteDetalleLetra ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T000F15_A42EmpresaId[0] > A42EmpresaId ) || ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( T000F15_A81EntidadId[0] > A81EntidadId ) || ( T000F15_A81EntidadId[0] == A81EntidadId ) && ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( GXutil.strcmp(T000F15_A31CfgComprobanteId[0], A31CfgComprobanteId) > 0 ) || ( GXutil.strcmp(T000F15_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F15_A81EntidadId[0] == A81EntidadId ) && ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( T000F15_A32CfgComprobantePrefijo[0] > A32CfgComprobantePrefijo ) || ( T000F15_A32CfgComprobantePrefijo[0] == A32CfgComprobantePrefijo ) && ( GXutil.strcmp(T000F15_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F15_A81EntidadId[0] == A81EntidadId ) && ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( T000F15_A55ComprobanteNumero[0] > A55ComprobanteNumero ) || ( T000F15_A55ComprobanteNumero[0] == A55ComprobanteNumero ) && ( T000F15_A32CfgComprobantePrefijo[0] == A32CfgComprobantePrefijo ) && ( GXutil.strcmp(T000F15_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F15_A81EntidadId[0] == A81EntidadId ) && ( T000F15_A42EmpresaId[0] == A42EmpresaId ) && ( T000F15_A35CfgComprobanteDetalleLetra[0] > A35CfgComprobanteDetalleLetra ) ) )
         {
            A42EmpresaId = T000F15_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            A81EntidadId = T000F15_A81EntidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
            A31CfgComprobanteId = T000F15_A31CfgComprobanteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
            A32CfgComprobantePrefijo = T000F15_A32CfgComprobantePrefijo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            A55ComprobanteNumero = T000F15_A55ComprobanteNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
            A35CfgComprobanteDetalleLetra = T000F15_A35CfgComprobanteDetalleLetra[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T000F16 */
      pr_default.execute(14, new Object[] {new Integer(A42EmpresaId), new Integer(A42EmpresaId), new Integer(A81EntidadId), new Integer(A81EntidadId), new Integer(A42EmpresaId), A31CfgComprobanteId, A31CfgComprobanteId, new Integer(A81EntidadId), new Integer(A42EmpresaId), new Short(A32CfgComprobantePrefijo), new Short(A32CfgComprobantePrefijo), A31CfgComprobanteId, new Integer(A81EntidadId), new Integer(A42EmpresaId), new Integer(A55ComprobanteNumero), new Integer(A55ComprobanteNumero), new Short(A32CfgComprobantePrefijo), A31CfgComprobanteId, new Integer(A81EntidadId), new Integer(A42EmpresaId), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T000F16_A42EmpresaId[0] > A42EmpresaId ) || ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( T000F16_A81EntidadId[0] > A81EntidadId ) || ( T000F16_A81EntidadId[0] == A81EntidadId ) && ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( GXutil.strcmp(T000F16_A31CfgComprobanteId[0], A31CfgComprobanteId) > 0 ) || ( GXutil.strcmp(T000F16_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F16_A81EntidadId[0] == A81EntidadId ) && ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( T000F16_A32CfgComprobantePrefijo[0] > A32CfgComprobantePrefijo ) || ( T000F16_A32CfgComprobantePrefijo[0] == A32CfgComprobantePrefijo ) && ( GXutil.strcmp(T000F16_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F16_A81EntidadId[0] == A81EntidadId ) && ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( T000F16_A55ComprobanteNumero[0] > A55ComprobanteNumero ) || ( T000F16_A55ComprobanteNumero[0] == A55ComprobanteNumero ) && ( T000F16_A32CfgComprobantePrefijo[0] == A32CfgComprobantePrefijo ) && ( GXutil.strcmp(T000F16_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F16_A81EntidadId[0] == A81EntidadId ) && ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( T000F16_A35CfgComprobanteDetalleLetra[0] > A35CfgComprobanteDetalleLetra ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T000F16_A42EmpresaId[0] < A42EmpresaId ) || ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( T000F16_A81EntidadId[0] < A81EntidadId ) || ( T000F16_A81EntidadId[0] == A81EntidadId ) && ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( GXutil.strcmp(T000F16_A31CfgComprobanteId[0], A31CfgComprobanteId) < 0 ) || ( GXutil.strcmp(T000F16_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F16_A81EntidadId[0] == A81EntidadId ) && ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( T000F16_A32CfgComprobantePrefijo[0] < A32CfgComprobantePrefijo ) || ( T000F16_A32CfgComprobantePrefijo[0] == A32CfgComprobantePrefijo ) && ( GXutil.strcmp(T000F16_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F16_A81EntidadId[0] == A81EntidadId ) && ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( T000F16_A55ComprobanteNumero[0] < A55ComprobanteNumero ) || ( T000F16_A55ComprobanteNumero[0] == A55ComprobanteNumero ) && ( T000F16_A32CfgComprobantePrefijo[0] == A32CfgComprobantePrefijo ) && ( GXutil.strcmp(T000F16_A31CfgComprobanteId[0], A31CfgComprobanteId) == 0 ) && ( T000F16_A81EntidadId[0] == A81EntidadId ) && ( T000F16_A42EmpresaId[0] == A42EmpresaId ) && ( T000F16_A35CfgComprobanteDetalleLetra[0] < A35CfgComprobanteDetalleLetra ) ) )
         {
            A42EmpresaId = T000F16_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            A81EntidadId = T000F16_A81EntidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
            A31CfgComprobanteId = T000F16_A31CfgComprobanteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
            A32CfgComprobantePrefijo = T000F16_A32CfgComprobantePrefijo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
            A55ComprobanteNumero = T000F16_A55ComprobanteNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
            A35CfgComprobanteDetalleLetra = T000F16_A35CfgComprobanteDetalleLetra[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0F35( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0F35( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound35 == 1 )
         {
            if ( ( A42EmpresaId != Z42EmpresaId ) || ( A81EntidadId != Z81EntidadId ) || ( GXutil.strcmp(A31CfgComprobanteId, Z31CfgComprobanteId) != 0 ) || ( A32CfgComprobantePrefijo != Z32CfgComprobantePrefijo ) || ( A55ComprobanteNumero != Z55ComprobanteNumero ) || ( A35CfgComprobanteDetalleLetra != Z35CfgComprobanteDetalleLetra ) )
            {
               A42EmpresaId = Z42EmpresaId ;
               httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
               A81EntidadId = Z81EntidadId ;
               httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
               A31CfgComprobanteId = Z31CfgComprobanteId ;
               httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
               A32CfgComprobantePrefijo = Z32CfgComprobantePrefijo ;
               httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
               A55ComprobanteNumero = Z55ComprobanteNumero ;
               httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
               A35CfgComprobanteDetalleLetra = Z35CfgComprobanteDetalleLetra ;
               httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRESAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmpresaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmpresaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0F35( ) ;
               GX_FocusControl = edtEmpresaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A42EmpresaId != Z42EmpresaId ) || ( A81EntidadId != Z81EntidadId ) || ( GXutil.strcmp(A31CfgComprobanteId, Z31CfgComprobanteId) != 0 ) || ( A32CfgComprobantePrefijo != Z32CfgComprobantePrefijo ) || ( A55ComprobanteNumero != Z55ComprobanteNumero ) || ( A35CfgComprobanteDetalleLetra != Z35CfgComprobanteDetalleLetra ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmpresaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0F35( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRESAID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmpresaId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtEmpresaId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0F35( ) ;
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
      if ( ( A42EmpresaId != Z42EmpresaId ) || ( A81EntidadId != Z81EntidadId ) || ( GXutil.strcmp(A31CfgComprobanteId, Z31CfgComprobanteId) != 0 ) || ( A32CfgComprobantePrefijo != Z32CfgComprobantePrefijo ) || ( A55ComprobanteNumero != Z55ComprobanteNumero ) || ( A35CfgComprobanteDetalleLetra != Z35CfgComprobanteDetalleLetra ) )
      {
         A42EmpresaId = Z42EmpresaId ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         A81EntidadId = Z81EntidadId ;
         httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
         A31CfgComprobanteId = Z31CfgComprobanteId ;
         httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
         A32CfgComprobantePrefijo = Z32CfgComprobantePrefijo ;
         httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
         A55ComprobanteNumero = Z55ComprobanteNumero ;
         httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
         A35CfgComprobanteDetalleLetra = Z35CfgComprobanteDetalleLetra ;
         httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
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
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtComprobanteEntidadNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0F35( ) ;
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtComprobanteEntidadNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0F35( ) ;
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
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtComprobanteEntidadNombre_Internalname ;
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
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtComprobanteEntidadNombre_Internalname ;
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
      scanStart0F35( ) ;
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound35 != 0 )
         {
            scanNext0F35( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtComprobanteEntidadNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0F35( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0F35( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000F5 */
         pr_default.execute(3, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Comprobante"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z57ComprobanteEntidadNombre, T000F5_A57ComprobanteEntidadNombre[0]) != 0 ) || !( GXutil.dateCompare(Z61ComprobanteFecha, T000F5_A61ComprobanteFecha[0]) ) || !( GXutil.dateCompare(Z62ComprobanteFechaSubdiario, T000F5_A62ComprobanteFechaSubdiario[0]) ) || !( GXutil.dateCompare(Z60ComprobanteVto, T000F5_A60ComprobanteVto[0]) ) || ( Z67MonedaId != T000F5_A67MonedaId[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Comprobante"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0F35( )
   {
      beforeValidate0F35( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F35( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0F35( 0) ;
         checkOptimisticConcurrency0F35( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F35( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0F35( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000F17 */
                  pr_default.execute(15, new Object[] {new Integer(A55ComprobanteNumero), A57ComprobanteEntidadNombre, A61ComprobanteFecha, A62ComprobanteFechaSubdiario, A60ComprobanteVto, new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra), new Short(A67MonedaId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Comprobante") ;
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
                        processLevel0F35( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption0F0( ) ;
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
            load0F35( ) ;
         }
         endLevel0F35( ) ;
      }
      closeExtendedTableCursors0F35( ) ;
   }

   public void update0F35( )
   {
      beforeValidate0F35( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F35( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F35( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F35( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0F35( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000F18 */
                  pr_default.execute(16, new Object[] {A57ComprobanteEntidadNombre, A61ComprobanteFecha, A62ComprobanteFechaSubdiario, A60ComprobanteVto, new Short(A67MonedaId), new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Comprobante") ;
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Comprobante"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0F35( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0F35( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                           resetCaption0F0( ) ;
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
         endLevel0F35( ) ;
      }
      closeExtendedTableCursors0F35( ) ;
   }

   public void deferredUpdate0F35( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0F35( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F35( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0F35( ) ;
         afterConfirm0F35( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0F35( ) ;
            if ( AnyError == 0 )
            {
               scanStart0F36( ) ;
               while ( RcdFound36 != 0 )
               {
                  getByPrimaryKey0F36( ) ;
                  delete0F36( ) ;
                  scanNext0F36( ) ;
               }
               scanEnd0F36( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000F19 */
                  pr_default.execute(17, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Comprobante") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound35 == 0 )
                        {
                           initAll0F35( ) ;
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
                        resetCaption0F0( ) ;
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
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0F35( ) ;
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0F35( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel0F36( )
   {
      nGXsfl_82_idx = (short)(0) ;
      while ( nGXsfl_82_idx < nRC_GXsfl_82 )
      {
         readRow0F36( ) ;
         if ( ( nRcdExists_36 != 0 ) || ( nIsMod_36 != 0 ) )
         {
            standaloneNotModal0F36( ) ;
            getKey0F36( ) ;
            if ( ( nRcdExists_36 == 0 ) && ( nRcdDeleted_36 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0F36( ) ;
            }
            else
            {
               if ( RcdFound36 != 0 )
               {
                  if ( ( nRcdDeleted_36 != 0 ) && ( nRcdExists_36 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0F36( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_36 != 0 ) && ( nRcdExists_36 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0F36( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_36 == 0 )
                  {
                     GXCCtl = "ARTICULOID_" + sGXsfl_82_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtArticuloId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtArticuloId_Internalname, A39ArticuloId) ;
         httpContext.changePostValue( edtComprobanteArticuloNombre_Internalname, A63ComprobanteArticuloNombre) ;
         httpContext.changePostValue( edtComprobanteArticuloCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A64ComprobanteArticuloCantidad, (byte)(10), (byte)(3), ",", ""))) ;
         httpContext.changePostValue( edtComprobanteArticuloPrecioUnit_Internalname, GXutil.ltrim( localUtil.ntoc( A65ComprobanteArticuloPrecioUnit, (byte)(12), (byte)(2), ",", ""))) ;
         httpContext.changePostValue( edtComprobanteArticuloTotalCalcul_Internalname, GXutil.ltrim( localUtil.ntoc( A70ComprobanteArticuloTotalCalcul, (byte)(12), (byte)(2), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z39ArticuloId_"+sGXsfl_82_idx, Z39ArticuloId) ;
         httpContext.changePostValue( "ZT_"+"Z63ComprobanteArticuloNombre_"+sGXsfl_82_idx, Z63ComprobanteArticuloNombre) ;
         httpContext.changePostValue( "ZT_"+"Z64ComprobanteArticuloCantidad_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( Z64ComprobanteArticuloCantidad, (byte)(10), (byte)(3), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z65ComprobanteArticuloPrecioUnit_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( Z65ComprobanteArticuloPrecioUnit, (byte)(12), (byte)(2), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z66ComprobanteArticuloTotal_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( Z66ComprobanteArticuloTotal, (byte)(12), (byte)(2), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_36_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_36, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_36_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_36, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_36_"+sGXsfl_82_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_36, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_36 != 0 )
         {
            httpContext.changePostValue( "ARTICULOID_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArticuloId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMPROBANTEARTICULONOMBRE_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloNombre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMPROBANTEARTICULOCANTIDAD_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloCantidad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMPROBANTEARTICULOPRECIOUNIT_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloPrecioUnit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMPROBANTEARTICULOTOTALCALCUL_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloTotalCalcul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0F36( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_36 = (short)(0) ;
      nIsMod_36 = (short)(0) ;
      nRcdDeleted_36 = (short)(0) ;
   }

   public void processLevel0F35( )
   {
      /* Save parent mode. */
      sMode35 = Gx_mode ;
      processNestedLevel0F36( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel0F35( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0F35( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "comprobante");
         if ( AnyError == 0 )
         {
            confirmValues0F0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "comprobante");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0F35( )
   {
      /* Using cursor T000F20 */
      pr_default.execute(18);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A42EmpresaId = T000F20_A42EmpresaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         A81EntidadId = T000F20_A81EntidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
         A31CfgComprobanteId = T000F20_A31CfgComprobanteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
         A32CfgComprobantePrefijo = T000F20_A32CfgComprobantePrefijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
         A55ComprobanteNumero = T000F20_A55ComprobanteNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
         A35CfgComprobanteDetalleLetra = T000F20_A35CfgComprobanteDetalleLetra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0F35( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A42EmpresaId = T000F20_A42EmpresaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         A81EntidadId = T000F20_A81EntidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
         A31CfgComprobanteId = T000F20_A31CfgComprobanteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
         A32CfgComprobantePrefijo = T000F20_A32CfgComprobantePrefijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
         A55ComprobanteNumero = T000F20_A55ComprobanteNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
         A35CfgComprobanteDetalleLetra = T000F20_A35CfgComprobanteDetalleLetra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
      }
   }

   public void scanEnd0F35( )
   {
      pr_default.close(18);
   }

   public void afterConfirm0F35( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0F35( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0F35( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0F35( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0F35( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0F35( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0F35( )
   {
      edtEmpresaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaId_Enabled, 5, 0)));
      edtEntidadId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadId_Enabled, 5, 0)));
      edtCfgComprobanteId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobanteId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobanteId_Enabled, 5, 0)));
      edtCfgComprobantePrefijo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCfgComprobantePrefijo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCfgComprobantePrefijo_Enabled, 5, 0)));
      edtComprobanteNumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteNumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteNumero_Enabled, 5, 0)));
      cmbCfgComprobanteDetalleLetra.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCfgComprobanteDetalleLetra.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCfgComprobanteDetalleLetra.getEnabled(), 5, 0)));
      edtComprobanteEntidadNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteEntidadNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteEntidadNombre_Enabled, 5, 0)));
      edtComprobanteFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteFecha_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteFecha_Enabled, 5, 0)));
      edtComprobanteFechaSubdiario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteFechaSubdiario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteFechaSubdiario_Enabled, 5, 0)));
      edtComprobanteVto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteVto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteVto_Enabled, 5, 0)));
      edtMonedaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMonedaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMonedaId_Enabled, 5, 0)));
   }

   public void zm0F36( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z63ComprobanteArticuloNombre = T000F3_A63ComprobanteArticuloNombre[0] ;
            Z64ComprobanteArticuloCantidad = T000F3_A64ComprobanteArticuloCantidad[0] ;
            Z65ComprobanteArticuloPrecioUnit = T000F3_A65ComprobanteArticuloPrecioUnit[0] ;
            Z66ComprobanteArticuloTotal = T000F3_A66ComprobanteArticuloTotal[0] ;
         }
         else
         {
            Z63ComprobanteArticuloNombre = A63ComprobanteArticuloNombre ;
            Z64ComprobanteArticuloCantidad = A64ComprobanteArticuloCantidad ;
            Z65ComprobanteArticuloPrecioUnit = A65ComprobanteArticuloPrecioUnit ;
            Z66ComprobanteArticuloTotal = A66ComprobanteArticuloTotal ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z42EmpresaId = A42EmpresaId ;
         Z81EntidadId = A81EntidadId ;
         Z31CfgComprobanteId = A31CfgComprobanteId ;
         Z32CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         Z55ComprobanteNumero = A55ComprobanteNumero ;
         Z35CfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
         Z63ComprobanteArticuloNombre = A63ComprobanteArticuloNombre ;
         Z64ComprobanteArticuloCantidad = A64ComprobanteArticuloCantidad ;
         Z65ComprobanteArticuloPrecioUnit = A65ComprobanteArticuloPrecioUnit ;
         Z66ComprobanteArticuloTotal = A66ComprobanteArticuloTotal ;
         Z39ArticuloId = A39ArticuloId ;
         Z40ArticuloNombre = A40ArticuloNombre ;
      }
   }

   public void standaloneNotModal0F36( )
   {
      edtComprobanteArticuloNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloNombre_Enabled, 5, 0)));
      edtComprobanteArticuloTotalCalcul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloTotalCalcul_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloTotalCalcul_Enabled, 5, 0)));
   }

   public void standaloneModal0F36( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtArticuloId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArticuloId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtArticuloId_Enabled, 5, 0)));
      }
      else
      {
         edtArticuloId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArticuloId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtArticuloId_Enabled, 5, 0)));
      }
   }

   public void load0F36( )
   {
      /* Using cursor T000F21 */
      pr_default.execute(19, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra), A39ArticuloId});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A63ComprobanteArticuloNombre = T000F21_A63ComprobanteArticuloNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloNombre_Internalname, A63ComprobanteArticuloNombre);
         A40ArticuloNombre = T000F21_A40ArticuloNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40ArticuloNombre", A40ArticuloNombre);
         A64ComprobanteArticuloCantidad = T000F21_A64ComprobanteArticuloCantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloCantidad_Internalname, GXutil.ltrim( GXutil.str( A64ComprobanteArticuloCantidad, 10, 3)));
         A65ComprobanteArticuloPrecioUnit = T000F21_A65ComprobanteArticuloPrecioUnit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloPrecioUnit_Internalname, GXutil.ltrim( GXutil.str( A65ComprobanteArticuloPrecioUnit, 12, 2)));
         A66ComprobanteArticuloTotal = T000F21_A66ComprobanteArticuloTotal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66ComprobanteArticuloTotal", GXutil.ltrim( GXutil.str( A66ComprobanteArticuloTotal, 12, 2)));
         zm0F36( -10) ;
      }
      pr_default.close(19);
      onLoadActions0F36( ) ;
   }

   public void onLoadActions0F36( )
   {
      if ( true /* After */ )
      {
         A63ComprobanteArticuloNombre = A40ArticuloNombre ;
         httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloNombre_Internalname, A63ComprobanteArticuloNombre);
      }
      A70ComprobanteArticuloTotalCalcul = A64ComprobanteArticuloCantidad.multiply(A65ComprobanteArticuloPrecioUnit) ;
      httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloTotalCalcul_Internalname, GXutil.ltrim( GXutil.str( A70ComprobanteArticuloTotalCalcul, 12, 2)));
   }

   public void checkExtendedTable0F36( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0F36( ) ;
      /* Using cursor T000F4 */
      pr_default.execute(2, new Object[] {A39ArticuloId});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ARTICULOID_" + sGXsfl_82_idx ;
         httpContext.GX_msglist.addItem("No existe 'Articulo'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArticuloId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A40ArticuloNombre = T000F4_A40ArticuloNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A40ArticuloNombre", A40ArticuloNombre);
      pr_default.close(2);
      if ( true /* After */ )
      {
         A63ComprobanteArticuloNombre = A40ArticuloNombre ;
         httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloNombre_Internalname, A63ComprobanteArticuloNombre);
      }
      A70ComprobanteArticuloTotalCalcul = A64ComprobanteArticuloCantidad.multiply(A65ComprobanteArticuloPrecioUnit) ;
      httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloTotalCalcul_Internalname, GXutil.ltrim( GXutil.str( A70ComprobanteArticuloTotalCalcul, 12, 2)));
   }

   public void closeExtendedTableCursors0F36( )
   {
      pr_default.close(2);
   }

   public void enableDisable0F36( )
   {
   }

   public void gxload_11( String A39ArticuloId )
   {
      /* Using cursor T000F22 */
      pr_default.execute(20, new Object[] {A39ArticuloId});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "ARTICULOID_" + sGXsfl_82_idx ;
         httpContext.GX_msglist.addItem("No existe 'Articulo'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArticuloId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A40ArticuloNombre = T000F22_A40ArticuloNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A40ArticuloNombre", A40ArticuloNombre);
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A40ArticuloNombre)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(20);
   }

   public void getKey0F36( )
   {
      /* Using cursor T000F23 */
      pr_default.execute(21, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra), A39ArticuloId});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound36 = (short)(1) ;
      }
      else
      {
         RcdFound36 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey0F36( )
   {
      /* Using cursor T000F3 */
      pr_default.execute(1, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra), A39ArticuloId});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0F36( 10) ;
         RcdFound36 = (short)(1) ;
         initializeNonKey0F36( ) ;
         A63ComprobanteArticuloNombre = T000F3_A63ComprobanteArticuloNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloNombre_Internalname, A63ComprobanteArticuloNombre);
         A64ComprobanteArticuloCantidad = T000F3_A64ComprobanteArticuloCantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloCantidad_Internalname, GXutil.ltrim( GXutil.str( A64ComprobanteArticuloCantidad, 10, 3)));
         A65ComprobanteArticuloPrecioUnit = T000F3_A65ComprobanteArticuloPrecioUnit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloPrecioUnit_Internalname, GXutil.ltrim( GXutil.str( A65ComprobanteArticuloPrecioUnit, 12, 2)));
         A66ComprobanteArticuloTotal = T000F3_A66ComprobanteArticuloTotal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66ComprobanteArticuloTotal", GXutil.ltrim( GXutil.str( A66ComprobanteArticuloTotal, 12, 2)));
         A39ArticuloId = T000F3_A39ArticuloId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtArticuloId_Internalname, A39ArticuloId);
         Z42EmpresaId = A42EmpresaId ;
         Z81EntidadId = A81EntidadId ;
         Z31CfgComprobanteId = A31CfgComprobanteId ;
         Z32CfgComprobantePrefijo = A32CfgComprobantePrefijo ;
         Z55ComprobanteNumero = A55ComprobanteNumero ;
         Z35CfgComprobanteDetalleLetra = A35CfgComprobanteDetalleLetra ;
         Z39ArticuloId = A39ArticuloId ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0F36( ) ;
         load0F36( ) ;
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound36 = (short)(0) ;
         initializeNonKey0F36( ) ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0F36( ) ;
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0F36( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0F36( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000F2 */
         pr_default.execute(0, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra), A39ArticuloId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ComprobanteArticulo"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z63ComprobanteArticuloNombre, T000F2_A63ComprobanteArticuloNombre[0]) != 0 ) || ( DecimalUtil.compareTo(Z64ComprobanteArticuloCantidad, T000F2_A64ComprobanteArticuloCantidad[0]) != 0 ) || ( DecimalUtil.compareTo(Z65ComprobanteArticuloPrecioUnit, T000F2_A65ComprobanteArticuloPrecioUnit[0]) != 0 ) || ( DecimalUtil.compareTo(Z66ComprobanteArticuloTotal, T000F2_A66ComprobanteArticuloTotal[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ComprobanteArticulo"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0F36( )
   {
      beforeValidate0F36( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F36( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0F36( 0) ;
         checkOptimisticConcurrency0F36( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F36( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0F36( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000F24 */
                  pr_default.execute(22, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra), A63ComprobanteArticuloNombre, A64ComprobanteArticuloCantidad, A65ComprobanteArticuloPrecioUnit, A66ComprobanteArticuloTotal, A39ArticuloId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ComprobanteArticulo") ;
                  if ( (pr_default.getStatus(22) == 1) )
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
            load0F36( ) ;
         }
         endLevel0F36( ) ;
      }
      closeExtendedTableCursors0F36( ) ;
   }

   public void update0F36( )
   {
      beforeValidate0F36( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F36( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F36( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F36( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0F36( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000F25 */
                  pr_default.execute(23, new Object[] {A63ComprobanteArticuloNombre, A64ComprobanteArticuloCantidad, A65ComprobanteArticuloPrecioUnit, A66ComprobanteArticuloTotal, new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra), A39ArticuloId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ComprobanteArticulo") ;
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ComprobanteArticulo"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0F36( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0F36( ) ;
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
         endLevel0F36( ) ;
      }
      closeExtendedTableCursors0F36( ) ;
   }

   public void deferredUpdate0F36( )
   {
   }

   public void delete0F36( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0F36( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F36( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0F36( ) ;
         afterConfirm0F36( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0F36( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000F26 */
               pr_default.execute(24, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra), A39ArticuloId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ComprobanteArticulo") ;
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
      sMode36 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0F36( ) ;
      Gx_mode = sMode36 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0F36( )
   {
      standaloneModal0F36( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000F27 */
         pr_default.execute(25, new Object[] {A39ArticuloId});
         A40ArticuloNombre = T000F27_A40ArticuloNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40ArticuloNombre", A40ArticuloNombre);
         pr_default.close(25);
         A70ComprobanteArticuloTotalCalcul = A64ComprobanteArticuloCantidad.multiply(A65ComprobanteArticuloPrecioUnit) ;
         httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloTotalCalcul_Internalname, GXutil.ltrim( GXutil.str( A70ComprobanteArticuloTotalCalcul, 12, 2)));
      }
   }

   public void endLevel0F36( )
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

   public void scanStart0F36( )
   {
      /* Scan By routine */
      /* Using cursor T000F28 */
      pr_default.execute(26, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Integer(A55ComprobanteNumero), new Byte(A35CfgComprobanteDetalleLetra)});
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A39ArticuloId = T000F28_A39ArticuloId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtArticuloId_Internalname, A39ArticuloId);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0F36( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A39ArticuloId = T000F28_A39ArticuloId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtArticuloId_Internalname, A39ArticuloId);
      }
   }

   public void scanEnd0F36( )
   {
      pr_default.close(26);
   }

   public void afterConfirm0F36( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0F36( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0F36( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0F36( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0F36( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0F36( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0F36( )
   {
      edtArticuloId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArticuloId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtArticuloId_Enabled, 5, 0)));
      edtComprobanteArticuloNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloNombre_Enabled, 5, 0)));
      edtComprobanteArticuloCantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloCantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloCantidad_Enabled, 5, 0)));
      edtComprobanteArticuloPrecioUnit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloPrecioUnit_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloPrecioUnit_Enabled, 5, 0)));
      edtComprobanteArticuloTotalCalcul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloTotalCalcul_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloTotalCalcul_Enabled, 5, 0)));
   }

   public void subsflControlProps_8236( )
   {
      edtArticuloId_Internalname = "ARTICULOID_"+sGXsfl_82_idx ;
      imgprompt_39_Internalname = "PROMPT_39_"+sGXsfl_82_idx ;
      edtComprobanteArticuloNombre_Internalname = "COMPROBANTEARTICULONOMBRE_"+sGXsfl_82_idx ;
      edtComprobanteArticuloCantidad_Internalname = "COMPROBANTEARTICULOCANTIDAD_"+sGXsfl_82_idx ;
      edtComprobanteArticuloPrecioUnit_Internalname = "COMPROBANTEARTICULOPRECIOUNIT_"+sGXsfl_82_idx ;
      edtComprobanteArticuloTotalCalcul_Internalname = "COMPROBANTEARTICULOTOTALCALCUL_"+sGXsfl_82_idx ;
   }

   public void subsflControlProps_fel_8236( )
   {
      edtArticuloId_Internalname = "ARTICULOID_"+sGXsfl_82_fel_idx ;
      imgprompt_39_Internalname = "PROMPT_39_"+sGXsfl_82_fel_idx ;
      edtComprobanteArticuloNombre_Internalname = "COMPROBANTEARTICULONOMBRE_"+sGXsfl_82_fel_idx ;
      edtComprobanteArticuloCantidad_Internalname = "COMPROBANTEARTICULOCANTIDAD_"+sGXsfl_82_fel_idx ;
      edtComprobanteArticuloPrecioUnit_Internalname = "COMPROBANTEARTICULOPRECIOUNIT_"+sGXsfl_82_fel_idx ;
      edtComprobanteArticuloTotalCalcul_Internalname = "COMPROBANTEARTICULOTOTALCALCUL_"+sGXsfl_82_fel_idx ;
   }

   public void addRow0F36( )
   {
      nGXsfl_82_idx = (short)(nGXsfl_82_idx+1) ;
      sGXsfl_82_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_82_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_8236( ) ;
      sendRow0F36( ) ;
   }

   public void sendRow0F36( )
   {
      Gridcomprobante_articuloRow = GXWebRow.GetNew(context) ;
      if ( subGridcomprobante_articulo_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridcomprobante_articulo_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridcomprobante_articulo_Class, "") != 0 )
         {
            subGridcomprobante_articulo_Linesclass = subGridcomprobante_articulo_Class+"Odd" ;
         }
      }
      else if ( subGridcomprobante_articulo_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridcomprobante_articulo_Backstyle = (byte)(0) ;
         subGridcomprobante_articulo_Backcolor = subGridcomprobante_articulo_Allbackcolor ;
         if ( GXutil.strcmp(subGridcomprobante_articulo_Class, "") != 0 )
         {
            subGridcomprobante_articulo_Linesclass = subGridcomprobante_articulo_Class+"Uniform" ;
         }
      }
      else if ( subGridcomprobante_articulo_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridcomprobante_articulo_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridcomprobante_articulo_Class, "") != 0 )
         {
            subGridcomprobante_articulo_Linesclass = subGridcomprobante_articulo_Class+"Odd" ;
         }
         subGridcomprobante_articulo_Backcolor = (int)(0x0) ;
      }
      else if ( subGridcomprobante_articulo_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridcomprobante_articulo_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_82_idx) % (2))) == 0 )
         {
            subGridcomprobante_articulo_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridcomprobante_articulo_Class, "") != 0 )
            {
               subGridcomprobante_articulo_Linesclass = subGridcomprobante_articulo_Class+"Even" ;
            }
         }
         else
         {
            subGridcomprobante_articulo_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridcomprobante_articulo_Class, "") != 0 )
            {
               subGridcomprobante_articulo_Linesclass = subGridcomprobante_articulo_Class+"Odd" ;
            }
         }
      }
      imgprompt_39_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx00d0"+"',["+"{Ctrl:gx.dom.el('"+"ARTICULOID_"+sGXsfl_82_idx+"'), id:'"+"ARTICULOID_"+sGXsfl_82_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_36_"+sGXsfl_82_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.kberp.gx0106"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"EMPRESAID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"EMPRESAID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ENTIDADID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"ENTIDADID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CFGCOMPROBANTEID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"CFGCOMPROBANTEID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CFGCOMPROBANTEPREFIJO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"CFGCOMPROBANTEPREFIJO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"COMPROBANTENUMERO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"COMPROBANTENUMERO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CFGCOMPROBANTEDETALLELETRA"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"CFGCOMPROBANTEDETALLELETRA"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ARTICULOID_"',3),t(+,5),t(sGXsfl_82_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"ARTICULOID_"',3),t(+,5),t(sGXsfl_82_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_36_"',3),t(+,5),t(sGXsfl_82_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_42_81_31_32_55_35,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_36_" + sGXsfl_82_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_82_idx + "',82)\"" ;
      ROClassString = "Attribute" ;
      Gridcomprobante_articuloRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArticuloId_Internalname,A39ArticuloId,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArticuloId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtArticuloId_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(82),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"IdArticulo","left"});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
      Gridcomprobante_articuloRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_39_Internalname,sImgUrl,imgprompt_39_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_39_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridcomprobante_articuloRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteArticuloNombre_Internalname,A63ComprobanteArticuloNombre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteArticuloNombre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtComprobanteArticuloNombre_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(250),new Integer(0),new Integer(0),new Integer(82),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"NombreTablasMaestras","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_36_" + sGXsfl_82_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_82_idx + "',82)\"" ;
      ROClassString = "Attribute" ;
      Gridcomprobante_articuloRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteArticuloCantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A64ComprobanteArticuloCantidad, (byte)(10), (byte)(3), ",", "")),((edtComprobanteArticuloCantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( A64ComprobanteArticuloCantidad, "ZZZZZ9.999")) : localUtil.format( A64ComprobanteArticuloCantidad, "ZZZZZ9.999")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','3');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteArticuloCantidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtComprobanteArticuloCantidad_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(82),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Cantidades","right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_36_" + sGXsfl_82_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_82_idx + "',82)\"" ;
      ROClassString = "Attribute" ;
      Gridcomprobante_articuloRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteArticuloPrecioUnit_Internalname,GXutil.ltrim( localUtil.ntoc( A65ComprobanteArticuloPrecioUnit, (byte)(12), (byte)(2), ",", "")),((edtComprobanteArticuloPrecioUnit_Enabled!=0) ? GXutil.ltrim( localUtil.format( A65ComprobanteArticuloPrecioUnit, "ZZZZZZZZ9.99")) : localUtil.format( A65ComprobanteArticuloPrecioUnit, "ZZZZZZZZ9.99")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteArticuloPrecioUnit_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtComprobanteArticuloPrecioUnit_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(12),new Integer(0),new Integer(0),new Integer(82),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Importes","right"});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridcomprobante_articuloRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComprobanteArticuloTotalCalcul_Internalname,GXutil.ltrim( localUtil.ntoc( A70ComprobanteArticuloTotalCalcul, (byte)(12), (byte)(2), ",", "")),((edtComprobanteArticuloTotalCalcul_Enabled!=0) ? GXutil.ltrim( localUtil.format( A70ComprobanteArticuloTotalCalcul, "ZZZZZZZZ9.99")) : localUtil.format( A70ComprobanteArticuloTotalCalcul, "ZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComprobanteArticuloTotalCalcul_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtComprobanteArticuloTotalCalcul_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(12),new Integer(0),new Integer(0),new Integer(82),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Importes","right"});
      httpContext.ajax_sending_grid_row(Gridcomprobante_articuloRow);
      GXCCtl = "Z39ArticuloId_" + sGXsfl_82_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z39ArticuloId);
      GXCCtl = "Z63ComprobanteArticuloNombre_" + sGXsfl_82_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z63ComprobanteArticuloNombre);
      GXCCtl = "Z64ComprobanteArticuloCantidad_" + sGXsfl_82_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z64ComprobanteArticuloCantidad, (byte)(10), (byte)(3), ",", "")));
      GXCCtl = "Z65ComprobanteArticuloPrecioUnit_" + sGXsfl_82_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z65ComprobanteArticuloPrecioUnit, (byte)(12), (byte)(2), ",", "")));
      GXCCtl = "Z66ComprobanteArticuloTotal_" + sGXsfl_82_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z66ComprobanteArticuloTotal, (byte)(12), (byte)(2), ",", "")));
      GXCCtl = "nRcdDeleted_36_" + sGXsfl_82_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_36, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_36_" + sGXsfl_82_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_36, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_36_" + sGXsfl_82_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_36, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ARTICULOID_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArticuloId_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "COMPROBANTEARTICULONOMBRE_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloNombre_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "COMPROBANTEARTICULOCANTIDAD_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloCantidad_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "COMPROBANTEARTICULOPRECIOUNIT_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloPrecioUnit_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "COMPROBANTEARTICULOTOTALCALCUL_"+sGXsfl_82_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComprobanteArticuloTotalCalcul_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "PROMPT_39_"+sGXsfl_82_idx+"Link", GXutil.rtrim( imgprompt_39_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridcomprobante_articuloContainer.AddRow(Gridcomprobante_articuloRow);
   }

   public void readRow0F36( )
   {
      nGXsfl_82_idx = (short)(nGXsfl_82_idx+1) ;
      sGXsfl_82_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_82_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_8236( ) ;
      edtArticuloId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTICULOID_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
      edtComprobanteArticuloNombre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMPROBANTEARTICULONOMBRE_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
      edtComprobanteArticuloCantidad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMPROBANTEARTICULOCANTIDAD_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
      edtComprobanteArticuloPrecioUnit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMPROBANTEARTICULOPRECIOUNIT_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
      edtComprobanteArticuloTotalCalcul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMPROBANTEARTICULOTOTALCALCUL_"+sGXsfl_82_idx+"Enabled"), ",", ".")) ;
      imgprompt_42_81_Link = httpContext.cgiGet( "PROMPT_39_"+sGXsfl_82_idx+"Link") ;
      A39ArticuloId = httpContext.cgiGet( edtArticuloId_Internalname) ;
      A63ComprobanteArticuloNombre = httpContext.cgiGet( edtComprobanteArticuloNombre_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloCantidad_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloCantidad_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "COMPROBANTEARTICULOCANTIDAD_" + sGXsfl_82_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtComprobanteArticuloCantidad_Internalname ;
         wbErr = true ;
         A64ComprobanteArticuloCantidad = DecimalUtil.ZERO ;
      }
      else
      {
         A64ComprobanteArticuloCantidad = localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloCantidad_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloPrecioUnit_Internalname)), DecimalUtil.stringToDec("-99999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloPrecioUnit_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
      {
         GXCCtl = "COMPROBANTEARTICULOPRECIOUNIT_" + sGXsfl_82_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtComprobanteArticuloPrecioUnit_Internalname ;
         wbErr = true ;
         A65ComprobanteArticuloPrecioUnit = DecimalUtil.ZERO ;
      }
      else
      {
         A65ComprobanteArticuloPrecioUnit = localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloPrecioUnit_Internalname)) ;
      }
      A70ComprobanteArticuloTotalCalcul = localUtil.ctond( httpContext.cgiGet( edtComprobanteArticuloTotalCalcul_Internalname)) ;
      GXCCtl = "Z39ArticuloId_" + sGXsfl_82_idx ;
      Z39ArticuloId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z63ComprobanteArticuloNombre_" + sGXsfl_82_idx ;
      Z63ComprobanteArticuloNombre = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z64ComprobanteArticuloCantidad_" + sGXsfl_82_idx ;
      Z64ComprobanteArticuloCantidad = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z65ComprobanteArticuloPrecioUnit_" + sGXsfl_82_idx ;
      Z65ComprobanteArticuloPrecioUnit = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z66ComprobanteArticuloTotal_" + sGXsfl_82_idx ;
      Z66ComprobanteArticuloTotal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z66ComprobanteArticuloTotal_" + sGXsfl_82_idx ;
      A66ComprobanteArticuloTotal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_36_" + sGXsfl_82_idx ;
      nRcdDeleted_36 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_36_" + sGXsfl_82_idx ;
      nRcdExists_36 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_36_" + sGXsfl_82_idx ;
      nIsMod_36 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtComprobanteArticuloTotalCalcul_Enabled = edtComprobanteArticuloTotalCalcul_Enabled ;
      defedtComprobanteArticuloNombre_Enabled = edtComprobanteArticuloNombre_Enabled ;
      defedtArticuloId_Enabled = edtArticuloId_Enabled ;
   }

   public void confirmValues0F0( )
   {
      nGXsfl_82_idx = (short)(0) ;
      sGXsfl_82_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_82_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_8236( ) ;
      while ( nGXsfl_82_idx < nRC_GXsfl_82 )
      {
         nGXsfl_82_idx = (short)(nGXsfl_82_idx+1) ;
         sGXsfl_82_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_82_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_8236( ) ;
         httpContext.changePostValue( "Z39ArticuloId_"+sGXsfl_82_idx, httpContext.cgiGet( "ZT_"+"Z39ArticuloId_"+sGXsfl_82_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z39ArticuloId_"+sGXsfl_82_idx) ;
         httpContext.changePostValue( "Z63ComprobanteArticuloNombre_"+sGXsfl_82_idx, httpContext.cgiGet( "ZT_"+"Z63ComprobanteArticuloNombre_"+sGXsfl_82_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z63ComprobanteArticuloNombre_"+sGXsfl_82_idx) ;
         httpContext.changePostValue( "Z64ComprobanteArticuloCantidad_"+sGXsfl_82_idx, httpContext.cgiGet( "ZT_"+"Z64ComprobanteArticuloCantidad_"+sGXsfl_82_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z64ComprobanteArticuloCantidad_"+sGXsfl_82_idx) ;
         httpContext.changePostValue( "Z65ComprobanteArticuloPrecioUnit_"+sGXsfl_82_idx, httpContext.cgiGet( "ZT_"+"Z65ComprobanteArticuloPrecioUnit_"+sGXsfl_82_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z65ComprobanteArticuloPrecioUnit_"+sGXsfl_82_idx) ;
         httpContext.changePostValue( "Z66ComprobanteArticuloTotal_"+sGXsfl_82_idx, httpContext.cgiGet( "ZT_"+"Z66ComprobanteArticuloTotal_"+sGXsfl_82_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z66ComprobanteArticuloTotal_"+sGXsfl_82_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721917353074");
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
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.comprobante") +"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z42EmpresaId", GXutil.ltrim( localUtil.ntoc( Z42EmpresaId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z81EntidadId", GXutil.ltrim( localUtil.ntoc( Z81EntidadId, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z31CfgComprobanteId", Z31CfgComprobanteId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z32CfgComprobantePrefijo", GXutil.ltrim( localUtil.ntoc( Z32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z55ComprobanteNumero", GXutil.ltrim( localUtil.ntoc( Z55ComprobanteNumero, (byte)(8), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z35CfgComprobanteDetalleLetra", GXutil.ltrim( localUtil.ntoc( Z35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z57ComprobanteEntidadNombre", Z57ComprobanteEntidadNombre);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z61ComprobanteFecha", localUtil.dtoc( Z61ComprobanteFecha, 0, "/"));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z62ComprobanteFechaSubdiario", localUtil.dtoc( Z62ComprobanteFechaSubdiario, 0, "/"));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z60ComprobanteVto", localUtil.dtoc( Z60ComprobanteVto, 0, "/"));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z67MonedaId", GXutil.ltrim( localUtil.ntoc( Z67MonedaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_82", GXutil.ltrim( localUtil.ntoc( nGXsfl_82_idx, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "COMPROBANTEARTICULOTOTAL", GXutil.ltrim( localUtil.ntoc( A66ComprobanteArticuloTotal, (byte)(12), (byte)(2), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ARTICULONOMBRE", A40ArticuloNombre);
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
      return formatLink("com.kberp.comprobante")  ;
   }

   public String getPgmname( )
   {
      return "Comprobante" ;
   }

   public String getPgmdesc( )
   {
      return "Comprobante" ;
   }

   public void initializeNonKey0F35( )
   {
      A57ComprobanteEntidadNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A57ComprobanteEntidadNombre", A57ComprobanteEntidadNombre);
      A61ComprobanteFecha = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A61ComprobanteFecha", localUtil.format(A61ComprobanteFecha, "99/99/99"));
      A62ComprobanteFechaSubdiario = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A62ComprobanteFechaSubdiario", localUtil.format(A62ComprobanteFechaSubdiario, "99/99/99"));
      A60ComprobanteVto = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A60ComprobanteVto", localUtil.format(A60ComprobanteVto, "99/99/99"));
      A67MonedaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A67MonedaId", GXutil.ltrim( GXutil.str( A67MonedaId, 4, 0)));
      Z57ComprobanteEntidadNombre = "" ;
      Z61ComprobanteFecha = GXutil.nullDate() ;
      Z62ComprobanteFechaSubdiario = GXutil.nullDate() ;
      Z60ComprobanteVto = GXutil.nullDate() ;
      Z67MonedaId = (short)(0) ;
   }

   public void initAll0F35( )
   {
      A42EmpresaId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
      A81EntidadId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
      A31CfgComprobanteId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A31CfgComprobanteId", A31CfgComprobanteId);
      A32CfgComprobantePrefijo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A32CfgComprobantePrefijo", GXutil.ltrim( GXutil.str( A32CfgComprobantePrefijo, 4, 0)));
      A55ComprobanteNumero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A55ComprobanteNumero", GXutil.ltrim( GXutil.str( A55ComprobanteNumero, 8, 0)));
      A35CfgComprobanteDetalleLetra = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
      initializeNonKey0F35( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0F36( )
   {
      A63ComprobanteArticuloNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloNombre_Internalname, A63ComprobanteArticuloNombre);
      A70ComprobanteArticuloTotalCalcul = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloTotalCalcul_Internalname, GXutil.ltrim( GXutil.str( A70ComprobanteArticuloTotalCalcul, 12, 2)));
      A40ArticuloNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A40ArticuloNombre", A40ArticuloNombre);
      A64ComprobanteArticuloCantidad = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloCantidad_Internalname, GXutil.ltrim( GXutil.str( A64ComprobanteArticuloCantidad, 10, 3)));
      A65ComprobanteArticuloPrecioUnit = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, edtComprobanteArticuloPrecioUnit_Internalname, GXutil.ltrim( GXutil.str( A65ComprobanteArticuloPrecioUnit, 12, 2)));
      A66ComprobanteArticuloTotal = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A66ComprobanteArticuloTotal", GXutil.ltrim( GXutil.str( A66ComprobanteArticuloTotal, 12, 2)));
      Z63ComprobanteArticuloNombre = "" ;
      Z64ComprobanteArticuloCantidad = DecimalUtil.ZERO ;
      Z65ComprobanteArticuloPrecioUnit = DecimalUtil.ZERO ;
      Z66ComprobanteArticuloTotal = DecimalUtil.ZERO ;
   }

   public void initAll0F36( )
   {
      A39ArticuloId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtArticuloId_Internalname, A39ArticuloId);
      initializeNonKey0F36( ) ;
   }

   public void standaloneModalInsert0F36( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?131246");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1731551");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721917353083");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("comprobante.js", "?201721917353085");
      /* End function include_jscripts */
   }

   public void init_level_properties36( )
   {
      edtComprobanteArticuloTotalCalcul_Enabled = defedtComprobanteArticuloTotalCalcul_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloTotalCalcul_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloTotalCalcul_Enabled, 5, 0)));
      edtComprobanteArticuloNombre_Enabled = defedtComprobanteArticuloNombre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtComprobanteArticuloNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtComprobanteArticuloNombre_Enabled, 5, 0)));
      edtArticuloId_Enabled = defedtArticuloId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtArticuloId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtArticuloId_Enabled, 5, 0)));
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
      edtEmpresaId_Internalname = "EMPRESAID" ;
      edtEntidadId_Internalname = "ENTIDADID" ;
      edtCfgComprobanteId_Internalname = "CFGCOMPROBANTEID" ;
      edtCfgComprobantePrefijo_Internalname = "CFGCOMPROBANTEPREFIJO" ;
      edtComprobanteNumero_Internalname = "COMPROBANTENUMERO" ;
      cmbCfgComprobanteDetalleLetra.setInternalname( "CFGCOMPROBANTEDETALLELETRA" );
      edtComprobanteEntidadNombre_Internalname = "COMPROBANTEENTIDADNOMBRE" ;
      edtComprobanteFecha_Internalname = "COMPROBANTEFECHA" ;
      edtComprobanteFechaSubdiario_Internalname = "COMPROBANTEFECHASUBDIARIO" ;
      edtComprobanteVto_Internalname = "COMPROBANTEVTO" ;
      edtMonedaId_Internalname = "MONEDAID" ;
      lblTitlearticulo_Internalname = "TITLEARTICULO" ;
      edtArticuloId_Internalname = "ARTICULOID" ;
      edtComprobanteArticuloNombre_Internalname = "COMPROBANTEARTICULONOMBRE" ;
      edtComprobanteArticuloCantidad_Internalname = "COMPROBANTEARTICULOCANTIDAD" ;
      edtComprobanteArticuloPrecioUnit_Internalname = "COMPROBANTEARTICULOPRECIOUNIT" ;
      edtComprobanteArticuloTotalCalcul_Internalname = "COMPROBANTEARTICULOTOTALCALCUL" ;
      divArticulotable_Internalname = "ARTICULOTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_42_81_Internalname = "PROMPT_42_81" ;
      imgprompt_31_32_35_Internalname = "PROMPT_31_32_35" ;
      imgprompt_67_Internalname = "PROMPT_67" ;
      imgprompt_39_Internalname = "PROMPT_39" ;
      subGridcomprobante_articulo_Internalname = "GRIDCOMPROBANTE_ARTICULO" ;
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
      Form.setCaption( "Comprobante" );
      edtComprobanteArticuloTotalCalcul_Jsonclick = "" ;
      edtComprobanteArticuloPrecioUnit_Jsonclick = "" ;
      edtComprobanteArticuloCantidad_Jsonclick = "" ;
      edtComprobanteArticuloNombre_Jsonclick = "" ;
      imgprompt_39_Visible = 1 ;
      imgprompt_39_Link = "" ;
      imgprompt_42_81_Visible = 1 ;
      edtArticuloId_Jsonclick = "" ;
      subGridcomprobante_articulo_Class = "Grid" ;
      subGridcomprobante_articulo_Backcolorstyle = (byte)(0) ;
      subGridcomprobante_articulo_Allowcollapsing = (byte)(0) ;
      subGridcomprobante_articulo_Allowselection = (byte)(0) ;
      edtComprobanteArticuloTotalCalcul_Enabled = 0 ;
      edtComprobanteArticuloPrecioUnit_Enabled = 1 ;
      edtComprobanteArticuloCantidad_Enabled = 1 ;
      edtComprobanteArticuloNombre_Enabled = 0 ;
      edtArticuloId_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      imgprompt_67_Visible = 1 ;
      imgprompt_67_Link = "" ;
      edtMonedaId_Jsonclick = "" ;
      edtMonedaId_Enabled = 1 ;
      edtComprobanteVto_Jsonclick = "" ;
      edtComprobanteVto_Enabled = 1 ;
      edtComprobanteFechaSubdiario_Jsonclick = "" ;
      edtComprobanteFechaSubdiario_Enabled = 1 ;
      edtComprobanteFecha_Jsonclick = "" ;
      edtComprobanteFecha_Enabled = 1 ;
      edtComprobanteEntidadNombre_Enabled = 1 ;
      imgprompt_31_32_35_Visible = 1 ;
      imgprompt_31_32_35_Link = "" ;
      cmbCfgComprobanteDetalleLetra.setJsonclick( "" );
      cmbCfgComprobanteDetalleLetra.setEnabled( 1 );
      edtComprobanteNumero_Jsonclick = "" ;
      edtComprobanteNumero_Enabled = 1 ;
      edtCfgComprobantePrefijo_Jsonclick = "" ;
      edtCfgComprobantePrefijo_Enabled = 1 ;
      edtCfgComprobanteId_Jsonclick = "" ;
      edtCfgComprobanteId_Enabled = 1 ;
      imgprompt_42_81_Visible = 1 ;
      imgprompt_42_81_Link = "" ;
      edtEntidadId_Jsonclick = "" ;
      edtEntidadId_Enabled = 1 ;
      edtEmpresaId_Jsonclick = "" ;
      edtEmpresaId_Enabled = 1 ;
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

   public void gxnrgridcomprobante_articulo_newrow( )
   {
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_8236( ) ;
      while ( nGXsfl_82_idx <= nRC_GXsfl_82 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0F36( ) ;
         standaloneModal0F36( ) ;
         cmbCfgComprobanteDetalleLetra.setName( "CFGCOMPROBANTEDETALLELETRA" );
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
            httpContext.ajax_rsp_assign_attri("", false, "A35CfgComprobanteDetalleLetra", GXutil.ltrim( GXutil.str( A35CfgComprobanteDetalleLetra, 2, 0)));
         }
         dynload_actions( ) ;
         sendRow0F36( ) ;
         nGXsfl_82_idx = (short)(nGXsfl_82_idx+1) ;
         sGXsfl_82_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_82_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_8236( ) ;
      }
      httpContext.GX_webresponse.addString(Gridcomprobante_articuloContainer.ToJavascriptSource());
      /* End function gxnrGridcomprobante_articulo_newrow */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      /* Using cursor T000F29 */
      pr_default.execute(27, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Entidad'.", "ForeignKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(27);
      /* Using cursor T000F30 */
      pr_default.execute(28, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Detalle'.", "ForeignKeyNotFound", 1, "CFGCOMPROBANTEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCfgComprobanteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(28);
      GX_FocusControl = edtComprobanteEntidadNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Entidadid( int GX_Parm1 ,
                                int GX_Parm2 )
   {
      A42EmpresaId = GX_Parm1 ;
      A81EntidadId = GX_Parm2 ;
      /* Using cursor T000F29 */
      pr_default.execute(27, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Entidad'.", "ForeignKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Cfgcomprobantedetalleletra( int GX_Parm1 ,
                                                 int GX_Parm2 ,
                                                 String GX_Parm3 ,
                                                 short GX_Parm4 ,
                                                 int GX_Parm5 ,
                                                 com.genexus.webpanels.HTMLChoice GX_Parm6 ,
                                                 String GX_Parm7 ,
                                                 java.util.Date GX_Parm8 ,
                                                 java.util.Date GX_Parm9 ,
                                                 java.util.Date GX_Parm10 ,
                                                 short GX_Parm11 )
   {
      A42EmpresaId = GX_Parm1 ;
      A81EntidadId = GX_Parm2 ;
      A31CfgComprobanteId = GX_Parm3 ;
      A32CfgComprobantePrefijo = GX_Parm4 ;
      A55ComprobanteNumero = GX_Parm5 ;
      cmbCfgComprobanteDetalleLetra = GX_Parm6 ;
      A35CfgComprobanteDetalleLetra = (byte)(GXutil.lval( cmbCfgComprobanteDetalleLetra.getValue())) ;
      A57ComprobanteEntidadNombre = GX_Parm7 ;
      A61ComprobanteFecha = GX_Parm8 ;
      A62ComprobanteFechaSubdiario = GX_Parm9 ;
      A60ComprobanteVto = GX_Parm10 ;
      A67MonedaId = GX_Parm11 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      /* Using cursor T000F30 */
      pr_default.execute(28, new Object[] {A31CfgComprobanteId, new Short(A32CfgComprobantePrefijo), new Byte(A35CfgComprobanteDetalleLetra)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Detalle'.", "ForeignKeyNotFound", 1, "CFGCOMPROBANTEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCfgComprobanteId_Internalname ;
      }
      pr_default.close(28);
      if ( ! ( ( A35CfgComprobanteDetalleLetra == 1 ) || ( A35CfgComprobanteDetalleLetra == 2 ) || ( A35CfgComprobanteDetalleLetra == 3 ) || ( A35CfgComprobanteDetalleLetra == 4 ) || ( A35CfgComprobanteDetalleLetra == 5 ) || ( A35CfgComprobanteDetalleLetra == 6 ) || ( A35CfgComprobanteDetalleLetra == 7 ) ) )
      {
         httpContext.GX_msglist.addItem("Campo Cfg Comprobante Detalle Letra fuera de rango", "OutOfRange", 1, "CFGCOMPROBANTEDETALLELETRA");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCfgComprobanteDetalleLetra.getInternalname() ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A57ComprobanteEntidadNombre);
      isValidOutput.add(localUtil.format(A61ComprobanteFecha, "99/99/99"));
      isValidOutput.add(localUtil.format(A62ComprobanteFechaSubdiario, "99/99/99"));
      isValidOutput.add(localUtil.format(A60ComprobanteVto, "99/99/99"));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A67MonedaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z42EmpresaId, (byte)(6), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z81EntidadId, (byte)(6), (byte)(0), ",", "")));
      isValidOutput.add(Z31CfgComprobanteId);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z32CfgComprobantePrefijo, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z55ComprobanteNumero, (byte)(8), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z35CfgComprobanteDetalleLetra, (byte)(2), (byte)(0), ",", "")));
      isValidOutput.add(Z57ComprobanteEntidadNombre);
      isValidOutput.add(localUtil.dtoc( Z61ComprobanteFecha, 0, "/"));
      isValidOutput.add(localUtil.dtoc( Z62ComprobanteFechaSubdiario, 0, "/"));
      isValidOutput.add(localUtil.dtoc( Z60ComprobanteVto, 0, "/"));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z67MonedaId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(Gridcomprobante_articuloContainer);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Monedaid( short GX_Parm1 )
   {
      A67MonedaId = GX_Parm1 ;
      /* Using cursor T000F31 */
      pr_default.execute(29, new Object[] {new Short(A67MonedaId)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Moneda'.", "ForeignKeyNotFound", 1, "MONEDAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMonedaId_Internalname ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Articuloid( String GX_Parm1 ,
                                 String GX_Parm2 ,
                                 String GX_Parm3 )
   {
      A39ArticuloId = GX_Parm1 ;
      A40ArticuloNombre = GX_Parm2 ;
      A63ComprobanteArticuloNombre = GX_Parm3 ;
      /* Using cursor T000F27 */
      pr_default.execute(25, new Object[] {A39ArticuloId});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Articulo'.", "ForeignKeyNotFound", 1, "ARTICULOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArticuloId_Internalname ;
      }
      A40ArticuloNombre = T000F27_A40ArticuloNombre[0] ;
      pr_default.close(25);
      if ( true /* After */ )
      {
         A63ComprobanteArticuloNombre = A40ArticuloNombre ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A40ArticuloNombre = "" ;
      }
      isValidOutput.add(A40ArticuloNombre);
      isValidOutput.add(A63ComprobanteArticuloNombre);
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
      pr_default.close(25);
      pr_default.close(27);
      pr_default.close(28);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z31CfgComprobanteId = "" ;
      Z57ComprobanteEntidadNombre = "" ;
      Z61ComprobanteFecha = GXutil.nullDate() ;
      Z62ComprobanteFechaSubdiario = GXutil.nullDate() ;
      Z60ComprobanteVto = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A31CfgComprobanteId = "" ;
      A39ArticuloId = "" ;
      GXKey = "" ;
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
      sImgUrl = "" ;
      A57ComprobanteEntidadNombre = "" ;
      A61ComprobanteFecha = GXutil.nullDate() ;
      A62ComprobanteFechaSubdiario = GXutil.nullDate() ;
      A60ComprobanteVto = GXutil.nullDate() ;
      lblTitlearticulo_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridcomprobante_articuloContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridcomprobante_articuloColumn = new com.genexus.webpanels.GXWebColumn();
      A63ComprobanteArticuloNombre = "" ;
      A64ComprobanteArticuloCantidad = DecimalUtil.ZERO ;
      A65ComprobanteArticuloPrecioUnit = DecimalUtil.ZERO ;
      A70ComprobanteArticuloTotalCalcul = DecimalUtil.ZERO ;
      Gx_mode = "" ;
      sMode36 = "" ;
      sStyleString = "" ;
      A66ComprobanteArticuloTotal = DecimalUtil.ZERO ;
      A40ArticuloNombre = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      Z39ArticuloId = "" ;
      Z63ComprobanteArticuloNombre = "" ;
      Z64ComprobanteArticuloCantidad = DecimalUtil.ZERO ;
      Z65ComprobanteArticuloPrecioUnit = DecimalUtil.ZERO ;
      Z66ComprobanteArticuloTotal = DecimalUtil.ZERO ;
      T000F10_A55ComprobanteNumero = new int[1] ;
      T000F10_A57ComprobanteEntidadNombre = new String[] {""} ;
      T000F10_A61ComprobanteFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T000F10_A62ComprobanteFechaSubdiario = new java.util.Date[] {GXutil.nullDate()} ;
      T000F10_A60ComprobanteVto = new java.util.Date[] {GXutil.nullDate()} ;
      T000F10_A42EmpresaId = new int[1] ;
      T000F10_A81EntidadId = new int[1] ;
      T000F10_A31CfgComprobanteId = new String[] {""} ;
      T000F10_A32CfgComprobantePrefijo = new short[1] ;
      T000F10_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F10_A67MonedaId = new short[1] ;
      T000F7_A42EmpresaId = new int[1] ;
      T000F8_A31CfgComprobanteId = new String[] {""} ;
      T000F9_A67MonedaId = new short[1] ;
      T000F11_A42EmpresaId = new int[1] ;
      T000F12_A31CfgComprobanteId = new String[] {""} ;
      T000F13_A67MonedaId = new short[1] ;
      T000F14_A42EmpresaId = new int[1] ;
      T000F14_A81EntidadId = new int[1] ;
      T000F14_A31CfgComprobanteId = new String[] {""} ;
      T000F14_A32CfgComprobantePrefijo = new short[1] ;
      T000F14_A55ComprobanteNumero = new int[1] ;
      T000F14_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F6_A55ComprobanteNumero = new int[1] ;
      T000F6_A57ComprobanteEntidadNombre = new String[] {""} ;
      T000F6_A61ComprobanteFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T000F6_A62ComprobanteFechaSubdiario = new java.util.Date[] {GXutil.nullDate()} ;
      T000F6_A60ComprobanteVto = new java.util.Date[] {GXutil.nullDate()} ;
      T000F6_A42EmpresaId = new int[1] ;
      T000F6_A81EntidadId = new int[1] ;
      T000F6_A31CfgComprobanteId = new String[] {""} ;
      T000F6_A32CfgComprobantePrefijo = new short[1] ;
      T000F6_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F6_A67MonedaId = new short[1] ;
      sMode35 = "" ;
      T000F15_A42EmpresaId = new int[1] ;
      T000F15_A81EntidadId = new int[1] ;
      T000F15_A31CfgComprobanteId = new String[] {""} ;
      T000F15_A32CfgComprobantePrefijo = new short[1] ;
      T000F15_A55ComprobanteNumero = new int[1] ;
      T000F15_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F16_A42EmpresaId = new int[1] ;
      T000F16_A81EntidadId = new int[1] ;
      T000F16_A31CfgComprobanteId = new String[] {""} ;
      T000F16_A32CfgComprobantePrefijo = new short[1] ;
      T000F16_A55ComprobanteNumero = new int[1] ;
      T000F16_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F5_A55ComprobanteNumero = new int[1] ;
      T000F5_A57ComprobanteEntidadNombre = new String[] {""} ;
      T000F5_A61ComprobanteFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T000F5_A62ComprobanteFechaSubdiario = new java.util.Date[] {GXutil.nullDate()} ;
      T000F5_A60ComprobanteVto = new java.util.Date[] {GXutil.nullDate()} ;
      T000F5_A42EmpresaId = new int[1] ;
      T000F5_A81EntidadId = new int[1] ;
      T000F5_A31CfgComprobanteId = new String[] {""} ;
      T000F5_A32CfgComprobantePrefijo = new short[1] ;
      T000F5_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F5_A67MonedaId = new short[1] ;
      T000F20_A42EmpresaId = new int[1] ;
      T000F20_A81EntidadId = new int[1] ;
      T000F20_A31CfgComprobanteId = new String[] {""} ;
      T000F20_A32CfgComprobantePrefijo = new short[1] ;
      T000F20_A55ComprobanteNumero = new int[1] ;
      T000F20_A35CfgComprobanteDetalleLetra = new byte[1] ;
      Z40ArticuloNombre = "" ;
      T000F21_A42EmpresaId = new int[1] ;
      T000F21_A81EntidadId = new int[1] ;
      T000F21_A31CfgComprobanteId = new String[] {""} ;
      T000F21_A32CfgComprobantePrefijo = new short[1] ;
      T000F21_A55ComprobanteNumero = new int[1] ;
      T000F21_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F21_A63ComprobanteArticuloNombre = new String[] {""} ;
      T000F21_A40ArticuloNombre = new String[] {""} ;
      T000F21_A64ComprobanteArticuloCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000F21_A65ComprobanteArticuloPrecioUnit = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000F21_A66ComprobanteArticuloTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000F21_A39ArticuloId = new String[] {""} ;
      T000F4_A40ArticuloNombre = new String[] {""} ;
      T000F22_A40ArticuloNombre = new String[] {""} ;
      T000F23_A42EmpresaId = new int[1] ;
      T000F23_A81EntidadId = new int[1] ;
      T000F23_A31CfgComprobanteId = new String[] {""} ;
      T000F23_A32CfgComprobantePrefijo = new short[1] ;
      T000F23_A55ComprobanteNumero = new int[1] ;
      T000F23_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F23_A39ArticuloId = new String[] {""} ;
      T000F3_A42EmpresaId = new int[1] ;
      T000F3_A81EntidadId = new int[1] ;
      T000F3_A31CfgComprobanteId = new String[] {""} ;
      T000F3_A32CfgComprobantePrefijo = new short[1] ;
      T000F3_A55ComprobanteNumero = new int[1] ;
      T000F3_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F3_A63ComprobanteArticuloNombre = new String[] {""} ;
      T000F3_A64ComprobanteArticuloCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000F3_A65ComprobanteArticuloPrecioUnit = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000F3_A66ComprobanteArticuloTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000F3_A39ArticuloId = new String[] {""} ;
      T000F2_A42EmpresaId = new int[1] ;
      T000F2_A81EntidadId = new int[1] ;
      T000F2_A31CfgComprobanteId = new String[] {""} ;
      T000F2_A32CfgComprobantePrefijo = new short[1] ;
      T000F2_A55ComprobanteNumero = new int[1] ;
      T000F2_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F2_A63ComprobanteArticuloNombre = new String[] {""} ;
      T000F2_A64ComprobanteArticuloCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000F2_A65ComprobanteArticuloPrecioUnit = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000F2_A66ComprobanteArticuloTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000F2_A39ArticuloId = new String[] {""} ;
      T000F27_A40ArticuloNombre = new String[] {""} ;
      T000F28_A42EmpresaId = new int[1] ;
      T000F28_A81EntidadId = new int[1] ;
      T000F28_A31CfgComprobanteId = new String[] {""} ;
      T000F28_A32CfgComprobantePrefijo = new short[1] ;
      T000F28_A55ComprobanteNumero = new int[1] ;
      T000F28_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000F28_A39ArticuloId = new String[] {""} ;
      Gridcomprobante_articuloRow = new com.genexus.webpanels.GXWebRow();
      subGridcomprobante_articulo_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T000F29_A42EmpresaId = new int[1] ;
      T000F30_A31CfgComprobanteId = new String[] {""} ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000F31_A67MonedaId = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.comprobante__default(),
         new Object[] {
             new Object[] {
            T000F2_A42EmpresaId, T000F2_A81EntidadId, T000F2_A31CfgComprobanteId, T000F2_A32CfgComprobantePrefijo, T000F2_A55ComprobanteNumero, T000F2_A35CfgComprobanteDetalleLetra, T000F2_A63ComprobanteArticuloNombre, T000F2_A64ComprobanteArticuloCantidad, T000F2_A65ComprobanteArticuloPrecioUnit, T000F2_A66ComprobanteArticuloTotal,
            T000F2_A39ArticuloId
            }
            , new Object[] {
            T000F3_A42EmpresaId, T000F3_A81EntidadId, T000F3_A31CfgComprobanteId, T000F3_A32CfgComprobantePrefijo, T000F3_A55ComprobanteNumero, T000F3_A35CfgComprobanteDetalleLetra, T000F3_A63ComprobanteArticuloNombre, T000F3_A64ComprobanteArticuloCantidad, T000F3_A65ComprobanteArticuloPrecioUnit, T000F3_A66ComprobanteArticuloTotal,
            T000F3_A39ArticuloId
            }
            , new Object[] {
            T000F4_A40ArticuloNombre
            }
            , new Object[] {
            T000F5_A55ComprobanteNumero, T000F5_A57ComprobanteEntidadNombre, T000F5_A61ComprobanteFecha, T000F5_A62ComprobanteFechaSubdiario, T000F5_A60ComprobanteVto, T000F5_A42EmpresaId, T000F5_A81EntidadId, T000F5_A31CfgComprobanteId, T000F5_A32CfgComprobantePrefijo, T000F5_A35CfgComprobanteDetalleLetra,
            T000F5_A67MonedaId
            }
            , new Object[] {
            T000F6_A55ComprobanteNumero, T000F6_A57ComprobanteEntidadNombre, T000F6_A61ComprobanteFecha, T000F6_A62ComprobanteFechaSubdiario, T000F6_A60ComprobanteVto, T000F6_A42EmpresaId, T000F6_A81EntidadId, T000F6_A31CfgComprobanteId, T000F6_A32CfgComprobantePrefijo, T000F6_A35CfgComprobanteDetalleLetra,
            T000F6_A67MonedaId
            }
            , new Object[] {
            T000F7_A42EmpresaId
            }
            , new Object[] {
            T000F8_A31CfgComprobanteId
            }
            , new Object[] {
            T000F9_A67MonedaId
            }
            , new Object[] {
            T000F10_A55ComprobanteNumero, T000F10_A57ComprobanteEntidadNombre, T000F10_A61ComprobanteFecha, T000F10_A62ComprobanteFechaSubdiario, T000F10_A60ComprobanteVto, T000F10_A42EmpresaId, T000F10_A81EntidadId, T000F10_A31CfgComprobanteId, T000F10_A32CfgComprobantePrefijo, T000F10_A35CfgComprobanteDetalleLetra,
            T000F10_A67MonedaId
            }
            , new Object[] {
            T000F11_A42EmpresaId
            }
            , new Object[] {
            T000F12_A31CfgComprobanteId
            }
            , new Object[] {
            T000F13_A67MonedaId
            }
            , new Object[] {
            T000F14_A42EmpresaId, T000F14_A81EntidadId, T000F14_A31CfgComprobanteId, T000F14_A32CfgComprobantePrefijo, T000F14_A55ComprobanteNumero, T000F14_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            T000F15_A42EmpresaId, T000F15_A81EntidadId, T000F15_A31CfgComprobanteId, T000F15_A32CfgComprobantePrefijo, T000F15_A55ComprobanteNumero, T000F15_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            T000F16_A42EmpresaId, T000F16_A81EntidadId, T000F16_A31CfgComprobanteId, T000F16_A32CfgComprobantePrefijo, T000F16_A55ComprobanteNumero, T000F16_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000F20_A42EmpresaId, T000F20_A81EntidadId, T000F20_A31CfgComprobanteId, T000F20_A32CfgComprobantePrefijo, T000F20_A55ComprobanteNumero, T000F20_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            T000F21_A42EmpresaId, T000F21_A81EntidadId, T000F21_A31CfgComprobanteId, T000F21_A32CfgComprobantePrefijo, T000F21_A55ComprobanteNumero, T000F21_A35CfgComprobanteDetalleLetra, T000F21_A63ComprobanteArticuloNombre, T000F21_A40ArticuloNombre, T000F21_A64ComprobanteArticuloCantidad, T000F21_A65ComprobanteArticuloPrecioUnit,
            T000F21_A66ComprobanteArticuloTotal, T000F21_A39ArticuloId
            }
            , new Object[] {
            T000F22_A40ArticuloNombre
            }
            , new Object[] {
            T000F23_A42EmpresaId, T000F23_A81EntidadId, T000F23_A31CfgComprobanteId, T000F23_A32CfgComprobantePrefijo, T000F23_A55ComprobanteNumero, T000F23_A35CfgComprobanteDetalleLetra, T000F23_A39ArticuloId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000F27_A40ArticuloNombre
            }
            , new Object[] {
            T000F28_A42EmpresaId, T000F28_A81EntidadId, T000F28_A31CfgComprobanteId, T000F28_A32CfgComprobantePrefijo, T000F28_A55ComprobanteNumero, T000F28_A35CfgComprobanteDetalleLetra, T000F28_A39ArticuloId
            }
            , new Object[] {
            T000F29_A42EmpresaId
            }
            , new Object[] {
            T000F30_A31CfgComprobanteId
            }
            , new Object[] {
            T000F31_A67MonedaId
            }
         }
      );
   }

   private byte Z35CfgComprobanteDetalleLetra ;
   private byte GxWebError ;
   private byte A35CfgComprobanteDetalleLetra ;
   private byte nKeyPressed ;
   private byte subGridcomprobante_articulo_Backcolorstyle ;
   private byte subGridcomprobante_articulo_Allowselection ;
   private byte subGridcomprobante_articulo_Allowhovering ;
   private byte subGridcomprobante_articulo_Allowcollapsing ;
   private byte subGridcomprobante_articulo_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridcomprobante_articulo_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_36 ;
   private short Z32CfgComprobantePrefijo ;
   private short Z67MonedaId ;
   private short nRC_GXsfl_82 ;
   private short nGXsfl_82_idx=1 ;
   private short A32CfgComprobantePrefijo ;
   private short A67MonedaId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount36 ;
   private short nRcdExists_36 ;
   private short RcdFound36 ;
   private short nRcdDeleted_36 ;
   private short nBlankRcdUsr36 ;
   private short RcdFound35 ;
   private int Z42EmpresaId ;
   private int Z81EntidadId ;
   private int Z55ComprobanteNumero ;
   private int A42EmpresaId ;
   private int A81EntidadId ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmpresaId_Enabled ;
   private int edtEntidadId_Enabled ;
   private int imgprompt_42_81_Visible ;
   private int edtCfgComprobanteId_Enabled ;
   private int edtCfgComprobantePrefijo_Enabled ;
   private int A55ComprobanteNumero ;
   private int edtComprobanteNumero_Enabled ;
   private int imgprompt_31_32_35_Visible ;
   private int edtComprobanteEntidadNombre_Enabled ;
   private int edtComprobanteFecha_Enabled ;
   private int edtComprobanteFechaSubdiario_Enabled ;
   private int edtComprobanteVto_Enabled ;
   private int edtMonedaId_Enabled ;
   private int imgprompt_67_Visible ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtArticuloId_Enabled ;
   private int edtComprobanteArticuloNombre_Enabled ;
   private int edtComprobanteArticuloCantidad_Enabled ;
   private int edtComprobanteArticuloPrecioUnit_Enabled ;
   private int edtComprobanteArticuloTotalCalcul_Enabled ;
   private int subGridcomprobante_articulo_Selectioncolor ;
   private int subGridcomprobante_articulo_Hoveringcolor ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridcomprobante_articulo_Backcolor ;
   private int subGridcomprobante_articulo_Allbackcolor ;
   private int imgprompt_39_Visible ;
   private int defedtComprobanteArticuloTotalCalcul_Enabled ;
   private int defedtComprobanteArticuloNombre_Enabled ;
   private int defedtArticuloId_Enabled ;
   private int idxLst ;
   private long GRIDCOMPROBANTE_ARTICULO_nFirstRecordOnPage ;
   private java.math.BigDecimal A64ComprobanteArticuloCantidad ;
   private java.math.BigDecimal A65ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal A70ComprobanteArticuloTotalCalcul ;
   private java.math.BigDecimal A66ComprobanteArticuloTotal ;
   private java.math.BigDecimal Z64ComprobanteArticuloCantidad ;
   private java.math.BigDecimal Z65ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal Z66ComprobanteArticuloTotal ;
   private String sPrefix ;
   private String sGXsfl_82_idx="0001" ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String edtArticuloId_Internalname ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmpresaId_Internalname ;
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
   private String edtEmpresaId_Jsonclick ;
   private String edtEntidadId_Internalname ;
   private String edtEntidadId_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_42_81_Internalname ;
   private String imgprompt_42_81_Link ;
   private String edtCfgComprobanteId_Internalname ;
   private String edtCfgComprobanteId_Jsonclick ;
   private String edtCfgComprobantePrefijo_Internalname ;
   private String edtCfgComprobantePrefijo_Jsonclick ;
   private String edtComprobanteNumero_Internalname ;
   private String edtComprobanteNumero_Jsonclick ;
   private String imgprompt_31_32_35_Internalname ;
   private String imgprompt_31_32_35_Link ;
   private String edtComprobanteEntidadNombre_Internalname ;
   private String edtComprobanteFecha_Internalname ;
   private String edtComprobanteFecha_Jsonclick ;
   private String edtComprobanteFechaSubdiario_Internalname ;
   private String edtComprobanteFechaSubdiario_Jsonclick ;
   private String edtComprobanteVto_Internalname ;
   private String edtComprobanteVto_Jsonclick ;
   private String edtMonedaId_Internalname ;
   private String edtMonedaId_Jsonclick ;
   private String imgprompt_67_Internalname ;
   private String imgprompt_67_Link ;
   private String divArticulotable_Internalname ;
   private String lblTitlearticulo_Internalname ;
   private String lblTitlearticulo_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sMode36 ;
   private String edtComprobanteArticuloNombre_Internalname ;
   private String edtComprobanteArticuloCantidad_Internalname ;
   private String edtComprobanteArticuloPrecioUnit_Internalname ;
   private String edtComprobanteArticuloTotalCalcul_Internalname ;
   private String sStyleString ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String sMode35 ;
   private String imgprompt_39_Internalname ;
   private String sGXsfl_82_fel_idx="0001" ;
   private String subGridcomprobante_articulo_Class ;
   private String subGridcomprobante_articulo_Linesclass ;
   private String imgprompt_39_Link ;
   private String ROClassString ;
   private String edtArticuloId_Jsonclick ;
   private String edtComprobanteArticuloNombre_Jsonclick ;
   private String edtComprobanteArticuloCantidad_Jsonclick ;
   private String edtComprobanteArticuloPrecioUnit_Jsonclick ;
   private String edtComprobanteArticuloTotalCalcul_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridcomprobante_articulo_Internalname ;
   private java.util.Date Z61ComprobanteFecha ;
   private java.util.Date Z62ComprobanteFechaSubdiario ;
   private java.util.Date Z60ComprobanteVto ;
   private java.util.Date A61ComprobanteFecha ;
   private java.util.Date A62ComprobanteFechaSubdiario ;
   private java.util.Date A60ComprobanteVto ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private String Z31CfgComprobanteId ;
   private String Z57ComprobanteEntidadNombre ;
   private String A31CfgComprobanteId ;
   private String A39ArticuloId ;
   private String A57ComprobanteEntidadNombre ;
   private String A63ComprobanteArticuloNombre ;
   private String A40ArticuloNombre ;
   private String Z39ArticuloId ;
   private String Z63ComprobanteArticuloNombre ;
   private String Z40ArticuloNombre ;
   private com.genexus.webpanels.GXWebGrid Gridcomprobante_articuloContainer ;
   private com.genexus.webpanels.GXWebRow Gridcomprobante_articuloRow ;
   private com.genexus.webpanels.GXWebColumn Gridcomprobante_articuloColumn ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbCfgComprobanteDetalleLetra ;
   private IDataStoreProvider pr_default ;
   private int[] T000F10_A55ComprobanteNumero ;
   private String[] T000F10_A57ComprobanteEntidadNombre ;
   private java.util.Date[] T000F10_A61ComprobanteFecha ;
   private java.util.Date[] T000F10_A62ComprobanteFechaSubdiario ;
   private java.util.Date[] T000F10_A60ComprobanteVto ;
   private int[] T000F10_A42EmpresaId ;
   private int[] T000F10_A81EntidadId ;
   private String[] T000F10_A31CfgComprobanteId ;
   private short[] T000F10_A32CfgComprobantePrefijo ;
   private byte[] T000F10_A35CfgComprobanteDetalleLetra ;
   private short[] T000F10_A67MonedaId ;
   private int[] T000F7_A42EmpresaId ;
   private String[] T000F8_A31CfgComprobanteId ;
   private short[] T000F9_A67MonedaId ;
   private int[] T000F11_A42EmpresaId ;
   private String[] T000F12_A31CfgComprobanteId ;
   private short[] T000F13_A67MonedaId ;
   private int[] T000F14_A42EmpresaId ;
   private int[] T000F14_A81EntidadId ;
   private String[] T000F14_A31CfgComprobanteId ;
   private short[] T000F14_A32CfgComprobantePrefijo ;
   private int[] T000F14_A55ComprobanteNumero ;
   private byte[] T000F14_A35CfgComprobanteDetalleLetra ;
   private int[] T000F6_A55ComprobanteNumero ;
   private String[] T000F6_A57ComprobanteEntidadNombre ;
   private java.util.Date[] T000F6_A61ComprobanteFecha ;
   private java.util.Date[] T000F6_A62ComprobanteFechaSubdiario ;
   private java.util.Date[] T000F6_A60ComprobanteVto ;
   private int[] T000F6_A42EmpresaId ;
   private int[] T000F6_A81EntidadId ;
   private String[] T000F6_A31CfgComprobanteId ;
   private short[] T000F6_A32CfgComprobantePrefijo ;
   private byte[] T000F6_A35CfgComprobanteDetalleLetra ;
   private short[] T000F6_A67MonedaId ;
   private int[] T000F15_A42EmpresaId ;
   private int[] T000F15_A81EntidadId ;
   private String[] T000F15_A31CfgComprobanteId ;
   private short[] T000F15_A32CfgComprobantePrefijo ;
   private int[] T000F15_A55ComprobanteNumero ;
   private byte[] T000F15_A35CfgComprobanteDetalleLetra ;
   private int[] T000F16_A42EmpresaId ;
   private int[] T000F16_A81EntidadId ;
   private String[] T000F16_A31CfgComprobanteId ;
   private short[] T000F16_A32CfgComprobantePrefijo ;
   private int[] T000F16_A55ComprobanteNumero ;
   private byte[] T000F16_A35CfgComprobanteDetalleLetra ;
   private int[] T000F5_A55ComprobanteNumero ;
   private String[] T000F5_A57ComprobanteEntidadNombre ;
   private java.util.Date[] T000F5_A61ComprobanteFecha ;
   private java.util.Date[] T000F5_A62ComprobanteFechaSubdiario ;
   private java.util.Date[] T000F5_A60ComprobanteVto ;
   private int[] T000F5_A42EmpresaId ;
   private int[] T000F5_A81EntidadId ;
   private String[] T000F5_A31CfgComprobanteId ;
   private short[] T000F5_A32CfgComprobantePrefijo ;
   private byte[] T000F5_A35CfgComprobanteDetalleLetra ;
   private short[] T000F5_A67MonedaId ;
   private int[] T000F20_A42EmpresaId ;
   private int[] T000F20_A81EntidadId ;
   private String[] T000F20_A31CfgComprobanteId ;
   private short[] T000F20_A32CfgComprobantePrefijo ;
   private int[] T000F20_A55ComprobanteNumero ;
   private byte[] T000F20_A35CfgComprobanteDetalleLetra ;
   private int[] T000F21_A42EmpresaId ;
   private int[] T000F21_A81EntidadId ;
   private String[] T000F21_A31CfgComprobanteId ;
   private short[] T000F21_A32CfgComprobantePrefijo ;
   private int[] T000F21_A55ComprobanteNumero ;
   private byte[] T000F21_A35CfgComprobanteDetalleLetra ;
   private String[] T000F21_A63ComprobanteArticuloNombre ;
   private String[] T000F21_A40ArticuloNombre ;
   private java.math.BigDecimal[] T000F21_A64ComprobanteArticuloCantidad ;
   private java.math.BigDecimal[] T000F21_A65ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal[] T000F21_A66ComprobanteArticuloTotal ;
   private String[] T000F21_A39ArticuloId ;
   private String[] T000F4_A40ArticuloNombre ;
   private String[] T000F22_A40ArticuloNombre ;
   private int[] T000F23_A42EmpresaId ;
   private int[] T000F23_A81EntidadId ;
   private String[] T000F23_A31CfgComprobanteId ;
   private short[] T000F23_A32CfgComprobantePrefijo ;
   private int[] T000F23_A55ComprobanteNumero ;
   private byte[] T000F23_A35CfgComprobanteDetalleLetra ;
   private String[] T000F23_A39ArticuloId ;
   private int[] T000F3_A42EmpresaId ;
   private int[] T000F3_A81EntidadId ;
   private String[] T000F3_A31CfgComprobanteId ;
   private short[] T000F3_A32CfgComprobantePrefijo ;
   private int[] T000F3_A55ComprobanteNumero ;
   private byte[] T000F3_A35CfgComprobanteDetalleLetra ;
   private String[] T000F3_A63ComprobanteArticuloNombre ;
   private java.math.BigDecimal[] T000F3_A64ComprobanteArticuloCantidad ;
   private java.math.BigDecimal[] T000F3_A65ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal[] T000F3_A66ComprobanteArticuloTotal ;
   private String[] T000F3_A39ArticuloId ;
   private int[] T000F2_A42EmpresaId ;
   private int[] T000F2_A81EntidadId ;
   private String[] T000F2_A31CfgComprobanteId ;
   private short[] T000F2_A32CfgComprobantePrefijo ;
   private int[] T000F2_A55ComprobanteNumero ;
   private byte[] T000F2_A35CfgComprobanteDetalleLetra ;
   private String[] T000F2_A63ComprobanteArticuloNombre ;
   private java.math.BigDecimal[] T000F2_A64ComprobanteArticuloCantidad ;
   private java.math.BigDecimal[] T000F2_A65ComprobanteArticuloPrecioUnit ;
   private java.math.BigDecimal[] T000F2_A66ComprobanteArticuloTotal ;
   private String[] T000F2_A39ArticuloId ;
   private String[] T000F27_A40ArticuloNombre ;
   private int[] T000F28_A42EmpresaId ;
   private int[] T000F28_A81EntidadId ;
   private String[] T000F28_A31CfgComprobanteId ;
   private short[] T000F28_A32CfgComprobantePrefijo ;
   private int[] T000F28_A55ComprobanteNumero ;
   private byte[] T000F28_A35CfgComprobanteDetalleLetra ;
   private String[] T000F28_A39ArticuloId ;
   private int[] T000F29_A42EmpresaId ;
   private String[] T000F30_A31CfgComprobanteId ;
   private short[] T000F31_A67MonedaId ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class comprobante__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000F2", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ComprobanteArticuloNombre, ComprobanteArticuloCantidad, ComprobanteArticuloPrecioUnit, ComprobanteArticuloTotal, ArticuloId FROM ComprobanteArticulo WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ? AND ArticuloId = ?  FOR UPDATE OF ComprobanteArticulo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F3", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ComprobanteArticuloNombre, ComprobanteArticuloCantidad, ComprobanteArticuloPrecioUnit, ComprobanteArticuloTotal, ArticuloId FROM ComprobanteArticulo WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ? AND ArticuloId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F4", "SELECT ArticuloNombre FROM Articulo WHERE ArticuloId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F5", "SELECT ComprobanteNumero, ComprobanteEntidadNombre, ComprobanteFecha, ComprobanteFechaSubdiario, ComprobanteVto, EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra, MonedaId FROM Comprobante WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ?  FOR UPDATE OF Comprobante NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F6", "SELECT ComprobanteNumero, ComprobanteEntidadNombre, ComprobanteFecha, ComprobanteFechaSubdiario, ComprobanteVto, EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra, MonedaId FROM Comprobante WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F7", "SELECT EmpresaId FROM Entidad WHERE EmpresaId = ? AND EntidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F8", "SELECT CfgComprobanteId FROM CfgComprobanteDetalle WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND CfgComprobanteDetalleLetra = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F9", "SELECT MonedaId FROM Moneda WHERE MonedaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F10", "SELECT TM1.ComprobanteNumero, TM1.ComprobanteEntidadNombre, TM1.ComprobanteFecha, TM1.ComprobanteFechaSubdiario, TM1.ComprobanteVto, TM1.EmpresaId, TM1.EntidadId, TM1.CfgComprobanteId, TM1.CfgComprobantePrefijo, TM1.CfgComprobanteDetalleLetra, TM1.MonedaId FROM Comprobante TM1 WHERE TM1.EmpresaId = ? and TM1.EntidadId = ? and TM1.CfgComprobanteId = ( ?) and TM1.CfgComprobantePrefijo = ? and TM1.ComprobanteNumero = ? and TM1.CfgComprobanteDetalleLetra = ? ORDER BY TM1.EmpresaId, TM1.EntidadId, TM1.CfgComprobanteId, TM1.CfgComprobantePrefijo, TM1.ComprobanteNumero, TM1.CfgComprobanteDetalleLetra ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000F11", "SELECT EmpresaId FROM Entidad WHERE EmpresaId = ? AND EntidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F12", "SELECT CfgComprobanteId FROM CfgComprobanteDetalle WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND CfgComprobanteDetalleLetra = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F13", "SELECT MonedaId FROM Moneda WHERE MonedaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F14", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra FROM Comprobante WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F15", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra FROM Comprobante WHERE ( EmpresaId > ? or EmpresaId = ? and EntidadId > ? or EntidadId = ? and EmpresaId = ? and CfgComprobanteId > ( ?) or CfgComprobanteId = ( ?) and EntidadId = ? and EmpresaId = ? and CfgComprobantePrefijo > ? or CfgComprobantePrefijo = ? and CfgComprobanteId = ( ?) and EntidadId = ? and EmpresaId = ? and ComprobanteNumero > ? or ComprobanteNumero = ? and CfgComprobantePrefijo = ? and CfgComprobanteId = ( ?) and EntidadId = ? and EmpresaId = ? and CfgComprobanteDetalleLetra > ?) ORDER BY EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000F16", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra FROM Comprobante WHERE ( EmpresaId < ? or EmpresaId = ? and EntidadId < ? or EntidadId = ? and EmpresaId = ? and CfgComprobanteId < ( ?) or CfgComprobanteId = ( ?) and EntidadId = ? and EmpresaId = ? and CfgComprobantePrefijo < ? or CfgComprobantePrefijo = ? and CfgComprobanteId = ( ?) and EntidadId = ? and EmpresaId = ? and ComprobanteNumero < ? or ComprobanteNumero = ? and CfgComprobantePrefijo = ? and CfgComprobanteId = ( ?) and EntidadId = ? and EmpresaId = ? and CfgComprobanteDetalleLetra < ?) ORDER BY EmpresaId DESC, EntidadId DESC, CfgComprobanteId DESC, CfgComprobantePrefijo DESC, ComprobanteNumero DESC, CfgComprobanteDetalleLetra DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000F17", "SAVEPOINT gxupdate;INSERT INTO Comprobante(ComprobanteNumero, ComprobanteEntidadNombre, ComprobanteFecha, ComprobanteFechaSubdiario, ComprobanteVto, EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, CfgComprobanteDetalleLetra, MonedaId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000F18", "SAVEPOINT gxupdate;UPDATE Comprobante SET ComprobanteEntidadNombre=?, ComprobanteFecha=?, ComprobanteFechaSubdiario=?, ComprobanteVto=?, MonedaId=?  WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000F19", "SAVEPOINT gxupdate;DELETE FROM Comprobante  WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000F20", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra FROM Comprobante ORDER BY EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000F21", "SELECT T1.EmpresaId, T1.EntidadId, T1.CfgComprobanteId, T1.CfgComprobantePrefijo, T1.ComprobanteNumero, T1.CfgComprobanteDetalleLetra, T1.ComprobanteArticuloNombre, T2.ArticuloNombre, T1.ComprobanteArticuloCantidad, T1.ComprobanteArticuloPrecioUnit, T1.ComprobanteArticuloTotal, T1.ArticuloId FROM (ComprobanteArticulo T1 INNER JOIN Articulo T2 ON T2.ArticuloId = T1.ArticuloId) WHERE T1.EmpresaId = ? and T1.EntidadId = ? and T1.CfgComprobanteId = ( ?) and T1.CfgComprobantePrefijo = ? and T1.ComprobanteNumero = ? and T1.CfgComprobanteDetalleLetra = ? and T1.ArticuloId = ( ?) ORDER BY T1.EmpresaId, T1.EntidadId, T1.CfgComprobanteId, T1.CfgComprobantePrefijo, T1.ComprobanteNumero, T1.CfgComprobanteDetalleLetra, T1.ArticuloId ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000F22", "SELECT ArticuloNombre FROM Articulo WHERE ArticuloId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F23", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ArticuloId FROM ComprobanteArticulo WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ? AND ArticuloId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000F24", "SAVEPOINT gxupdate;INSERT INTO ComprobanteArticulo(EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ComprobanteArticuloNombre, ComprobanteArticuloCantidad, ComprobanteArticuloPrecioUnit, ComprobanteArticuloTotal, ArticuloId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000F25", "SAVEPOINT gxupdate;UPDATE ComprobanteArticulo SET ComprobanteArticuloNombre=?, ComprobanteArticuloCantidad=?, ComprobanteArticuloPrecioUnit=?, ComprobanteArticuloTotal=?  WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ? AND ArticuloId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000F26", "SAVEPOINT gxupdate;DELETE FROM ComprobanteArticulo  WHERE EmpresaId = ? AND EntidadId = ? AND CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND ComprobanteNumero = ? AND CfgComprobanteDetalleLetra = ? AND ArticuloId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000F27", "SELECT ArticuloNombre FROM Articulo WHERE ArticuloId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F28", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ArticuloId FROM ComprobanteArticulo WHERE EmpresaId = ? and EntidadId = ? and CfgComprobanteId = ( ?) and CfgComprobantePrefijo = ? and ComprobanteNumero = ? and CfgComprobanteDetalleLetra = ? ORDER BY EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ArticuloId ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000F29", "SELECT EmpresaId FROM Entidad WHERE EmpresaId = ? AND EntidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F30", "SELECT CfgComprobanteId FROM CfgComprobanteDetalle WHERE CfgComprobanteId = ? AND CfgComprobantePrefijo = ? AND CfgComprobanteDetalleLetra = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F31", "SELECT MonedaId FROM Moneda WHERE MonedaId = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3) ;
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2) ;
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3) ;
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2) ;
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((byte[]) buf[9])[0] = rslt.getByte(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((byte[]) buf[9])[0] = rslt.getByte(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((byte[]) buf[9])[0] = rslt.getByte(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
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
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3) ;
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2) ;
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 29 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 15, false);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 15, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setVarchar(6, (String)parms[5], 10, false);
               stmt.setVarchar(7, (String)parms[6], 10, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setVarchar(12, (String)parms[11], 10, false);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setVarchar(18, (String)parms[17], 10, false);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setVarchar(6, (String)parms[5], 10, false);
               stmt.setVarchar(7, (String)parms[6], 10, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setVarchar(12, (String)parms[11], 10, false);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setVarchar(18, (String)parms[17], 10, false);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 250, false);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setVarchar(8, (String)parms[7], 10, false);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 250, false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setVarchar(8, (String)parms[7], 10, false);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 15, false);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 15, false);
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 250, false);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 3);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setVarchar(11, (String)parms[10], 15, false);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 250, false);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 10, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setVarchar(11, (String)parms[10], 15, false);
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 15, false);
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 27 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 29 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

