/*!   GeneXus Java 15_0_2-109402 on February 14, 2017 1:29:6.95
*/
gx.evt.autoSkip=!1;gx.define("gx00i0",!1,function(){var n,t;this.ServerClass="gx00i0";this.PackageName="com.kberp";this.setObjectType("web");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV13pEntidadId=gx.fn.getIntegerValue("vPENTIDADID",".")};this.e180m1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")=="AdvancedContainer"?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle"));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}])};this.e110m1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADID","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:"ENTIDADIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADID","Visible")',ctrl:"vCENTIDADID",prop:"Visible"}])};this.e120m1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADNUMERODOCUMENTO","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADNUMERODOCUMENTO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class")',ctrl:"ENTIDADNUMERODOCUMENTOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADNUMERODOCUMENTO","Visible")',ctrl:"vCENTIDADNUMERODOCUMENTO",prop:"Visible"}])};this.e130m1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADNUMERO","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADNUMERO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class")',ctrl:"ENTIDADNUMEROFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADNUMERO","Visible")',ctrl:"vCENTIDADNUMERO",prop:"Visible"}])};this.e140m1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADPISO","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADPISO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class")',ctrl:"ENTIDADPISOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADPISO","Visible")',ctrl:"vCENTIDADPISO",prop:"Visible"}])};this.e150m1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADDEPTO","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADDEPTO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class")',ctrl:"ENTIDADDEPTOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADDEPTO","Visible")',ctrl:"vCENTIDADDEPTO",prop:"Visible"}])};this.e160m1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADCPOSTAL","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADCPOSTAL","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class")',ctrl:"ENTIDADCPOSTALFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADCPOSTAL","Visible")',ctrl:"vCENTIDADCPOSTAL",prop:"Visible"}])};this.e170m1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCLOCALIDADID","Visible",!0)):(gx.fn.setCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCLOCALIDADID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class")',ctrl:"LOCALIDADIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCLOCALIDADID","Visible")',ctrl:"vCLOCALIDADID",prop:"Visible"}])};this.e210m2_client=function(){this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e220m1_client=function(){this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,85,86,87,88,89,90,91,92,93,94,95,96,97];this.GXLastCtrlId=97;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",84,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx00i0",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px","Nueva fila",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",85,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(20,86,"ENTIDADID","Id","","EntidadId","int",0,"px",6,6,"right",null,[],20,"EntidadId",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addSingleLineEdit(29,87,"ENTIDADNUMERODOCUMENTO","Numero Documento","","EntidadNumeroDocumento","char",0,"px",13,13,"left",null,[],29,"EntidadNumeroDocumento",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(23,88,"ENTIDADNUMERO","Numero","","EntidadNumero","int",0,"px",6,6,"right",null,[],23,"EntidadNumero",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(24,89,"ENTIDADPISO","Piso","","EntidadPiso","int",0,"px",3,3,"right",null,[],24,"EntidadPiso",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(25,90,"ENTIDADDEPTO","Depto","","EntidadDepto","char",0,"px",10,10,"left",null,[],25,"EntidadDepto",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(26,91,"ENTIDADCPOSTAL","CPostal","","EntidadCPostal","char",0,"px",10,10,"left",null,[],26,"EntidadCPostal",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(5,92,"LOCALIDADID","Localidad Id","","LocalidadId","int",0,"px",4,4,"right",null,[],5,"LocalidadId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(3,93,"PAISID","Pais Id","","PaisId","int",0,"px",4,4,"right",null,[],3,"PaisId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(1,94,"PROVINCIAID","Provincia Id","","ProvinciaId","int",0,"px",4,4,"right",null,[],1,"ProvinciaId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={fld:"",grid:0};n[3]={fld:"MAIN",grid:0};n[4]={fld:"",grid:0};n[5]={fld:"",grid:0};n[6]={fld:"ADVANCEDCONTAINER",grid:0};n[7]={fld:"",grid:0};n[8]={fld:"",grid:0};n[9]={fld:"ENTIDADIDFILTERCONTAINER",grid:0};n[10]={fld:"",grid:0};n[11]={fld:"",grid:0};n[12]={fld:"LBLENTIDADIDFILTER",format:1,grid:0,evt:"e110m1_client"};n[13]={fld:"",grid:0};n[14]={fld:"",grid:0};n[15]={fld:"",grid:0};n[16]={lvl:0,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADID",gxz:"ZV6cEntidadId",gxold:"OV6cEntidadId",gxvar:"AV6cEntidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV6cEntidadId=gx.num.intval(n)},v2z:function(n){gx.O.ZV6cEntidadId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCENTIDADID",gx.O.AV6cEntidadId,0)},c2v:function(){gx.O.AV6cEntidadId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADID",".")},nac:gx.falseFn};n[17]={fld:"",grid:0};n[18]={fld:"",grid:0};n[19]={fld:"ENTIDADNUMERODOCUMENTOFILTERCONTAINER",grid:0};n[20]={fld:"",grid:0};n[21]={fld:"",grid:0};n[22]={fld:"LBLENTIDADNUMERODOCUMENTOFILTER",format:1,grid:0,evt:"e120m1_client"};n[23]={fld:"",grid:0};n[24]={fld:"",grid:0};n[25]={fld:"",grid:0};n[26]={lvl:0,type:"char",len:13,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADNUMERODOCUMENTO",gxz:"ZV7cEntidadNumeroDocumento",gxold:"OV7cEntidadNumeroDocumento",gxvar:"AV7cEntidadNumeroDocumento",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV7cEntidadNumeroDocumento=n},v2z:function(n){gx.O.ZV7cEntidadNumeroDocumento=n},v2c:function(){gx.fn.setControlValue("vCENTIDADNUMERODOCUMENTO",gx.O.AV7cEntidadNumeroDocumento,0)},c2v:function(){gx.O.AV7cEntidadNumeroDocumento=this.val()},val:function(){return gx.fn.getControlValue("vCENTIDADNUMERODOCUMENTO")},nac:gx.falseFn};n[27]={fld:"",grid:0};n[28]={fld:"",grid:0};n[29]={fld:"ENTIDADNUMEROFILTERCONTAINER",grid:0};n[30]={fld:"",grid:0};n[31]={fld:"",grid:0};n[32]={fld:"LBLENTIDADNUMEROFILTER",format:1,grid:0,evt:"e130m1_client"};n[33]={fld:"",grid:0};n[34]={fld:"",grid:0};n[35]={fld:"",grid:0};n[36]={lvl:0,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADNUMERO",gxz:"ZV8cEntidadNumero",gxold:"OV8cEntidadNumero",gxvar:"AV8cEntidadNumero",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV8cEntidadNumero=gx.num.intval(n)},v2z:function(n){gx.O.ZV8cEntidadNumero=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCENTIDADNUMERO",gx.O.AV8cEntidadNumero,0)},c2v:function(){gx.O.AV8cEntidadNumero=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADNUMERO",".")},nac:gx.falseFn};n[37]={fld:"",grid:0};n[38]={fld:"",grid:0};n[39]={fld:"ENTIDADPISOFILTERCONTAINER",grid:0};n[40]={fld:"",grid:0};n[41]={fld:"",grid:0};n[42]={fld:"LBLENTIDADPISOFILTER",format:1,grid:0,evt:"e140m1_client"};n[43]={fld:"",grid:0};n[44]={fld:"",grid:0};n[45]={fld:"",grid:0};n[46]={lvl:0,type:"int",len:3,dec:0,sign:!1,pic:"ZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADPISO",gxz:"ZV9cEntidadPiso",gxold:"OV9cEntidadPiso",gxvar:"AV9cEntidadPiso",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV9cEntidadPiso=gx.num.intval(n)},v2z:function(n){gx.O.ZV9cEntidadPiso=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCENTIDADPISO",gx.O.AV9cEntidadPiso,0)},c2v:function(){gx.O.AV9cEntidadPiso=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADPISO",".")},nac:gx.falseFn};n[47]={fld:"",grid:0};n[48]={fld:"",grid:0};n[49]={fld:"ENTIDADDEPTOFILTERCONTAINER",grid:0};n[50]={fld:"",grid:0};n[51]={fld:"",grid:0};n[52]={fld:"LBLENTIDADDEPTOFILTER",format:1,grid:0,evt:"e150m1_client"};n[53]={fld:"",grid:0};n[54]={fld:"",grid:0};n[55]={fld:"",grid:0};n[56]={lvl:0,type:"char",len:10,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADDEPTO",gxz:"ZV10cEntidadDepto",gxold:"OV10cEntidadDepto",gxvar:"AV10cEntidadDepto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV10cEntidadDepto=n},v2z:function(n){gx.O.ZV10cEntidadDepto=n},v2c:function(){gx.fn.setControlValue("vCENTIDADDEPTO",gx.O.AV10cEntidadDepto,0)},c2v:function(){gx.O.AV10cEntidadDepto=this.val()},val:function(){return gx.fn.getControlValue("vCENTIDADDEPTO")},nac:gx.falseFn};n[57]={fld:"",grid:0};n[58]={fld:"",grid:0};n[59]={fld:"ENTIDADCPOSTALFILTERCONTAINER",grid:0};n[60]={fld:"",grid:0};n[61]={fld:"",grid:0};n[62]={fld:"LBLENTIDADCPOSTALFILTER",format:1,grid:0,evt:"e160m1_client"};n[63]={fld:"",grid:0};n[64]={fld:"",grid:0};n[65]={fld:"",grid:0};n[66]={lvl:0,type:"char",len:10,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADCPOSTAL",gxz:"ZV11cEntidadCPostal",gxold:"OV11cEntidadCPostal",gxvar:"AV11cEntidadCPostal",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV11cEntidadCPostal=n},v2z:function(n){gx.O.ZV11cEntidadCPostal=n},v2c:function(){gx.fn.setControlValue("vCENTIDADCPOSTAL",gx.O.AV11cEntidadCPostal,0)},c2v:function(){gx.O.AV11cEntidadCPostal=this.val()},val:function(){return gx.fn.getControlValue("vCENTIDADCPOSTAL")},nac:gx.falseFn};n[67]={fld:"",grid:0};n[68]={fld:"",grid:0};n[69]={fld:"LOCALIDADIDFILTERCONTAINER",grid:0};n[70]={fld:"",grid:0};n[71]={fld:"",grid:0};n[72]={fld:"LBLLOCALIDADIDFILTER",format:1,grid:0,evt:"e170m1_client"};n[73]={fld:"",grid:0};n[74]={fld:"",grid:0};n[75]={fld:"",grid:0};n[76]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCLOCALIDADID",gxz:"ZV12cLocalidadId",gxold:"OV12cLocalidadId",gxvar:"AV12cLocalidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV12cLocalidadId=gx.num.intval(n)},v2z:function(n){gx.O.ZV12cLocalidadId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCLOCALIDADID",gx.O.AV12cLocalidadId,0)},c2v:function(){gx.O.AV12cLocalidadId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCLOCALIDADID",".")},nac:gx.falseFn};n[77]={fld:"",grid:0};n[78]={fld:"GRIDTABLE",grid:0};n[79]={fld:"",grid:0};n[80]={fld:"",grid:0};n[81]={fld:"BTNTOGGLE",grid:0};n[82]={fld:"",grid:0};n[83]={fld:"",grid:0};n[85]={lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.AV5LinkSelection=n},v2z:function(n){gx.O.ZV5LinkSelection=n},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84),gx.O.AV5LinkSelection,gx.O.AV17Linkselection_GXI)},c2v:function(){gx.O.AV17Linkselection_GXI=this.val_GXI();gx.O.AV5LinkSelection=this.val()},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(84))},gxvar_GXI:"AV17Linkselection_GXI",nac:gx.falseFn};n[86]={lvl:2,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADID",gxz:"Z20EntidadId",gxold:"O20EntidadId",gxvar:"A20EntidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A20EntidadId=gx.num.intval(n)},v2z:function(n){gx.O.Z20EntidadId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADID",n||gx.fn.currentGridRowImpl(84),gx.O.A20EntidadId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A20EntidadId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[87]={lvl:2,type:"char",len:13,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADNUMERODOCUMENTO",gxz:"Z29EntidadNumeroDocumento",gxold:"O29EntidadNumeroDocumento",gxvar:"A29EntidadNumeroDocumento",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A29EntidadNumeroDocumento=n},v2z:function(n){gx.O.Z29EntidadNumeroDocumento=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADNUMERODOCUMENTO",n||gx.fn.currentGridRowImpl(84),gx.O.A29EntidadNumeroDocumento,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A29EntidadNumeroDocumento=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADNUMERODOCUMENTO",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[88]={lvl:2,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADNUMERO",gxz:"Z23EntidadNumero",gxold:"O23EntidadNumero",gxvar:"A23EntidadNumero",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A23EntidadNumero=gx.num.intval(n)},v2z:function(n){gx.O.Z23EntidadNumero=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADNUMERO",n||gx.fn.currentGridRowImpl(84),gx.O.A23EntidadNumero,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A23EntidadNumero=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADNUMERO",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[89]={lvl:2,type:"int",len:3,dec:0,sign:!1,pic:"ZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADPISO",gxz:"Z24EntidadPiso",gxold:"O24EntidadPiso",gxvar:"A24EntidadPiso",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A24EntidadPiso=gx.num.intval(n)},v2z:function(n){gx.O.Z24EntidadPiso=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADPISO",n||gx.fn.currentGridRowImpl(84),gx.O.A24EntidadPiso,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A24EntidadPiso=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADPISO",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[90]={lvl:2,type:"char",len:10,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADDEPTO",gxz:"Z25EntidadDepto",gxold:"O25EntidadDepto",gxvar:"A25EntidadDepto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A25EntidadDepto=n},v2z:function(n){gx.O.Z25EntidadDepto=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADDEPTO",n||gx.fn.currentGridRowImpl(84),gx.O.A25EntidadDepto,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A25EntidadDepto=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADDEPTO",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[91]={lvl:2,type:"char",len:10,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADCPOSTAL",gxz:"Z26EntidadCPostal",gxold:"O26EntidadCPostal",gxvar:"A26EntidadCPostal",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A26EntidadCPostal=n},v2z:function(n){gx.O.Z26EntidadCPostal=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADCPOSTAL",n||gx.fn.currentGridRowImpl(84),gx.O.A26EntidadCPostal,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A26EntidadCPostal=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADCPOSTAL",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[92]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"LOCALIDADID",gxz:"Z5LocalidadId",gxold:"O5LocalidadId",gxvar:"A5LocalidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A5LocalidadId=gx.num.intval(n)},v2z:function(n){gx.O.Z5LocalidadId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("LOCALIDADID",n||gx.fn.currentGridRowImpl(84),gx.O.A5LocalidadId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A5LocalidadId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("LOCALIDADID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[93]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"PAISID",gxz:"Z3PaisId",gxold:"O3PaisId",gxvar:"A3PaisId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A3PaisId=gx.num.intval(n)},v2z:function(n){gx.O.Z3PaisId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("PAISID",n||gx.fn.currentGridRowImpl(84),gx.O.A3PaisId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A3PaisId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("PAISID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[94]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"PROVINCIAID",gxz:"Z1ProvinciaId",gxold:"O1ProvinciaId",gxvar:"A1ProvinciaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A1ProvinciaId=gx.num.intval(n)},v2z:function(n){gx.O.Z1ProvinciaId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("PROVINCIAID",n||gx.fn.currentGridRowImpl(84),gx.O.A1ProvinciaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A1ProvinciaId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("PROVINCIAID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[95]={fld:"",grid:0};n[96]={fld:"",grid:0};n[97]={fld:"BTN_CANCEL",grid:0};this.AV6cEntidadId=0;this.ZV6cEntidadId=0;this.OV6cEntidadId=0;this.AV7cEntidadNumeroDocumento="";this.ZV7cEntidadNumeroDocumento="";this.OV7cEntidadNumeroDocumento="";this.AV8cEntidadNumero=0;this.ZV8cEntidadNumero=0;this.OV8cEntidadNumero=0;this.AV9cEntidadPiso=0;this.ZV9cEntidadPiso=0;this.OV9cEntidadPiso=0;this.AV10cEntidadDepto="";this.ZV10cEntidadDepto="";this.OV10cEntidadDepto="";this.AV11cEntidadCPostal="";this.ZV11cEntidadCPostal="";this.OV11cEntidadCPostal="";this.AV12cLocalidadId=0;this.ZV12cLocalidadId=0;this.OV12cLocalidadId=0;this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z20EntidadId=0;this.O20EntidadId=0;this.Z29EntidadNumeroDocumento="";this.O29EntidadNumeroDocumento="";this.Z23EntidadNumero=0;this.O23EntidadNumero=0;this.Z24EntidadPiso=0;this.O24EntidadPiso=0;this.Z25EntidadDepto="";this.O25EntidadDepto="";this.Z26EntidadCPostal="";this.O26EntidadCPostal="";this.Z5LocalidadId=0;this.O5LocalidadId=0;this.Z3PaisId=0;this.O3PaisId=0;this.Z1ProvinciaId=0;this.O1ProvinciaId=0;this.AV6cEntidadId=0;this.AV7cEntidadNumeroDocumento="";this.AV8cEntidadNumero=0;this.AV9cEntidadPiso=0;this.AV10cEntidadDepto="";this.AV11cEntidadCPostal="";this.AV12cLocalidadId=0;this.AV13pEntidadId=0;this.AV5LinkSelection="";this.A20EntidadId=0;this.A29EntidadNumeroDocumento="";this.A23EntidadNumero=0;this.A24EntidadPiso=0;this.A25EntidadDepto="";this.A26EntidadCPostal="";this.A5LocalidadId=0;this.A3PaisId=0;this.A1ProvinciaId=0;this.Events={e210m2_client:["ENTER",!0],e220m1_client:["CANCEL",!0],e180m1_client:["'TOGGLE'",!1],e110m1_client:["LBLENTIDADIDFILTER.CLICK",!1],e120m1_client:["LBLENTIDADNUMERODOCUMENTOFILTER.CLICK",!1],e130m1_client:["LBLENTIDADNUMEROFILTER.CLICK",!1],e140m1_client:["LBLENTIDADPISOFILTER.CLICK",!1],e150m1_client:["LBLENTIDADDEPTOFILTER.CLICK",!1],e160m1_client:["LBLENTIDADCPOSTALFILTER.CLICK",!1],e170m1_client:["LBLLOCALIDADIDFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEntidadId",fld:"vCENTIDADID"},{av:"AV7cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{av:"AV8cEntidadNumero",fld:"vCENTIDADNUMERO"},{av:"AV9cEntidadPiso",fld:"vCENTIDADPISO"},{av:"AV10cEntidadDepto",fld:"vCENTIDADDEPTO"},{av:"AV11cEntidadCPostal",fld:"vCENTIDADCPOSTAL"},{av:"AV12cLocalidadId",fld:"vCLOCALIDADID"}],[]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLENTIDADIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:"ENTIDADIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:"ENTIDADIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADID","Visible")',ctrl:"vCENTIDADID",prop:"Visible"}]];this.EvtParms["LBLENTIDADNUMERODOCUMENTOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class")',ctrl:"ENTIDADNUMERODOCUMENTOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class")',ctrl:"ENTIDADNUMERODOCUMENTOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADNUMERODOCUMENTO","Visible")',ctrl:"vCENTIDADNUMERODOCUMENTO",prop:"Visible"}]];this.EvtParms["LBLENTIDADNUMEROFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class")',ctrl:"ENTIDADNUMEROFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class")',ctrl:"ENTIDADNUMEROFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADNUMERO","Visible")',ctrl:"vCENTIDADNUMERO",prop:"Visible"}]];this.EvtParms["LBLENTIDADPISOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class")',ctrl:"ENTIDADPISOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class")',ctrl:"ENTIDADPISOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADPISO","Visible")',ctrl:"vCENTIDADPISO",prop:"Visible"}]];this.EvtParms["LBLENTIDADDEPTOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class")',ctrl:"ENTIDADDEPTOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class")',ctrl:"ENTIDADDEPTOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADDEPTO","Visible")',ctrl:"vCENTIDADDEPTO",prop:"Visible"}]];this.EvtParms["LBLENTIDADCPOSTALFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class")',ctrl:"ENTIDADCPOSTALFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class")',ctrl:"ENTIDADCPOSTALFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADCPOSTAL","Visible")',ctrl:"vCENTIDADCPOSTAL",prop:"Visible"}]];this.EvtParms["LBLLOCALIDADIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class")',ctrl:"LOCALIDADIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class")',ctrl:"LOCALIDADIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCLOCALIDADID","Visible")',ctrl:"vCLOCALIDADID",prop:"Visible"}]];this.EvtParms.LOAD=[[],[{av:"AV5LinkSelection",fld:"vLINKSELECTION"}]];this.EvtParms.ENTER=[[{av:"A20EntidadId",fld:"ENTIDADID"}],[{av:"AV13pEntidadId",fld:"vPENTIDADID"}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEntidadId",fld:"vCENTIDADID"},{av:"AV7cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{av:"AV8cEntidadNumero",fld:"vCENTIDADNUMERO"},{av:"AV9cEntidadPiso",fld:"vCENTIDADPISO"},{av:"AV10cEntidadDepto",fld:"vCENTIDADDEPTO"},{av:"AV11cEntidadCPostal",fld:"vCENTIDADCPOSTAL"},{av:"AV12cLocalidadId",fld:"vCLOCALIDADID"}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEntidadId",fld:"vCENTIDADID"},{av:"AV7cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{av:"AV8cEntidadNumero",fld:"vCENTIDADNUMERO"},{av:"AV9cEntidadPiso",fld:"vCENTIDADPISO"},{av:"AV10cEntidadDepto",fld:"vCENTIDADDEPTO"},{av:"AV11cEntidadCPostal",fld:"vCENTIDADCPOSTAL"},{av:"AV12cLocalidadId",fld:"vCLOCALIDADID"}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEntidadId",fld:"vCENTIDADID"},{av:"AV7cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{av:"AV8cEntidadNumero",fld:"vCENTIDADNUMERO"},{av:"AV9cEntidadPiso",fld:"vCENTIDADPISO"},{av:"AV10cEntidadDepto",fld:"vCENTIDADDEPTO"},{av:"AV11cEntidadCPostal",fld:"vCENTIDADCPOSTAL"},{av:"AV12cLocalidadId",fld:"vCLOCALIDADID"}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEntidadId",fld:"vCENTIDADID"},{av:"AV7cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{av:"AV8cEntidadNumero",fld:"vCENTIDADNUMERO"},{av:"AV9cEntidadPiso",fld:"vCENTIDADPISO"},{av:"AV10cEntidadDepto",fld:"vCENTIDADDEPTO"},{av:"AV11cEntidadCPostal",fld:"vCENTIDADCPOSTAL"},{av:"AV12cLocalidadId",fld:"vCLOCALIDADID"}],[]];this.setVCMap("AV13pEntidadId","vPENTIDADID",0,"int");t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar(this.GXValidFnc[36]);t.addRefreshingVar(this.GXValidFnc[46]);t.addRefreshingVar(this.GXValidFnc[56]);t.addRefreshingVar(this.GXValidFnc[66]);t.addRefreshingVar(this.GXValidFnc[76]);this.Initialize()});gx.createParentObj(gx00i0)