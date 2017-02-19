/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:32:20.37
*/
gx.evt.autoSkip = false;
gx.define('gx0090', false, function () {
   this.ServerClass =  "gx0090" ;
   this.PackageName =  "com.kberp" ;
   this.setObjectType("web");
   this.hasEnterEvent = true;
   this.skipOnEnter = false;
   this.autoRefresh = true;
   this.fullAjax = true;
   this.supportAjaxEvents =  true ;
   this.ajaxSecurityToken =  true ;
   this.SetStandaloneVars=function()
   {
      this.AV8pAlicuotaIvaId=gx.fn.getIntegerValue("vPALICUOTAIVAID",'.') ;
   };
   this.e130f1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class") == "AdvancedContainer" )
      {
         gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class", "AdvancedContainer"+" "+"AdvancedContainerVisible" );
         gx.fn.setCtrlProperty("BTNTOGGLE","Class", gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" "+"BtnToggleActive" );
      }
      else
      {
         gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class", "AdvancedContainer" );
         gx.fn.setCtrlProperty("BTNTOGGLE","Class", "BtnToggle" );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]);
   };
   this.e110f1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCALICUOTAIVAID","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCALICUOTAIVAID","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class")',ctrl:'ALICUOTAIVAIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCALICUOTAIVAID","Visible")',ctrl:'vCALICUOTAIVAID',prop:'Visible'}]);
   };
   this.e120f1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ALICUOTAIVAPORCENTAJEFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("ALICUOTAIVAPORCENTAJEFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCALICUOTAIVAPORCENTAJE","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("ALICUOTAIVAPORCENTAJEFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCALICUOTAIVAPORCENTAJE","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ALICUOTAIVAPORCENTAJEFILTERCONTAINER","Class")',ctrl:'ALICUOTAIVAPORCENTAJEFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCALICUOTAIVAPORCENTAJE","Visible")',ctrl:'vCALICUOTAIVAPORCENTAJE',prop:'Visible'}]);
   };
   this.e160f2_client=function()
   {
      this.executeServerEvent("ENTER", true, arguments[0], false, false);
   };
   this.e170f1_client=function()
   {
      this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,35,36,37,38,39,40];
   this.GXLastCtrlId =40;
   this.Grid1Container = new gx.grid.grid(this, 2,"WbpLvl2",34,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0090",[],false,1,false,true,10,true,false,false,"",0,"px","Nueva fila",true,false,false,null,null,false,"",false,[1,1,1,1],false,0,true,false);
   var Grid1Container = this.Grid1Container;
   Grid1Container.addBitmap("&Linkselection","vLINKSELECTION",35,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");
   Grid1Container.addSingleLineEdit(17,36,"ALICUOTAIVAID","Iva Id","","AlicuotaIvaId","int",0,"px",4,4,"right",null,[],17,"AlicuotaIvaId",true,0,false,false,"Attribute",1,"WWColumn");
   Grid1Container.addSingleLineEdit(19,37,"ALICUOTAIVAPORCENTAJE","Iva Porcentaje","","AlicuotaIvaPorcentaje","decimal",0,"px",4,4,"right",null,[],19,"AlicuotaIvaPorcentaje",true,1,false,false,"Attribute",1,"WWColumn OptionalColumn");
   this.Grid1Container.emptyText = "";
   this.setGrid(Grid1Container);
   GXValidFnc[2]={fld:"",grid:0};
   GXValidFnc[3]={fld:"MAIN",grid:0};
   GXValidFnc[4]={fld:"",grid:0};
   GXValidFnc[5]={fld:"",grid:0};
   GXValidFnc[6]={fld:"ADVANCEDCONTAINER",grid:0};
   GXValidFnc[7]={fld:"",grid:0};
   GXValidFnc[8]={fld:"",grid:0};
   GXValidFnc[9]={fld:"ALICUOTAIVAIDFILTERCONTAINER",grid:0};
   GXValidFnc[10]={fld:"",grid:0};
   GXValidFnc[11]={fld:"",grid:0};
   GXValidFnc[12]={fld:"LBLALICUOTAIVAIDFILTER", format:1,grid:0,evt:"e110f1_client"};
   GXValidFnc[13]={fld:"",grid:0};
   GXValidFnc[14]={fld:"",grid:0};
   GXValidFnc[15]={fld:"",grid:0};
   GXValidFnc[16]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCALICUOTAIVAID",gxz:"ZV6cAlicuotaIvaId",gxold:"OV6cAlicuotaIvaId",gxvar:"AV6cAlicuotaIvaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV6cAlicuotaIvaId=gx.num.intval(Value)},v2z:function(Value){gx.O.ZV6cAlicuotaIvaId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("vCALICUOTAIVAID",gx.O.AV6cAlicuotaIvaId,0)},c2v:function(){gx.O.AV6cAlicuotaIvaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCALICUOTAIVAID",'.')},nac:gx.falseFn};
   GXValidFnc[17]={fld:"",grid:0};
   GXValidFnc[18]={fld:"",grid:0};
   GXValidFnc[19]={fld:"ALICUOTAIVAPORCENTAJEFILTERCONTAINER",grid:0};
   GXValidFnc[20]={fld:"",grid:0};
   GXValidFnc[21]={fld:"",grid:0};
   GXValidFnc[22]={fld:"LBLALICUOTAIVAPORCENTAJEFILTER", format:1,grid:0,evt:"e120f1_client"};
   GXValidFnc[23]={fld:"",grid:0};
   GXValidFnc[24]={fld:"",grid:0};
   GXValidFnc[25]={fld:"",grid:0};
   GXValidFnc[26]={lvl:0,type:"decimal",len:4,dec:1,sign:false,pic:"Z9.9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCALICUOTAIVAPORCENTAJE",gxz:"ZV7cAlicuotaIvaPorcentaje",gxold:"OV7cAlicuotaIvaPorcentaje",gxvar:"AV7cAlicuotaIvaPorcentaje",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV7cAlicuotaIvaPorcentaje=gx.fn.toDecimalValue(Value,',','.')},v2z:function(Value){gx.O.ZV7cAlicuotaIvaPorcentaje=gx.fn.toDecimalValue(Value,'.',',')},v2c:function(){gx.fn.setDecimalValue("vCALICUOTAIVAPORCENTAJE",gx.O.AV7cAlicuotaIvaPorcentaje,1,',')},c2v:function(){gx.O.AV7cAlicuotaIvaPorcentaje=this.val()},val:function(){return gx.fn.getDecimalValue("vCALICUOTAIVAPORCENTAJE",'.',',')},nac:gx.falseFn};
   GXValidFnc[27]={fld:"",grid:0};
   GXValidFnc[28]={fld:"GRIDTABLE",grid:0};
   GXValidFnc[29]={fld:"",grid:0};
   GXValidFnc[30]={fld:"",grid:0};
   GXValidFnc[31]={fld:"BTNTOGGLE",grid:0};
   GXValidFnc[32]={fld:"",grid:0};
   GXValidFnc[33]={fld:"",grid:0};
   GXValidFnc[35]={lvl:2,type:"bits",len:1024,dec:0,sign:false,ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.AV5LinkSelection=Value},v2z:function(Value){gx.O.ZV5LinkSelection=Value},v2c:function(row){gx.fn.setGridMultimediaValue("vLINKSELECTION",row || gx.fn.currentGridRowImpl(34),gx.O.AV5LinkSelection,gx.O.AV12Linkselection_GXI)},c2v:function(){gx.O.AV12Linkselection_GXI=this.val_GXI();gx.O.AV5LinkSelection=this.val()},val:function(row){return gx.fn.getGridControlValue("vLINKSELECTION",row || gx.fn.currentGridRowImpl(34))},val_GXI:function(row){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",row || gx.fn.currentGridRowImpl(34))}, gxvar_GXI:'AV12Linkselection_GXI',nac:gx.falseFn};
   GXValidFnc[36]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ALICUOTAIVAID",gxz:"Z17AlicuotaIvaId",gxold:"O17AlicuotaIvaId",gxvar:"A17AlicuotaIvaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A17AlicuotaIvaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z17AlicuotaIvaId=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("ALICUOTAIVAID",row || gx.fn.currentGridRowImpl(34),gx.O.A17AlicuotaIvaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A17AlicuotaIvaId=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("ALICUOTAIVAID",row || gx.fn.currentGridRowImpl(34),'.')},nac:gx.falseFn};
   GXValidFnc[37]={lvl:2,type:"decimal",len:4,dec:1,sign:false,pic:"Z9.9",ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ALICUOTAIVAPORCENTAJE",gxz:"Z19AlicuotaIvaPorcentaje",gxold:"O19AlicuotaIvaPorcentaje",gxvar:"A19AlicuotaIvaPorcentaje",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A19AlicuotaIvaPorcentaje=gx.fn.toDecimalValue(Value,',','.')},v2z:function(Value){gx.O.Z19AlicuotaIvaPorcentaje=gx.fn.toDecimalValue(Value,'.',',')},v2c:function(row){gx.fn.setGridDecimalValue("ALICUOTAIVAPORCENTAJE",row || gx.fn.currentGridRowImpl(34),gx.O.A19AlicuotaIvaPorcentaje,1,',');if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A19AlicuotaIvaPorcentaje=this.val()},val:function(row){return gx.fn.getGridDecimalValue("ALICUOTAIVAPORCENTAJE",row || gx.fn.currentGridRowImpl(34),'.',',')},nac:gx.falseFn};
   GXValidFnc[38]={fld:"",grid:0};
   GXValidFnc[39]={fld:"",grid:0};
   GXValidFnc[40]={fld:"BTN_CANCEL",grid:0};
   this.AV6cAlicuotaIvaId = 0 ;
   this.ZV6cAlicuotaIvaId = 0 ;
   this.OV6cAlicuotaIvaId = 0 ;
   this.AV7cAlicuotaIvaPorcentaje = 0 ;
   this.ZV7cAlicuotaIvaPorcentaje = 0 ;
   this.OV7cAlicuotaIvaPorcentaje = 0 ;
   this.ZV5LinkSelection = "" ;
   this.OV5LinkSelection = "" ;
   this.Z17AlicuotaIvaId = 0 ;
   this.O17AlicuotaIvaId = 0 ;
   this.Z19AlicuotaIvaPorcentaje = 0 ;
   this.O19AlicuotaIvaPorcentaje = 0 ;
   this.AV6cAlicuotaIvaId = 0 ;
   this.AV7cAlicuotaIvaPorcentaje = 0 ;
   this.AV8pAlicuotaIvaId = 0 ;
   this.AV5LinkSelection = "" ;
   this.A17AlicuotaIvaId = 0 ;
   this.A19AlicuotaIvaPorcentaje = 0 ;
   this.Events = {"e160f2_client": ["ENTER", true] ,"e170f1_client": ["CANCEL", true] ,"e130f1_client": ["'TOGGLE'", false] ,"e110f1_client": ["LBLALICUOTAIVAIDFILTER.CLICK", false] ,"e120f1_client": ["LBLALICUOTAIVAPORCENTAJEFILTER.CLICK", false]};
   this.EvtParms["REFRESH"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV7cAlicuotaIvaPorcentaje',fld:'vCALICUOTAIVAPORCENTAJE'}],[]];
   this.EvtParms["'TOGGLE'"] = [[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]];
   this.EvtParms["LBLALICUOTAIVAIDFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class")',ctrl:'ALICUOTAIVAIDFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ALICUOTAIVAIDFILTERCONTAINER","Class")',ctrl:'ALICUOTAIVAIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCALICUOTAIVAID","Visible")',ctrl:'vCALICUOTAIVAID',prop:'Visible'}]];
   this.EvtParms["LBLALICUOTAIVAPORCENTAJEFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("ALICUOTAIVAPORCENTAJEFILTERCONTAINER","Class")',ctrl:'ALICUOTAIVAPORCENTAJEFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ALICUOTAIVAPORCENTAJEFILTERCONTAINER","Class")',ctrl:'ALICUOTAIVAPORCENTAJEFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCALICUOTAIVAPORCENTAJE","Visible")',ctrl:'vCALICUOTAIVAPORCENTAJE',prop:'Visible'}]];
   this.EvtParms["LOAD"] = [[],[{av:'AV5LinkSelection',fld:'vLINKSELECTION'}]];
   this.EvtParms["ENTER"] = [[{av:'A17AlicuotaIvaId',fld:'ALICUOTAIVAID'}],[{av:'AV8pAlicuotaIvaId',fld:'vPALICUOTAIVAID'}]];
   this.EvtParms["GRID1_FIRSTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV7cAlicuotaIvaPorcentaje',fld:'vCALICUOTAIVAPORCENTAJE'}],[]];
   this.EvtParms["GRID1_PREVPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV7cAlicuotaIvaPorcentaje',fld:'vCALICUOTAIVAPORCENTAJE'}],[]];
   this.EvtParms["GRID1_NEXTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV7cAlicuotaIvaPorcentaje',fld:'vCALICUOTAIVAPORCENTAJE'}],[]];
   this.EvtParms["GRID1_LASTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cAlicuotaIvaId',fld:'vCALICUOTAIVAID'},{av:'AV7cAlicuotaIvaPorcentaje',fld:'vCALICUOTAIVAPORCENTAJE'}],[]];
   this.setVCMap("AV8pAlicuotaIvaId", "vPALICUOTAIVAID", 0, "int");
   Grid1Container.addRefreshingVar(this.GXValidFnc[16]);
   Grid1Container.addRefreshingVar(this.GXValidFnc[26]);
   this.Initialize( );
});
gx.createParentObj(gx0090);
