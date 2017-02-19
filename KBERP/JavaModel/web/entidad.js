/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:35:25.90
*/
gx.evt.autoSkip=!1;gx.define("entidad",!1,function(){var n,i,t;this.ServerClass="entidad";this.PackageName="com.kberp";this.setObjectType("trn");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.A3PaisId=gx.fn.getIntegerValue("PAISID",".");this.A13CondicionIvaId=gx.fn.getIntegerValue("CONDICIONIVAID",".");this.A5LocalidadId=gx.fn.getIntegerValue("LOCALIDADID",".");this.A1ProvinciaId=gx.fn.getIntegerValue("PROVINCIAID",".");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Empresaid=function(){return gx.ajax.validSrvEvt("dyncall","valid_Empresaid",["gx.O.A42EmpresaId"],[]),!0};this.Valid_Entidadid=function(){return gx.ajax.validSrvEvt("dyncall","valid_Entidadid",["gx.O.A42EmpresaId","gx.O.A81EntidadId","gx.O.A82EntidadNombre","gx.O.A83EntidadNumeroDocumento","gx.O.A94EntidadTipo","gx.O.A95EntidadActiva","gx.O.A102EntidadTipoDocumentoId","gx.O.A103EntidadCondCpraVtaId","gx.O.A99EntidadPaisId","gx.O.A104EntidadCondIvaId","gx.O.A98EntidadLocalidadId","gx.O.A100EntidadProvinciaId"],["A1ProvinciaId","A5LocalidadId","A13CondicionIvaId","A3PaisId","A15CondicionCpraVtaId","A9TipoDocumentoId","A82EntidadNombre","A83EntidadNumeroDocumento","A102EntidadTipoDocumentoId","A103EntidadCondCpraVtaId","A99EntidadPaisId","A100EntidadProvinciaId","A104EntidadCondIvaId","A98EntidadLocalidadId","A94EntidadTipo","A95EntidadActiva","Gx_mode","Z42EmpresaId","Z81EntidadId","Z1ProvinciaId","Z5LocalidadId","Z13CondicionIvaId","Z3PaisId","Z15CondicionCpraVtaId","Z9TipoDocumentoId","Z82EntidadNombre","Z83EntidadNumeroDocumento","Z102EntidadTipoDocumentoId","Z103EntidadCondCpraVtaId","Z99EntidadPaisId","Z100EntidadProvinciaId","Z104EntidadCondIvaId","Z98EntidadLocalidadId","Z94EntidadTipo","Z95EntidadActiva","Gridentidad_telefono","Gridentidad_domicilio",["BTN_DELETE","Enabled"],["BTN_ENTER","Enabled"]]),!0};this.Valid_Entidadtipodocumentoid=function(){return gx.ajax.validSrvEvt("dyncall","valid_Entidadtipodocumentoid",["gx.O.A102EntidadTipoDocumentoId"],[]),!0};this.Valid_Entidadcondcpravtaid=function(){return gx.ajax.validSrvEvt("dyncall","valid_Entidadcondcpravtaid",["gx.O.A103EntidadCondCpraVtaId"],[]),!0};this.Valid_Entidadpaisid=function(){return gx.ajax.validSrvEvt("dyncall","valid_Entidadpaisid",["gx.O.A99EntidadPaisId"],[]),!0};this.Valid_Entidadprovinciaid=function(){return gx.ajax.validSrvEvt("dyncall","valid_Entidadprovinciaid",["gx.O.A100EntidadProvinciaId"],[]),!0};this.Valid_Entidadcondivaid=function(){return gx.ajax.validSrvEvt("dyncall","valid_Entidadcondivaid",["gx.O.A104EntidadCondIvaId"],[]),!0};this.Valid_Entidadlocalidadid=function(){return gx.ajax.validSrvEvt("dyncall","valid_Entidadlocalidadid",["gx.O.A98EntidadLocalidadId"],[]),!0};this.Valid_Entidadtipo=function(){try{var n=gx.util.balloon.getNew("ENTIDADTIPO");if(this.AnyError=0,!(this.A94EntidadTipo==1||this.A94EntidadTipo==1))try{n.setError("Campo Entidad Tipo fuera de rango");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0};this.Valid_Entidadtelefonoid=function(){try{if(gx.fn.currentGridRowImpl(54)===0)return!0;var n=gx.util.balloon.getNew("ENTIDADTELEFONOID",gx.fn.currentGridRowImpl(54));this.AnyError=0;this.sMode45=this.Gx_mode;this.Gx_mode=gx.fn.getGridRowMode(45,54);this.standaloneModal0I45();this.standaloneNotModal0I45();gx.fn.gridDuplicateKey(55)&&(n.setError(gx.text.format(gx.getMessage("GXM_1004"),"Telefono","","","","","","","","")),this.AnyError=gx.num.trunc(1,0))}catch(t){}try{return(this.Gx_mode=this.sMode45,n==null)?!0:n.show()}catch(t){}return!0};this.standaloneModal0I45=function(){try{this.Gx_mode!="INS"?gx.fn.setCtrlProperty("ENTIDADTELEFONOID","Enabled",0):gx.fn.setCtrlProperty("ENTIDADTELEFONOID","Enabled",1)}catch(n){}return!0};this.standaloneNotModal0I45=function(){return!0};this.Valid_Entidaddomicilioid=function(){try{if(gx.fn.currentGridRowImpl(66)===0)return!0;var n=gx.util.balloon.getNew("ENTIDADDOMICILIOID",gx.fn.currentGridRowImpl(66));this.AnyError=0;this.sMode46=this.Gx_mode;this.Gx_mode=gx.fn.getGridRowMode(46,66);this.standaloneModal0I46();this.standaloneNotModal0I46();gx.fn.gridDuplicateKey(67)&&(n.setError(gx.text.format(gx.getMessage("GXM_1004"),"Domicilio","","","","","","","","")),this.AnyError=gx.num.trunc(1,0))}catch(t){}try{return(this.Gx_mode=this.sMode46,n==null)?!0:n.show()}catch(t){}return!0};this.Valid_Entidaddomiciliocalle=function(){try{if(gx.fn.currentGridRowImpl(66)===0)return!0;var n=gx.util.balloon.getNew("ENTIDADDOMICILIOCALLE",gx.fn.currentGridRowImpl(66));this.AnyError=0;this.sMode46=this.Gx_mode;this.Gx_mode=gx.fn.getGridRowMode(46,66);try{this.A90EntidadDomicilioCompleto=this.A85EntidadDomicilioCalle+" "}catch(t){}}catch(t){}try{return(this.Gx_mode=this.sMode46,n==null)?!0:n.show()}catch(t){}return!0};this.standaloneModal0I46=function(){try{this.Gx_mode!="INS"?gx.fn.setCtrlProperty("ENTIDADDOMICILIOID","Enabled",0):gx.fn.setCtrlProperty("ENTIDADDOMICILIOID","Enabled",1)}catch(n){}return!0};this.standaloneNotModal0I46=function(){return!0};this.e110i44_client=function(){this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e120i44_client=function(){this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,55,56,57,58,59,60,61,62,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121];this.GXLastCtrlId=121;this.Gridentidad_telefonoContainer=new gx.grid.grid(this,45,"Telefono",54,"Gridentidad_telefono","Gridentidad_telefono","Gridentidad_telefonoContainer",this.CmpContext,this.IsMasterPage,"entidad",[91],!1,1,!1,!0,5,!1,!1,!1,"",0,"px","Nueva fila",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);i=this.Gridentidad_telefonoContainer;i.addSingleLineEdit(91,55,"ENTIDADTELEFONOID","Telefono Id","","EntidadTelefonoId","int",0,"px",4,4,"right",null,[],91,"EntidadTelefonoId",!0,0,!1,!1,"Attribute",1,"");i.addSingleLineEdit(92,56,"ENTIDADTELEFONO","Telefono","","EntidadTelefono","char",0,"px",20,20,"left",null,[],92,"EntidadTelefono",!0,0,!1,!1,"Attribute",1,"");i.addSingleLineEdit(93,57,"ENTIDADTELEFONOOBS","Telefono Obs","","EntidadTelefonoObs","svchar",0,"px",200,80,"left",null,[],93,"EntidadTelefonoObs",!0,0,!1,!1,"Attribute",1,"");this.Gridentidad_telefonoContainer.emptyText="";this.setGrid(i);this.Gridentidad_domicilioContainer=new gx.grid.grid(this,46,"Domicilio",66,"Gridentidad_domicilio","Gridentidad_domicilio","Gridentidad_domicilioContainer",this.CmpContext,this.IsMasterPage,"entidad",[84],!1,1,!1,!0,5,!1,!1,!1,"",0,"px","Nueva fila",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Gridentidad_domicilioContainer;t.addSingleLineEdit(84,67,"ENTIDADDOMICILIOID","Domicilio Id","","EntidadDomicilioId","int",0,"px",4,4,"right",null,[],84,"EntidadDomicilioId",!0,0,!1,!1,"Attribute",1,"");t.addSingleLineEdit(85,68,"ENTIDADDOMICILIOCALLE","Domicilio Calle","","EntidadDomicilioCalle","svchar",0,"px",150,80,"left",null,[],85,"EntidadDomicilioCalle",!0,0,!1,!1,"Attribute",1,"");t.addSingleLineEdit(86,69,"ENTIDADDOMICILIONUMERO","Domicilio Numero","","EntidadDomicilioNumero","int",0,"px",6,6,"right",null,[],86,"EntidadDomicilioNumero",!0,0,!1,!1,"Attribute",1,"");t.addSingleLineEdit(87,70,"ENTIDADDOMICILIOPISO","Domicilio Piso","","EntidadDomicilioPiso","int",0,"px",3,3,"right",null,[],87,"EntidadDomicilioPiso",!0,0,!1,!1,"Attribute",1,"");t.addSingleLineEdit(88,71,"ENTIDADDOMICILIODEPTO","Domicilio Depto","","EntidadDomicilioDepto","svchar",0,"px",10,10,"left",null,[],88,"EntidadDomicilioDepto",!0,0,!1,!1,"Attribute",1,"");t.addSingleLineEdit(89,72,"ENTIDADDOMICILIOCPOSTAL","Domicilio CPostal","","EntidadDomicilioCPostal","svchar",0,"px",10,10,"left",null,[],89,"EntidadDomicilioCPostal",!0,0,!1,!1,"Attribute",1,"");t.addSingleLineEdit(90,73,"ENTIDADDOMICILIOCOMPLETO","Domicilio Completo","","EntidadDomicilioCompleto","svchar",0,"px",500,80,"left",null,[],90,"EntidadDomicilioCompleto",!0,0,!1,!1,"Attribute",1,"");this.Gridentidad_domicilioContainer.emptyText="";this.setGrid(t);n[2]={fld:"",grid:0};n[3]={fld:"MAINTABLE",grid:0};n[4]={fld:"",grid:0};n[5]={fld:"",grid:0};n[6]={fld:"TITLECONTAINER",grid:0};n[7]={fld:"",grid:0};n[8]={fld:"",grid:0};n[9]={fld:"TITLE",format:0,grid:0};n[10]={fld:"",grid:0};n[11]={fld:"",grid:0};n[13]={fld:"",grid:0};n[14]={fld:"",grid:0};n[15]={fld:"FORMCONTAINER",grid:0};n[16]={fld:"",grid:0};n[17]={fld:"TOOLBARCELL",grid:0};n[18]={fld:"",grid:0};n[19]={fld:"",grid:0};n[20]={fld:"",grid:0};n[21]={fld:"BTN_FIRST",grid:0};n[22]={fld:"",grid:0};n[23]={fld:"BTN_PREVIOUS",grid:0};n[24]={fld:"",grid:0};n[25]={fld:"BTN_NEXT",grid:0};n[26]={fld:"",grid:0};n[27]={fld:"BTN_LAST",grid:0};n[28]={fld:"",grid:0};n[29]={fld:"BTN_SELECT",grid:0};n[30]={fld:"",grid:0};n[31]={fld:"",grid:0};n[32]={fld:"",grid:0};n[33]={lvl:0,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Empresaid,isvalid:null,rgrid:[this.Gridentidad_telefonoContainer,this.Gridentidad_domicilioContainer],fld:"EMPRESAID",gxz:"Z42EmpresaId",gxold:"O42EmpresaId",gxvar:"A42EmpresaId",ucs:[],op:[],ip:[33],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A42EmpresaId=gx.num.intval(n)},v2z:function(n){gx.O.Z42EmpresaId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("EMPRESAID",gx.O.A42EmpresaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A42EmpresaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("EMPRESAID",".")},nac:gx.falseFn};this.declareDomainHdlr(33,function(){});n[34]={fld:"",grid:0};n[35]={fld:"",grid:0};n[36]={fld:"",grid:0};n[37]={lvl:0,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Entidadid,isvalid:null,rgrid:[this.Gridentidad_telefonoContainer,this.Gridentidad_domicilioContainer],fld:"ENTIDADID",gxz:"Z81EntidadId",gxold:"O81EntidadId",gxvar:"A81EntidadId",ucs:[],op:[89,97,93,85,81,77,105,101,45,41],ip:[89,97,93,85,81,77,105,101,45,41,37,33],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A81EntidadId=gx.num.intval(n)},v2z:function(n){gx.O.Z81EntidadId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("ENTIDADID",gx.O.A81EntidadId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A81EntidadId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ENTIDADID",".")},nac:gx.falseFn};this.declareDomainHdlr(37,function(){});n[38]={fld:"",grid:0};n[39]={fld:"",grid:0};n[40]={fld:"",grid:0};n[41]={lvl:0,type:"svchar",len:250,dec:0,sign:!1,ro:0,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADNOMBRE",gxz:"Z82EntidadNombre",gxold:"O82EntidadNombre",gxvar:"A82EntidadNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A82EntidadNombre=n},v2z:function(n){gx.O.Z82EntidadNombre=n},v2c:function(){gx.fn.setControlValue("ENTIDADNOMBRE",gx.O.A82EntidadNombre,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A82EntidadNombre=this.val()},val:function(){return gx.fn.getControlValue("ENTIDADNOMBRE")},nac:gx.falseFn};this.declareDomainHdlr(41,function(){});n[42]={fld:"",grid:0};n[43]={fld:"",grid:0};n[44]={fld:"",grid:0};n[45]={lvl:0,type:"char",len:13,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADNUMERODOCUMENTO",gxz:"Z83EntidadNumeroDocumento",gxold:"O83EntidadNumeroDocumento",gxvar:"A83EntidadNumeroDocumento",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A83EntidadNumeroDocumento=n},v2z:function(n){gx.O.Z83EntidadNumeroDocumento=n},v2c:function(){gx.fn.setControlValue("ENTIDADNUMERODOCUMENTO",gx.O.A83EntidadNumeroDocumento,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A83EntidadNumeroDocumento=this.val()},val:function(){return gx.fn.getControlValue("ENTIDADNUMERODOCUMENTO")},nac:gx.falseFn};this.declareDomainHdlr(45,function(){});n[46]={fld:"",grid:0};n[47]={fld:"",grid:0};n[48]={fld:"TELEFONOTABLE",grid:0};n[49]={fld:"",grid:0};n[50]={fld:"",grid:0};n[51]={fld:"TITLETELEFONO",format:0,grid:0};n[52]={fld:"",grid:0};n[53]={fld:"",grid:0};n[55]={lvl:45,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,isacc:1,grid:54,gxgrid:this.Gridentidad_telefonoContainer,fnc:this.Valid_Entidadtelefonoid,isvalid:null,rgrid:[],fld:"ENTIDADTELEFONOID",gxz:"Z91EntidadTelefonoId",gxold:"O91EntidadTelefonoId",gxvar:"A91EntidadTelefonoId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A91EntidadTelefonoId=gx.num.intval(n)},v2z:function(n){gx.O.Z91EntidadTelefonoId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADTELEFONOID",n||gx.fn.currentGridRowImpl(54),gx.O.A91EntidadTelefonoId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A91EntidadTelefonoId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADTELEFONOID",n||gx.fn.currentGridRowImpl(54),".")},nac:gx.falseFn};n[56]={lvl:45,type:"char",len:20,dec:0,sign:!1,ro:0,isacc:1,grid:54,gxgrid:this.Gridentidad_telefonoContainer,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADTELEFONO",gxz:"Z92EntidadTelefono",gxold:"O92EntidadTelefono",gxvar:"A92EntidadTelefono",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"tel",v2v:function(n){gx.O.A92EntidadTelefono=n},v2z:function(n){gx.O.Z92EntidadTelefono=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADTELEFONO",n||gx.fn.currentGridRowImpl(54),gx.O.A92EntidadTelefono,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A92EntidadTelefono=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADTELEFONO",n||gx.fn.currentGridRowImpl(54))},nac:gx.falseFn};n[57]={lvl:45,type:"svchar",len:200,dec:0,sign:!1,ro:0,isacc:1,grid:54,gxgrid:this.Gridentidad_telefonoContainer,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADTELEFONOOBS",gxz:"Z93EntidadTelefonoObs",gxold:"O93EntidadTelefonoObs",gxvar:"A93EntidadTelefonoObs",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A93EntidadTelefonoObs=n},v2z:function(n){gx.O.Z93EntidadTelefonoObs=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADTELEFONOOBS",n||gx.fn.currentGridRowImpl(54),gx.O.A93EntidadTelefonoObs,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A93EntidadTelefonoObs=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADTELEFONOOBS",n||gx.fn.currentGridRowImpl(54))},nac:gx.falseFn};n[58]={fld:"",grid:0};n[59]={fld:"",grid:0};n[60]={fld:"DOMICILIOTABLE",grid:0};n[61]={fld:"",grid:0};n[62]={fld:"",grid:0};n[63]={fld:"TITLEDOMICILIO",format:0,grid:0};n[64]={fld:"",grid:0};n[65]={fld:"",grid:0};n[67]={lvl:46,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,isacc:1,grid:66,gxgrid:this.Gridentidad_domicilioContainer,fnc:this.Valid_Entidaddomicilioid,isvalid:null,rgrid:[],fld:"ENTIDADDOMICILIOID",gxz:"Z84EntidadDomicilioId",gxold:"O84EntidadDomicilioId",gxvar:"A84EntidadDomicilioId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A84EntidadDomicilioId=gx.num.intval(n)},v2z:function(n){gx.O.Z84EntidadDomicilioId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADDOMICILIOID",n||gx.fn.currentGridRowImpl(66),gx.O.A84EntidadDomicilioId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A84EntidadDomicilioId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADDOMICILIOID",n||gx.fn.currentGridRowImpl(66),".")},nac:gx.falseFn};n[68]={lvl:46,type:"svchar",len:150,dec:0,sign:!1,ro:0,isacc:1,grid:66,gxgrid:this.Gridentidad_domicilioContainer,fnc:this.Valid_Entidaddomiciliocalle,isvalid:null,rgrid:[],fld:"ENTIDADDOMICILIOCALLE",gxz:"Z85EntidadDomicilioCalle",gxold:"O85EntidadDomicilioCalle",gxvar:"A85EntidadDomicilioCalle",ucs:[],op:[73],ip:[73,68],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A85EntidadDomicilioCalle=n},v2z:function(n){gx.O.Z85EntidadDomicilioCalle=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADDOMICILIOCALLE",n||gx.fn.currentGridRowImpl(66),gx.O.A85EntidadDomicilioCalle,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A85EntidadDomicilioCalle=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADDOMICILIOCALLE",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn};n[69]={lvl:46,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,isacc:1,grid:66,gxgrid:this.Gridentidad_domicilioContainer,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADDOMICILIONUMERO",gxz:"Z86EntidadDomicilioNumero",gxold:"O86EntidadDomicilioNumero",gxvar:"A86EntidadDomicilioNumero",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A86EntidadDomicilioNumero=gx.num.intval(n)},v2z:function(n){gx.O.Z86EntidadDomicilioNumero=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADDOMICILIONUMERO",n||gx.fn.currentGridRowImpl(66),gx.O.A86EntidadDomicilioNumero,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A86EntidadDomicilioNumero=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADDOMICILIONUMERO",n||gx.fn.currentGridRowImpl(66),".")},nac:gx.falseFn};n[70]={lvl:46,type:"int",len:3,dec:0,sign:!1,pic:"ZZ9",ro:0,isacc:1,grid:66,gxgrid:this.Gridentidad_domicilioContainer,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADDOMICILIOPISO",gxz:"Z87EntidadDomicilioPiso",gxold:"O87EntidadDomicilioPiso",gxvar:"A87EntidadDomicilioPiso",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A87EntidadDomicilioPiso=gx.num.intval(n)},v2z:function(n){gx.O.Z87EntidadDomicilioPiso=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADDOMICILIOPISO",n||gx.fn.currentGridRowImpl(66),gx.O.A87EntidadDomicilioPiso,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A87EntidadDomicilioPiso=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADDOMICILIOPISO",n||gx.fn.currentGridRowImpl(66),".")},nac:gx.falseFn};n[71]={lvl:46,type:"svchar",len:10,dec:0,sign:!1,ro:0,isacc:1,grid:66,gxgrid:this.Gridentidad_domicilioContainer,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADDOMICILIODEPTO",gxz:"Z88EntidadDomicilioDepto",gxold:"O88EntidadDomicilioDepto",gxvar:"A88EntidadDomicilioDepto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A88EntidadDomicilioDepto=n},v2z:function(n){gx.O.Z88EntidadDomicilioDepto=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADDOMICILIODEPTO",n||gx.fn.currentGridRowImpl(66),gx.O.A88EntidadDomicilioDepto,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A88EntidadDomicilioDepto=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADDOMICILIODEPTO",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn};n[72]={lvl:46,type:"svchar",len:10,dec:0,sign:!1,ro:0,isacc:1,grid:66,gxgrid:this.Gridentidad_domicilioContainer,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADDOMICILIOCPOSTAL",gxz:"Z89EntidadDomicilioCPostal",gxold:"O89EntidadDomicilioCPostal",gxvar:"A89EntidadDomicilioCPostal",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A89EntidadDomicilioCPostal=n},v2z:function(n){gx.O.Z89EntidadDomicilioCPostal=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADDOMICILIOCPOSTAL",n||gx.fn.currentGridRowImpl(66),gx.O.A89EntidadDomicilioCPostal,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A89EntidadDomicilioCPostal=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADDOMICILIOCPOSTAL",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn};n[73]={lvl:46,type:"svchar",len:500,dec:0,sign:!1,ro:1,isacc:1,grid:66,gxgrid:this.Gridentidad_domicilioContainer,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADDOMICILIOCOMPLETO",gxz:"Z90EntidadDomicilioCompleto",gxold:"O90EntidadDomicilioCompleto",gxvar:"A90EntidadDomicilioCompleto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A90EntidadDomicilioCompleto=n},v2z:function(n){gx.O.Z90EntidadDomicilioCompleto=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADDOMICILIOCOMPLETO",n||gx.fn.currentGridRowImpl(66),gx.O.A90EntidadDomicilioCompleto,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A90EntidadDomicilioCompleto=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADDOMICILIOCOMPLETO",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn};n[74]={fld:"",grid:0};n[75]={fld:"",grid:0};n[76]={fld:"",grid:0};n[77]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Entidadtipodocumentoid,isvalid:null,rgrid:[],fld:"ENTIDADTIPODOCUMENTOID",gxz:"Z102EntidadTipoDocumentoId",gxold:"O102EntidadTipoDocumentoId",gxvar:"A102EntidadTipoDocumentoId",ucs:[],op:[],ip:[77],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A102EntidadTipoDocumentoId=gx.num.intval(n)},v2z:function(n){gx.O.Z102EntidadTipoDocumentoId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("ENTIDADTIPODOCUMENTOID",gx.O.A102EntidadTipoDocumentoId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A102EntidadTipoDocumentoId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ENTIDADTIPODOCUMENTOID",".")},nac:gx.falseFn};this.declareDomainHdlr(77,function(){});n[78]={fld:"",grid:0};n[79]={fld:"",grid:0};n[80]={fld:"",grid:0};n[81]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Entidadcondcpravtaid,isvalid:null,rgrid:[],fld:"ENTIDADCONDCPRAVTAID",gxz:"Z103EntidadCondCpraVtaId",gxold:"O103EntidadCondCpraVtaId",gxvar:"A103EntidadCondCpraVtaId",ucs:[],op:[],ip:[81],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A103EntidadCondCpraVtaId=gx.num.intval(n)},v2z:function(n){gx.O.Z103EntidadCondCpraVtaId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("ENTIDADCONDCPRAVTAID",gx.O.A103EntidadCondCpraVtaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A103EntidadCondCpraVtaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ENTIDADCONDCPRAVTAID",".")},nac:gx.falseFn};this.declareDomainHdlr(81,function(){});n[82]={fld:"",grid:0};n[83]={fld:"",grid:0};n[84]={fld:"",grid:0};n[85]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Entidadpaisid,isvalid:null,rgrid:[],fld:"ENTIDADPAISID",gxz:"Z99EntidadPaisId",gxold:"O99EntidadPaisId",gxvar:"A99EntidadPaisId",ucs:[],op:[],ip:[85],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A99EntidadPaisId=gx.num.intval(n)},v2z:function(n){gx.O.Z99EntidadPaisId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("ENTIDADPAISID",gx.O.A99EntidadPaisId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A99EntidadPaisId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ENTIDADPAISID",".")},nac:gx.falseFn};this.declareDomainHdlr(85,function(){});n[86]={fld:"",grid:0};n[87]={fld:"",grid:0};n[88]={fld:"",grid:0};n[89]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Entidadprovinciaid,isvalid:null,rgrid:[],fld:"ENTIDADPROVINCIAID",gxz:"Z100EntidadProvinciaId",gxold:"O100EntidadProvinciaId",gxvar:"A100EntidadProvinciaId",ucs:[],op:[],ip:[89],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A100EntidadProvinciaId=gx.num.intval(n)},v2z:function(n){gx.O.Z100EntidadProvinciaId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("ENTIDADPROVINCIAID",gx.O.A100EntidadProvinciaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A100EntidadProvinciaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ENTIDADPROVINCIAID",".")},nac:gx.falseFn};this.declareDomainHdlr(89,function(){});n[90]={fld:"",grid:0};n[91]={fld:"",grid:0};n[92]={fld:"",grid:0};n[93]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Entidadcondivaid,isvalid:null,rgrid:[],fld:"ENTIDADCONDIVAID",gxz:"Z104EntidadCondIvaId",gxold:"O104EntidadCondIvaId",gxvar:"A104EntidadCondIvaId",ucs:[],op:[],ip:[93],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A104EntidadCondIvaId=gx.num.intval(n)},v2z:function(n){gx.O.Z104EntidadCondIvaId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("ENTIDADCONDIVAID",gx.O.A104EntidadCondIvaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A104EntidadCondIvaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ENTIDADCONDIVAID",".")},nac:gx.falseFn};this.declareDomainHdlr(93,function(){});n[94]={fld:"",grid:0};n[95]={fld:"",grid:0};n[96]={fld:"",grid:0};n[97]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Entidadlocalidadid,isvalid:null,rgrid:[],fld:"ENTIDADLOCALIDADID",gxz:"Z98EntidadLocalidadId",gxold:"O98EntidadLocalidadId",gxvar:"A98EntidadLocalidadId",ucs:[],op:[],ip:[97],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.A98EntidadLocalidadId=gx.num.intval(n)},v2z:function(n){gx.O.Z98EntidadLocalidadId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("ENTIDADLOCALIDADID",gx.O.A98EntidadLocalidadId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A98EntidadLocalidadId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ENTIDADLOCALIDADID",".")},nac:gx.falseFn};this.declareDomainHdlr(97,function(){});n[98]={fld:"",grid:0};n[99]={fld:"",grid:0};n[100]={fld:"",grid:0};n[101]={lvl:0,type:"int",len:2,dec:0,sign:!1,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Entidadtipo,isvalid:null,rgrid:[],fld:"ENTIDADTIPO",gxz:"Z94EntidadTipo",gxold:"O94EntidadTipo",gxvar:"A94EntidadTipo",ucs:[],op:[101],ip:[101],nacdep:[],ctrltype:"combo",v2v:function(n){gx.O.A94EntidadTipo=gx.num.intval(n)},v2z:function(n){gx.O.Z94EntidadTipo=gx.num.intval(n)},v2c:function(){gx.fn.setComboBoxValue("ENTIDADTIPO",gx.O.A94EntidadTipo);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A94EntidadTipo=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("ENTIDADTIPO",".")},nac:gx.falseFn};this.declareDomainHdlr(101,function(){});n[102]={fld:"",grid:0};n[103]={fld:"",grid:0};n[104]={fld:"",grid:0};n[105]={lvl:0,type:"boolean",len:4,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADACTIVA",gxz:"Z95EntidadActiva",gxold:"O95EntidadActiva",gxvar:"A95EntidadActiva",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(n){gx.O.A95EntidadActiva=gx.lang.booleanValue(n)},v2z:function(n){gx.O.Z95EntidadActiva=gx.lang.booleanValue(n)},v2c:function(){gx.fn.setCheckBoxValue("ENTIDADACTIVA",gx.O.A95EntidadActiva,!0)},c2v:function(){gx.O.A95EntidadActiva=gx.lang.booleanValue(this.val())},val:function(){return gx.fn.getControlValue("ENTIDADACTIVA")},nac:gx.falseFn,values:["true","false"]};n[106]={fld:"",grid:0};n[107]={fld:"",grid:0};n[108]={fld:"",grid:0};n[109]={fld:"",grid:0};n[110]={fld:"BTN_ENTER",grid:0};n[111]={fld:"",grid:0};n[112]={fld:"BTN_CANCEL",grid:0};n[113]={fld:"",grid:0};n[114]={fld:"BTN_DELETE",grid:0};n[115]={fld:"PROMPT_42",grid:44};n[116]={fld:"PROMPT_102",grid:44};n[117]={fld:"PROMPT_103",grid:44};n[118]={fld:"PROMPT_99",grid:44};n[119]={fld:"PROMPT_100",grid:44};n[120]={fld:"PROMPT_104",grid:44};n[121]={fld:"PROMPT_98",grid:44};this.A42EmpresaId=0;this.Z42EmpresaId=0;this.O42EmpresaId=0;this.A81EntidadId=0;this.Z81EntidadId=0;this.O81EntidadId=0;this.A82EntidadNombre="";this.Z82EntidadNombre="";this.O82EntidadNombre="";this.A83EntidadNumeroDocumento="";this.Z83EntidadNumeroDocumento="";this.O83EntidadNumeroDocumento="";this.Z91EntidadTelefonoId=0;this.O91EntidadTelefonoId=0;this.Z92EntidadTelefono="";this.O92EntidadTelefono="";this.Z93EntidadTelefonoObs="";this.O93EntidadTelefonoObs="";this.Z84EntidadDomicilioId=0;this.O84EntidadDomicilioId=0;this.Z85EntidadDomicilioCalle="";this.O85EntidadDomicilioCalle="";this.Z86EntidadDomicilioNumero=0;this.O86EntidadDomicilioNumero=0;this.Z87EntidadDomicilioPiso=0;this.O87EntidadDomicilioPiso=0;this.Z88EntidadDomicilioDepto="";this.O88EntidadDomicilioDepto="";this.Z89EntidadDomicilioCPostal="";this.O89EntidadDomicilioCPostal="";this.Z90EntidadDomicilioCompleto="";this.O90EntidadDomicilioCompleto="";this.A102EntidadTipoDocumentoId=0;this.Z102EntidadTipoDocumentoId=0;this.O102EntidadTipoDocumentoId=0;this.A103EntidadCondCpraVtaId=0;this.Z103EntidadCondCpraVtaId=0;this.O103EntidadCondCpraVtaId=0;this.A99EntidadPaisId=0;this.Z99EntidadPaisId=0;this.O99EntidadPaisId=0;this.A100EntidadProvinciaId=0;this.Z100EntidadProvinciaId=0;this.O100EntidadProvinciaId=0;this.A104EntidadCondIvaId=0;this.Z104EntidadCondIvaId=0;this.O104EntidadCondIvaId=0;this.A98EntidadLocalidadId=0;this.Z98EntidadLocalidadId=0;this.O98EntidadLocalidadId=0;this.A94EntidadTipo=0;this.Z94EntidadTipo=0;this.O94EntidadTipo=0;this.A95EntidadActiva=!1;this.Z95EntidadActiva=!1;this.O95EntidadActiva=!1;this.A84EntidadDomicilioId=0;this.A90EntidadDomicilioCompleto="";this.A85EntidadDomicilioCalle="";this.A86EntidadDomicilioNumero=0;this.A87EntidadDomicilioPiso=0;this.A88EntidadDomicilioDepto="";this.A89EntidadDomicilioCPostal="";this.A91EntidadTelefonoId=0;this.A92EntidadTelefono="";this.A93EntidadTelefonoObs="";this.A1ProvinciaId=0;this.A5LocalidadId=0;this.A13CondicionIvaId=0;this.A3PaisId=0;this.A15CondicionCpraVtaId=0;this.A9TipoDocumentoId=0;this.A42EmpresaId=0;this.A81EntidadId=0;this.A82EntidadNombre="";this.A83EntidadNumeroDocumento="";this.A102EntidadTipoDocumentoId=0;this.A103EntidadCondCpraVtaId=0;this.A99EntidadPaisId=0;this.A100EntidadProvinciaId=0;this.A104EntidadCondIvaId=0;this.A98EntidadLocalidadId=0;this.A94EntidadTipo=0;this.A95EntidadActiva=!1;this.Events={e110i44_client:["ENTER",!0],e120i44_client:["CANCEL",!0]};this.EvtParms.ENTER=[[{postForm:!0}],[]];this.EvtParms.REFRESH=[[],[]];this.setPrompt("PROMPT_42",[33]);this.setPrompt("PROMPT_102",[77]);this.setPrompt("PROMPT_103",[81]);this.setPrompt("PROMPT_99",[85]);this.setPrompt("PROMPT_100",[89]);this.setPrompt("PROMPT_104",[93]);this.setPrompt("PROMPT_98",[97]);this.EnterCtrl=["BTN_ENTER"];this.setVCMap("A3PaisId","PAISID",0,"int");this.setVCMap("A13CondicionIvaId","CONDICIONIVAID",0,"int");this.setVCMap("A5LocalidadId","LOCALIDADID",0,"int");this.setVCMap("A1ProvinciaId","PROVINCIAID",0,"int");this.setVCMap("Gx_mode","vMODE",0,"char");this.Initialize()});gx.createParentObj(entidad)