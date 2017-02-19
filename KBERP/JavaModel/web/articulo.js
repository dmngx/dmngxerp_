/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:32:10.74
*/
gx.evt.autoSkip = false;
gx.define('articulo', false, function () {
   this.ServerClass =  "articulo" ;
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
   this.Valid_Articuloid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Articuloid",["gx.O.A39ArticuloId", "gx.O.A40ArticuloNombre", "gx.num.urlDecimal(gx.O.A41ArticuloCosto,\'.\',\',\')", "gx.O.A7MarcaId", "gx.O.A11RubroId", "gx.O.A17AlicuotaIvaId"],["A40ArticuloNombre", "A7MarcaId", "A11RubroId", "A17AlicuotaIvaId", "A41ArticuloCosto", "A8MarcaNombre", "A12RubroNombre", "A18AlicuotaIvaNombre", "Gx_mode", "Z39ArticuloId", "Z40ArticuloNombre", "Z7MarcaId", "Z11RubroId", "Z17AlicuotaIvaId", "Z41ArticuloCosto", "Z8MarcaNombre", "Z12RubroNombre", "Z18AlicuotaIvaNombre", ["BTN_DELETE","Enabled"], ["BTN_ENTER","Enabled"]]);
      return true;
   }
   this.Valid_Marcaid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Marcaid",["gx.O.A7MarcaId", "gx.O.A8MarcaNombre"],["A8MarcaNombre"]);
      return true;
   }
   this.Valid_Rubroid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Rubroid",["gx.O.A11RubroId", "gx.O.A12RubroNombre"],["A12RubroNombre"]);
      return true;
   }
   this.Valid_Alicuotaivaid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Alicuotaivaid",["gx.O.A17AlicuotaIvaId", "gx.O.A18AlicuotaIvaNombre"],["A18AlicuotaIvaNombre"]);
      return true;
   }
   this.e110c13_client=function()
   {
      this.executeServerEvent("ENTER", true, null, false, false);
   };
   this.e120c13_client=function()
   {
      this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77];
   this.GXLastCtrlId =77;
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
   GXValidFnc[33]={lvl:0,type:"svchar",len:15,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Articuloid,isvalid:null,rgrid:[],fld:"ARTICULOID",gxz:"Z39ArticuloId",gxold:"O39ArticuloId",gxvar:"A39ArticuloId",ucs:[],op:[57,49,41,65,37],ip:[57,49,41,65,37,33],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A39ArticuloId=Value},v2z:function(Value){gx.O.Z39ArticuloId=Value},v2c:function(){gx.fn.setControlValue("ARTICULOID",gx.O.A39ArticuloId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A39ArticuloId=this.val()},val:function(){return gx.fn.getControlValue("ARTICULOID")},nac:gx.falseFn};
   this.declareDomainHdlr( 33 , function() {
   });
   GXValidFnc[34]={fld:"",grid:0};
   GXValidFnc[35]={fld:"",grid:0};
   GXValidFnc[36]={fld:"",grid:0};
   GXValidFnc[37]={lvl:0,type:"svchar",len:250,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"ARTICULONOMBRE",gxz:"Z40ArticuloNombre",gxold:"O40ArticuloNombre",gxvar:"A40ArticuloNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A40ArticuloNombre=Value},v2z:function(Value){gx.O.Z40ArticuloNombre=Value},v2c:function(){gx.fn.setControlValue("ARTICULONOMBRE",gx.O.A40ArticuloNombre,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A40ArticuloNombre=this.val()},val:function(){return gx.fn.getControlValue("ARTICULONOMBRE")},nac:gx.falseFn};
   this.declareDomainHdlr( 37 , function() {
   });
   GXValidFnc[38]={fld:"",grid:0};
   GXValidFnc[39]={fld:"",grid:0};
   GXValidFnc[40]={fld:"",grid:0};
   GXValidFnc[41]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Marcaid,isvalid:null,rgrid:[],fld:"MARCAID",gxz:"Z7MarcaId",gxold:"O7MarcaId",gxvar:"A7MarcaId",ucs:[],op:[45],ip:[45,41],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A7MarcaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z7MarcaId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("MARCAID",gx.O.A7MarcaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A7MarcaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("MARCAID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 41 , function() {
   });
   GXValidFnc[42]={fld:"",grid:0};
   GXValidFnc[43]={fld:"",grid:0};
   GXValidFnc[44]={fld:"",grid:0};
   GXValidFnc[45]={lvl:0,type:"svchar",len:250,dec:0,sign:false,ro:1,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"MARCANOMBRE",gxz:"Z8MarcaNombre",gxold:"O8MarcaNombre",gxvar:"A8MarcaNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A8MarcaNombre=Value},v2z:function(Value){gx.O.Z8MarcaNombre=Value},v2c:function(){gx.fn.setControlValue("MARCANOMBRE",gx.O.A8MarcaNombre,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A8MarcaNombre=this.val()},val:function(){return gx.fn.getControlValue("MARCANOMBRE")},nac:gx.falseFn};
   this.declareDomainHdlr( 45 , function() {
   });
   GXValidFnc[46]={fld:"",grid:0};
   GXValidFnc[47]={fld:"",grid:0};
   GXValidFnc[48]={fld:"",grid:0};
   GXValidFnc[49]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Rubroid,isvalid:null,rgrid:[],fld:"RUBROID",gxz:"Z11RubroId",gxold:"O11RubroId",gxvar:"A11RubroId",ucs:[],op:[53],ip:[53,49],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A11RubroId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z11RubroId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("RUBROID",gx.O.A11RubroId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A11RubroId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("RUBROID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 49 , function() {
   });
   GXValidFnc[50]={fld:"",grid:0};
   GXValidFnc[51]={fld:"",grid:0};
   GXValidFnc[52]={fld:"",grid:0};
   GXValidFnc[53]={lvl:0,type:"svchar",len:250,dec:0,sign:false,ro:1,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"RUBRONOMBRE",gxz:"Z12RubroNombre",gxold:"O12RubroNombre",gxvar:"A12RubroNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A12RubroNombre=Value},v2z:function(Value){gx.O.Z12RubroNombre=Value},v2c:function(){gx.fn.setControlValue("RUBRONOMBRE",gx.O.A12RubroNombre,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A12RubroNombre=this.val()},val:function(){return gx.fn.getControlValue("RUBRONOMBRE")},nac:gx.falseFn};
   this.declareDomainHdlr( 53 , function() {
   });
   GXValidFnc[54]={fld:"",grid:0};
   GXValidFnc[55]={fld:"",grid:0};
   GXValidFnc[56]={fld:"",grid:0};
   GXValidFnc[57]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Alicuotaivaid,isvalid:null,rgrid:[],fld:"ALICUOTAIVAID",gxz:"Z17AlicuotaIvaId",gxold:"O17AlicuotaIvaId",gxvar:"A17AlicuotaIvaId",ucs:[],op:[61],ip:[61,57],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A17AlicuotaIvaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z17AlicuotaIvaId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("ALICUOTAIVAID",gx.O.A17AlicuotaIvaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A17AlicuotaIvaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ALICUOTAIVAID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 57 , function() {
   });
   GXValidFnc[58]={fld:"",grid:0};
   GXValidFnc[59]={fld:"",grid:0};
   GXValidFnc[60]={fld:"",grid:0};
   GXValidFnc[61]={lvl:0,type:"svchar",len:250,dec:0,sign:false,ro:1,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"ALICUOTAIVANOMBRE",gxz:"Z18AlicuotaIvaNombre",gxold:"O18AlicuotaIvaNombre",gxvar:"A18AlicuotaIvaNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A18AlicuotaIvaNombre=Value},v2z:function(Value){gx.O.Z18AlicuotaIvaNombre=Value},v2c:function(){gx.fn.setControlValue("ALICUOTAIVANOMBRE",gx.O.A18AlicuotaIvaNombre,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A18AlicuotaIvaNombre=this.val()},val:function(){return gx.fn.getControlValue("ALICUOTAIVANOMBRE")},nac:gx.falseFn};
   this.declareDomainHdlr( 61 , function() {
   });
   GXValidFnc[62]={fld:"",grid:0};
   GXValidFnc[63]={fld:"",grid:0};
   GXValidFnc[64]={fld:"",grid:0};
   GXValidFnc[65]={lvl:0,type:"decimal",len:12,dec:2,sign:false,pic:"ZZZZZZZZ9.99",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"ARTICULOCOSTO",gxz:"Z41ArticuloCosto",gxold:"O41ArticuloCosto",gxvar:"A41ArticuloCosto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A41ArticuloCosto=gx.fn.toDecimalValue(Value,',','.')},v2z:function(Value){gx.O.Z41ArticuloCosto=gx.fn.toDecimalValue(Value,'.',',')},v2c:function(){gx.fn.setDecimalValue("ARTICULOCOSTO",gx.O.A41ArticuloCosto,2,',');if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A41ArticuloCosto=this.val()},val:function(){return gx.fn.getDecimalValue("ARTICULOCOSTO",'.',',')},nac:gx.falseFn};
   this.declareDomainHdlr( 65 , function() {
   });
   GXValidFnc[66]={fld:"",grid:0};
   GXValidFnc[67]={fld:"",grid:0};
   GXValidFnc[68]={fld:"",grid:0};
   GXValidFnc[69]={fld:"",grid:0};
   GXValidFnc[70]={fld:"BTN_ENTER",grid:0};
   GXValidFnc[71]={fld:"",grid:0};
   GXValidFnc[72]={fld:"BTN_CANCEL",grid:0};
   GXValidFnc[73]={fld:"",grid:0};
   GXValidFnc[74]={fld:"BTN_DELETE",grid:0};
   GXValidFnc[75]={fld:"PROMPT_7",grid:13};
   GXValidFnc[76]={fld:"PROMPT_11",grid:13};
   GXValidFnc[77]={fld:"PROMPT_17",grid:13};
   this.A39ArticuloId = "" ;
   this.Z39ArticuloId = "" ;
   this.O39ArticuloId = "" ;
   this.A40ArticuloNombre = "" ;
   this.Z40ArticuloNombre = "" ;
   this.O40ArticuloNombre = "" ;
   this.A7MarcaId = 0 ;
   this.Z7MarcaId = 0 ;
   this.O7MarcaId = 0 ;
   this.A8MarcaNombre = "" ;
   this.Z8MarcaNombre = "" ;
   this.O8MarcaNombre = "" ;
   this.A11RubroId = 0 ;
   this.Z11RubroId = 0 ;
   this.O11RubroId = 0 ;
   this.A12RubroNombre = "" ;
   this.Z12RubroNombre = "" ;
   this.O12RubroNombre = "" ;
   this.A17AlicuotaIvaId = 0 ;
   this.Z17AlicuotaIvaId = 0 ;
   this.O17AlicuotaIvaId = 0 ;
   this.A18AlicuotaIvaNombre = "" ;
   this.Z18AlicuotaIvaNombre = "" ;
   this.O18AlicuotaIvaNombre = "" ;
   this.A41ArticuloCosto = 0 ;
   this.Z41ArticuloCosto = 0 ;
   this.O41ArticuloCosto = 0 ;
   this.A39ArticuloId = "" ;
   this.A40ArticuloNombre = "" ;
   this.A7MarcaId = 0 ;
   this.A8MarcaNombre = "" ;
   this.A11RubroId = 0 ;
   this.A12RubroNombre = "" ;
   this.A17AlicuotaIvaId = 0 ;
   this.A18AlicuotaIvaNombre = "" ;
   this.A41ArticuloCosto = 0 ;
   this.Events = {"e110c13_client": ["ENTER", true] ,"e120c13_client": ["CANCEL", true]};
   this.EvtParms["ENTER"] = [[{postForm:true}],[]];
   this.EvtParms["REFRESH"] = [[],[]];
   this.setPrompt("PROMPT_7", [41]);
   this.setPrompt("PROMPT_11", [49]);
   this.setPrompt("PROMPT_17", [57]);
   this.EnterCtrl = ["BTN_ENTER"];
   this.setVCMap("Gx_mode", "vMODE", 0, "char");
   this.Initialize( );
});
gx.createParentObj(articulo);
