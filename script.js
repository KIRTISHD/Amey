$(document).ready(function(){

    var myList = [];
    var mySelect = $('#cars');

    $.getJSON('http://localhost:3000/names', function(data) { 
        const dataNum = data.length;
        
        $.each(data, function(index, value) {
            mySelect.append(
                $('<option></option>').val(value).html(value)
            );
            if (dataNum-1 === index)
            {
                loadMultiselect();
            }
        });
    }); 

    function loadMultiselect()
    {
        mySelect.multiselect({includeSelectAllOption: true,
            onChange: function() {
                console.log($('#cars').val());
                myList = $('#cars').val()
                console.log("This is mylist-" + myList);
            }
        }); 
    }
  });