export class AjaxService{
  constructor (path){
    this.path = path;
  }
  load (){
    var headers = new Headers();
   headers.set('Content-Type', 'application/json');
   headers.set('Method','GET');
   var request = new Request(this.path, headers);
   return fetch(request).then(function (response){
       return response.json();
       });

  }

}
