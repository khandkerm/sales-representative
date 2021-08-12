function addLevel() {
    // Number of inputs to create
    var number = document.getElementById("hvalue").value;
    // Container <div> where dynamic content will be placed
    var container = document.getElementById("location");
    // Clear previous contents of the container
    while (container.hasChildNodes()) {
        container.removeChild(container.lastChild);
    }
    for (i = 0; i < number; i++) {
        // Append a node with a random text
        container.appendChild(document.createTextNode("Level " + (i + 1) + ": "));
        // Create an <input> element, set its type and name attributes
        var input = document.createElement("input");
        input.type = "text";
        input.name = "hvalue" + i;
        input.se
        container.appendChild(input);

        if (i == number - 1) {
            button = container.appendChild(document.createElement("button"));
            button.innerHTML = "Done";
            button.setAttribute('class', 'button1');
            container.appendChild(document.createElement("br"));
        }
        // Append a line break 
        container.appendChild(document.createElement("br"));
    }

}