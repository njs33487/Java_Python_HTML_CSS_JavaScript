
// console.log("Separation Of Concerns ACTIVATE!!!");

/*
    

    NOW ON TO THE ACTUAL TOPIC!!!!



    What......in the blue blazes is JavaScript?
        It's a scripting/programming language origially designed to provide functionality to webpages;
        effectively making those webpages dynamic (dynamic=capable of change). It allows website clients
        to run code from THEIR MACHINES instead of always returning to the server for a new view/html page.

    
    What is a scripting language?
        It's a snippet of interpeted code that automates some functionality. A script is NOT a complete
        application/program, it's just a snippet of code. By "interpreted" I mean it's run line by line.


    
     JavaScript is read by the browser.....In Chrome JS's engine is called V8, in Firefox it's called
        spidermonkey

    
     HOWEVER.....JavaScript became EXTREMELY ppopular. Users demanded to use JavaScript outside of the browser.
    So eventually someone ripped out Chrome's v8 engine and wrapped it in a C++ shell to create
    a JS runtime environment that is outside of any browser. That name of this environment is called
    NodeJS.

    
    Features of JS:
        -loosely typed; meaning a variable can hold ANY datatype
            >var i = 0;     i="hello";      i=false;
            >In Java, variables are created like this:        int i= 15;    or    String s = "hello world";
        -it's a dynamic language; meaning you can heavily modify the structures during runtime
        -it has a JIT compiler (Just In Time)
            >js is not compiled, it is interpreted
        -originally build for DOM manipulation, but it has evolved
            >DOM = Document Object Model
            >the DOM is a virtual representation of the HTML page
        -generally, interpreted by the browser or nodejs


        I can run a JS file using:
        >using an HTML page that has a JS file linked via the script tag
        >using "node [filepath]" in the terminal
*/


/*
    What is a console.log?

    It's basically a System.out.println() for JS. It'll print the text to the
    developer tools console in the browser.
*/
// console.log("Hello World!!!");

//one other feaetures of console.log that is useful
// console.log("hello", "world", 5, "hola");


// console.log('wait a minute..are these single quotes?');
// console.log(`wait a minute..are these backtiks?`);


// console.log("Do you not even have a semicolon?") //JS won't give you a syntax error like Java would






/*

    DATA TYPES IN JAVASCRIPT

    There are primitives and reference types.
*/



/*
    PRIMITIVES IN JAVASCRIPT

    -boolean
    -number
    -string
    -null
    -undefined
    -(in the latest version of ECMAScript there are BigInt & Symbols etc)

    ECMAScript is a standardization of functionalities that scripting languages should have.
    Various versions of ECMAScript add different functionalities.
        e.g. it can be denoted like "ES6" or "ES2015" or "ECMAScript2015"



        we can use "var" in order to declare variables
*/

var num = 5.5; //number

// console.log(num);
// num="Changing the datatype on the fly?";
// console.log(num);



var numTwo; //undefined
// console.log(numTwo);

var numThree= 250_000; //you can still use underscores

var nameOne = 'Billy "The Warden"'; //String
var nameTwo = "Billy 'The Warden'"; //String
var nameThree = `With backtiks I can alternate between both ' and " with ease`;


var isApproved = false; //boolean, can be true or false



var noMansLand = undefined; //undefined
    //undefined is essentially a SYSTEM DEFINED "null value"
    //Try to think of it this way: JS uses "undefined" as an initial value for something that is "null"

var nothing = null; //null
    //null is a PROGRAMMER DEFINED "null value"


// console.log(nothing);
// var emptyVar;
// console.log(emptyVar); //system defined "null value"
// console.log("what happens when we print the return value of a void method: "+console.log());




/*
    REFERENCE TYPES IN JAVASCRIPT

    -Object
    -Array
    -Function         Function f = [memory address];
*/

/////////how do we create an object in JavaScript?
var exampleObject = { }; //this is an empty object, but it's still an object

var exampleObjectTwo = {
    "myAttr1": "myValue",
    'myAttr2': 5,
    myAttr3: 25
}; //we actually have object literals in JS


// console.log(exampleObjectTwo);
// console.log(exampleObjectTwo.myAttr1);
// console.log(exampleObjectTwo.myAttr3);

//////how do we create an array in JavaScript?
var exampleArray = [ ]; //this is an empty array, but it's still an array

var exampleArrayTwo = ["hello", "world", 5, false];

// console.log(exampleArrayTwo);
// console.log(exampleArrayTwo[1]);



//////how do we create a funtion in JavaScript?
function exampleFunction(myVarName1, myVarName2){
    console.log("In our first func:", myVarName1, myVarName2);

    // return "this is my return value";
}

// exampleFunction("hello", "clarice"); //this is how you invoke a function in JS
// console.log(exampleFunction("what does", "this function return?")); //no return statement causes
                                    // the function to return "undefined"
// console.log(exampleFunction("bicycle")); //the second argument ends up being "undefined"
// console.log(exampleFunction("bicycle", "giraffe", "mouse")); //you can even add more arguments if you want

//didn't I say....that a function was a datatype?
// console.log(exampleFunction); //but....what happens if we DON'T invoke the function and try to print it?



var exampleFunctionTwo = function myFunc(myVar1, myVar2){
    console.log("In two", myVar1, myVar2);
} //functions are now first class citizens in JS

// exampleFunctionTwo("does this", "even work?");
// console.log(exampleFunctionTwo);
//////again....functions are first class citizens
// exampleFunctionTwo(88, exampleFunction);

//I can do things like this:
// var singluarVariable = exampleFunctionTwo; 



//there is ANOTHER WAY we can create a function using what's called "Arrow Notation"
var exampleFunctionThree = (myOtherVar) => { //notice how there is NOT an automatic return with curly braces
    console.log("In our third func:", myOtherVar);
    // return 5;
}




// exampleFunctionThree("sup world");
// console.log(exampleFunctionThree()); //prints "undefined"

var exampleFunctionFour = () => 5; //notice how the 5 is automatically returned
// console.log(exampleFunctionFour()); //prints "5"

var exampleFunctionFive = () => ({"myattr1": 88, "myattr2": "helloworld"});
 //notice how it becomes strange with object literals, surround with parenthesis

//we can also create functions dynamically as arguments like we did in Java
//In Java:   methodOne( new Object());
exampleFunction(     ()=>{console.log("my dynamically created function");}      );


//////////////
//sneak peek of a JavaScript constructor
function javascriptConstructorFunction(myVar1, myVar2){
    return {
        "myAttr1": myVar1,
        "myAttr2": myVar2
    };
}

var myCreatedObject = javascriptConstructorFunction("hello", "js constructor");
// console.log(myCreatedObject);


/*
    TYPEOF operator

    -typeof returns a string that describes the datatypes of the argument it is given
*/

// console.log(typeof(num));//number
// num="hola";
// console.log(typeof(num));
// console.log(typeof(numTwo)); //undefined
// console.log(typeof(nameOne)); //string
// console.log(typeof(isApproved)); //boolean
// console.log(typeof(noMansLand)); //undefined
// console.log(typeof(nothing)); //wait....what?...it prints "Object"

// console.log(typeof(exampleObject));//object
// console.log(typeof(exampleArray));//object? wth?
// console.log(typeof(exampleFunction));//function

// console.log(exampleArray);




/*
    CONVERTING DATATYPE

    -am I able to convert one datatype to another? the answer is yes
*/
// console.log(typeof(num)); //prints number
// console.log(typeof(num.toString())); //prints string

// console.log(typeof(parseInt("555.60"))); //prints number
// console.log(parseInt("555.60"));
// console.log(parseFloat("555.60"));



/*
    STRING TYPE COERCION

    What is type coercion?
    -it's the automatic conversion of a datatype to another datatype
    -it triggers in a variety of situations
    -this is an IMPLICIT behavior

    
    (Remember the ASCII table and Precedence order table)

    https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Operator_Precedence#table

    https://www.asciitable.com/
*/

//Precedence order example
// console.log(5+10+"stuff"+9+10);
// console.log(typeof(5+10+"stuff"+9+10));

//ASCII example
// console.log("Trevin" == "trevin");
// console.log("Trevin".toLowerCase() == "trevin");
// console.log(String.fromCharCode(97));



/*
    NUMERIC PRECISION IN JAVASCRIPT
    (this failure to be hyper accurate is NOT just in JavaScript, it's in MANY languages including Java)
*/
// console.log(1.1 +1); //2.1
// console.log(1.1 + 1.3); //2.40000000000004

// var precision  = 1.1 +1.3;
// console.log(precision);
// console.log(precision.toFixed(2));





/*
    COMPARISON operators  ==  and ===

    a double equals, or comparison, checks if the two values are equal then produces a true or false
        value. It WILL allows JS to utilize type coercion during the process

    a triple equals, or strict comparison, checks if the two values are equal then produces a true or false
        value. It will NOT allow JS to utilize type coercion during this process.
*/
// console.log(5=="5"); //true
// console.log(5=="4"); //false
// console.log(5==="5"); //false





/*
    MORE ON DATATYPES IN JAVASCRIPT
*/

// console.log(6/0); //Infinity
// console.log(typeof(6/0)); //number

// console.log(-6/0); //-Infinity?
// console.log(typeof(-6/0));

// console.log(0/0); // NaN - not a number
// console.log(typeof(0/0)); //number....for real?

// console.log(undefined+5); //NaN
// console.log(NaN+2); //NaN

// console.log(Math.sqrt(-1)); //NaN

// console.log(NaN==NaN); //false
// console.log(NaN===NaN); //false
// console.log(null==null); //true

// console.log(isNaN(NaN)); //true
// console.log(Number.isNaN(NaN)); //true
// console.log(Number.isNaN("hello")); //false

console.log(isFinite(Infinity)); //false

