window.onload = function(){

var adminright = document.getElementById("admin");
adminright.onclick = function(){
	var input = new Array(10);
	var count = 3 ;
	input[0]=  prompt("please enter the possword");
	var i = 0;
	while(input[i] != 12345 ){
      if(i >= count){
      	adminright.href = "home.html";
      	break; }
      else if(input[i] == null){
      	adminright.href = "home.html";
      	break;}
      else{
      	alert("Incrrect possword, you are left with" + (count - i ) + " chance");
      	input[++i] = prompt("please enter the possword");
      }
	}
}
/*---------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------
 -------------------------- for the contact me input validation-----------------------------------------------------------------*/
var submitform = document.getElementById("submit");

 submitform.onclick = function (){
	var name = document.getElementById("name");
	var email = document.getElementById("email");
	if(name.value.length < 6){
	if(name.value == null || name.value == "")
		alert("name can't be empty");
	else
		alert("name must have at least 6 character");
	submitform.type = "reset"
}
	var patt = new RegExp("^[a-z0-9]\+.\+[@]\.?");
	if(! patt.test(email.value)){
      alert("please enter the correct email");
      submitform.type = "reset"; 
	}
}
/*--------------------------------------------------------------------------------------------------------------------------------*/

/*--------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------JSON DATA -----------------------------------------------------------------*/

/*--------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------LOADING FROM JSON DATA----------------------------------------------------*/

data.images.forEach( function(obj) {
  var img = new Image();
  img.src = obj.source1;
  img.setAttribute("class", "listImg");
  img.setAttribute("alt", obj.name);
  img.setAttribute('id' , obj.id);
  img.addEventListener("click", fucusCliked);

  document.getElementById("list_img").appendChild(img);
  var button = document.createElement("input");
  button.setAttribute("class", "edit");
  button.setAttribute("type" , "button");
  button.setAttribute("value", "edit");
  button.setAttribute("id", obj.id);
  button.addEventListener("click", editImage);

  var button2 = document.createElement("input");
  button2.setAttribute("class", "delete");
  button2.setAttribute("type" , "button");
  button2.setAttribute("value", "delete");
  button2.setAttribute("id", obj.id);
  button2.addEventListener("click", deleteClicked);

 document.getElementById("list_img").appendChild(button);
 document.getElementById("list_img").appendChild(button2);
});

  function displayImg(obj){
  var img = new Image();
  img.src = obj.source1;
  img.setAttribute("class", "displayImg");
  img.setAttribute("alt", obj.name);
  document.getElementById("display_img").appendChild(img);
}
displayImg(data.images[4]);

/* -------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------EVENT FUNTCTIONS FOR CLICK-------------------------------------------------*/

//--------------------------------------------------when delete button to be clicked---------------------------------------------//
function deleteClicked(){
    var deleteChlid1 = document.getElementById(this.id);
    var parent = document.getElementById("list_img");
    parent.removeChild(deleteChlid1);
    var deleteChlid2 = document.getElementById(this.id);
    parent.removeChild(deleteChlid2);
    var deleteChlid3 = document.getElementById(this.id);
    parent.removeChild(deleteChlid3);
}

//--------------------------------------------------when edit button to be clicked---------------------------------------------//
function editImage(){
  var id = this.id;
  modal.style.display = "block";
   document.getElementById("display_img").style.opacity = 0.3;
   document.getElementById("list_img").style.opacity = 0.3; 

   if(!(submit1.onclick =function(){
   modal.style.display = "none";
   document.getElementById("display_img").style.opacity = 1;
   document.getElementById("list_img").style.opacity = 1;

  var name = document.getElementById('img-name').value;
  if(name == "" || name == null)
    {alert("name con't be empty") ; return false ;}

   var url = document.getElementById("img-url").value;
  var date = new Date();
  date = document.getElementById("img-date").value;
  if( !validateDate(date))
    {alert('date can\'t be in future'); return false; }
  
  var info = document.getElementById("img-info").value;
  
  var img = document.getElementById(id);
 
  img.setAttribute("src", url);
  img.setAttribute("alt", name);

   submit1.type = 'reset';
    alert("you have edited that image");
}))
    return false;
}
function fucusCliked(){
  var display_img = document.getElementById("display_img");
   var img = display_img.getElementsByTagName('img')[0];
   img.setAttribute("src" , this.src);

}

/*--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------GLOBAL VARIABLES----------------------------------------------------------------*/

var addImg = document.getElementById("addImg");
var editImg = document.getElementById("editImg");
var deleteImg = document.getElementById("deleteImg");

var modal = document.getElementById('popup-modal');

var span = document.getElementsByClassName("close")[0];
var submit1 = document.getElementById("submit1");

/*--------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------ONCLICK FUCNCTIONS--------------------------------------------------------------*/


span.onclick = function() {
    modal.style.display = "none";
    document.getElementById("display_img").style.opacity = 1; 
   document.getElementById("list_img").style.opacity = 1;
}

window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
 // addingimage to json data and loading it on page .
var id = 8;
addImg.onclick = function(){
   
   document.getElementById("display_img").style.opacity = 0.3;
   document.getElementById("list_img").style.opacity = 0.3;
   modal.style.display = "block";
   if((submit1.onclick =function(){
   modal.style.display = "none";
   document.getElementById("display_img").style.opacity = 1;
   document.getElementById("list_img").style.opacity = 1;
   var name = document.getElementById('img-name').value;

  if(name == "" || name == null)
    {alert("name con\'t be empty") ; return false ;}

   var url = document.getElementById("img-url").value;
   if(url == "" || url == null)
    {alert("url con\'t be empty") ; return false ;}
  
   if( !validateUrl(url))
    {alert("invalid url") ; return false ;}
  var date = new Date();
  var dateValue = document.getElementById("img-date").value;
  if(dateValue == "" || dateValue == null)
    {alert('date can\'t be empty'); return false; }
  date = dateValue;
  else if(!validateDate(date))
    {alert('date can\'t be in future'); return false; }
  
  var info = document.getElementById("img-info").value;

  data.images.push({"source1": url , "name":name , "date" :date, "info" : info, "id":id});
  
  var img = new Image();
  img.src = data.images[data.images.length -1].source1;

  img.setAttribute("alt" ,data.images[data.images.length -1].name);
  img.setAttribute("id" ,data.images[data.images.length -1].id);
  
  document.getElementById("list_img").appendChild(img);
  
  
   submit1.type = 'reset';
    alert("you have added an image");

    var button = document.createElement("input");
  button.setAttribute("class", "edit");
  button.setAttribute("type" , "button");
  button.setAttribute("value", "edit");
  button.setAttribute("id", id);
  button.addEventListener("click", editImage);

  var button2 = document.createElement("input");
  button2.setAttribute("class", "delete");
  button2.setAttribute("type" , "button");
  button2.setAttribute("value", "delete");
  button2.setAttribute("id", id);
  button2.addEventListener("click", deleteClicked);

 document.getElementById("list_img").appendChild(button);
 document.getElementById("list_img").appendChild(button2);
  id++;
 }))
    return false;  
}

/*-------------------------------------------------------------------------------------------------------------------------------*/

/* ------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------VALIDATIONS FUNCTIONS-------------------------------------------------------------*/
function validateUrl(str) {
  var regex = new RegExp(/^(ftp|http|https):\/\/[^ "]+$/);
  return regex.test(str);
}
function validateDate(preDate){
  var today = new Date();
  var date = today.getFullYear()+'/'+(today.getMonth()+1)+'/'+today.getDate();
  if(date < preDate)
    return false;
  else
    return true;
}

}
/*--------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------END------------------------------------------------------------------*/
