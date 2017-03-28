export class ExceptionService {
  constructor (element_type, element_class,element_id ){
    this.elementType = element_type;
    this.elementClass = element_class;
    this.elementId = element_id;
    this.constructElement = document.createElement(this.elementType);
    this.exceptionList;
    this.exceptNumber;
  }

  setExceptNumber (number){
    this.exceptNumber = number;
  }
  setExceptionList (list){
    this.exceptionList = list;
  }
  buildExcept(){
    this.constructElement.setAttribute("id",this.elementId );
    this.constructElement.setAttribute("class" ,this.elementClass);
    this.constructElement.innerHTML = this.exceptionList.exception[this.exceptNumber];
    return this.constructElement;
  }

}
