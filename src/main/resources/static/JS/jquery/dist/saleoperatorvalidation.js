$(document).ready(function(){

	$('#addSaleOperator').submit(function(e) {       
      
        var name = $('#Name').val();
        var empid = $('#empid').val();
        var txtIdNum= $('#txtIdNum').val();
        var email_id= $('#email_id').val();
        var Address= $('#Address').val();
        var pancard= $('#pancard').val();
        var Aadhar=$('#Aadhar').val();
         $(".error").remove();
      
        
       if(name.length<1){
        $('#Name').after('<br><span class="error" style="color:red;">This Field is required</span>')
        e.preventDefault();
       }
       if(empid.length!=4){
        $('#empid').after('<br><span class="error" style="color:red;">enter the valid empid of 4 digit</span>')
        e.preventDefault();
       }
   
       
       
       if(txtIdNum.length<10){
        $('#txtIdNum').after('<br><span class="error" style="color:red;">Invalid number</span>')
        e.preventDefault();
       }
       
       
       
       if(email_id.length<1){
           $('#email_id').after('<br><span class="error" style="color:red;">This Field is required</span>')
           e.preventDefault();
          }
       
       /*else if(!validateEmail( $('#email_id').val())){
//    	   $('#email_id').after('<br><span class="error" style="color:red;">Invalid Email Format</span>')
           e.preventDefault();
       }*/
       
       
       if(Address.length<1){
           $('#Address').after('<br><span class="error" style="color:red;">This Field is required</span>')
           e.preventDefault();
          }
 
        
       if(pancard.length<1){
/*            if(!ValidatePAN()( $('#pancard').val())){
          	  // $('#email_id').after('<br><span class="error" style="color:red;">Invalid Email Format</span>')
                 e.preventDefault();
             }*/e.preventDefault();
          }
  /*   else if(!ValidatePAN()( $('#pancard').val())){
     	  // $('#email_id').after('<br><span class="error" style="color:red;">Invalid Email Format</span>')
            e.preventDefault();
        }*/
       if(Aadhar.length<12  ){
    	   $('#Aadhar').after('<br><span class="error" style="color:red;">please enter 12 digit aadhar number</span>')
    	   e.preventDefault();
          }
     
/*       if(!AllowOnlyNumbersAadhar(e)( $('#Aadhar').val())){
    	   $('#Aadhar').after('<span class="error" Style="color:red">Please Enter 12 digit Number only!!</span>')
            e.preventDefault();
        }*/
       
      
       
      });

	
	
 
	/*	$('#empid').blur(function() {
			$('.error').remove();
			if($('#empid').val().length!=4){
				$('#empid').after('<span class="error" Style="color:red">Please Enter 4 digit ID only!!</span>')
			}
		});
		 */
	 

	$('#empid').blur(function() {
		//alert($('#empid').val());
		$('.error').remove();
		$.ajax({
			type:'post',
			url : 'checkemployid',
			data : {
				empid : $('#empid').val()
			},
			success : function(result) {
		//alert(result);
				//		$('#ajaxGetUserServletResponse').text(responseText);	
				if($('#empid').val().length!=4){
					$('#empid').after('<span class="error" Style="color:red">Please Enter 4 digit ID only!!</span>')
				}
			 if(result.indexOf('true') != -1){
					$('#empid').after('<span class="error" Style="color:red">Already Present</span>')
				}
				
			}
		});
	});
	
	
	
	
	
	
	
});
function validateQuantity(evt){
    var keyCode = evt.keyCode == 0 ? evt.charCode : evt.keyCode;
    if(!(keyCode>=48 && keyCode<=57))
           {
                 evt.preventDefault();
                 return false;
           }
    return true;
}
function AllowOnlyNumbers(e) {
	$('#txtIdNum').blur(function() {
		$('.error').remove();
		if($('#txtIdNum').val().length!=10){
			$('#txtIdNum').after('<span class="error" Style="color:red">Please Enter 10 digit Number only!!</span>')
		}
	});
	 
    var charCode = e.which;
             console.log(charCode);
             if (charCode > 47 && charCode < 58 )
                 return true;
             return false;
 }

/*------------------------------------------------------------------------------------------------------------------------------------*/
function AllowOnlyNumbersAadhar(e) {
	$('#Aadhar').blur(function() {
		$('.error').remove();
		if($('#Aadhar').val().length!=12){
			$('#Aadhar').after('<span class="error" Style="color:red">Please Enter 12 digit Number only!!</span>')
		}
	});
	 
    var charCode = e.which;
             console.log(charCode);
             if (charCode > 47 && charCode < 58 )
                 return true;
             return false;
 }
/* -----------------------------------------------------------------------------------------------------------------------------------------------*/

function validateEmail(emailField){
	$('.error').remove();
   var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

   if (reg.test(emailField.value) == false) 
   {
      
       $('#email_id').after('<span class="error" Style="color:red">Invalid Email Address!!</span>')
       return false;
   }

   return true;

}

/* -----------------------------------------------------------------------------------------------------------------------------------------------*/

function checkform()
{
   var f = document.forms["theform"].elements;
   var cansubmit = true;

   for (var i = 0; i < f.length; i++) {
       if (f[i].value.length == 0) cansubmit = false;
   }
   if($('#txtIdNum').val().length!=10){
	   cansubmit = false;
   }
   if (cansubmit) {
       document.getElementById('submitbutton').disabled = false;
   }
}

/*----------------------------------------------------------------------------------------------------------------------*/
function ValidatePAN()
{
	$('.error').remove();
	 var pan_no = document.getElementById("pancard").value;
	 
	 if (pan_no!= "") {
            
		 var PanNo = pan_no;
		
            var panPattern = /^([a-zA-Z]{5})(\d{4})([a-zA-Z]{1})$/;
            if (PanNo.search(panPattern) == -1) {
                
                $('#pancard').after('<span class="error" Style="color:red">Invalid Pan No!!</span>')
                pan_no.focus();
                pan_no.value='';
                return false;
            }
          
        }
}

function CheckPassword(inputtxt) 
{ 
var passw=  /^[A-Za-z]\w{7,15}$/;
if(inputtxt.value.match(passw)) 
{ 

return true;
}
else
{ 
alert('Wrong...!')
return false;
}
}
/*----------------------------------------------------------------------------------------------------------------------------------*/

$('#Name').keypress(function (e) {
	 $('.error').remove();
   var regex = new RegExp(/^[a-zA-Z\s]+$/);
   var str = String.fromCharCode(!e.charCode ? e.which : e.charCode);
   if (regex.test(str)) {
       return true;
   }
   else {
	   $('#Name').after('<span class="error" Style="color:red">Invalid Name</span>')
       e.preventDefault();
       return false;
   }
});




