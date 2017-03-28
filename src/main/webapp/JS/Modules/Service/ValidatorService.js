export class ValidatorService {
constructor (){
  this.elementList;
  this.exception;
}
isException(){
  if (this.exception != null) return true; return false;
}
exceptionFlush (){
  this.exception = null;
}
getExceptNumber (){
  return this.exception;
}
setElement (element){
  this.elementList  = document.querySelectorAll(element);
}
init (){
  this.elementList.forEach((element)=>{
  this.validateElement(element);
  });
}

validateElement(element){
try{
  if(this.isEmpty(element)) throw 0;
}
catch (e){
  this.exception=e;
  return false;
}
try{
  if (!this.isInteger(element)) throw 1;
}
catch(e) {
  this.exception= e;
  return false;
}
try{
  if (this.lessAsZero(element)) throw 2;
}
catch(e){
  this.exception = e;
  return false;
}


}
isEmpty (element){
  if(element.value.replace(/\s/g, '') == null || element.value.replace(/\s/g, '') == "") return true; return false;
}
isInteger(element){
  return Number.isInteger(Number.parseInt(element.value));
}
lessAsZero (element){
  if (Number.parseInt(element.value) < 0) return true; return false

}
}
