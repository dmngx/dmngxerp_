/*!   GeneXus Java 15_0_2-109402 on February 19, 2017 17:32:14.24
*/
gx.evt.autoSkip = false;
gx.define('rwdpromptmasterpage', false, function () {
   this.ServerClass =  "rwdpromptmasterpage" ;
   this.PackageName =  "com.kberp" ;
   this.setObjectType("web");
   this.IsMasterPage=true;
   this.hasEnterEvent = false;
   this.skipOnEnter = false;
   this.autoRefresh = true;
   this.fullAjax = true;
   this.supportAjaxEvents =  true ;
   this.ajaxSecurityToken =  true ;
   this.SetStandaloneVars=function()
   {
   };
   this.e14062_client=function()
   {
      this.executeServerEvent("ENTER_MPAGE", true, null, false, false);
   };
   this.e15062_client=function()
   {
      this.executeServerEvent("CANCEL_MPAGE", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5];
   this.GXLastCtrlId =5;
   GXValidFnc[2]={fld:"",grid:0};
   GXValidFnc[3]={fld:"MAINTABLE",grid:0};
   GXValidFnc[4]={fld:"",grid:0};
   GXValidFnc[5]={fld:"",grid:0};
   this.Events = {"e14062_client": ["ENTER_MPAGE", true] ,"e15062_client": ["CANCEL_MPAGE", true]};
   this.EvtParms["REFRESH_MPAGE"] = [[],[]];
   this.Initialize( );
});
gx.createMasterPage(rwdpromptmasterpage);
