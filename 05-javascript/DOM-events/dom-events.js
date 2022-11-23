// console.log("SEPARATION OF CONCERNS ACTIVATE!!!");


function myButtonClickedFunc(){
    console.log("Button Clicked!!! We're inside of the JS file!");
}







/*
    DYNAMICALLY created events
*/
let myButton = document.getElementById('daButton');
// console.log(myButton);

//      .addEventListener(eventString, callbackFunction, ?optional? capturingBoolean)
myButton.addEventListener('click', myEventCallbackFunction); //<---notice there are no ()


function myEventCallbackFunction(mySpecificEventObject){
    console.log("In the event callback function!!!");

    // console.log(mySpecificEventObject);
    // console.log(mySpecificEventObject.ctrlKey);
    // console.log("client-y",mySpecificEventObject.clientY);
    // console.log("client-x",mySpecificEventObject.clientX);
    // console.log("offset-y",mySpecificEventObject.offsetY);
    // console.log("offset-x",mySpecificEventObject.offsetX);
}






/*
    DYNAMIC BUTTON TWO
*/
let myButtonTwo = document.getElementById("daButtonTwo");

myButtonTwo.addEventListener('click', (eve)=>{console.log("arrow notation event fuction");});






/*
    Remember, that events can be added to ANY html element, not just buttons.
    You could add a click event to a picture if you'd like...but clicking a button
    is often more intuitive than clicking a picture.


    THERE ARE MANY TYPES OF EVENTS IN JS:

    onsubmit, onchange, click, dblclick, mouseup, mousedown, mouseenter,
    mouseleave, mouseout, mouseover, mousemove, and more

    (mouseover includes children elements, mouseenter doesn't)
    (same with mouseout and mouseleave respectively)

    there is also:
    keyup, keydown, keypress, cut, paste, change(statechange), submit, etc
*/










//demo of slightly more complex event
let body = document.querySelector('body');

body.addEventListener('mousemove', myComplexFunc);

function myComplexFunc(eventSSS){
    console.log(eventSSS.type);
    body.style.backgroundColor = `rgb(${eventSSS.offsetX}, ${eventSSS.offsetY}, 40)`;
}


