/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:32:30.31
*/
gx.evt.autoSkip=!1;gx.define("gx0180",!1,function(){var n,t;this.ServerClass="gx0180";this.PackageName="com.kberp";this.setObjectType("web");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV13pEmpresaId=gx.fn.getIntegerValue("vPEMPRESAID",".");this.AV14pEntidadId=gx.fn.getIntegerValue("vPENTIDADID",".")};this.Validv_Centidadtipo=function(){try{var n=gx.util.balloon.getNew("vCENTIDADTIPO");if(this.AnyError=0,!(this.AV9cEntidadTipo==1||this.AV9cEntidadTipo==1||0==this.AV9cEntidadTipo))try{n.setError("Campo cEntidadTipo fuera de rango");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0};this.e18151_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")=="AdvancedContainer"?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle"));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}])};this.e11151_client=function(){this.clearMessages();gx.fn.getCtrlProperty("EMPRESAIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("EMPRESAIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCEMPRESAID","Visible",!0)):(gx.fn.setCtrlProperty("EMPRESAIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCEMPRESAID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("EMPRESAIDFILTERCONTAINER","Class")',ctrl:"EMPRESAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCEMPRESAID","Visible")',ctrl:"vCEMPRESAID",prop:"Visible"}])};this.e12151_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADID","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:"ENTIDADIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADID","Visible")',ctrl:"vCENTIDADID",prop:"Visible"}])};this.e13151_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADNUMERODOCUMENTO","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADNUMERODOCUMENTO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class")',ctrl:"ENTIDADNUMERODOCUMENTOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADNUMERODOCUMENTO","Visible")',ctrl:"vCENTIDADNUMERODOCUMENTO",prop:"Visible"}])};this.e14151_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADTIPOFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADTIPOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADTIPO","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADTIPOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADTIPO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADTIPOFILTERCONTAINER","Class")',ctrl:"ENTIDADTIPOFILTERCONTAINER",prop:"Class"},{ctrl:"vCENTIDADTIPO"}])};this.e15151_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADTIPODOCUMENTOIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADTIPODOCUMENTOIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADTIPODOCUMENTOID","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADTIPODOCUMENTOIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADTIPODOCUMENTOID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADTIPODOCUMENTOIDFILTERCONTAINER","Class")',ctrl:"ENTIDADTIPODOCUMENTOIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADTIPODOCUMENTOID","Visible")',ctrl:"vCENTIDADTIPODOCUMENTOID",prop:"Visible"}])};this.e16151_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADCONDCPRAVTAIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADCONDCPRAVTAIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADCONDCPRAVTAID","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADCONDCPRAVTAIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADCONDCPRAVTAID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADCONDCPRAVTAIDFILTERCONTAINER","Class")',ctrl:"ENTIDADCONDCPRAVTAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADCONDCPRAVTAID","Visible")',ctrl:"vCENTIDADCONDCPRAVTAID",prop:"Visible"}])};this.e17151_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADPAISIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADPAISIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADPAISID","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADPAISIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADPAISID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADPAISIDFILTERCONTAINER","Class")',ctrl:"ENTIDADPAISIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADPAISID","Visible")',ctrl:"vCENTIDADPAISID",prop:"Visible"}])};this.e21152_client=function(){this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e22151_client=function(){this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,85,86,87,88,89,90,91,92,93,94,95];this.GXLastCtrlId=95;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",84,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0180",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px","Nueva fila",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",85,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(42,86,"EMPRESAID","Empresa Id","","EmpresaId","int",0,"px",6,6,"right",null,[],42,"EmpresaId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(81,87,"ENTIDADID","Id","","EntidadId","int",0,"px",6,6,"right",null,[],81,"EntidadId",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addSingleLineEdit(83,88,"ENTIDADNUMERODOCUMENTO","Numero Documento","","EntidadNumeroDocumento","char",0,"px",13,13,"left",null,[],83,"EntidadNumeroDocumento",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addComboBox(94,89,"ENTIDADTIPO","Tipo","EntidadTipo","int",null,0,!0,!1,0,"px","WWColumn OptionalColumn");t.addSingleLineEdit(102,90,"ENTIDADTIPODOCUMENTOID","Documento Id","","EntidadTipoDocumentoId","int",0,"px",4,4,"right",null,[],102,"EntidadTipoDocumentoId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(103,91,"ENTIDADCONDCPRAVTAID","Vta Id","","EntidadCondCpraVtaId","int",0,"px",4,4,"right",null,[],103,"EntidadCondCpraVtaId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(99,92,"ENTIDADPAISID","Pais Id","","EntidadPaisId","int",0,"px",4,4,"right",null,[],99,"EntidadPaisId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={fld:"",grid:0};n[3]={fld:"MAIN",grid:0};n[4]={fld:"",grid:0};n[5]={fld:"",grid:0};n[6]={fld:"ADVANCEDCONTAINER",grid:0};n[7]={fld:"",grid:0};n[8]={fld:"",grid:0};n[9]={fld:"EMPRESAIDFILTERCONTAINER",grid:0};n[10]={fld:"",grid:0};n[11]={fld:"",grid:0};n[12]={fld:"LBLEMPRESAIDFILTER",format:1,grid:0,evt:"e11151_client"};n[13]={fld:"",grid:0};n[14]={fld:"",grid:0};n[15]={fld:"",grid:0};n[16]={lvl:0,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCEMPRESAID",gxz:"ZV6cEmpresaId",gxold:"OV6cEmpresaId",gxvar:"AV6cEmpresaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV6cEmpresaId=gx.num.intval(n)},v2z:function(n){gx.O.ZV6cEmpresaId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCEMPRESAID",gx.O.AV6cEmpresaId,0)},c2v:function(){gx.O.AV6cEmpresaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCEMPRESAID",".")},nac:gx.falseFn};n[17]={fld:"",grid:0};n[18]={fld:"",grid:0};n[19]={fld:"ENTIDADIDFILTERCONTAINER",grid:0};n[20]={fld:"",grid:0};n[21]={fld:"",grid:0};n[22]={fld:"LBLENTIDADIDFILTER",format:1,grid:0,evt:"e12151_client"};n[23]={fld:"",grid:0};n[24]={fld:"",grid:0};n[25]={fld:"",grid:0};n[26]={lvl:0,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADID",gxz:"ZV7cEntidadId",gxold:"OV7cEntidadId",gxvar:"AV7cEntidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV7cEntidadId=gx.num.intval(n)},v2z:function(n){gx.O.ZV7cEntidadId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCENTIDADID",gx.O.AV7cEntidadId,0)},c2v:function(){gx.O.AV7cEntidadId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADID",".")},nac:gx.falseFn};n[27]={fld:"",grid:0};n[28]={fld:"",grid:0};n[29]={fld:"ENTIDADNUMERODOCUMENTOFILTERCONTAINER",grid:0};n[30]={fld:"",grid:0};n[31]={fld:"",grid:0};n[32]={fld:"LBLENTIDADNUMERODOCUMENTOFILTER",format:1,grid:0,evt:"e13151_client"};n[33]={fld:"",grid:0};n[34]={fld:"",grid:0};n[35]={fld:"",grid:0};n[36]={lvl:0,type:"char",len:13,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADNUMERODOCUMENTO",gxz:"ZV8cEntidadNumeroDocumento",gxold:"OV8cEntidadNumeroDocumento",gxvar:"AV8cEntidadNumeroDocumento",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV8cEntidadNumeroDocumento=n},v2z:function(n){gx.O.ZV8cEntidadNumeroDocumento=n},v2c:function(){gx.fn.setControlValue("vCENTIDADNUMERODOCUMENTO",gx.O.AV8cEntidadNumeroDocumento,0)},c2v:function(){gx.O.AV8cEntidadNumeroDocumento=this.val()},val:function(){return gx.fn.getControlValue("vCENTIDADNUMERODOCUMENTO")},nac:gx.falseFn};n[37]={fld:"",grid:0};n[38]={fld:"",grid:0};n[39]={fld:"ENTIDADTIPOFILTERCONTAINER",grid:0};n[40]={fld:"",grid:0};n[41]={fld:"",grid:0};n[42]={fld:"LBLENTIDADTIPOFILTER",format:1,grid:0,evt:"e14151_client"};n[43]={fld:"",grid:0};n[44]={fld:"",grid:0};n[45]={fld:"",grid:0};n[46]={lvl:0,type:"int",len:2,dec:0,sign:!1,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:this.Validv_Centidadtipo,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADTIPO",gxz:"ZV9cEntidadTipo",gxold:"OV9cEntidadTipo",gxvar:"AV9cEntidadTipo",ucs:[],op:[46],ip:[46],nacdep:[],ctrltype:"combo",v2v:function(n){gx.O.AV9cEntidadTipo=gx.num.intval(n)},v2z:function(n){gx.O.ZV9cEntidadTipo=gx.num.intval(n)},v2c:function(){gx.fn.setComboBoxValue("vCENTIDADTIPO",gx.O.AV9cEntidadTipo)},c2v:function(){gx.O.AV9cEntidadTipo=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADTIPO",".")},nac:gx.falseFn};n[47]={fld:"",grid:0};n[48]={fld:"",grid:0};n[49]={fld:"ENTIDADTIPODOCUMENTOIDFILTERCONTAINER",grid:0};n[50]={fld:"",grid:0};n[51]={fld:"",grid:0};n[52]={fld:"LBLENTIDADTIPODOCUMENTOIDFILTER",format:1,grid:0,evt:"e15151_client"};n[53]={fld:"",grid:0};n[54]={fld:"",grid:0};n[55]={fld:"",grid:0};n[56]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADTIPODOCUMENTOID",gxz:"ZV10cEntidadTipoDocumentoId",gxold:"OV10cEntidadTipoDocumentoId",gxvar:"AV10cEntidadTipoDocumentoId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV10cEntidadTipoDocumentoId=gx.num.intval(n)},v2z:function(n){gx.O.ZV10cEntidadTipoDocumentoId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCENTIDADTIPODOCUMENTOID",gx.O.AV10cEntidadTipoDocumentoId,0)},c2v:function(){gx.O.AV10cEntidadTipoDocumentoId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADTIPODOCUMENTOID",".")},nac:gx.falseFn};n[57]={fld:"",grid:0};n[58]={fld:"",grid:0};n[59]={fld:"ENTIDADCONDCPRAVTAIDFILTERCONTAINER",grid:0};n[60]={fld:"",grid:0};n[61]={fld:"",grid:0};n[62]={fld:"LBLENTIDADCONDCPRAVTAIDFILTER",format:1,grid:0,evt:"e16151_client"};n[63]={fld:"",grid:0};n[64]={fld:"",grid:0};n[65]={fld:"",grid:0};n[66]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADCONDCPRAVTAID",gxz:"ZV11cEntidadCondCpraVtaId",gxold:"OV11cEntidadCondCpraVtaId",gxvar:"AV11cEntidadCondCpraVtaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV11cEntidadCondCpraVtaId=gx.num.intval(n)},v2z:function(n){gx.O.ZV11cEntidadCondCpraVtaId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCENTIDADCONDCPRAVTAID",gx.O.AV11cEntidadCondCpraVtaId,0)},c2v:function(){gx.O.AV11cEntidadCondCpraVtaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADCONDCPRAVTAID",".")},nac:gx.falseFn};n[67]={fld:"",grid:0};n[68]={fld:"",grid:0};n[69]={fld:"ENTIDADPAISIDFILTERCONTAINER",grid:0};n[70]={fld:"",grid:0};n[71]={fld:"",grid:0};n[72]={fld:"LBLENTIDADPAISIDFILTER",format:1,grid:0,evt:"e17151_client"};n[73]={fld:"",grid:0};n[74]={fld:"",grid:0};n[75]={fld:"",grid:0};n[76]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADPAISID",gxz:"ZV12cEntidadPaisId",gxold:"OV12cEntidadPaisId",gxvar:"AV12cEntidadPaisId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV12cEntidadPaisId=gx.num.intval(n)},v2z:function(n){gx.O.ZV12cEntidadPaisId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCENTIDADPAISID",gx.O.AV12cEntidadPaisId,0)},c2v:function(){gx.O.AV12cEntidadPaisId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADPAISID",".")},nac:gx.falseFn};n[77]={fld:"",grid:0};n[78]={fld:"GRIDTABLE",grid:0};n[79]={fld:"",grid:0};n[80]={fld:"",grid:0};n[81]={fld:"BTNTOGGLE",grid:0};n[82]={fld:"",grid:0};n[83]={fld:"",grid:0};n[85]={lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.AV5LinkSelection=n},v2z:function(n){gx.O.ZV5LinkSelection=n},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84),gx.O.AV5LinkSelection,gx.O.AV18Linkselection_GXI)},c2v:function(){gx.O.AV18Linkselection_GXI=this.val_GXI();gx.O.AV5LinkSelection=this.val()},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(84))},gxvar_GXI:"AV18Linkselection_GXI",nac:gx.falseFn};n[86]={lvl:2,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESAID",gxz:"Z42EmpresaId",gxold:"O42EmpresaId",gxvar:"A42EmpresaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A42EmpresaId=gx.num.intval(n)},v2z:function(n){gx.O.Z42EmpresaId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("EMPRESAID",n||gx.fn.currentGridRowImpl(84),gx.O.A42EmpresaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A42EmpresaId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("EMPRESAID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[87]={lvl:2,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADID",gxz:"Z81EntidadId",gxold:"O81EntidadId",gxvar:"A81EntidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A81EntidadId=gx.num.intval(n)},v2z:function(n){gx.O.Z81EntidadId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADID",n||gx.fn.currentGridRowImpl(84),gx.O.A81EntidadId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A81EntidadId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[88]={lvl:2,type:"char",len:13,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADNUMERODOCUMENTO",gxz:"Z83EntidadNumeroDocumento",gxold:"O83EntidadNumeroDocumento",gxvar:"A83EntidadNumeroDocumento",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A83EntidadNumeroDocumento=n},v2z:function(n){gx.O.Z83EntidadNumeroDocumento=n},v2c:function(n){gx.fn.setGridControlValue("ENTIDADNUMERODOCUMENTO",n||gx.fn.currentGridRowImpl(84),gx.O.A83EntidadNumeroDocumento,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A83EntidadNumeroDocumento=this.val()},val:function(n){return gx.fn.getGridControlValue("ENTIDADNUMERODOCUMENTO",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[89]={lvl:2,type:"int",len:2,dec:0,sign:!1,pic:"Z9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADTIPO",gxz:"Z94EntidadTipo",gxold:"O94EntidadTipo",gxvar:"A94EntidadTipo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",inputType:"text",v2v:function(n){gx.O.A94EntidadTipo=gx.num.intval(n)},v2z:function(n){gx.O.Z94EntidadTipo=gx.num.intval(n)},v2c:function(n){gx.fn.setGridComboBoxValue("ENTIDADTIPO",n||gx.fn.currentGridRowImpl(84),gx.O.A94EntidadTipo);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A94EntidadTipo=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADTIPO",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[90]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADTIPODOCUMENTOID",gxz:"Z102EntidadTipoDocumentoId",gxold:"O102EntidadTipoDocumentoId",gxvar:"A102EntidadTipoDocumentoId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A102EntidadTipoDocumentoId=gx.num.intval(n)},v2z:function(n){gx.O.Z102EntidadTipoDocumentoId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADTIPODOCUMENTOID",n||gx.fn.currentGridRowImpl(84),gx.O.A102EntidadTipoDocumentoId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A102EntidadTipoDocumentoId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADTIPODOCUMENTOID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[91]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADCONDCPRAVTAID",gxz:"Z103EntidadCondCpraVtaId",gxold:"O103EntidadCondCpraVtaId",gxvar:"A103EntidadCondCpraVtaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A103EntidadCondCpraVtaId=gx.num.intval(n)},v2z:function(n){gx.O.Z103EntidadCondCpraVtaId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADCONDCPRAVTAID",n||gx.fn.currentGridRowImpl(84),gx.O.A103EntidadCondCpraVtaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A103EntidadCondCpraVtaId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADCONDCPRAVTAID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[92]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADPAISID",gxz:"Z99EntidadPaisId",gxold:"O99EntidadPaisId",gxvar:"A99EntidadPaisId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A99EntidadPaisId=gx.num.intval(n)},v2z:function(n){gx.O.Z99EntidadPaisId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADPAISID",n||gx.fn.currentGridRowImpl(84),gx.O.A99EntidadPaisId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A99EntidadPaisId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADPAISID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[93]={fld:"",grid:0};n[94]={fld:"",grid:0};n[95]={fld:"BTN_CANCEL",grid:0};this.AV6cEmpresaId=0;this.ZV6cEmpresaId=0;this.OV6cEmpresaId=0;this.AV7cEntidadId=0;this.ZV7cEntidadId=0;this.OV7cEntidadId=0;this.AV8cEntidadNumeroDocumento="";this.ZV8cEntidadNumeroDocumento="";this.OV8cEntidadNumeroDocumento="";this.AV9cEntidadTipo=0;this.ZV9cEntidadTipo=0;this.OV9cEntidadTipo=0;this.AV10cEntidadTipoDocumentoId=0;this.ZV10cEntidadTipoDocumentoId=0;this.OV10cEntidadTipoDocumentoId=0;this.AV11cEntidadCondCpraVtaId=0;this.ZV11cEntidadCondCpraVtaId=0;this.OV11cEntidadCondCpraVtaId=0;this.AV12cEntidadPaisId=0;this.ZV12cEntidadPaisId=0;this.OV12cEntidadPaisId=0;this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z42EmpresaId=0;this.O42EmpresaId=0;this.Z81EntidadId=0;this.O81EntidadId=0;this.Z83EntidadNumeroDocumento="";this.O83EntidadNumeroDocumento="";this.Z94EntidadTipo=0;this.O94EntidadTipo=0;this.Z102EntidadTipoDocumentoId=0;this.O102EntidadTipoDocumentoId=0;this.Z103EntidadCondCpraVtaId=0;this.O103EntidadCondCpraVtaId=0;this.Z99EntidadPaisId=0;this.O99EntidadPaisId=0;this.AV6cEmpresaId=0;this.AV7cEntidadId=0;this.AV8cEntidadNumeroDocumento="";this.AV9cEntidadTipo=0;this.AV10cEntidadTipoDocumentoId=0;this.AV11cEntidadCondCpraVtaId=0;this.AV12cEntidadPaisId=0;this.AV13pEmpresaId=0;this.AV14pEntidadId=0;this.AV5LinkSelection="";this.A42EmpresaId=0;this.A81EntidadId=0;this.A83EntidadNumeroDocumento="";this.A94EntidadTipo=0;this.A102EntidadTipoDocumentoId=0;this.A103EntidadCondCpraVtaId=0;this.A99EntidadPaisId=0;this.Events={e21152_client:["ENTER",!0],e22151_client:["CANCEL",!0],e18151_client:["'TOGGLE'",!1],e11151_client:["LBLEMPRESAIDFILTER.CLICK",!1],e12151_client:["LBLENTIDADIDFILTER.CLICK",!1],e13151_client:["LBLENTIDADNUMERODOCUMENTOFILTER.CLICK",!1],e14151_client:["LBLENTIDADTIPOFILTER.CLICK",!1],e15151_client:["LBLENTIDADTIPODOCUMENTOIDFILTER.CLICK",!1],e16151_client:["LBLENTIDADCONDCPRAVTAIDFILTER.CLICK",!1],e17151_client:["LBLENTIDADPAISIDFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{ctrl:"vCENTIDADTIPO"},{av:"AV9cEntidadTipo",fld:"vCENTIDADTIPO"},{av:"AV10cEntidadTipoDocumentoId",fld:"vCENTIDADTIPODOCUMENTOID"},{av:"AV11cEntidadCondCpraVtaId",fld:"vCENTIDADCONDCPRAVTAID"},{av:"AV12cEntidadPaisId",fld:"vCENTIDADPAISID"}],[]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLEMPRESAIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("EMPRESAIDFILTERCONTAINER","Class")',ctrl:"EMPRESAIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("EMPRESAIDFILTERCONTAINER","Class")',ctrl:"EMPRESAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCEMPRESAID","Visible")',ctrl:"vCEMPRESAID",prop:"Visible"}]];this.EvtParms["LBLENTIDADIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:"ENTIDADIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:"ENTIDADIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADID","Visible")',ctrl:"vCENTIDADID",prop:"Visible"}]];this.EvtParms["LBLENTIDADNUMERODOCUMENTOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class")',ctrl:"ENTIDADNUMERODOCUMENTOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADNUMERODOCUMENTOFILTERCONTAINER","Class")',ctrl:"ENTIDADNUMERODOCUMENTOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADNUMERODOCUMENTO","Visible")',ctrl:"vCENTIDADNUMERODOCUMENTO",prop:"Visible"}]];this.EvtParms["LBLENTIDADTIPOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADTIPOFILTERCONTAINER","Class")',ctrl:"ENTIDADTIPOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADTIPOFILTERCONTAINER","Class")',ctrl:"ENTIDADTIPOFILTERCONTAINER",prop:"Class"},{ctrl:"vCENTIDADTIPO"}]];this.EvtParms["LBLENTIDADTIPODOCUMENTOIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADTIPODOCUMENTOIDFILTERCONTAINER","Class")',ctrl:"ENTIDADTIPODOCUMENTOIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADTIPODOCUMENTOIDFILTERCONTAINER","Class")',ctrl:"ENTIDADTIPODOCUMENTOIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADTIPODOCUMENTOID","Visible")',ctrl:"vCENTIDADTIPODOCUMENTOID",prop:"Visible"}]];this.EvtParms["LBLENTIDADCONDCPRAVTAIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADCONDCPRAVTAIDFILTERCONTAINER","Class")',ctrl:"ENTIDADCONDCPRAVTAIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADCONDCPRAVTAIDFILTERCONTAINER","Class")',ctrl:"ENTIDADCONDCPRAVTAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADCONDCPRAVTAID","Visible")',ctrl:"vCENTIDADCONDCPRAVTAID",prop:"Visible"}]];this.EvtParms["LBLENTIDADPAISIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADPAISIDFILTERCONTAINER","Class")',ctrl:"ENTIDADPAISIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADPAISIDFILTERCONTAINER","Class")',ctrl:"ENTIDADPAISIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADPAISID","Visible")',ctrl:"vCENTIDADPAISID",prop:"Visible"}]];this.EvtParms.LOAD=[[],[{av:"AV5LinkSelection",fld:"vLINKSELECTION"}]];this.EvtParms.ENTER=[[{av:"A42EmpresaId",fld:"EMPRESAID"},{av:"A81EntidadId",fld:"ENTIDADID"}],[{av:"AV13pEmpresaId",fld:"vPEMPRESAID"},{av:"AV14pEntidadId",fld:"vPENTIDADID"}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{ctrl:"vCENTIDADTIPO"},{av:"AV9cEntidadTipo",fld:"vCENTIDADTIPO"},{av:"AV10cEntidadTipoDocumentoId",fld:"vCENTIDADTIPODOCUMENTOID"},{av:"AV11cEntidadCondCpraVtaId",fld:"vCENTIDADCONDCPRAVTAID"},{av:"AV12cEntidadPaisId",fld:"vCENTIDADPAISID"}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{ctrl:"vCENTIDADTIPO"},{av:"AV9cEntidadTipo",fld:"vCENTIDADTIPO"},{av:"AV10cEntidadTipoDocumentoId",fld:"vCENTIDADTIPODOCUMENTOID"},{av:"AV11cEntidadCondCpraVtaId",fld:"vCENTIDADCONDCPRAVTAID"},{av:"AV12cEntidadPaisId",fld:"vCENTIDADPAISID"}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{ctrl:"vCENTIDADTIPO"},{av:"AV9cEntidadTipo",fld:"vCENTIDADTIPO"},{av:"AV10cEntidadTipoDocumentoId",fld:"vCENTIDADTIPODOCUMENTOID"},{av:"AV11cEntidadCondCpraVtaId",fld:"vCENTIDADCONDCPRAVTAID"},{av:"AV12cEntidadPaisId",fld:"vCENTIDADPAISID"}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cEntidadNumeroDocumento",fld:"vCENTIDADNUMERODOCUMENTO"},{ctrl:"vCENTIDADTIPO"},{av:"AV9cEntidadTipo",fld:"vCENTIDADTIPO"},{av:"AV10cEntidadTipoDocumentoId",fld:"vCENTIDADTIPODOCUMENTOID"},{av:"AV11cEntidadCondCpraVtaId",fld:"vCENTIDADCONDCPRAVTAID"},{av:"AV12cEntidadPaisId",fld:"vCENTIDADPAISID"}],[]];this.setVCMap("AV13pEmpresaId","vPEMPRESAID",0,"int");this.setVCMap("AV14pEntidadId","vPENTIDADID",0,"int");t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar(this.GXValidFnc[36]);t.addRefreshingVar(this.GXValidFnc[46]);t.addRefreshingVar(this.GXValidFnc[56]);t.addRefreshingVar(this.GXValidFnc[66]);t.addRefreshingVar(this.GXValidFnc[76]);this.Initialize()});gx.createParentObj(gx0180)