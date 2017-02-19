/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:32:15.62
*/
gx.evt.autoSkip = false;
gx.define('empresa', false, function () {
   this.ServerClass =  "empresa" ;
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
   this.Valid_Empresaid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Empresaid",["gx.O.A42EmpresaId", "gx.O.A43EmpresaNombre", "gx.O.A44EmpresaNumeroDocumento", "gx.O.A45EmpresaCalle", "gx.O.A46EmpresaNumero", "gx.O.A47EmpresaPiso", "gx.O.A48EmpresaDepto", "gx.O.A49EmpresaCPostal", 'gx.date.urlDate(gx.O.A50EmpresaFechaContrato,"DMY")', "gx.O.A51EmpresaNumeroIIBB", "gx.O.A52EmpresaLogo", "gx.O.A5LocalidadId", "gx.O.A3PaisId", "gx.O.A1ProvinciaId", "gx.O.A13CondicionIvaId"],["A43EmpresaNombre", "A44EmpresaNumeroDocumento", "A45EmpresaCalle", "A46EmpresaNumero", "A47EmpresaPiso", "A48EmpresaDepto", "A49EmpresaCPostal", "A5LocalidadId", "A3PaisId", "A1ProvinciaId", "A13CondicionIvaId", "A50EmpresaFechaContrato", "A51EmpresaNumeroIIBB", "A52EmpresaLogo", "EMPRESALOGO_gxBlob", ["A52EmpresaLogo","Filetype"], ["A52EmpresaLogo","Filename"], "Gx_mode", "Z42EmpresaId", "Z43EmpresaNombre", "Z44EmpresaNumeroDocumento", "Z45EmpresaCalle", "Z46EmpresaNumero", "Z47EmpresaPiso", "Z48EmpresaDepto", "Z49EmpresaCPostal", "Z5LocalidadId", "Z3PaisId", "Z1ProvinciaId", "Z13CondicionIvaId", "Z50EmpresaFechaContrato", "Z51EmpresaNumeroIIBB", "Z52EmpresaLogo", ["BTN_DELETE","Enabled"], ["BTN_ENTER","Enabled"]]);
      return true;
   }
   this.Valid_Localidadid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Localidadid",["gx.O.A5LocalidadId"],[]);
      return true;
   }
   this.Valid_Paisid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Paisid",["gx.O.A3PaisId"],[]);
      return true;
   }
   this.Valid_Provinciaid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Provinciaid",["gx.O.A1ProvinciaId"],[]);
      return true;
   }
   this.Valid_Condicionivaid=function()
   {
      gx.ajax.validSrvEvt("dyncall","valid_Condicionivaid",["gx.O.A13CondicionIvaId"],[]);
      return true;
   }
   this.e110d14_client=function()
   {
      this.executeServerEvent("ENTER", true, null, false, false);
   };
   this.e120d14_client=function()
   {
      this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102];
   this.GXLastCtrlId =102;
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
   GXValidFnc[33]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Empresaid,isvalid:null,rgrid:[],fld:"EMPRESAID",gxz:"Z42EmpresaId",gxold:"O42EmpresaId",gxvar:"A42EmpresaId",ucs:[],op:[77,73,69,65,89,85,81,61,57,53,49,45,41,37],ip:[77,73,69,65,89,85,81,61,57,53,49,45,41,37,33],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A42EmpresaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z42EmpresaId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("EMPRESAID",gx.O.A42EmpresaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A42EmpresaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("EMPRESAID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 33 , function() {
   });
   GXValidFnc[34]={fld:"",grid:0};
   GXValidFnc[35]={fld:"",grid:0};
   GXValidFnc[36]={fld:"",grid:0};
   GXValidFnc[37]={lvl:0,type:"svchar",len:250,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESANOMBRE",gxz:"Z43EmpresaNombre",gxold:"O43EmpresaNombre",gxvar:"A43EmpresaNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A43EmpresaNombre=Value},v2z:function(Value){gx.O.Z43EmpresaNombre=Value},v2c:function(){gx.fn.setControlValue("EMPRESANOMBRE",gx.O.A43EmpresaNombre,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A43EmpresaNombre=this.val()},val:function(){return gx.fn.getControlValue("EMPRESANOMBRE")},nac:gx.falseFn};
   this.declareDomainHdlr( 37 , function() {
   });
   GXValidFnc[38]={fld:"",grid:0};
   GXValidFnc[39]={fld:"",grid:0};
   GXValidFnc[40]={fld:"",grid:0};
   GXValidFnc[41]={lvl:0,type:"char",len:13,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESANUMERODOCUMENTO",gxz:"Z44EmpresaNumeroDocumento",gxold:"O44EmpresaNumeroDocumento",gxvar:"A44EmpresaNumeroDocumento",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A44EmpresaNumeroDocumento=Value},v2z:function(Value){gx.O.Z44EmpresaNumeroDocumento=Value},v2c:function(){gx.fn.setControlValue("EMPRESANUMERODOCUMENTO",gx.O.A44EmpresaNumeroDocumento,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A44EmpresaNumeroDocumento=this.val()},val:function(){return gx.fn.getControlValue("EMPRESANUMERODOCUMENTO")},nac:gx.falseFn};
   this.declareDomainHdlr( 41 , function() {
   });
   GXValidFnc[42]={fld:"",grid:0};
   GXValidFnc[43]={fld:"",grid:0};
   GXValidFnc[44]={fld:"",grid:0};
   GXValidFnc[45]={lvl:0,type:"svchar",len:150,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESACALLE",gxz:"Z45EmpresaCalle",gxold:"O45EmpresaCalle",gxvar:"A45EmpresaCalle",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A45EmpresaCalle=Value},v2z:function(Value){gx.O.Z45EmpresaCalle=Value},v2c:function(){gx.fn.setControlValue("EMPRESACALLE",gx.O.A45EmpresaCalle,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A45EmpresaCalle=this.val()},val:function(){return gx.fn.getControlValue("EMPRESACALLE")},nac:gx.falseFn};
   this.declareDomainHdlr( 45 , function() {
   });
   GXValidFnc[46]={fld:"",grid:0};
   GXValidFnc[47]={fld:"",grid:0};
   GXValidFnc[48]={fld:"",grid:0};
   GXValidFnc[49]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESANUMERO",gxz:"Z46EmpresaNumero",gxold:"O46EmpresaNumero",gxvar:"A46EmpresaNumero",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A46EmpresaNumero=gx.num.intval(Value)},v2z:function(Value){gx.O.Z46EmpresaNumero=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("EMPRESANUMERO",gx.O.A46EmpresaNumero,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A46EmpresaNumero=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("EMPRESANUMERO",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 49 , function() {
   });
   GXValidFnc[50]={fld:"",grid:0};
   GXValidFnc[51]={fld:"",grid:0};
   GXValidFnc[52]={fld:"",grid:0};
   GXValidFnc[53]={lvl:0,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESAPISO",gxz:"Z47EmpresaPiso",gxold:"O47EmpresaPiso",gxvar:"A47EmpresaPiso",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A47EmpresaPiso=gx.num.intval(Value)},v2z:function(Value){gx.O.Z47EmpresaPiso=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("EMPRESAPISO",gx.O.A47EmpresaPiso,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A47EmpresaPiso=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("EMPRESAPISO",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 53 , function() {
   });
   GXValidFnc[54]={fld:"",grid:0};
   GXValidFnc[55]={fld:"",grid:0};
   GXValidFnc[56]={fld:"",grid:0};
   GXValidFnc[57]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESADEPTO",gxz:"Z48EmpresaDepto",gxold:"O48EmpresaDepto",gxvar:"A48EmpresaDepto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A48EmpresaDepto=Value},v2z:function(Value){gx.O.Z48EmpresaDepto=Value},v2c:function(){gx.fn.setControlValue("EMPRESADEPTO",gx.O.A48EmpresaDepto,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A48EmpresaDepto=this.val()},val:function(){return gx.fn.getControlValue("EMPRESADEPTO")},nac:gx.falseFn};
   this.declareDomainHdlr( 57 , function() {
   });
   GXValidFnc[58]={fld:"",grid:0};
   GXValidFnc[59]={fld:"",grid:0};
   GXValidFnc[60]={fld:"",grid:0};
   GXValidFnc[61]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESACPOSTAL",gxz:"Z49EmpresaCPostal",gxold:"O49EmpresaCPostal",gxvar:"A49EmpresaCPostal",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A49EmpresaCPostal=Value},v2z:function(Value){gx.O.Z49EmpresaCPostal=Value},v2c:function(){gx.fn.setControlValue("EMPRESACPOSTAL",gx.O.A49EmpresaCPostal,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A49EmpresaCPostal=this.val()},val:function(){return gx.fn.getControlValue("EMPRESACPOSTAL")},nac:gx.falseFn};
   this.declareDomainHdlr( 61 , function() {
   });
   GXValidFnc[62]={fld:"",grid:0};
   GXValidFnc[63]={fld:"",grid:0};
   GXValidFnc[64]={fld:"",grid:0};
   GXValidFnc[65]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Localidadid,isvalid:null,rgrid:[],fld:"LOCALIDADID",gxz:"Z5LocalidadId",gxold:"O5LocalidadId",gxvar:"A5LocalidadId",ucs:[],op:[],ip:[65],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A5LocalidadId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z5LocalidadId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("LOCALIDADID",gx.O.A5LocalidadId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A5LocalidadId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("LOCALIDADID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 65 , function() {
   });
   GXValidFnc[66]={fld:"",grid:0};
   GXValidFnc[67]={fld:"",grid:0};
   GXValidFnc[68]={fld:"",grid:0};
   GXValidFnc[69]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Paisid,isvalid:null,rgrid:[],fld:"PAISID",gxz:"Z3PaisId",gxold:"O3PaisId",gxvar:"A3PaisId",ucs:[],op:[],ip:[69],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A3PaisId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z3PaisId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("PAISID",gx.O.A3PaisId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A3PaisId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("PAISID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 69 , function() {
   });
   GXValidFnc[70]={fld:"",grid:0};
   GXValidFnc[71]={fld:"",grid:0};
   GXValidFnc[72]={fld:"",grid:0};
   GXValidFnc[73]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Provinciaid,isvalid:null,rgrid:[],fld:"PROVINCIAID",gxz:"Z1ProvinciaId",gxold:"O1ProvinciaId",gxvar:"A1ProvinciaId",ucs:[],op:[],ip:[73],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A1ProvinciaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z1ProvinciaId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("PROVINCIAID",gx.O.A1ProvinciaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A1ProvinciaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("PROVINCIAID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 73 , function() {
   });
   GXValidFnc[74]={fld:"",grid:0};
   GXValidFnc[75]={fld:"",grid:0};
   GXValidFnc[76]={fld:"",grid:0};
   GXValidFnc[77]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Condicionivaid,isvalid:null,rgrid:[],fld:"CONDICIONIVAID",gxz:"Z13CondicionIvaId",gxold:"O13CondicionIvaId",gxvar:"A13CondicionIvaId",ucs:[],op:[],ip:[77],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A13CondicionIvaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z13CondicionIvaId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("CONDICIONIVAID",gx.O.A13CondicionIvaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A13CondicionIvaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CONDICIONIVAID",'.')},nac:gx.falseFn};
   this.declareDomainHdlr( 77 , function() {
   });
   GXValidFnc[78]={fld:"",grid:0};
   GXValidFnc[79]={fld:"",grid:0};
   GXValidFnc[80]={fld:"",grid:0};
   GXValidFnc[81]={lvl:0,type:"date",len:8,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESAFECHACONTRATO",gxz:"Z50EmpresaFechaContrato",gxold:"O50EmpresaFechaContrato",gxvar:"A50EmpresaFechaContrato",dp:{f:0,st:false,wn:false,mf:false,pic:"99/99/99",dec:0},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A50EmpresaFechaContrato=gx.fn.toDatetimeValue(Value)},v2z:function(Value){gx.O.Z50EmpresaFechaContrato=gx.fn.toDatetimeValue(Value)},v2c:function(){gx.fn.setControlValue("EMPRESAFECHACONTRATO",gx.O.A50EmpresaFechaContrato,0)},c2v:function(){gx.O.A50EmpresaFechaContrato=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getControlValue("EMPRESAFECHACONTRATO")},nac:gx.falseFn};
   GXValidFnc[82]={fld:"",grid:0};
   GXValidFnc[83]={fld:"",grid:0};
   GXValidFnc[84]={fld:"",grid:0};
   GXValidFnc[85]={lvl:0,type:"char",len:13,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESANUMEROIIBB",gxz:"Z51EmpresaNumeroIIBB",gxold:"O51EmpresaNumeroIIBB",gxvar:"A51EmpresaNumeroIIBB",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A51EmpresaNumeroIIBB=Value},v2z:function(Value){gx.O.Z51EmpresaNumeroIIBB=Value},v2c:function(){gx.fn.setControlValue("EMPRESANUMEROIIBB",gx.O.A51EmpresaNumeroIIBB,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A51EmpresaNumeroIIBB=this.val()},val:function(){return gx.fn.getControlValue("EMPRESANUMEROIIBB")},nac:gx.falseFn};
   this.declareDomainHdlr( 85 , function() {
   });
   GXValidFnc[86]={fld:"",grid:0};
   GXValidFnc[87]={fld:"",grid:0};
   GXValidFnc[88]={fld:"",grid:0};
   GXValidFnc[89]={lvl:0,type:"bitstr",len:1024,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESALOGO",gxz:"Z52EmpresaLogo",gxold:"O52EmpresaLogo",gxvar:"A52EmpresaLogo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.A52EmpresaLogo=Value},v2z:function(Value){gx.O.Z52EmpresaLogo=Value},v2c:function(){gx.fn.setBlobValue("EMPRESALOGO",gx.O.A52EmpresaLogo)},c2v:function(){gx.O.A52EmpresaLogo=this.val()},val:function(){return gx.fn.getBlobValue("EMPRESALOGO")},nac:gx.falseFn};
   GXValidFnc[90]={fld:"",grid:0};
   GXValidFnc[91]={fld:"",grid:0};
   GXValidFnc[92]={fld:"",grid:0};
   GXValidFnc[93]={fld:"",grid:0};
   GXValidFnc[94]={fld:"BTN_ENTER",grid:0};
   GXValidFnc[95]={fld:"",grid:0};
   GXValidFnc[96]={fld:"BTN_CANCEL",grid:0};
   GXValidFnc[97]={fld:"",grid:0};
   GXValidFnc[98]={fld:"BTN_DELETE",grid:0};
   GXValidFnc[99]={fld:"PROMPT_5",grid:14};
   GXValidFnc[100]={fld:"PROMPT_3",grid:14};
   GXValidFnc[101]={fld:"PROMPT_1",grid:14};
   GXValidFnc[102]={fld:"PROMPT_13",grid:14};
   this.A42EmpresaId = 0 ;
   this.Z42EmpresaId = 0 ;
   this.O42EmpresaId = 0 ;
   this.A43EmpresaNombre = "" ;
   this.Z43EmpresaNombre = "" ;
   this.O43EmpresaNombre = "" ;
   this.A44EmpresaNumeroDocumento = "" ;
   this.Z44EmpresaNumeroDocumento = "" ;
   this.O44EmpresaNumeroDocumento = "" ;
   this.A45EmpresaCalle = "" ;
   this.Z45EmpresaCalle = "" ;
   this.O45EmpresaCalle = "" ;
   this.A46EmpresaNumero = 0 ;
   this.Z46EmpresaNumero = 0 ;
   this.O46EmpresaNumero = 0 ;
   this.A47EmpresaPiso = 0 ;
   this.Z47EmpresaPiso = 0 ;
   this.O47EmpresaPiso = 0 ;
   this.A48EmpresaDepto = "" ;
   this.Z48EmpresaDepto = "" ;
   this.O48EmpresaDepto = "" ;
   this.A49EmpresaCPostal = "" ;
   this.Z49EmpresaCPostal = "" ;
   this.O49EmpresaCPostal = "" ;
   this.A5LocalidadId = 0 ;
   this.Z5LocalidadId = 0 ;
   this.O5LocalidadId = 0 ;
   this.A3PaisId = 0 ;
   this.Z3PaisId = 0 ;
   this.O3PaisId = 0 ;
   this.A1ProvinciaId = 0 ;
   this.Z1ProvinciaId = 0 ;
   this.O1ProvinciaId = 0 ;
   this.A13CondicionIvaId = 0 ;
   this.Z13CondicionIvaId = 0 ;
   this.O13CondicionIvaId = 0 ;
   this.A50EmpresaFechaContrato = gx.date.nullDate() ;
   this.Z50EmpresaFechaContrato = gx.date.nullDate() ;
   this.O50EmpresaFechaContrato = gx.date.nullDate() ;
   this.A51EmpresaNumeroIIBB = "" ;
   this.Z51EmpresaNumeroIIBB = "" ;
   this.O51EmpresaNumeroIIBB = "" ;
   this.A52EmpresaLogo = "" ;
   this.Z52EmpresaLogo = "" ;
   this.O52EmpresaLogo = "" ;
   this.A42EmpresaId = 0 ;
   this.A43EmpresaNombre = "" ;
   this.A44EmpresaNumeroDocumento = "" ;
   this.A45EmpresaCalle = "" ;
   this.A46EmpresaNumero = 0 ;
   this.A47EmpresaPiso = 0 ;
   this.A48EmpresaDepto = "" ;
   this.A49EmpresaCPostal = "" ;
   this.A5LocalidadId = 0 ;
   this.A3PaisId = 0 ;
   this.A1ProvinciaId = 0 ;
   this.A13CondicionIvaId = 0 ;
   this.A50EmpresaFechaContrato = gx.date.nullDate() ;
   this.A51EmpresaNumeroIIBB = "" ;
   this.A52EmpresaLogo = "" ;
   this.Events = {"e110d14_client": ["ENTER", true] ,"e120d14_client": ["CANCEL", true]};
   this.EvtParms["ENTER"] = [[{postForm:true}],[]];
   this.EvtParms["REFRESH"] = [[],[]];
   this.setPrompt("PROMPT_5", [65]);
   this.setPrompt("PROMPT_3", [69]);
   this.setPrompt("PROMPT_1", [73]);
   this.setPrompt("PROMPT_13", [77]);
   this.EnterCtrl = ["BTN_ENTER"];
   this.setVCMap("Gx_mode", "vMODE", 0, "char");
   this.Initialize( );
});
gx.createParentObj(empresa);
