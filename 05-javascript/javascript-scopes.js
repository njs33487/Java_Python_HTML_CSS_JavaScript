/*
    USE STRICT
    -"use strict" is used to stop devs from declaring variables WITHOUT using "let" or "const" or "var"
    -https://www.w3schools.com/js/js_strict.asp
*/
"use strict";





/*
    SCOPES in JS

    What is a scope?
        -the memory space where a variable exists
        -it has NOTHING to do with permissions, nothing to do with access levels.

        
    What scopes does JavaScript support?
        -global scope: the variables/entities can be accessed by everything
        -function scope: only accessible withing the specific function it is declared
        -block scope: only accessible within the block it is declared ( like while loops)

    
    
    HOw do I declare a variable in JS?
        -var    only supports the "global" and "function" scopes
                also, var WILL allow you to redeclare this variable
                //WILL go to the window object
        -let    supports all 3 scopes; "global", "function", AND "block"
                also, let will NOT allow you to redeclare this variable
                //also won't go to the window object
        -const  same as "let" BUT it makes the value immutable
*/


// var myGlobalScope = 'global scope var';
let myGlobalScope = 'global scope var';

function scopeFunction(){
    // var myFunctionScope = 'function scope var';
    let myFunctionScope = 'function scope var';

    // console.log(myGlobalScope); //I CAN access this variable from the function scope
    // console.log(myFunctionScope); //I CAN access this variable from the function scope

    if(true){
        // var myBlockScope = 'block scope var';
        let myBlockScope = 'block scope var';

        // myVariableWithoutVarOrLetOrConst = "randomVar";

        // console.log(myGlobalScope); //I CAN access this variable from the block scope
        // console.log(myFunctionScope); //I CAN access this variable from the block scope
        // console.log(myBlockScope); //I CAN access this variable from the block scope

        // console.log(myVariableWithoutVarOrLetOrConst);
    }

    // console.log(myBlockScope);//I CAN access this variable from the function scope
        //BUT...I'm not supposed to be able to...so why?
        //(after the "var" vs "let" change it no longer works...*phew*)

    // console.log(myVariableWithoutVarOrLetOrConst);
}


////GLOBAL SCOPE HERE

// console.log(myVariableWithoutVarOrLetOrConst); //error, "myVariableWithout...not defined"

scopeFunction();

// console.log(myVariableWithoutVarOrLetOrConst); //works just fine...what the heck?

// console.log(myGlobalScope); //I CAN access this variable from the global scope
// console.log(myFunctionScope); //I CANNOT access this variable from the global scope
// console.log(myBlockScope); //I CANNOT access this variable from the global scope






/*
    IS MAKING EVERY VARIABLE GLOBAL A GOOD PRACTICE?

    Try to organize your global variables into a single object if possible
*/

let mySPECIFICGlobalObject = {
    //dynamically add global variables to a single object for organizational reasons
    myAttribute : "my value"
}

function globalStateCreater(){
    mySPECIFICGlobalObject.newAttribute = "new value";
}

//to access out global members later, we can do:
// console.log(mySPECIFICGlobalObject.newAttribute);//<---what does this look like?





/*
    VARIABLES WITH THE SAME NAME (but different scope)

    -variables in a higherscope will be shadowed, meaning they are more difficult to access.
    -using the varaiable name will access the "most immediate" scope's version of the variable
*/
let myVariable = "Barnacles";

function myFunc(myVariable){ //<-----this function creates a variable
    //        called "myVariable" regardless of any other scope
    console.log(myVariable); //why doesn't this print barnacles?
}

// myFunc("invoked value"); //step 1: prints "invoked valued"
// console.log(myVariable); //step 2: prints "barnacles"






/*
    VARIABLES WITH THE SAME NAME AND THE SAME SCOPE
*/

function sameNameFunc(){
    console.log("1st func");
}

function sameNameFunc(){
    console.log("2nd func");
}


// sameNameFunc();//in short, the first function is overridden

/*
    But....does JavaScript ACTUALLY have overriding?

    To summarize the reason why this happens, the "sameNameFunc" is a variable stored in the window object.
    And when we create a second variable with that name, we're simply reassigning the value of that variable.
    Remember, functions ARE variables in JS.

    So in JavaScript it's not overriding, it's overwriting (aka reassignment).
*/


// console.log(window);
// console.log(self);
// window.sameNameFunc();




/*
    DOES OVERLOADING EXIST IN JS?
*/

function overloadFunc(){ //<---this function is overridden, so it no longer exists
    console.log("1st overfunc");
}

function overloadFunc(myVar, myVar2=12){

    console.log("2nd overfunc", myVar);
}

// overloadFunc();
// overloadFunc(5);



/*
    Can we redeclare variables in the same scope?
*/

var var1;
var var1; //it's totally okay with redeclaring a "var" variable

// let var2;
// let var2; //it's NOT okay with redeclaring a "let" variable

// var var3;
// let var3; //it's NOT okay with redeclaring if "let" is involved at all

// let var4;
// var var4; //it's NOT okay with redeclaring if "let" is involved at all

