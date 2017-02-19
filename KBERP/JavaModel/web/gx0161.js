/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:2:0.1
*/
gx.evt.autoSkip = false;
gx.define('gx0161', false, function () {
   this.ServerClass =  "gx0161" ;
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
      this.AV8pEntidadId=gx.fn.getIntegerValue("vPENTIDADID",'.') ;
      this.AV9pEntidadTelefonoId=gx.fn.getIntegerValue("vPENTIDADTELEFONOID",'.') ;
   };
   this.e13131_client=function()
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
   this.e11131_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ENTIDADTELEFONOIDFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("ENTIDADTELEFONOIDFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCENTIDADTELEFONOID","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("ENTIDADTELEFONOIDFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCENTIDADTELEFONOID","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADTELEFONOIDFILTERCONTAINER","Class")',ctrl:'ENTIDADTELEFONOIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADTELEFONOID","Visible")',ctrl:'vCENTIDADTELEFONOID',prop:'Visible'}]);
   };
   this.e12131_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ENTIDADTELEFONOFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("ENTIDADTELEFONOFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCENTIDADTELEFONO","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("ENTIDADTELEFONOFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCENTIDADTELEFONO","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADTELEFONOFILTERCONTAINER","Class")',ctrl:'ENTIDADTELEFONOFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADTELEFONO","Visible")',ctrl:'vCENTIDADTELEFONO',prop:'Visible'}]);
   };
   this.e16132_client=function()
   {
      this.executeServerEvent("ENTER", true, arguments[0], false, false);
   };
   this.e17131_client=function()
   {
      this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,35,36,37,38,39,40,41];
   this.GXLastCtrlId =41;
   this.Grid1Container = new gx.grid.grid(this, 2,"WbpLvl2",34,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0161",[],false,1,false,true,10,true,false,false,"",0,"px","Nueva fila",true,false,false,null,null,false,"",false,[1,1,1,1],false,0,true,false);
   var Grid1Container = this.Grid1Container;
   Grid1Container.addBitmap("&Linkselection","vLINKSELECTION",35,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");
   Grid1Container.addSingleLineEdit(91,36,"ENTIDADTELEFONOID","Telefono Id","","EntidadTelefonoId","int",0,"px",4,4,"right",null,[],91,"EntidadTelefonoId",true,0,false,false,"Attribute",1,"WWColumn");
   Grid1Container.addSingleLineEdit(92,37,"ENTIDADTELEFONO","Telefono","","EntidadTelefono","char",0,"px",20,20,"left",null,[],92,"EntidadTelefono",true,0,false,false,"DescriptionAttribute",1,"WWColumn");
   Grid1Container.addSingleLineEdit(81,38,"ENTIDADID","Entidad Id","","EntidadId","int",0,"px",6,6,"right",null,[],81,"EntidadId",false,0,false,false,"Attribute",1,"");
   this.Grid1Container.emptyText = "";
   this.setGrid(Grid1Container);
   GXValidFnc[2]={fld:"",grid:0};
   GXValidFnc[3]={fld:"MAIN",grid:0};
   GXValidFnc[4]={fld:"",grid:0};
   GXValidFnc[5]={fld:"",grid:0};
   GXValidFnc[6]={fld:"ADVANCEDCONTAINER",grid:0};
   GXValidFnc[7]={fld:"",grid:0};
   GXValidFnc[8]={fld:"",grid:0};
   GXValidFnc[9]={fld:"ENTIDADTELEFONOIDFILTERCONTAINER",grid:0};
   GXValidFnc[10]={fld:"",grid:0};
   GXValidFnc[11]={fld:"",grid:0};
   GXValidFnc[12]={fld:"LBLENTIDADTELEFONOIDFILTER", format:1,grid:0,evt:"e11131_client"};
   GXValidFnc[13]={fld:"",grid:0};
   GXValidFnc[14]={fld:"",grid:0};
   GXValidFnc[15]={fld:"",grid:0};
   GXValidFnc[16]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADTELEFONOID",gxz:"ZV6cEntidadTelefonoId",gxold:"OV6cEntidadTelefonoId",gxvar:"AV6cEntidadTelefonoId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV6cEntidadTelefonoId=gx.num.intval(Value)},v2z:function(Value){gx.O.ZV6cEntidadTelefonoId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("vCENTIDADTELEFONOID",gx.O.AV6cEntidadTelefonoId,0)},c2v:function(){gx.O.AV6cEntidadTelefonoId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADTELEFONOID",'.')},nac:gx.falseFn};
   GXValidFnc[17]={fld:"",grid:0};
   GXValidFnc[18]={fld:"",grid:0};
   GXValidFnc[19]={fld:"ENTIDADTELEFONOFILTERCONTAINER",grid:0};
   GXValidFnc[20]={fld:"",grid:0};
   GXValidFnc[21]={fld:"",grid:0};
   GXValidFnc[22]={fld:"LBLENTIDADTELEFONOFILTER", format:1,grid:0,evt:"e12131_client"};
   GXValidFnc[23]={fld:"",grid:0};
   GXValidFnc[24]={fld:"",grid:0};
   GXValidFnc[25]={fld:"",grid:0};
   GXValidFnc[26]={lvl:0,type:"char",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADTELEFONO",gxz:"ZV7cEntidadTelefono",gxold:"OV7cEntidadTelefono",gxvar:"AV7cEntidadTelefono",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV7cEntidadTelefono=Value},v2z:function(Value){gx.O.ZV7cEntidadTelefono=Value},v2c:function(){gx.fn.setControlValue("vCENTIDADTELEFONO",gx.O.AV7cEntidadTelefono,0)},c2v:function(){gx.O.AV7cEntidadTelefono=this.val()},val:function(){return gx.fn.getControlValue("vCENTIDADTELEFONO")},nac:gx.falseFn};
   GXValidFnc[27]={fld:"",grid:0};
   GXValidFnc[28]={fld:"GRIDTABLE",grid:0};
   GXValidFnc[29]={fld:"",grid:0};
   GXValidFnc[30]={fld:"",grid:0};
   GXValidFnc[31]={fld:"BTNTOGGLE",grid:0};
   GXValidFnc[32]={fld:"",grid:0};
   GXValidFnc[33]={fld:"",grid:0};
   GXValidFnc[35]={lvl:2,type:"bits",len:1024,dec:0,sign:false,ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.AV5LinkSelection=Value},v2z:function(Value){gx.O.ZV5LinkSelection=Value},v2c:function(row){gx.fn.setGridMultimediaValue("vLINKSELECTION",row || gx.fn.currentGridRowImpl(34),gx.O.AV5LinkSelection,gx.O.AV13Linkselection_GXI)},c2v:function(){gx.O.AV13Linkselection_GXI=this.val_GXI();gx.O.AV5LinkSelection=this.val()},val:function(row){return gx.fn.getGridControlValue("vLINKSELECTION",row || gx.fn.currentGridRowImpl(34))},val_GXI:function(row){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",row || gx.fn.currentGridRowImpl(34))}, gxvar_GXI:'AV13Linkselection_GXI',nac:gx.falseFn};
   GXValidFnc[36]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADTELEFONOID",gxz:"Z91EntidadTelefonoId",gxold:"O91EntidadTelefonoId",gxvar:"A91EntidadTelefonoId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A91EntidadTelefonoId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z91EntidadTelefonoId=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("ENTIDADTELEFONOID",row || gx.fn.currentGridRowImpl(34),gx.O.A91EntidadTelefonoId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A91EntidadTelefonoId=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("ENTIDADTELEFONOID",row || gx.fn.currentGridRowImpl(34),'.')},nac:gx.falseFn};
   GXValidFnc[37]={lvl:2,type:"char",len:20,dec:0,sign:false,ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADTELEFONO",gxz:"Z92EntidadTelefono",gxold:"O92EntidadTelefono",gxvar:"A92EntidadTelefono",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'tel',v2v:function(Value){gx.O.A92EntidadTelefono=Value},v2z:function(Value){gx.O.Z92EntidadTelefono=Value},v2c:function(row){gx.fn.setGridControlValue("ENTIDADTELEFONO",row || gx.fn.currentGridRowImpl(34),gx.O.A92EntidadTelefono,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A92EntidadTelefono=this.val()},val:function(row){return gx.fn.getGridControlValue("ENTIDADTELEFONO",row || gx.fn.currentGridRowImpl(34))},nac:gx.falseFn};
   GXValidFnc[38]={lvl:2,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADID",gxz:"Z81EntidadId",gxold:"O81EntidadId",gxvar:"A81EntidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A81EntidadId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z81EntidadId=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("ENTIDADID",row || gx.fn.currentGridRowImpl(34),gx.O.A81EntidadId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A81EntidadId=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("ENTIDADID",row || gx.fn.currentGridRowImpl(34),'.')},nac:gx.falseFn};
   GXValidFnc[39]={fld:"",grid:0};
   GXValidFnc[40]={fld:"",grid:0};
   GXValidFnc[41]={fld:"BTN_CANCEL",grid:0};
   this.AV6cEntidadTelefonoId = 0 ;
   this.ZV6cEntidadTelefonoId = 0 ;
   this.OV6cEntidadTelefonoId = 0 ;
   this.AV7cEntidadTelefono = "" ;
   this.ZV7cEntidadTelefono = "" ;
   this.OV7cEntidadTelefono = "" ;
   this.ZV5LinkSelection = "" ;
   this.OV5LinkSelection = "" ;
   this.Z91EntidadTelefonoId = 0 ;
   this.O91EntidadTelefonoId = 0 ;
   this.Z92EntidadTelefono = "" ;
   this.O92EntidadTelefono = "" ;
   this.Z81EntidadId = 0 ;
   this.O81EntidadId = 0 ;
   this.AV6cEntidadTelefonoId = 0 ;
   this.AV7cEntidadTelefono = "" ;
   this.AV8pEntidadId = 0 ;
   this.AV9pEntidadTelefonoId = 0 ;
   this.AV5LinkSelection = "" ;
   this.A91EntidadTelefonoId = 0 ;
   this.A92EntidadTelefono = "" ;
   this.A81EntidadId = 0 ;
   this.Events = {"e16132_client": ["ENTER", true] ,"e17131_client": ["CANCEL", true] ,"e13131_client": ["'TOGGLE'", false] ,"e11131_client": ["LBLENTIDADTELEFONOIDFILTER.CLICK", false] ,"e12131_client": ["LBLENTIDADTELEFONOFILTER.CLICK", false]};
   this.EvtParms["REFRESH"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadTelefonoId',fld:'vCENTIDADTELEFONOID'},{av:'AV7cEntidadTelefono',fld:'vCENTIDADTELEFONO'},{av:'AV8pEntidadId',fld:'vPENTIDADID',hsh:true}],[]];
   this.EvtParms["'TOGGLE'"] = [[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]];
   this.EvtParms["LBLENTIDADTELEFONOIDFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("ENTIDADTELEFONOIDFILTERCONTAINER","Class")',ctrl:'ENTIDADTELEFONOIDFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ENTIDADTELEFONOIDFILTERCONTAINER","Class")',ctrl:'ENTIDADTELEFONOIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADTELEFONOID","Visible")',ctrl:'vCENTIDADTELEFONOID',prop:'Visible'}]];
   this.EvtParms["LBLENTIDADTELEFONOFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("ENTIDADTELEFONOFILTERCONTAINER","Class")',ctrl:'ENTIDADTELEFONOFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ENTIDADTELEFONOFILTERCONTAINER","Class")',ctrl:'ENTIDADTELEFONOFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADTELEFONO","Visible")',ctrl:'vCENTIDADTELEFONO',prop:'Visible'}]];
   this.EvtParms["LOAD"] = [[],[{av:'AV5LinkSelection',fld:'vLINKSELECTION'}]];
   this.EvtParms["ENTER"] = [[{av:'A91EntidadTelefonoId',fld:'ENTIDADTELEFONOID'}],[{av:'AV9pEntidadTelefonoId',fld:'vPENTIDADTELEFONOID'}]];
   this.EvtParms["GRID1_FIRSTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadTelefonoId',fld:'vCENTIDADTELEFONOID'},{av:'AV7cEntidadTelefono',fld:'vCENTIDADTELEFONO'},{av:'AV8pEntidadId',fld:'vPENTIDADID',hsh:true}],[]];
   this.EvtParms["GRID1_PREVPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadTelefonoId',fld:'vCENTIDADTELEFONOID'},{av:'AV7cEntidadTelefono',fld:'vCENTIDADTELEFONO'},{av:'AV8pEntidadId',fld:'vPENTIDADID',hsh:true}],[]];
   this.EvtParms["GRID1_NEXTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadTelefonoId',fld:'vCENTIDADTELEFONOID'},{av:'AV7cEntidadTelefono',fld:'vCENTIDADTELEFONO'},{av:'AV8pEntidadId',fld:'vPENTIDADID',hsh:true}],[]];
   this.EvtParms["GRID1_LASTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadTelefonoId',fld:'vCENTIDADTELEFONOID'},{av:'AV7cEntidadTelefono',fld:'vCENTIDADTELEFONO'},{av:'AV8pEntidadId',fld:'vPENTIDADID',hsh:true}],[]];
   this.setVCMap("AV8pEntidadId", "vPENTIDADID", 0, "int");
   this.setVCMap("AV9pEntidadTelefonoId", "vPENTIDADTELEFONOID", 0, "int");
   this.setVCMap("AV8pEntidadId", "vPENTIDADID", 0, "int");
   Grid1Container.addRefreshingVar(this.GXValidFnc[16]);
   Grid1Container.addRefreshingVar(this.GXValidFnc[26]);
   Grid1Container.addRefreshingVar({rfrVar:"AV8pEntidadId"});
   this.Initialize( );
});
gx.createParentObj(gx0161);
