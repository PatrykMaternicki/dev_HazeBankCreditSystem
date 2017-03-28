
"use strict";
import {ValidatorService} from './Service/ValidatorService.js';
import {AjaxService} from './Service/AjaxService.js';
import {RenderService} from './Service/RenderService.js';
import {ExceptionService} from './Service/ExceptionService.js';


export class App{
  constructor (eventType, eventTarget, testElement,fileName, idParentElement){
    this.eventType = eventType;
    this.eventTarget = eventTarget;
    this.testElement = testElement;
    this.fileName = fileName;
    this.idParentElement = idParentElement;
    this.ajaxService = new AjaxService("./JS/Modules/JSON/" + this.fileName +".json");
    this.validatorService = new ValidatorService (this.testElement);
    this.exceptionService = new ExceptionService("p","app_text_exception","exception");
  }
  init (){

    this.ajaxService.load().then(
      (JSON) => {
        this.exceptionService.setExceptionList(JSON);
        this.createEvent();
      }
    );

  }
  createEvent(){
    document.getElementById(this.eventTarget).addEventListener(this.eventType, (evt) => {this.startValidate(evt);});
  }

  startValidate(evt){
    this.clearElement();
    this.validatorService.setElement(this.testElement);
    this.validatorService.init();
    if (this.validatorService.isException()){
      this.exceptionService.setExceptNumber(this.validatorService.getExceptNumber());
      var renderService = new RenderService (this.exceptionService.buildExcept(),this.idParentElement);
      renderService.render();
      this.validatorService.exceptionFlush();
      evt.preventDefault();
    }
    return true;
  }
  clearElement(){
    var element = document.getElementById("exception");
    if (element == null){
      return;
    }
    else {
      element.innerHTML = "";
    }
  }
}
