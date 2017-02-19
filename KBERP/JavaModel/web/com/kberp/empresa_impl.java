/*
               File: empresa_impl
        Description: Empresa
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:32:10.23
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

public final  class empresa_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A5LocalidadId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5LocalidadId", GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A5LocalidadId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A3PaisId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3PaisId", GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A3PaisId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A1ProvinciaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1ProvinciaId", GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A1ProvinciaId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A13CondicionIvaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13CondicionIvaId", GXutil.ltrim( GXutil.str( A13CondicionIvaId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A13CondicionIvaId) ;
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
         Form.getMeta().addItem("description", "Empresa", (short)(0)) ;
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

   public empresa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public empresa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( empresa_impl.class ));
   }

   public empresa_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Empresa", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Empresa.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Empresa.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Empresa.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Empresa.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.kberp.gx00e0"+"',["+"{Ctrl:gx.dom.el('"+"EMPRESAID"+"'), id:'"+"EMPRESAID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaId_Internalname, GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")), ((edtEmpresaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasMaestras", "right", "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaNombre_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_html_textarea( httpContext, edtEmpresaNombre_Internalname, A43EmpresaNombre, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", (short)(0), 1, edtEmpresaNombre_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "250", -1, 0, "", "", (byte)(-1), true, "NombreTablasMaestras", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaNumeroDocumento_Internalname, "Numero Documento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaNumeroDocumento_Internalname, GXutil.rtrim( A44EmpresaNumeroDocumento), GXutil.rtrim( localUtil.format( A44EmpresaNumeroDocumento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaNumeroDocumento_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaNumeroDocumento_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "NumeroDocumento", "left", "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaCalle_Internalname, "Calle", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaCalle_Internalname, A45EmpresaCalle, GXutil.rtrim( localUtil.format( A45EmpresaCalle, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaCalle_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaCalle_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "DomicilioCalle", "left", "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaNumero_Internalname, "Numero", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaNumero_Internalname, GXutil.ltrim( localUtil.ntoc( A46EmpresaNumero, (byte)(6), (byte)(0), ",", "")), ((edtEmpresaNumero_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46EmpresaNumero), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A46EmpresaNumero), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaNumero_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaNumero_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "DomicilioNumero", "right", "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaPiso_Internalname, "Piso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaPiso_Internalname, GXutil.ltrim( localUtil.ntoc( A47EmpresaPiso, (byte)(3), (byte)(0), ",", "")), ((edtEmpresaPiso_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47EmpresaPiso), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A47EmpresaPiso), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaPiso_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaPiso_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "DomicilioPiso", "right", "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaDepto_Internalname, "Depto", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaDepto_Internalname, A48EmpresaDepto, GXutil.rtrim( localUtil.format( A48EmpresaDepto, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaDepto_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaDepto_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "DomicilioDepto", "left", "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaCPostal_Internalname, "CPostal", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaCPostal_Internalname, A49EmpresaCPostal, GXutil.rtrim( localUtil.format( A49EmpresaCPostal, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaCPostal_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaCPostal_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "DomicilioCPostal", "left", "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtLocalidadId_Internalname, "Localidad Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtLocalidadId_Internalname, GXutil.ltrim( localUtil.ntoc( A5LocalidadId, (byte)(4), (byte)(0), ",", "")), ((edtLocalidadId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5LocalidadId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A5LocalidadId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLocalidadId_Jsonclick, 0, "Attribute", "", "", "", 1, edtLocalidadId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Empresa.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_5_Internalname, sImgUrl, imgprompt_5_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_5_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtPaisId_Internalname, "Pais Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtPaisId_Internalname, GXutil.ltrim( localUtil.ntoc( A3PaisId, (byte)(4), (byte)(0), ",", "")), ((edtPaisId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3PaisId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A3PaisId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPaisId_Jsonclick, 0, "Attribute", "", "", "", 1, edtPaisId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Empresa.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_3_Internalname, sImgUrl, imgprompt_3_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_3_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtProvinciaId_Internalname, "Provincia Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtProvinciaId_Internalname, GXutil.ltrim( localUtil.ntoc( A1ProvinciaId, (byte)(4), (byte)(0), ",", "")), ((edtProvinciaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1ProvinciaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1ProvinciaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProvinciaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtProvinciaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Empresa.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_1_Internalname, sImgUrl, imgprompt_1_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_1_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtCondicionIvaId_Internalname, "Condicion Iva Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtCondicionIvaId_Internalname, GXutil.ltrim( localUtil.ntoc( A13CondicionIvaId, (byte)(4), (byte)(0), ",", "")), ((edtCondicionIvaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13CondicionIvaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A13CondicionIvaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCondicionIvaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtCondicionIvaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Empresa.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_13_Internalname, sImgUrl, imgprompt_13_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_13_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaFechaContrato_Internalname, "Fecha Contrato", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtEmpresaFechaContrato_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaFechaContrato_Internalname, localUtil.format(A50EmpresaFechaContrato, "99/99/99"), localUtil.format( A50EmpresaFechaContrato, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaFechaContrato_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaFechaContrato_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Empresa.htm");
         com.kberp.GxWebStd.gx_bitmap( httpContext, edtEmpresaFechaContrato_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEmpresaFechaContrato_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaNumeroIIBB_Internalname, "Numero IIBB", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaNumeroIIBB_Internalname, GXutil.rtrim( A51EmpresaNumeroIIBB), GXutil.rtrim( localUtil.format( A51EmpresaNumeroIIBB, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaNumeroIIBB_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaNumeroIIBB_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "IIBB", "left", "HLP_Empresa.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEmpresaLogo_Internalname, "Logo", "col-sm-3 AttributeLabel", 1, true);
         ClassString = "Attribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         edtEmpresaLogo_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmpresaLogo_Internalname, "Filetype", edtEmpresaLogo_Filetype);
         if ( ! (GXutil.strcmp("", A52EmpresaLogo)==0) )
         {
            gxblobfileaux.setSource( A52EmpresaLogo );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtEmpresaLogo_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtEmpresaLogo_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               A52EmpresaLogo = gxblobfileaux.getAbsoluteName() ;
               httpContext.ajax_rsp_assign_attri("", false, "A52EmpresaLogo", A52EmpresaLogo);
               httpContext.ajax_rsp_assign_prop("", false, edtEmpresaLogo_Internalname, "URL", httpContext.getResourceRelative(A52EmpresaLogo));
               edtEmpresaLogo_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtEmpresaLogo_Internalname, "Filetype", edtEmpresaLogo_Filetype);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtEmpresaLogo_Internalname, "URL", httpContext.getResourceRelative(A52EmpresaLogo));
         }
         com.kberp.GxWebStd.gx_blob_field( httpContext, edtEmpresaLogo_Internalname, GXutil.rtrim( A52EmpresaLogo), httpContext.getResourceRelative(A52EmpresaLogo), ((GXutil.strcmp("", edtEmpresaLogo_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtEmpresaLogo_Filetype)==0) ? A52EmpresaLogo : edtEmpresaLogo_Filetype)) : edtEmpresaLogo_Contenttype), false, "", edtEmpresaLogo_Parameters, 0, edtEmpresaLogo_Enabled, 1, "", "", 0, -1, 250, "px", 60, "px", 0, 0, 0, edtEmpresaLogo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "", "", "HLP_Empresa.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Empresa.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Empresa.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Empresa.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      /* Execute Exit event if defined. */
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
            A43EmpresaNombre = httpContext.cgiGet( edtEmpresaNombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A43EmpresaNombre", A43EmpresaNombre);
            A44EmpresaNumeroDocumento = httpContext.cgiGet( edtEmpresaNumeroDocumento_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44EmpresaNumeroDocumento", A44EmpresaNumeroDocumento);
            A45EmpresaCalle = httpContext.cgiGet( edtEmpresaCalle_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45EmpresaCalle", A45EmpresaCalle);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEmpresaNumero_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEmpresaNumero_Internalname), ",", ".") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPRESANUMERO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmpresaNumero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A46EmpresaNumero = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A46EmpresaNumero", GXutil.ltrim( GXutil.str( A46EmpresaNumero, 6, 0)));
            }
            else
            {
               A46EmpresaNumero = (int)(localUtil.ctol( httpContext.cgiGet( edtEmpresaNumero_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A46EmpresaNumero", GXutil.ltrim( GXutil.str( A46EmpresaNumero, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEmpresaPiso_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEmpresaPiso_Internalname), ",", ".") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPRESAPISO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmpresaPiso_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A47EmpresaPiso = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47EmpresaPiso", GXutil.ltrim( GXutil.str( A47EmpresaPiso, 3, 0)));
            }
            else
            {
               A47EmpresaPiso = (short)(localUtil.ctol( httpContext.cgiGet( edtEmpresaPiso_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47EmpresaPiso", GXutil.ltrim( GXutil.str( A47EmpresaPiso, 3, 0)));
            }
            A48EmpresaDepto = httpContext.cgiGet( edtEmpresaDepto_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48EmpresaDepto", A48EmpresaDepto);
            A49EmpresaCPostal = httpContext.cgiGet( edtEmpresaCPostal_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49EmpresaCPostal", A49EmpresaCPostal);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLocalidadId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLocalidadId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LOCALIDADID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLocalidadId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5LocalidadId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5LocalidadId", GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
            }
            else
            {
               A5LocalidadId = (short)(localUtil.ctol( httpContext.cgiGet( edtLocalidadId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5LocalidadId", GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPaisId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPaisId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PAISID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPaisId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3PaisId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3PaisId", GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
            }
            else
            {
               A3PaisId = (short)(localUtil.ctol( httpContext.cgiGet( edtPaisId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3PaisId", GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProvinciaId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProvinciaId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROVINCIAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProvinciaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1ProvinciaId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1ProvinciaId", GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
            }
            else
            {
               A1ProvinciaId = (short)(localUtil.ctol( httpContext.cgiGet( edtProvinciaId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1ProvinciaId", GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCondicionIvaId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCondicionIvaId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CONDICIONIVAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCondicionIvaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13CondicionIvaId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13CondicionIvaId", GXutil.ltrim( GXutil.str( A13CondicionIvaId, 4, 0)));
            }
            else
            {
               A13CondicionIvaId = (short)(localUtil.ctol( httpContext.cgiGet( edtCondicionIvaId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13CondicionIvaId", GXutil.ltrim( GXutil.str( A13CondicionIvaId, 4, 0)));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtEmpresaFechaContrato_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "EMPRESAFECHACONTRATO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmpresaFechaContrato_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A50EmpresaFechaContrato = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A50EmpresaFechaContrato", localUtil.format(A50EmpresaFechaContrato, "99/99/99"));
            }
            else
            {
               A50EmpresaFechaContrato = localUtil.ctod( httpContext.cgiGet( edtEmpresaFechaContrato_Internalname), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A50EmpresaFechaContrato", localUtil.format(A50EmpresaFechaContrato, "99/99/99"));
            }
            A51EmpresaNumeroIIBB = httpContext.cgiGet( edtEmpresaNumeroIIBB_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51EmpresaNumeroIIBB", A51EmpresaNumeroIIBB);
            A52EmpresaLogo = httpContext.cgiGet( edtEmpresaLogo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52EmpresaLogo", A52EmpresaLogo);
            /* Read saved values. */
            Z42EmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( "Z42EmpresaId"), ",", ".")) ;
            Z43EmpresaNombre = httpContext.cgiGet( "Z43EmpresaNombre") ;
            Z44EmpresaNumeroDocumento = httpContext.cgiGet( "Z44EmpresaNumeroDocumento") ;
            Z45EmpresaCalle = httpContext.cgiGet( "Z45EmpresaCalle") ;
            Z46EmpresaNumero = (int)(localUtil.ctol( httpContext.cgiGet( "Z46EmpresaNumero"), ",", ".")) ;
            Z47EmpresaPiso = (short)(localUtil.ctol( httpContext.cgiGet( "Z47EmpresaPiso"), ",", ".")) ;
            Z48EmpresaDepto = httpContext.cgiGet( "Z48EmpresaDepto") ;
            Z49EmpresaCPostal = httpContext.cgiGet( "Z49EmpresaCPostal") ;
            Z50EmpresaFechaContrato = localUtil.ctod( httpContext.cgiGet( "Z50EmpresaFechaContrato"), 0) ;
            Z51EmpresaNumeroIIBB = httpContext.cgiGet( "Z51EmpresaNumeroIIBB") ;
            Z5LocalidadId = (short)(localUtil.ctol( httpContext.cgiGet( "Z5LocalidadId"), ",", ".")) ;
            Z3PaisId = (short)(localUtil.ctol( httpContext.cgiGet( "Z3PaisId"), ",", ".")) ;
            Z1ProvinciaId = (short)(localUtil.ctol( httpContext.cgiGet( "Z1ProvinciaId"), ",", ".")) ;
            Z13CondicionIvaId = (short)(localUtil.ctol( httpContext.cgiGet( "Z13CondicionIvaId"), ",", ".")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            edtEmpresaLogo_Filename = httpContext.cgiGet( "EMPRESALOGO_Filename") ;
            edtEmpresaLogo_Filetype = httpContext.cgiGet( "EMPRESALOGO_Filetype") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            if ( ! (GXutil.strcmp("", A52EmpresaLogo)==0) )
            {
               edtEmpresaLogo_Filename = httpContext.cgiGetFileName( edtEmpresaLogo_Internalname) ;
               edtEmpresaLogo_Filetype = httpContext.cgiGetFileType( edtEmpresaLogo_Internalname) ;
            }
            if ( (GXutil.strcmp("", A52EmpresaLogo)==0) )
            {
               GXCCtlgxBlob = "EMPRESALOGO" + "_gxBlob" ;
               A52EmpresaLogo = httpContext.cgiGet( GXCCtlgxBlob) ;
            }
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            initAll0D14( ) ;
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
      disableAttributes0D14( ) ;
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

   public void resetCaption0D0( )
   {
   }

   public void zm0D14( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z43EmpresaNombre = T000D3_A43EmpresaNombre[0] ;
            Z44EmpresaNumeroDocumento = T000D3_A44EmpresaNumeroDocumento[0] ;
            Z45EmpresaCalle = T000D3_A45EmpresaCalle[0] ;
            Z46EmpresaNumero = T000D3_A46EmpresaNumero[0] ;
            Z47EmpresaPiso = T000D3_A47EmpresaPiso[0] ;
            Z48EmpresaDepto = T000D3_A48EmpresaDepto[0] ;
            Z49EmpresaCPostal = T000D3_A49EmpresaCPostal[0] ;
            Z50EmpresaFechaContrato = T000D3_A50EmpresaFechaContrato[0] ;
            Z51EmpresaNumeroIIBB = T000D3_A51EmpresaNumeroIIBB[0] ;
            Z5LocalidadId = T000D3_A5LocalidadId[0] ;
            Z3PaisId = T000D3_A3PaisId[0] ;
            Z1ProvinciaId = T000D3_A1ProvinciaId[0] ;
            Z13CondicionIvaId = T000D3_A13CondicionIvaId[0] ;
         }
         else
         {
            Z43EmpresaNombre = A43EmpresaNombre ;
            Z44EmpresaNumeroDocumento = A44EmpresaNumeroDocumento ;
            Z45EmpresaCalle = A45EmpresaCalle ;
            Z46EmpresaNumero = A46EmpresaNumero ;
            Z47EmpresaPiso = A47EmpresaPiso ;
            Z48EmpresaDepto = A48EmpresaDepto ;
            Z49EmpresaCPostal = A49EmpresaCPostal ;
            Z50EmpresaFechaContrato = A50EmpresaFechaContrato ;
            Z51EmpresaNumeroIIBB = A51EmpresaNumeroIIBB ;
            Z5LocalidadId = A5LocalidadId ;
            Z3PaisId = A3PaisId ;
            Z1ProvinciaId = A1ProvinciaId ;
            Z13CondicionIvaId = A13CondicionIvaId ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z42EmpresaId = A42EmpresaId ;
         Z43EmpresaNombre = A43EmpresaNombre ;
         Z44EmpresaNumeroDocumento = A44EmpresaNumeroDocumento ;
         Z45EmpresaCalle = A45EmpresaCalle ;
         Z46EmpresaNumero = A46EmpresaNumero ;
         Z47EmpresaPiso = A47EmpresaPiso ;
         Z48EmpresaDepto = A48EmpresaDepto ;
         Z49EmpresaCPostal = A49EmpresaCPostal ;
         Z50EmpresaFechaContrato = A50EmpresaFechaContrato ;
         Z51EmpresaNumeroIIBB = A51EmpresaNumeroIIBB ;
         Z52EmpresaLogo = A52EmpresaLogo ;
         Z5LocalidadId = A5LocalidadId ;
         Z3PaisId = A3PaisId ;
         Z1ProvinciaId = A1ProvinciaId ;
         Z13CondicionIvaId = A13CondicionIvaId ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_5_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0030"+"',["+"{Ctrl:gx.dom.el('"+"LOCALIDADID"+"'), id:'"+"LOCALIDADID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_3_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0020"+"',["+"{Ctrl:gx.dom.el('"+"PAISID"+"'), id:'"+"PAISID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_1_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"PROVINCIAID"+"'), id:'"+"PROVINCIAID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_13_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0070"+"',["+"{Ctrl:gx.dom.el('"+"CONDICIONIVAID"+"'), id:'"+"CONDICIONIVAID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
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

   public void load0D14( )
   {
      /* Using cursor T000D8 */
      pr_default.execute(6, new Object[] {new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A43EmpresaNombre = T000D8_A43EmpresaNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43EmpresaNombre", A43EmpresaNombre);
         A44EmpresaNumeroDocumento = T000D8_A44EmpresaNumeroDocumento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44EmpresaNumeroDocumento", A44EmpresaNumeroDocumento);
         A45EmpresaCalle = T000D8_A45EmpresaCalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45EmpresaCalle", A45EmpresaCalle);
         A46EmpresaNumero = T000D8_A46EmpresaNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46EmpresaNumero", GXutil.ltrim( GXutil.str( A46EmpresaNumero, 6, 0)));
         A47EmpresaPiso = T000D8_A47EmpresaPiso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47EmpresaPiso", GXutil.ltrim( GXutil.str( A47EmpresaPiso, 3, 0)));
         A48EmpresaDepto = T000D8_A48EmpresaDepto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48EmpresaDepto", A48EmpresaDepto);
         A49EmpresaCPostal = T000D8_A49EmpresaCPostal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49EmpresaCPostal", A49EmpresaCPostal);
         A50EmpresaFechaContrato = T000D8_A50EmpresaFechaContrato[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50EmpresaFechaContrato", localUtil.format(A50EmpresaFechaContrato, "99/99/99"));
         A51EmpresaNumeroIIBB = T000D8_A51EmpresaNumeroIIBB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51EmpresaNumeroIIBB", A51EmpresaNumeroIIBB);
         A52EmpresaLogo = T000D8_A52EmpresaLogo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52EmpresaLogo", A52EmpresaLogo);
         httpContext.ajax_rsp_assign_prop("", false, edtEmpresaLogo_Internalname, "URL", httpContext.getResourceRelative(A52EmpresaLogo));
         A5LocalidadId = T000D8_A5LocalidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5LocalidadId", GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
         A3PaisId = T000D8_A3PaisId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3PaisId", GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
         A1ProvinciaId = T000D8_A1ProvinciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1ProvinciaId", GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
         A13CondicionIvaId = T000D8_A13CondicionIvaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13CondicionIvaId", GXutil.ltrim( GXutil.str( A13CondicionIvaId, 4, 0)));
         zm0D14( -1) ;
      }
      pr_default.close(6);
      onLoadActions0D14( ) ;
   }

   public void onLoadActions0D14( )
   {
   }

   public void checkExtendedTable0D14( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T000D4 */
      pr_default.execute(2, new Object[] {new Short(A5LocalidadId)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Localidad'.", "ForeignKeyNotFound", 1, "LOCALIDADID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLocalidadId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T000D5 */
      pr_default.execute(3, new Object[] {new Short(A3PaisId)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Pais'.", "ForeignKeyNotFound", 1, "PAISID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPaisId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T000D6 */
      pr_default.execute(4, new Object[] {new Short(A1ProvinciaId)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Provincia'.", "ForeignKeyNotFound", 1, "PROVINCIAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProvinciaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      /* Using cursor T000D7 */
      pr_default.execute(5, new Object[] {new Short(A13CondicionIvaId)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Condicion Iva'.", "ForeignKeyNotFound", 1, "CONDICIONIVAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCondicionIvaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors0D14( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( short A5LocalidadId )
   {
      /* Using cursor T000D9 */
      pr_default.execute(7, new Object[] {new Short(A5LocalidadId)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Localidad'.", "ForeignKeyNotFound", 1, "LOCALIDADID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLocalidadId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(7);
   }

   public void gxload_3( short A3PaisId )
   {
      /* Using cursor T000D10 */
      pr_default.execute(8, new Object[] {new Short(A3PaisId)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Pais'.", "ForeignKeyNotFound", 1, "PAISID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPaisId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(8);
   }

   public void gxload_4( short A1ProvinciaId )
   {
      /* Using cursor T000D11 */
      pr_default.execute(9, new Object[] {new Short(A1ProvinciaId)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Provincia'.", "ForeignKeyNotFound", 1, "PROVINCIAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProvinciaId_Internalname ;
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

   public void gxload_5( short A13CondicionIvaId )
   {
      /* Using cursor T000D12 */
      pr_default.execute(10, new Object[] {new Short(A13CondicionIvaId)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Condicion Iva'.", "ForeignKeyNotFound", 1, "CONDICIONIVAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCondicionIvaId_Internalname ;
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

   public void getKey0D14( )
   {
      /* Using cursor T000D13 */
      pr_default.execute(11, new Object[] {new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound14 = (short)(1) ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000D3 */
      pr_default.execute(1, new Object[] {new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0D14( 1) ;
         RcdFound14 = (short)(1) ;
         A42EmpresaId = T000D3_A42EmpresaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         A43EmpresaNombre = T000D3_A43EmpresaNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43EmpresaNombre", A43EmpresaNombre);
         A44EmpresaNumeroDocumento = T000D3_A44EmpresaNumeroDocumento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44EmpresaNumeroDocumento", A44EmpresaNumeroDocumento);
         A45EmpresaCalle = T000D3_A45EmpresaCalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45EmpresaCalle", A45EmpresaCalle);
         A46EmpresaNumero = T000D3_A46EmpresaNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46EmpresaNumero", GXutil.ltrim( GXutil.str( A46EmpresaNumero, 6, 0)));
         A47EmpresaPiso = T000D3_A47EmpresaPiso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47EmpresaPiso", GXutil.ltrim( GXutil.str( A47EmpresaPiso, 3, 0)));
         A48EmpresaDepto = T000D3_A48EmpresaDepto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48EmpresaDepto", A48EmpresaDepto);
         A49EmpresaCPostal = T000D3_A49EmpresaCPostal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49EmpresaCPostal", A49EmpresaCPostal);
         A50EmpresaFechaContrato = T000D3_A50EmpresaFechaContrato[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50EmpresaFechaContrato", localUtil.format(A50EmpresaFechaContrato, "99/99/99"));
         A51EmpresaNumeroIIBB = T000D3_A51EmpresaNumeroIIBB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51EmpresaNumeroIIBB", A51EmpresaNumeroIIBB);
         A52EmpresaLogo = T000D3_A52EmpresaLogo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52EmpresaLogo", A52EmpresaLogo);
         httpContext.ajax_rsp_assign_prop("", false, edtEmpresaLogo_Internalname, "URL", httpContext.getResourceRelative(A52EmpresaLogo));
         A5LocalidadId = T000D3_A5LocalidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5LocalidadId", GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
         A3PaisId = T000D3_A3PaisId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3PaisId", GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
         A1ProvinciaId = T000D3_A1ProvinciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1ProvinciaId", GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
         A13CondicionIvaId = T000D3_A13CondicionIvaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13CondicionIvaId", GXutil.ltrim( GXutil.str( A13CondicionIvaId, 4, 0)));
         Z42EmpresaId = A42EmpresaId ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0D14( ) ;
         if ( AnyError == 1 )
         {
            RcdFound14 = (short)(0) ;
            initializeNonKey0D14( ) ;
         }
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound14 = (short)(0) ;
         initializeNonKey0D14( ) ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0D14( ) ;
      if ( RcdFound14 == 0 )
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
      RcdFound14 = (short)(0) ;
      /* Using cursor T000D14 */
      pr_default.execute(12, new Object[] {new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T000D14_A42EmpresaId[0] < A42EmpresaId ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T000D14_A42EmpresaId[0] > A42EmpresaId ) ) )
         {
            A42EmpresaId = T000D14_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            RcdFound14 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound14 = (short)(0) ;
      /* Using cursor T000D15 */
      pr_default.execute(13, new Object[] {new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T000D15_A42EmpresaId[0] > A42EmpresaId ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T000D15_A42EmpresaId[0] < A42EmpresaId ) ) )
         {
            A42EmpresaId = T000D15_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            RcdFound14 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0D14( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0D14( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound14 == 1 )
         {
            if ( A42EmpresaId != Z42EmpresaId )
            {
               A42EmpresaId = Z42EmpresaId ;
               httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
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
               update0D14( ) ;
               GX_FocusControl = edtEmpresaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A42EmpresaId != Z42EmpresaId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmpresaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0D14( ) ;
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
                  insert0D14( ) ;
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
      if ( A42EmpresaId != Z42EmpresaId )
      {
         A42EmpresaId = Z42EmpresaId ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
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
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEmpresaNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0D14( ) ;
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmpresaNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0D14( ) ;
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
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmpresaNombre_Internalname ;
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
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmpresaNombre_Internalname ;
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
      scanStart0D14( ) ;
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound14 != 0 )
         {
            scanNext0D14( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmpresaNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0D14( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0D14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000D2 */
         pr_default.execute(0, new Object[] {new Integer(A42EmpresaId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Empresa"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z43EmpresaNombre, T000D2_A43EmpresaNombre[0]) != 0 ) || ( GXutil.strcmp(Z44EmpresaNumeroDocumento, T000D2_A44EmpresaNumeroDocumento[0]) != 0 ) || ( GXutil.strcmp(Z45EmpresaCalle, T000D2_A45EmpresaCalle[0]) != 0 ) || ( Z46EmpresaNumero != T000D2_A46EmpresaNumero[0] ) || ( Z47EmpresaPiso != T000D2_A47EmpresaPiso[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z48EmpresaDepto, T000D2_A48EmpresaDepto[0]) != 0 ) || ( GXutil.strcmp(Z49EmpresaCPostal, T000D2_A49EmpresaCPostal[0]) != 0 ) || !( GXutil.dateCompare(Z50EmpresaFechaContrato, T000D2_A50EmpresaFechaContrato[0]) ) || ( GXutil.strcmp(Z51EmpresaNumeroIIBB, T000D2_A51EmpresaNumeroIIBB[0]) != 0 ) || ( Z5LocalidadId != T000D2_A5LocalidadId[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3PaisId != T000D2_A3PaisId[0] ) || ( Z1ProvinciaId != T000D2_A1ProvinciaId[0] ) || ( Z13CondicionIvaId != T000D2_A13CondicionIvaId[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Empresa"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0D14( )
   {
      beforeValidate0D14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0D14( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0D14( 0) ;
         checkOptimisticConcurrency0D14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0D14( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0D14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000D16 */
                  pr_default.execute(14, new Object[] {new Integer(A42EmpresaId), A43EmpresaNombre, A44EmpresaNumeroDocumento, A45EmpresaCalle, new Integer(A46EmpresaNumero), new Short(A47EmpresaPiso), A48EmpresaDepto, A49EmpresaCPostal, A50EmpresaFechaContrato, A51EmpresaNumeroIIBB, A52EmpresaLogo, new Short(A5LocalidadId), new Short(A3PaisId), new Short(A1ProvinciaId), new Short(A13CondicionIvaId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Empresa") ;
                  if ( (pr_default.getStatus(14) == 1) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption0D0( ) ;
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
            load0D14( ) ;
         }
         endLevel0D14( ) ;
      }
      closeExtendedTableCursors0D14( ) ;
   }

   public void update0D14( )
   {
      beforeValidate0D14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0D14( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0D14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0D14( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0D14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000D17 */
                  pr_default.execute(15, new Object[] {A43EmpresaNombre, A44EmpresaNumeroDocumento, A45EmpresaCalle, new Integer(A46EmpresaNumero), new Short(A47EmpresaPiso), A48EmpresaDepto, A49EmpresaCPostal, A50EmpresaFechaContrato, A51EmpresaNumeroIIBB, new Short(A5LocalidadId), new Short(A3PaisId), new Short(A1ProvinciaId), new Short(A13CondicionIvaId), new Integer(A42EmpresaId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Empresa") ;
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Empresa"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0D14( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption0D0( ) ;
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
         endLevel0D14( ) ;
      }
      closeExtendedTableCursors0D14( ) ;
   }

   public void deferredUpdate0D14( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor T000D18 */
         pr_default.execute(16, new Object[] {A52EmpresaLogo, new Integer(A42EmpresaId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("Empresa") ;
      }
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0D14( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0D14( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0D14( ) ;
         afterConfirm0D14( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0D14( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000D19 */
               pr_default.execute(17, new Object[] {new Integer(A42EmpresaId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Empresa") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound14 == 0 )
                     {
                        initAll0D14( ) ;
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
                     resetCaption0D0( ) ;
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
      sMode14 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0D14( ) ;
      Gx_mode = sMode14 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0D14( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000D20 */
         pr_default.execute(18, new Object[] {new Integer(A42EmpresaId)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Entidad"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevel0D14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0D14( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "empresa");
         if ( AnyError == 0 )
         {
            confirmValues0D0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "empresa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0D14( )
   {
      /* Using cursor T000D21 */
      pr_default.execute(19);
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A42EmpresaId = T000D21_A42EmpresaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0D14( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A42EmpresaId = T000D21_A42EmpresaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
      }
   }

   public void scanEnd0D14( )
   {
      pr_default.close(19);
   }

   public void afterConfirm0D14( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0D14( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0D14( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0D14( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0D14( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0D14( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0D14( )
   {
      edtEmpresaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaId_Enabled, 5, 0)));
      edtEmpresaNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaNombre_Enabled, 5, 0)));
      edtEmpresaNumeroDocumento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaNumeroDocumento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaNumeroDocumento_Enabled, 5, 0)));
      edtEmpresaCalle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaCalle_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaCalle_Enabled, 5, 0)));
      edtEmpresaNumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaNumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaNumero_Enabled, 5, 0)));
      edtEmpresaPiso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaPiso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaPiso_Enabled, 5, 0)));
      edtEmpresaDepto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaDepto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaDepto_Enabled, 5, 0)));
      edtEmpresaCPostal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaCPostal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaCPostal_Enabled, 5, 0)));
      edtLocalidadId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLocalidadId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtLocalidadId_Enabled, 5, 0)));
      edtPaisId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPaisId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPaisId_Enabled, 5, 0)));
      edtProvinciaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProvinciaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtProvinciaId_Enabled, 5, 0)));
      edtCondicionIvaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCondicionIvaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCondicionIvaId_Enabled, 5, 0)));
      edtEmpresaFechaContrato_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaFechaContrato_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaFechaContrato_Enabled, 5, 0)));
      edtEmpresaNumeroIIBB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaNumeroIIBB_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaNumeroIIBB_Enabled, 5, 0)));
      edtEmpresaLogo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaLogo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaLogo_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0D0( )
   {
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721917321428");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.empresa") +"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z43EmpresaNombre", Z43EmpresaNombre);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z44EmpresaNumeroDocumento", GXutil.rtrim( Z44EmpresaNumeroDocumento));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z45EmpresaCalle", Z45EmpresaCalle);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z46EmpresaNumero", GXutil.ltrim( localUtil.ntoc( Z46EmpresaNumero, (byte)(6), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z47EmpresaPiso", GXutil.ltrim( localUtil.ntoc( Z47EmpresaPiso, (byte)(3), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z48EmpresaDepto", Z48EmpresaDepto);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z49EmpresaCPostal", Z49EmpresaCPostal);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z50EmpresaFechaContrato", localUtil.dtoc( Z50EmpresaFechaContrato, 0, "/"));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z51EmpresaNumeroIIBB", GXutil.rtrim( Z51EmpresaNumeroIIBB));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z5LocalidadId", GXutil.ltrim( localUtil.ntoc( Z5LocalidadId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z3PaisId", GXutil.ltrim( localUtil.ntoc( Z3PaisId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z1ProvinciaId", GXutil.ltrim( localUtil.ntoc( Z1ProvinciaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z13CondicionIvaId", GXutil.ltrim( localUtil.ntoc( Z13CondicionIvaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      GXCCtlgxBlob = "EMPRESALOGO" + "_gxBlob" ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, A52EmpresaLogo);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESALOGO_Filename", GXutil.rtrim( edtEmpresaLogo_Filename));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "EMPRESALOGO_Filetype", GXutil.rtrim( edtEmpresaLogo_Filetype));
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
      return formatLink("com.kberp.empresa")  ;
   }

   public String getPgmname( )
   {
      return "Empresa" ;
   }

   public String getPgmdesc( )
   {
      return "Empresa" ;
   }

   public void initializeNonKey0D14( )
   {
      A43EmpresaNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A43EmpresaNombre", A43EmpresaNombre);
      A44EmpresaNumeroDocumento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A44EmpresaNumeroDocumento", A44EmpresaNumeroDocumento);
      A45EmpresaCalle = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45EmpresaCalle", A45EmpresaCalle);
      A46EmpresaNumero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A46EmpresaNumero", GXutil.ltrim( GXutil.str( A46EmpresaNumero, 6, 0)));
      A47EmpresaPiso = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47EmpresaPiso", GXutil.ltrim( GXutil.str( A47EmpresaPiso, 3, 0)));
      A48EmpresaDepto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A48EmpresaDepto", A48EmpresaDepto);
      A49EmpresaCPostal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A49EmpresaCPostal", A49EmpresaCPostal);
      A5LocalidadId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5LocalidadId", GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
      A3PaisId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3PaisId", GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
      A1ProvinciaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1ProvinciaId", GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
      A13CondicionIvaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13CondicionIvaId", GXutil.ltrim( GXutil.str( A13CondicionIvaId, 4, 0)));
      A50EmpresaFechaContrato = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A50EmpresaFechaContrato", localUtil.format(A50EmpresaFechaContrato, "99/99/99"));
      A51EmpresaNumeroIIBB = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A51EmpresaNumeroIIBB", A51EmpresaNumeroIIBB);
      A52EmpresaLogo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A52EmpresaLogo", A52EmpresaLogo);
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaLogo_Internalname, "URL", httpContext.getResourceRelative(A52EmpresaLogo));
      Z43EmpresaNombre = "" ;
      Z44EmpresaNumeroDocumento = "" ;
      Z45EmpresaCalle = "" ;
      Z46EmpresaNumero = 0 ;
      Z47EmpresaPiso = (short)(0) ;
      Z48EmpresaDepto = "" ;
      Z49EmpresaCPostal = "" ;
      Z50EmpresaFechaContrato = GXutil.nullDate() ;
      Z51EmpresaNumeroIIBB = "" ;
      Z5LocalidadId = (short)(0) ;
      Z3PaisId = (short)(0) ;
      Z1ProvinciaId = (short)(0) ;
      Z13CondicionIvaId = (short)(0) ;
   }

   public void initAll0D14( )
   {
      A42EmpresaId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
      initializeNonKey0D14( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?131246");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1731551");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721917321446");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("empresa.js", "?201721917321447");
      /* End function include_jscripts */
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
      edtEmpresaNombre_Internalname = "EMPRESANOMBRE" ;
      edtEmpresaNumeroDocumento_Internalname = "EMPRESANUMERODOCUMENTO" ;
      edtEmpresaCalle_Internalname = "EMPRESACALLE" ;
      edtEmpresaNumero_Internalname = "EMPRESANUMERO" ;
      edtEmpresaPiso_Internalname = "EMPRESAPISO" ;
      edtEmpresaDepto_Internalname = "EMPRESADEPTO" ;
      edtEmpresaCPostal_Internalname = "EMPRESACPOSTAL" ;
      edtLocalidadId_Internalname = "LOCALIDADID" ;
      edtPaisId_Internalname = "PAISID" ;
      edtProvinciaId_Internalname = "PROVINCIAID" ;
      edtCondicionIvaId_Internalname = "CONDICIONIVAID" ;
      edtEmpresaFechaContrato_Internalname = "EMPRESAFECHACONTRATO" ;
      edtEmpresaNumeroIIBB_Internalname = "EMPRESANUMEROIIBB" ;
      edtEmpresaLogo_Internalname = "EMPRESALOGO" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_5_Internalname = "PROMPT_5" ;
      imgprompt_3_Internalname = "PROMPT_3" ;
      imgprompt_1_Internalname = "PROMPT_1" ;
      imgprompt_13_Internalname = "PROMPT_13" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtEmpresaLogo_Filename = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Empresa" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEmpresaLogo_Jsonclick = "" ;
      edtEmpresaLogo_Parameters = "" ;
      edtEmpresaLogo_Contenttype = "" ;
      edtEmpresaLogo_Filetype = "" ;
      edtEmpresaLogo_Enabled = 1 ;
      edtEmpresaNumeroIIBB_Jsonclick = "" ;
      edtEmpresaNumeroIIBB_Enabled = 1 ;
      edtEmpresaFechaContrato_Jsonclick = "" ;
      edtEmpresaFechaContrato_Enabled = 1 ;
      imgprompt_13_Visible = 1 ;
      imgprompt_13_Link = "" ;
      edtCondicionIvaId_Jsonclick = "" ;
      edtCondicionIvaId_Enabled = 1 ;
      imgprompt_1_Visible = 1 ;
      imgprompt_1_Link = "" ;
      edtProvinciaId_Jsonclick = "" ;
      edtProvinciaId_Enabled = 1 ;
      imgprompt_3_Visible = 1 ;
      imgprompt_3_Link = "" ;
      edtPaisId_Jsonclick = "" ;
      edtPaisId_Enabled = 1 ;
      imgprompt_5_Visible = 1 ;
      imgprompt_5_Link = "" ;
      edtLocalidadId_Jsonclick = "" ;
      edtLocalidadId_Enabled = 1 ;
      edtEmpresaCPostal_Jsonclick = "" ;
      edtEmpresaCPostal_Enabled = 1 ;
      edtEmpresaDepto_Jsonclick = "" ;
      edtEmpresaDepto_Enabled = 1 ;
      edtEmpresaPiso_Jsonclick = "" ;
      edtEmpresaPiso_Enabled = 1 ;
      edtEmpresaNumero_Jsonclick = "" ;
      edtEmpresaNumero_Enabled = 1 ;
      edtEmpresaCalle_Jsonclick = "" ;
      edtEmpresaCalle_Enabled = 1 ;
      edtEmpresaNumeroDocumento_Jsonclick = "" ;
      edtEmpresaNumeroDocumento_Enabled = 1 ;
      edtEmpresaNombre_Enabled = 1 ;
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

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtEmpresaNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Empresaid( int GX_Parm1 ,
                                String GX_Parm2 ,
                                String GX_Parm3 ,
                                String GX_Parm4 ,
                                int GX_Parm5 ,
                                short GX_Parm6 ,
                                String GX_Parm7 ,
                                String GX_Parm8 ,
                                java.util.Date GX_Parm9 ,
                                String GX_Parm10 ,
                                String GX_Parm11 ,
                                short GX_Parm12 ,
                                short GX_Parm13 ,
                                short GX_Parm14 ,
                                short GX_Parm15 )
   {
      A42EmpresaId = GX_Parm1 ;
      A43EmpresaNombre = GX_Parm2 ;
      A44EmpresaNumeroDocumento = GX_Parm3 ;
      A45EmpresaCalle = GX_Parm4 ;
      A46EmpresaNumero = GX_Parm5 ;
      A47EmpresaPiso = GX_Parm6 ;
      A48EmpresaDepto = GX_Parm7 ;
      A49EmpresaCPostal = GX_Parm8 ;
      A50EmpresaFechaContrato = GX_Parm9 ;
      A51EmpresaNumeroIIBB = GX_Parm10 ;
      A52EmpresaLogo = GX_Parm11 ;
      A5LocalidadId = GX_Parm12 ;
      A3PaisId = GX_Parm13 ;
      A1ProvinciaId = GX_Parm14 ;
      A13CondicionIvaId = GX_Parm15 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A43EmpresaNombre);
      isValidOutput.add(GXutil.rtrim( A44EmpresaNumeroDocumento));
      isValidOutput.add(A45EmpresaCalle);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A46EmpresaNumero, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A47EmpresaPiso, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(A48EmpresaDepto);
      isValidOutput.add(A49EmpresaCPostal);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A5LocalidadId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A3PaisId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A1ProvinciaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A13CondicionIvaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.format(A50EmpresaFechaContrato, "99/99/99"));
      isValidOutput.add(GXutil.rtrim( A51EmpresaNumeroIIBB));
      isValidOutput.add(httpContext.getResourceRelative(A52EmpresaLogo));
      isValidOutput.add(A52EmpresaLogo);
      isValidOutput.add(edtEmpresaLogo_Filetype);
      isValidOutput.add(edtEmpresaLogo_Filename);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z42EmpresaId, (byte)(6), (byte)(0), ",", "")));
      isValidOutput.add(Z43EmpresaNombre);
      isValidOutput.add(GXutil.rtrim( Z44EmpresaNumeroDocumento));
      isValidOutput.add(Z45EmpresaCalle);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z46EmpresaNumero, (byte)(6), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z47EmpresaPiso, (byte)(3), (byte)(0), ",", "")));
      isValidOutput.add(Z48EmpresaDepto);
      isValidOutput.add(Z49EmpresaCPostal);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z5LocalidadId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z3PaisId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z1ProvinciaId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z13CondicionIvaId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.dtoc( Z50EmpresaFechaContrato, 0, "/"));
      isValidOutput.add(GXutil.rtrim( Z51EmpresaNumeroIIBB));
      isValidOutput.add(httpContext.getResourceRelative(Z52EmpresaLogo));
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Localidadid( short GX_Parm1 )
   {
      A5LocalidadId = GX_Parm1 ;
      /* Using cursor T000D22 */
      pr_default.execute(20, new Object[] {new Short(A5LocalidadId)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Localidad'.", "ForeignKeyNotFound", 1, "LOCALIDADID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLocalidadId_Internalname ;
      }
      pr_default.close(20);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Paisid( short GX_Parm1 )
   {
      A3PaisId = GX_Parm1 ;
      /* Using cursor T000D23 */
      pr_default.execute(21, new Object[] {new Short(A3PaisId)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Pais'.", "ForeignKeyNotFound", 1, "PAISID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPaisId_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Provinciaid( short GX_Parm1 )
   {
      A1ProvinciaId = GX_Parm1 ;
      /* Using cursor T000D24 */
      pr_default.execute(22, new Object[] {new Short(A1ProvinciaId)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Provincia'.", "ForeignKeyNotFound", 1, "PROVINCIAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProvinciaId_Internalname ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Condicionivaid( short GX_Parm1 )
   {
      A13CondicionIvaId = GX_Parm1 ;
      /* Using cursor T000D25 */
      pr_default.execute(23, new Object[] {new Short(A13CondicionIvaId)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Condicion Iva'.", "ForeignKeyNotFound", 1, "CONDICIONIVAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCondicionIvaId_Internalname ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
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
      pr_default.close(20);
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z43EmpresaNombre = "" ;
      Z44EmpresaNumeroDocumento = "" ;
      Z45EmpresaCalle = "" ;
      Z48EmpresaDepto = "" ;
      Z49EmpresaCPostal = "" ;
      Z50EmpresaFechaContrato = GXutil.nullDate() ;
      Z51EmpresaNumeroIIBB = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A43EmpresaNombre = "" ;
      A44EmpresaNumeroDocumento = "" ;
      A45EmpresaCalle = "" ;
      A48EmpresaDepto = "" ;
      A49EmpresaCPostal = "" ;
      sImgUrl = "" ;
      A50EmpresaFechaContrato = GXutil.nullDate() ;
      A51EmpresaNumeroIIBB = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      A52EmpresaLogo = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      GXCCtlgxBlob = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Z52EmpresaLogo = "" ;
      T000D8_A42EmpresaId = new int[1] ;
      T000D8_A43EmpresaNombre = new String[] {""} ;
      T000D8_A44EmpresaNumeroDocumento = new String[] {""} ;
      T000D8_A45EmpresaCalle = new String[] {""} ;
      T000D8_A46EmpresaNumero = new int[1] ;
      T000D8_A47EmpresaPiso = new short[1] ;
      T000D8_A48EmpresaDepto = new String[] {""} ;
      T000D8_A49EmpresaCPostal = new String[] {""} ;
      T000D8_A50EmpresaFechaContrato = new java.util.Date[] {GXutil.nullDate()} ;
      T000D8_A51EmpresaNumeroIIBB = new String[] {""} ;
      T000D8_A52EmpresaLogo = new String[] {""} ;
      T000D8_A5LocalidadId = new short[1] ;
      T000D8_A3PaisId = new short[1] ;
      T000D8_A1ProvinciaId = new short[1] ;
      T000D8_A13CondicionIvaId = new short[1] ;
      T000D4_A5LocalidadId = new short[1] ;
      T000D5_A3PaisId = new short[1] ;
      T000D6_A1ProvinciaId = new short[1] ;
      T000D7_A13CondicionIvaId = new short[1] ;
      T000D9_A5LocalidadId = new short[1] ;
      T000D10_A3PaisId = new short[1] ;
      T000D11_A1ProvinciaId = new short[1] ;
      T000D12_A13CondicionIvaId = new short[1] ;
      T000D13_A42EmpresaId = new int[1] ;
      T000D3_A42EmpresaId = new int[1] ;
      T000D3_A43EmpresaNombre = new String[] {""} ;
      T000D3_A44EmpresaNumeroDocumento = new String[] {""} ;
      T000D3_A45EmpresaCalle = new String[] {""} ;
      T000D3_A46EmpresaNumero = new int[1] ;
      T000D3_A47EmpresaPiso = new short[1] ;
      T000D3_A48EmpresaDepto = new String[] {""} ;
      T000D3_A49EmpresaCPostal = new String[] {""} ;
      T000D3_A50EmpresaFechaContrato = new java.util.Date[] {GXutil.nullDate()} ;
      T000D3_A51EmpresaNumeroIIBB = new String[] {""} ;
      T000D3_A52EmpresaLogo = new String[] {""} ;
      T000D3_A5LocalidadId = new short[1] ;
      T000D3_A3PaisId = new short[1] ;
      T000D3_A1ProvinciaId = new short[1] ;
      T000D3_A13CondicionIvaId = new short[1] ;
      sMode14 = "" ;
      T000D14_A42EmpresaId = new int[1] ;
      T000D15_A42EmpresaId = new int[1] ;
      T000D2_A42EmpresaId = new int[1] ;
      T000D2_A43EmpresaNombre = new String[] {""} ;
      T000D2_A44EmpresaNumeroDocumento = new String[] {""} ;
      T000D2_A45EmpresaCalle = new String[] {""} ;
      T000D2_A46EmpresaNumero = new int[1] ;
      T000D2_A47EmpresaPiso = new short[1] ;
      T000D2_A48EmpresaDepto = new String[] {""} ;
      T000D2_A49EmpresaCPostal = new String[] {""} ;
      T000D2_A50EmpresaFechaContrato = new java.util.Date[] {GXutil.nullDate()} ;
      T000D2_A51EmpresaNumeroIIBB = new String[] {""} ;
      T000D2_A52EmpresaLogo = new String[] {""} ;
      T000D2_A5LocalidadId = new short[1] ;
      T000D2_A3PaisId = new short[1] ;
      T000D2_A1ProvinciaId = new short[1] ;
      T000D2_A13CondicionIvaId = new short[1] ;
      T000D20_A42EmpresaId = new int[1] ;
      T000D20_A81EntidadId = new int[1] ;
      T000D21_A42EmpresaId = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000D22_A5LocalidadId = new short[1] ;
      T000D23_A3PaisId = new short[1] ;
      T000D24_A1ProvinciaId = new short[1] ;
      T000D25_A13CondicionIvaId = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.empresa__default(),
         new Object[] {
             new Object[] {
            T000D2_A42EmpresaId, T000D2_A43EmpresaNombre, T000D2_A44EmpresaNumeroDocumento, T000D2_A45EmpresaCalle, T000D2_A46EmpresaNumero, T000D2_A47EmpresaPiso, T000D2_A48EmpresaDepto, T000D2_A49EmpresaCPostal, T000D2_A50EmpresaFechaContrato, T000D2_A51EmpresaNumeroIIBB,
            T000D2_A52EmpresaLogo, T000D2_A5LocalidadId, T000D2_A3PaisId, T000D2_A1ProvinciaId, T000D2_A13CondicionIvaId
            }
            , new Object[] {
            T000D3_A42EmpresaId, T000D3_A43EmpresaNombre, T000D3_A44EmpresaNumeroDocumento, T000D3_A45EmpresaCalle, T000D3_A46EmpresaNumero, T000D3_A47EmpresaPiso, T000D3_A48EmpresaDepto, T000D3_A49EmpresaCPostal, T000D3_A50EmpresaFechaContrato, T000D3_A51EmpresaNumeroIIBB,
            T000D3_A52EmpresaLogo, T000D3_A5LocalidadId, T000D3_A3PaisId, T000D3_A1ProvinciaId, T000D3_A13CondicionIvaId
            }
            , new Object[] {
            T000D4_A5LocalidadId
            }
            , new Object[] {
            T000D5_A3PaisId
            }
            , new Object[] {
            T000D6_A1ProvinciaId
            }
            , new Object[] {
            T000D7_A13CondicionIvaId
            }
            , new Object[] {
            T000D8_A42EmpresaId, T000D8_A43EmpresaNombre, T000D8_A44EmpresaNumeroDocumento, T000D8_A45EmpresaCalle, T000D8_A46EmpresaNumero, T000D8_A47EmpresaPiso, T000D8_A48EmpresaDepto, T000D8_A49EmpresaCPostal, T000D8_A50EmpresaFechaContrato, T000D8_A51EmpresaNumeroIIBB,
            T000D8_A52EmpresaLogo, T000D8_A5LocalidadId, T000D8_A3PaisId, T000D8_A1ProvinciaId, T000D8_A13CondicionIvaId
            }
            , new Object[] {
            T000D9_A5LocalidadId
            }
            , new Object[] {
            T000D10_A3PaisId
            }
            , new Object[] {
            T000D11_A1ProvinciaId
            }
            , new Object[] {
            T000D12_A13CondicionIvaId
            }
            , new Object[] {
            T000D13_A42EmpresaId
            }
            , new Object[] {
            T000D14_A42EmpresaId
            }
            , new Object[] {
            T000D15_A42EmpresaId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000D20_A42EmpresaId, T000D20_A81EntidadId
            }
            , new Object[] {
            T000D21_A42EmpresaId
            }
            , new Object[] {
            T000D22_A5LocalidadId
            }
            , new Object[] {
            T000D23_A3PaisId
            }
            , new Object[] {
            T000D24_A1ProvinciaId
            }
            , new Object[] {
            T000D25_A13CondicionIvaId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z47EmpresaPiso ;
   private short Z5LocalidadId ;
   private short Z3PaisId ;
   private short Z1ProvinciaId ;
   private short Z13CondicionIvaId ;
   private short A5LocalidadId ;
   private short A3PaisId ;
   private short A1ProvinciaId ;
   private short A13CondicionIvaId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A47EmpresaPiso ;
   private short RcdFound14 ;
   private int Z42EmpresaId ;
   private int Z46EmpresaNumero ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A42EmpresaId ;
   private int edtEmpresaId_Enabled ;
   private int edtEmpresaNombre_Enabled ;
   private int edtEmpresaNumeroDocumento_Enabled ;
   private int edtEmpresaCalle_Enabled ;
   private int A46EmpresaNumero ;
   private int edtEmpresaNumero_Enabled ;
   private int edtEmpresaPiso_Enabled ;
   private int edtEmpresaDepto_Enabled ;
   private int edtEmpresaCPostal_Enabled ;
   private int edtLocalidadId_Enabled ;
   private int imgprompt_5_Visible ;
   private int edtPaisId_Enabled ;
   private int imgprompt_3_Visible ;
   private int edtProvinciaId_Enabled ;
   private int imgprompt_1_Visible ;
   private int edtCondicionIvaId_Enabled ;
   private int imgprompt_13_Visible ;
   private int edtEmpresaFechaContrato_Enabled ;
   private int edtEmpresaNumeroIIBB_Enabled ;
   private int edtEmpresaLogo_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String Z44EmpresaNumeroDocumento ;
   private String Z51EmpresaNumeroIIBB ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
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
   private String edtEmpresaNombre_Internalname ;
   private String edtEmpresaNumeroDocumento_Internalname ;
   private String A44EmpresaNumeroDocumento ;
   private String edtEmpresaNumeroDocumento_Jsonclick ;
   private String edtEmpresaCalle_Internalname ;
   private String edtEmpresaCalle_Jsonclick ;
   private String edtEmpresaNumero_Internalname ;
   private String edtEmpresaNumero_Jsonclick ;
   private String edtEmpresaPiso_Internalname ;
   private String edtEmpresaPiso_Jsonclick ;
   private String edtEmpresaDepto_Internalname ;
   private String edtEmpresaDepto_Jsonclick ;
   private String edtEmpresaCPostal_Internalname ;
   private String edtEmpresaCPostal_Jsonclick ;
   private String edtLocalidadId_Internalname ;
   private String edtLocalidadId_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_5_Internalname ;
   private String imgprompt_5_Link ;
   private String edtPaisId_Internalname ;
   private String edtPaisId_Jsonclick ;
   private String imgprompt_3_Internalname ;
   private String imgprompt_3_Link ;
   private String edtProvinciaId_Internalname ;
   private String edtProvinciaId_Jsonclick ;
   private String imgprompt_1_Internalname ;
   private String imgprompt_1_Link ;
   private String edtCondicionIvaId_Internalname ;
   private String edtCondicionIvaId_Jsonclick ;
   private String imgprompt_13_Internalname ;
   private String imgprompt_13_Link ;
   private String edtEmpresaFechaContrato_Internalname ;
   private String edtEmpresaFechaContrato_Jsonclick ;
   private String edtEmpresaNumeroIIBB_Internalname ;
   private String A51EmpresaNumeroIIBB ;
   private String edtEmpresaNumeroIIBB_Jsonclick ;
   private String edtEmpresaLogo_Internalname ;
   private String edtEmpresaLogo_Filetype ;
   private String edtEmpresaLogo_Contenttype ;
   private String edtEmpresaLogo_Parameters ;
   private String edtEmpresaLogo_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String edtEmpresaLogo_Filename ;
   private String GXCCtlgxBlob ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode14 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z50EmpresaFechaContrato ;
   private java.util.Date A50EmpresaFechaContrato ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String A52EmpresaLogo ;
   private String Z52EmpresaLogo ;
   private String Z43EmpresaNombre ;
   private String Z45EmpresaCalle ;
   private String Z48EmpresaDepto ;
   private String Z49EmpresaCPostal ;
   private String A43EmpresaNombre ;
   private String A45EmpresaCalle ;
   private String A48EmpresaDepto ;
   private String A49EmpresaCPostal ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private int[] T000D8_A42EmpresaId ;
   private String[] T000D8_A43EmpresaNombre ;
   private String[] T000D8_A44EmpresaNumeroDocumento ;
   private String[] T000D8_A45EmpresaCalle ;
   private int[] T000D8_A46EmpresaNumero ;
   private short[] T000D8_A47EmpresaPiso ;
   private String[] T000D8_A48EmpresaDepto ;
   private String[] T000D8_A49EmpresaCPostal ;
   private java.util.Date[] T000D8_A50EmpresaFechaContrato ;
   private String[] T000D8_A51EmpresaNumeroIIBB ;
   private String[] T000D8_A52EmpresaLogo ;
   private short[] T000D8_A5LocalidadId ;
   private short[] T000D8_A3PaisId ;
   private short[] T000D8_A1ProvinciaId ;
   private short[] T000D8_A13CondicionIvaId ;
   private short[] T000D4_A5LocalidadId ;
   private short[] T000D5_A3PaisId ;
   private short[] T000D6_A1ProvinciaId ;
   private short[] T000D7_A13CondicionIvaId ;
   private short[] T000D9_A5LocalidadId ;
   private short[] T000D10_A3PaisId ;
   private short[] T000D11_A1ProvinciaId ;
   private short[] T000D12_A13CondicionIvaId ;
   private int[] T000D13_A42EmpresaId ;
   private int[] T000D3_A42EmpresaId ;
   private String[] T000D3_A43EmpresaNombre ;
   private String[] T000D3_A44EmpresaNumeroDocumento ;
   private String[] T000D3_A45EmpresaCalle ;
   private int[] T000D3_A46EmpresaNumero ;
   private short[] T000D3_A47EmpresaPiso ;
   private String[] T000D3_A48EmpresaDepto ;
   private String[] T000D3_A49EmpresaCPostal ;
   private java.util.Date[] T000D3_A50EmpresaFechaContrato ;
   private String[] T000D3_A51EmpresaNumeroIIBB ;
   private String[] T000D3_A52EmpresaLogo ;
   private short[] T000D3_A5LocalidadId ;
   private short[] T000D3_A3PaisId ;
   private short[] T000D3_A1ProvinciaId ;
   private short[] T000D3_A13CondicionIvaId ;
   private int[] T000D14_A42EmpresaId ;
   private int[] T000D15_A42EmpresaId ;
   private int[] T000D2_A42EmpresaId ;
   private String[] T000D2_A43EmpresaNombre ;
   private String[] T000D2_A44EmpresaNumeroDocumento ;
   private String[] T000D2_A45EmpresaCalle ;
   private int[] T000D2_A46EmpresaNumero ;
   private short[] T000D2_A47EmpresaPiso ;
   private String[] T000D2_A48EmpresaDepto ;
   private String[] T000D2_A49EmpresaCPostal ;
   private java.util.Date[] T000D2_A50EmpresaFechaContrato ;
   private String[] T000D2_A51EmpresaNumeroIIBB ;
   private String[] T000D2_A52EmpresaLogo ;
   private short[] T000D2_A5LocalidadId ;
   private short[] T000D2_A3PaisId ;
   private short[] T000D2_A1ProvinciaId ;
   private short[] T000D2_A13CondicionIvaId ;
   private int[] T000D20_A42EmpresaId ;
   private int[] T000D20_A81EntidadId ;
   private int[] T000D21_A42EmpresaId ;
   private short[] T000D22_A5LocalidadId ;
   private short[] T000D23_A3PaisId ;
   private short[] T000D24_A1ProvinciaId ;
   private short[] T000D25_A13CondicionIvaId ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class empresa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000D2", "SELECT EmpresaId, EmpresaNombre, EmpresaNumeroDocumento, EmpresaCalle, EmpresaNumero, EmpresaPiso, EmpresaDepto, EmpresaCPostal, EmpresaFechaContrato, EmpresaNumeroIIBB, EmpresaLogo, LocalidadId, PaisId, ProvinciaId, CondicionIvaId FROM Empresa WHERE EmpresaId = ?  FOR UPDATE OF Empresa NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D3", "SELECT EmpresaId, EmpresaNombre, EmpresaNumeroDocumento, EmpresaCalle, EmpresaNumero, EmpresaPiso, EmpresaDepto, EmpresaCPostal, EmpresaFechaContrato, EmpresaNumeroIIBB, EmpresaLogo, LocalidadId, PaisId, ProvinciaId, CondicionIvaId FROM Empresa WHERE EmpresaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D4", "SELECT LocalidadId FROM Localidad WHERE LocalidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D5", "SELECT PaisId FROM Pais WHERE PaisId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D6", "SELECT ProvinciaId FROM Provincia WHERE ProvinciaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D7", "SELECT CondicionIvaId FROM CondicionIva WHERE CondicionIvaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D8", "SELECT TM1.EmpresaId, TM1.EmpresaNombre, TM1.EmpresaNumeroDocumento, TM1.EmpresaCalle, TM1.EmpresaNumero, TM1.EmpresaPiso, TM1.EmpresaDepto, TM1.EmpresaCPostal, TM1.EmpresaFechaContrato, TM1.EmpresaNumeroIIBB, TM1.EmpresaLogo, TM1.LocalidadId, TM1.PaisId, TM1.ProvinciaId, TM1.CondicionIvaId FROM Empresa TM1 WHERE TM1.EmpresaId = ? ORDER BY TM1.EmpresaId ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000D9", "SELECT LocalidadId FROM Localidad WHERE LocalidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D10", "SELECT PaisId FROM Pais WHERE PaisId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D11", "SELECT ProvinciaId FROM Provincia WHERE ProvinciaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D12", "SELECT CondicionIvaId FROM CondicionIva WHERE CondicionIvaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D13", "SELECT EmpresaId FROM Empresa WHERE EmpresaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D14", "SELECT EmpresaId FROM Empresa WHERE ( EmpresaId > ?) ORDER BY EmpresaId  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000D15", "SELECT EmpresaId FROM Empresa WHERE ( EmpresaId < ?) ORDER BY EmpresaId DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000D16", "SAVEPOINT gxupdate;INSERT INTO Empresa(EmpresaId, EmpresaNombre, EmpresaNumeroDocumento, EmpresaCalle, EmpresaNumero, EmpresaPiso, EmpresaDepto, EmpresaCPostal, EmpresaFechaContrato, EmpresaNumeroIIBB, EmpresaLogo, LocalidadId, PaisId, ProvinciaId, CondicionIvaId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000D17", "SAVEPOINT gxupdate;UPDATE Empresa SET EmpresaNombre=?, EmpresaNumeroDocumento=?, EmpresaCalle=?, EmpresaNumero=?, EmpresaPiso=?, EmpresaDepto=?, EmpresaCPostal=?, EmpresaFechaContrato=?, EmpresaNumeroIIBB=?, LocalidadId=?, PaisId=?, ProvinciaId=?, CondicionIvaId=?  WHERE EmpresaId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000D18", "SAVEPOINT gxupdate;UPDATE Empresa SET EmpresaLogo=?  WHERE EmpresaId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000D19", "SAVEPOINT gxupdate;DELETE FROM Empresa  WHERE EmpresaId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000D20", "SELECT EmpresaId, EntidadId FROM Entidad WHERE EmpresaId = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000D21", "SELECT EmpresaId FROM Empresa ORDER BY EmpresaId ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000D22", "SELECT LocalidadId FROM Localidad WHERE LocalidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D23", "SELECT PaisId FROM Pais WHERE PaisId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D24", "SELECT ProvinciaId FROM Provincia WHERE ProvinciaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D25", "SELECT CondicionIvaId FROM CondicionIva WHERE CondicionIvaId = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 13) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9) ;
               ((String[]) buf[9])[0] = rslt.getString(10, 13) ;
               ((String[]) buf[10])[0] = rslt.getBLOBFile(11, "tmp", "") ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
               ((short[]) buf[12])[0] = rslt.getShort(13) ;
               ((short[]) buf[13])[0] = rslt.getShort(14) ;
               ((short[]) buf[14])[0] = rslt.getShort(15) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 13) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9) ;
               ((String[]) buf[9])[0] = rslt.getString(10, 13) ;
               ((String[]) buf[10])[0] = rslt.getBLOBFile(11, "tmp", "") ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
               ((short[]) buf[12])[0] = rslt.getShort(13) ;
               ((short[]) buf[13])[0] = rslt.getShort(14) ;
               ((short[]) buf[14])[0] = rslt.getShort(15) ;
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 13) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9) ;
               ((String[]) buf[9])[0] = rslt.getString(10, 13) ;
               ((String[]) buf[10])[0] = rslt.getBLOBFile(11, "tmp", "") ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
               ((short[]) buf[12])[0] = rslt.getShort(13) ;
               ((short[]) buf[13])[0] = rslt.getShort(14) ;
               ((short[]) buf[14])[0] = rslt.getShort(15) ;
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 21 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 22 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 23 :
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
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 250, false);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setVarchar(4, (String)parms[3], 150, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 10, false);
               stmt.setVarchar(8, (String)parms[7], 10, false);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setBLOBFile(11, (String)parms[10]);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 250, false);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setVarchar(3, (String)parms[2], 150, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 10, false);
               stmt.setVarchar(7, (String)parms[6], 10, false);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               return;
            case 16 :
               stmt.setBLOBFile(1, (String)parms[0]);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 20 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 21 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 22 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 23 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

