export class RenderService {
  constructor(content, id){
    this.content = content;
    this.id= document.getElementById(id);
  }
  render (){

    this.id.appendChild(this.content);
  }

}
