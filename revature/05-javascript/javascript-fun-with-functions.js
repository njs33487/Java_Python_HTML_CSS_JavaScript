


/*
    ARROW NOTATION (function shorthand notation)

    (a,b) => a+b;       //this will return a+b IMMEDIATELY (automatic/implicit return value)
    OR
    (a,b) => {a+b; console.log(a+b);} //no implicit return value
    OR
    a => {console.log(a);} //no implicit return
    OR
    () => {console.log("stuff");} //no implicit return
*/
let arrowExample = numba =>{
    console.log("numba "+ numba);
    console.log("Abigail");
}

// arrowExample(5);
// console.log(arrowExample(5));


let arrowExampleTwo = (param1, param2) => param1+param2;
// console.log(arrowExampleTwo(50,77));












/*
    ANONYMOUS FUNCTION

    What is an anonymous function?
    a function without a name
*/

let funcHolder = function(){
    console.log("in anonymous function");
}

let funcHolderTwo = funcHolder;

// funcHolder();
// funcHolderTwo();


//more with anonymous functions
function funcWithAName(noName){
    // noName();
    // noName();
    // noName();
}

funcWithAName(
    function() {console.log("this anonymous function can't be called after this invocation");}  
);

// funcWithAName(5); //will give an error in this scenario because 5 is not a function












/*
    CALLBACK FUNCTION

    What is a callback function?
    -it's a function that is passed as an argument to another function to be run at a later point in
        time.'
    -this concept can be used to control the ORDER of functions being called, AND create modular followup
        logic.
    =basically, using callback functions are used to chain functions and control the order in which they are called

*/

function myCallbackFunction(myParam){
    console.log("Inside of the callback function: ", myParam);
}

function myCallingFunction(applepie){
    console.log("About to trigger the callback function");
    applepie(15);
    console.log("Done triggering the callback function");
}


// myCallingFunction(myCallbackFunction);
// myCallingFunction( (myVar) => {console.log("on the fly, I have an anonymous function: ", myVar);});

///////////possible callback function usecase

////with the concept of callback functions
function generalButtonClickHandler(yourSpecificLogic){
    //step1: monitor whether or not they've clicked the mouse

    //step2: NOW check to see if the coordinates of the mouse is over the button on screen

    //step3: make a click sound effect

    //step4: PERFORM THE LOGIC
        yourSpecificLogic();
}

// generalButtonClickHandler(customFunctionGoesHere1);
// generalButtonClickHandler(customFunctionGoesHere2);
// generalButtonClickHandler(customFunctionGoesHere3);

////without the concept of callback functions
function firstButtonClickHandler(){
    //step1: monitor whether or not they've clicked the mouse

    //step2: NOW check to see if the coordinates of the mouse is over the button on screen

    //step3: make a click sound effect

    //step4: PERFORM THE LOGIC
        //logic ONE
}
function nthButtonClickHandler(){
    //step1: monitor whether or not they've clicked the mouse

    //step2: NOW check to see if the coordinates of the mouse is over the button on screen

    //step3: make a click sound effect

    //step4: PERFORM THE LOGIC
        //logic N
}









/*
    SELF-INVOKING FUNCTION

    What is a self-invoking function? Or to ask it another way "What is an IIFE"?
        -Immediately Invoked Function Expression (aka Self-invoking function)
    
    An IIFE is a function that calls itself
*/


// function (){
//     //this will lead to a syntax error because there is no way to invoke
//     // this anonymous fucntion. HOWEVER....what if it called itself? 
// }


(function (){
    // console.log("In my self-invoking function");
})();

(function(myVar1,myVar2){
    // console.log("In my self-invoking function:", myVar1, myVar2);
})("hello", 25);


//IIFEs are similar to initializer blocks in Java.
//IIFEs are a single function invocation, in that they will trigger once and only once










/*
    NESTED FUNCTION

    What is a nested function?
        a function inside another function
*/
function outerFunction(){
    let firstVar = 7;

    function innerFunction(){
        let secondVar = 15;

        console.log("innerFunction()", ++firstVar, ++secondVar);
    }

    innerFunction();
}


// innerFunction(); //syntax error
// outerFunction.innerFunction();//syntax error
// console.log(firstVar); //runtime error

// outerFunction(); //prints 8 and 16
// outerFunction(); //prints 8 and 16
// outerFunction(); //prints 8 and 16
// outerFunction(); //prints 8 and 16








/*
    CLOSURES
    -Closure is a way to create encapsulation in JS
    -A closure itself is a self invoking anonymous function that returns an inner function
*/

let foo = (function(){
    console.log("In the outer function");
    let bar=0;

    return function(){
        console.log("In the inner function");
        return ++bar;
    }
})();



// console.log(foo); //prints a function definition
// console.log(bar); //runtime error

// console.log(foo()); //1
// console.log(foo()); //2
// console.log(foo()); //3
// console.log(foo()); //4


//////MORE ON CLOSURES OBJECT
let moreOnClosureObject = (function(){
    let encapsulationVariable = 500;

    return {
        myIncrementor: function(){encapsulationVariable++;},
        myGetter: function(){return encapsulationVariable;},
        mySetter: function(setterValue){encapsulationVariable=setterValue;}
    };
})();

// console.log(moreOnClosureObject.myGetter());
// moreOnClosureObject.myIncrementor();
// moreOnClosureObject.myIncrementor();
// moreOnClosureObject.myIncrementor();
// console.log(moreOnClosureObject.myGetter());
// moreOnClosureObject.mySetter(1024);
// console.log(moreOnClosureObject.myGetter());


////////MORE ON CLOSURES ARRAY
let moreOnClosureArray = (function(){
    let encapsulationVariable = 0;

    return [
        function myIncrementor(){encapsulationVariable++;}, //index 0
        function myGetter(){return encapsulationVariable;}, //index 1
        function mySetter(setterValue){encapsulationVariable=setterValue;}, //index 2
    ];
})();


console.log(moreOnClosureArray[1]());

moreOnClosureArray[0]();
moreOnClosureArray[0]();
moreOnClosureArray[0]();

console.log(moreOnClosureArray[1]());

moreOnClosureArray[2](88);
console.log(moreOnClosureArray[1]());
