/*
               File: articulo_impl
        Description: Articulo
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:32:6.99
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

public final  class articulo_impl extends GXDataArea
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
         A7MarcaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7MarcaId", GXutil.ltrim( GXutil.str( A7MarcaId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A7MarcaId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A11RubroId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11RubroId", GXutil.ltrim( GXutil.str( A11RubroId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A11RubroId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A17AlicuotaIvaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlicuotaIvaId", GXutil.ltrim( GXutil.str( A17AlicuotaIvaId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A17AlicuotaIvaId) ;
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
         Form.getMeta().addItem("description", "Articulo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtArticuloId_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public articulo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public articulo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( articulo_impl.class ));
   }

   public articulo_impl( int remoteHandle ,
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Articulo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Articulo.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Articulo.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Articulo.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Articulo.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.kberp.gx00d0"+"',["+"{Ctrl:gx.dom.el('"+"ARTICULOID"+"'), id:'"+"ARTICULOID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtArticuloId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtArticuloId_Internalname, A39ArticuloId, GXutil.rtrim( localUtil.format( A39ArticuloId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArticuloId_Jsonclick, 0, "Attribute", "", "", "", 1, edtArticuloId_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "IdArticulo", "left", "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtArticuloNombre_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_html_textarea( httpContext, edtArticuloNombre_Internalname, A40ArticuloNombre, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", (short)(0), 1, edtArticuloNombre_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "250", -1, 0, "", "", (byte)(-1), true, "NombreTablasMaestras", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtMarcaId_Internalname, "Marca Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtMarcaId_Internalname, GXutil.ltrim( localUtil.ntoc( A7MarcaId, (byte)(4), (byte)(0), ",", "")), ((edtMarcaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7MarcaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A7MarcaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMarcaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtMarcaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Articulo.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_7_Internalname, sImgUrl, imgprompt_7_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_7_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtMarcaNombre_Internalname, "Marca Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_html_textarea( httpContext, edtMarcaNombre_Internalname, A8MarcaNombre, "", "", (short)(0), 1, edtMarcaNombre_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "250", -1, 0, "", "", (byte)(-1), true, "NombreTablasGenerales", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtRubroId_Internalname, "Rubro Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtRubroId_Internalname, GXutil.ltrim( localUtil.ntoc( A11RubroId, (byte)(4), (byte)(0), ",", "")), ((edtRubroId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11RubroId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A11RubroId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRubroId_Jsonclick, 0, "Attribute", "", "", "", 1, edtRubroId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Articulo.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_11_Internalname, sImgUrl, imgprompt_11_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_11_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtRubroNombre_Internalname, "Rubro Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_html_textarea( httpContext, edtRubroNombre_Internalname, A12RubroNombre, "", "", (short)(0), 1, edtRubroNombre_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "250", -1, 0, "", "", (byte)(-1), true, "NombreTablasGenerales", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtAlicuotaIvaId_Internalname, "Alicuota Iva Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtAlicuotaIvaId_Internalname, GXutil.ltrim( localUtil.ntoc( A17AlicuotaIvaId, (byte)(4), (byte)(0), ",", "")), ((edtAlicuotaIvaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A17AlicuotaIvaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A17AlicuotaIvaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlicuotaIvaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlicuotaIvaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Articulo.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_17_Internalname, sImgUrl, imgprompt_17_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_17_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtAlicuotaIvaNombre_Internalname, "Alicuota Iva Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_html_textarea( httpContext, edtAlicuotaIvaNombre_Internalname, A18AlicuotaIvaNombre, "", "", (short)(0), 1, edtAlicuotaIvaNombre_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "250", -1, 0, "", "", (byte)(-1), true, "NombreTablasGenerales", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Articulo.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtArticuloCosto_Internalname, "Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtArticuloCosto_Internalname, GXutil.ltrim( localUtil.ntoc( A41ArticuloCosto, (byte)(12), (byte)(2), ",", "")), ((edtArticuloCosto_Enabled!=0) ? GXutil.ltrim( localUtil.format( A41ArticuloCosto, "ZZZZZZZZ9.99")) : localUtil.format( A41ArticuloCosto, "ZZZZZZZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArticuloCosto_Jsonclick, 0, "Attribute", "", "", "", 1, edtArticuloCosto_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "PreciosArticulo", "right", "HLP_Articulo.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Articulo.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Articulo.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Articulo.htm");
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
            A39ArticuloId = httpContext.cgiGet( edtArticuloId_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
            A40ArticuloNombre = httpContext.cgiGet( edtArticuloNombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A40ArticuloNombre", A40ArticuloNombre);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMarcaId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMarcaId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MARCAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMarcaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7MarcaId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7MarcaId", GXutil.ltrim( GXutil.str( A7MarcaId, 4, 0)));
            }
            else
            {
               A7MarcaId = (short)(localUtil.ctol( httpContext.cgiGet( edtMarcaId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7MarcaId", GXutil.ltrim( GXutil.str( A7MarcaId, 4, 0)));
            }
            A8MarcaNombre = httpContext.cgiGet( edtMarcaNombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8MarcaNombre", A8MarcaNombre);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRubroId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRubroId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RUBROID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRubroId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11RubroId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11RubroId", GXutil.ltrim( GXutil.str( A11RubroId, 4, 0)));
            }
            else
            {
               A11RubroId = (short)(localUtil.ctol( httpContext.cgiGet( edtRubroId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11RubroId", GXutil.ltrim( GXutil.str( A11RubroId, 4, 0)));
            }
            A12RubroNombre = httpContext.cgiGet( edtRubroNombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12RubroNombre", A12RubroNombre);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlicuotaIvaId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlicuotaIvaId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALICUOTAIVAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlicuotaIvaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A17AlicuotaIvaId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A17AlicuotaIvaId", GXutil.ltrim( GXutil.str( A17AlicuotaIvaId, 4, 0)));
            }
            else
            {
               A17AlicuotaIvaId = (short)(localUtil.ctol( httpContext.cgiGet( edtAlicuotaIvaId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A17AlicuotaIvaId", GXutil.ltrim( GXutil.str( A17AlicuotaIvaId, 4, 0)));
            }
            A18AlicuotaIvaNombre = httpContext.cgiGet( edtAlicuotaIvaNombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlicuotaIvaNombre", A18AlicuotaIvaNombre);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArticuloCosto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArticuloCosto_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTICULOCOSTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtArticuloCosto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A41ArticuloCosto = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A41ArticuloCosto", GXutil.ltrim( GXutil.str( A41ArticuloCosto, 12, 2)));
            }
            else
            {
               A41ArticuloCosto = localUtil.ctond( httpContext.cgiGet( edtArticuloCosto_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A41ArticuloCosto", GXutil.ltrim( GXutil.str( A41ArticuloCosto, 12, 2)));
            }
            /* Read saved values. */
            Z39ArticuloId = httpContext.cgiGet( "Z39ArticuloId") ;
            Z40ArticuloNombre = httpContext.cgiGet( "Z40ArticuloNombre") ;
            Z41ArticuloCosto = localUtil.ctond( httpContext.cgiGet( "Z41ArticuloCosto")) ;
            Z7MarcaId = (short)(localUtil.ctol( httpContext.cgiGet( "Z7MarcaId"), ",", ".")) ;
            Z11RubroId = (short)(localUtil.ctol( httpContext.cgiGet( "Z11RubroId"), ",", ".")) ;
            Z17AlicuotaIvaId = (short)(localUtil.ctol( httpContext.cgiGet( "Z17AlicuotaIvaId"), ",", ".")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
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
               A39ArticuloId = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
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
            initAll0C13( ) ;
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
      disableAttributes0C13( ) ;
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

   public void resetCaption0C0( )
   {
   }

   public void zm0C13( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z40ArticuloNombre = T000C3_A40ArticuloNombre[0] ;
            Z41ArticuloCosto = T000C3_A41ArticuloCosto[0] ;
            Z7MarcaId = T000C3_A7MarcaId[0] ;
            Z11RubroId = T000C3_A11RubroId[0] ;
            Z17AlicuotaIvaId = T000C3_A17AlicuotaIvaId[0] ;
         }
         else
         {
            Z40ArticuloNombre = A40ArticuloNombre ;
            Z41ArticuloCosto = A41ArticuloCosto ;
            Z7MarcaId = A7MarcaId ;
            Z11RubroId = A11RubroId ;
            Z17AlicuotaIvaId = A17AlicuotaIvaId ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z39ArticuloId = A39ArticuloId ;
         Z40ArticuloNombre = A40ArticuloNombre ;
         Z41ArticuloCosto = A41ArticuloCosto ;
         Z7MarcaId = A7MarcaId ;
         Z11RubroId = A11RubroId ;
         Z17AlicuotaIvaId = A17AlicuotaIvaId ;
         Z8MarcaNombre = A8MarcaNombre ;
         Z12RubroNombre = A12RubroNombre ;
         Z18AlicuotaIvaNombre = A18AlicuotaIvaNombre ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_7_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0040"+"',["+"{Ctrl:gx.dom.el('"+"MARCAID"+"'), id:'"+"MARCAID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_11_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0060"+"',["+"{Ctrl:gx.dom.el('"+"RUBROID"+"'), id:'"+"RUBROID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_17_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0090"+"',["+"{Ctrl:gx.dom.el('"+"ALICUOTAIVAID"+"'), id:'"+"ALICUOTAIVAID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
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

   public void load0C13( )
   {
      /* Using cursor T000C7 */
      pr_default.execute(5, new Object[] {A39ArticuloId});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A40ArticuloNombre = T000C7_A40ArticuloNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40ArticuloNombre", A40ArticuloNombre);
         A8MarcaNombre = T000C7_A8MarcaNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8MarcaNombre", A8MarcaNombre);
         A12RubroNombre = T000C7_A12RubroNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12RubroNombre", A12RubroNombre);
         A18AlicuotaIvaNombre = T000C7_A18AlicuotaIvaNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlicuotaIvaNombre", A18AlicuotaIvaNombre);
         A41ArticuloCosto = T000C7_A41ArticuloCosto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41ArticuloCosto", GXutil.ltrim( GXutil.str( A41ArticuloCosto, 12, 2)));
         A7MarcaId = T000C7_A7MarcaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7MarcaId", GXutil.ltrim( GXutil.str( A7MarcaId, 4, 0)));
         A11RubroId = T000C7_A11RubroId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11RubroId", GXutil.ltrim( GXutil.str( A11RubroId, 4, 0)));
         A17AlicuotaIvaId = T000C7_A17AlicuotaIvaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlicuotaIvaId", GXutil.ltrim( GXutil.str( A17AlicuotaIvaId, 4, 0)));
         zm0C13( -1) ;
      }
      pr_default.close(5);
      onLoadActions0C13( ) ;
   }

   public void onLoadActions0C13( )
   {
   }

   public void checkExtendedTable0C13( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T000C4 */
      pr_default.execute(2, new Object[] {new Short(A7MarcaId)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Marca'.", "ForeignKeyNotFound", 1, "MARCAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMarcaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8MarcaNombre = T000C4_A8MarcaNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8MarcaNombre", A8MarcaNombre);
      pr_default.close(2);
      /* Using cursor T000C5 */
      pr_default.execute(3, new Object[] {new Short(A11RubroId)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Rubro'.", "ForeignKeyNotFound", 1, "RUBROID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRubroId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12RubroNombre = T000C5_A12RubroNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12RubroNombre", A12RubroNombre);
      pr_default.close(3);
      /* Using cursor T000C6 */
      pr_default.execute(4, new Object[] {new Short(A17AlicuotaIvaId)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Alicuota Iva'.", "ForeignKeyNotFound", 1, "ALICUOTAIVAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlicuotaIvaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A18AlicuotaIvaNombre = T000C6_A18AlicuotaIvaNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlicuotaIvaNombre", A18AlicuotaIvaNombre);
      pr_default.close(4);
   }

   public void closeExtendedTableCursors0C13( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( short A7MarcaId )
   {
      /* Using cursor T000C8 */
      pr_default.execute(6, new Object[] {new Short(A7MarcaId)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Marca'.", "ForeignKeyNotFound", 1, "MARCAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMarcaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8MarcaNombre = T000C8_A8MarcaNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8MarcaNombre", A8MarcaNombre);
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A8MarcaNombre)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(6);
   }

   public void gxload_3( short A11RubroId )
   {
      /* Using cursor T000C9 */
      pr_default.execute(7, new Object[] {new Short(A11RubroId)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Rubro'.", "ForeignKeyNotFound", 1, "RUBROID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRubroId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12RubroNombre = T000C9_A12RubroNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12RubroNombre", A12RubroNombre);
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A12RubroNombre)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(7);
   }

   public void gxload_4( short A17AlicuotaIvaId )
   {
      /* Using cursor T000C10 */
      pr_default.execute(8, new Object[] {new Short(A17AlicuotaIvaId)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Alicuota Iva'.", "ForeignKeyNotFound", 1, "ALICUOTAIVAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlicuotaIvaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A18AlicuotaIvaNombre = T000C10_A18AlicuotaIvaNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlicuotaIvaNombre", A18AlicuotaIvaNombre);
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A18AlicuotaIvaNombre)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(8);
   }

   public void getKey0C13( )
   {
      /* Using cursor T000C11 */
      pr_default.execute(9, new Object[] {A39ArticuloId});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound13 = (short)(1) ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000C3 */
      pr_default.execute(1, new Object[] {A39ArticuloId});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0C13( 1) ;
         RcdFound13 = (short)(1) ;
         A39ArticuloId = T000C3_A39ArticuloId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
         A40ArticuloNombre = T000C3_A40ArticuloNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40ArticuloNombre", A40ArticuloNombre);
         A41ArticuloCosto = T000C3_A41ArticuloCosto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41ArticuloCosto", GXutil.ltrim( GXutil.str( A41ArticuloCosto, 12, 2)));
         A7MarcaId = T000C3_A7MarcaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7MarcaId", GXutil.ltrim( GXutil.str( A7MarcaId, 4, 0)));
         A11RubroId = T000C3_A11RubroId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11RubroId", GXutil.ltrim( GXutil.str( A11RubroId, 4, 0)));
         A17AlicuotaIvaId = T000C3_A17AlicuotaIvaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlicuotaIvaId", GXutil.ltrim( GXutil.str( A17AlicuotaIvaId, 4, 0)));
         Z39ArticuloId = A39ArticuloId ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0C13( ) ;
         if ( AnyError == 1 )
         {
            RcdFound13 = (short)(0) ;
            initializeNonKey0C13( ) ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound13 = (short)(0) ;
         initializeNonKey0C13( ) ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0C13( ) ;
      if ( RcdFound13 == 0 )
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
      RcdFound13 = (short)(0) ;
      /* Using cursor T000C12 */
      pr_default.execute(10, new Object[] {A39ArticuloId});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T000C12_A39ArticuloId[0], A39ArticuloId) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T000C12_A39ArticuloId[0], A39ArticuloId) > 0 ) ) )
         {
            A39ArticuloId = T000C12_A39ArticuloId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
            RcdFound13 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound13 = (short)(0) ;
      /* Using cursor T000C13 */
      pr_default.execute(11, new Object[] {A39ArticuloId});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T000C13_A39ArticuloId[0], A39ArticuloId) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T000C13_A39ArticuloId[0], A39ArticuloId) < 0 ) ) )
         {
            A39ArticuloId = T000C13_A39ArticuloId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
            RcdFound13 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0C13( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtArticuloId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0C13( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound13 == 1 )
         {
            if ( GXutil.strcmp(A39ArticuloId, Z39ArticuloId) != 0 )
            {
               A39ArticuloId = Z39ArticuloId ;
               httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ARTICULOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtArticuloId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtArticuloId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0C13( ) ;
               GX_FocusControl = edtArticuloId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A39ArticuloId, Z39ArticuloId) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtArticuloId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0C13( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ARTICULOID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtArticuloId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtArticuloId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0C13( ) ;
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
      if ( GXutil.strcmp(A39ArticuloId, Z39ArticuloId) != 0 )
      {
         A39ArticuloId = Z39ArticuloId ;
         httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ARTICULOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArticuloId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtArticuloId_Internalname ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "ARTICULOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArticuloId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtArticuloNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0C13( ) ;
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArticuloNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0C13( ) ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArticuloNombre_Internalname ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArticuloNombre_Internalname ;
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
      scanStart0C13( ) ;
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound13 != 0 )
         {
            scanNext0C13( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArticuloNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0C13( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0C13( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000C2 */
         pr_default.execute(0, new Object[] {A39ArticuloId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Articulo"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z40ArticuloNombre, T000C2_A40ArticuloNombre[0]) != 0 ) || ( DecimalUtil.compareTo(Z41ArticuloCosto, T000C2_A41ArticuloCosto[0]) != 0 ) || ( Z7MarcaId != T000C2_A7MarcaId[0] ) || ( Z11RubroId != T000C2_A11RubroId[0] ) || ( Z17AlicuotaIvaId != T000C2_A17AlicuotaIvaId[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Articulo"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0C13( )
   {
      beforeValidate0C13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C13( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0C13( 0) ;
         checkOptimisticConcurrency0C13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C13( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0C13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C14 */
                  pr_default.execute(12, new Object[] {A39ArticuloId, A40ArticuloNombre, A41ArticuloCosto, new Short(A7MarcaId), new Short(A11RubroId), new Short(A17AlicuotaIvaId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Articulo") ;
                  if ( (pr_default.getStatus(12) == 1) )
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
                        resetCaption0C0( ) ;
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
            load0C13( ) ;
         }
         endLevel0C13( ) ;
      }
      closeExtendedTableCursors0C13( ) ;
   }

   public void update0C13( )
   {
      beforeValidate0C13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C13( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C13( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0C13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C15 */
                  pr_default.execute(13, new Object[] {A40ArticuloNombre, A41ArticuloCosto, new Short(A7MarcaId), new Short(A11RubroId), new Short(A17AlicuotaIvaId), A39ArticuloId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Articulo") ;
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Articulo"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0C13( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption0C0( ) ;
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
         endLevel0C13( ) ;
      }
      closeExtendedTableCursors0C13( ) ;
   }

   public void deferredUpdate0C13( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0C13( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C13( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0C13( ) ;
         afterConfirm0C13( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0C13( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000C16 */
               pr_default.execute(14, new Object[] {A39ArticuloId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Articulo") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound13 == 0 )
                     {
                        initAll0C13( ) ;
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
                     resetCaption0C0( ) ;
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
      sMode13 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0C13( ) ;
      Gx_mode = sMode13 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0C13( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000C17 */
         pr_default.execute(15, new Object[] {new Short(A7MarcaId)});
         A8MarcaNombre = T000C17_A8MarcaNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8MarcaNombre", A8MarcaNombre);
         pr_default.close(15);
         /* Using cursor T000C18 */
         pr_default.execute(16, new Object[] {new Short(A11RubroId)});
         A12RubroNombre = T000C18_A12RubroNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12RubroNombre", A12RubroNombre);
         pr_default.close(16);
         /* Using cursor T000C19 */
         pr_default.execute(17, new Object[] {new Short(A17AlicuotaIvaId)});
         A18AlicuotaIvaNombre = T000C19_A18AlicuotaIvaNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlicuotaIvaNombre", A18AlicuotaIvaNombre);
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000C20 */
         pr_default.execute(18, new Object[] {A39ArticuloId});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Articulo"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevel0C13( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0C13( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "articulo");
         if ( AnyError == 0 )
         {
            confirmValues0C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "articulo");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0C13( )
   {
      /* Using cursor T000C21 */
      pr_default.execute(19);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A39ArticuloId = T000C21_A39ArticuloId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0C13( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A39ArticuloId = T000C21_A39ArticuloId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
      }
   }

   public void scanEnd0C13( )
   {
      pr_default.close(19);
   }

   public void afterConfirm0C13( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C13( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0C13( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0C13( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0C13( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0C13( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0C13( )
   {
      edtArticuloId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArticuloId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtArticuloId_Enabled, 5, 0)));
      edtArticuloNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArticuloNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtArticuloNombre_Enabled, 5, 0)));
      edtMarcaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMarcaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMarcaId_Enabled, 5, 0)));
      edtMarcaNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMarcaNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMarcaNombre_Enabled, 5, 0)));
      edtRubroId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRubroId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRubroId_Enabled, 5, 0)));
      edtRubroNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRubroNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRubroNombre_Enabled, 5, 0)));
      edtAlicuotaIvaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlicuotaIvaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlicuotaIvaId_Enabled, 5, 0)));
      edtAlicuotaIvaNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlicuotaIvaNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlicuotaIvaNombre_Enabled, 5, 0)));
      edtArticuloCosto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArticuloCosto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtArticuloCosto_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0C0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20172191732987");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.articulo") +"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z39ArticuloId", Z39ArticuloId);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z40ArticuloNombre", Z40ArticuloNombre);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z41ArticuloCosto", GXutil.ltrim( localUtil.ntoc( Z41ArticuloCosto, (byte)(12), (byte)(2), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z7MarcaId", GXutil.ltrim( localUtil.ntoc( Z7MarcaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z11RubroId", GXutil.ltrim( localUtil.ntoc( Z11RubroId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z17AlicuotaIvaId", GXutil.ltrim( localUtil.ntoc( Z17AlicuotaIvaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("com.kberp.articulo")  ;
   }

   public String getPgmname( )
   {
      return "Articulo" ;
   }

   public String getPgmdesc( )
   {
      return "Articulo" ;
   }

   public void initializeNonKey0C13( )
   {
      A40ArticuloNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A40ArticuloNombre", A40ArticuloNombre);
      A7MarcaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7MarcaId", GXutil.ltrim( GXutil.str( A7MarcaId, 4, 0)));
      A8MarcaNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8MarcaNombre", A8MarcaNombre);
      A11RubroId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11RubroId", GXutil.ltrim( GXutil.str( A11RubroId, 4, 0)));
      A12RubroNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12RubroNombre", A12RubroNombre);
      A17AlicuotaIvaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A17AlicuotaIvaId", GXutil.ltrim( GXutil.str( A17AlicuotaIvaId, 4, 0)));
      A18AlicuotaIvaNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlicuotaIvaNombre", A18AlicuotaIvaNombre);
      A41ArticuloCosto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A41ArticuloCosto", GXutil.ltrim( GXutil.str( A41ArticuloCosto, 12, 2)));
      Z40ArticuloNombre = "" ;
      Z41ArticuloCosto = DecimalUtil.ZERO ;
      Z7MarcaId = (short)(0) ;
      Z11RubroId = (short)(0) ;
      Z17AlicuotaIvaId = (short)(0) ;
   }

   public void initAll0C13( )
   {
      A39ArticuloId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A39ArticuloId", A39ArticuloId);
      initializeNonKey0C13( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1731551");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20172191732997");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("articulo.js", "?20172191732997");
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
      edtArticuloId_Internalname = "ARTICULOID" ;
      edtArticuloNombre_Internalname = "ARTICULONOMBRE" ;
      edtMarcaId_Internalname = "MARCAID" ;
      edtMarcaNombre_Internalname = "MARCANOMBRE" ;
      edtRubroId_Internalname = "RUBROID" ;
      edtRubroNombre_Internalname = "RUBRONOMBRE" ;
      edtAlicuotaIvaId_Internalname = "ALICUOTAIVAID" ;
      edtAlicuotaIvaNombre_Internalname = "ALICUOTAIVANOMBRE" ;
      edtArticuloCosto_Internalname = "ARTICULOCOSTO" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_7_Internalname = "PROMPT_7" ;
      imgprompt_11_Internalname = "PROMPT_11" ;
      imgprompt_17_Internalname = "PROMPT_17" ;
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
      Form.setCaption( "Articulo" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtArticuloCosto_Jsonclick = "" ;
      edtArticuloCosto_Enabled = 1 ;
      edtAlicuotaIvaNombre_Enabled = 0 ;
      imgprompt_17_Visible = 1 ;
      imgprompt_17_Link = "" ;
      edtAlicuotaIvaId_Jsonclick = "" ;
      edtAlicuotaIvaId_Enabled = 1 ;
      edtRubroNombre_Enabled = 0 ;
      imgprompt_11_Visible = 1 ;
      imgprompt_11_Link = "" ;
      edtRubroId_Jsonclick = "" ;
      edtRubroId_Enabled = 1 ;
      edtMarcaNombre_Enabled = 0 ;
      imgprompt_7_Visible = 1 ;
      imgprompt_7_Link = "" ;
      edtMarcaId_Jsonclick = "" ;
      edtMarcaId_Enabled = 1 ;
      edtArticuloNombre_Enabled = 1 ;
      edtArticuloId_Jsonclick = "" ;
      edtArticuloId_Enabled = 1 ;
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
      GX_FocusControl = edtArticuloNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Articuloid( String GX_Parm1 ,
                                 String GX_Parm2 ,
                                 java.math.BigDecimal GX_Parm3 ,
                                 short GX_Parm4 ,
                                 short GX_Parm5 ,
                                 short GX_Parm6 )
   {
      A39ArticuloId = GX_Parm1 ;
      A40ArticuloNombre = GX_Parm2 ;
      A41ArticuloCosto = GX_Parm3 ;
      A7MarcaId = GX_Parm4 ;
      A11RubroId = GX_Parm5 ;
      A17AlicuotaIvaId = GX_Parm6 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A8MarcaNombre = "" ;
         A12RubroNombre = "" ;
         A18AlicuotaIvaNombre = "" ;
      }
      isValidOutput.add(A40ArticuloNombre);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A7MarcaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A11RubroId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A17AlicuotaIvaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A41ArticuloCosto, (byte)(12), (byte)(2), ".", "")));
      isValidOutput.add(A8MarcaNombre);
      isValidOutput.add(A12RubroNombre);
      isValidOutput.add(A18AlicuotaIvaNombre);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(Z39ArticuloId);
      isValidOutput.add(Z40ArticuloNombre);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z7MarcaId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z11RubroId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z17AlicuotaIvaId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z41ArticuloCosto, (byte)(12), (byte)(2), ",", "")));
      isValidOutput.add(Z8MarcaNombre);
      isValidOutput.add(Z12RubroNombre);
      isValidOutput.add(Z18AlicuotaIvaNombre);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Marcaid( short GX_Parm1 ,
                              String GX_Parm2 )
   {
      A7MarcaId = GX_Parm1 ;
      A8MarcaNombre = GX_Parm2 ;
      /* Using cursor T000C17 */
      pr_default.execute(15, new Object[] {new Short(A7MarcaId)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Marca'.", "ForeignKeyNotFound", 1, "MARCAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMarcaId_Internalname ;
      }
      A8MarcaNombre = T000C17_A8MarcaNombre[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A8MarcaNombre = "" ;
      }
      isValidOutput.add(A8MarcaNombre);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Rubroid( short GX_Parm1 ,
                              String GX_Parm2 )
   {
      A11RubroId = GX_Parm1 ;
      A12RubroNombre = GX_Parm2 ;
      /* Using cursor T000C18 */
      pr_default.execute(16, new Object[] {new Short(A11RubroId)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Rubro'.", "ForeignKeyNotFound", 1, "RUBROID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRubroId_Internalname ;
      }
      A12RubroNombre = T000C18_A12RubroNombre[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A12RubroNombre = "" ;
      }
      isValidOutput.add(A12RubroNombre);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Alicuotaivaid( short GX_Parm1 ,
                                    String GX_Parm2 )
   {
      A17AlicuotaIvaId = GX_Parm1 ;
      A18AlicuotaIvaNombre = GX_Parm2 ;
      /* Using cursor T000C19 */
      pr_default.execute(17, new Object[] {new Short(A17AlicuotaIvaId)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Alicuota Iva'.", "ForeignKeyNotFound", 1, "ALICUOTAIVAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlicuotaIvaId_Internalname ;
      }
      A18AlicuotaIvaNombre = T000C19_A18AlicuotaIvaNombre[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A18AlicuotaIvaNombre = "" ;
      }
      isValidOutput.add(A18AlicuotaIvaNombre);
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
      pr_default.close(15);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z39ArticuloId = "" ;
      Z40ArticuloNombre = "" ;
      Z41ArticuloCosto = DecimalUtil.ZERO ;
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
      A39ArticuloId = "" ;
      A40ArticuloNombre = "" ;
      sImgUrl = "" ;
      A8MarcaNombre = "" ;
      A12RubroNombre = "" ;
      A18AlicuotaIvaNombre = "" ;
      A41ArticuloCosto = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Z8MarcaNombre = "" ;
      Z12RubroNombre = "" ;
      Z18AlicuotaIvaNombre = "" ;
      T000C7_A39ArticuloId = new String[] {""} ;
      T000C7_A40ArticuloNombre = new String[] {""} ;
      T000C7_A8MarcaNombre = new String[] {""} ;
      T000C7_A12RubroNombre = new String[] {""} ;
      T000C7_A18AlicuotaIvaNombre = new String[] {""} ;
      T000C7_A41ArticuloCosto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000C7_A7MarcaId = new short[1] ;
      T000C7_A11RubroId = new short[1] ;
      T000C7_A17AlicuotaIvaId = new short[1] ;
      T000C4_A8MarcaNombre = new String[] {""} ;
      T000C5_A12RubroNombre = new String[] {""} ;
      T000C6_A18AlicuotaIvaNombre = new String[] {""} ;
      T000C8_A8MarcaNombre = new String[] {""} ;
      T000C9_A12RubroNombre = new String[] {""} ;
      T000C10_A18AlicuotaIvaNombre = new String[] {""} ;
      T000C11_A39ArticuloId = new String[] {""} ;
      T000C3_A39ArticuloId = new String[] {""} ;
      T000C3_A40ArticuloNombre = new String[] {""} ;
      T000C3_A41ArticuloCosto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000C3_A7MarcaId = new short[1] ;
      T000C3_A11RubroId = new short[1] ;
      T000C3_A17AlicuotaIvaId = new short[1] ;
      sMode13 = "" ;
      T000C12_A39ArticuloId = new String[] {""} ;
      T000C13_A39ArticuloId = new String[] {""} ;
      T000C2_A39ArticuloId = new String[] {""} ;
      T000C2_A40ArticuloNombre = new String[] {""} ;
      T000C2_A41ArticuloCosto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000C2_A7MarcaId = new short[1] ;
      T000C2_A11RubroId = new short[1] ;
      T000C2_A17AlicuotaIvaId = new short[1] ;
      T000C17_A8MarcaNombre = new String[] {""} ;
      T000C18_A12RubroNombre = new String[] {""} ;
      T000C19_A18AlicuotaIvaNombre = new String[] {""} ;
      T000C20_A42EmpresaId = new int[1] ;
      T000C20_A81EntidadId = new int[1] ;
      T000C20_A31CfgComprobanteId = new String[] {""} ;
      T000C20_A32CfgComprobantePrefijo = new short[1] ;
      T000C20_A55ComprobanteNumero = new int[1] ;
      T000C20_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000C20_A39ArticuloId = new String[] {""} ;
      T000C21_A39ArticuloId = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.articulo__default(),
         new Object[] {
             new Object[] {
            T000C2_A39ArticuloId, T000C2_A40ArticuloNombre, T000C2_A41ArticuloCosto, T000C2_A7MarcaId, T000C2_A11RubroId, T000C2_A17AlicuotaIvaId
            }
            , new Object[] {
            T000C3_A39ArticuloId, T000C3_A40ArticuloNombre, T000C3_A41ArticuloCosto, T000C3_A7MarcaId, T000C3_A11RubroId, T000C3_A17AlicuotaIvaId
            }
            , new Object[] {
            T000C4_A8MarcaNombre
            }
            , new Object[] {
            T000C5_A12RubroNombre
            }
            , new Object[] {
            T000C6_A18AlicuotaIvaNombre
            }
            , new Object[] {
            T000C7_A39ArticuloId, T000C7_A40ArticuloNombre, T000C7_A8MarcaNombre, T000C7_A12RubroNombre, T000C7_A18AlicuotaIvaNombre, T000C7_A41ArticuloCosto, T000C7_A7MarcaId, T000C7_A11RubroId, T000C7_A17AlicuotaIvaId
            }
            , new Object[] {
            T000C8_A8MarcaNombre
            }
            , new Object[] {
            T000C9_A12RubroNombre
            }
            , new Object[] {
            T000C10_A18AlicuotaIvaNombre
            }
            , new Object[] {
            T000C11_A39ArticuloId
            }
            , new Object[] {
            T000C12_A39ArticuloId
            }
            , new Object[] {
            T000C13_A39ArticuloId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000C17_A8MarcaNombre
            }
            , new Object[] {
            T000C18_A12RubroNombre
            }
            , new Object[] {
            T000C19_A18AlicuotaIvaNombre
            }
            , new Object[] {
            T000C20_A42EmpresaId, T000C20_A81EntidadId, T000C20_A31CfgComprobanteId, T000C20_A32CfgComprobantePrefijo, T000C20_A55ComprobanteNumero, T000C20_A35CfgComprobanteDetalleLetra, T000C20_A39ArticuloId
            }
            , new Object[] {
            T000C21_A39ArticuloId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z7MarcaId ;
   private short Z11RubroId ;
   private short Z17AlicuotaIvaId ;
   private short A7MarcaId ;
   private short A11RubroId ;
   private short A17AlicuotaIvaId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound13 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtArticuloId_Enabled ;
   private int edtArticuloNombre_Enabled ;
   private int edtMarcaId_Enabled ;
   private int imgprompt_7_Visible ;
   private int edtMarcaNombre_Enabled ;
   private int edtRubroId_Enabled ;
   private int imgprompt_11_Visible ;
   private int edtRubroNombre_Enabled ;
   private int edtAlicuotaIvaId_Enabled ;
   private int imgprompt_17_Visible ;
   private int edtAlicuotaIvaNombre_Enabled ;
   private int edtArticuloCosto_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z41ArticuloCosto ;
   private java.math.BigDecimal A41ArticuloCosto ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtArticuloId_Internalname ;
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
   private String edtArticuloId_Jsonclick ;
   private String edtArticuloNombre_Internalname ;
   private String edtMarcaId_Internalname ;
   private String edtMarcaId_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_7_Internalname ;
   private String imgprompt_7_Link ;
   private String edtMarcaNombre_Internalname ;
   private String edtRubroId_Internalname ;
   private String edtRubroId_Jsonclick ;
   private String imgprompt_11_Internalname ;
   private String imgprompt_11_Link ;
   private String edtRubroNombre_Internalname ;
   private String edtAlicuotaIvaId_Internalname ;
   private String edtAlicuotaIvaId_Jsonclick ;
   private String imgprompt_17_Internalname ;
   private String imgprompt_17_Link ;
   private String edtAlicuotaIvaNombre_Internalname ;
   private String edtArticuloCosto_Internalname ;
   private String edtArticuloCosto_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode13 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private String Z39ArticuloId ;
   private String Z40ArticuloNombre ;
   private String A39ArticuloId ;
   private String A40ArticuloNombre ;
   private String A8MarcaNombre ;
   private String A12RubroNombre ;
   private String A18AlicuotaIvaNombre ;
   private String Z8MarcaNombre ;
   private String Z12RubroNombre ;
   private String Z18AlicuotaIvaNombre ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000C7_A39ArticuloId ;
   private String[] T000C7_A40ArticuloNombre ;
   private String[] T000C7_A8MarcaNombre ;
   private String[] T000C7_A12RubroNombre ;
   private String[] T000C7_A18AlicuotaIvaNombre ;
   private java.math.BigDecimal[] T000C7_A41ArticuloCosto ;
   private short[] T000C7_A7MarcaId ;
   private short[] T000C7_A11RubroId ;
   private short[] T000C7_A17AlicuotaIvaId ;
   private String[] T000C4_A8MarcaNombre ;
   private String[] T000C5_A12RubroNombre ;
   private String[] T000C6_A18AlicuotaIvaNombre ;
   private String[] T000C8_A8MarcaNombre ;
   private String[] T000C9_A12RubroNombre ;
   private String[] T000C10_A18AlicuotaIvaNombre ;
   private String[] T000C11_A39ArticuloId ;
   private String[] T000C3_A39ArticuloId ;
   private String[] T000C3_A40ArticuloNombre ;
   private java.math.BigDecimal[] T000C3_A41ArticuloCosto ;
   private short[] T000C3_A7MarcaId ;
   private short[] T000C3_A11RubroId ;
   private short[] T000C3_A17AlicuotaIvaId ;
   private String[] T000C12_A39ArticuloId ;
   private String[] T000C13_A39ArticuloId ;
   private String[] T000C2_A39ArticuloId ;
   private String[] T000C2_A40ArticuloNombre ;
   private java.math.BigDecimal[] T000C2_A41ArticuloCosto ;
   private short[] T000C2_A7MarcaId ;
   private short[] T000C2_A11RubroId ;
   private short[] T000C2_A17AlicuotaIvaId ;
   private String[] T000C17_A8MarcaNombre ;
   private String[] T000C18_A12RubroNombre ;
   private String[] T000C19_A18AlicuotaIvaNombre ;
   private int[] T000C20_A42EmpresaId ;
   private int[] T000C20_A81EntidadId ;
   private String[] T000C20_A31CfgComprobanteId ;
   private short[] T000C20_A32CfgComprobantePrefijo ;
   private int[] T000C20_A55ComprobanteNumero ;
   private byte[] T000C20_A35CfgComprobanteDetalleLetra ;
   private String[] T000C20_A39ArticuloId ;
   private String[] T000C21_A39ArticuloId ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class articulo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000C2", "SELECT ArticuloId, ArticuloNombre, ArticuloCosto, MarcaId, RubroId, AlicuotaIvaId FROM Articulo WHERE ArticuloId = ?  FOR UPDATE OF Articulo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C3", "SELECT ArticuloId, ArticuloNombre, ArticuloCosto, MarcaId, RubroId, AlicuotaIvaId FROM Articulo WHERE ArticuloId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C4", "SELECT MarcaNombre FROM Marca WHERE MarcaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C5", "SELECT RubroNombre FROM Rubro WHERE RubroId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C6", "SELECT AlicuotaIvaNombre FROM AlicuotaIva WHERE AlicuotaIvaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C7", "SELECT TM1.ArticuloId, TM1.ArticuloNombre, T2.MarcaNombre, T3.RubroNombre, T4.AlicuotaIvaNombre, TM1.ArticuloCosto, TM1.MarcaId, TM1.RubroId, TM1.AlicuotaIvaId FROM (((Articulo TM1 INNER JOIN Marca T2 ON T2.MarcaId = TM1.MarcaId) INNER JOIN Rubro T3 ON T3.RubroId = TM1.RubroId) INNER JOIN AlicuotaIva T4 ON T4.AlicuotaIvaId = TM1.AlicuotaIvaId) WHERE TM1.ArticuloId = ( ?) ORDER BY TM1.ArticuloId ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000C8", "SELECT MarcaNombre FROM Marca WHERE MarcaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C9", "SELECT RubroNombre FROM Rubro WHERE RubroId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C10", "SELECT AlicuotaIvaNombre FROM AlicuotaIva WHERE AlicuotaIvaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C11", "SELECT ArticuloId FROM Articulo WHERE ArticuloId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C12", "SELECT ArticuloId FROM Articulo WHERE ( ArticuloId > ( ?)) ORDER BY ArticuloId  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C13", "SELECT ArticuloId FROM Articulo WHERE ( ArticuloId < ( ?)) ORDER BY ArticuloId DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000C14", "SAVEPOINT gxupdate;INSERT INTO Articulo(ArticuloId, ArticuloNombre, ArticuloCosto, MarcaId, RubroId, AlicuotaIvaId) VALUES(?, ?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000C15", "SAVEPOINT gxupdate;UPDATE Articulo SET ArticuloNombre=?, ArticuloCosto=?, MarcaId=?, RubroId=?, AlicuotaIvaId=?  WHERE ArticuloId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000C16", "SAVEPOINT gxupdate;DELETE FROM Articulo  WHERE ArticuloId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000C17", "SELECT MarcaNombre FROM Marca WHERE MarcaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C18", "SELECT RubroNombre FROM Rubro WHERE RubroId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C19", "SELECT AlicuotaIvaNombre FROM AlicuotaIva WHERE AlicuotaIvaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C20", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra, ArticuloId FROM ComprobanteArticulo WHERE ArticuloId = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C21", "SELECT ArticuloId FROM Articulo ORDER BY ArticuloId ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
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
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
               stmt.setVarchar(2, (String)parms[1], 250, false);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 250, false);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 15, false);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 15, false);
               return;
      }
   }

}

