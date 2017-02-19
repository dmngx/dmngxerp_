/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:32:6.86
*/
gx.evt.autoSkip = false;
gx.define('alicuotaiva', false, function () {
   this.ServerClass =  "alicuotaiva" ;
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
   this.Valid_Alicuotaivaid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Alicuotaivaid",["gx.O.A17AlicuotaIvaId", "gx.O.A18AlicuotaIvaNombre", "gx.num.urlDecimal(gx.O.A19AlicuotaIvaPorcentaje,\'.\',\',\')"],["A18AlicuotaIvaNombre", "A19AlicuotaIvaPorcentaje", "Gx_mode", "Z17AlicuotaIvaId", "Z18AlicuotaIvaNombre", "Z19AlicuotaIvaPorcentaje", ["BTN_DELETE","Enabled"], ["BTN_ENTER","Enabled"]]);
      return true;
   }
   this.e11099_client=function()
   {
      this.executeServerEvent("ENTER", true, null, false, false);
   };
   this.e12099_client=function()
   {
      this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50];
   this.GXLastCtrlId =50;
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
   GXValidFnc[33]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Alicuotaivaid,isvalid:null,rgrid:[],fld:"ALICUOTAIVAID",gxz:"Z17AlicuotaIvaId",gxold:"O17AlicuotaIvaId",gxvar:"A17AlicuotaIvaId",ucs:[],op:[41,37],ip:[41,37,33],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A17AlicuotaIvaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z17AlicuotaIvaId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("ALICUOTAIVAID",gx.O.A17AlicuotaIvaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A17AlicuotaIvaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ALICUOTAIVAID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 33 , function() {
   });
   GXValidFnc[34]={fld:"",grid:0};
   GXValidFnc[35]={fld:"",grid:0};
   GXValidFnc[36]={fld:"",grid:0};
   GXValidFnc[37]={lvl:0,type:"svchar",len:250,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"ALICUOTAIVANOMBRE",gxz:"Z18AlicuotaIvaNombre",gxold:"O18AlicuotaIvaNombre",gxvar:"A18AlicuotaIvaNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A18AlicuotaIvaNombre=Value},v2z:function(Value){gx.O.Z18AlicuotaIvaNombre=Value},v2c:function(){gx.fn.setControlValue("ALICUOTAIVANOMBRE",gx.O.A18AlicuotaIvaNombre,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A18AlicuotaIvaNombre=this.val()},val:function(){return gx.fn.getControlValue("ALICUOTAIVANOMBRE")},nac:gx.falseFn};
   this.declareDomainHdlr( 37 , function() {
   });
   GXValidFnc[38]={fld:"",grid:0};
   GXValidFnc[39]={fld:"",grid:0};
   GXValidFnc[40]={fld:"",grid:0};
   GXValidFnc[41]={lvl:0,type:"decimal",len:4,dec:1,sign:false,pic:"Z9.9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"ALICUOTAIVAPORCENTAJE",gxz:"Z19AlicuotaIvaPorcentaje",gxold:"O19AlicuotaIvaPorcentaje",gxvar:"A19AlicuotaIvaPorcentaje",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A19AlicuotaIvaPorcentaje=gx.fn.toDecimalValue(Value,',','.')},v2z:function(Value){gx.O.Z19AlicuotaIvaPorcentaje=gx.fn.toDecimalValue(Value,'.',',')},v2c:function(){gx.fn.setDecimalValue("ALICUOTAIVAPORCENTAJE",gx.O.A19AlicuotaIvaPorcentaje,1,',');if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A19AlicuotaIvaPorcentaje=this.val()},val:function(){return gx.fn.getDecimalValue("ALICUOTAIVAPORCENTAJE",'.',',')},nac:gx.falseFn};
   this.declareDomainHdlr( 41 , function() {
   });
   GXValidFnc[42]={fld:"",grid:0};
   GXValidFnc[43]={fld:"",grid:0};
   GXValidFnc[44]={fld:"",grid:0};
   GXValidFnc[45]={fld:"",grid:0};
   GXValidFnc[46]={fld:"BTN_ENTER",grid:0};
   GXValidFnc[47]={fld:"",grid:0};
   GXValidFnc[48]={fld:"BTN_CANCEL",grid:0};
   GXValidFnc[49]={fld:"",grid:0};
   GXValidFnc[50]={fld:"BTN_DELETE",grid:0};
   this.A17AlicuotaIvaId = 0 ;
   this.Z17AlicuotaIvaId = 0 ;
   this.O17AlicuotaIvaId = 0 ;
   this.A18AlicuotaIvaNombre = "" ;
   this.Z18AlicuotaIvaNombre = "" ;
   this.O18AlicuotaIvaNombre = "" ;
   this.A19AlicuotaIvaPorcentaje = 0 ;
   this.Z19AlicuotaIvaPorcentaje = 0 ;
   this.O19AlicuotaIvaPorcentaje = 0 ;
   this.A17AlicuotaIvaId = 0 ;
   this.A18AlicuotaIvaNombre = "" ;
   this.A19AlicuotaIvaPorcentaje = 0 ;
   this.Events = {"e11099_client": ["ENTER", true] ,"e12099_client": ["CANCEL", true]};
   this.EvtParms["ENTER"] = [[{postForm:true}],[]];
   this.EvtParms["REFRESH"] = [[],[]];
   this.EnterCtrl = ["BTN_ENTER"];
   this.setVCMap("Gx_mode", "vMODE", 0, "char");
   this.Initialize( );
});
gx.createParentObj(alicuotaiva);
