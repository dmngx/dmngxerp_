/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 14:28:46.81
*/
gx.evt.autoSkip=!1;gx.define("gx00k0",!1,function(){var n,t;this.ServerClass="gx00k0";this.PackageName="com.kberp";this.setObjectType("web");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV13pEmpresaId=gx.fn.getIntegerValue("vPEMPRESAID",".");this.AV14pEntidadId=gx.fn.getIntegerValue("vPENTIDADID",".");this.AV15pCfgComprobanteId=gx.fn.getControlValue("vPCFGCOMPROBANTEID");this.AV16pCfgComprobantePrefijo=gx.fn.getIntegerValue("vPCFGCOMPROBANTEPREFIJO",".");this.AV17pComprobanteNumero=gx.fn.getIntegerValue("vPCOMPROBANTENUMERO",".");this.AV18pCfgComprobanteDetalleLetra=gx.fn.getIntegerValue("vPCFGCOMPROBANTEDETALLELETRA",".")};this.Validv_Ccfgcomprobantedetalleletra=function(){try{var n=gx.util.balloon.getNew("vCCFGCOMPROBANTEDETALLELETRA");if(this.AnyError=0,!(this.AV11cCfgComprobanteDetalleLetra==1||this.AV11cCfgComprobanteDetalleLetra==2||this.AV11cCfgComprobanteDetalleLetra==3||this.AV11cCfgComprobanteDetalleLetra==4||this.AV11cCfgComprobanteDetalleLetra==5||this.AV11cCfgComprobanteDetalleLetra==6||this.AV11cCfgComprobanteDetalleLetra==7||0==this.AV11cCfgComprobanteDetalleLetra))try{n.setError("Campo cCfgComprobanteDetalleLetra fuera de rango");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0};this.e180t1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")=="AdvancedContainer"?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle"));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}])};this.e110t1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("EMPRESAIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("EMPRESAIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCEMPRESAID","Visible",!0)):(gx.fn.setCtrlProperty("EMPRESAIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCEMPRESAID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("EMPRESAIDFILTERCONTAINER","Class")',ctrl:"EMPRESAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCEMPRESAID","Visible")',ctrl:"vCEMPRESAID",prop:"Visible"}])};this.e120t1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ENTIDADIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENTIDADID","Visible",!0)):(gx.fn.setCtrlProperty("ENTIDADIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENTIDADID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:"ENTIDADIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADID","Visible")',ctrl:"vCENTIDADID",prop:"Visible"}])};this.e130t1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("CFGCOMPROBANTEIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("CFGCOMPROBANTEIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCCFGCOMPROBANTEID","Visible",!0)):(gx.fn.setCtrlProperty("CFGCOMPROBANTEIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCCFGCOMPROBANTEID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("CFGCOMPROBANTEIDFILTERCONTAINER","Class")',ctrl:"CFGCOMPROBANTEIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCFGCOMPROBANTEID","Visible")',ctrl:"vCCFGCOMPROBANTEID",prop:"Visible"}])};this.e140t1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("CFGCOMPROBANTEPREFIJOFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("CFGCOMPROBANTEPREFIJOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCCFGCOMPROBANTEPREFIJO","Visible",!0)):(gx.fn.setCtrlProperty("CFGCOMPROBANTEPREFIJOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCCFGCOMPROBANTEPREFIJO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("CFGCOMPROBANTEPREFIJOFILTERCONTAINER","Class")',ctrl:"CFGCOMPROBANTEPREFIJOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCFGCOMPROBANTEPREFIJO","Visible")',ctrl:"vCCFGCOMPROBANTEPREFIJO",prop:"Visible"}])};this.e150t1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("COMPROBANTENUMEROFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("COMPROBANTENUMEROFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCCOMPROBANTENUMERO","Visible",!0)):(gx.fn.setCtrlProperty("COMPROBANTENUMEROFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCCOMPROBANTENUMERO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("COMPROBANTENUMEROFILTERCONTAINER","Class")',ctrl:"COMPROBANTENUMEROFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCOMPROBANTENUMERO","Visible")',ctrl:"vCCOMPROBANTENUMERO",prop:"Visible"}])};this.e160t1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCCFGCOMPROBANTEDETALLELETRA","Visible",!0)):(gx.fn.setCtrlProperty("CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCCFGCOMPROBANTEDETALLELETRA","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER","Class")',ctrl:"CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER",prop:"Class"},{ctrl:"vCCFGCOMPROBANTEDETALLELETRA"}])};this.e170t1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("COMPROBANTEFECHAFILTERCONTAINER","Class")=="AdvancedContainerItem"?gx.fn.setCtrlProperty("COMPROBANTEFECHAFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"):gx.fn.setCtrlProperty("COMPROBANTEFECHAFILTERCONTAINER","Class","AdvancedContainerItem");this.refreshOutputs([{av:'gx.fn.getCtrlProperty("COMPROBANTEFECHAFILTERCONTAINER","Class")',ctrl:"COMPROBANTEFECHAFILTERCONTAINER",prop:"Class"}])};this.e210t2_client=function(){this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e220t1_client=function(){this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,85,86,87,88,89,90,91,92,93,94,95];this.GXLastCtrlId=95;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",84,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx00k0",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px","Nueva fila",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",85,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(42,86,"EMPRESAID","Empresa Id","","EmpresaId","int",0,"px",6,6,"right",null,[],42,"EmpresaId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(20,87,"ENTIDADID","Id","","EntidadId","int",0,"px",6,6,"right",null,[],20,"EntidadId",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addSingleLineEdit(31,88,"CFGCOMPROBANTEID","Cfg Comprobante Id","","CfgComprobanteId","svchar",0,"px",10,10,"left",null,[],31,"CfgComprobanteId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(32,89,"CFGCOMPROBANTEPREFIJO","Cfg Comprobante Prefijo","","CfgComprobantePrefijo","int",0,"px",4,4,"right",null,[],32,"CfgComprobantePrefijo",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(55,90,"COMPROBANTENUMERO","Numero","","ComprobanteNumero","int",0,"px",8,8,"right",null,[],55,"ComprobanteNumero",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addComboBox(35,91,"CFGCOMPROBANTEDETALLELETRA","Cfg Comprobante Detalle Letra","CfgComprobanteDetalleLetra","int",null,0,!0,!1,0,"px","WWColumn OptionalColumn");t.addSingleLineEdit(61,92,"COMPROBANTEFECHA","Fecha","","ComprobanteFecha","date",0,"px",8,8,"right",null,[],61,"ComprobanteFecha",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={fld:"",grid:0};n[3]={fld:"MAIN",grid:0};n[4]={fld:"",grid:0};n[5]={fld:"",grid:0};n[6]={fld:"ADVANCEDCONTAINER",grid:0};n[7]={fld:"",grid:0};n[8]={fld:"",grid:0};n[9]={fld:"EMPRESAIDFILTERCONTAINER",grid:0};n[10]={fld:"",grid:0};n[11]={fld:"",grid:0};n[12]={fld:"LBLEMPRESAIDFILTER",format:1,grid:0,evt:"e110t1_client"};n[13]={fld:"",grid:0};n[14]={fld:"",grid:0};n[15]={fld:"",grid:0};n[16]={lvl:0,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCEMPRESAID",gxz:"ZV6cEmpresaId",gxold:"OV6cEmpresaId",gxvar:"AV6cEmpresaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV6cEmpresaId=gx.num.intval(n)},v2z:function(n){gx.O.ZV6cEmpresaId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCEMPRESAID",gx.O.AV6cEmpresaId,0)},c2v:function(){gx.O.AV6cEmpresaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCEMPRESAID",".")},nac:gx.falseFn};n[17]={fld:"",grid:0};n[18]={fld:"",grid:0};n[19]={fld:"ENTIDADIDFILTERCONTAINER",grid:0};n[20]={fld:"",grid:0};n[21]={fld:"",grid:0};n[22]={fld:"LBLENTIDADIDFILTER",format:1,grid:0,evt:"e120t1_client"};n[23]={fld:"",grid:0};n[24]={fld:"",grid:0};n[25]={fld:"",grid:0};n[26]={lvl:0,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADID",gxz:"ZV7cEntidadId",gxold:"OV7cEntidadId",gxvar:"AV7cEntidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV7cEntidadId=gx.num.intval(n)},v2z:function(n){gx.O.ZV7cEntidadId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCENTIDADID",gx.O.AV7cEntidadId,0)},c2v:function(){gx.O.AV7cEntidadId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADID",".")},nac:gx.falseFn};n[27]={fld:"",grid:0};n[28]={fld:"",grid:0};n[29]={fld:"CFGCOMPROBANTEIDFILTERCONTAINER",grid:0};n[30]={fld:"",grid:0};n[31]={fld:"",grid:0};n[32]={fld:"LBLCFGCOMPROBANTEIDFILTER",format:1,grid:0,evt:"e130t1_client"};n[33]={fld:"",grid:0};n[34]={fld:"",grid:0};n[35]={fld:"",grid:0};n[36]={lvl:0,type:"svchar",len:10,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCCFGCOMPROBANTEID",gxz:"ZV8cCfgComprobanteId",gxold:"OV8cCfgComprobanteId",gxvar:"AV8cCfgComprobanteId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV8cCfgComprobanteId=n},v2z:function(n){gx.O.ZV8cCfgComprobanteId=n},v2c:function(){gx.fn.setControlValue("vCCFGCOMPROBANTEID",gx.O.AV8cCfgComprobanteId,0)},c2v:function(){gx.O.AV8cCfgComprobanteId=this.val()},val:function(){return gx.fn.getControlValue("vCCFGCOMPROBANTEID")},nac:gx.falseFn};n[37]={fld:"",grid:0};n[38]={fld:"",grid:0};n[39]={fld:"CFGCOMPROBANTEPREFIJOFILTERCONTAINER",grid:0};n[40]={fld:"",grid:0};n[41]={fld:"",grid:0};n[42]={fld:"LBLCFGCOMPROBANTEPREFIJOFILTER",format:1,grid:0,evt:"e140t1_client"};n[43]={fld:"",grid:0};n[44]={fld:"",grid:0};n[45]={fld:"",grid:0};n[46]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCCFGCOMPROBANTEPREFIJO",gxz:"ZV9cCfgComprobantePrefijo",gxold:"OV9cCfgComprobantePrefijo",gxvar:"AV9cCfgComprobantePrefijo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV9cCfgComprobantePrefijo=gx.num.intval(n)},v2z:function(n){gx.O.ZV9cCfgComprobantePrefijo=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCCFGCOMPROBANTEPREFIJO",gx.O.AV9cCfgComprobantePrefijo,0)},c2v:function(){gx.O.AV9cCfgComprobantePrefijo=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCCFGCOMPROBANTEPREFIJO",".")},nac:gx.falseFn};n[47]={fld:"",grid:0};n[48]={fld:"",grid:0};n[49]={fld:"COMPROBANTENUMEROFILTERCONTAINER",grid:0};n[50]={fld:"",grid:0};n[51]={fld:"",grid:0};n[52]={fld:"LBLCOMPROBANTENUMEROFILTER",format:1,grid:0,evt:"e150t1_client"};n[53]={fld:"",grid:0};n[54]={fld:"",grid:0};n[55]={fld:"",grid:0};n[56]={lvl:0,type:"int",len:8,dec:0,sign:!1,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCCOMPROBANTENUMERO",gxz:"ZV10cComprobanteNumero",gxold:"OV10cComprobanteNumero",gxvar:"AV10cComprobanteNumero",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV10cComprobanteNumero=gx.num.intval(n)},v2z:function(n){gx.O.ZV10cComprobanteNumero=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCCOMPROBANTENUMERO",gx.O.AV10cComprobanteNumero,0)},c2v:function(){gx.O.AV10cComprobanteNumero=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCCOMPROBANTENUMERO",".")},nac:gx.falseFn};n[57]={fld:"",grid:0};n[58]={fld:"",grid:0};n[59]={fld:"CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER",grid:0};n[60]={fld:"",grid:0};n[61]={fld:"",grid:0};n[62]={fld:"LBLCFGCOMPROBANTEDETALLELETRAFILTER",format:1,grid:0,evt:"e160t1_client"};n[63]={fld:"",grid:0};n[64]={fld:"",grid:0};n[65]={fld:"",grid:0};n[66]={lvl:0,type:"int",len:2,dec:0,sign:!1,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:this.Validv_Ccfgcomprobantedetalleletra,isvalid:null,rgrid:[this.Grid1Container],fld:"vCCFGCOMPROBANTEDETALLELETRA",gxz:"ZV11cCfgComprobanteDetalleLetra",gxold:"OV11cCfgComprobanteDetalleLetra",gxvar:"AV11cCfgComprobanteDetalleLetra",ucs:[],op:[66],ip:[66],nacdep:[],ctrltype:"combo",v2v:function(n){gx.O.AV11cCfgComprobanteDetalleLetra=gx.num.intval(n)},v2z:function(n){gx.O.ZV11cCfgComprobanteDetalleLetra=gx.num.intval(n)},v2c:function(){gx.fn.setComboBoxValue("vCCFGCOMPROBANTEDETALLELETRA",gx.O.AV11cCfgComprobanteDetalleLetra)},c2v:function(){gx.O.AV11cCfgComprobanteDetalleLetra=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCCFGCOMPROBANTEDETALLELETRA",".")},nac:gx.falseFn};n[67]={fld:"",grid:0};n[68]={fld:"",grid:0};n[69]={fld:"COMPROBANTEFECHAFILTERCONTAINER",grid:0};n[70]={fld:"",grid:0};n[71]={fld:"",grid:0};n[72]={fld:"LBLCOMPROBANTEFECHAFILTER",format:1,grid:0,evt:"e170t1_client"};n[73]={fld:"",grid:0};n[74]={fld:"",grid:0};n[75]={fld:"",grid:0};n[76]={lvl:0,type:"date",len:8,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCCOMPROBANTEFECHA",gxz:"ZV12cComprobanteFecha",gxold:"OV12cComprobanteFecha",gxvar:"AV12cComprobanteFecha",dp:{f:-1,st:!1,wn:!1,mf:!1,pic:"99/99/99",dec:0},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV12cComprobanteFecha=gx.fn.toDatetimeValue(n)},v2z:function(n){gx.O.ZV12cComprobanteFecha=gx.fn.toDatetimeValue(n)},v2c:function(){gx.fn.setControlValue("vCCOMPROBANTEFECHA",gx.O.AV12cComprobanteFecha,0)},c2v:function(){gx.O.AV12cComprobanteFecha=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getControlValue("vCCOMPROBANTEFECHA")},nac:gx.falseFn};n[77]={fld:"",grid:0};n[78]={fld:"GRIDTABLE",grid:0};n[79]={fld:"",grid:0};n[80]={fld:"",grid:0};n[81]={fld:"BTNTOGGLE",grid:0};n[82]={fld:"",grid:0};n[83]={fld:"",grid:0};n[85]={lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.AV5LinkSelection=n},v2z:function(n){gx.O.ZV5LinkSelection=n},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84),gx.O.AV5LinkSelection,gx.O.AV22Linkselection_GXI)},c2v:function(){gx.O.AV22Linkselection_GXI=this.val_GXI();gx.O.AV5LinkSelection=this.val()},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(84))},gxvar_GXI:"AV22Linkselection_GXI",nac:gx.falseFn};n[86]={lvl:2,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESAID",gxz:"Z42EmpresaId",gxold:"O42EmpresaId",gxvar:"A42EmpresaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A42EmpresaId=gx.num.intval(n)},v2z:function(n){gx.O.Z42EmpresaId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("EMPRESAID",n||gx.fn.currentGridRowImpl(84),gx.O.A42EmpresaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A42EmpresaId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("EMPRESAID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[87]={lvl:2,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADID",gxz:"Z20EntidadId",gxold:"O20EntidadId",gxvar:"A20EntidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A20EntidadId=gx.num.intval(n)},v2z:function(n){gx.O.Z20EntidadId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ENTIDADID",n||gx.fn.currentGridRowImpl(84),gx.O.A20EntidadId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A20EntidadId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ENTIDADID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[88]={lvl:2,type:"svchar",len:10,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CFGCOMPROBANTEID",gxz:"Z31CfgComprobanteId",gxold:"O31CfgComprobanteId",gxvar:"A31CfgComprobanteId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A31CfgComprobanteId=n},v2z:function(n){gx.O.Z31CfgComprobanteId=n},v2c:function(n){gx.fn.setGridControlValue("CFGCOMPROBANTEID",n||gx.fn.currentGridRowImpl(84),gx.O.A31CfgComprobanteId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A31CfgComprobanteId=this.val()},val:function(n){return gx.fn.getGridControlValue("CFGCOMPROBANTEID",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[89]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CFGCOMPROBANTEPREFIJO",gxz:"Z32CfgComprobantePrefijo",gxold:"O32CfgComprobantePrefijo",gxvar:"A32CfgComprobantePrefijo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A32CfgComprobantePrefijo=gx.num.intval(n)},v2z:function(n){gx.O.Z32CfgComprobantePrefijo=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("CFGCOMPROBANTEPREFIJO",n||gx.fn.currentGridRowImpl(84),gx.O.A32CfgComprobantePrefijo,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A32CfgComprobantePrefijo=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("CFGCOMPROBANTEPREFIJO",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[90]={lvl:2,type:"int",len:8,dec:0,sign:!1,pic:"ZZZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"COMPROBANTENUMERO",gxz:"Z55ComprobanteNumero",gxold:"O55ComprobanteNumero",gxvar:"A55ComprobanteNumero",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A55ComprobanteNumero=gx.num.intval(n)},v2z:function(n){gx.O.Z55ComprobanteNumero=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("COMPROBANTENUMERO",n||gx.fn.currentGridRowImpl(84),gx.O.A55ComprobanteNumero,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A55ComprobanteNumero=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("COMPROBANTENUMERO",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[91]={lvl:2,type:"int",len:2,dec:0,sign:!1,pic:"Z9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CFGCOMPROBANTEDETALLELETRA",gxz:"Z35CfgComprobanteDetalleLetra",gxold:"O35CfgComprobanteDetalleLetra",gxvar:"A35CfgComprobanteDetalleLetra",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",inputType:"text",v2v:function(n){gx.O.A35CfgComprobanteDetalleLetra=gx.num.intval(n)},v2z:function(n){gx.O.Z35CfgComprobanteDetalleLetra=gx.num.intval(n)},v2c:function(n){gx.fn.setGridComboBoxValue("CFGCOMPROBANTEDETALLELETRA",n||gx.fn.currentGridRowImpl(84),gx.O.A35CfgComprobanteDetalleLetra);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A35CfgComprobanteDetalleLetra=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("CFGCOMPROBANTEDETALLELETRA",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[92]={lvl:2,type:"date",len:8,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"COMPROBANTEFECHA",gxz:"Z61ComprobanteFecha",gxold:"O61ComprobanteFecha",gxvar:"A61ComprobanteFecha",dp:{f:0,st:!1,wn:!1,mf:!1,pic:"99/99/99",dec:0},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A61ComprobanteFecha=gx.fn.toDatetimeValue(n)},v2z:function(n){gx.O.Z61ComprobanteFecha=gx.fn.toDatetimeValue(n)},v2c:function(n){gx.fn.setGridControlValue("COMPROBANTEFECHA",n||gx.fn.currentGridRowImpl(84),gx.O.A61ComprobanteFecha,0)},c2v:function(){gx.O.A61ComprobanteFecha=gx.fn.toDatetimeValue(this.val())},val:function(n){return gx.fn.getGridDateTimeValue("COMPROBANTEFECHA",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[93]={fld:"",grid:0};n[94]={fld:"",grid:0};n[95]={fld:"BTN_CANCEL",grid:0};this.AV6cEmpresaId=0;this.ZV6cEmpresaId=0;this.OV6cEmpresaId=0;this.AV7cEntidadId=0;this.ZV7cEntidadId=0;this.OV7cEntidadId=0;this.AV8cCfgComprobanteId="";this.ZV8cCfgComprobanteId="";this.OV8cCfgComprobanteId="";this.AV9cCfgComprobantePrefijo=0;this.ZV9cCfgComprobantePrefijo=0;this.OV9cCfgComprobantePrefijo=0;this.AV10cComprobanteNumero=0;this.ZV10cComprobanteNumero=0;this.OV10cComprobanteNumero=0;this.AV11cCfgComprobanteDetalleLetra=0;this.ZV11cCfgComprobanteDetalleLetra=0;this.OV11cCfgComprobanteDetalleLetra=0;this.AV12cComprobanteFecha=gx.date.nullDate();this.ZV12cComprobanteFecha=gx.date.nullDate();this.OV12cComprobanteFecha=gx.date.nullDate();this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z42EmpresaId=0;this.O42EmpresaId=0;this.Z20EntidadId=0;this.O20EntidadId=0;this.Z31CfgComprobanteId="";this.O31CfgComprobanteId="";this.Z32CfgComprobantePrefijo=0;this.O32CfgComprobantePrefijo=0;this.Z55ComprobanteNumero=0;this.O55ComprobanteNumero=0;this.Z35CfgComprobanteDetalleLetra=0;this.O35CfgComprobanteDetalleLetra=0;this.Z61ComprobanteFecha=gx.date.nullDate();this.O61ComprobanteFecha=gx.date.nullDate();this.AV6cEmpresaId=0;this.AV7cEntidadId=0;this.AV8cCfgComprobanteId="";this.AV9cCfgComprobantePrefijo=0;this.AV10cComprobanteNumero=0;this.AV11cCfgComprobanteDetalleLetra=0;this.AV12cComprobanteFecha=gx.date.nullDate();this.AV13pEmpresaId=0;this.AV14pEntidadId=0;this.AV15pCfgComprobanteId="";this.AV16pCfgComprobantePrefijo=0;this.AV17pComprobanteNumero=0;this.AV18pCfgComprobanteDetalleLetra=0;this.AV5LinkSelection="";this.A42EmpresaId=0;this.A20EntidadId=0;this.A31CfgComprobanteId="";this.A32CfgComprobantePrefijo=0;this.A55ComprobanteNumero=0;this.A35CfgComprobanteDetalleLetra=0;this.A61ComprobanteFecha=gx.date.nullDate();this.Events={e210t2_client:["ENTER",!0],e220t1_client:["CANCEL",!0],e180t1_client:["'TOGGLE'",!1],e110t1_client:["LBLEMPRESAIDFILTER.CLICK",!1],e120t1_client:["LBLENTIDADIDFILTER.CLICK",!1],e130t1_client:["LBLCFGCOMPROBANTEIDFILTER.CLICK",!1],e140t1_client:["LBLCFGCOMPROBANTEPREFIJOFILTER.CLICK",!1],e150t1_client:["LBLCOMPROBANTENUMEROFILTER.CLICK",!1],e160t1_client:["LBLCFGCOMPROBANTEDETALLELETRAFILTER.CLICK",!1],e170t1_client:["LBLCOMPROBANTEFECHAFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cCfgComprobanteId",fld:"vCCFGCOMPROBANTEID"},{av:"AV9cCfgComprobantePrefijo",fld:"vCCFGCOMPROBANTEPREFIJO"},{av:"AV10cComprobanteNumero",fld:"vCCOMPROBANTENUMERO"},{ctrl:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV11cCfgComprobanteDetalleLetra",fld:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV12cComprobanteFecha",fld:"vCCOMPROBANTEFECHA"}],[]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLEMPRESAIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("EMPRESAIDFILTERCONTAINER","Class")',ctrl:"EMPRESAIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("EMPRESAIDFILTERCONTAINER","Class")',ctrl:"EMPRESAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCEMPRESAID","Visible")',ctrl:"vCEMPRESAID",prop:"Visible"}]];this.EvtParms["LBLENTIDADIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:"ENTIDADIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:"ENTIDADIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENTIDADID","Visible")',ctrl:"vCENTIDADID",prop:"Visible"}]];this.EvtParms["LBLCFGCOMPROBANTEIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("CFGCOMPROBANTEIDFILTERCONTAINER","Class")',ctrl:"CFGCOMPROBANTEIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("CFGCOMPROBANTEIDFILTERCONTAINER","Class")',ctrl:"CFGCOMPROBANTEIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCFGCOMPROBANTEID","Visible")',ctrl:"vCCFGCOMPROBANTEID",prop:"Visible"}]];this.EvtParms["LBLCFGCOMPROBANTEPREFIJOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("CFGCOMPROBANTEPREFIJOFILTERCONTAINER","Class")',ctrl:"CFGCOMPROBANTEPREFIJOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("CFGCOMPROBANTEPREFIJOFILTERCONTAINER","Class")',ctrl:"CFGCOMPROBANTEPREFIJOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCFGCOMPROBANTEPREFIJO","Visible")',ctrl:"vCCFGCOMPROBANTEPREFIJO",prop:"Visible"}]];this.EvtParms["LBLCOMPROBANTENUMEROFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("COMPROBANTENUMEROFILTERCONTAINER","Class")',ctrl:"COMPROBANTENUMEROFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("COMPROBANTENUMEROFILTERCONTAINER","Class")',ctrl:"COMPROBANTENUMEROFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCOMPROBANTENUMERO","Visible")',ctrl:"vCCOMPROBANTENUMERO",prop:"Visible"}]];this.EvtParms["LBLCFGCOMPROBANTEDETALLELETRAFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER","Class")',ctrl:"CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER","Class")',ctrl:"CFGCOMPROBANTEDETALLELETRAFILTERCONTAINER",prop:"Class"},{ctrl:"vCCFGCOMPROBANTEDETALLELETRA"}]];this.EvtParms["LBLCOMPROBANTEFECHAFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("COMPROBANTEFECHAFILTERCONTAINER","Class")',ctrl:"COMPROBANTEFECHAFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("COMPROBANTEFECHAFILTERCONTAINER","Class")',ctrl:"COMPROBANTEFECHAFILTERCONTAINER",prop:"Class"}]];this.EvtParms.LOAD=[[],[{av:"AV5LinkSelection",fld:"vLINKSELECTION"}]];this.EvtParms.ENTER=[[{av:"A42EmpresaId",fld:"EMPRESAID"},{av:"A20EntidadId",fld:"ENTIDADID"},{av:"A31CfgComprobanteId",fld:"CFGCOMPROBANTEID"},{av:"A32CfgComprobantePrefijo",fld:"CFGCOMPROBANTEPREFIJO"},{av:"A55ComprobanteNumero",fld:"COMPROBANTENUMERO"},{ctrl:"CFGCOMPROBANTEDETALLELETRA"},{av:"A35CfgComprobanteDetalleLetra",fld:"CFGCOMPROBANTEDETALLELETRA"}],[{av:"AV13pEmpresaId",fld:"vPEMPRESAID"},{av:"AV14pEntidadId",fld:"vPENTIDADID"},{av:"AV15pCfgComprobanteId",fld:"vPCFGCOMPROBANTEID"},{av:"AV16pCfgComprobantePrefijo",fld:"vPCFGCOMPROBANTEPREFIJO"},{av:"AV17pComprobanteNumero",fld:"vPCOMPROBANTENUMERO"},{av:"AV18pCfgComprobanteDetalleLetra",fld:"vPCFGCOMPROBANTEDETALLELETRA"}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cCfgComprobanteId",fld:"vCCFGCOMPROBANTEID"},{av:"AV9cCfgComprobantePrefijo",fld:"vCCFGCOMPROBANTEPREFIJO"},{av:"AV10cComprobanteNumero",fld:"vCCOMPROBANTENUMERO"},{ctrl:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV11cCfgComprobanteDetalleLetra",fld:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV12cComprobanteFecha",fld:"vCCOMPROBANTEFECHA"}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cCfgComprobanteId",fld:"vCCFGCOMPROBANTEID"},{av:"AV9cCfgComprobantePrefijo",fld:"vCCFGCOMPROBANTEPREFIJO"},{av:"AV10cComprobanteNumero",fld:"vCCOMPROBANTENUMERO"},{ctrl:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV11cCfgComprobanteDetalleLetra",fld:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV12cComprobanteFecha",fld:"vCCOMPROBANTEFECHA"}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cCfgComprobanteId",fld:"vCCFGCOMPROBANTEID"},{av:"AV9cCfgComprobantePrefijo",fld:"vCCFGCOMPROBANTEPREFIJO"},{av:"AV10cComprobanteNumero",fld:"vCCOMPROBANTENUMERO"},{ctrl:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV11cCfgComprobanteDetalleLetra",fld:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV12cComprobanteFecha",fld:"vCCOMPROBANTEFECHA"}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cEmpresaId",fld:"vCEMPRESAID"},{av:"AV7cEntidadId",fld:"vCENTIDADID"},{av:"AV8cCfgComprobanteId",fld:"vCCFGCOMPROBANTEID"},{av:"AV9cCfgComprobantePrefijo",fld:"vCCFGCOMPROBANTEPREFIJO"},{av:"AV10cComprobanteNumero",fld:"vCCOMPROBANTENUMERO"},{ctrl:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV11cCfgComprobanteDetalleLetra",fld:"vCCFGCOMPROBANTEDETALLELETRA"},{av:"AV12cComprobanteFecha",fld:"vCCOMPROBANTEFECHA"}],[]];this.setVCMap("AV13pEmpresaId","vPEMPRESAID",0,"int");this.setVCMap("AV14pEntidadId","vPENTIDADID",0,"int");this.setVCMap("AV15pCfgComprobanteId","vPCFGCOMPROBANTEID",0,"svchar");this.setVCMap("AV16pCfgComprobantePrefijo","vPCFGCOMPROBANTEPREFIJO",0,"int");this.setVCMap("AV17pComprobanteNumero","vPCOMPROBANTENUMERO",0,"int");this.setVCMap("AV18pCfgComprobanteDetalleLetra","vPCFGCOMPROBANTEDETALLELETRA",0,"int");t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar(this.GXValidFnc[36]);t.addRefreshingVar(this.GXValidFnc[46]);t.addRefreshingVar(this.GXValidFnc[56]);t.addRefreshingVar(this.GXValidFnc[66]);t.addRefreshingVar(this.GXValidFnc[76]);this.Initialize()});gx.createParentObj(gx00k0)