function addproduct() {

	var number = document.getElementById("SerialNo").value;
	var container = document.getElementById("product");

	// Clear previous contents of the container
	while (container.hasChildNodes()) {
		container.removeChild(container.lastChild);
	}
	for (i = 0; i < number; i++) {
		// Append a node with a random text
		var level = document.createTextNode("Level " + (i + 1) + ":");
		container.appendChild(level);

		var input = document.createElement("input");
		input.setAttribute('size', '25');
		input.setAttribute('maxlength', '15');
		input.type = "text";
		input.name = "member" + i;
		input.placeholder = 'Product Level';
		input.id = "hvalue" + i;
		container.appendChild(input);

		if (i == number - 1) {
			var button = document.createElement("button");
			button.innerHTML = "Submit";
			container.appendChild(document.createElement("br"));
			container.appendChild(button);

		}

		container.appendChild(document.createElement("br"));

	}

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

		// console.log(array1);

		var urlString = "http://localhost:8089//product_Hy/" + valM;
		console.log(urlString);

		$.ajax({
			method: "GET",
			url: urlString
		})
			.done(function(responseJson) {

				window.location.href = "http://localhost:8089/productHierarchy";
			})
			.fail(function() {
				alert("Connection Error");
			})

		console.log(valM);
	}




}