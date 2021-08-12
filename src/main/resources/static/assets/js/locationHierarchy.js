
function addLocation() {
    // Clear previous contents of the container
    let number = document.getElementById("SerialNo").value;
    let container = document.getElementById("locationhier");
    var valM = "";

    while (container.hasChildNodes()) {
        container.removeChild(container.lastChild);
    }
    for (i = 0; i < number; i++) {
        // Append a node with a random text
        let level = document.createTextNode("Level " + (i + 1) + ":");
        container.appendChild(level);

        let input = document.createElement("input");
        input.setAttribute('size', '25');
        input.setAttribute('maxlength', '15');
        input.type = "text";
        input.name = "member" + i;
        input.id = "hvalue" + i;
        // input.setAttribute("style", "padding-left: 5rem");
        container.appendChild(input);
        container.appendChild(document.createElement("br"));

    }
    let button = document.createElement("button");
    button.innerHTML = "Submit";
    container.appendChild(button);


    button.onclick = function printValues() {

        let number = document.getElementById("SerialNo").value;

        let array1 = [];

        for (i = 0; i < number; i++) {

            // array1.length = number;
            let inputField = document.getElementById("hvalue" + i).value;
            // console.log(inputField);
            array1.push(inputField);
            // console.log(array1);
            var val1 = "";


            for (j = 0; j < number; j++) {
                val1 = val1 + array1[j] + ",";
                valM = val1;
            }
        }

        console.log(array1);
	var urlString = "http://localhost:8089//location_2/"+valM;
						console.log(urlString);
						
						$.ajax({
							method: "GET",
							url : urlString
						})
						.done(function(responseJson){
							
							window.location.href = "http://localhost:8089/locationHierarchy1";
						})
						.fail(function(){
							alert("Connection Error");
						})
					}
					

        console.log(valM);
    }


