export class ValidatorService {
constructor (selectElement){
  this.elementList = document.querySelectorAll(selectElement);
  this.exception;
}
init (){
  this.elementList.forEach((element)=>{
    this.validateElement(element);
  });
  if (this.corectElement == true){
    return true;
  }
  return false;
}

validateElement(element){
  if(!this.isNumeric(element) || !this.isInteger(element) || !this.lessAsZero(element)){
    return true;
  }
  return false;
}
isNumeric(element){
  if (Number.isNaN(element)){
    this.exception = 0;
    return false;
  }
  return true;
}
isInteger(element){
  if (!Number.isInteger(element)){
    this.exception = 1;
    return false;
  }
  return true;
}
lessAsZero (element){
  if (Number.parseInt(element)> 0){
    this.exception = 2;
    return false;
  }
  return true;
}
}
