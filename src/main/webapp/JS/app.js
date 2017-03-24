
"use strict";
import {ValidatorService} from './Modules/Service/ValidatorService.js';
document.addEventListener('DOMContentLoaded', initAPI);

function initAPI (){
var ajaxService = new AjaxService ("/Modules/Service/exception.js");
var exceptionList = ajaxService.load();
exceptionList.then( getDataOption.then(function( JSON ) {
                    startEvent(JSON);
                  }));

}
function startEvent(){
  var validatorService = new ValidatorService(".test-element");
  document.querySelectorAll(".app_button").forEach(
    (element)=> {
      element.addEventListener("submit",
      (element)=>{
      if (!validatorService.init()){
        return false;

      }
        return true;
      }
    );
    }
  );
}
