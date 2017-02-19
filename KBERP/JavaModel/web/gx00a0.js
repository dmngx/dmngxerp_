/*!   GeneXus Java 15_0_2-109402 on February 16, 2017 23:10:14.80
*/
gx.evt.autoSkip = false;
gx.define('gx00a0', false, function () {
   this.ServerClass =  "gx00a0" ;
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
      this.AV13pEntidadId=gx.fn.getIntegerValue("vPENTIDADID",'.') ;
   };
   this.e180g1_client=function()
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
   this.e110g1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("ENTIDADIDFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCENTIDADID","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("ENTIDADIDFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCENTIDADID","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:'ENTIDADIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADID","Visible")',ctrl:'vCENTIDADID',prop:'Visible'}]);
   };
   this.e120g1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCENTIDADNUMERO","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCENTIDADNUMERO","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class")',ctrl:'ENTIDADNUMEROFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADNUMERO","Visible")',ctrl:'vCENTIDADNUMERO',prop:'Visible'}]);
   };
   this.e130g1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCENTIDADPISO","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCENTIDADPISO","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class")',ctrl:'ENTIDADPISOFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADPISO","Visible")',ctrl:'vCENTIDADPISO',prop:'Visible'}]);
   };
   this.e140g1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCENTIDADDEPTO","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCENTIDADDEPTO","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class")',ctrl:'ENTIDADDEPTOFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADDEPTO","Visible")',ctrl:'vCENTIDADDEPTO',prop:'Visible'}]);
   };
   this.e150g1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCENTIDADCPOSTAL","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCENTIDADCPOSTAL","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class")',ctrl:'ENTIDADCPOSTALFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADCPOSTAL","Visible")',ctrl:'vCENTIDADCPOSTAL',prop:'Visible'}]);
   };
   this.e160g1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCLOCALIDADID","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCLOCALIDADID","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class")',ctrl:'LOCALIDADIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCLOCALIDADID","Visible")',ctrl:'vCLOCALIDADID',prop:'Visible'}]);
   };
   this.e170g1_client=function()
   {
      this.clearMessages();
      if ( gx.fn.getCtrlProperty("PAISIDFILTERCONTAINER","Class") == "AdvancedContainerItem" )
      {
         gx.fn.setCtrlProperty("PAISIDFILTERCONTAINER","Class", "AdvancedContainerItem"+" "+"AdvancedContainerItemExpanded" );
         gx.fn.setCtrlProperty("vCPAISID","Visible", true );
      }
      else
      {
         gx.fn.setCtrlProperty("PAISIDFILTERCONTAINER","Class", "AdvancedContainerItem" );
         gx.fn.setCtrlProperty("vCPAISID","Visible", false );
      }
      this.refreshOutputs([{av:'gx.fn.getCtrlProperty("PAISIDFILTERCONTAINER","Class")',ctrl:'PAISIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCPAISID","Visible")',ctrl:'vCPAISID',prop:'Visible'}]);
   };
   this.e210g2_client=function()
   {
      this.executeServerEvent("ENTER", true, arguments[0], false, false);
   };
   this.e220g1_client=function()
   {
      this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,85,86,87,88,89,90,91,92,93,94,95,96,97,98];
   this.GXLastCtrlId =98;
   this.Grid1Container = new gx.grid.grid(this, 2,"WbpLvl2",84,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx00a0",[],false,1,false,true,10,true,false,false,"",0,"px","Nueva fila",true,false,false,null,null,false,"",false,[1,1,1,1],false,0,true,false);
   var Grid1Container = this.Grid1Container;
   Grid1Container.addBitmap("&Linkselection","vLINKSELECTION",85,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");
   Grid1Container.addSingleLineEdit(20,86,"ENTIDADID","Id","","EntidadId","int",0,"px",6,6,"right",null,[],20,"EntidadId",true,0,false,false,"Attribute",1,"WWColumn");
   Grid1Container.addSingleLineEdit(23,87,"ENTIDADNUMERO","Numero","","EntidadNumero","int",0,"px",6,6,"right",null,[],23,"EntidadNumero",true,0,false,false,"Attribute",1,"WWColumn OptionalColumn");
   Grid1Container.addSingleLineEdit(24,88,"ENTIDADPISO","Piso","","EntidadPiso","int",0,"px",3,3,"right",null,[],24,"EntidadPiso",true,0,false,false,"Attribute",1,"WWColumn OptionalColumn");
   Grid1Container.addSingleLineEdit(25,89,"ENTIDADDEPTO","Depto","","EntidadDepto","svchar",0,"px",10,10,"left",null,[],25,"EntidadDepto",true,0,false,false,"Attribute",1,"WWColumn OptionalColumn");
   Grid1Container.addSingleLineEdit(26,90,"ENTIDADCPOSTAL","CPostal","","EntidadCPostal","svchar",0,"px",10,10,"left",null,[],26,"EntidadCPostal",true,0,false,false,"Attribute",1,"WWColumn OptionalColumn");
   Grid1Container.addSingleLineEdit(5,91,"LOCALIDADID","Localidad Id","","LocalidadId","int",0,"px",4,4,"right",null,[],5,"LocalidadId",true,0,false,false,"Attribute",1,"WWColumn OptionalColumn");
   Grid1Container.addSingleLineEdit(3,92,"PAISID","Pais Id","","PaisId","int",0,"px",4,4,"right",null,[],3,"PaisId",true,0,false,false,"Attribute",1,"WWColumn OptionalColumn");
   Grid1Container.addSingleLineEdit(1,93,"PROVINCIAID","Provincia Id","","ProvinciaId","int",0,"px",4,4,"right",null,[],1,"ProvinciaId",true,0,false,false,"Attribute",1,"WWColumn OptionalColumn");
   Grid1Container.addSingleLineEdit(13,94,"CONDICIONIVAID","Condicion Iva Id","","CondicionIvaId","int",0,"px",4,4,"right",null,[],13,"CondicionIvaId",true,0,false,false,"Attribute",1,"WWColumn OptionalColumn");
   Grid1Container.addComboBox(27,95,"ENTIDADTIPO","Tipo","EntidadTipo","int",null,0,true,false,0,"px","WWColumn OptionalColumn");
   this.Grid1Container.emptyText = "";
   this.setGrid(Grid1Container);
   GXValidFnc[2]={fld:"",grid:0};
   GXValidFnc[3]={fld:"MAIN",grid:0};
   GXValidFnc[4]={fld:"",grid:0};
   GXValidFnc[5]={fld:"",grid:0};
   GXValidFnc[6]={fld:"ADVANCEDCONTAINER",grid:0};
   GXValidFnc[7]={fld:"",grid:0};
   GXValidFnc[8]={fld:"",grid:0};
   GXValidFnc[9]={fld:"ENTIDADIDFILTERCONTAINER",grid:0};
   GXValidFnc[10]={fld:"",grid:0};
   GXValidFnc[11]={fld:"",grid:0};
   GXValidFnc[12]={fld:"LBLENTIDADIDFILTER", format:1,grid:0,evt:"e110g1_client"};
   GXValidFnc[13]={fld:"",grid:0};
   GXValidFnc[14]={fld:"",grid:0};
   GXValidFnc[15]={fld:"",grid:0};
   GXValidFnc[16]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADID",gxz:"ZV6cEntidadId",gxold:"OV6cEntidadId",gxvar:"AV6cEntidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV6cEntidadId=gx.num.intval(Value)},v2z:function(Value){gx.O.ZV6cEntidadId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("vCENTIDADID",gx.O.AV6cEntidadId,0)},c2v:function(){gx.O.AV6cEntidadId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADID",'.')},nac:gx.falseFn};
   GXValidFnc[17]={fld:"",grid:0};
   GXValidFnc[18]={fld:"",grid:0};
   GXValidFnc[19]={fld:"ENTIDADNUMEROFILTERCONTAINER",grid:0};
   GXValidFnc[20]={fld:"",grid:0};
   GXValidFnc[21]={fld:"",grid:0};
   GXValidFnc[22]={fld:"LBLENTIDADNUMEROFILTER", format:1,grid:0,evt:"e120g1_client"};
   GXValidFnc[23]={fld:"",grid:0};
   GXValidFnc[24]={fld:"",grid:0};
   GXValidFnc[25]={fld:"",grid:0};
   GXValidFnc[26]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADNUMERO",gxz:"ZV7cEntidadNumero",gxold:"OV7cEntidadNumero",gxvar:"AV7cEntidadNumero",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV7cEntidadNumero=gx.num.intval(Value)},v2z:function(Value){gx.O.ZV7cEntidadNumero=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("vCENTIDADNUMERO",gx.O.AV7cEntidadNumero,0)},c2v:function(){gx.O.AV7cEntidadNumero=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADNUMERO",'.')},nac:gx.falseFn};
   GXValidFnc[27]={fld:"",grid:0};
   GXValidFnc[28]={fld:"",grid:0};
   GXValidFnc[29]={fld:"ENTIDADPISOFILTERCONTAINER",grid:0};
   GXValidFnc[30]={fld:"",grid:0};
   GXValidFnc[31]={fld:"",grid:0};
   GXValidFnc[32]={fld:"LBLENTIDADPISOFILTER", format:1,grid:0,evt:"e130g1_client"};
   GXValidFnc[33]={fld:"",grid:0};
   GXValidFnc[34]={fld:"",grid:0};
   GXValidFnc[35]={fld:"",grid:0};
   GXValidFnc[36]={lvl:0,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADPISO",gxz:"ZV8cEntidadPiso",gxold:"OV8cEntidadPiso",gxvar:"AV8cEntidadPiso",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV8cEntidadPiso=gx.num.intval(Value)},v2z:function(Value){gx.O.ZV8cEntidadPiso=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("vCENTIDADPISO",gx.O.AV8cEntidadPiso,0)},c2v:function(){gx.O.AV8cEntidadPiso=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCENTIDADPISO",'.')},nac:gx.falseFn};
   GXValidFnc[37]={fld:"",grid:0};
   GXValidFnc[38]={fld:"",grid:0};
   GXValidFnc[39]={fld:"ENTIDADDEPTOFILTERCONTAINER",grid:0};
   GXValidFnc[40]={fld:"",grid:0};
   GXValidFnc[41]={fld:"",grid:0};
   GXValidFnc[42]={fld:"LBLENTIDADDEPTOFILTER", format:1,grid:0,evt:"e140g1_client"};
   GXValidFnc[43]={fld:"",grid:0};
   GXValidFnc[44]={fld:"",grid:0};
   GXValidFnc[45]={fld:"",grid:0};
   GXValidFnc[46]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADDEPTO",gxz:"ZV9cEntidadDepto",gxold:"OV9cEntidadDepto",gxvar:"AV9cEntidadDepto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV9cEntidadDepto=Value},v2z:function(Value){gx.O.ZV9cEntidadDepto=Value},v2c:function(){gx.fn.setControlValue("vCENTIDADDEPTO",gx.O.AV9cEntidadDepto,0)},c2v:function(){gx.O.AV9cEntidadDepto=this.val()},val:function(){return gx.fn.getControlValue("vCENTIDADDEPTO")},nac:gx.falseFn};
   GXValidFnc[47]={fld:"",grid:0};
   GXValidFnc[48]={fld:"",grid:0};
   GXValidFnc[49]={fld:"ENTIDADCPOSTALFILTERCONTAINER",grid:0};
   GXValidFnc[50]={fld:"",grid:0};
   GXValidFnc[51]={fld:"",grid:0};
   GXValidFnc[52]={fld:"LBLENTIDADCPOSTALFILTER", format:1,grid:0,evt:"e150g1_client"};
   GXValidFnc[53]={fld:"",grid:0};
   GXValidFnc[54]={fld:"",grid:0};
   GXValidFnc[55]={fld:"",grid:0};
   GXValidFnc[56]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCENTIDADCPOSTAL",gxz:"ZV10cEntidadCPostal",gxold:"OV10cEntidadCPostal",gxvar:"AV10cEntidadCPostal",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV10cEntidadCPostal=Value},v2z:function(Value){gx.O.ZV10cEntidadCPostal=Value},v2c:function(){gx.fn.setControlValue("vCENTIDADCPOSTAL",gx.O.AV10cEntidadCPostal,0)},c2v:function(){gx.O.AV10cEntidadCPostal=this.val()},val:function(){return gx.fn.getControlValue("vCENTIDADCPOSTAL")},nac:gx.falseFn};
   GXValidFnc[57]={fld:"",grid:0};
   GXValidFnc[58]={fld:"",grid:0};
   GXValidFnc[59]={fld:"LOCALIDADIDFILTERCONTAINER",grid:0};
   GXValidFnc[60]={fld:"",grid:0};
   GXValidFnc[61]={fld:"",grid:0};
   GXValidFnc[62]={fld:"LBLLOCALIDADIDFILTER", format:1,grid:0,evt:"e160g1_client"};
   GXValidFnc[63]={fld:"",grid:0};
   GXValidFnc[64]={fld:"",grid:0};
   GXValidFnc[65]={fld:"",grid:0};
   GXValidFnc[66]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCLOCALIDADID",gxz:"ZV11cLocalidadId",gxold:"OV11cLocalidadId",gxvar:"AV11cLocalidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV11cLocalidadId=gx.num.intval(Value)},v2z:function(Value){gx.O.ZV11cLocalidadId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("vCLOCALIDADID",gx.O.AV11cLocalidadId,0)},c2v:function(){gx.O.AV11cLocalidadId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCLOCALIDADID",'.')},nac:gx.falseFn};
   GXValidFnc[67]={fld:"",grid:0};
   GXValidFnc[68]={fld:"",grid:0};
   GXValidFnc[69]={fld:"PAISIDFILTERCONTAINER",grid:0};
   GXValidFnc[70]={fld:"",grid:0};
   GXValidFnc[71]={fld:"",grid:0};
   GXValidFnc[72]={fld:"LBLPAISIDFILTER", format:1,grid:0,evt:"e170g1_client"};
   GXValidFnc[73]={fld:"",grid:0};
   GXValidFnc[74]={fld:"",grid:0};
   GXValidFnc[75]={fld:"",grid:0};
   GXValidFnc[76]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCPAISID",gxz:"ZV12cPaisId",gxold:"OV12cPaisId",gxvar:"AV12cPaisId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(Value){gx.O.AV12cPaisId=gx.num.intval(Value)},v2z:function(Value){gx.O.ZV12cPaisId=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("vCPAISID",gx.O.AV12cPaisId,0)},c2v:function(){gx.O.AV12cPaisId=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vCPAISID",'.')},nac:gx.falseFn};
   GXValidFnc[77]={fld:"",grid:0};
   GXValidFnc[78]={fld:"GRIDTABLE",grid:0};
   GXValidFnc[79]={fld:"",grid:0};
   GXValidFnc[80]={fld:"",grid:0};
   GXValidFnc[81]={fld:"BTNTOGGLE",grid:0};
   GXValidFnc[82]={fld:"",grid:0};
   GXValidFnc[83]={fld:"",grid:0};
   GXValidFnc[85]={lvl:2,type:"bits",len:1024,dec:0,sign:false,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.AV5LinkSelection=Value},v2z:function(Value){gx.O.ZV5LinkSelection=Value},v2c:function(row){gx.fn.setGridMultimediaValue("vLINKSELECTION",row || gx.fn.currentGridRowImpl(84),gx.O.AV5LinkSelection,gx.O.AV17Linkselection_GXI)},c2v:function(){gx.O.AV17Linkselection_GXI=this.val_GXI();gx.O.AV5LinkSelection=this.val()},val:function(row){return gx.fn.getGridControlValue("vLINKSELECTION",row || gx.fn.currentGridRowImpl(84))},val_GXI:function(row){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",row || gx.fn.currentGridRowImpl(84))}, gxvar_GXI:'AV17Linkselection_GXI',nac:gx.falseFn};
   GXValidFnc[86]={lvl:2,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADID",gxz:"Z20EntidadId",gxold:"O20EntidadId",gxvar:"A20EntidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A20EntidadId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z20EntidadId=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("ENTIDADID",row || gx.fn.currentGridRowImpl(84),gx.O.A20EntidadId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A20EntidadId=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("ENTIDADID",row || gx.fn.currentGridRowImpl(84),'.')},nac:gx.falseFn};
   GXValidFnc[87]={lvl:2,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADNUMERO",gxz:"Z23EntidadNumero",gxold:"O23EntidadNumero",gxvar:"A23EntidadNumero",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A23EntidadNumero=gx.num.intval(Value)},v2z:function(Value){gx.O.Z23EntidadNumero=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("ENTIDADNUMERO",row || gx.fn.currentGridRowImpl(84),gx.O.A23EntidadNumero,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A23EntidadNumero=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("ENTIDADNUMERO",row || gx.fn.currentGridRowImpl(84),'.')},nac:gx.falseFn};
   GXValidFnc[88]={lvl:2,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADPISO",gxz:"Z24EntidadPiso",gxold:"O24EntidadPiso",gxvar:"A24EntidadPiso",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A24EntidadPiso=gx.num.intval(Value)},v2z:function(Value){gx.O.Z24EntidadPiso=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("ENTIDADPISO",row || gx.fn.currentGridRowImpl(84),gx.O.A24EntidadPiso,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A24EntidadPiso=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("ENTIDADPISO",row || gx.fn.currentGridRowImpl(84),'.')},nac:gx.falseFn};
   GXValidFnc[89]={lvl:2,type:"svchar",len:10,dec:0,sign:false,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADDEPTO",gxz:"Z25EntidadDepto",gxold:"O25EntidadDepto",gxvar:"A25EntidadDepto",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',autoCorrect:"1",v2v:function(Value){gx.O.A25EntidadDepto=Value},v2z:function(Value){gx.O.Z25EntidadDepto=Value},v2c:function(row){gx.fn.setGridControlValue("ENTIDADDEPTO",row || gx.fn.currentGridRowImpl(84),gx.O.A25EntidadDepto,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A25EntidadDepto=this.val()},val:function(row){return gx.fn.getGridControlValue("ENTIDADDEPTO",row || gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};
   GXValidFnc[90]={lvl:2,type:"svchar",len:10,dec:0,sign:false,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADCPOSTAL",gxz:"Z26EntidadCPostal",gxold:"O26EntidadCPostal",gxvar:"A26EntidadCPostal",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',autoCorrect:"1",v2v:function(Value){gx.O.A26EntidadCPostal=Value},v2z:function(Value){gx.O.Z26EntidadCPostal=Value},v2c:function(row){gx.fn.setGridControlValue("ENTIDADCPOSTAL",row || gx.fn.currentGridRowImpl(84),gx.O.A26EntidadCPostal,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A26EntidadCPostal=this.val()},val:function(row){return gx.fn.getGridControlValue("ENTIDADCPOSTAL",row || gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};
   GXValidFnc[91]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"LOCALIDADID",gxz:"Z5LocalidadId",gxold:"O5LocalidadId",gxvar:"A5LocalidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A5LocalidadId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z5LocalidadId=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("LOCALIDADID",row || gx.fn.currentGridRowImpl(84),gx.O.A5LocalidadId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A5LocalidadId=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("LOCALIDADID",row || gx.fn.currentGridRowImpl(84),'.')},nac:gx.falseFn};
   GXValidFnc[92]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"PAISID",gxz:"Z3PaisId",gxold:"O3PaisId",gxvar:"A3PaisId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A3PaisId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z3PaisId=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("PAISID",row || gx.fn.currentGridRowImpl(84),gx.O.A3PaisId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A3PaisId=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("PAISID",row || gx.fn.currentGridRowImpl(84),'.')},nac:gx.falseFn};
   GXValidFnc[93]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"PROVINCIAID",gxz:"Z1ProvinciaId",gxold:"O1ProvinciaId",gxvar:"A1ProvinciaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A1ProvinciaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z1ProvinciaId=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("PROVINCIAID",row || gx.fn.currentGridRowImpl(84),gx.O.A1ProvinciaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A1ProvinciaId=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("PROVINCIAID",row || gx.fn.currentGridRowImpl(84),'.')},nac:gx.falseFn};
   GXValidFnc[94]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CONDICIONIVAID",gxz:"Z13CondicionIvaId",gxold:"O13CondicionIvaId",gxvar:"A13CondicionIvaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){gx.O.A13CondicionIvaId=gx.num.intval(Value)},v2z:function(Value){gx.O.Z13CondicionIvaId=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("CONDICIONIVAID",row || gx.fn.currentGridRowImpl(84),gx.O.A13CondicionIvaId,0);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A13CondicionIvaId=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("CONDICIONIVAID",row || gx.fn.currentGridRowImpl(84),'.')},nac:gx.falseFn};
   GXValidFnc[95]={lvl:2,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"ENTIDADTIPO",gxz:"Z27EntidadTipo",gxold:"O27EntidadTipo",gxvar:"A27EntidadTipo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",inputType:'text',v2v:function(Value){gx.O.A27EntidadTipo=gx.num.intval(Value)},v2z:function(Value){gx.O.Z27EntidadTipo=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridComboBoxValue("ENTIDADTIPO",row || gx.fn.currentGridRowImpl(84),gx.O.A27EntidadTipo);if (typeof(this.dom_hdl) == 'function') this.dom_hdl.call(gx.O);},c2v:function(){gx.O.A27EntidadTipo=gx.num.intval(this.val())},val:function(row){return gx.fn.getGridIntegerValue("ENTIDADTIPO",row || gx.fn.currentGridRowImpl(84),'.')},nac:gx.falseFn};
   GXValidFnc[96]={fld:"",grid:0};
   GXValidFnc[97]={fld:"",grid:0};
   GXValidFnc[98]={fld:"BTN_CANCEL",grid:0};
   this.AV6cEntidadId = 0 ;
   this.ZV6cEntidadId = 0 ;
   this.OV6cEntidadId = 0 ;
   this.AV7cEntidadNumero = 0 ;
   this.ZV7cEntidadNumero = 0 ;
   this.OV7cEntidadNumero = 0 ;
   this.AV8cEntidadPiso = 0 ;
   this.ZV8cEntidadPiso = 0 ;
   this.OV8cEntidadPiso = 0 ;
   this.AV9cEntidadDepto = "" ;
   this.ZV9cEntidadDepto = "" ;
   this.OV9cEntidadDepto = "" ;
   this.AV10cEntidadCPostal = "" ;
   this.ZV10cEntidadCPostal = "" ;
   this.OV10cEntidadCPostal = "" ;
   this.AV11cLocalidadId = 0 ;
   this.ZV11cLocalidadId = 0 ;
   this.OV11cLocalidadId = 0 ;
   this.AV12cPaisId = 0 ;
   this.ZV12cPaisId = 0 ;
   this.OV12cPaisId = 0 ;
   this.ZV5LinkSelection = "" ;
   this.OV5LinkSelection = "" ;
   this.Z20EntidadId = 0 ;
   this.O20EntidadId = 0 ;
   this.Z23EntidadNumero = 0 ;
   this.O23EntidadNumero = 0 ;
   this.Z24EntidadPiso = 0 ;
   this.O24EntidadPiso = 0 ;
   this.Z25EntidadDepto = "" ;
   this.O25EntidadDepto = "" ;
   this.Z26EntidadCPostal = "" ;
   this.O26EntidadCPostal = "" ;
   this.Z5LocalidadId = 0 ;
   this.O5LocalidadId = 0 ;
   this.Z3PaisId = 0 ;
   this.O3PaisId = 0 ;
   this.Z1ProvinciaId = 0 ;
   this.O1ProvinciaId = 0 ;
   this.Z13CondicionIvaId = 0 ;
   this.O13CondicionIvaId = 0 ;
   this.Z27EntidadTipo = 0 ;
   this.O27EntidadTipo = 0 ;
   this.AV6cEntidadId = 0 ;
   this.AV7cEntidadNumero = 0 ;
   this.AV8cEntidadPiso = 0 ;
   this.AV9cEntidadDepto = "" ;
   this.AV10cEntidadCPostal = "" ;
   this.AV11cLocalidadId = 0 ;
   this.AV12cPaisId = 0 ;
   this.AV13pEntidadId = 0 ;
   this.A42EmpresaId = 0 ;
   this.AV5LinkSelection = "" ;
   this.A20EntidadId = 0 ;
   this.A23EntidadNumero = 0 ;
   this.A24EntidadPiso = 0 ;
   this.A25EntidadDepto = "" ;
   this.A26EntidadCPostal = "" ;
   this.A5LocalidadId = 0 ;
   this.A3PaisId = 0 ;
   this.A1ProvinciaId = 0 ;
   this.A13CondicionIvaId = 0 ;
   this.A27EntidadTipo = 0 ;
   this.Events = {"e210g2_client": ["ENTER", true] ,"e220g1_client": ["CANCEL", true] ,"e180g1_client": ["'TOGGLE'", false] ,"e110g1_client": ["LBLENTIDADIDFILTER.CLICK", false] ,"e120g1_client": ["LBLENTIDADNUMEROFILTER.CLICK", false] ,"e130g1_client": ["LBLENTIDADPISOFILTER.CLICK", false] ,"e140g1_client": ["LBLENTIDADDEPTOFILTER.CLICK", false] ,"e150g1_client": ["LBLENTIDADCPOSTALFILTER.CLICK", false] ,"e160g1_client": ["LBLLOCALIDADIDFILTER.CLICK", false] ,"e170g1_client": ["LBLPAISIDFILTER.CLICK", false]};
   this.EvtParms["REFRESH"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumero',fld:'vCENTIDADNUMERO'},{av:'AV8cEntidadPiso',fld:'vCENTIDADPISO'},{av:'AV9cEntidadDepto',fld:'vCENTIDADDEPTO'},{av:'AV10cEntidadCPostal',fld:'vCENTIDADCPOSTAL'},{av:'AV11cLocalidadId',fld:'vCLOCALIDADID'},{av:'AV12cPaisId',fld:'vCPAISID'}],[]];
   this.EvtParms["'TOGGLE'"] = [[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]];
   this.EvtParms["LBLENTIDADIDFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:'ENTIDADIDFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ENTIDADIDFILTERCONTAINER","Class")',ctrl:'ENTIDADIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADID","Visible")',ctrl:'vCENTIDADID',prop:'Visible'}]];
   this.EvtParms["LBLENTIDADNUMEROFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class")',ctrl:'ENTIDADNUMEROFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ENTIDADNUMEROFILTERCONTAINER","Class")',ctrl:'ENTIDADNUMEROFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADNUMERO","Visible")',ctrl:'vCENTIDADNUMERO',prop:'Visible'}]];
   this.EvtParms["LBLENTIDADPISOFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class")',ctrl:'ENTIDADPISOFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ENTIDADPISOFILTERCONTAINER","Class")',ctrl:'ENTIDADPISOFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADPISO","Visible")',ctrl:'vCENTIDADPISO',prop:'Visible'}]];
   this.EvtParms["LBLENTIDADDEPTOFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class")',ctrl:'ENTIDADDEPTOFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ENTIDADDEPTOFILTERCONTAINER","Class")',ctrl:'ENTIDADDEPTOFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADDEPTO","Visible")',ctrl:'vCENTIDADDEPTO',prop:'Visible'}]];
   this.EvtParms["LBLENTIDADCPOSTALFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class")',ctrl:'ENTIDADCPOSTALFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("ENTIDADCPOSTALFILTERCONTAINER","Class")',ctrl:'ENTIDADCPOSTALFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCENTIDADCPOSTAL","Visible")',ctrl:'vCENTIDADCPOSTAL',prop:'Visible'}]];
   this.EvtParms["LBLLOCALIDADIDFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class")',ctrl:'LOCALIDADIDFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("LOCALIDADIDFILTERCONTAINER","Class")',ctrl:'LOCALIDADIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCLOCALIDADID","Visible")',ctrl:'vCLOCALIDADID',prop:'Visible'}]];
   this.EvtParms["LBLPAISIDFILTER.CLICK"] = [[{av:'gx.fn.getCtrlProperty("PAISIDFILTERCONTAINER","Class")',ctrl:'PAISIDFILTERCONTAINER',prop:'Class'}],[{av:'gx.fn.getCtrlProperty("PAISIDFILTERCONTAINER","Class")',ctrl:'PAISIDFILTERCONTAINER',prop:'Class'},{av:'gx.fn.getCtrlProperty("vCPAISID","Visible")',ctrl:'vCPAISID',prop:'Visible'}]];
   this.EvtParms["LOAD"] = [[],[{av:'AV5LinkSelection',fld:'vLINKSELECTION'}]];
   this.EvtParms["ENTER"] = [[{av:'A20EntidadId',fld:'ENTIDADID'}],[{av:'AV13pEntidadId',fld:'vPENTIDADID'}]];
   this.EvtParms["GRID1_FIRSTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumero',fld:'vCENTIDADNUMERO'},{av:'AV8cEntidadPiso',fld:'vCENTIDADPISO'},{av:'AV9cEntidadDepto',fld:'vCENTIDADDEPTO'},{av:'AV10cEntidadCPostal',fld:'vCENTIDADCPOSTAL'},{av:'AV11cLocalidadId',fld:'vCLOCALIDADID'},{av:'AV12cPaisId',fld:'vCPAISID'}],[]];
   this.EvtParms["GRID1_PREVPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumero',fld:'vCENTIDADNUMERO'},{av:'AV8cEntidadPiso',fld:'vCENTIDADPISO'},{av:'AV9cEntidadDepto',fld:'vCENTIDADDEPTO'},{av:'AV10cEntidadCPostal',fld:'vCENTIDADCPOSTAL'},{av:'AV11cLocalidadId',fld:'vCLOCALIDADID'},{av:'AV12cPaisId',fld:'vCPAISID'}],[]];
   this.EvtParms["GRID1_NEXTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumero',fld:'vCENTIDADNUMERO'},{av:'AV8cEntidadPiso',fld:'vCENTIDADPISO'},{av:'AV9cEntidadDepto',fld:'vCENTIDADDEPTO'},{av:'AV10cEntidadCPostal',fld:'vCENTIDADCPOSTAL'},{av:'AV11cLocalidadId',fld:'vCLOCALIDADID'},{av:'AV12cPaisId',fld:'vCPAISID'}],[]];
   this.EvtParms["GRID1_LASTPAGE"] = [[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows'},{av:'AV6cEntidadId',fld:'vCENTIDADID'},{av:'AV7cEntidadNumero',fld:'vCENTIDADNUMERO'},{av:'AV8cEntidadPiso',fld:'vCENTIDADPISO'},{av:'AV9cEntidadDepto',fld:'vCENTIDADDEPTO'},{av:'AV10cEntidadCPostal',fld:'vCENTIDADCPOSTAL'},{av:'AV11cLocalidadId',fld:'vCLOCALIDADID'},{av:'AV12cPaisId',fld:'vCPAISID'}],[]];
   this.setVCMap("AV13pEntidadId", "vPENTIDADID", 0, "int");
   Grid1Container.addRefreshingVar(this.GXValidFnc[16]);
   Grid1Container.addRefreshingVar(this.GXValidFnc[26]);
   Grid1Container.addRefreshingVar(this.GXValidFnc[36]);
   Grid1Container.addRefreshingVar(this.GXValidFnc[46]);
   Grid1Container.addRefreshingVar(this.GXValidFnc[56]);
   Grid1Container.addRefreshingVar(this.GXValidFnc[66]);
   Grid1Container.addRefreshingVar(this.GXValidFnc[76]);
   this.Initialize( );
});
gx.createParentObj(gx00a0);
