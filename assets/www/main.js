var cb=new ChildBrowser();

function init2() {

}

function init() {
    // the next line makes it impossible to see Contacts on the HTC Evo since it
    // doesn't have a scroll button
    // document.addEventListener("touchmove", preventBehavior, false);
    document.addEventListener("deviceready", init2, true);
}

function TestChildBrowser() {
  var client_id="607068653119.apps.googleusercontent.com";
  var state="whatever_you_want";
  var scope="http://maps.google.com/maps/feeds/";
  cb.showWebPage("https://accounts.google.com/o/oauth2/auth?response_type=code&client_id=" + client_id + "&state=" + state + "&redirect_uri=http://localhost&scope=" + scope);
}


function oAuth2Failed() {
  console.log('oAuth2Failed');
  document.getElementById('info').innerHTML='login failed';
  cb.close();
}

function oAuth2Success(token) {
  console.log("I can haz code: "+token);
  document.getElementById('info').innerHTML=token;
  cb.close();
}
