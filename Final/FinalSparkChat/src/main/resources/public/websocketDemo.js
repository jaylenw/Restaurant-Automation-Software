
//The commented out code is essential for everything to work
//as it corresponds to the commented code out of index.html
//commented it out to serve our purpose

//Establish the WebSocket connection and set up event handlers
var webSocket = new WebSocket("ws://" + location.hostname + ":" + location.port + "/chat/");
webSocket.onmessage = function (msg) { updateChat(msg); };
webSocket.onclose = function () { alert("WebSocket connection closed"); };
var table_num = 1; //default table number to be one

//Send message if "Send" is clicked
//id("send").addEventListener("click", function () {
//    sendMessage(id("message").value);
//});

//Update table number variable

id("table1").addEventListener("click", function () {
    table_num = 1;
});
id("table2").addEventListener("click", function () {
    table_num = 2;
});

id("table3").addEventListener("click", function () {
    table_num = 3;
});

id("table4").addEventListener("click", function () {
    table_num = 4;
});

id("table5").addEventListener("click", function () {
    table_num = 5;
});

id("table6").addEventListener("click", function () {
    table_num = 6;
});

id("table7").addEventListener("click", function () {
    table_num = 7;
});

id("table8").addEventListener("click", function () {
    table_num = 8;
});


//Send message if table condition is clicked is clicked *
id("dirty").addEventListener("click", function () {
    webSocket.send("Table " + table_num +  " is Dirty");
});

id("clean").addEventListener("click", function () {
    webSocket.send("Table " + table_num +  " is Clean");
});

id("empty").addEventListener("click", function () {
    webSocket.send("Table " + table_num +  " is Empty");
});

id("occupied").addEventListener("click", function () {
    webSocket.send("Table " + table_num +  " is Occupied");
});

//Send message if enter is pressed in the input field
//id("message").addEventListener("keypress", function (e) {
//    if (e.keyCode === 13) { sendMessage(e.target.value); }
//});

//Send a message if it's not empty, then clear the input field
//function sendMessage(message) {
//    if (message !== "") {
//        webSocket.send(message);
//        id("message").value = "";
//    }
//}

//Update the chat-panel, and the list of connected users
function updateChat(msg) {
    var data = JSON.parse(msg.data);
    insert("chat", data.userMessage);
    id("userlist").innerHTML = "";
    data.userlist.forEach(function (user) {
        insert("userlist", "<li>" + user + "</li>");
    });
}

//Helper function for inserting HTML as the first child of an element
function insert(targetId, message) {
    id(targetId).insertAdjacentHTML("afterbegin", message);
}

//Helper function for selecting element by id
function id(id) {
    return document.getElementById(id);
}
