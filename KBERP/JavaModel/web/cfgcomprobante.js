/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:32:9.97
*/
gx.evt.autoSkip = false;
gx.define('cfgcomprobante', false, function () {
   this.ServerClass =  "cfgcomprobante" ;
   this.PackageName =  "com.kberp" ;
   this.setObjectType("trn");
   this.hasEnterEvent = true;
   this.skipOnEnter = false;
   this.fullAjax = true;
   this.supportAjaxEvents =  true ;
   this.ajaxSecurityToken =  true ;
   this.SetStandaloneVars=function()
   {
      this.Gx_mode=gx.fn.getControlValue("vMODE") ;
   };
   this.Valid_Cfgcomprobanteid=function()
   {
      try {
         var gxballoon = gx.util.balloon.getNew("CFGCOMPROBANTEID");
         this.AnyError  = 0;

      }
      catch(e){}
      try {
         if (gxballoon == null) return true; return gxballoon.show();
      }
      catch(e){}
      return true ;
   }
   this.Valid_Cfgcomprobanteprefijo=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Cfgcomprobanteprefijo",["gx.O.A31CfgComprobanteId", "gx.O.A32CfgComprobantePrefijo", "gx.O.A33CfgComprobanteNombre", "gx.O.A34CfgComprobanteSistema"],["A33CfgComprobanteNombre", "A34CfgComprobanteSistema", "Gx_mode", "Z31CfgComprobanteId", "Z32CfgComprobantePrefijo", "Z33CfgComprobanteNombre", "Z34CfgComprobanteSistema", "Gridcfgcomprobante_detalle", ["BTN_DELETE","Enabled"], ["BTN_ENTER","Enabled"]]);
      return true;
   }
   this.Valid_Cfgcomprobantesistema=function()
   {
      try {
         var gxballoon = gx.util.balloon.getNew("CFGCOMPROBANTESISTEMA");
         this.AnyError  = 0;
         if ( ! ( this.A34CfgComprobanteSistema == 1 || this.A34CfgComprobanteSistema == 2 || this.A34CfgComprobanteSistema == 3 || this.A34CfgComprobanteSistema == 4 ) )
         {
            try {
               gxballoon.setError("Campo Cfg Comprobante Sistema fuera de rango");
               this.AnyError = gx.num.trunc( 1 ,0) ;
            }
            catch(e){}
         }

      }
      catch(e){}
      try {
         if (gxballoon == null) return true; return gxballoon.show();
      }
      catch(e){}
      return true ;
   }
   this.Valid_Cfgcomprobantedetalleletra=function()
   {
      try {
         if(  gx.fn.currentGridRowImpl(54) ===0) {
            return true;
         }
         var gxballoon = gx.util.balloon.getNew("CFGCOMPROBANTEDETALLELETRA", gx.fn.currentGridRowImpl(54));
         this.AnyError  = 0;
         this.sMode12 =  this.Gx_mode  ;
         this.Gx_mode =  gx.fn.getGridRowMode(12,54)  ;
         this.standaloneModal0B12( );
         this.standaloneNotModal0B12( );
         if ( gx.fn.gridDuplicateKey(55) )
         {
            gxballoon.setError(gx.text.format( gx.getMessage( "GXM_1004"), "Detalle", "", "", "", "", "", "", "", ""));
            this.AnyError = gx.num.trunc( 1 ,0) ;
         }
         if ( ! ( this.A35CfgComprobanteDetalleLetra == 1 || this.A35CfgComprobanteDetalleLetra == 2 || this.A35CfgComprobanteDetalleLetra == 3 || this.A35CfgComprobanteDetalleLetra == 4 || this.A35CfgComprobanteDetalleLetra == 5 || this.A35CfgComprobanteDetalleLetra == 6 || this.A35CfgComprobanteDetalleLetra == 7 ) )
         {
            try {
               gxballoon.setError("Campo Cfg Comprobante Detalle Letra fuera de rango");
               this.AnyError = gx.num.trunc( 1 ,0) ;
            }
            catch(e){}
         }

      }
      catch(e){}
      try {
         this.Gx_mode =  this.sMode12  ;
         if (gxballoon == null) return true; return gxballoon.show();
      }
      catch(e){}
      return true ;
   }
   this.standaloneModal0B12=function()
   {
      try {
         if ( this.Gx_mode != "INS" )
         {
            gx.fn.setCtrlProperty("CFGCOMPROBANTEDETALLELETRA","Enabled", 0 );
         }
         else
         {
            gx.fn.setCtrlProperty("CFGCOMPROBANTEDETALLELETRA","Enabled", 1 );
         }
      }
      catch(e){}
      return true;
   }
   this.standaloneNotModal0B12=function()
   {
      return true;
   }
   this.e110b11_client=function()
   {
      this.executeServerEvent("ENTER", true, null, false, false);
   };
   this.e120b11_client=function()
   {
      this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,55,56,57,58,59,60,61,62,63,64,65,66,67];
   this.GXLastCtrlId =67;
   this.Gridcfgcomprobante_detalleContainer = new gx.grid.grid(this, 12,"Detalle",54,"Gridcfgcomprobante_detalle","Gridcfgcomprobante_detalle","Gridcfgcomprobante_detalleContainer",this.CmpContext,this.IsMasterPage,"cfgcomprobante",[35],false,1,false,true,5,false,false,false,"",0,"px","Nueva fila",true,false,false,null,null,false,"",false,[1,1,1,1],false,0,true,false);
   var Gridcfgcomprobante_detalleContainer = this.Gridcfgcomprobante_detalleContainer;
   Gridcfgcomprobante_detalleContainer.addComboBox(35,55,"CFGCOMPROBANTEDETALLELETRA","Detalle Letra","CfgComprobanteDetalleLetra","int",null,1,true,false,0,"px","");
   Gridcfgcomprobante_detalleContainer.addSingleLineEdit(36,56,"CFGCOMPROBANTEDETALLENRODESDE","Nro Desde","","CfgComprobanteDetalleNroDesde","int",0,"px",8,8,"right",null,[],36,"CfgComprobanteDetalleNroDesde",true,0,false,false,"Attribute",1,"");
   Gridcfgcomprobante_detalleContainer.addSingleLineEdit(37,57,"CFGCOMPROBANTEDETALLENROHASTA","Nro Hasta","","CfgComprobanteDetalleNroHasta","int",0,"px",8,8,"right",null,[],37,"CfgComprobanteDetalleNroHasta",true,0,false,false,"Attribute",1,"");
   Gridcfgcomprobante_detalleContainer.addSingleLineEdit(38,58,"CFGCOMPROBANTEDETALLENROULTIMO","Nro Ultimo","","CfgComprobanteDetalleNroUltimo","int",0,"px",8,8,"right",null,[],38,"CfgComprobanteDetalleNroUltimo",true,0,false,false,"Attribute",1,"");
   this.Gridcfgcomprobante_detalleContainer.emptyText = "";
   this.setGrid(Gridcfgcomprobante_detalleContainer);
   GXValidFnc[2]={fld:"",grid:0};
   GXValidFnc[3]={fld:"MAINTABLE",grid:0};
   GXValidFnc[4]={fld:"",grid:0};
   GXValidFnc[5]={fld:"",grid:0};
   GXValidFnc[6]={fld:"TITLECONTAINER",grid:0};
   GXValidFnc[7]={fld:"",grid:0};
   GXValidFnc[8]={fld:"",grid:0};
   GXValidFnc[9]={fld:"TITLE", format:0,grid:0};
   GXValidFnc[10]={fld:"",grid:0};
   GXValidFnc[11]={fld:"",grid:0};
   GXValidFnc[13]={fld:"",grid:0};
   GXValidFnc[14]={fld:"",grid:0};
   GXValidFnc[15]={fld:"FORMCONTAINER",grid:0};
   GXValidFnc[16]={fld:"",grid:0};
   GXValidFnc[17]={fld:"TOOLBARCELL",grid:0};
   GXValidFnc[18]={fld:"",grid:0};
   GXValidFnc[19]={fld:"",grid:0};
   GXValidFnc[20]={fld:"",grid:0};
   GXValidFnc[21]={fld:"BTN_FIRST",grid:0};
   GXValidFnc[22]={fld:"",grid:0};
   GXValidFnc[23]={fld:"BTN_PREVIOUS",grid:0};
   GXValidFnc[24]={fld:"",grid:0};
   GXValidFnc[25]={fld:"BTN_NEXT",grid:0};
   GXValidFnc[26]={fld:"",grid:0};
   GXValidFnc[27]={fld:"BTN_LAST",grid:0};
   GXValidFnc[28]={fld:"",grid:0};
   GXValidFnc[29]={fld:"BTN_SELECT",grid:0};
   GXValidFnc[30]={fld:"",grid:0};
   GXValidFnc[31]={fld:"",grid:0};
   GXValidFnc[32]={fld:"",grid:0};
   GXValidFnc[33]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Cfgcomprobanteid,isvalid:null,rgrid:[this.Gridcfgcomprobante_detalleContainer],fld:"CFGCOMPROBANTEID",gxz:"Z31CfgComprobanteId",gxold:"O31CfgComprobanteId",gxvar:"A31CfgComprobanteId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A31CfgComprobanteId=Value},v2z:function(Value){gx.O.Z31CfgComprobanteId=Value},v2c:function(){gx.fn.setControlValue("CFGCOMPROBANTEID",gx.O.A31CfgComprobanteId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A31CfgComprobanteId=this.val()},val:function(){return gx.fn.getControlValue("CFGCOMPROBANTEID")},nac:gx.falseFn};
   this.declareDomainHdlr( 33 , function() {
   });
   GXValidFnc[34]={fld:"",grid:0};
   GXValidFnc[35]={fld:"",grid:0};
   GXValidFnc[36]={fld:"",grid:0};
   GXValidFnc[37]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Cfgcomprobanteprefijo,isvalid:null,rgrid:[this.Gridcfgcomprobante_detalleContainer],fld:"CFGCOMPROBANTEPREFIJO",gxz:"Z32CfgComprobantePrefijo",gxold:"O32CfgComprobantePrefijo",gxvar:"A32CfgComprobantePrefijo",ucs:[],op:[45,41],ip:[45,41,37,33],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A32CfgComprobantePrefijo=gx.num.intval(Value)},v2z:function(Value){gx.O.Z32CfgComprobantePrefijo=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("CFGCOMPROBANTEPREFIJO",gx.O.A32CfgComprobantePrefijo,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A32CfgComprobantePrefijo=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CFGCOMPROBANTEPREFIJO",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 37 , function() {
   });
   GXValidFnc[38]={fld:"",grid:0};
   GXValidFnc[39]={fld:"",grid:0};
   GXValidFnc[40]={fld:"",grid:0};
   GXValidFnc[41]={lvl:0,type:"svchar",len:250,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CFGCOMPROBANTENOMBRE",gxz:"Z33CfgComprobanteNombre",gxold:"O33CfgComprobanteNombre",gxvar:"A33CfgComprobanteNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A33CfgComprobanteNombre=Value},v2z:function(Value){gx.O.Z33CfgComprobanteNombre=Value},v2c:function(){gx.fn.setControlValue("CFGCOMPROBANTENOMBRE",gx.O.A33CfgComprobanteNombre,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A33CfgComprobanteNombre=this.val()},val:function(){return gx.fn.getControlValue("CFGCOMPROBANTENOMBRE")},nac:gx.falseFn};
   this.declareDomainHdlr( 41 , function() {
   });
   GXValidFnc[42]={fld:"",grid:0};
   GXValidFnc[43]={fld:"",grid:0};
   GXValidFnc[44]={fld:"",grid:0};
   GXValidFnc[45]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Cfgcomprobantesistema,isvalid:null,rgrid:[],fld:"CFGCOMPROBANTESISTEMA",gxz:"Z34CfgComprobanteSistema",gxold:"O34CfgComprobanteSistema",gxvar:"A34CfgComprobanteSistema",ucs:[],op:[45],ip:[45],nacdep:[],ctrltype:"combo",v2v:function(Value){gx.O.A34CfgComprobanteSistema=gx.num.intval(Value)},v2z:function(Value){gx.O.Z34CfgComprobanteSistema=gx.num.intval(Value)},v2c:function(){gx.fn.setComboBoxValue("CFGCOMPROBANTESISTEMA",gx.O.A34CfgComprobanteSistema);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A34CfgComprobanteSistema=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CFGCOMPROBANTESISTEMA",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 45 , function() {
   });
   GXValidFnc[46]={fld:"",grid:0};
   GXValidFnc[47]={fld:"",grid:0};
   GXValidFnc[48]={fld:"DETALLETABLE",grid:0};
   GXValidFnc[49]={fld:"",grid:0};
   GXValidFnc[50]={fld:"",grid:0};
   GXValidFnc[51]={fld:"TITLEDETALLE", format:0,grid:0};
   GXValidFnc[52]={fld:"",grid:0};
   GXValidFnc[53]={fld:"",grid:0};
   GXValidFnc[55]={lvl:12,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,isacc:1,grid:54,gxgrid:this.Gridcfgcomprobante_detalleContainer,fnc:this.Valid_Cfgcomprobantedetalleletra,isvalid:null,rgrid:[],fld:"CFGCOMPROBANTEDETALLELETRA",gxz:"Z35CfgComprobanteDetalleLetra",gxold:"O35CfgComprobanteDetalleLetra",gxvar:"A35CfgComprobanteDetalleLetra",ucs:[],op:[55],ip:[55],nacdep:[],ctrltype:"combo",inputType:'text',v2v:function(Value){gx.O.A35CfgComprobanteDetalleLetra=gx.num.intval(Value)},v2z:function(Value){gx.O.Z35CfgComprobanteDetalleLetra=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridComboBoxValue("CFGCOMPROBANTEDETALLELETRA",row || gx.fn.currentGridRowImpl(54),gx.O.A35CfgComprobanteDetalleLetra);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A35CfgComprobanteDetalleLetra=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("CFGCOMPROBANTEDETALLELETRA",row || gx.fn.currentGridRowImpl(54),'.')},nac:gx.falseFn};
   GXValidFnc[56]={lvl:12,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:0,isacc:1,grid:54,gxgrid:this.Gridcfgcomprobante_detalleContainer,fnc:null,isvalid:null,rgrid:[],fld:"CFGCOMPROBANTEDETALLENRODESDE",gxz:"Z36CfgComprobanteDetalleNroDesde",gxold:"O36CfgComprobanteDetalleNroDesde",gxvar:"A36CfgComprobanteDetalleNroDesde",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A36CfgComprobanteDetalleNroDesde=gx.num.intval(Value)},v2z:function(Value){gx.O.Z36CfgComprobanteDetalleNroDesde=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("CFGCOMPROBANTEDETALLENRODESDE",row || gx.fn.currentGridRowImpl(54),gx.O.A36CfgComprobanteDetalleNroDesde,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A36CfgComprobanteDetalleNroDesde=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("CFGCOMPROBANTEDETALLENRODESDE",row || gx.fn.currentGridRowImpl(54),'.')},nac:gx.falseFn};
   GXValidFnc[57]={lvl:12,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:0,isacc:1,grid:54,gxgrid:this.Gridcfgcomprobante_detalleContainer,fnc:null,isvalid:null,rgrid:[],fld:"CFGCOMPROBANTEDETALLENROHASTA",gxz:"Z37CfgComprobanteDetalleNroHasta",gxold:"O37CfgComprobanteDetalleNroHasta",gxvar:"A37CfgComprobanteDetalleNroHasta",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A37CfgComprobanteDetalleNroHasta=gx.num.intval(Value)},v2z:function(Value){gx.O.Z37CfgComprobanteDetalleNroHasta=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("CFGCOMPROBANTEDETALLENROHASTA",row || gx.fn.currentGridRowImpl(54),gx.O.A37CfgComprobanteDetalleNroHasta,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A37CfgComprobanteDetalleNroHasta=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("CFGCOMPROBANTEDETALLENROHASTA",row || gx.fn.currentGridRowImpl(54),'.')},nac:gx.falseFn};
   GXValidFnc[58]={lvl:12,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:0,isacc:1,grid:54,gxgrid:this.Gridcfgcomprobante_detalleContainer,fnc:null,isvalid:null,rgrid:[],fld:"CFGCOMPROBANTEDETALLENROULTIMO",gxz:"Z38CfgComprobanteDetalleNroUltimo",gxold:"O38CfgComprobanteDetalleNroUltimo",gxvar:"A38CfgComprobanteDetalleNroUltimo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A38CfgComprobanteDetalleNroUltimo=gx.num.intval(Value)},v2z:function(Value){gx.O.Z38CfgComprobanteDetalleNroUltimo=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("CFGCOMPROBANTEDETALLENROULTIMO",row || gx.fn.currentGridRowImpl(54),gx.O.A38CfgComprobanteDetalleNroUltimo,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A38CfgComprobanteDetalleNroUltimo=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("CFGCOMPROBANTEDETALLENROULTIMO",row || gx.fn.currentGridRowImpl(54),'.')},nac:gx.falseFn};
   GXValidFnc[59]={fld:"",grid:0};
   GXValidFnc[60]={fld:"",grid:0};
   GXValidFnc[61]={fld:"",grid:0};
   GXValidFnc[62]={fld:"",grid:0};
   GXValidFnc[63]={fld:"BTN_ENTER",grid:0};
   GXValidFnc[64]={fld:"",grid:0};
   GXValidFnc[65]={fld:"BTN_CANCEL",grid:0};
   GXValidFnc[66]={fld:"",grid:0};
   GXValidFnc[67]={fld:"BTN_DELETE",grid:0};
   this.A31CfgComprobanteId = "" ;
   this.Z31CfgComprobanteId = "" ;
   this.O31CfgComprobanteId = "" ;
   this.A32CfgComprobantePrefijo = 0 ;
   this.Z32CfgComprobantePrefijo = 0 ;
   this.O32CfgComprobantePrefijo = 0 ;
   this.A33CfgComprobanteNombre = "" ;
   this.Z33CfgComprobanteNombre = "" ;
   this.O33CfgComprobanteNombre = "" ;
   this.A34CfgComprobanteSistema = 0 ;
   this.Z34CfgComprobanteSistema = 0 ;
   this.O34CfgComprobanteSistema = 0 ;
   this.Z35CfgComprobanteDetalleLetra = 0 ;
   this.O35CfgComprobanteDetalleLetra = 0 ;
   this.Z36CfgComprobanteDetalleNroDesde = 0 ;
   this.O36CfgComprobanteDetalleNroDesde = 0 ;
   this.Z37CfgComprobanteDetalleNroHasta = 0 ;
   this.O37CfgComprobanteDetalleNroHasta = 0 ;
   this.Z38CfgComprobanteDetalleNroUltimo = 0 ;
   this.O38CfgComprobanteDetalleNroUltimo = 0 ;
   this.A35CfgComprobanteDetalleLetra = 0 ;
   this.A36CfgComprobanteDetalleNroDesde = 0 ;
   this.A37CfgComprobanteDetalleNroHasta = 0 ;
   this.A38CfgComprobanteDetalleNroUltimo = 0 ;
   this.A31CfgComprobanteId = "" ;
   this.A32CfgComprobantePrefijo = 0 ;
   this.A33CfgComprobanteNombre = "" ;
   this.A34CfgComprobanteSistema = 0 ;
   this.Events = {"e110b11_client": ["ENTER", true] ,"e120b11_client": ["CANCEL", true]};
   this.EvtParms["ENTER"] = [[{postForm:true}],[]];
   this.EvtParms["REFRESH"] = [[],[]];
   this.EnterCtrl = ["BTN_ENTER"];
   this.setVCMap("Gx_mode", "vMODE", 0, "char");
   this.Initialize( );
});
gx.createParentObj(cfgcomprobante);
