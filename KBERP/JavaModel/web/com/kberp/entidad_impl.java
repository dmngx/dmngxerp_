/*
               File: entidad_impl
        Description: Entidad
             Author: GeneXus Java Generator version 15_0_2-109402
       Generated on: February 19, 2017 17:35:17.41
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

public final  class entidad_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A42EmpresaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A42EmpresaId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A102EntidadTipoDocumentoId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A102EntidadTipoDocumentoId", GXutil.ltrim( GXutil.str( A102EntidadTipoDocumentoId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A102EntidadTipoDocumentoId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A103EntidadCondCpraVtaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A103EntidadCondCpraVtaId", GXutil.ltrim( GXutil.str( A103EntidadCondCpraVtaId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A103EntidadCondCpraVtaId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A99EntidadPaisId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A99EntidadPaisId", GXutil.ltrim( GXutil.str( A99EntidadPaisId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A99EntidadPaisId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A100EntidadProvinciaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A100EntidadProvinciaId", GXutil.ltrim( GXutil.str( A100EntidadProvinciaId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A100EntidadProvinciaId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A104EntidadCondIvaId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A104EntidadCondIvaId", GXutil.ltrim( GXutil.str( A104EntidadCondIvaId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A104EntidadCondIvaId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A98EntidadLocalidadId = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A98EntidadLocalidadId", GXutil.ltrim( GXutil.str( A98EntidadLocalidadId, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A98EntidadLocalidadId) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridentidad_telefono") == 0 )
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
         gxnrgridentidad_telefono_newrow( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridentidad_domicilio") == 0 )
      {
         nRC_GXsfl_66 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_66_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_66_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridentidad_domicilio_newrow( ) ;
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
      cmbEntidadTipo.setName( "ENTIDADTIPO" );
      cmbEntidadTipo.setWebtags( "" );
      cmbEntidadTipo.addItem("1", "Cliente", (short)(0));
      cmbEntidadTipo.addItem("1", "Proveedor", (short)(0));
      if ( cmbEntidadTipo.getItemCount() > 0 )
      {
         A94EntidadTipo = (byte)(GXutil.lval( cmbEntidadTipo.getValidValue(GXutil.trim( GXutil.str( A94EntidadTipo, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A94EntidadTipo", GXutil.ltrim( GXutil.str( A94EntidadTipo, 2, 0)));
      }
      chkEntidadActiva.setName( "ENTIDADACTIVA" );
      chkEntidadActiva.setWebtags( "" );
      chkEntidadActiva.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkEntidadActiva.getInternalname(), "TitleCaption", chkEntidadActiva.getCaption());
      chkEntidadActiva.setCheckedValue( "false" );
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
         Form.getMeta().addItem("description", "Entidad", (short)(0)) ;
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

   public entidad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entidad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entidad_impl.class ));
   }

   public entidad_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbEntidadTipo = new HTMLChoice();
      chkEntidadActiva = UIFactory.getCheckbox(this);
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
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Entidad", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_Entidad.htm");
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
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.kberp.gx0180"+"',["+"{Ctrl:gx.dom.el('"+"EMPRESAID"+"'), id:'"+"EMPRESAID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ENTIDADID"+"'), id:'"+"ENTIDADID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_Entidad.htm");
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
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEmpresaId_Internalname, GXutil.ltrim( localUtil.ntoc( A42EmpresaId, (byte)(6), (byte)(0), ",", "")), ((edtEmpresaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A42EmpresaId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresaId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasMaestras", "right", "HLP_Entidad.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_42_Internalname, sImgUrl, imgprompt_42_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_42_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Entidad.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEntidadId_Internalname, GXutil.ltrim( localUtil.ntoc( A81EntidadId, (byte)(6), (byte)(0), ",", "")), ((edtEntidadId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A81EntidadId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A81EntidadId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntidadId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEntidadId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasMaestras", "right", "HLP_Entidad.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadNombre_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_html_textarea( httpContext, edtEntidadNombre_Internalname, A82EntidadNombre, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", (short)(0), 1, edtEntidadNombre_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "250", -1, 0, "", "", (byte)(-1), true, "NombreTablasMaestras", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Entidad.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadNumeroDocumento_Internalname, "Numero Documento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEntidadNumeroDocumento_Internalname, GXutil.rtrim( A83EntidadNumeroDocumento), GXutil.rtrim( localUtil.format( A83EntidadNumeroDocumento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntidadNumeroDocumento_Jsonclick, 0, "Attribute", "", "", "", 1, edtEntidadNumeroDocumento_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "NumeroDocumento", "left", "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divTelefonotable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblTitletelefono_Internalname, "Telefono", "", "", lblTitletelefono_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridentidad_telefono( ) ;
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, divDomiciliotable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.kberp.GxWebStd.gx_label_ctrl( httpContext, lblTitledomicilio_Internalname, "Domicilio", "", "", lblTitledomicilio_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridentidad_domicilio( ) ;
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadTipoDocumentoId_Internalname, "Documento Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEntidadTipoDocumentoId_Internalname, GXutil.ltrim( localUtil.ntoc( A102EntidadTipoDocumentoId, (byte)(4), (byte)(0), ",", "")), ((edtEntidadTipoDocumentoId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A102EntidadTipoDocumentoId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A102EntidadTipoDocumentoId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntidadTipoDocumentoId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEntidadTipoDocumentoId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Entidad.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_102_Internalname, sImgUrl, imgprompt_102_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_102_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadCondCpraVtaId_Internalname, "Vta Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEntidadCondCpraVtaId_Internalname, GXutil.ltrim( localUtil.ntoc( A103EntidadCondCpraVtaId, (byte)(4), (byte)(0), ",", "")), ((edtEntidadCondCpraVtaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A103EntidadCondCpraVtaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A103EntidadCondCpraVtaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntidadCondCpraVtaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEntidadCondCpraVtaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Entidad.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_103_Internalname, sImgUrl, imgprompt_103_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_103_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadPaisId_Internalname, "Pais Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEntidadPaisId_Internalname, GXutil.ltrim( localUtil.ntoc( A99EntidadPaisId, (byte)(4), (byte)(0), ",", "")), ((edtEntidadPaisId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A99EntidadPaisId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A99EntidadPaisId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntidadPaisId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEntidadPaisId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Entidad.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_99_Internalname, sImgUrl, imgprompt_99_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_99_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Entidad.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadProvinciaId_Internalname, "Provincia Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEntidadProvinciaId_Internalname, GXutil.ltrim( localUtil.ntoc( A100EntidadProvinciaId, (byte)(4), (byte)(0), ",", "")), ((edtEntidadProvinciaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A100EntidadProvinciaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A100EntidadProvinciaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntidadProvinciaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEntidadProvinciaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Entidad.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_100_Internalname, sImgUrl, imgprompt_100_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_100_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Entidad.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadCondIvaId_Internalname, "Iva Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEntidadCondIvaId_Internalname, GXutil.ltrim( localUtil.ntoc( A104EntidadCondIvaId, (byte)(4), (byte)(0), ",", "")), ((edtEntidadCondIvaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A104EntidadCondIvaId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A104EntidadCondIvaId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntidadCondIvaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEntidadCondIvaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Entidad.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_104_Internalname, sImgUrl, imgprompt_104_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_104_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Entidad.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, edtEntidadLocalidadId_Internalname, "Localidad Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         com.kberp.GxWebStd.gx_single_line_edit( httpContext, edtEntidadLocalidadId_Internalname, GXutil.ltrim( localUtil.ntoc( A98EntidadLocalidadId, (byte)(4), (byte)(0), ",", "")), ((edtEntidadLocalidadId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A98EntidadLocalidadId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A98EntidadLocalidadId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntidadLocalidadId_Jsonclick, 0, "Attribute", "", "", "", 1, edtEntidadLocalidadId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdTablasGenerales", "right", "HLP_Entidad.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
         com.kberp.GxWebStd.gx_bitmap( httpContext, imgprompt_98_Internalname, sImgUrl, imgprompt_98_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_98_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Entidad.htm");
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
         com.kberp.GxWebStd.gx_label_element( httpContext, cmbEntidadTipo.getInternalname(), "Tipo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         /* ComboBox */
         com.kberp.GxWebStd.gx_combobox_ctrl1( httpContext, cmbEntidadTipo, cmbEntidadTipo.getInternalname(), GXutil.trim( GXutil.str( A94EntidadTipo, 2, 0)), 1, cmbEntidadTipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbEntidadTipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "", true, "HLP_Entidad.htm");
         cmbEntidadTipo.setValue( GXutil.trim( GXutil.str( A94EntidadTipo, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbEntidadTipo.getInternalname(), "Values", cmbEntidadTipo.ToJavascriptSource());
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
         com.kberp.GxWebStd.gx_label_element( httpContext, chkEntidadActiva.getInternalname(), "Activa", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_checkbox_ctrl( httpContext, chkEntidadActiva.getInternalname(), GXutil.booltostr( A95EntidadActiva), "", "Activa", 1, chkEntidadActiva.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(105, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.kberp.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.kberp.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Entidad.htm");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.kberp.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      /* Execute Exit event if defined. */
   }

   public void gxdraw_gridentidad_telefono( )
   {
      /*  Grid Control  */
      Gridentidad_telefonoContainer.AddObjectProperty("GridName", "Gridentidad_telefono");
      Gridentidad_telefonoContainer.AddObjectProperty("Class", "Grid");
      Gridentidad_telefonoContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridentidad_telefono_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddObjectProperty("CmpContext", "");
      Gridentidad_telefonoContainer.AddObjectProperty("InMasterPage", "false");
      Gridentidad_telefonoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_telefonoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A91EntidadTelefonoId, (byte)(4), (byte)(0), ".", "")));
      Gridentidad_telefonoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefonoId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddColumnProperties(Gridentidad_telefonoColumn);
      Gridentidad_telefonoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_telefonoColumn.AddObjectProperty("Value", GXutil.rtrim( A92EntidadTelefono));
      Gridentidad_telefonoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefono_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddColumnProperties(Gridentidad_telefonoColumn);
      Gridentidad_telefonoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_telefonoColumn.AddObjectProperty("Value", A93EntidadTelefonoObs);
      Gridentidad_telefonoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefonoObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddColumnProperties(Gridentidad_telefonoColumn);
      Gridentidad_telefonoContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridentidad_telefono_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridentidad_telefono_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridentidad_telefono_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridentidad_telefono_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridentidad_telefono_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridentidad_telefonoContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridentidad_telefono_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_54_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount45 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_45 = (short)(1) ;
            scanStart0I45( ) ;
            while ( RcdFound45 != 0 )
            {
               init_level_properties45( ) ;
               getByPrimaryKey0I45( ) ;
               addRow0I45( ) ;
               scanNext0I45( ) ;
            }
            scanEnd0I45( ) ;
            nBlankRcdCount45 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0I45( ) ;
         standaloneModal0I45( ) ;
         sMode45 = Gx_mode ;
         while ( nGXsfl_54_idx < nRC_GXsfl_54 )
         {
            readRow0I45( ) ;
            edtEntidadTelefonoId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADTELEFONOID_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadTelefonoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTelefonoId_Enabled, 5, 0)));
            edtEntidadTelefono_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADTELEFONO_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadTelefono_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTelefono_Enabled, 5, 0)));
            edtEntidadTelefonoObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADTELEFONOOBS_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadTelefonoObs_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTelefonoObs_Enabled, 5, 0)));
            if ( ( nRcdExists_45 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0I45( ) ;
            }
            sendRow0I45( ) ;
         }
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount45 = (short)(5) ;
         nRcdExists_45 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0I45( ) ;
            while ( RcdFound45 != 0 )
            {
               sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_5445( ) ;
               init_level_properties45( ) ;
               standaloneNotModal0I45( ) ;
               getByPrimaryKey0I45( ) ;
               standaloneModal0I45( ) ;
               addRow0I45( ) ;
               scanNext0I45( ) ;
            }
            scanEnd0I45( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode45 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx+1, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5445( ) ;
      initAll0I45( ) ;
      init_level_properties45( ) ;
      standaloneNotModal0I45( ) ;
      standaloneModal0I45( ) ;
      nRcdExists_45 = (short)(0) ;
      nIsMod_45 = (short)(0) ;
      nRcdDeleted_45 = (short)(0) ;
      nBlankRcdCount45 = (short)(nBlankRcdUsr45+nBlankRcdCount45) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount45 > 0 )
      {
         addRow0I45( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEntidadTelefonoId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount45 = (short)(nBlankRcdCount45-1) ;
      }
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridentidad_telefonoContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridentidad_telefono", Gridentidad_telefonoContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "Gridentidad_telefonoContainerData", Gridentidad_telefonoContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "Gridentidad_telefonoContainerData"+"V", Gridentidad_telefonoContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridentidad_telefonoContainerData"+"V"+"\" value='"+Gridentidad_telefonoContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridentidad_domicilio( )
   {
      /*  Grid Control  */
      Gridentidad_domicilioContainer.AddObjectProperty("GridName", "Gridentidad_domicilio");
      Gridentidad_domicilioContainer.AddObjectProperty("Class", "Grid");
      Gridentidad_domicilioContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridentidad_domicilio_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddObjectProperty("CmpContext", "");
      Gridentidad_domicilioContainer.AddObjectProperty("InMasterPage", "false");
      Gridentidad_domicilioColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_domicilioColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A84EntidadDomicilioId, (byte)(4), (byte)(0), ".", "")));
      Gridentidad_domicilioColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddColumnProperties(Gridentidad_domicilioColumn);
      Gridentidad_domicilioColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_domicilioColumn.AddObjectProperty("Value", A85EntidadDomicilioCalle);
      Gridentidad_domicilioColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCalle_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddColumnProperties(Gridentidad_domicilioColumn);
      Gridentidad_domicilioColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_domicilioColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A86EntidadDomicilioNumero, (byte)(6), (byte)(0), ".", "")));
      Gridentidad_domicilioColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioNumero_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddColumnProperties(Gridentidad_domicilioColumn);
      Gridentidad_domicilioColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_domicilioColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A87EntidadDomicilioPiso, (byte)(3), (byte)(0), ".", "")));
      Gridentidad_domicilioColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioPiso_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddColumnProperties(Gridentidad_domicilioColumn);
      Gridentidad_domicilioColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_domicilioColumn.AddObjectProperty("Value", A88EntidadDomicilioDepto);
      Gridentidad_domicilioColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioDepto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddColumnProperties(Gridentidad_domicilioColumn);
      Gridentidad_domicilioColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_domicilioColumn.AddObjectProperty("Value", A89EntidadDomicilioCPostal);
      Gridentidad_domicilioColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCPostal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddColumnProperties(Gridentidad_domicilioColumn);
      Gridentidad_domicilioColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentidad_domicilioColumn.AddObjectProperty("Value", A90EntidadDomicilioCompleto);
      Gridentidad_domicilioColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCompleto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddColumnProperties(Gridentidad_domicilioColumn);
      Gridentidad_domicilioContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridentidad_domicilio_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridentidad_domicilio_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridentidad_domicilio_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridentidad_domicilio_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridentidad_domicilio_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridentidad_domicilioContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridentidad_domicilio_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_66_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount46 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_46 = (short)(1) ;
            scanStart0I46( ) ;
            while ( RcdFound46 != 0 )
            {
               init_level_properties46( ) ;
               getByPrimaryKey0I46( ) ;
               addRow0I46( ) ;
               scanNext0I46( ) ;
            }
            scanEnd0I46( ) ;
            nBlankRcdCount46 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0I46( ) ;
         standaloneModal0I46( ) ;
         sMode46 = Gx_mode ;
         while ( nGXsfl_66_idx < nRC_GXsfl_66 )
         {
            readRow0I46( ) ;
            edtEntidadDomicilioId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOID_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioId_Enabled, 5, 0)));
            edtEntidadDomicilioCalle_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOCALLE_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioCalle_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioCalle_Enabled, 5, 0)));
            edtEntidadDomicilioNumero_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIONUMERO_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioNumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioNumero_Enabled, 5, 0)));
            edtEntidadDomicilioPiso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOPISO_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioPiso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioPiso_Enabled, 5, 0)));
            edtEntidadDomicilioDepto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIODEPTO_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioDepto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioDepto_Enabled, 5, 0)));
            edtEntidadDomicilioCPostal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOCPOSTAL_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioCPostal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioCPostal_Enabled, 5, 0)));
            edtEntidadDomicilioCompleto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOCOMPLETO_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioCompleto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioCompleto_Enabled, 5, 0)));
            if ( ( nRcdExists_46 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0I46( ) ;
            }
            sendRow0I46( ) ;
         }
         Gx_mode = sMode46 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount46 = (short)(5) ;
         nRcdExists_46 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0I46( ) ;
            while ( RcdFound46 != 0 )
            {
               sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_6646( ) ;
               init_level_properties46( ) ;
               standaloneNotModal0I46( ) ;
               getByPrimaryKey0I46( ) ;
               standaloneModal0I46( ) ;
               addRow0I46( ) ;
               scanNext0I46( ) ;
            }
            scanEnd0I46( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode46 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx+1, 4, 0)), (short)(4), "0") ;
      subsflControlProps_6646( ) ;
      initAll0I46( ) ;
      init_level_properties46( ) ;
      standaloneNotModal0I46( ) ;
      standaloneModal0I46( ) ;
      nRcdExists_46 = (short)(0) ;
      nIsMod_46 = (short)(0) ;
      nRcdDeleted_46 = (short)(0) ;
      nBlankRcdCount46 = (short)(nBlankRcdUsr46+nBlankRcdCount46) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount46 > 0 )
      {
         addRow0I46( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEntidadDomicilioId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount46 = (short)(nBlankRcdCount46-1) ;
      }
      Gx_mode = sMode46 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridentidad_domicilioContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridentidad_domicilio", Gridentidad_domicilioContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "Gridentidad_domicilioContainerData", Gridentidad_domicilioContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.kberp.GxWebStd.gx_hidden_field( httpContext, "Gridentidad_domicilioContainerData"+"V", Gridentidad_domicilioContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridentidad_domicilioContainerData"+"V"+"\" value='"+Gridentidad_domicilioContainer.GridValuesHidden()+"'/>") ;
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
            A82EntidadNombre = httpContext.cgiGet( edtEntidadNombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A82EntidadNombre", A82EntidadNombre);
            A83EntidadNumeroDocumento = httpContext.cgiGet( edtEntidadNumeroDocumento_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A83EntidadNumeroDocumento", A83EntidadNumeroDocumento);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadTipoDocumentoId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadTipoDocumentoId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTIDADTIPODOCUMENTOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntidadTipoDocumentoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A102EntidadTipoDocumentoId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A102EntidadTipoDocumentoId", GXutil.ltrim( GXutil.str( A102EntidadTipoDocumentoId, 4, 0)));
            }
            else
            {
               A102EntidadTipoDocumentoId = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadTipoDocumentoId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A102EntidadTipoDocumentoId", GXutil.ltrim( GXutil.str( A102EntidadTipoDocumentoId, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadCondCpraVtaId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadCondCpraVtaId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTIDADCONDCPRAVTAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntidadCondCpraVtaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A103EntidadCondCpraVtaId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A103EntidadCondCpraVtaId", GXutil.ltrim( GXutil.str( A103EntidadCondCpraVtaId, 4, 0)));
            }
            else
            {
               A103EntidadCondCpraVtaId = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadCondCpraVtaId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A103EntidadCondCpraVtaId", GXutil.ltrim( GXutil.str( A103EntidadCondCpraVtaId, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadPaisId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadPaisId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTIDADPAISID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntidadPaisId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A99EntidadPaisId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A99EntidadPaisId", GXutil.ltrim( GXutil.str( A99EntidadPaisId, 4, 0)));
            }
            else
            {
               A99EntidadPaisId = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadPaisId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A99EntidadPaisId", GXutil.ltrim( GXutil.str( A99EntidadPaisId, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadProvinciaId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadProvinciaId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTIDADPROVINCIAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntidadProvinciaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A100EntidadProvinciaId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A100EntidadProvinciaId", GXutil.ltrim( GXutil.str( A100EntidadProvinciaId, 4, 0)));
            }
            else
            {
               A100EntidadProvinciaId = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadProvinciaId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A100EntidadProvinciaId", GXutil.ltrim( GXutil.str( A100EntidadProvinciaId, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadCondIvaId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadCondIvaId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTIDADCONDIVAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntidadCondIvaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A104EntidadCondIvaId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A104EntidadCondIvaId", GXutil.ltrim( GXutil.str( A104EntidadCondIvaId, 4, 0)));
            }
            else
            {
               A104EntidadCondIvaId = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadCondIvaId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A104EntidadCondIvaId", GXutil.ltrim( GXutil.str( A104EntidadCondIvaId, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadLocalidadId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadLocalidadId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTIDADLOCALIDADID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntidadLocalidadId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A98EntidadLocalidadId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A98EntidadLocalidadId", GXutil.ltrim( GXutil.str( A98EntidadLocalidadId, 4, 0)));
            }
            else
            {
               A98EntidadLocalidadId = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadLocalidadId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A98EntidadLocalidadId", GXutil.ltrim( GXutil.str( A98EntidadLocalidadId, 4, 0)));
            }
            cmbEntidadTipo.setName( cmbEntidadTipo.getInternalname() );
            cmbEntidadTipo.setValue( httpContext.cgiGet( cmbEntidadTipo.getInternalname()) );
            A94EntidadTipo = (byte)(GXutil.lval( httpContext.cgiGet( cmbEntidadTipo.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A94EntidadTipo", GXutil.ltrim( GXutil.str( A94EntidadTipo, 2, 0)));
            A95EntidadActiva = GXutil.strtobool( httpContext.cgiGet( chkEntidadActiva.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, "A95EntidadActiva", A95EntidadActiva);
            /* Read saved values. */
            Z42EmpresaId = (int)(localUtil.ctol( httpContext.cgiGet( "Z42EmpresaId"), ",", ".")) ;
            Z81EntidadId = (int)(localUtil.ctol( httpContext.cgiGet( "Z81EntidadId"), ",", ".")) ;
            Z82EntidadNombre = httpContext.cgiGet( "Z82EntidadNombre") ;
            Z83EntidadNumeroDocumento = httpContext.cgiGet( "Z83EntidadNumeroDocumento") ;
            Z94EntidadTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z94EntidadTipo"), ",", ".")) ;
            Z95EntidadActiva = GXutil.strtobool( httpContext.cgiGet( "Z95EntidadActiva")) ;
            Z102EntidadTipoDocumentoId = (short)(localUtil.ctol( httpContext.cgiGet( "Z102EntidadTipoDocumentoId"), ",", ".")) ;
            Z103EntidadCondCpraVtaId = (short)(localUtil.ctol( httpContext.cgiGet( "Z103EntidadCondCpraVtaId"), ",", ".")) ;
            Z99EntidadPaisId = (short)(localUtil.ctol( httpContext.cgiGet( "Z99EntidadPaisId"), ",", ".")) ;
            Z104EntidadCondIvaId = (short)(localUtil.ctol( httpContext.cgiGet( "Z104EntidadCondIvaId"), ",", ".")) ;
            Z98EntidadLocalidadId = (short)(localUtil.ctol( httpContext.cgiGet( "Z98EntidadLocalidadId"), ",", ".")) ;
            Z100EntidadProvinciaId = (short)(localUtil.ctol( httpContext.cgiGet( "Z100EntidadProvinciaId"), ",", ".")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_54 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_54"), ",", ".")) ;
            nRC_GXsfl_66 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_66"), ",", ".")) ;
            A3PaisId = (short)(localUtil.ctol( httpContext.cgiGet( "PAISID"), ",", ".")) ;
            A13CondicionIvaId = (short)(localUtil.ctol( httpContext.cgiGet( "CONDICIONIVAID"), ",", ".")) ;
            A5LocalidadId = (short)(localUtil.ctol( httpContext.cgiGet( "LOCALIDADID"), ",", ".")) ;
            A1ProvinciaId = (short)(localUtil.ctol( httpContext.cgiGet( "PROVINCIAID"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
            initAll0I44( ) ;
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
      disableAttributes0I44( ) ;
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

   public void confirm_0I46( )
   {
      nGXsfl_66_idx = (short)(0) ;
      while ( nGXsfl_66_idx < nRC_GXsfl_66 )
      {
         readRow0I46( ) ;
         if ( ( nRcdExists_46 != 0 ) || ( nIsMod_46 != 0 ) )
         {
            getKey0I46( ) ;
            if ( ( nRcdExists_46 == 0 ) && ( nRcdDeleted_46 == 0 ) )
            {
               if ( RcdFound46 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0I46( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0I46( ) ;
                     closeExtendedTableCursors0I46( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ENTIDADDOMICILIOID_" + sGXsfl_66_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEntidadDomicilioId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound46 != 0 )
               {
                  if ( nRcdDeleted_46 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0I46( ) ;
                     load0I46( ) ;
                     beforeValidate0I46( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0I46( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_46 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0I46( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0I46( ) ;
                           closeExtendedTableCursors0I46( ) ;
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
                  if ( nRcdDeleted_46 == 0 )
                  {
                     GXCCtl = "ENTIDADDOMICILIOID_" + sGXsfl_66_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEntidadDomicilioId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtEntidadDomicilioId_Internalname, GXutil.ltrim( localUtil.ntoc( A84EntidadDomicilioId, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtEntidadDomicilioCalle_Internalname, A85EntidadDomicilioCalle) ;
         httpContext.changePostValue( edtEntidadDomicilioNumero_Internalname, GXutil.ltrim( localUtil.ntoc( A86EntidadDomicilioNumero, (byte)(6), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtEntidadDomicilioPiso_Internalname, GXutil.ltrim( localUtil.ntoc( A87EntidadDomicilioPiso, (byte)(3), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtEntidadDomicilioDepto_Internalname, A88EntidadDomicilioDepto) ;
         httpContext.changePostValue( edtEntidadDomicilioCPostal_Internalname, A89EntidadDomicilioCPostal) ;
         httpContext.changePostValue( edtEntidadDomicilioCompleto_Internalname, A90EntidadDomicilioCompleto) ;
         httpContext.changePostValue( "ZT_"+"Z84EntidadDomicilioId_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( Z84EntidadDomicilioId, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z85EntidadDomicilioCalle_"+sGXsfl_66_idx, Z85EntidadDomicilioCalle) ;
         httpContext.changePostValue( "ZT_"+"Z86EntidadDomicilioNumero_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( Z86EntidadDomicilioNumero, (byte)(6), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z87EntidadDomicilioPiso_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( Z87EntidadDomicilioPiso, (byte)(3), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z88EntidadDomicilioDepto_"+sGXsfl_66_idx, Z88EntidadDomicilioDepto) ;
         httpContext.changePostValue( "ZT_"+"Z89EntidadDomicilioCPostal_"+sGXsfl_66_idx, Z89EntidadDomicilioCPostal) ;
         httpContext.changePostValue( "nRcdDeleted_46_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_46, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_46_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_46, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_46_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_46, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_46 != 0 )
         {
            httpContext.changePostValue( "ENTIDADDOMICILIOID_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIOCALLE_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCalle_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIONUMERO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioNumero_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIOPISO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioPiso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIODEPTO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioDepto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIOCPOSTAL_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCPostal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIOCOMPLETO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCompleto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_0I45( )
   {
      nGXsfl_54_idx = (short)(0) ;
      while ( nGXsfl_54_idx < nRC_GXsfl_54 )
      {
         readRow0I45( ) ;
         if ( ( nRcdExists_45 != 0 ) || ( nIsMod_45 != 0 ) )
         {
            getKey0I45( ) ;
            if ( ( nRcdExists_45 == 0 ) && ( nRcdDeleted_45 == 0 ) )
            {
               if ( RcdFound45 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0I45( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0I45( ) ;
                     closeExtendedTableCursors0I45( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ENTIDADTELEFONOID_" + sGXsfl_54_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEntidadTelefonoId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound45 != 0 )
               {
                  if ( nRcdDeleted_45 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0I45( ) ;
                     load0I45( ) ;
                     beforeValidate0I45( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0I45( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_45 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0I45( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0I45( ) ;
                           closeExtendedTableCursors0I45( ) ;
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
                  if ( nRcdDeleted_45 == 0 )
                  {
                     GXCCtl = "ENTIDADTELEFONOID_" + sGXsfl_54_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEntidadTelefonoId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtEntidadTelefonoId_Internalname, GXutil.ltrim( localUtil.ntoc( A91EntidadTelefonoId, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtEntidadTelefono_Internalname, GXutil.rtrim( A92EntidadTelefono)) ;
         httpContext.changePostValue( edtEntidadTelefonoObs_Internalname, A93EntidadTelefonoObs) ;
         httpContext.changePostValue( "ZT_"+"Z91EntidadTelefonoId_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z91EntidadTelefonoId, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z92EntidadTelefono_"+sGXsfl_54_idx, GXutil.rtrim( Z92EntidadTelefono)) ;
         httpContext.changePostValue( "ZT_"+"Z93EntidadTelefonoObs_"+sGXsfl_54_idx, Z93EntidadTelefonoObs) ;
         httpContext.changePostValue( "nRcdDeleted_45_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_45, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_45_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_45, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_45_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_45, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_45 != 0 )
         {
            httpContext.changePostValue( "ENTIDADTELEFONOID_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefonoId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADTELEFONO_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefono_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADTELEFONOOBS_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefonoObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0I0( )
   {
   }

   public void zm0I44( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z82EntidadNombre = T000I7_A82EntidadNombre[0] ;
            Z83EntidadNumeroDocumento = T000I7_A83EntidadNumeroDocumento[0] ;
            Z94EntidadTipo = T000I7_A94EntidadTipo[0] ;
            Z95EntidadActiva = T000I7_A95EntidadActiva[0] ;
            Z102EntidadTipoDocumentoId = T000I7_A102EntidadTipoDocumentoId[0] ;
            Z103EntidadCondCpraVtaId = T000I7_A103EntidadCondCpraVtaId[0] ;
            Z99EntidadPaisId = T000I7_A99EntidadPaisId[0] ;
            Z104EntidadCondIvaId = T000I7_A104EntidadCondIvaId[0] ;
            Z98EntidadLocalidadId = T000I7_A98EntidadLocalidadId[0] ;
            Z100EntidadProvinciaId = T000I7_A100EntidadProvinciaId[0] ;
         }
         else
         {
            Z82EntidadNombre = A82EntidadNombre ;
            Z83EntidadNumeroDocumento = A83EntidadNumeroDocumento ;
            Z94EntidadTipo = A94EntidadTipo ;
            Z95EntidadActiva = A95EntidadActiva ;
            Z102EntidadTipoDocumentoId = A102EntidadTipoDocumentoId ;
            Z103EntidadCondCpraVtaId = A103EntidadCondCpraVtaId ;
            Z99EntidadPaisId = A99EntidadPaisId ;
            Z104EntidadCondIvaId = A104EntidadCondIvaId ;
            Z98EntidadLocalidadId = A98EntidadLocalidadId ;
            Z100EntidadProvinciaId = A100EntidadProvinciaId ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z81EntidadId = A81EntidadId ;
         Z82EntidadNombre = A82EntidadNombre ;
         Z83EntidadNumeroDocumento = A83EntidadNumeroDocumento ;
         Z94EntidadTipo = A94EntidadTipo ;
         Z95EntidadActiva = A95EntidadActiva ;
         Z102EntidadTipoDocumentoId = A102EntidadTipoDocumentoId ;
         Z103EntidadCondCpraVtaId = A103EntidadCondCpraVtaId ;
         Z99EntidadPaisId = A99EntidadPaisId ;
         Z104EntidadCondIvaId = A104EntidadCondIvaId ;
         Z98EntidadLocalidadId = A98EntidadLocalidadId ;
         Z100EntidadProvinciaId = A100EntidadProvinciaId ;
         Z42EmpresaId = A42EmpresaId ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_42_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx00e0"+"',["+"{Ctrl:gx.dom.el('"+"EMPRESAID"+"'), id:'"+"EMPRESAID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      imgprompt_102_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0050"+"',["+"{Ctrl:gx.dom.el('"+"ENTIDADTIPODOCUMENTOID"+"'), id:'"+"ENTIDADTIPODOCUMENTOID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_103_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0080"+"',["+"{Ctrl:gx.dom.el('"+"ENTIDADCONDCPRAVTAID"+"'), id:'"+"ENTIDADCONDCPRAVTAID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_99_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0020"+"',["+"{Ctrl:gx.dom.el('"+"ENTIDADPAISID"+"'), id:'"+"ENTIDADPAISID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_100_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"ENTIDADPROVINCIAID"+"'), id:'"+"ENTIDADPROVINCIAID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_104_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0070"+"',["+"{Ctrl:gx.dom.el('"+"ENTIDADCONDIVAID"+"'), id:'"+"ENTIDADCONDIVAID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_98_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.kberp.gx0030"+"',["+"{Ctrl:gx.dom.el('"+"ENTIDADLOCALIDADID"+"'), id:'"+"ENTIDADLOCALIDADID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
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

   public void load0I44( )
   {
      /* Using cursor T000I19 */
      pr_default.execute(17, new Object[] {new Integer(A81EntidadId), new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A82EntidadNombre = T000I19_A82EntidadNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82EntidadNombre", A82EntidadNombre);
         A83EntidadNumeroDocumento = T000I19_A83EntidadNumeroDocumento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83EntidadNumeroDocumento", A83EntidadNumeroDocumento);
         A94EntidadTipo = T000I19_A94EntidadTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94EntidadTipo", GXutil.ltrim( GXutil.str( A94EntidadTipo, 2, 0)));
         A95EntidadActiva = T000I19_A95EntidadActiva[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95EntidadActiva", A95EntidadActiva);
         A102EntidadTipoDocumentoId = T000I19_A102EntidadTipoDocumentoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102EntidadTipoDocumentoId", GXutil.ltrim( GXutil.str( A102EntidadTipoDocumentoId, 4, 0)));
         A103EntidadCondCpraVtaId = T000I19_A103EntidadCondCpraVtaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103EntidadCondCpraVtaId", GXutil.ltrim( GXutil.str( A103EntidadCondCpraVtaId, 4, 0)));
         A99EntidadPaisId = T000I19_A99EntidadPaisId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99EntidadPaisId", GXutil.ltrim( GXutil.str( A99EntidadPaisId, 4, 0)));
         A104EntidadCondIvaId = T000I19_A104EntidadCondIvaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104EntidadCondIvaId", GXutil.ltrim( GXutil.str( A104EntidadCondIvaId, 4, 0)));
         A98EntidadLocalidadId = T000I19_A98EntidadLocalidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98EntidadLocalidadId", GXutil.ltrim( GXutil.str( A98EntidadLocalidadId, 4, 0)));
         A100EntidadProvinciaId = T000I19_A100EntidadProvinciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100EntidadProvinciaId", GXutil.ltrim( GXutil.str( A100EntidadProvinciaId, 4, 0)));
         zm0I44( -3) ;
      }
      pr_default.close(17);
      onLoadActions0I44( ) ;
   }

   public void onLoadActions0I44( )
   {
   }

   public void checkExtendedTable0I44( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T000I14 */
      pr_default.execute(12, new Object[] {new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Empresa'.", "ForeignKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      /* Using cursor T000I8 */
      pr_default.execute(6, new Object[] {new Short(A102EntidadTipoDocumentoId)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Documento'.", "ForeignKeyNotFound", 1, "ENTIDADTIPODOCUMENTOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadTipoDocumentoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      /* Using cursor T000I9 */
      pr_default.execute(7, new Object[] {new Short(A103EntidadCondCpraVtaId)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Condicion Cpra Vta'.", "ForeignKeyNotFound", 1, "ENTIDADCONDCPRAVTAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadCondCpraVtaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
      /* Using cursor T000I10 */
      pr_default.execute(8, new Object[] {new Short(A99EntidadPaisId)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Pais'.", "ForeignKeyNotFound", 1, "ENTIDADPAISID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadPaisId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(8);
      /* Using cursor T000I13 */
      pr_default.execute(11, new Object[] {new Short(A100EntidadProvinciaId)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Provincia'.", "ForeignKeyNotFound", 1, "ENTIDADPROVINCIAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadProvinciaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(11);
      /* Using cursor T000I11 */
      pr_default.execute(9, new Object[] {new Short(A104EntidadCondIvaId)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Condicion Iva'.", "ForeignKeyNotFound", 1, "ENTIDADCONDIVAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadCondIvaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(9);
      /* Using cursor T000I12 */
      pr_default.execute(10, new Object[] {new Short(A98EntidadLocalidadId)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Localidad'.", "ForeignKeyNotFound", 1, "ENTIDADLOCALIDADID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadLocalidadId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(10);
      if ( ! ( ( A94EntidadTipo == 1 ) || ( A94EntidadTipo == 1 ) ) )
      {
         httpContext.GX_msglist.addItem("Campo Entidad Tipo fuera de rango", "OutOfRange", 1, "ENTIDADTIPO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbEntidadTipo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0I44( )
   {
      pr_default.close(12);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(13);
      pr_default.close(16);
      pr_default.close(14);
      pr_default.close(15);
   }

   public void enableDisable( )
   {
   }

   public void gxload_10( int A42EmpresaId )
   {
      /* Using cursor T000I20 */
      pr_default.execute(18, new Object[] {new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Empresa'.", "ForeignKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(18);
   }

   public void gxload_4( short A102EntidadTipoDocumentoId )
   {
      /* Using cursor T000I21 */
      pr_default.execute(19, new Object[] {new Short(A102EntidadTipoDocumentoId)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Documento'.", "ForeignKeyNotFound", 1, "ENTIDADTIPODOCUMENTOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadTipoDocumentoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(19);
   }

   public void gxload_5( short A103EntidadCondCpraVtaId )
   {
      /* Using cursor T000I22 */
      pr_default.execute(20, new Object[] {new Short(A103EntidadCondCpraVtaId)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Condicion Cpra Vta'.", "ForeignKeyNotFound", 1, "ENTIDADCONDCPRAVTAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadCondCpraVtaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(20);
   }

   public void gxload_6( short A99EntidadPaisId )
   {
      /* Using cursor T000I10 */
      pr_default.execute(8, new Object[] {new Short(A99EntidadPaisId)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Pais'.", "ForeignKeyNotFound", 1, "ENTIDADPAISID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadPaisId_Internalname ;
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

   public void gxload_9( short A100EntidadProvinciaId )
   {
      /* Using cursor T000I13 */
      pr_default.execute(11, new Object[] {new Short(A100EntidadProvinciaId)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Provincia'.", "ForeignKeyNotFound", 1, "ENTIDADPROVINCIAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadProvinciaId_Internalname ;
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

   public void gxload_7( short A104EntidadCondIvaId )
   {
      /* Using cursor T000I11 */
      pr_default.execute(9, new Object[] {new Short(A104EntidadCondIvaId)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Condicion Iva'.", "ForeignKeyNotFound", 1, "ENTIDADCONDIVAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadCondIvaId_Internalname ;
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

   public void gxload_8( short A98EntidadLocalidadId )
   {
      /* Using cursor T000I12 */
      pr_default.execute(10, new Object[] {new Short(A98EntidadLocalidadId)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Localidad'.", "ForeignKeyNotFound", 1, "ENTIDADLOCALIDADID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadLocalidadId_Internalname ;
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

   public void getKey0I44( )
   {
      /* Using cursor T000I23 */
      pr_default.execute(21, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound44 = (short)(1) ;
      }
      else
      {
         RcdFound44 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000I7 */
      pr_default.execute(5, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm0I44( 3) ;
         RcdFound44 = (short)(1) ;
         A81EntidadId = T000I7_A81EntidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
         A82EntidadNombre = T000I7_A82EntidadNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82EntidadNombre", A82EntidadNombre);
         A83EntidadNumeroDocumento = T000I7_A83EntidadNumeroDocumento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83EntidadNumeroDocumento", A83EntidadNumeroDocumento);
         A94EntidadTipo = T000I7_A94EntidadTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94EntidadTipo", GXutil.ltrim( GXutil.str( A94EntidadTipo, 2, 0)));
         A95EntidadActiva = T000I7_A95EntidadActiva[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95EntidadActiva", A95EntidadActiva);
         A102EntidadTipoDocumentoId = T000I7_A102EntidadTipoDocumentoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102EntidadTipoDocumentoId", GXutil.ltrim( GXutil.str( A102EntidadTipoDocumentoId, 4, 0)));
         A103EntidadCondCpraVtaId = T000I7_A103EntidadCondCpraVtaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103EntidadCondCpraVtaId", GXutil.ltrim( GXutil.str( A103EntidadCondCpraVtaId, 4, 0)));
         A99EntidadPaisId = T000I7_A99EntidadPaisId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99EntidadPaisId", GXutil.ltrim( GXutil.str( A99EntidadPaisId, 4, 0)));
         A104EntidadCondIvaId = T000I7_A104EntidadCondIvaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104EntidadCondIvaId", GXutil.ltrim( GXutil.str( A104EntidadCondIvaId, 4, 0)));
         A98EntidadLocalidadId = T000I7_A98EntidadLocalidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98EntidadLocalidadId", GXutil.ltrim( GXutil.str( A98EntidadLocalidadId, 4, 0)));
         A100EntidadProvinciaId = T000I7_A100EntidadProvinciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100EntidadProvinciaId", GXutil.ltrim( GXutil.str( A100EntidadProvinciaId, 4, 0)));
         A42EmpresaId = T000I7_A42EmpresaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         Z42EmpresaId = A42EmpresaId ;
         Z81EntidadId = A81EntidadId ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0I44( ) ;
         if ( AnyError == 1 )
         {
            RcdFound44 = (short)(0) ;
            initializeNonKey0I44( ) ;
         }
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound44 = (short)(0) ;
         initializeNonKey0I44( ) ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey0I44( ) ;
      if ( RcdFound44 == 0 )
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
      RcdFound44 = (short)(0) ;
      /* Using cursor T000I24 */
      pr_default.execute(22, new Object[] {new Integer(A81EntidadId), new Integer(A81EntidadId), new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( T000I24_A81EntidadId[0] < A81EntidadId ) || ( T000I24_A81EntidadId[0] == A81EntidadId ) && ( T000I24_A42EmpresaId[0] < A42EmpresaId ) ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( T000I24_A81EntidadId[0] > A81EntidadId ) || ( T000I24_A81EntidadId[0] == A81EntidadId ) && ( T000I24_A42EmpresaId[0] > A42EmpresaId ) ) )
         {
            A81EntidadId = T000I24_A81EntidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
            A42EmpresaId = T000I24_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            RcdFound44 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void move_previous( )
   {
      RcdFound44 = (short)(0) ;
      /* Using cursor T000I25 */
      pr_default.execute(23, new Object[] {new Integer(A81EntidadId), new Integer(A81EntidadId), new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         while ( (pr_default.getStatus(23) != 101) && ( ( T000I25_A81EntidadId[0] > A81EntidadId ) || ( T000I25_A81EntidadId[0] == A81EntidadId ) && ( T000I25_A42EmpresaId[0] > A42EmpresaId ) ) )
         {
            pr_default.readNext(23);
         }
         if ( (pr_default.getStatus(23) != 101) && ( ( T000I25_A81EntidadId[0] < A81EntidadId ) || ( T000I25_A81EntidadId[0] == A81EntidadId ) && ( T000I25_A42EmpresaId[0] < A42EmpresaId ) ) )
         {
            A81EntidadId = T000I25_A81EntidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
            A42EmpresaId = T000I25_A42EmpresaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
            RcdFound44 = (short)(1) ;
         }
      }
      pr_default.close(23);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0I44( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0I44( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound44 == 1 )
         {
            if ( ( A42EmpresaId != Z42EmpresaId ) || ( A81EntidadId != Z81EntidadId ) )
            {
               A42EmpresaId = Z42EmpresaId ;
               httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
               A81EntidadId = Z81EntidadId ;
               httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
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
               update0I44( ) ;
               GX_FocusControl = edtEmpresaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A42EmpresaId != Z42EmpresaId ) || ( A81EntidadId != Z81EntidadId ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmpresaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0I44( ) ;
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
                  insert0I44( ) ;
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
      if ( ( A42EmpresaId != Z42EmpresaId ) || ( A81EntidadId != Z81EntidadId ) )
      {
         A42EmpresaId = Z42EmpresaId ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         A81EntidadId = Z81EntidadId ;
         httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
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
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEntidadNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0I44( ) ;
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntidadNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0I44( ) ;
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
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntidadNombre_Internalname ;
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
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntidadNombre_Internalname ;
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
      scanStart0I44( ) ;
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound44 != 0 )
         {
            scanNext0I44( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntidadNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0I44( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0I44( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000I6 */
         pr_default.execute(4, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Entidad"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z82EntidadNombre, T000I6_A82EntidadNombre[0]) != 0 ) || ( GXutil.strcmp(Z83EntidadNumeroDocumento, T000I6_A83EntidadNumeroDocumento[0]) != 0 ) || ( Z94EntidadTipo != T000I6_A94EntidadTipo[0] ) || ( Z95EntidadActiva != T000I6_A95EntidadActiva[0] ) || ( Z102EntidadTipoDocumentoId != T000I6_A102EntidadTipoDocumentoId[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z103EntidadCondCpraVtaId != T000I6_A103EntidadCondCpraVtaId[0] ) || ( Z99EntidadPaisId != T000I6_A99EntidadPaisId[0] ) || ( Z104EntidadCondIvaId != T000I6_A104EntidadCondIvaId[0] ) || ( Z98EntidadLocalidadId != T000I6_A98EntidadLocalidadId[0] ) || ( Z100EntidadProvinciaId != T000I6_A100EntidadProvinciaId[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Entidad"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0I44( )
   {
      beforeValidate0I44( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I44( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0I44( 0) ;
         checkOptimisticConcurrency0I44( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I44( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0I44( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I26 */
                  pr_default.execute(24, new Object[] {new Integer(A81EntidadId), A82EntidadNombre, A83EntidadNumeroDocumento, new Byte(A94EntidadTipo), new Boolean(A95EntidadActiva), new Short(A102EntidadTipoDocumentoId), new Short(A103EntidadCondCpraVtaId), new Short(A99EntidadPaisId), new Short(A104EntidadCondIvaId), new Short(A98EntidadLocalidadId), new Short(A100EntidadProvinciaId), new Integer(A42EmpresaId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Entidad") ;
                  if ( (pr_default.getStatus(24) == 1) )
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
                        processLevel0I44( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption0I0( ) ;
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
            load0I44( ) ;
         }
         endLevel0I44( ) ;
      }
      closeExtendedTableCursors0I44( ) ;
   }

   public void update0I44( )
   {
      beforeValidate0I44( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I44( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I44( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I44( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0I44( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I27 */
                  pr_default.execute(25, new Object[] {A82EntidadNombre, A83EntidadNumeroDocumento, new Byte(A94EntidadTipo), new Boolean(A95EntidadActiva), new Short(A102EntidadTipoDocumentoId), new Short(A103EntidadCondCpraVtaId), new Short(A99EntidadPaisId), new Short(A104EntidadCondIvaId), new Short(A98EntidadLocalidadId), new Short(A100EntidadProvinciaId), new Integer(A42EmpresaId), new Integer(A81EntidadId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Entidad") ;
                  if ( (pr_default.getStatus(25) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Entidad"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0I44( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0I44( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                           resetCaption0I0( ) ;
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
         endLevel0I44( ) ;
      }
      closeExtendedTableCursors0I44( ) ;
   }

   public void deferredUpdate0I44( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0I44( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I44( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0I44( ) ;
         afterConfirm0I44( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0I44( ) ;
            if ( AnyError == 0 )
            {
               scanStart0I46( ) ;
               while ( RcdFound46 != 0 )
               {
                  getByPrimaryKey0I46( ) ;
                  delete0I46( ) ;
                  scanNext0I46( ) ;
               }
               scanEnd0I46( ) ;
               scanStart0I45( ) ;
               while ( RcdFound45 != 0 )
               {
                  getByPrimaryKey0I45( ) ;
                  delete0I45( ) ;
                  scanNext0I45( ) ;
               }
               scanEnd0I45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I28 */
                  pr_default.execute(26, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Entidad") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound44 == 0 )
                        {
                           initAll0I44( ) ;
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
                        resetCaption0I0( ) ;
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
      sMode44 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0I44( ) ;
      Gx_mode = sMode44 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0I44( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000I29 */
         pr_default.execute(27, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Comprobante"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevel0I45( )
   {
      nGXsfl_54_idx = (short)(0) ;
      while ( nGXsfl_54_idx < nRC_GXsfl_54 )
      {
         readRow0I45( ) ;
         if ( ( nRcdExists_45 != 0 ) || ( nIsMod_45 != 0 ) )
         {
            standaloneNotModal0I45( ) ;
            getKey0I45( ) ;
            if ( ( nRcdExists_45 == 0 ) && ( nRcdDeleted_45 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0I45( ) ;
            }
            else
            {
               if ( RcdFound45 != 0 )
               {
                  if ( ( nRcdDeleted_45 != 0 ) && ( nRcdExists_45 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0I45( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_45 != 0 ) && ( nRcdExists_45 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0I45( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_45 == 0 )
                  {
                     GXCCtl = "ENTIDADTELEFONOID_" + sGXsfl_54_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEntidadTelefonoId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtEntidadTelefonoId_Internalname, GXutil.ltrim( localUtil.ntoc( A91EntidadTelefonoId, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtEntidadTelefono_Internalname, GXutil.rtrim( A92EntidadTelefono)) ;
         httpContext.changePostValue( edtEntidadTelefonoObs_Internalname, A93EntidadTelefonoObs) ;
         httpContext.changePostValue( "ZT_"+"Z91EntidadTelefonoId_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( Z91EntidadTelefonoId, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z92EntidadTelefono_"+sGXsfl_54_idx, GXutil.rtrim( Z92EntidadTelefono)) ;
         httpContext.changePostValue( "ZT_"+"Z93EntidadTelefonoObs_"+sGXsfl_54_idx, Z93EntidadTelefonoObs) ;
         httpContext.changePostValue( "nRcdDeleted_45_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_45, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_45_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_45, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_45_"+sGXsfl_54_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_45, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_45 != 0 )
         {
            httpContext.changePostValue( "ENTIDADTELEFONOID_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefonoId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADTELEFONO_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefono_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADTELEFONOOBS_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefonoObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0I45( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_45 = (short)(0) ;
      nIsMod_45 = (short)(0) ;
      nRcdDeleted_45 = (short)(0) ;
   }

   public void processNestedLevel0I46( )
   {
      nGXsfl_66_idx = (short)(0) ;
      while ( nGXsfl_66_idx < nRC_GXsfl_66 )
      {
         readRow0I46( ) ;
         if ( ( nRcdExists_46 != 0 ) || ( nIsMod_46 != 0 ) )
         {
            standaloneNotModal0I46( ) ;
            getKey0I46( ) ;
            if ( ( nRcdExists_46 == 0 ) && ( nRcdDeleted_46 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0I46( ) ;
            }
            else
            {
               if ( RcdFound46 != 0 )
               {
                  if ( ( nRcdDeleted_46 != 0 ) && ( nRcdExists_46 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0I46( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_46 != 0 ) && ( nRcdExists_46 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0I46( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_46 == 0 )
                  {
                     GXCCtl = "ENTIDADDOMICILIOID_" + sGXsfl_66_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEntidadDomicilioId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtEntidadDomicilioId_Internalname, GXutil.ltrim( localUtil.ntoc( A84EntidadDomicilioId, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtEntidadDomicilioCalle_Internalname, A85EntidadDomicilioCalle) ;
         httpContext.changePostValue( edtEntidadDomicilioNumero_Internalname, GXutil.ltrim( localUtil.ntoc( A86EntidadDomicilioNumero, (byte)(6), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtEntidadDomicilioPiso_Internalname, GXutil.ltrim( localUtil.ntoc( A87EntidadDomicilioPiso, (byte)(3), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtEntidadDomicilioDepto_Internalname, A88EntidadDomicilioDepto) ;
         httpContext.changePostValue( edtEntidadDomicilioCPostal_Internalname, A89EntidadDomicilioCPostal) ;
         httpContext.changePostValue( edtEntidadDomicilioCompleto_Internalname, A90EntidadDomicilioCompleto) ;
         httpContext.changePostValue( "ZT_"+"Z84EntidadDomicilioId_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( Z84EntidadDomicilioId, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z85EntidadDomicilioCalle_"+sGXsfl_66_idx, Z85EntidadDomicilioCalle) ;
         httpContext.changePostValue( "ZT_"+"Z86EntidadDomicilioNumero_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( Z86EntidadDomicilioNumero, (byte)(6), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z87EntidadDomicilioPiso_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( Z87EntidadDomicilioPiso, (byte)(3), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z88EntidadDomicilioDepto_"+sGXsfl_66_idx, Z88EntidadDomicilioDepto) ;
         httpContext.changePostValue( "ZT_"+"Z89EntidadDomicilioCPostal_"+sGXsfl_66_idx, Z89EntidadDomicilioCPostal) ;
         httpContext.changePostValue( "nRcdDeleted_46_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_46, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_46_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_46, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_46_"+sGXsfl_66_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_46, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_46 != 0 )
         {
            httpContext.changePostValue( "ENTIDADDOMICILIOID_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIOCALLE_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCalle_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIONUMERO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioNumero_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIOPISO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioPiso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIODEPTO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioDepto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIOCPOSTAL_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCPostal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTIDADDOMICILIOCOMPLETO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCompleto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0I46( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_46 = (short)(0) ;
      nIsMod_46 = (short)(0) ;
      nRcdDeleted_46 = (short)(0) ;
   }

   public void processLevel0I44( )
   {
      /* Save parent mode. */
      sMode44 = Gx_mode ;
      processNestedLevel0I45( ) ;
      processNestedLevel0I46( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode44 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel0I44( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0I44( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "entidad");
         if ( AnyError == 0 )
         {
            confirmValues0I0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "entidad");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0I44( )
   {
      /* Using cursor T000I30 */
      pr_default.execute(28);
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A42EmpresaId = T000I30_A42EmpresaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         A81EntidadId = T000I30_A81EntidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0I44( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A42EmpresaId = T000I30_A42EmpresaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
         A81EntidadId = T000I30_A81EntidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
      }
   }

   public void scanEnd0I44( )
   {
      pr_default.close(28);
   }

   public void afterConfirm0I44( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0I44( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0I44( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0I44( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0I44( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0I44( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0I44( )
   {
      edtEmpresaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresaId_Enabled, 5, 0)));
      edtEntidadId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadId_Enabled, 5, 0)));
      edtEntidadNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadNombre_Enabled, 5, 0)));
      edtEntidadNumeroDocumento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadNumeroDocumento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadNumeroDocumento_Enabled, 5, 0)));
      edtEntidadTipoDocumentoId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadTipoDocumentoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTipoDocumentoId_Enabled, 5, 0)));
      edtEntidadCondCpraVtaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadCondCpraVtaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadCondCpraVtaId_Enabled, 5, 0)));
      edtEntidadPaisId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadPaisId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadPaisId_Enabled, 5, 0)));
      edtEntidadProvinciaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadProvinciaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadProvinciaId_Enabled, 5, 0)));
      edtEntidadCondIvaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadCondIvaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadCondIvaId_Enabled, 5, 0)));
      edtEntidadLocalidadId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadLocalidadId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadLocalidadId_Enabled, 5, 0)));
      cmbEntidadTipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbEntidadTipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbEntidadTipo.getEnabled(), 5, 0)));
      chkEntidadActiva.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkEntidadActiva.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( chkEntidadActiva.getEnabled(), 5, 0)));
   }

   public void zm0I45( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z92EntidadTelefono = T000I5_A92EntidadTelefono[0] ;
            Z93EntidadTelefonoObs = T000I5_A93EntidadTelefonoObs[0] ;
         }
         else
         {
            Z92EntidadTelefono = A92EntidadTelefono ;
            Z93EntidadTelefonoObs = A93EntidadTelefonoObs ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z42EmpresaId = A42EmpresaId ;
         Z81EntidadId = A81EntidadId ;
         Z91EntidadTelefonoId = A91EntidadTelefonoId ;
         Z92EntidadTelefono = A92EntidadTelefono ;
         Z93EntidadTelefonoObs = A93EntidadTelefonoObs ;
      }
   }

   public void standaloneNotModal0I45( )
   {
   }

   public void standaloneModal0I45( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEntidadTelefonoId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntidadTelefonoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTelefonoId_Enabled, 5, 0)));
      }
      else
      {
         edtEntidadTelefonoId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntidadTelefonoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTelefonoId_Enabled, 5, 0)));
      }
   }

   public void load0I45( )
   {
      /* Using cursor T000I31 */
      pr_default.execute(29, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A91EntidadTelefonoId)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A92EntidadTelefono = T000I31_A92EntidadTelefono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefono_Internalname, A92EntidadTelefono);
         A93EntidadTelefonoObs = T000I31_A93EntidadTelefonoObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefonoObs_Internalname, A93EntidadTelefonoObs);
         zm0I45( -15) ;
      }
      pr_default.close(29);
      onLoadActions0I45( ) ;
   }

   public void onLoadActions0I45( )
   {
   }

   public void checkExtendedTable0I45( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0I45( ) ;
   }

   public void closeExtendedTableCursors0I45( )
   {
   }

   public void enableDisable0I45( )
   {
   }

   public void getKey0I45( )
   {
      /* Using cursor T000I32 */
      pr_default.execute(30, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A91EntidadTelefonoId)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
      else
      {
         RcdFound45 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKey0I45( )
   {
      /* Using cursor T000I5 */
      pr_default.execute(3, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A91EntidadTelefonoId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm0I45( 15) ;
         RcdFound45 = (short)(1) ;
         initializeNonKey0I45( ) ;
         A91EntidadTelefonoId = T000I5_A91EntidadTelefonoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefonoId_Internalname, GXutil.ltrim( GXutil.str( A91EntidadTelefonoId, 4, 0)));
         A92EntidadTelefono = T000I5_A92EntidadTelefono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefono_Internalname, A92EntidadTelefono);
         A93EntidadTelefonoObs = T000I5_A93EntidadTelefonoObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefonoObs_Internalname, A93EntidadTelefonoObs);
         Z42EmpresaId = A42EmpresaId ;
         Z81EntidadId = A81EntidadId ;
         Z91EntidadTelefonoId = A91EntidadTelefonoId ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0I45( ) ;
         load0I45( ) ;
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound45 = (short)(0) ;
         initializeNonKey0I45( ) ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0I45( ) ;
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0I45( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency0I45( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000I4 */
         pr_default.execute(2, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A91EntidadTelefonoId)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"EntidadTelefono"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z92EntidadTelefono, T000I4_A92EntidadTelefono[0]) != 0 ) || ( GXutil.strcmp(Z93EntidadTelefonoObs, T000I4_A93EntidadTelefonoObs[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"EntidadTelefono"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0I45( )
   {
      beforeValidate0I45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I45( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0I45( 0) ;
         checkOptimisticConcurrency0I45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I45( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0I45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I33 */
                  pr_default.execute(31, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A91EntidadTelefonoId), A92EntidadTelefono, A93EntidadTelefonoObs});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("EntidadTelefono") ;
                  if ( (pr_default.getStatus(31) == 1) )
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
            load0I45( ) ;
         }
         endLevel0I45( ) ;
      }
      closeExtendedTableCursors0I45( ) ;
   }

   public void update0I45( )
   {
      beforeValidate0I45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I45( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I45( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0I45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I34 */
                  pr_default.execute(32, new Object[] {A92EntidadTelefono, A93EntidadTelefonoObs, new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A91EntidadTelefonoId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("EntidadTelefono") ;
                  if ( (pr_default.getStatus(32) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"EntidadTelefono"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0I45( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0I45( ) ;
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
         endLevel0I45( ) ;
      }
      closeExtendedTableCursors0I45( ) ;
   }

   public void deferredUpdate0I45( )
   {
   }

   public void delete0I45( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0I45( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I45( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0I45( ) ;
         afterConfirm0I45( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0I45( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000I35 */
               pr_default.execute(33, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A91EntidadTelefonoId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("EntidadTelefono") ;
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
      sMode45 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0I45( ) ;
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0I45( )
   {
      standaloneModal0I45( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0I45( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0I45( )
   {
      /* Scan By routine */
      /* Using cursor T000I36 */
      pr_default.execute(34, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A91EntidadTelefonoId = T000I36_A91EntidadTelefonoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefonoId_Internalname, GXutil.ltrim( GXutil.str( A91EntidadTelefonoId, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0I45( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A91EntidadTelefonoId = T000I36_A91EntidadTelefonoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefonoId_Internalname, GXutil.ltrim( GXutil.str( A91EntidadTelefonoId, 4, 0)));
      }
   }

   public void scanEnd0I45( )
   {
      pr_default.close(34);
   }

   public void afterConfirm0I45( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0I45( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0I45( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0I45( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0I45( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0I45( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0I45( )
   {
      edtEntidadTelefonoId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadTelefonoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTelefonoId_Enabled, 5, 0)));
      edtEntidadTelefono_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadTelefono_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTelefono_Enabled, 5, 0)));
      edtEntidadTelefonoObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadTelefonoObs_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTelefonoObs_Enabled, 5, 0)));
   }

   public void zm0I46( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z85EntidadDomicilioCalle = T000I3_A85EntidadDomicilioCalle[0] ;
            Z86EntidadDomicilioNumero = T000I3_A86EntidadDomicilioNumero[0] ;
            Z87EntidadDomicilioPiso = T000I3_A87EntidadDomicilioPiso[0] ;
            Z88EntidadDomicilioDepto = T000I3_A88EntidadDomicilioDepto[0] ;
            Z89EntidadDomicilioCPostal = T000I3_A89EntidadDomicilioCPostal[0] ;
         }
         else
         {
            Z85EntidadDomicilioCalle = A85EntidadDomicilioCalle ;
            Z86EntidadDomicilioNumero = A86EntidadDomicilioNumero ;
            Z87EntidadDomicilioPiso = A87EntidadDomicilioPiso ;
            Z88EntidadDomicilioDepto = A88EntidadDomicilioDepto ;
            Z89EntidadDomicilioCPostal = A89EntidadDomicilioCPostal ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z42EmpresaId = A42EmpresaId ;
         Z81EntidadId = A81EntidadId ;
         Z84EntidadDomicilioId = A84EntidadDomicilioId ;
         Z85EntidadDomicilioCalle = A85EntidadDomicilioCalle ;
         Z86EntidadDomicilioNumero = A86EntidadDomicilioNumero ;
         Z87EntidadDomicilioPiso = A87EntidadDomicilioPiso ;
         Z88EntidadDomicilioDepto = A88EntidadDomicilioDepto ;
         Z89EntidadDomicilioCPostal = A89EntidadDomicilioCPostal ;
      }
   }

   public void standaloneNotModal0I46( )
   {
   }

   public void standaloneModal0I46( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEntidadDomicilioId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioId_Enabled, 5, 0)));
      }
      else
      {
         edtEntidadDomicilioId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioId_Enabled, 5, 0)));
      }
   }

   public void load0I46( )
   {
      /* Using cursor T000I37 */
      pr_default.execute(35, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A84EntidadDomicilioId)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound46 = (short)(1) ;
         A85EntidadDomicilioCalle = T000I37_A85EntidadDomicilioCalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCalle_Internalname, A85EntidadDomicilioCalle);
         A86EntidadDomicilioNumero = T000I37_A86EntidadDomicilioNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioNumero_Internalname, GXutil.ltrim( GXutil.str( A86EntidadDomicilioNumero, 6, 0)));
         A87EntidadDomicilioPiso = T000I37_A87EntidadDomicilioPiso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioPiso_Internalname, GXutil.ltrim( GXutil.str( A87EntidadDomicilioPiso, 3, 0)));
         A88EntidadDomicilioDepto = T000I37_A88EntidadDomicilioDepto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioDepto_Internalname, A88EntidadDomicilioDepto);
         A89EntidadDomicilioCPostal = T000I37_A89EntidadDomicilioCPostal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCPostal_Internalname, A89EntidadDomicilioCPostal);
         zm0I46( -16) ;
      }
      pr_default.close(35);
      onLoadActions0I46( ) ;
   }

   public void onLoadActions0I46( )
   {
      A90EntidadDomicilioCompleto = A85EntidadDomicilioCalle + " " ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCompleto_Internalname, A90EntidadDomicilioCompleto);
   }

   public void checkExtendedTable0I46( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0I46( ) ;
      A90EntidadDomicilioCompleto = A85EntidadDomicilioCalle + " " ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCompleto_Internalname, A90EntidadDomicilioCompleto);
   }

   public void closeExtendedTableCursors0I46( )
   {
   }

   public void enableDisable0I46( )
   {
   }

   public void getKey0I46( )
   {
      /* Using cursor T000I38 */
      pr_default.execute(36, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A84EntidadDomicilioId)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound46 = (short)(1) ;
      }
      else
      {
         RcdFound46 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKey0I46( )
   {
      /* Using cursor T000I3 */
      pr_default.execute(1, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A84EntidadDomicilioId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0I46( 16) ;
         RcdFound46 = (short)(1) ;
         initializeNonKey0I46( ) ;
         A84EntidadDomicilioId = T000I3_A84EntidadDomicilioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioId_Internalname, GXutil.ltrim( GXutil.str( A84EntidadDomicilioId, 4, 0)));
         A85EntidadDomicilioCalle = T000I3_A85EntidadDomicilioCalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCalle_Internalname, A85EntidadDomicilioCalle);
         A86EntidadDomicilioNumero = T000I3_A86EntidadDomicilioNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioNumero_Internalname, GXutil.ltrim( GXutil.str( A86EntidadDomicilioNumero, 6, 0)));
         A87EntidadDomicilioPiso = T000I3_A87EntidadDomicilioPiso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioPiso_Internalname, GXutil.ltrim( GXutil.str( A87EntidadDomicilioPiso, 3, 0)));
         A88EntidadDomicilioDepto = T000I3_A88EntidadDomicilioDepto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioDepto_Internalname, A88EntidadDomicilioDepto);
         A89EntidadDomicilioCPostal = T000I3_A89EntidadDomicilioCPostal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCPostal_Internalname, A89EntidadDomicilioCPostal);
         Z42EmpresaId = A42EmpresaId ;
         Z81EntidadId = A81EntidadId ;
         Z84EntidadDomicilioId = A84EntidadDomicilioId ;
         sMode46 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0I46( ) ;
         load0I46( ) ;
         Gx_mode = sMode46 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound46 = (short)(0) ;
         initializeNonKey0I46( ) ;
         sMode46 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0I46( ) ;
         Gx_mode = sMode46 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0I46( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0I46( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000I2 */
         pr_default.execute(0, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A84EntidadDomicilioId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"EntidadDomicilio"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z85EntidadDomicilioCalle, T000I2_A85EntidadDomicilioCalle[0]) != 0 ) || ( Z86EntidadDomicilioNumero != T000I2_A86EntidadDomicilioNumero[0] ) || ( Z87EntidadDomicilioPiso != T000I2_A87EntidadDomicilioPiso[0] ) || ( GXutil.strcmp(Z88EntidadDomicilioDepto, T000I2_A88EntidadDomicilioDepto[0]) != 0 ) || ( GXutil.strcmp(Z89EntidadDomicilioCPostal, T000I2_A89EntidadDomicilioCPostal[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"EntidadDomicilio"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0I46( )
   {
      beforeValidate0I46( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I46( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0I46( 0) ;
         checkOptimisticConcurrency0I46( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I46( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0I46( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I39 */
                  pr_default.execute(37, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A84EntidadDomicilioId), A85EntidadDomicilioCalle, new Integer(A86EntidadDomicilioNumero), new Short(A87EntidadDomicilioPiso), A88EntidadDomicilioDepto, A89EntidadDomicilioCPostal});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("EntidadDomicilio") ;
                  if ( (pr_default.getStatus(37) == 1) )
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
            load0I46( ) ;
         }
         endLevel0I46( ) ;
      }
      closeExtendedTableCursors0I46( ) ;
   }

   public void update0I46( )
   {
      beforeValidate0I46( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I46( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I46( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I46( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0I46( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I40 */
                  pr_default.execute(38, new Object[] {A85EntidadDomicilioCalle, new Integer(A86EntidadDomicilioNumero), new Short(A87EntidadDomicilioPiso), A88EntidadDomicilioDepto, A89EntidadDomicilioCPostal, new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A84EntidadDomicilioId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("EntidadDomicilio") ;
                  if ( (pr_default.getStatus(38) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"EntidadDomicilio"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0I46( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0I46( ) ;
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
         endLevel0I46( ) ;
      }
      closeExtendedTableCursors0I46( ) ;
   }

   public void deferredUpdate0I46( )
   {
   }

   public void delete0I46( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0I46( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I46( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0I46( ) ;
         afterConfirm0I46( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0I46( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000I41 */
               pr_default.execute(39, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId), new Short(A84EntidadDomicilioId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("EntidadDomicilio") ;
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
      sMode46 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0I46( ) ;
      Gx_mode = sMode46 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0I46( )
   {
      standaloneModal0I46( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A90EntidadDomicilioCompleto = A85EntidadDomicilioCalle + " " ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCompleto_Internalname, A90EntidadDomicilioCompleto);
      }
   }

   public void endLevel0I46( )
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

   public void scanStart0I46( )
   {
      /* Scan By routine */
      /* Using cursor T000I42 */
      pr_default.execute(40, new Object[] {new Integer(A42EmpresaId), new Integer(A81EntidadId)});
      RcdFound46 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound46 = (short)(1) ;
         A84EntidadDomicilioId = T000I42_A84EntidadDomicilioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioId_Internalname, GXutil.ltrim( GXutil.str( A84EntidadDomicilioId, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0I46( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound46 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound46 = (short)(1) ;
         A84EntidadDomicilioId = T000I42_A84EntidadDomicilioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioId_Internalname, GXutil.ltrim( GXutil.str( A84EntidadDomicilioId, 4, 0)));
      }
   }

   public void scanEnd0I46( )
   {
      pr_default.close(40);
   }

   public void afterConfirm0I46( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0I46( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0I46( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0I46( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0I46( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0I46( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0I46( )
   {
      edtEntidadDomicilioId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioId_Enabled, 5, 0)));
      edtEntidadDomicilioCalle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioCalle_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioCalle_Enabled, 5, 0)));
      edtEntidadDomicilioNumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioNumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioNumero_Enabled, 5, 0)));
      edtEntidadDomicilioPiso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioPiso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioPiso_Enabled, 5, 0)));
      edtEntidadDomicilioDepto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioDepto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioDepto_Enabled, 5, 0)));
      edtEntidadDomicilioCPostal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioCPostal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioCPostal_Enabled, 5, 0)));
      edtEntidadDomicilioCompleto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioCompleto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioCompleto_Enabled, 5, 0)));
   }

   public void subsflControlProps_5445( )
   {
      edtEntidadTelefonoId_Internalname = "ENTIDADTELEFONOID_"+sGXsfl_54_idx ;
      edtEntidadTelefono_Internalname = "ENTIDADTELEFONO_"+sGXsfl_54_idx ;
      edtEntidadTelefonoObs_Internalname = "ENTIDADTELEFONOOBS_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_5445( )
   {
      edtEntidadTelefonoId_Internalname = "ENTIDADTELEFONOID_"+sGXsfl_54_fel_idx ;
      edtEntidadTelefono_Internalname = "ENTIDADTELEFONO_"+sGXsfl_54_fel_idx ;
      edtEntidadTelefonoObs_Internalname = "ENTIDADTELEFONOOBS_"+sGXsfl_54_fel_idx ;
   }

   public void addRow0I45( )
   {
      nGXsfl_54_idx = (short)(nGXsfl_54_idx+1) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5445( ) ;
      sendRow0I45( ) ;
   }

   public void sendRow0I45( )
   {
      Gridentidad_telefonoRow = GXWebRow.GetNew(context) ;
      if ( subGridentidad_telefono_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridentidad_telefono_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridentidad_telefono_Class, "") != 0 )
         {
            subGridentidad_telefono_Linesclass = subGridentidad_telefono_Class+"Odd" ;
         }
      }
      else if ( subGridentidad_telefono_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridentidad_telefono_Backstyle = (byte)(0) ;
         subGridentidad_telefono_Backcolor = subGridentidad_telefono_Allbackcolor ;
         if ( GXutil.strcmp(subGridentidad_telefono_Class, "") != 0 )
         {
            subGridentidad_telefono_Linesclass = subGridentidad_telefono_Class+"Uniform" ;
         }
      }
      else if ( subGridentidad_telefono_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridentidad_telefono_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridentidad_telefono_Class, "") != 0 )
         {
            subGridentidad_telefono_Linesclass = subGridentidad_telefono_Class+"Odd" ;
         }
         subGridentidad_telefono_Backcolor = (int)(0x0) ;
      }
      else if ( subGridentidad_telefono_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridentidad_telefono_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
         {
            subGridentidad_telefono_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridentidad_telefono_Class, "") != 0 )
            {
               subGridentidad_telefono_Linesclass = subGridentidad_telefono_Class+"Even" ;
            }
         }
         else
         {
            subGridentidad_telefono_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridentidad_telefono_Class, "") != 0 )
            {
               subGridentidad_telefono_Linesclass = subGridentidad_telefono_Class+"Odd" ;
            }
         }
      }
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.kberp.gx0192"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"EMPRESAID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"EMPRESAID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ENTIDADID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"ENTIDADID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ENTIDADTELEFONOID_"',3),t(+,5),t(sGXsfl_54_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"ENTIDADTELEFONOID_"',3),t(+,5),t(sGXsfl_54_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_45_"',3),t(+,5),t(sGXsfl_54_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_42_81,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_45_" + sGXsfl_54_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_54_idx + "',54)\"" ;
      ROClassString = "Attribute" ;
      Gridentidad_telefonoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadTelefonoId_Internalname,GXutil.ltrim( localUtil.ntoc( A91EntidadTelefonoId, (byte)(4), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A91EntidadTelefonoId), "ZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadTelefonoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadTelefonoId_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
      /* Subfile cell */
      /* Single line edit */
      if ( httpContext.isSmartDevice( ) )
      {
         gxphoneLink = "tel:" + GXutil.rtrim( A92EntidadTelefono) ;
      }
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_45_" + sGXsfl_54_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_54_idx + "',54)\"" ;
      ROClassString = "Attribute" ;
      Gridentidad_telefonoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadTelefono_Internalname,GXutil.rtrim( A92EntidadTelefono),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'",gxphoneLink,"","","",edtEntidadTelefono_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadTelefono_Enabled),new Integer(0),"tel","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Phone","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_45_" + sGXsfl_54_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_54_idx + "',54)\"" ;
      ROClassString = "Attribute" ;
      Gridentidad_telefonoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadTelefonoObs_Internalname,A93EntidadTelefonoObs,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadTelefonoObs_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadTelefonoObs_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Observaciones","left"});
      httpContext.ajax_sending_grid_row(Gridentidad_telefonoRow);
      GXCCtl = "Z91EntidadTelefonoId_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z91EntidadTelefonoId, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "Z92EntidadTelefono_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z92EntidadTelefono));
      GXCCtl = "Z93EntidadTelefonoObs_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z93EntidadTelefonoObs);
      GXCCtl = "nRcdDeleted_45_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_45, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_45_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_45, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_45_" + sGXsfl_54_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_45, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADTELEFONOID_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefonoId_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADTELEFONO_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefono_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADTELEFONOOBS_"+sGXsfl_54_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadTelefonoObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridentidad_telefonoContainer.AddRow(Gridentidad_telefonoRow);
   }

   public void readRow0I45( )
   {
      nGXsfl_54_idx = (short)(nGXsfl_54_idx+1) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5445( ) ;
      edtEntidadTelefonoId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADTELEFONOID_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
      edtEntidadTelefono_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADTELEFONO_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
      edtEntidadTelefonoObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADTELEFONOOBS_"+sGXsfl_54_idx+"Enabled"), ",", ".")) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadTelefonoId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadTelefonoId_Internalname), ",", ".") > 9999 ) ) )
      {
         GXCCtl = "ENTIDADTELEFONOID_" + sGXsfl_54_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadTelefonoId_Internalname ;
         wbErr = true ;
         A91EntidadTelefonoId = (short)(0) ;
      }
      else
      {
         A91EntidadTelefonoId = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadTelefonoId_Internalname), ",", ".")) ;
      }
      A92EntidadTelefono = httpContext.cgiGet( edtEntidadTelefono_Internalname) ;
      A93EntidadTelefonoObs = httpContext.cgiGet( edtEntidadTelefonoObs_Internalname) ;
      GXCCtl = "Z91EntidadTelefonoId_" + sGXsfl_54_idx ;
      Z91EntidadTelefonoId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z92EntidadTelefono_" + sGXsfl_54_idx ;
      Z92EntidadTelefono = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z93EntidadTelefonoObs_" + sGXsfl_54_idx ;
      Z93EntidadTelefonoObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_45_" + sGXsfl_54_idx ;
      nRcdDeleted_45 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_45_" + sGXsfl_54_idx ;
      nRcdExists_45 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_45_" + sGXsfl_54_idx ;
      nIsMod_45 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void subsflControlProps_6646( )
   {
      edtEntidadDomicilioId_Internalname = "ENTIDADDOMICILIOID_"+sGXsfl_66_idx ;
      edtEntidadDomicilioCalle_Internalname = "ENTIDADDOMICILIOCALLE_"+sGXsfl_66_idx ;
      edtEntidadDomicilioNumero_Internalname = "ENTIDADDOMICILIONUMERO_"+sGXsfl_66_idx ;
      edtEntidadDomicilioPiso_Internalname = "ENTIDADDOMICILIOPISO_"+sGXsfl_66_idx ;
      edtEntidadDomicilioDepto_Internalname = "ENTIDADDOMICILIODEPTO_"+sGXsfl_66_idx ;
      edtEntidadDomicilioCPostal_Internalname = "ENTIDADDOMICILIOCPOSTAL_"+sGXsfl_66_idx ;
      edtEntidadDomicilioCompleto_Internalname = "ENTIDADDOMICILIOCOMPLETO_"+sGXsfl_66_idx ;
   }

   public void subsflControlProps_fel_6646( )
   {
      edtEntidadDomicilioId_Internalname = "ENTIDADDOMICILIOID_"+sGXsfl_66_fel_idx ;
      edtEntidadDomicilioCalle_Internalname = "ENTIDADDOMICILIOCALLE_"+sGXsfl_66_fel_idx ;
      edtEntidadDomicilioNumero_Internalname = "ENTIDADDOMICILIONUMERO_"+sGXsfl_66_fel_idx ;
      edtEntidadDomicilioPiso_Internalname = "ENTIDADDOMICILIOPISO_"+sGXsfl_66_fel_idx ;
      edtEntidadDomicilioDepto_Internalname = "ENTIDADDOMICILIODEPTO_"+sGXsfl_66_fel_idx ;
      edtEntidadDomicilioCPostal_Internalname = "ENTIDADDOMICILIOCPOSTAL_"+sGXsfl_66_fel_idx ;
      edtEntidadDomicilioCompleto_Internalname = "ENTIDADDOMICILIOCOMPLETO_"+sGXsfl_66_fel_idx ;
   }

   public void addRow0I46( )
   {
      nGXsfl_66_idx = (short)(nGXsfl_66_idx+1) ;
      sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_6646( ) ;
      sendRow0I46( ) ;
   }

   public void sendRow0I46( )
   {
      Gridentidad_domicilioRow = GXWebRow.GetNew(context) ;
      if ( subGridentidad_domicilio_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridentidad_domicilio_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridentidad_domicilio_Class, "") != 0 )
         {
            subGridentidad_domicilio_Linesclass = subGridentidad_domicilio_Class+"Odd" ;
         }
      }
      else if ( subGridentidad_domicilio_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridentidad_domicilio_Backstyle = (byte)(0) ;
         subGridentidad_domicilio_Backcolor = subGridentidad_domicilio_Allbackcolor ;
         if ( GXutil.strcmp(subGridentidad_domicilio_Class, "") != 0 )
         {
            subGridentidad_domicilio_Linesclass = subGridentidad_domicilio_Class+"Uniform" ;
         }
      }
      else if ( subGridentidad_domicilio_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridentidad_domicilio_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridentidad_domicilio_Class, "") != 0 )
         {
            subGridentidad_domicilio_Linesclass = subGridentidad_domicilio_Class+"Odd" ;
         }
         subGridentidad_domicilio_Backcolor = (int)(0x0) ;
      }
      else if ( subGridentidad_domicilio_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridentidad_domicilio_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_66_idx) % (2))) == 0 )
         {
            subGridentidad_domicilio_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridentidad_domicilio_Class, "") != 0 )
            {
               subGridentidad_domicilio_Linesclass = subGridentidad_domicilio_Class+"Even" ;
            }
         }
         else
         {
            subGridentidad_domicilio_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridentidad_domicilio_Class, "") != 0 )
            {
               subGridentidad_domicilio_Linesclass = subGridentidad_domicilio_Class+"Odd" ;
            }
         }
      }
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.kberp.gx01a2"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"EMPRESAID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"EMPRESAID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ENTIDADID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"ENTIDADID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ENTIDADDOMICILIOID_"',3),t(+,5),t(sGXsfl_66_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"ENTIDADDOMICILIOID_"',3),t(+,5),t(sGXsfl_66_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_46_"',3),t(+,5),t(sGXsfl_66_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_42_81,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_46_" + sGXsfl_66_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_66_idx + "',66)\"" ;
      ROClassString = "Attribute" ;
      Gridentidad_domicilioRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioId_Internalname,GXutil.ltrim( localUtil.ntoc( A84EntidadDomicilioId, (byte)(4), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A84EntidadDomicilioId), "ZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadDomicilioId_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(66),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdTablasGenerales","right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_46_" + sGXsfl_66_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_66_idx + "',66)\"" ;
      ROClassString = "Attribute" ;
      Gridentidad_domicilioRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioCalle_Internalname,A85EntidadDomicilioCalle,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioCalle_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadDomicilioCalle_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(150),new Integer(0),new Integer(0),new Integer(66),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"DomicilioCalle","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_46_" + sGXsfl_66_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_66_idx + "',66)\"" ;
      ROClassString = "Attribute" ;
      Gridentidad_domicilioRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioNumero_Internalname,GXutil.ltrim( localUtil.ntoc( A86EntidadDomicilioNumero, (byte)(6), (byte)(0), ",", "")),((edtEntidadDomicilioNumero_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A86EntidadDomicilioNumero), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A86EntidadDomicilioNumero), "ZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioNumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadDomicilioNumero_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(66),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"DomicilioNumero","right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_46_" + sGXsfl_66_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_66_idx + "',66)\"" ;
      ROClassString = "Attribute" ;
      Gridentidad_domicilioRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioPiso_Internalname,GXutil.ltrim( localUtil.ntoc( A87EntidadDomicilioPiso, (byte)(3), (byte)(0), ",", "")),((edtEntidadDomicilioPiso_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A87EntidadDomicilioPiso), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A87EntidadDomicilioPiso), "ZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioPiso_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadDomicilioPiso_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(66),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"DomicilioPiso","right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_46_" + sGXsfl_66_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_66_idx + "',66)\"" ;
      ROClassString = "Attribute" ;
      Gridentidad_domicilioRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioDepto_Internalname,A88EntidadDomicilioDepto,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioDepto_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadDomicilioDepto_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(66),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"DomicilioDepto","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_46_" + sGXsfl_66_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_66_idx + "',66)\"" ;
      ROClassString = "Attribute" ;
      Gridentidad_domicilioRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioCPostal_Internalname,A89EntidadDomicilioCPostal,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioCPostal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadDomicilioCPostal_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(66),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"DomicilioCPostal","left"});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentidad_domicilioRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntidadDomicilioCompleto_Internalname,A90EntidadDomicilioCompleto,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntidadDomicilioCompleto_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtEntidadDomicilioCompleto_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(500),new Integer(0),new Integer(0),new Integer(66),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Domicilio","left"});
      httpContext.ajax_sending_grid_row(Gridentidad_domicilioRow);
      GXCCtl = "Z84EntidadDomicilioId_" + sGXsfl_66_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z84EntidadDomicilioId, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "Z85EntidadDomicilioCalle_" + sGXsfl_66_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z85EntidadDomicilioCalle);
      GXCCtl = "Z86EntidadDomicilioNumero_" + sGXsfl_66_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z86EntidadDomicilioNumero, (byte)(6), (byte)(0), ",", "")));
      GXCCtl = "Z87EntidadDomicilioPiso_" + sGXsfl_66_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z87EntidadDomicilioPiso, (byte)(3), (byte)(0), ",", "")));
      GXCCtl = "Z88EntidadDomicilioDepto_" + sGXsfl_66_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z88EntidadDomicilioDepto);
      GXCCtl = "Z89EntidadDomicilioCPostal_" + sGXsfl_66_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z89EntidadDomicilioCPostal);
      GXCCtl = "nRcdDeleted_46_" + sGXsfl_66_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_46, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_46_" + sGXsfl_66_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_46, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_46_" + sGXsfl_66_idx ;
      com.kberp.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_46, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIOID_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioId_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIOCALLE_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCalle_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIONUMERO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioNumero_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIOPISO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioPiso_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIODEPTO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioDepto_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIOCPOSTAL_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCPostal_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "ENTIDADDOMICILIOCOMPLETO_"+sGXsfl_66_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntidadDomicilioCompleto_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridentidad_domicilioContainer.AddRow(Gridentidad_domicilioRow);
   }

   public void readRow0I46( )
   {
      nGXsfl_66_idx = (short)(nGXsfl_66_idx+1) ;
      sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_6646( ) ;
      edtEntidadDomicilioId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOID_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
      edtEntidadDomicilioCalle_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOCALLE_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
      edtEntidadDomicilioNumero_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIONUMERO_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
      edtEntidadDomicilioPiso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOPISO_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
      edtEntidadDomicilioDepto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIODEPTO_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
      edtEntidadDomicilioCPostal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOCPOSTAL_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
      edtEntidadDomicilioCompleto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTIDADDOMICILIOCOMPLETO_"+sGXsfl_66_idx+"Enabled"), ",", ".")) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioId_Internalname), ",", ".") > 9999 ) ) )
      {
         GXCCtl = "ENTIDADDOMICILIOID_" + sGXsfl_66_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadDomicilioId_Internalname ;
         wbErr = true ;
         A84EntidadDomicilioId = (short)(0) ;
      }
      else
      {
         A84EntidadDomicilioId = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioId_Internalname), ",", ".")) ;
      }
      A85EntidadDomicilioCalle = httpContext.cgiGet( edtEntidadDomicilioCalle_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioNumero_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioNumero_Internalname), ",", ".") > 999999 ) ) )
      {
         GXCCtl = "ENTIDADDOMICILIONUMERO_" + sGXsfl_66_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadDomicilioNumero_Internalname ;
         wbErr = true ;
         A86EntidadDomicilioNumero = 0 ;
      }
      else
      {
         A86EntidadDomicilioNumero = (int)(localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioNumero_Internalname), ",", ".")) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioPiso_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioPiso_Internalname), ",", ".") > 999 ) ) )
      {
         GXCCtl = "ENTIDADDOMICILIOPISO_" + sGXsfl_66_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadDomicilioPiso_Internalname ;
         wbErr = true ;
         A87EntidadDomicilioPiso = (short)(0) ;
      }
      else
      {
         A87EntidadDomicilioPiso = (short)(localUtil.ctol( httpContext.cgiGet( edtEntidadDomicilioPiso_Internalname), ",", ".")) ;
      }
      A88EntidadDomicilioDepto = httpContext.cgiGet( edtEntidadDomicilioDepto_Internalname) ;
      A89EntidadDomicilioCPostal = httpContext.cgiGet( edtEntidadDomicilioCPostal_Internalname) ;
      A90EntidadDomicilioCompleto = httpContext.cgiGet( edtEntidadDomicilioCompleto_Internalname) ;
      GXCCtl = "Z84EntidadDomicilioId_" + sGXsfl_66_idx ;
      Z84EntidadDomicilioId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z85EntidadDomicilioCalle_" + sGXsfl_66_idx ;
      Z85EntidadDomicilioCalle = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z86EntidadDomicilioNumero_" + sGXsfl_66_idx ;
      Z86EntidadDomicilioNumero = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z87EntidadDomicilioPiso_" + sGXsfl_66_idx ;
      Z87EntidadDomicilioPiso = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z88EntidadDomicilioDepto_" + sGXsfl_66_idx ;
      Z88EntidadDomicilioDepto = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z89EntidadDomicilioCPostal_" + sGXsfl_66_idx ;
      Z89EntidadDomicilioCPostal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_46_" + sGXsfl_66_idx ;
      nRcdDeleted_46 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_46_" + sGXsfl_66_idx ;
      nRcdExists_46 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_46_" + sGXsfl_66_idx ;
      nIsMod_46 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtEntidadDomicilioId_Enabled = edtEntidadDomicilioId_Enabled ;
      defedtEntidadTelefonoId_Enabled = edtEntidadTelefonoId_Enabled ;
   }

   public void confirmValues0I0( )
   {
      nGXsfl_54_idx = (short)(0) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5445( ) ;
      while ( nGXsfl_54_idx < nRC_GXsfl_54 )
      {
         nGXsfl_54_idx = (short)(nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_5445( ) ;
         httpContext.changePostValue( "Z91EntidadTelefonoId_"+sGXsfl_54_idx, httpContext.cgiGet( "ZT_"+"Z91EntidadTelefonoId_"+sGXsfl_54_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z91EntidadTelefonoId_"+sGXsfl_54_idx) ;
         httpContext.changePostValue( "Z92EntidadTelefono_"+sGXsfl_54_idx, httpContext.cgiGet( "ZT_"+"Z92EntidadTelefono_"+sGXsfl_54_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z92EntidadTelefono_"+sGXsfl_54_idx) ;
         httpContext.changePostValue( "Z93EntidadTelefonoObs_"+sGXsfl_54_idx, httpContext.cgiGet( "ZT_"+"Z93EntidadTelefonoObs_"+sGXsfl_54_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z93EntidadTelefonoObs_"+sGXsfl_54_idx) ;
      }
      nGXsfl_66_idx = (short)(0) ;
      sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_6646( ) ;
      while ( nGXsfl_66_idx < nRC_GXsfl_66 )
      {
         nGXsfl_66_idx = (short)(nGXsfl_66_idx+1) ;
         sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_6646( ) ;
         httpContext.changePostValue( "Z84EntidadDomicilioId_"+sGXsfl_66_idx, httpContext.cgiGet( "ZT_"+"Z84EntidadDomicilioId_"+sGXsfl_66_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z84EntidadDomicilioId_"+sGXsfl_66_idx) ;
         httpContext.changePostValue( "Z85EntidadDomicilioCalle_"+sGXsfl_66_idx, httpContext.cgiGet( "ZT_"+"Z85EntidadDomicilioCalle_"+sGXsfl_66_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z85EntidadDomicilioCalle_"+sGXsfl_66_idx) ;
         httpContext.changePostValue( "Z86EntidadDomicilioNumero_"+sGXsfl_66_idx, httpContext.cgiGet( "ZT_"+"Z86EntidadDomicilioNumero_"+sGXsfl_66_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z86EntidadDomicilioNumero_"+sGXsfl_66_idx) ;
         httpContext.changePostValue( "Z87EntidadDomicilioPiso_"+sGXsfl_66_idx, httpContext.cgiGet( "ZT_"+"Z87EntidadDomicilioPiso_"+sGXsfl_66_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z87EntidadDomicilioPiso_"+sGXsfl_66_idx) ;
         httpContext.changePostValue( "Z88EntidadDomicilioDepto_"+sGXsfl_66_idx, httpContext.cgiGet( "ZT_"+"Z88EntidadDomicilioDepto_"+sGXsfl_66_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z88EntidadDomicilioDepto_"+sGXsfl_66_idx) ;
         httpContext.changePostValue( "Z89EntidadDomicilioCPostal_"+sGXsfl_66_idx, httpContext.cgiGet( "ZT_"+"Z89EntidadDomicilioCPostal_"+sGXsfl_66_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z89EntidadDomicilioCPostal_"+sGXsfl_66_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201721917352416");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.kberp.entidad") +"\">") ;
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
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z82EntidadNombre", Z82EntidadNombre);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z83EntidadNumeroDocumento", GXutil.rtrim( Z83EntidadNumeroDocumento));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z94EntidadTipo", GXutil.ltrim( localUtil.ntoc( Z94EntidadTipo, (byte)(2), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_boolean_hidden_field( httpContext, "Z95EntidadActiva", Z95EntidadActiva);
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z102EntidadTipoDocumentoId", GXutil.ltrim( localUtil.ntoc( Z102EntidadTipoDocumentoId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z103EntidadCondCpraVtaId", GXutil.ltrim( localUtil.ntoc( Z103EntidadCondCpraVtaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z99EntidadPaisId", GXutil.ltrim( localUtil.ntoc( Z99EntidadPaisId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z104EntidadCondIvaId", GXutil.ltrim( localUtil.ntoc( Z104EntidadCondIvaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z98EntidadLocalidadId", GXutil.ltrim( localUtil.ntoc( Z98EntidadLocalidadId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Z100EntidadProvinciaId", GXutil.ltrim( localUtil.ntoc( Z100EntidadProvinciaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nGXsfl_54_idx, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_66", GXutil.ltrim( localUtil.ntoc( nGXsfl_66_idx, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "PAISID", GXutil.ltrim( localUtil.ntoc( A3PaisId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "CONDICIONIVAID", GXutil.ltrim( localUtil.ntoc( A13CondicionIvaId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "LOCALIDADID", GXutil.ltrim( localUtil.ntoc( A5LocalidadId, (byte)(4), (byte)(0), ",", "")));
      com.kberp.GxWebStd.gx_hidden_field( httpContext, "PROVINCIAID", GXutil.ltrim( localUtil.ntoc( A1ProvinciaId, (byte)(4), (byte)(0), ",", "")));
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
      return formatLink("com.kberp.entidad")  ;
   }

   public String getPgmname( )
   {
      return "Entidad" ;
   }

   public String getPgmdesc( )
   {
      return "Entidad" ;
   }

   public void initializeNonKey0I44( )
   {
      A1ProvinciaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1ProvinciaId", GXutil.ltrim( GXutil.str( A1ProvinciaId, 4, 0)));
      A5LocalidadId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5LocalidadId", GXutil.ltrim( GXutil.str( A5LocalidadId, 4, 0)));
      A13CondicionIvaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13CondicionIvaId", GXutil.ltrim( GXutil.str( A13CondicionIvaId, 4, 0)));
      A3PaisId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3PaisId", GXutil.ltrim( GXutil.str( A3PaisId, 4, 0)));
      A15CondicionCpraVtaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A15CondicionCpraVtaId", GXutil.ltrim( GXutil.str( A15CondicionCpraVtaId, 4, 0)));
      A9TipoDocumentoId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9TipoDocumentoId", GXutil.ltrim( GXutil.str( A9TipoDocumentoId, 4, 0)));
      A82EntidadNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A82EntidadNombre", A82EntidadNombre);
      A83EntidadNumeroDocumento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A83EntidadNumeroDocumento", A83EntidadNumeroDocumento);
      A102EntidadTipoDocumentoId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A102EntidadTipoDocumentoId", GXutil.ltrim( GXutil.str( A102EntidadTipoDocumentoId, 4, 0)));
      A103EntidadCondCpraVtaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A103EntidadCondCpraVtaId", GXutil.ltrim( GXutil.str( A103EntidadCondCpraVtaId, 4, 0)));
      A99EntidadPaisId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A99EntidadPaisId", GXutil.ltrim( GXutil.str( A99EntidadPaisId, 4, 0)));
      A100EntidadProvinciaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A100EntidadProvinciaId", GXutil.ltrim( GXutil.str( A100EntidadProvinciaId, 4, 0)));
      A104EntidadCondIvaId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A104EntidadCondIvaId", GXutil.ltrim( GXutil.str( A104EntidadCondIvaId, 4, 0)));
      A98EntidadLocalidadId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A98EntidadLocalidadId", GXutil.ltrim( GXutil.str( A98EntidadLocalidadId, 4, 0)));
      A94EntidadTipo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A94EntidadTipo", GXutil.ltrim( GXutil.str( A94EntidadTipo, 2, 0)));
      A95EntidadActiva = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A95EntidadActiva", A95EntidadActiva);
      Z82EntidadNombre = "" ;
      Z83EntidadNumeroDocumento = "" ;
      Z94EntidadTipo = (byte)(0) ;
      Z95EntidadActiva = false ;
      Z102EntidadTipoDocumentoId = (short)(0) ;
      Z103EntidadCondCpraVtaId = (short)(0) ;
      Z99EntidadPaisId = (short)(0) ;
      Z104EntidadCondIvaId = (short)(0) ;
      Z98EntidadLocalidadId = (short)(0) ;
      Z100EntidadProvinciaId = (short)(0) ;
   }

   public void initAll0I44( )
   {
      A42EmpresaId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A42EmpresaId", GXutil.ltrim( GXutil.str( A42EmpresaId, 6, 0)));
      A81EntidadId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A81EntidadId", GXutil.ltrim( GXutil.str( A81EntidadId, 6, 0)));
      initializeNonKey0I44( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0I45( )
   {
      A92EntidadTelefono = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefono_Internalname, A92EntidadTelefono);
      A93EntidadTelefonoObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefonoObs_Internalname, A93EntidadTelefonoObs);
      Z92EntidadTelefono = "" ;
      Z93EntidadTelefonoObs = "" ;
   }

   public void initAll0I45( )
   {
      A91EntidadTelefonoId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadTelefonoId_Internalname, GXutil.ltrim( GXutil.str( A91EntidadTelefonoId, 4, 0)));
      initializeNonKey0I45( ) ;
   }

   public void standaloneModalInsert0I45( )
   {
   }

   public void initializeNonKey0I46( )
   {
      A90EntidadDomicilioCompleto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCompleto_Internalname, A90EntidadDomicilioCompleto);
      A85EntidadDomicilioCalle = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCalle_Internalname, A85EntidadDomicilioCalle);
      A86EntidadDomicilioNumero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioNumero_Internalname, GXutil.ltrim( GXutil.str( A86EntidadDomicilioNumero, 6, 0)));
      A87EntidadDomicilioPiso = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioPiso_Internalname, GXutil.ltrim( GXutil.str( A87EntidadDomicilioPiso, 3, 0)));
      A88EntidadDomicilioDepto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioDepto_Internalname, A88EntidadDomicilioDepto);
      A89EntidadDomicilioCPostal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioCPostal_Internalname, A89EntidadDomicilioCPostal);
      Z85EntidadDomicilioCalle = "" ;
      Z86EntidadDomicilioNumero = 0 ;
      Z87EntidadDomicilioPiso = (short)(0) ;
      Z88EntidadDomicilioDepto = "" ;
      Z89EntidadDomicilioCPostal = "" ;
   }

   public void initAll0I46( )
   {
      A84EntidadDomicilioId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtEntidadDomicilioId_Internalname, GXutil.ltrim( GXutil.str( A84EntidadDomicilioId, 4, 0)));
      initializeNonKey0I46( ) ;
   }

   public void standaloneModalInsert0I46( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1731551");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201721917352436");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 109402));
      httpContext.AddJavascriptSource("entidad.js", "?201721917352436");
      /* End function include_jscripts */
   }

   public void init_level_properties45( )
   {
      edtEntidadTelefonoId_Enabled = defedtEntidadTelefonoId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadTelefonoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadTelefonoId_Enabled, 5, 0)));
   }

   public void init_level_properties46( )
   {
      edtEntidadDomicilioId_Enabled = defedtEntidadDomicilioId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntidadDomicilioId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEntidadDomicilioId_Enabled, 5, 0)));
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
      edtEntidadNombre_Internalname = "ENTIDADNOMBRE" ;
      edtEntidadNumeroDocumento_Internalname = "ENTIDADNUMERODOCUMENTO" ;
      lblTitletelefono_Internalname = "TITLETELEFONO" ;
      edtEntidadTelefonoId_Internalname = "ENTIDADTELEFONOID" ;
      edtEntidadTelefono_Internalname = "ENTIDADTELEFONO" ;
      edtEntidadTelefonoObs_Internalname = "ENTIDADTELEFONOOBS" ;
      divTelefonotable_Internalname = "TELEFONOTABLE" ;
      lblTitledomicilio_Internalname = "TITLEDOMICILIO" ;
      edtEntidadDomicilioId_Internalname = "ENTIDADDOMICILIOID" ;
      edtEntidadDomicilioCalle_Internalname = "ENTIDADDOMICILIOCALLE" ;
      edtEntidadDomicilioNumero_Internalname = "ENTIDADDOMICILIONUMERO" ;
      edtEntidadDomicilioPiso_Internalname = "ENTIDADDOMICILIOPISO" ;
      edtEntidadDomicilioDepto_Internalname = "ENTIDADDOMICILIODEPTO" ;
      edtEntidadDomicilioCPostal_Internalname = "ENTIDADDOMICILIOCPOSTAL" ;
      edtEntidadDomicilioCompleto_Internalname = "ENTIDADDOMICILIOCOMPLETO" ;
      divDomiciliotable_Internalname = "DOMICILIOTABLE" ;
      edtEntidadTipoDocumentoId_Internalname = "ENTIDADTIPODOCUMENTOID" ;
      edtEntidadCondCpraVtaId_Internalname = "ENTIDADCONDCPRAVTAID" ;
      edtEntidadPaisId_Internalname = "ENTIDADPAISID" ;
      edtEntidadProvinciaId_Internalname = "ENTIDADPROVINCIAID" ;
      edtEntidadCondIvaId_Internalname = "ENTIDADCONDIVAID" ;
      edtEntidadLocalidadId_Internalname = "ENTIDADLOCALIDADID" ;
      cmbEntidadTipo.setInternalname( "ENTIDADTIPO" );
      chkEntidadActiva.setInternalname( "ENTIDADACTIVA" );
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_42_Internalname = "PROMPT_42" ;
      imgprompt_102_Internalname = "PROMPT_102" ;
      imgprompt_103_Internalname = "PROMPT_103" ;
      imgprompt_99_Internalname = "PROMPT_99" ;
      imgprompt_100_Internalname = "PROMPT_100" ;
      imgprompt_104_Internalname = "PROMPT_104" ;
      imgprompt_98_Internalname = "PROMPT_98" ;
      subGridentidad_telefono_Internalname = "GRIDENTIDAD_TELEFONO" ;
      subGridentidad_domicilio_Internalname = "GRIDENTIDAD_DOMICILIO" ;
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
      Form.setCaption( "Entidad" );
      edtEntidadDomicilioCompleto_Jsonclick = "" ;
      edtEntidadDomicilioCPostal_Jsonclick = "" ;
      edtEntidadDomicilioDepto_Jsonclick = "" ;
      edtEntidadDomicilioPiso_Jsonclick = "" ;
      edtEntidadDomicilioNumero_Jsonclick = "" ;
      edtEntidadDomicilioCalle_Jsonclick = "" ;
      edtEntidadDomicilioId_Jsonclick = "" ;
      subGridentidad_domicilio_Class = "Grid" ;
      subGridentidad_domicilio_Backcolorstyle = (byte)(0) ;
      edtEntidadTelefonoObs_Jsonclick = "" ;
      edtEntidadTelefono_Jsonclick = "" ;
      edtEntidadTelefonoId_Jsonclick = "" ;
      subGridentidad_telefono_Class = "Grid" ;
      subGridentidad_telefono_Backcolorstyle = (byte)(0) ;
      subGridentidad_domicilio_Allowcollapsing = (byte)(0) ;
      subGridentidad_domicilio_Allowselection = (byte)(0) ;
      edtEntidadDomicilioCompleto_Enabled = 0 ;
      edtEntidadDomicilioCPostal_Enabled = 1 ;
      edtEntidadDomicilioDepto_Enabled = 1 ;
      edtEntidadDomicilioPiso_Enabled = 1 ;
      edtEntidadDomicilioNumero_Enabled = 1 ;
      edtEntidadDomicilioCalle_Enabled = 1 ;
      edtEntidadDomicilioId_Enabled = 1 ;
      subGridentidad_telefono_Allowcollapsing = (byte)(0) ;
      subGridentidad_telefono_Allowselection = (byte)(0) ;
      edtEntidadTelefonoObs_Enabled = 1 ;
      edtEntidadTelefono_Enabled = 1 ;
      edtEntidadTelefonoId_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      chkEntidadActiva.setEnabled( 1 );
      cmbEntidadTipo.setJsonclick( "" );
      cmbEntidadTipo.setEnabled( 1 );
      imgprompt_98_Visible = 1 ;
      imgprompt_98_Link = "" ;
      edtEntidadLocalidadId_Jsonclick = "" ;
      edtEntidadLocalidadId_Enabled = 1 ;
      imgprompt_104_Visible = 1 ;
      imgprompt_104_Link = "" ;
      edtEntidadCondIvaId_Jsonclick = "" ;
      edtEntidadCondIvaId_Enabled = 1 ;
      imgprompt_100_Visible = 1 ;
      imgprompt_100_Link = "" ;
      edtEntidadProvinciaId_Jsonclick = "" ;
      edtEntidadProvinciaId_Enabled = 1 ;
      imgprompt_99_Visible = 1 ;
      imgprompt_99_Link = "" ;
      edtEntidadPaisId_Jsonclick = "" ;
      edtEntidadPaisId_Enabled = 1 ;
      imgprompt_103_Visible = 1 ;
      imgprompt_103_Link = "" ;
      edtEntidadCondCpraVtaId_Jsonclick = "" ;
      edtEntidadCondCpraVtaId_Enabled = 1 ;
      imgprompt_102_Visible = 1 ;
      imgprompt_102_Link = "" ;
      edtEntidadTipoDocumentoId_Jsonclick = "" ;
      edtEntidadTipoDocumentoId_Enabled = 1 ;
      edtEntidadNumeroDocumento_Jsonclick = "" ;
      edtEntidadNumeroDocumento_Enabled = 1 ;
      edtEntidadNombre_Enabled = 1 ;
      edtEntidadId_Jsonclick = "" ;
      edtEntidadId_Enabled = 1 ;
      imgprompt_42_Visible = 1 ;
      imgprompt_42_Link = "" ;
      edtEmpresaId_Jsonclick = "" ;
      edtEmpresaId_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      chkEntidadActiva.setCaption( "Activa" );
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

   public void gxnrgridentidad_telefono_newrow( )
   {
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_5445( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0I45( ) ;
         standaloneModal0I45( ) ;
         cmbEntidadTipo.setName( "ENTIDADTIPO" );
         cmbEntidadTipo.setWebtags( "" );
         cmbEntidadTipo.addItem("1", "Cliente", (short)(0));
         cmbEntidadTipo.addItem("1", "Proveedor", (short)(0));
         if ( cmbEntidadTipo.getItemCount() > 0 )
         {
            A94EntidadTipo = (byte)(GXutil.lval( cmbEntidadTipo.getValidValue(GXutil.trim( GXutil.str( A94EntidadTipo, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A94EntidadTipo", GXutil.ltrim( GXutil.str( A94EntidadTipo, 2, 0)));
         }
         chkEntidadActiva.setName( "ENTIDADACTIVA" );
         chkEntidadActiva.setWebtags( "" );
         chkEntidadActiva.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkEntidadActiva.getInternalname(), "TitleCaption", chkEntidadActiva.getCaption());
         chkEntidadActiva.setCheckedValue( "false" );
         dynload_actions( ) ;
         sendRow0I45( ) ;
         nGXsfl_54_idx = (short)(nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_5445( ) ;
      }
      httpContext.GX_webresponse.addString(Gridentidad_telefonoContainer.ToJavascriptSource());
      /* End function gxnrGridentidad_telefono_newrow */
   }

   public void gxnrgridentidad_domicilio_newrow( )
   {
      com.kberp.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_6646( ) ;
      while ( nGXsfl_66_idx <= nRC_GXsfl_66 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0I46( ) ;
         standaloneModal0I46( ) ;
         cmbEntidadTipo.setName( "ENTIDADTIPO" );
         cmbEntidadTipo.setWebtags( "" );
         cmbEntidadTipo.addItem("1", "Cliente", (short)(0));
         cmbEntidadTipo.addItem("1", "Proveedor", (short)(0));
         if ( cmbEntidadTipo.getItemCount() > 0 )
         {
            A94EntidadTipo = (byte)(GXutil.lval( cmbEntidadTipo.getValidValue(GXutil.trim( GXutil.str( A94EntidadTipo, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A94EntidadTipo", GXutil.ltrim( GXutil.str( A94EntidadTipo, 2, 0)));
         }
         chkEntidadActiva.setName( "ENTIDADACTIVA" );
         chkEntidadActiva.setWebtags( "" );
         chkEntidadActiva.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkEntidadActiva.getInternalname(), "TitleCaption", chkEntidadActiva.getCaption());
         chkEntidadActiva.setCheckedValue( "false" );
         dynload_actions( ) ;
         sendRow0I46( ) ;
         nGXsfl_66_idx = (short)(nGXsfl_66_idx+1) ;
         sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_6646( ) ;
      }
      httpContext.GX_webresponse.addString(Gridentidad_domicilioContainer.ToJavascriptSource());
      /* End function gxnrGridentidad_domicilio_newrow */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      /* Using cursor T000I43 */
      pr_default.execute(41, new Object[] {new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Empresa'.", "ForeignKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(41);
      GX_FocusControl = edtEntidadNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Empresaid( int GX_Parm1 )
   {
      A42EmpresaId = GX_Parm1 ;
      /* Using cursor T000I43 */
      pr_default.execute(41, new Object[] {new Integer(A42EmpresaId)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Empresa'.", "ForeignKeyNotFound", 1, "EMPRESAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpresaId_Internalname ;
      }
      pr_default.close(41);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Entidadid( int GX_Parm1 ,
                                int GX_Parm2 ,
                                String GX_Parm3 ,
                                String GX_Parm4 ,
                                com.genexus.webpanels.HTMLChoice GX_Parm5 ,
                                boolean GX_Parm6 ,
                                short GX_Parm7 ,
                                short GX_Parm8 ,
                                short GX_Parm9 ,
                                short GX_Parm10 ,
                                short GX_Parm11 ,
                                short GX_Parm12 )
   {
      A42EmpresaId = GX_Parm1 ;
      A81EntidadId = GX_Parm2 ;
      A82EntidadNombre = GX_Parm3 ;
      A83EntidadNumeroDocumento = GX_Parm4 ;
      cmbEntidadTipo = GX_Parm5 ;
      A94EntidadTipo = (byte)(GXutil.lval( cmbEntidadTipo.getValue())) ;
      cmbEntidadTipo.setValue( GXutil.ltrim( GXutil.str( A94EntidadTipo, 2, 0)) );
      A95EntidadActiva = GX_Parm6 ;
      A102EntidadTipoDocumentoId = GX_Parm7 ;
      A103EntidadCondCpraVtaId = GX_Parm8 ;
      A99EntidadPaisId = GX_Parm9 ;
      A104EntidadCondIvaId = GX_Parm10 ;
      A98EntidadLocalidadId = GX_Parm11 ;
      A100EntidadProvinciaId = GX_Parm12 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A1ProvinciaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A5LocalidadId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A13CondicionIvaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A3PaisId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A15CondicionCpraVtaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A9TipoDocumentoId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A82EntidadNombre);
      isValidOutput.add(GXutil.rtrim( A83EntidadNumeroDocumento));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A102EntidadTipoDocumentoId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A103EntidadCondCpraVtaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A99EntidadPaisId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A100EntidadProvinciaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A104EntidadCondIvaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A98EntidadLocalidadId, (byte)(4), (byte)(0), ".", "")));
      cmbEntidadTipo.setValue( GXutil.trim( GXutil.str( A94EntidadTipo, 2, 0)) );
      isValidOutput.add(cmbEntidadTipo);
      isValidOutput.add(A95EntidadActiva);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z42EmpresaId, (byte)(6), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z81EntidadId, (byte)(6), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z1ProvinciaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z5LocalidadId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z13CondicionIvaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z3PaisId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z15CondicionCpraVtaId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z9TipoDocumentoId, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(Z82EntidadNombre);
      isValidOutput.add(GXutil.rtrim( Z83EntidadNumeroDocumento));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z102EntidadTipoDocumentoId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z103EntidadCondCpraVtaId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z99EntidadPaisId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z100EntidadProvinciaId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z104EntidadCondIvaId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z98EntidadLocalidadId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z94EntidadTipo, (byte)(2), (byte)(0), ",", "")));
      isValidOutput.add(Z95EntidadActiva);
      isValidOutput.add(Gridentidad_telefonoContainer);
      isValidOutput.add(Gridentidad_domicilioContainer);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Entidadtipodocumentoid( short GX_Parm1 )
   {
      A102EntidadTipoDocumentoId = GX_Parm1 ;
      /* Using cursor T000I44 */
      pr_default.execute(42, new Object[] {new Short(A102EntidadTipoDocumentoId)});
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Documento'.", "ForeignKeyNotFound", 1, "ENTIDADTIPODOCUMENTOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadTipoDocumentoId_Internalname ;
      }
      pr_default.close(42);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Entidadcondcpravtaid( short GX_Parm1 )
   {
      A103EntidadCondCpraVtaId = GX_Parm1 ;
      /* Using cursor T000I45 */
      pr_default.execute(43, new Object[] {new Short(A103EntidadCondCpraVtaId)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Condicion Cpra Vta'.", "ForeignKeyNotFound", 1, "ENTIDADCONDCPRAVTAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadCondCpraVtaId_Internalname ;
      }
      pr_default.close(43);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Entidadpaisid( short GX_Parm1 )
   {
      A99EntidadPaisId = GX_Parm1 ;
      /* Using cursor T000I46 */
      pr_default.execute(44, new Object[] {new Short(A99EntidadPaisId)});
      if ( (pr_default.getStatus(44) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Pais'.", "ForeignKeyNotFound", 1, "ENTIDADPAISID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadPaisId_Internalname ;
      }
      pr_default.close(44);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Entidadprovinciaid( short GX_Parm1 )
   {
      A100EntidadProvinciaId = GX_Parm1 ;
      /* Using cursor T000I47 */
      pr_default.execute(45, new Object[] {new Short(A100EntidadProvinciaId)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Provincia'.", "ForeignKeyNotFound", 1, "ENTIDADPROVINCIAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadProvinciaId_Internalname ;
      }
      pr_default.close(45);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Entidadcondivaid( short GX_Parm1 )
   {
      A104EntidadCondIvaId = GX_Parm1 ;
      /* Using cursor T000I48 */
      pr_default.execute(46, new Object[] {new Short(A104EntidadCondIvaId)});
      if ( (pr_default.getStatus(46) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Condicion Iva'.", "ForeignKeyNotFound", 1, "ENTIDADCONDIVAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadCondIvaId_Internalname ;
      }
      pr_default.close(46);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Entidadlocalidadid( short GX_Parm1 )
   {
      A98EntidadLocalidadId = GX_Parm1 ;
      /* Using cursor T000I49 */
      pr_default.execute(47, new Object[] {new Short(A98EntidadLocalidadId)});
      if ( (pr_default.getStatus(47) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Localidad'.", "ForeignKeyNotFound", 1, "ENTIDADLOCALIDADID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntidadLocalidadId_Internalname ;
      }
      pr_default.close(47);
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
      pr_default.close(42);
      pr_default.close(43);
      pr_default.close(44);
      pr_default.close(46);
      pr_default.close(47);
      pr_default.close(45);
      pr_default.close(41);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z82EntidadNombre = "" ;
      Z83EntidadNumeroDocumento = "" ;
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
      sImgUrl = "" ;
      A82EntidadNombre = "" ;
      A83EntidadNumeroDocumento = "" ;
      lblTitletelefono_Jsonclick = "" ;
      lblTitledomicilio_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridentidad_telefonoContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridentidad_telefonoColumn = new com.genexus.webpanels.GXWebColumn();
      A92EntidadTelefono = "" ;
      A93EntidadTelefonoObs = "" ;
      Gx_mode = "" ;
      sMode45 = "" ;
      sStyleString = "" ;
      Gridentidad_domicilioContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridentidad_domicilioColumn = new com.genexus.webpanels.GXWebColumn();
      A85EntidadDomicilioCalle = "" ;
      A88EntidadDomicilioDepto = "" ;
      A89EntidadDomicilioCPostal = "" ;
      A90EntidadDomicilioCompleto = "" ;
      sMode46 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      Z85EntidadDomicilioCalle = "" ;
      Z88EntidadDomicilioDepto = "" ;
      Z89EntidadDomicilioCPostal = "" ;
      Z92EntidadTelefono = "" ;
      Z93EntidadTelefonoObs = "" ;
      T000I19_A81EntidadId = new int[1] ;
      T000I19_A82EntidadNombre = new String[] {""} ;
      T000I19_A83EntidadNumeroDocumento = new String[] {""} ;
      T000I19_A94EntidadTipo = new byte[1] ;
      T000I19_A95EntidadActiva = new boolean[] {false} ;
      T000I19_A102EntidadTipoDocumentoId = new short[1] ;
      T000I19_A103EntidadCondCpraVtaId = new short[1] ;
      T000I19_A99EntidadPaisId = new short[1] ;
      T000I19_A104EntidadCondIvaId = new short[1] ;
      T000I19_A98EntidadLocalidadId = new short[1] ;
      T000I19_A100EntidadProvinciaId = new short[1] ;
      T000I19_A42EmpresaId = new int[1] ;
      T000I14_A42EmpresaId = new int[1] ;
      T000I8_A9TipoDocumentoId = new short[1] ;
      T000I9_A15CondicionCpraVtaId = new short[1] ;
      T000I10_A3PaisId = new short[1] ;
      T000I13_A1ProvinciaId = new short[1] ;
      T000I11_A13CondicionIvaId = new short[1] ;
      T000I12_A5LocalidadId = new short[1] ;
      T000I20_A42EmpresaId = new int[1] ;
      T000I21_A9TipoDocumentoId = new short[1] ;
      T000I22_A15CondicionCpraVtaId = new short[1] ;
      T000I23_A42EmpresaId = new int[1] ;
      T000I23_A81EntidadId = new int[1] ;
      T000I7_A81EntidadId = new int[1] ;
      T000I7_A82EntidadNombre = new String[] {""} ;
      T000I7_A83EntidadNumeroDocumento = new String[] {""} ;
      T000I7_A94EntidadTipo = new byte[1] ;
      T000I7_A95EntidadActiva = new boolean[] {false} ;
      T000I7_A102EntidadTipoDocumentoId = new short[1] ;
      T000I7_A103EntidadCondCpraVtaId = new short[1] ;
      T000I7_A99EntidadPaisId = new short[1] ;
      T000I7_A104EntidadCondIvaId = new short[1] ;
      T000I7_A98EntidadLocalidadId = new short[1] ;
      T000I7_A100EntidadProvinciaId = new short[1] ;
      T000I7_A42EmpresaId = new int[1] ;
      sMode44 = "" ;
      T000I24_A81EntidadId = new int[1] ;
      T000I24_A42EmpresaId = new int[1] ;
      T000I25_A81EntidadId = new int[1] ;
      T000I25_A42EmpresaId = new int[1] ;
      T000I6_A81EntidadId = new int[1] ;
      T000I6_A82EntidadNombre = new String[] {""} ;
      T000I6_A83EntidadNumeroDocumento = new String[] {""} ;
      T000I6_A94EntidadTipo = new byte[1] ;
      T000I6_A95EntidadActiva = new boolean[] {false} ;
      T000I6_A102EntidadTipoDocumentoId = new short[1] ;
      T000I6_A103EntidadCondCpraVtaId = new short[1] ;
      T000I6_A99EntidadPaisId = new short[1] ;
      T000I6_A104EntidadCondIvaId = new short[1] ;
      T000I6_A98EntidadLocalidadId = new short[1] ;
      T000I6_A100EntidadProvinciaId = new short[1] ;
      T000I6_A42EmpresaId = new int[1] ;
      T000I29_A42EmpresaId = new int[1] ;
      T000I29_A81EntidadId = new int[1] ;
      T000I29_A31CfgComprobanteId = new String[] {""} ;
      T000I29_A32CfgComprobantePrefijo = new short[1] ;
      T000I29_A55ComprobanteNumero = new int[1] ;
      T000I29_A35CfgComprobanteDetalleLetra = new byte[1] ;
      T000I30_A42EmpresaId = new int[1] ;
      T000I30_A81EntidadId = new int[1] ;
      T000I31_A42EmpresaId = new int[1] ;
      T000I31_A81EntidadId = new int[1] ;
      T000I31_A91EntidadTelefonoId = new short[1] ;
      T000I31_A92EntidadTelefono = new String[] {""} ;
      T000I31_A93EntidadTelefonoObs = new String[] {""} ;
      T000I32_A42EmpresaId = new int[1] ;
      T000I32_A81EntidadId = new int[1] ;
      T000I32_A91EntidadTelefonoId = new short[1] ;
      T000I5_A42EmpresaId = new int[1] ;
      T000I5_A81EntidadId = new int[1] ;
      T000I5_A91EntidadTelefonoId = new short[1] ;
      T000I5_A92EntidadTelefono = new String[] {""} ;
      T000I5_A93EntidadTelefonoObs = new String[] {""} ;
      T000I4_A42EmpresaId = new int[1] ;
      T000I4_A81EntidadId = new int[1] ;
      T000I4_A91EntidadTelefonoId = new short[1] ;
      T000I4_A92EntidadTelefono = new String[] {""} ;
      T000I4_A93EntidadTelefonoObs = new String[] {""} ;
      T000I36_A42EmpresaId = new int[1] ;
      T000I36_A81EntidadId = new int[1] ;
      T000I36_A91EntidadTelefonoId = new short[1] ;
      T000I37_A42EmpresaId = new int[1] ;
      T000I37_A81EntidadId = new int[1] ;
      T000I37_A84EntidadDomicilioId = new short[1] ;
      T000I37_A85EntidadDomicilioCalle = new String[] {""} ;
      T000I37_A86EntidadDomicilioNumero = new int[1] ;
      T000I37_A87EntidadDomicilioPiso = new short[1] ;
      T000I37_A88EntidadDomicilioDepto = new String[] {""} ;
      T000I37_A89EntidadDomicilioCPostal = new String[] {""} ;
      T000I38_A42EmpresaId = new int[1] ;
      T000I38_A81EntidadId = new int[1] ;
      T000I38_A84EntidadDomicilioId = new short[1] ;
      T000I3_A42EmpresaId = new int[1] ;
      T000I3_A81EntidadId = new int[1] ;
      T000I3_A84EntidadDomicilioId = new short[1] ;
      T000I3_A85EntidadDomicilioCalle = new String[] {""} ;
      T000I3_A86EntidadDomicilioNumero = new int[1] ;
      T000I3_A87EntidadDomicilioPiso = new short[1] ;
      T000I3_A88EntidadDomicilioDepto = new String[] {""} ;
      T000I3_A89EntidadDomicilioCPostal = new String[] {""} ;
      T000I2_A42EmpresaId = new int[1] ;
      T000I2_A81EntidadId = new int[1] ;
      T000I2_A84EntidadDomicilioId = new short[1] ;
      T000I2_A85EntidadDomicilioCalle = new String[] {""} ;
      T000I2_A86EntidadDomicilioNumero = new int[1] ;
      T000I2_A87EntidadDomicilioPiso = new short[1] ;
      T000I2_A88EntidadDomicilioDepto = new String[] {""} ;
      T000I2_A89EntidadDomicilioCPostal = new String[] {""} ;
      T000I42_A42EmpresaId = new int[1] ;
      T000I42_A81EntidadId = new int[1] ;
      T000I42_A84EntidadDomicilioId = new short[1] ;
      Gridentidad_telefonoRow = new com.genexus.webpanels.GXWebRow();
      subGridentidad_telefono_Linesclass = "" ;
      ROClassString = "" ;
      gxphoneLink = "" ;
      Gridentidad_domicilioRow = new com.genexus.webpanels.GXWebRow();
      subGridentidad_domicilio_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T000I43_A42EmpresaId = new int[1] ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000I44_A9TipoDocumentoId = new short[1] ;
      T000I45_A15CondicionCpraVtaId = new short[1] ;
      T000I46_A3PaisId = new short[1] ;
      T000I47_A1ProvinciaId = new short[1] ;
      T000I48_A13CondicionIvaId = new short[1] ;
      T000I49_A5LocalidadId = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kberp.entidad__default(),
         new Object[] {
             new Object[] {
            T000I2_A42EmpresaId, T000I2_A81EntidadId, T000I2_A84EntidadDomicilioId, T000I2_A85EntidadDomicilioCalle, T000I2_A86EntidadDomicilioNumero, T000I2_A87EntidadDomicilioPiso, T000I2_A88EntidadDomicilioDepto, T000I2_A89EntidadDomicilioCPostal
            }
            , new Object[] {
            T000I3_A42EmpresaId, T000I3_A81EntidadId, T000I3_A84EntidadDomicilioId, T000I3_A85EntidadDomicilioCalle, T000I3_A86EntidadDomicilioNumero, T000I3_A87EntidadDomicilioPiso, T000I3_A88EntidadDomicilioDepto, T000I3_A89EntidadDomicilioCPostal
            }
            , new Object[] {
            T000I4_A42EmpresaId, T000I4_A81EntidadId, T000I4_A91EntidadTelefonoId, T000I4_A92EntidadTelefono, T000I4_A93EntidadTelefonoObs
            }
            , new Object[] {
            T000I5_A42EmpresaId, T000I5_A81EntidadId, T000I5_A91EntidadTelefonoId, T000I5_A92EntidadTelefono, T000I5_A93EntidadTelefonoObs
            }
            , new Object[] {
            T000I6_A81EntidadId, T000I6_A82EntidadNombre, T000I6_A83EntidadNumeroDocumento, T000I6_A94EntidadTipo, T000I6_A95EntidadActiva, T000I6_A102EntidadTipoDocumentoId, T000I6_A103EntidadCondCpraVtaId, T000I6_A99EntidadPaisId, T000I6_A104EntidadCondIvaId, T000I6_A98EntidadLocalidadId,
            T000I6_A100EntidadProvinciaId, T000I6_A42EmpresaId
            }
            , new Object[] {
            T000I7_A81EntidadId, T000I7_A82EntidadNombre, T000I7_A83EntidadNumeroDocumento, T000I7_A94EntidadTipo, T000I7_A95EntidadActiva, T000I7_A102EntidadTipoDocumentoId, T000I7_A103EntidadCondCpraVtaId, T000I7_A99EntidadPaisId, T000I7_A104EntidadCondIvaId, T000I7_A98EntidadLocalidadId,
            T000I7_A100EntidadProvinciaId, T000I7_A42EmpresaId
            }
            , new Object[] {
            T000I8_A9TipoDocumentoId
            }
            , new Object[] {
            T000I9_A15CondicionCpraVtaId
            }
            , new Object[] {
            T000I10_A3PaisId
            }
            , new Object[] {
            T000I11_A13CondicionIvaId
            }
            , new Object[] {
            T000I12_A5LocalidadId
            }
            , new Object[] {
            T000I13_A1ProvinciaId
            }
            , new Object[] {
            T000I14_A42EmpresaId
            }
            , new Object[] {
            T000I15_A3PaisId
            }
            , new Object[] {
            T000I16_A13CondicionIvaId
            }
            , new Object[] {
            T000I17_A5LocalidadId
            }
            , new Object[] {
            T000I18_A1ProvinciaId
            }
            , new Object[] {
            T000I19_A81EntidadId, T000I19_A82EntidadNombre, T000I19_A83EntidadNumeroDocumento, T000I19_A94EntidadTipo, T000I19_A95EntidadActiva, T000I19_A102EntidadTipoDocumentoId, T000I19_A103EntidadCondCpraVtaId, T000I19_A99EntidadPaisId, T000I19_A104EntidadCondIvaId, T000I19_A98EntidadLocalidadId,
            T000I19_A100EntidadProvinciaId, T000I19_A42EmpresaId
            }
            , new Object[] {
            T000I20_A42EmpresaId
            }
            , new Object[] {
            T000I21_A9TipoDocumentoId
            }
            , new Object[] {
            T000I22_A15CondicionCpraVtaId
            }
            , new Object[] {
            T000I23_A42EmpresaId, T000I23_A81EntidadId
            }
            , new Object[] {
            T000I24_A81EntidadId, T000I24_A42EmpresaId
            }
            , new Object[] {
            T000I25_A81EntidadId, T000I25_A42EmpresaId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000I29_A42EmpresaId, T000I29_A81EntidadId, T000I29_A31CfgComprobanteId, T000I29_A32CfgComprobantePrefijo, T000I29_A55ComprobanteNumero, T000I29_A35CfgComprobanteDetalleLetra
            }
            , new Object[] {
            T000I30_A42EmpresaId, T000I30_A81EntidadId
            }
            , new Object[] {
            T000I31_A42EmpresaId, T000I31_A81EntidadId, T000I31_A91EntidadTelefonoId, T000I31_A92EntidadTelefono, T000I31_A93EntidadTelefonoObs
            }
            , new Object[] {
            T000I32_A42EmpresaId, T000I32_A81EntidadId, T000I32_A91EntidadTelefonoId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000I36_A42EmpresaId, T000I36_A81EntidadId, T000I36_A91EntidadTelefonoId
            }
            , new Object[] {
            T000I37_A42EmpresaId, T000I37_A81EntidadId, T000I37_A84EntidadDomicilioId, T000I37_A85EntidadDomicilioCalle, T000I37_A86EntidadDomicilioNumero, T000I37_A87EntidadDomicilioPiso, T000I37_A88EntidadDomicilioDepto, T000I37_A89EntidadDomicilioCPostal
            }
            , new Object[] {
            T000I38_A42EmpresaId, T000I38_A81EntidadId, T000I38_A84EntidadDomicilioId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000I42_A42EmpresaId, T000I42_A81EntidadId, T000I42_A84EntidadDomicilioId
            }
            , new Object[] {
            T000I43_A42EmpresaId
            }
            , new Object[] {
            T000I44_A9TipoDocumentoId
            }
            , new Object[] {
            T000I45_A15CondicionCpraVtaId
            }
            , new Object[] {
            T000I46_A3PaisId
            }
            , new Object[] {
            T000I47_A1ProvinciaId
            }
            , new Object[] {
            T000I48_A13CondicionIvaId
            }
            , new Object[] {
            T000I49_A5LocalidadId
            }
         }
      );
   }

   private byte Z94EntidadTipo ;
   private byte GxWebError ;
   private byte A94EntidadTipo ;
   private byte nKeyPressed ;
   private byte subGridentidad_telefono_Backcolorstyle ;
   private byte subGridentidad_telefono_Allowselection ;
   private byte subGridentidad_telefono_Allowhovering ;
   private byte subGridentidad_telefono_Allowcollapsing ;
   private byte subGridentidad_telefono_Collapsed ;
   private byte subGridentidad_domicilio_Backcolorstyle ;
   private byte subGridentidad_domicilio_Allowselection ;
   private byte subGridentidad_domicilio_Allowhovering ;
   private byte subGridentidad_domicilio_Allowcollapsing ;
   private byte subGridentidad_domicilio_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridentidad_telefono_Backstyle ;
   private byte subGridentidad_domicilio_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z102EntidadTipoDocumentoId ;
   private short Z103EntidadCondCpraVtaId ;
   private short Z99EntidadPaisId ;
   private short Z104EntidadCondIvaId ;
   private short Z98EntidadLocalidadId ;
   private short Z100EntidadProvinciaId ;
   private short nRC_GXsfl_54 ;
   private short nGXsfl_54_idx=1 ;
   private short nRC_GXsfl_66 ;
   private short nGXsfl_66_idx=1 ;
   private short A102EntidadTipoDocumentoId ;
   private short A103EntidadCondCpraVtaId ;
   private short A99EntidadPaisId ;
   private short A100EntidadProvinciaId ;
   private short A104EntidadCondIvaId ;
   private short A98EntidadLocalidadId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A91EntidadTelefonoId ;
   private short nBlankRcdCount45 ;
   private short nRcdExists_45 ;
   private short RcdFound45 ;
   private short nIsMod_45 ;
   private short nRcdDeleted_45 ;
   private short nBlankRcdUsr45 ;
   private short A84EntidadDomicilioId ;
   private short A87EntidadDomicilioPiso ;
   private short nBlankRcdCount46 ;
   private short nRcdExists_46 ;
   private short RcdFound46 ;
   private short nIsMod_46 ;
   private short nRcdDeleted_46 ;
   private short nBlankRcdUsr46 ;
   private short A3PaisId ;
   private short A13CondicionIvaId ;
   private short A5LocalidadId ;
   private short A1ProvinciaId ;
   private short Z84EntidadDomicilioId ;
   private short Z87EntidadDomicilioPiso ;
   private short Z91EntidadTelefonoId ;
   private short RcdFound44 ;
   private short A15CondicionCpraVtaId ;
   private short A9TipoDocumentoId ;
   private short Z1ProvinciaId ;
   private short Z5LocalidadId ;
   private short Z13CondicionIvaId ;
   private short Z3PaisId ;
   private short Z15CondicionCpraVtaId ;
   private short Z9TipoDocumentoId ;
   private int Z42EmpresaId ;
   private int Z81EntidadId ;
   private int A42EmpresaId ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmpresaId_Enabled ;
   private int imgprompt_42_Visible ;
   private int A81EntidadId ;
   private int edtEntidadId_Enabled ;
   private int edtEntidadNombre_Enabled ;
   private int edtEntidadNumeroDocumento_Enabled ;
   private int edtEntidadTipoDocumentoId_Enabled ;
   private int imgprompt_102_Visible ;
   private int edtEntidadCondCpraVtaId_Enabled ;
   private int imgprompt_103_Visible ;
   private int edtEntidadPaisId_Enabled ;
   private int imgprompt_99_Visible ;
   private int edtEntidadProvinciaId_Enabled ;
   private int imgprompt_100_Visible ;
   private int edtEntidadCondIvaId_Enabled ;
   private int imgprompt_104_Visible ;
   private int edtEntidadLocalidadId_Enabled ;
   private int imgprompt_98_Visible ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtEntidadTelefonoId_Enabled ;
   private int edtEntidadTelefono_Enabled ;
   private int edtEntidadTelefonoObs_Enabled ;
   private int subGridentidad_telefono_Selectioncolor ;
   private int subGridentidad_telefono_Hoveringcolor ;
   private int fRowAdded ;
   private int edtEntidadDomicilioId_Enabled ;
   private int edtEntidadDomicilioCalle_Enabled ;
   private int A86EntidadDomicilioNumero ;
   private int edtEntidadDomicilioNumero_Enabled ;
   private int edtEntidadDomicilioPiso_Enabled ;
   private int edtEntidadDomicilioDepto_Enabled ;
   private int edtEntidadDomicilioCPostal_Enabled ;
   private int edtEntidadDomicilioCompleto_Enabled ;
   private int subGridentidad_domicilio_Selectioncolor ;
   private int subGridentidad_domicilio_Hoveringcolor ;
   private int Z86EntidadDomicilioNumero ;
   private int GX_JID ;
   private int subGridentidad_telefono_Backcolor ;
   private int subGridentidad_telefono_Allbackcolor ;
   private int subGridentidad_domicilio_Backcolor ;
   private int subGridentidad_domicilio_Allbackcolor ;
   private int defedtEntidadDomicilioId_Enabled ;
   private int defedtEntidadTelefonoId_Enabled ;
   private int idxLst ;
   private long GRIDENTIDAD_TELEFONO_nFirstRecordOnPage ;
   private long GRIDENTIDAD_DOMICILIO_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z83EntidadNumeroDocumento ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_54_idx="0001" ;
   private String sGXsfl_66_idx="0001" ;
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
   private String sImgUrl ;
   private String imgprompt_42_Internalname ;
   private String imgprompt_42_Link ;
   private String edtEntidadId_Internalname ;
   private String edtEntidadId_Jsonclick ;
   private String edtEntidadNombre_Internalname ;
   private String edtEntidadNumeroDocumento_Internalname ;
   private String A83EntidadNumeroDocumento ;
   private String edtEntidadNumeroDocumento_Jsonclick ;
   private String divTelefonotable_Internalname ;
   private String lblTitletelefono_Internalname ;
   private String lblTitletelefono_Jsonclick ;
   private String divDomiciliotable_Internalname ;
   private String lblTitledomicilio_Internalname ;
   private String lblTitledomicilio_Jsonclick ;
   private String edtEntidadTipoDocumentoId_Internalname ;
   private String edtEntidadTipoDocumentoId_Jsonclick ;
   private String imgprompt_102_Internalname ;
   private String imgprompt_102_Link ;
   private String edtEntidadCondCpraVtaId_Internalname ;
   private String edtEntidadCondCpraVtaId_Jsonclick ;
   private String imgprompt_103_Internalname ;
   private String imgprompt_103_Link ;
   private String edtEntidadPaisId_Internalname ;
   private String edtEntidadPaisId_Jsonclick ;
   private String imgprompt_99_Internalname ;
   private String imgprompt_99_Link ;
   private String edtEntidadProvinciaId_Internalname ;
   private String edtEntidadProvinciaId_Jsonclick ;
   private String imgprompt_100_Internalname ;
   private String imgprompt_100_Link ;
   private String edtEntidadCondIvaId_Internalname ;
   private String edtEntidadCondIvaId_Jsonclick ;
   private String imgprompt_104_Internalname ;
   private String imgprompt_104_Link ;
   private String edtEntidadLocalidadId_Internalname ;
   private String edtEntidadLocalidadId_Jsonclick ;
   private String imgprompt_98_Internalname ;
   private String imgprompt_98_Link ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String A92EntidadTelefono ;
   private String Gx_mode ;
   private String sMode45 ;
   private String edtEntidadTelefonoId_Internalname ;
   private String edtEntidadTelefono_Internalname ;
   private String edtEntidadTelefonoObs_Internalname ;
   private String sStyleString ;
   private String sMode46 ;
   private String edtEntidadDomicilioId_Internalname ;
   private String edtEntidadDomicilioCalle_Internalname ;
   private String edtEntidadDomicilioNumero_Internalname ;
   private String edtEntidadDomicilioPiso_Internalname ;
   private String edtEntidadDomicilioDepto_Internalname ;
   private String edtEntidadDomicilioCPostal_Internalname ;
   private String edtEntidadDomicilioCompleto_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String Z92EntidadTelefono ;
   private String sMode44 ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String subGridentidad_telefono_Class ;
   private String subGridentidad_telefono_Linesclass ;
   private String ROClassString ;
   private String edtEntidadTelefonoId_Jsonclick ;
   private String gxphoneLink ;
   private String edtEntidadTelefono_Jsonclick ;
   private String edtEntidadTelefonoObs_Jsonclick ;
   private String sGXsfl_66_fel_idx="0001" ;
   private String subGridentidad_domicilio_Class ;
   private String subGridentidad_domicilio_Linesclass ;
   private String edtEntidadDomicilioId_Jsonclick ;
   private String edtEntidadDomicilioCalle_Jsonclick ;
   private String edtEntidadDomicilioNumero_Jsonclick ;
   private String edtEntidadDomicilioPiso_Jsonclick ;
   private String edtEntidadDomicilioDepto_Jsonclick ;
   private String edtEntidadDomicilioCPostal_Jsonclick ;
   private String edtEntidadDomicilioCompleto_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridentidad_telefono_Internalname ;
   private String subGridentidad_domicilio_Internalname ;
   private boolean Z95EntidadActiva ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A95EntidadActiva ;
   private boolean Gx_longc ;
   private String Z82EntidadNombre ;
   private String A82EntidadNombre ;
   private String A93EntidadTelefonoObs ;
   private String A85EntidadDomicilioCalle ;
   private String A88EntidadDomicilioDepto ;
   private String A89EntidadDomicilioCPostal ;
   private String A90EntidadDomicilioCompleto ;
   private String Z85EntidadDomicilioCalle ;
   private String Z88EntidadDomicilioDepto ;
   private String Z89EntidadDomicilioCPostal ;
   private String Z93EntidadTelefonoObs ;
   private com.genexus.webpanels.GXWebGrid Gridentidad_telefonoContainer ;
   private com.genexus.webpanels.GXWebGrid Gridentidad_domicilioContainer ;
   private com.genexus.webpanels.GXWebRow Gridentidad_telefonoRow ;
   private com.genexus.webpanels.GXWebRow Gridentidad_domicilioRow ;
   private com.genexus.webpanels.GXWebColumn Gridentidad_telefonoColumn ;
   private com.genexus.webpanels.GXWebColumn Gridentidad_domicilioColumn ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbEntidadTipo ;
   private ICheckbox chkEntidadActiva ;
   private IDataStoreProvider pr_default ;
   private int[] T000I19_A81EntidadId ;
   private String[] T000I19_A82EntidadNombre ;
   private String[] T000I19_A83EntidadNumeroDocumento ;
   private byte[] T000I19_A94EntidadTipo ;
   private boolean[] T000I19_A95EntidadActiva ;
   private short[] T000I19_A102EntidadTipoDocumentoId ;
   private short[] T000I19_A103EntidadCondCpraVtaId ;
   private short[] T000I19_A99EntidadPaisId ;
   private short[] T000I19_A104EntidadCondIvaId ;
   private short[] T000I19_A98EntidadLocalidadId ;
   private short[] T000I19_A100EntidadProvinciaId ;
   private int[] T000I19_A42EmpresaId ;
   private int[] T000I14_A42EmpresaId ;
   private short[] T000I8_A9TipoDocumentoId ;
   private short[] T000I9_A15CondicionCpraVtaId ;
   private short[] T000I10_A3PaisId ;
   private short[] T000I13_A1ProvinciaId ;
   private short[] T000I11_A13CondicionIvaId ;
   private short[] T000I12_A5LocalidadId ;
   private int[] T000I20_A42EmpresaId ;
   private short[] T000I21_A9TipoDocumentoId ;
   private short[] T000I22_A15CondicionCpraVtaId ;
   private int[] T000I23_A42EmpresaId ;
   private int[] T000I23_A81EntidadId ;
   private int[] T000I7_A81EntidadId ;
   private String[] T000I7_A82EntidadNombre ;
   private String[] T000I7_A83EntidadNumeroDocumento ;
   private byte[] T000I7_A94EntidadTipo ;
   private boolean[] T000I7_A95EntidadActiva ;
   private short[] T000I7_A102EntidadTipoDocumentoId ;
   private short[] T000I7_A103EntidadCondCpraVtaId ;
   private short[] T000I7_A99EntidadPaisId ;
   private short[] T000I7_A104EntidadCondIvaId ;
   private short[] T000I7_A98EntidadLocalidadId ;
   private short[] T000I7_A100EntidadProvinciaId ;
   private int[] T000I7_A42EmpresaId ;
   private int[] T000I24_A81EntidadId ;
   private int[] T000I24_A42EmpresaId ;
   private int[] T000I25_A81EntidadId ;
   private int[] T000I25_A42EmpresaId ;
   private int[] T000I6_A81EntidadId ;
   private String[] T000I6_A82EntidadNombre ;
   private String[] T000I6_A83EntidadNumeroDocumento ;
   private byte[] T000I6_A94EntidadTipo ;
   private boolean[] T000I6_A95EntidadActiva ;
   private short[] T000I6_A102EntidadTipoDocumentoId ;
   private short[] T000I6_A103EntidadCondCpraVtaId ;
   private short[] T000I6_A99EntidadPaisId ;
   private short[] T000I6_A104EntidadCondIvaId ;
   private short[] T000I6_A98EntidadLocalidadId ;
   private short[] T000I6_A100EntidadProvinciaId ;
   private int[] T000I6_A42EmpresaId ;
   private int[] T000I29_A42EmpresaId ;
   private int[] T000I29_A81EntidadId ;
   private String[] T000I29_A31CfgComprobanteId ;
   private short[] T000I29_A32CfgComprobantePrefijo ;
   private int[] T000I29_A55ComprobanteNumero ;
   private byte[] T000I29_A35CfgComprobanteDetalleLetra ;
   private int[] T000I30_A42EmpresaId ;
   private int[] T000I30_A81EntidadId ;
   private int[] T000I31_A42EmpresaId ;
   private int[] T000I31_A81EntidadId ;
   private short[] T000I31_A91EntidadTelefonoId ;
   private String[] T000I31_A92EntidadTelefono ;
   private String[] T000I31_A93EntidadTelefonoObs ;
   private int[] T000I32_A42EmpresaId ;
   private int[] T000I32_A81EntidadId ;
   private short[] T000I32_A91EntidadTelefonoId ;
   private int[] T000I5_A42EmpresaId ;
   private int[] T000I5_A81EntidadId ;
   private short[] T000I5_A91EntidadTelefonoId ;
   private String[] T000I5_A92EntidadTelefono ;
   private String[] T000I5_A93EntidadTelefonoObs ;
   private int[] T000I4_A42EmpresaId ;
   private int[] T000I4_A81EntidadId ;
   private short[] T000I4_A91EntidadTelefonoId ;
   private String[] T000I4_A92EntidadTelefono ;
   private String[] T000I4_A93EntidadTelefonoObs ;
   private int[] T000I36_A42EmpresaId ;
   private int[] T000I36_A81EntidadId ;
   private short[] T000I36_A91EntidadTelefonoId ;
   private int[] T000I37_A42EmpresaId ;
   private int[] T000I37_A81EntidadId ;
   private short[] T000I37_A84EntidadDomicilioId ;
   private String[] T000I37_A85EntidadDomicilioCalle ;
   private int[] T000I37_A86EntidadDomicilioNumero ;
   private short[] T000I37_A87EntidadDomicilioPiso ;
   private String[] T000I37_A88EntidadDomicilioDepto ;
   private String[] T000I37_A89EntidadDomicilioCPostal ;
   private int[] T000I38_A42EmpresaId ;
   private int[] T000I38_A81EntidadId ;
   private short[] T000I38_A84EntidadDomicilioId ;
   private int[] T000I3_A42EmpresaId ;
   private int[] T000I3_A81EntidadId ;
   private short[] T000I3_A84EntidadDomicilioId ;
   private String[] T000I3_A85EntidadDomicilioCalle ;
   private int[] T000I3_A86EntidadDomicilioNumero ;
   private short[] T000I3_A87EntidadDomicilioPiso ;
   private String[] T000I3_A88EntidadDomicilioDepto ;
   private String[] T000I3_A89EntidadDomicilioCPostal ;
   private int[] T000I2_A42EmpresaId ;
   private int[] T000I2_A81EntidadId ;
   private short[] T000I2_A84EntidadDomicilioId ;
   private String[] T000I2_A85EntidadDomicilioCalle ;
   private int[] T000I2_A86EntidadDomicilioNumero ;
   private short[] T000I2_A87EntidadDomicilioPiso ;
   private String[] T000I2_A88EntidadDomicilioDepto ;
   private String[] T000I2_A89EntidadDomicilioCPostal ;
   private int[] T000I42_A42EmpresaId ;
   private int[] T000I42_A81EntidadId ;
   private short[] T000I42_A84EntidadDomicilioId ;
   private int[] T000I43_A42EmpresaId ;
   private short[] T000I44_A9TipoDocumentoId ;
   private short[] T000I45_A15CondicionCpraVtaId ;
   private short[] T000I46_A3PaisId ;
   private short[] T000I47_A1ProvinciaId ;
   private short[] T000I48_A13CondicionIvaId ;
   private short[] T000I49_A5LocalidadId ;
   private short[] T000I15_A3PaisId ;
   private short[] T000I16_A13CondicionIvaId ;
   private short[] T000I17_A5LocalidadId ;
   private short[] T000I18_A1ProvinciaId ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class entidad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000I2", "SELECT EmpresaId, EntidadId, EntidadDomicilioId, EntidadDomicilioCalle, EntidadDomicilioNumero, EntidadDomicilioPiso, EntidadDomicilioDepto, EntidadDomicilioCPostal FROM EntidadDomicilio WHERE EmpresaId = ? AND EntidadId = ? AND EntidadDomicilioId = ?  FOR UPDATE OF EntidadDomicilio NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I3", "SELECT EmpresaId, EntidadId, EntidadDomicilioId, EntidadDomicilioCalle, EntidadDomicilioNumero, EntidadDomicilioPiso, EntidadDomicilioDepto, EntidadDomicilioCPostal FROM EntidadDomicilio WHERE EmpresaId = ? AND EntidadId = ? AND EntidadDomicilioId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I4", "SELECT EmpresaId, EntidadId, EntidadTelefonoId, EntidadTelefono, EntidadTelefonoObs FROM EntidadTelefono WHERE EmpresaId = ? AND EntidadId = ? AND EntidadTelefonoId = ?  FOR UPDATE OF EntidadTelefono NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I5", "SELECT EmpresaId, EntidadId, EntidadTelefonoId, EntidadTelefono, EntidadTelefonoObs FROM EntidadTelefono WHERE EmpresaId = ? AND EntidadId = ? AND EntidadTelefonoId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I6", "SELECT EntidadId, EntidadNombre, EntidadNumeroDocumento, EntidadTipo, EntidadActiva, EntidadTipoDocumentoId, EntidadCondCpraVtaId, EntidadPaisId, EntidadCondIvaId, EntidadLocalidadId, EntidadProvinciaId, EmpresaId FROM Entidad WHERE EmpresaId = ? AND EntidadId = ?  FOR UPDATE OF Entidad NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I7", "SELECT EntidadId, EntidadNombre, EntidadNumeroDocumento, EntidadTipo, EntidadActiva, EntidadTipoDocumentoId, EntidadCondCpraVtaId, EntidadPaisId, EntidadCondIvaId, EntidadLocalidadId, EntidadProvinciaId, EmpresaId FROM Entidad WHERE EmpresaId = ? AND EntidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I8", "SELECT TipoDocumentoId FROM TipoDocumento WHERE TipoDocumentoId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I9", "SELECT CondicionCpraVtaId FROM CondicionCpraVta WHERE CondicionCpraVtaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I10", "SELECT PaisId FROM Pais WHERE PaisId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I11", "SELECT CondicionIvaId FROM CondicionIva WHERE CondicionIvaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I12", "SELECT LocalidadId FROM Localidad WHERE LocalidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I13", "SELECT ProvinciaId FROM Provincia WHERE ProvinciaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I14", "SELECT EmpresaId FROM Empresa WHERE EmpresaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I15", "SELECT PaisId FROM Pais WHERE PaisId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I16", "SELECT CondicionIvaId FROM CondicionIva WHERE CondicionIvaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I17", "SELECT LocalidadId FROM Localidad WHERE LocalidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I18", "SELECT ProvinciaId FROM Provincia WHERE ProvinciaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I19", "SELECT TM1.EntidadId, TM1.EntidadNombre, TM1.EntidadNumeroDocumento, TM1.EntidadTipo, TM1.EntidadActiva, TM1.EntidadTipoDocumentoId, TM1.EntidadCondCpraVtaId, TM1.EntidadPaisId, TM1.EntidadCondIvaId, TM1.EntidadLocalidadId, TM1.EntidadProvinciaId, TM1.EmpresaId FROM Entidad TM1 WHERE TM1.EntidadId = ? and TM1.EmpresaId = ? ORDER BY TM1.EmpresaId, TM1.EntidadId ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000I20", "SELECT EmpresaId FROM Empresa WHERE EmpresaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I21", "SELECT TipoDocumentoId FROM TipoDocumento WHERE TipoDocumentoId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I22", "SELECT CondicionCpraVtaId FROM CondicionCpraVta WHERE CondicionCpraVtaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I23", "SELECT EmpresaId, EntidadId FROM Entidad WHERE EmpresaId = ? AND EntidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I24", "SELECT EntidadId, EmpresaId FROM Entidad WHERE ( EntidadId > ? or EntidadId = ? and EmpresaId > ?) ORDER BY EmpresaId, EntidadId  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000I25", "SELECT EntidadId, EmpresaId FROM Entidad WHERE ( EntidadId < ? or EntidadId = ? and EmpresaId < ?) ORDER BY EmpresaId DESC, EntidadId DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000I26", "SAVEPOINT gxupdate;INSERT INTO Entidad(EntidadId, EntidadNombre, EntidadNumeroDocumento, EntidadTipo, EntidadActiva, EntidadTipoDocumentoId, EntidadCondCpraVtaId, EntidadPaisId, EntidadCondIvaId, EntidadLocalidadId, EntidadProvinciaId, EmpresaId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000I27", "SAVEPOINT gxupdate;UPDATE Entidad SET EntidadNombre=?, EntidadNumeroDocumento=?, EntidadTipo=?, EntidadActiva=?, EntidadTipoDocumentoId=?, EntidadCondCpraVtaId=?, EntidadPaisId=?, EntidadCondIvaId=?, EntidadLocalidadId=?, EntidadProvinciaId=?  WHERE EmpresaId = ? AND EntidadId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000I28", "SAVEPOINT gxupdate;DELETE FROM Entidad  WHERE EmpresaId = ? AND EntidadId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000I29", "SELECT EmpresaId, EntidadId, CfgComprobanteId, CfgComprobantePrefijo, ComprobanteNumero, CfgComprobanteDetalleLetra FROM Comprobante WHERE EmpresaId = ? AND EntidadId = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000I30", "SELECT EmpresaId, EntidadId FROM Entidad ORDER BY EmpresaId, EntidadId ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000I31", "SELECT EmpresaId, EntidadId, EntidadTelefonoId, EntidadTelefono, EntidadTelefonoObs FROM EntidadTelefono WHERE EmpresaId = ? and EntidadId = ? and EntidadTelefonoId = ? ORDER BY EmpresaId, EntidadId, EntidadTelefonoId ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000I32", "SELECT EmpresaId, EntidadId, EntidadTelefonoId FROM EntidadTelefono WHERE EmpresaId = ? AND EntidadId = ? AND EntidadTelefonoId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000I33", "SAVEPOINT gxupdate;INSERT INTO EntidadTelefono(EmpresaId, EntidadId, EntidadTelefonoId, EntidadTelefono, EntidadTelefonoObs) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000I34", "SAVEPOINT gxupdate;UPDATE EntidadTelefono SET EntidadTelefono=?, EntidadTelefonoObs=?  WHERE EmpresaId = ? AND EntidadId = ? AND EntidadTelefonoId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000I35", "SAVEPOINT gxupdate;DELETE FROM EntidadTelefono  WHERE EmpresaId = ? AND EntidadId = ? AND EntidadTelefonoId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000I36", "SELECT EmpresaId, EntidadId, EntidadTelefonoId FROM EntidadTelefono WHERE EmpresaId = ? and EntidadId = ? ORDER BY EmpresaId, EntidadId, EntidadTelefonoId ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000I37", "SELECT EmpresaId, EntidadId, EntidadDomicilioId, EntidadDomicilioCalle, EntidadDomicilioNumero, EntidadDomicilioPiso, EntidadDomicilioDepto, EntidadDomicilioCPostal FROM EntidadDomicilio WHERE EmpresaId = ? and EntidadId = ? and EntidadDomicilioId = ? ORDER BY EmpresaId, EntidadId, EntidadDomicilioId ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000I38", "SELECT EmpresaId, EntidadId, EntidadDomicilioId FROM EntidadDomicilio WHERE EmpresaId = ? AND EntidadId = ? AND EntidadDomicilioId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000I39", "SAVEPOINT gxupdate;INSERT INTO EntidadDomicilio(EmpresaId, EntidadId, EntidadDomicilioId, EntidadDomicilioCalle, EntidadDomicilioNumero, EntidadDomicilioPiso, EntidadDomicilioDepto, EntidadDomicilioCPostal) VALUES(?, ?, ?, ?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000I40", "SAVEPOINT gxupdate;UPDATE EntidadDomicilio SET EntidadDomicilioCalle=?, EntidadDomicilioNumero=?, EntidadDomicilioPiso=?, EntidadDomicilioDepto=?, EntidadDomicilioCPostal=?  WHERE EmpresaId = ? AND EntidadId = ? AND EntidadDomicilioId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000I41", "SAVEPOINT gxupdate;DELETE FROM EntidadDomicilio  WHERE EmpresaId = ? AND EntidadId = ? AND EntidadDomicilioId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000I42", "SELECT EmpresaId, EntidadId, EntidadDomicilioId FROM EntidadDomicilio WHERE EmpresaId = ? and EntidadId = ? ORDER BY EmpresaId, EntidadId, EntidadDomicilioId ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000I43", "SELECT EmpresaId FROM Empresa WHERE EmpresaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I44", "SELECT TipoDocumentoId FROM TipoDocumento WHERE TipoDocumentoId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I45", "SELECT CondicionCpraVtaId FROM CondicionCpraVta WHERE CondicionCpraVtaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I46", "SELECT PaisId FROM Pais WHERE PaisId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I47", "SELECT ProvinciaId FROM Provincia WHERE ProvinciaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I48", "SELECT CondicionIvaId FROM CondicionIva WHERE CondicionIvaId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I49", "SELECT LocalidadId FROM Localidad WHERE LocalidadId = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 20) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 20) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 13) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((boolean[]) buf[4])[0] = rslt.getBoolean(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((int[]) buf[11])[0] = rslt.getInt(12) ;
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 13) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((boolean[]) buf[4])[0] = rslt.getBoolean(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((int[]) buf[11])[0] = rslt.getInt(12) ;
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 13) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((boolean[]) buf[4])[0] = rslt.getBoolean(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((int[]) buf[11])[0] = rslt.getInt(12) ;
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 19 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 20) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 34 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 35 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 36 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 40 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 41 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 42 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 43 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 44 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 45 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 46 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 47 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 20 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 250, false);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBoolean(5, ((Boolean) parms[4]).booleanValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 250, false);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBoolean(4, ((Boolean) parms[3]).booleanValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 31 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 20);
               stmt.setVarchar(5, (String)parms[4], 200, false);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 33 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 34 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 36 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 37 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 150, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 10, false);
               stmt.setVarchar(8, (String)parms[7], 10, false);
               return;
            case 38 :
               stmt.setVarchar(1, (String)parms[0], 150, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 10, false);
               stmt.setVarchar(5, (String)parms[4], 10, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 39 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 40 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 41 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 42 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 43 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 44 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 45 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 46 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 47 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

