var fname,lname,email;
function getValues(e) {
    e.preventDefault();
  fname=document.getElementById("fname").value;
  lname=document.getElementById("lname").value;
   email=document.getElementById("email").value;
  
   console.log(fname);
   //window.location.href="register.html?fname="+fname+'&lname='+lname+'&email='+email;
   
}

function display(){
    const query=window.location.search;
    const param=new URLSearchParams(query);
    const rfname=param.get('fname');
    const rlname=param.get('lname');
    const remail=param.get('email');
    document.getElementById("recipient-name").value=rfname;
    document.getElementById("message-text").value=rlname;
    document.getElementById("remail").value=remail;
}