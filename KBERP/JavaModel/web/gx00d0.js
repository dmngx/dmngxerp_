/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:32:22.97
*/
gx.evt.autoSkip=!1;gx.define("gx00d0",!1,function(){var n,t;this.ServerClass="gx00d0";this.PackageName="com.kberp";this.setObjectType("web");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV11pArticuloId=gx.fn.getControlValue("vPARTICULOID")};this.e160j1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")=="AdvancedContainer"?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle"));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}])};this.e110j1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ARTICULOIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ARTICULOIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCARTICULOID","Visible",!0)):(gx.fn.setCtrlProperty("ARTICULOIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCARTICULOID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ARTICULOIDFILTERCONTAINER","Class")',ctrl:"ARTICULOIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCARTICULOID","Visible")',ctrl:"vCARTICULOID",prop:"Visible"}])};this.e120j1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("MARCAIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("MARCAIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCMARCAID","Visible",!0)):(gx.fn.setCtrlProperty("MARCAIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCMARCAID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("MARCAIDFILTERCONTAINER","Class")',ctrl:"MARCAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCMARCAID","Visible")',ctrl:"vCMARCAID",prop:"Visible"}])};this.e130j1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("RUBROIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("RUBROIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCRUBROID","Visible",!0)):(gx.fn.setCtrlProperty("RUBROIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCRUBROID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("RUBROIDFILTERCONTAINER","Class")',ctrl:"RUBROIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRUBROID","Visible")',ctrl:"vCRUBROID",prop:"Visible"}])};this.e140j1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCALICUOTAIVAID","Visible",!0)):(gx.fn.setCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCALICUOTAIVAID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class")',ctrl:"ALICUOTAIVAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCALICUOTAIVAID","Visible")',ctrl:"vCALICUOTAIVAID",prop:"Visible"}])};this.e150j1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ARTICULOCOSTOFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("ARTICULOCOSTOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCARTICULOCOSTO","Visible",!0)):(gx.fn.setCtrlProperty("ARTICULOCOSTOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCARTICULOCOSTO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ARTICULOCOSTOFILTERCONTAINER","Class")',ctrl:"ARTICULOCOSTOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCARTICULOCOSTO","Visible")',ctrl:"vCARTICULOCOSTO",prop:"Visible"}])};this.e190j2_client=function(){this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e200j1_client=function(){this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,65,66,67,68,69,70,71,72,73];this.GXLastCtrlId=73;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",64,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx00d0",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px","Nueva fila",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",65,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(39,66,"ARTICULOID","Id","","ArticuloId","svchar",0,"px",15,15,"left",null,[],39,"ArticuloId",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addSingleLineEdit(7,67,"MARCAID","Marca Id","","MarcaId","int",0,"px",4,4,"right",null,[],7,"MarcaId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(11,68,"RUBROID","Rubro Id","","RubroId","int",0,"px",4,4,"right",null,[],11,"RubroId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(17,69,"ALICUOTAIVAID","Alicuota Iva Id","","AlicuotaIvaId","int",0,"px",4,4,"right",null,[],17,"AlicuotaIvaId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(41,70,"ARTICULOCOSTO","Costo","","ArticuloCosto","decimal",0,"px",12,12,"right",null,[],41,"ArticuloCosto",!0,2,!1,!1,"Attribute",1,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={fld:"",grid:0};n[3]={fld:"MAIN",grid:0};n[4]={fld:"",grid:0};n[5]={fld:"",grid:0};n[6]={fld:"ADVANCEDCONTAINER",grid:0};n[7]={fld:"",grid:0};n[8]={fld:"",grid:0};n[9]={fld:"ARTICULOIDFILTERCONTAINER",grid:0};n[10]={fld:"",grid:0};n[11]={fld:"",grid:0};n[12]={fld:"LBLARTICULOIDFILTER",format:1,grid:0,evt:"e110j1_client"};n[13]={fld:"",grid:0};n[14]={fld:"",grid:0};n[15]={fld:"",grid:0};n[16]={lvl:0,type:"svchar",len:15,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCARTICULOID",gxz:"ZV6cArticuloId",gxold:"OV6cArticuloId",gxvar:"AV6cArticuloId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV6cArticuloId=n},v2z:function(n){gx.O.ZV6cArticuloId=n},v2c:function(){gx.fn.setControlValue("vCARTICULOID",gx.O.AV6cArticuloId,0)},c2v:function(){gx.O.AV6cArticuloId=this.val()},val:function(){return gx.fn.getControlValue("vCARTICULOID")},nac:gx.falseFn};n[17]={fld:"",grid:0};n[18]={fld:"",grid:0};n[19]={fld:"MARCAIDFILTERCONTAINER",grid:0};n[20]={fld:"",grid:0};n[21]={fld:"",grid:0};n[22]={fld:"LBLMARCAIDFILTER",format:1,grid:0,evt:"e120j1_client"};n[23]={fld:"",grid:0};n[24]={fld:"",grid:0};n[25]={fld:"",grid:0};n[26]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCMARCAID",gxz:"ZV7cMarcaId",gxold:"OV7cMarcaId",gxvar:"AV7cMarcaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV7cMarcaId=gx.num.intval(n)},v2z:function(n){gx.O.ZV7cMarcaId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCMARCAID",gx.O.AV7cMarcaId,0)},c2v:function(){gx.O.AV7cMarcaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCMARCAID",".")},nac:gx.falseFn};n[27]={fld:"",grid:0};n[28]={fld:"",grid:0};n[29]={fld:"RUBROIDFILTERCONTAINER",grid:0};n[30]={fld:"",grid:0};n[31]={fld:"",grid:0};n[32]={fld:"LBLRUBROIDFILTER",format:1,grid:0,evt:"e130j1_client"};n[33]={fld:"",grid:0};n[34]={fld:"",grid:0};n[35]={fld:"",grid:0};n[36]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCRUBROID",gxz:"ZV8cRubroId",gxold:"OV8cRubroId",gxvar:"AV8cRubroId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV8cRubroId=gx.num.intval(n)},v2z:function(n){gx.O.ZV8cRubroId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCRUBROID",gx.O.AV8cRubroId,0)},c2v:function(){gx.O.AV8cRubroId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCRUBROID",".")},nac:gx.falseFn};n[37]={fld:"",grid:0};n[38]={fld:"",grid:0};n[39]={fld:"ALICUOTAIVAIDFILTERCONTAINER",grid:0};n[40]={fld:"",grid:0};n[41]={fld:"",grid:0};n[42]={fld:"LBLALICUOTAIVAIDFILTER",format:1,grid:0,evt:"e140j1_client"};n[43]={fld:"",grid:0};n[44]={fld:"",grid:0};n[45]={fld:"",grid:0};n[46]={lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCALICUOTAIVAID",gxz:"ZV9cAlicuotaIvaId",gxold:"OV9cAlicuotaIvaId",gxvar:"AV9cAlicuotaIvaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV9cAlicuotaIvaId=gx.num.intval(n)},v2z:function(n){gx.O.ZV9cAlicuotaIvaId=gx.num.intval(n)},v2c:function(){gx.fn.setControlValue("vCALICUOTAIVAID",gx.O.AV9cAlicuotaIvaId,0)},c2v:function(){gx.O.AV9cAlicuotaIvaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCALICUOTAIVAID",".")},nac:gx.falseFn};n[47]={fld:"",grid:0};n[48]={fld:"",grid:0};n[49]={fld:"ARTICULOCOSTOFILTERCONTAINER",grid:0};n[50]={fld:"",grid:0};n[51]={fld:"",grid:0};n[52]={fld:"LBLARTICULOCOSTOFILTER",format:1,grid:0,evt:"e150j1_client"};n[53]={fld:"",grid:0};n[54]={fld:"",grid:0};n[55]={fld:"",grid:0};n[56]={lvl:0,type:"decimal",len:12,dec:2,sign:!1,pic:"ZZZZZZZZ9.99",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCARTICULOCOSTO",gxz:"ZV10cArticuloCosto",gxold:"OV10cArticuloCosto",gxvar:"AV10cArticuloCosto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){gx.O.AV10cArticuloCosto=gx.fn.toDecimalValue(n,",",".")},v2z:function(n){gx.O.ZV10cArticuloCosto=gx.fn.toDecimalValue(n,".",",")},v2c:function(){gx.fn.setDecimalValue("vCARTICULOCOSTO",gx.O.AV10cArticuloCosto,2,",")},c2v:function(){gx.O.AV10cArticuloCosto=this.val()},val:function(){return gx.fn.getDecimalValue("vCARTICULOCOSTO",".",",")},nac:gx.falseFn};n[57]={fld:"",grid:0};n[58]={fld:"GRIDTABLE",grid:0};n[59]={fld:"",grid:0};n[60]={fld:"",grid:0};n[61]={fld:"BTNTOGGLE",grid:0};n[62]={fld:"",grid:0};n[63]={fld:"",grid:0};n[65]={lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.AV5LinkSelection=n},v2z:function(n){gx.O.ZV5LinkSelection=n},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(64),gx.O.AV5LinkSelection,gx.O.AV15Linkselection_GXI)},c2v:function(){gx.O.AV15Linkselection_GXI=this.val_GXI();gx.O.AV5LinkSelection=this.val()},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(64))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(64))},gxvar_GXI:"AV15Linkselection_GXI",nac:gx.falseFn};n[66]={lvl:2,type:"svchar",len:15,dec:0,sign:!1,ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ARTICULOID",gxz:"Z39ArticuloId",gxold:"O39ArticuloId",gxvar:"A39ArticuloId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){gx.O.A39ArticuloId=n},v2z:function(n){gx.O.Z39ArticuloId=n},v2c:function(n){gx.fn.setGridControlValue("ARTICULOID",n||gx.fn.currentGridRowImpl(64),gx.O.A39ArticuloId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A39ArticuloId=this.val()},val:function(n){return gx.fn.getGridControlValue("ARTICULOID",n||gx.fn.currentGridRowImpl(64))},nac:gx.falseFn};n[67]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"MARCAID",gxz:"Z7MarcaId",gxold:"O7MarcaId",gxvar:"A7MarcaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A7MarcaId=gx.num.intval(n)},v2z:function(n){gx.O.Z7MarcaId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("MARCAID",n||gx.fn.currentGridRowImpl(64),gx.O.A7MarcaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A7MarcaId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("MARCAID",n||gx.fn.currentGridRowImpl(64),".")},nac:gx.falseFn};n[68]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"RUBROID",gxz:"Z11RubroId",gxold:"O11RubroId",gxvar:"A11RubroId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A11RubroId=gx.num.intval(n)},v2z:function(n){gx.O.Z11RubroId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("RUBROID",n||gx.fn.currentGridRowImpl(64),gx.O.A11RubroId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A11RubroId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("RUBROID",n||gx.fn.currentGridRowImpl(64),".")},nac:gx.falseFn};n[69]={lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ALICUOTAIVAID",gxz:"Z17AlicuotaIvaId",gxold:"O17AlicuotaIvaId",gxvar:"A17AlicuotaIvaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A17AlicuotaIvaId=gx.num.intval(n)},v2z:function(n){gx.O.Z17AlicuotaIvaId=gx.num.intval(n)},v2c:function(n){gx.fn.setGridControlValue("ALICUOTAIVAID",n||gx.fn.currentGridRowImpl(64),gx.O.A17AlicuotaIvaId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A17AlicuotaIvaId=gx.num.intval(this.val())},val:function(n){return gx.fn.getGridIntegerValue("ALICUOTAIVAID",n||gx.fn.currentGridRowImpl(64),".")},nac:gx.falseFn};n[70]={lvl:2,type:"decimal",len:12,dec:2,sign:!1,pic:"ZZZZZZZZ9.99",ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ARTICULOCOSTO",gxz:"Z41ArticuloCosto",gxold:"O41ArticuloCosto",gxvar:"A41ArticuloCosto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){gx.O.A41ArticuloCosto=gx.fn.toDecimalValue(n,",",".")},v2z:function(n){gx.O.Z41ArticuloCosto=gx.fn.toDecimalValue(n,".",",")},v2c:function(n){gx.fn.setGridDecimalValue("ARTICULOCOSTO",n||gx.fn.currentGridRowImpl(64),gx.O.A41ArticuloCosto,2,",");typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A41ArticuloCosto=this.val()},val:function(n){return gx.fn.getGridDecimalValue("ARTICULOCOSTO",n||gx.fn.currentGridRowImpl(64),".",",")},nac:gx.falseFn};n[71]={fld:"",grid:0};n[72]={fld:"",grid:0};n[73]={fld:"BTN_CANCEL",grid:0};this.AV6cArticuloId="";this.ZV6cArticuloId="";this.OV6cArticuloId="";this.AV7cMarcaId=0;this.ZV7cMarcaId=0;this.OV7cMarcaId=0;this.AV8cRubroId=0;this.ZV8cRubroId=0;this.OV8cRubroId=0;this.AV9cAlicuotaIvaId=0;this.ZV9cAlicuotaIvaId=0;this.OV9cAlicuotaIvaId=0;this.AV10cArticuloCosto=0;this.ZV10cArticuloCosto=0;this.OV10cArticuloCosto=0;this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z39ArticuloId="";this.O39ArticuloId="";this.Z7MarcaId=0;this.O7MarcaId=0;this.Z11RubroId=0;this.O11RubroId=0;this.Z17AlicuotaIvaId=0;this.O17AlicuotaIvaId=0;this.Z41ArticuloCosto=0;this.O41ArticuloCosto=0;this.AV6cArticuloId="";this.AV7cMarcaId=0;this.AV8cRubroId=0;this.AV9cAlicuotaIvaId=0;this.AV10cArticuloCosto=0;this.AV11pArticuloId="";this.AV5LinkSelection="";this.A39ArticuloId="";this.A7MarcaId=0;this.A11RubroId=0;this.A17AlicuotaIvaId=0;this.A41ArticuloCosto=0;this.Events={e190j2_client:["ENTER",!0],e200j1_client:["CANCEL",!0],e160j1_client:["'TOGGLE'",!1],e110j1_client:["LBLARTICULOIDFILTER.CLICK",!1],e120j1_client:["LBLMARCAIDFILTER.CLICK",!1],e130j1_client:["LBLRUBROIDFILTER.CLICK",!1],e140j1_client:["LBLALICUOTAIVAIDFILTER.CLICK",!1],e150j1_client:["LBLARTICULOCOSTOFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cArticuloId",fld:"vCARTICULOID"},{av:"AV7cMarcaId",fld:"vCMARCAID"},{av:"AV8cRubroId",fld:"vCRUBROID"},{av:"AV9cAlicuotaIvaId",fld:"vCALICUOTAIVAID"},{av:"AV10cArticuloCosto",fld:"vCARTICULOCOSTO"}],[]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLARTICULOIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ARTICULOIDFILTERCONTAINER","Class")',ctrl:"ARTICULOIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ARTICULOIDFILTERCONTAINER","Class")',ctrl:"ARTICULOIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCARTICULOID","Visible")',ctrl:"vCARTICULOID",prop:"Visible"}]];this.EvtParms["LBLMARCAIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("MARCAIDFILTERCONTAINER","Class")',ctrl:"MARCAIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("MARCAIDFILTERCONTAINER","Class")',ctrl:"MARCAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCMARCAID","Visible")',ctrl:"vCMARCAID",prop:"Visible"}]];this.EvtParms["LBLRUBROIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("RUBROIDFILTERCONTAINER","Class")',ctrl:"RUBROIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("RUBROIDFILTERCONTAINER","Class")',ctrl:"RUBROIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRUBROID","Visible")',ctrl:"vCRUBROID",prop:"Visible"}]];this.EvtParms["LBLALICUOTAIVAIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class")',ctrl:"ALICUOTAIVAIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class")',ctrl:"ALICUOTAIVAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCALICUOTAIVAID","Visible")',ctrl:"vCALICUOTAIVAID",prop:"Visible"}]];this.EvtParms["LBLARTICULOCOSTOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ARTICULOCOSTOFILTERCONTAINER","Class")',ctrl:"ARTICULOCOSTOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ARTICULOCOSTOFILTERCONTAINER","Class")',ctrl:"ARTICULOCOSTOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCARTICULOCOSTO","Visible")',ctrl:"vCARTICULOCOSTO",prop:"Visible"}]];this.EvtParms.LOAD=[[],[{av:"AV5LinkSelection",fld:"vLINKSELECTION"}]];this.EvtParms.ENTER=[[{av:"A39ArticuloId",fld:"ARTICULOID"}],[{av:"AV11pArticuloId",fld:"vPARTICULOID"}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cArticuloId",fld:"vCARTICULOID"},{av:"AV7cMarcaId",fld:"vCMARCAID"},{av:"AV8cRubroId",fld:"vCRUBROID"},{av:"AV9cAlicuotaIvaId",fld:"vCALICUOTAIVAID"},{av:"AV10cArticuloCosto",fld:"vCARTICULOCOSTO"}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cArticuloId",fld:"vCARTICULOID"},{av:"AV7cMarcaId",fld:"vCMARCAID"},{av:"AV8cRubroId",fld:"vCRUBROID"},{av:"AV9cAlicuotaIvaId",fld:"vCALICUOTAIVAID"},{av:"AV10cArticuloCosto",fld:"vCARTICULOCOSTO"}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cArticuloId",fld:"vCARTICULOID"},{av:"AV7cMarcaId",fld:"vCMARCAID"},{av:"AV8cRubroId",fld:"vCRUBROID"},{av:"AV9cAlicuotaIvaId",fld:"vCALICUOTAIVAID"},{av:"AV10cArticuloCosto",fld:"vCARTICULOCOSTO"}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{av:"subGrid1_Rows"},{av:"AV6cArticuloId",fld:"vCARTICULOID"},{av:"AV7cMarcaId",fld:"vCMARCAID"},{av:"AV8cRubroId",fld:"vCRUBROID"},{av:"AV9cAlicuotaIvaId",fld:"vCALICUOTAIVAID"},{av:"AV10cArticuloCosto",fld:"vCARTICULOCOSTO"}],[]];this.setVCMap("AV11pArticuloId","vPARTICULOID",0,"svchar");t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar(this.GXValidFnc[36]);t.addRefreshingVar(this.GXValidFnc[46]);t.addRefreshingVar(this.GXValidFnc[56]);this.Initialize()});gx.createParentObj(gx00d0)