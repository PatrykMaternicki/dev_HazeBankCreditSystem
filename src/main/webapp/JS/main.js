import {App} from './Modules/App.js';
document.addEventListener('DOMContentLoaded', initAPI);

function initAPI(){
  var app = new App ("submit","form",".test-element","exception","app_text");
  app.init();

}
