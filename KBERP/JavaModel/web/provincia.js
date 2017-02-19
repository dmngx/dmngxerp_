/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:31:58.39
*/
gx.evt.autoSkip = false;
gx.define('provincia', false, function () {
   this.ServerClass =  "provincia" ;
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
   this.Valid_Provinciaid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Provinciaid",["gx.O.A1ProvinciaId", "gx.O.A2ProvinciaNombre"],["A2ProvinciaNombre", "Gx_mode", "Z1ProvinciaId", "Z2ProvinciaNombre", ["BTN_DELETE","Enabled"], ["BTN_ENTER","Enabled"]]);
      return true;
   }
   this.e11011_client=function()
   {
      this.executeServerEvent("ENTER", true, null, false, false);
   };
   this.e12011_client=function()
   {
      this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46];
   this.GXLastCtrlId =46;
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
   GXValidFnc[33]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Provinciaid,isvalid:null,rgrid:[],fld:"PROVINCIAID",gxz:"Z1ProvinciaId",gxold:"O1ProvinciaId",gxvar:"A1ProvinciaId",ucs:[],op:[37],ip:[37,33],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A1ProvinciaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z1ProvinciaId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("PROVINCIAID",gx.O.A1ProvinciaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A1ProvinciaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("PROVINCIAID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 33 , function() {
   });
   GXValidFnc[34]={fld:"",grid:0};
   GXValidFnc[35]={fld:"",grid:0};
   GXValidFnc[36]={fld:"",grid:0};
   GXValidFnc[37]={lvl:0,type:"svchar",len:250,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"PROVINCIANOMBRE",gxz:"Z2ProvinciaNombre",gxold:"O2ProvinciaNombre",gxvar:"A2ProvinciaNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A2ProvinciaNombre=Value},v2z:function(Value){gx.O.Z2ProvinciaNombre=Value},v2c:function(){gx.fn.setControlValue("PROVINCIANOMBRE",gx.O.A2ProvinciaNombre,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A2ProvinciaNombre=this.val()},val:function(){return gx.fn.getControlValue("PROVINCIANOMBRE")},nac:gx.falseFn};
   this.declareDomainHdlr( 37 , function() {
   });
   GXValidFnc[38]={fld:"",grid:0};
   GXValidFnc[39]={fld:"",grid:0};
   GXValidFnc[40]={fld:"",grid:0};
   GXValidFnc[41]={fld:"",grid:0};
   GXValidFnc[42]={fld:"BTN_ENTER",grid:0};
   GXValidFnc[43]={fld:"",grid:0};
   GXValidFnc[44]={fld:"BTN_CANCEL",grid:0};
   GXValidFnc[45]={fld:"",grid:0};
   GXValidFnc[46]={fld:"BTN_DELETE",grid:0};
   this.A1ProvinciaId = 0 ;
   this.Z1ProvinciaId = 0 ;
   this.O1ProvinciaId = 0 ;
   this.A2ProvinciaNombre = "" ;
   this.Z2ProvinciaNombre = "" ;
   this.O2ProvinciaNombre = "" ;
   this.A1ProvinciaId = 0 ;
   this.A2ProvinciaNombre = "" ;
   this.Events = {"e11011_client": ["ENTER", true] ,"e12011_client": ["CANCEL", true]};
   this.EvtParms["ENTER"] = [[{postForm:true}],[]];
   this.EvtParms["REFRESH"] = [[],[]];
   this.EnterCtrl = ["BTN_ENTER"];
   this.setVCMap("Gx_mode", "vMODE", 0, "char");
   this.Initialize( );
});
gx.createParentObj(provincia);
