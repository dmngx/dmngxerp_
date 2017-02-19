/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:32:19.18
*/
gx.evt.autoSkip = false;
gx.define('gx0080', false, function () {
   this.ServerClass =  "gx0080" ;
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
      this.AV7pCondicionCpraVtaId=gx.fn.getIntegerValue("vPCONDICIONCPRAVTAID",'.') ;
   };
   this.e120e1_client=function()
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
   this.e110e1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("CONDICIONCPRAVTAIDFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("CONDICIONCPRAVTAIDFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCCONDICIONCPRAVTAID","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("CONDICIONCPRAVTAIDFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCCONDICIONCPRAVTAID","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("CONDICIONCPRAVTAIDFILTERCONTAINER","Class")',ctrl:'CONDICIONCPRAVTAIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCCONDICIONCPRAVTAID","Visible")',ctrl:'vCCONDICIONCPRAVTAID',prop:'Visible'}]);
   };
   this.e150e2_client=function()
   {
      this.executeServerEvent("ENTER", true, arguments[0], false, false);
   };
   this.e160e1_client=function()
   {
      this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,25,26,27,28,29];
   this.GXLastCtrlId =29;
   this.Grid1Container = new gx.grid.grid(this, 2,"WbpLvl2",24,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0080",[],false,1,false,true,10,true,false,false,"",0,"px","Nueva fila",true,false,false,null,null,false,"",false,[1,1,1,1],false,0,true,false);
   var Grid1Container = this.Grid1Container;
   Grid1Container.addBitmap("&Linkselection","vLINKSELECTION",25,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");
   Grid1Container.addSingleLineEdit(15,26,"CONDICIONCPRAVTAID","Vta Id","","CondicionCpraVtaId","int",0,"px",4,4,"right",null,[],15,"CondicionCpraVtaId",true,0,false,false,"Attribute",1,"WWColumn");
   this.Grid1Container.emptyText = "";
   this.setGrid(Grid1Container);
   GXValidFnc[2]={fld:"",grid:0};
   GXValidFnc[3]={fld:"MAIN",grid:0};
   GXValidFnc[4]={fld:"",grid:0};
   GXValidFnc[5]={fld:"",grid:0};
   GXValidFnc[6]={fld:"ADVANCEDCONTAINER",grid:0};
   GXValidFnc[7]={fld:"",grid:0};
   GXValidFnc[8]={fld:"",grid:0};
   GXValidFnc[9]={fld:"CONDICIONCPRAVTAIDFILTERCONTAINER",grid:0};
   GXValidFnc[10]={fld:"",grid:0};
   GXValidFnc[11]={fld:"",grid:0};
   GXValidFnc[12]={fld:"LBLCONDICIONCPRAVTAIDFILTER", format:1,grid:0,evt:"e110e1_client"};
   GXValidFnc[13]={fld:"",grid:0};
   GXValidFnc[14]={fld:"",grid:0};
   GXValidFnc[15]={fld:"",grid:0};
   GXValidFnc[16]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCCONDICIONCPRAVTAID",gxz:"ZV6cCondicionCpraVtaId",gxold:"OV6cCondicionCpraVtaId",gxvar:"AV6cCondicionCpraVtaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV6cCondicionCpraVtaId=gx.num.intval(Value)},v2z:function(Value){gx.O.ZV6cCondicionCpraVtaId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("vCCONDICIONCPRAVTAID",gx.O.AV6cCondicionCpraVtaId,0)},c2v:function(){gx.O.AV6cCondicionCpraVtaId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCCONDICIONCPRAVTAID",'.')},nac:gx.falseFn};
   GXValidFnc[17]={fld:"",grid:0};
   GXValidFnc[18]={fld:"GRIDTABLE",grid:0};
   GXValidFnc[19]={fld:"",grid:0};
   GXValidFnc[20]={fld:"",grid:0};
   GXValidFnc[21]={fld:"BTNTOGGLE",grid:0};
   GXValidFnc[22]={fld:"",grid:0};
   GXValidFnc[23]={fld:"",grid:0};
   GXValidFnc[25]={lvl:2,type:"bits",len:1024,dec:0,sign:false,ro:1,isacc:0,grid:24,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.AV5LinkSelection=Value},v2z:function(Value){gx.O.ZV5LinkSelection=Value},v2c:function(row){gx.fn.setGridMultimediaValue("vLINKSELECTION",row || gx.fn.currentGridRowImpl(24),gx.O.AV5LinkSelection,gx.O.AV11Linkselection_GXI)},c2v:function(){gx.O.AV11Linkselection_GXI=this.val_GXI();gx.O.AV5LinkSelection=this.val()},val:function(row){return gx.fn.getGridControlValue("vLINKSELECTION",row || gx.fn.currentGridRowImpl(24))},val_GXI:function(row){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",row || gx.fn.currentGridRowImpl(24))}, gxvar_GXI:'AV11Linkselection_GXI',nac:gx.falseFn};
   GXValidFnc[26]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,isacc:0,grid:24,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CONDICIONCPRAVTAID",gxz:"Z15CondicionCpraVtaId",gxold:"O15CondicionCpraVtaId",gxvar:"A15CondicionCpraVtaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A15CondicionCpraVtaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z15CondicionCpraVtaId=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("CONDICIONCPRAVTAID",row || gx.fn.currentGridRowImpl(24),gx.O.A15CondicionCpraVtaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A15CondicionCpraVtaId=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("CONDICIONCPRAVTAID",row || gx.fn.currentGridRowImpl(24),'.')},nac:gx.falseFn};
   GXValidFnc[27]={fld:"",grid:0};
   GXValidFnc[28]={fld:"",grid:0};
   GXValidFnc[29]={fld:"BTN_CANCEL",grid:0};
   this.AV6cCondicionCpraVtaId = 0 ;
   this.ZV6cCondicionCpraVtaId = 0 ;
   this.OV6cCondicionCpraVtaId = 0 ;
   this.ZV5LinkSelection = "" ;
   this.OV5LinkSelection = "" ;
   this.Z15CondicionCpraVtaId = 0 ;
   this.O15CondicionCpraVtaId = 0 ;
   this.AV6cCondicionCpraVtaId = 0 ;
   this.AV7pCondicionCpraVtaId = 0 ;
   this.AV5LinkSelection = "" ;
   this.A15CondicionCpraVtaId = 0 ;
   this.Events = {"e150e2_client": ["ENTER", true] ,"e160e1_client": ["CANCEL", true] ,"e120e1_client": ["'TOGGLE'", false] ,"e110e1_client": ["LBLCONDICIONCPRAVTAIDFILTER.CLICK", false]};
   this.EvtParms["REFRESH"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'}],[]];
   this.EvtParms["'TOGGLE'"] = [[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]];
   this.EvtParms["LBLCONDICIONCPRAVTAIDFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("CONDICIONCPRAVTAIDFILTERCONTAINER","Class")',ctrl:'CONDICIONCPRAVTAIDFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("CONDICIONCPRAVTAIDFILTERCONTAINER","Class")',ctrl:'CONDICIONCPRAVTAIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCCONDICIONCPRAVTAID","Visible")',ctrl:'vCCONDICIONCPRAVTAID',prop:'Visible'}]];
   this.EvtParms["LOAD"] = [[],[{av:'AV5LinkSelection',fld:'vLINKSELECTION'}]];
   this.EvtParms["ENTER"] = [[{av:'A15CondicionCpraVtaId',fld:'CONDICIONCPRAVTAID'}],[{av:'AV7pCondicionCpraVtaId',fld:'vPCONDICIONCPRAVTAID'}]];
   this.EvtParms["GRID1_FIRSTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'}],[]];
   this.EvtParms["GRID1_PREVPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'}],[]];
   this.EvtParms["GRID1_NEXTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'}],[]];
   this.EvtParms["GRID1_LASTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cCondicionCpraVtaId',fld:'vCCONDICIONCPRAVTAID'}],[]];
   this.setVCMap("AV7pCondicionCpraVtaId", "vPCONDICIONCPRAVTAID", 0, "int");
   Grid1Container.addRefreshingVar(this.GXValidFnc[16]);
   this.Initialize( );
});
gx.createParentObj(gx0080);
