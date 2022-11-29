
/* FUNCTIONS

    What is a function?
    -a reusable block of code
    -it performs some service for the rest of the application

    (Note: function vs method. A method is just a function that is attached to an object)

    What is the different between an argument and a parameter?
    -parameters are used to declare WHICH variables a function/method will use.
    -arguments are the actual values passed into a function/method as it is invoked
*/





// how do I declare a function?
function myFunction(){}


//I can also give a function parameters

/**
 * This is a JS doc
 * @param {*} lePokemans 
 * @param {*} leMoveSet 
 */
var myFunctionTwo = function (lePokemans, leMoveSet){
    console.log("The objective best pokemon is: "+lePokemans);
    console.log(leMoveSet);

    // the current return type is "undefined"
    // return;
}




//how do I invoke (call) a function in JS. YOu invoke using ()

// myFunctionTwo("Starmie", "Surf & Psychic"); //second argument is "Surf & Psychic"
// myFunctionTwo("Starmie"); //second argument is "undefined"
// myFunctionTwo("Starmie", "Surf & Psychic", "Lapras"); //"Lapras" is difficult to access
                            //you technically CAN access "Lapras" you just have to
                            //jump through hoops to do so




//what is the return type of a void method?
// console.log(myFunctionTwo("Starmie", "Surf & Psychic")); //prints "undefined"


//what happens if I reference a method without parenthesis
// console.log(myFunctionTwo); //prints the function itself


function myFunctionThree(){
    //some logic

    //note: we don't NEED to declare a return type in JS
    return 5;
}

// var x = myFunctionThree();
// console.log(x);

// console.log(myFunctionThree());




///////////////////we can create default values for arguments if they are undefined/null
function defaultDemoFunction(myVar, myVarTwo=125){
    console.log("in default demo function: ", myVar, myVarTwo);
}

// defaultDemoFunction(25);
// defaultDemoFunction(88);
// defaultDemoFunction(25, 88);



////////
/*
    DETOUR: Let's talk about "hoisting"

    Essentially, JS is a two pass translator. On the first pass through of a file, JS will find all global
    declarations and create those variables/functions. On the second pass through, JS will perform your
    program's logic (like assignment, for-loops, method calls, etc).
*/

// myHoistingFunc(88); //prints "88"
// myHoistingFunc(myHoistingVar); //prints undefined
// var myHoistingVar = 50;
// myHoistingFunc(myHoistingVar); //prints 50
// myHoistingFunc(myGiraffe); //error, myGiraffe isn't declared


function myHoistingFunc(myVar){
    console.log("In my func", myVar);
}

// myHositingFuncTwo(90); //error, "myHoistingFuncTwo is not a function"

var myHositingFuncTwo = function (myVar){
    console.log("In my func two", myVar);
}

myHositingFuncTwo(90);
