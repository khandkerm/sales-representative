var arrHead = new Array(); // array for header.
arrHead = ['Category Name', 'Item Description', 'Item Code', 'Status', 'Action'];
var check = 0;
var countFunction = 0;

function checkvalidate() {
	var el1 = document.getElementById("Category");
	var el2 = document.getElementById("Description");
	var el3 = document.getElementById("Code");

	if (el1.value && el2.value && el3.value) {
		increase();
		var number = 1;
		check++;
		addRow(number);
		if (check == 1) {
			submit();
		}
	} else {
		alert('Value is required')
		el1.setAttribute("required", "");
		el2.setAttribute("required", "");
		el3.setAttribute("required", "");
		return false;
	}
}

function increase() {
	var textBox1 = document.getElementById("productCount").value;
	x = parseInt(textBox1) + 1;
	document.getElementById("productCount").value = x;
}

function decrease() {
	var textBox1 = document.getElementById("productCount").value;
	x = textBox1 - 1;
	document.getElementById("productCount").value = x;
}


function deleteParentRow(button) {
	var rowdel = button.parentNode.parentNode;
	rowdel.parentNode.removeChild(rowdel);
	refreshPage();
}

function deleteRow(button) {
	var rowdel = button.parentNode.parentNode;
	rowdel.parentNode.removeChild(rowdel);
	// remove();
}


function addRow(n) {

	var x = n;

	countFunction++;
	var empTab = document.getElementById('empTable');
	var div = document.getElementById('cont0');

	var rowCnt = empTab.rows.length;
	var tr = empTab.insertRow(rowCnt); // TABLE ROW.
	div.appendChild(tr);
	for (var c = 0; c < arrHead.length; c++) {
		var td = document.createElement('td'); // TABLE DEFINITION.
		td = tr.insertCell(c);
		if (c == 0) {
			var values = document.getElementById("Category").value;
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.id = 'inputFieldValueA0';
			ele.setAttribute('disabled', 'true');
			ele.value = values;
			td.appendChild(ele);
		} else if (c == 1) {
			var values = document.getElementById("Description").value;
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.id = 'inputFieldValueA1';
			ele.setAttribute('disabled', 'true');
			ele.value = values;
			td.appendChild(ele);
		} else if (c == 2) {
			var values = document.getElementById("Code").value;
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.id = 'inputFieldValueA2';
			ele.setAttribute('disabled', 'true');
			ele.value = values;
			td.appendChild(ele);
		} else if (c == 3) {
			var checkbox = document.createElement('input');
			checkbox.setAttribute('type', 'checkbox');
			checkbox.setAttribute('class', 'checkboxF');
			checkbox.id = 'c1';
			td.appendChild(checkbox);
		} else {

			// ADD A BUTTON.
			var button = document.createElement('input');
			var del = document.createElement('input');
			// SET INPUT ATTRIBUTE.
			button.setAttribute('type', 'button');
			button.setAttribute('value', 'Sub');
			button.setAttribute('class', 'button2');

			del.setAttribute('type', 'button');
			del.setAttribute('value', 'Delete');
			del.setAttribute('class', 'button3');

			// ADD THE BUTTON's 'onclick' EVENT.
			button.setAttribute('onclick', 'createTable1()');

			if (countFunction == 1) {
				del.setAttribute('onclick', 'deleteParentRow(this)');
			} else if (countFunction > 1) {
				del.setAttribute('onclick', 'deleteRow(this)');
			}

			del.addEventListener('click', decrease);

			td.appendChild(button);
			td.appendChild(del);

		}
	}
	document.getElementById("productForm").reset();
}

function createTable1() {
	var empTab = document.getElementById('empTable');
	var div = document.getElementById('cont1');
	var rowCnt = empTab.rows.length; // table row count.
	var tr = empTab.insertRow(rowCnt); // the table row.
	div.appendChild(tr);

	for (var c = 0; c < arrHead.length; c++) {
		var td = document.createElement('td'); // table definition.
		td = tr.insertCell(c);
		if (c == 0) {
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.setAttribute('value', '');
			ele.id = 'inputFieldValueB0';

			td.appendChild(ele);
		} else if (c == 1) {
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.setAttribute('value', '');
			ele.id = 'inputFieldValueB1';

			td.appendChild(ele);
		} else if (c == 2) {
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.setAttribute('value', '');
			ele.id = 'inputFieldValueB2';
			td.appendChild(ele);
		} else if (c == 3) {
			var checkbox = document.createElement('input');
			checkbox.setAttribute('type', 'checkbox');
			checkbox.setAttribute('class', 'checkbox1');
			checkbox.id = 'c2';
			// console.log(checkbox);
			td.appendChild(checkbox);
		} else {
			// ADD A BUTTON.
			var button = document.createElement('input');
			var del = document.createElement('input');

			// SET INPUT ATTRIBUTE.
			button.setAttribute('type', 'button');
			button.setAttribute('value', 'Sub');
			button.setAttribute('class', 'button2');

			del.setAttribute('type', 'button');
			del.setAttribute('value', 'Delete');
			del.setAttribute('class', 'button3');

			// ADD THE BUTTON's 'onclick' EVENT.
			button.setAttribute('onclick', 'createTable2()');
			del.setAttribute('onclick', 'deleteRow(this)');

			td.appendChild(button);
			td.appendChild(del);
		}
	}
}

function createTable2() {
	var empTab = document.getElementById('empTable');
	var div = document.getElementById('cont2');
	var rowCnt = empTab.rows.length; // table row count.
	var tr = empTab.insertRow(rowCnt); // the table row.
	div.appendChild(tr);
	for (var c = 0; c < arrHead.length; c++) {
		var td = document.createElement('td'); // table definition.
		td = tr.insertCell(c);
		if (c == 0) {
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.setAttribute('value', '');
			ele.id = 'inputFieldValueC0';

			td.appendChild(ele);

		} else if (c == 1) {
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.setAttribute('value', '');
			ele.id = 'inputFieldValueC1';

			td.appendChild(ele);

		} else if (c == 2) {
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.setAttribute('value', '');
			ele.id = 'inputFieldValueC2';

			td.appendChild(ele);
		} else if (c == 3) {
			var checkbox = document.createElement('input');
			checkbox.setAttribute('type', 'checkbox');
			checkbox.setAttribute('class', 'checkbox1');
			checkbox.id = 'c3';

			td.appendChild(checkbox);
		} else {
			// ADD A BUTTON.
			var button = document.createElement('input');
			var del = document.createElement('input');
			// SET INPUT ATTRIBUTE.
			button.setAttribute('type', 'button');
			button.setAttribute('value', 'Sub');
			button.setAttribute('class', 'button2');

			del.setAttribute('type', 'button');
			del.setAttribute('value', 'Delete');
			del.setAttribute('class', 'button3');

			// ADD THE BUTTON's 'onclick' EVENT.
			button.setAttribute('onclick', 'createTable3()');
			del.setAttribute('onclick', 'deleteRow(this)');

			td.appendChild(button);
			td.appendChild(del);
		}
	}
}


function createTable3() {
	var empTab = document.getElementById('empTable');
	var div = document.getElementById('cont3');
	var rowCnt = empTab.rows.length; // table row count.
	var tr = empTab.insertRow(rowCnt); // the table row.
	div.appendChild(tr);
	for (var c = 0; c < arrHead.length; c++) {
		var td = document.createElement('td'); // table definition.
		td = tr.insertCell(c);
		if (c == 0) {
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.setAttribute('value', '');
			ele.id = 'inputFieldValueD0';

			td.appendChild(ele);

		} else if (c == 1) {
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.setAttribute('value', '');
			ele.id = 'inputFieldValueD1';

			td.appendChild(ele);

		} else if (c == 2) {
			var ele = document.createElement('input');
			ele.setAttribute('type', 'text');
			ele.setAttribute('class', 'inputFieldP');
			ele.setAttribute('value', '');
			ele.id = 'inputFieldValueD2';

			td.appendChild(ele);
		} else if (c == 3) {
			var checkbox = document.createElement('input');
			checkbox.setAttribute('type', 'checkbox');
			checkbox.setAttribute('class', 'checkbox1');
			checkbox.id = 'c4';
			// console.log(checkbox);
			td.appendChild(checkbox);
		} else {
			// ADD A delete BUTTON.
			var del = document.createElement('input');
			// SET INPUT ATTRIBUTE.
			del.setAttribute('type', 'button');
			del.setAttribute('value', 'Delete');
			del.setAttribute('class', 'button3');

			// ADD THE BUTTON's 'onclick' EVENT.
			del.setAttribute('onclick', 'deleteRow(this)');
			td.appendChild(del);
		}
	}
}

function submit() {
	var cont = document.getElementById("submitBtn");
	var submitBtn = document.createElement("button");
	submitBtn.innerHTML = "Submit";
	submitBtn.setAttribute('class', 'submitBTN');
	submitBtn.id = "remove";
	submitBtn.setAttribute('onclick', 'alertMessage()');
	// cont.appendChild(document.createElement("br"));
	submitBtn.addEventListener("click", printValues1);
	submitBtn.addEventListener("click", printValues2);
	submitBtn.addEventListener("click", printValues3);
	submitBtn.addEventListener("click", printValues4);
	cont.appendChild(submitBtn);

}

submitBtn.onclick = function alertMessage() {
	alert("data is displayed on console..!");
}



function remove() {
	var element = document.getElementById("remove");
	element.remove();
}

function refreshPage() {
	window.location.reload();
}


// data fetch

function printValues1() {
	let number = arrHead.length - 1;
	let array1 = [];
	for (i = 0; i < number; i++) {
		var n = 'inputFieldValueA' + i;
		// console.log(n);
		if (i == 3) {
			if ($('#c1').is(":checked")) {
				array1.push(1);
			} else {
				array1.push(0);
			}
		} else {
			let inputField = document.getElementById(n).value;
			array1.push(inputField);
			var val1 = "";
		}
	}
	for (j = 0; j < number; j++) {
		val1 = val1 + array1[j] + ",";
		valM = val1;
	}
	console.log(array1);
}

function printValues2() {
	let number = arrHead.length - 1;
	let array1 = [];
	for (i = 0; i < number; i++) {
		var n = 'inputFieldValueB' + i;
		// console.log(n);
		if (i == 3) {
			if ($('#c2').is(":checked")) {
				array1.push(1);
			} else {
				array1.push(0);
			}
		} else {
			let inputField = document.getElementById(n).value;
			array1.push(inputField);
			var val1 = "";
		}
	}
	for (j = 0; j < number; j++) {
		val1 = val1 + array1[j] + ",";
		valM = val1;
	}
	console.log(array1);
}

function printValues3() {
	let number = arrHead.length - 1;
	let array1 = [];
	for (i = 0; i < number; i++) {
		var n = 'inputFieldValueC' + i;
		// console.log(n);
		if (i == 3) {
			if ($('#c3').is(":checked")) {
				array1.push(1);
			} else {
				array1.push(0);
			}
		} else {
			let inputField = document.getElementById(n).value;
			array1.push(inputField);
			var val1 = "";
		}
	}
	for (j = 0; j < number; j++) {
		val1 = val1 + array1[j] + ",";
		valM = val1;
	}
	console.log(array1);
}

function printValues4() {
	let number = arrHead.length - 1;
	let array1 = [];
	for (i = 0; i < number; i++) {
		var n = 'inputFieldValueD' + i;
		// console.log(n);
		if (i == 3) {
			if ($('#c4').is(":checked")) {
				array1.push(1);
			} else {
				array1.push(0);
			}
		} else {
			let inputField = document.getElementById(n).value;
			array1.push(inputField);
			var val1 = "";
		}
	}
	for (j = 0; j < number; j++) {
		val1 = val1 + array1[j] + ",";
		valM = val1;
	}
	console.log(array1);
}