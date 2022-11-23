
/*
    CONDITIONS!!!
*/

function myFunction(myBool){
    if(myBool){
        console.log("TRUE!!!");
    }else{
        console.log("FALSE!!!");;
    }
}

//truthy and falsey values

// myFunction(true); //printed TRUE
// myFunction(false); //printed FALSE


// myFunction(125); //true
// myFunction(-125); //true
// myFunction(0); //false
// myFunction(0.125); //true

// myFunction("My String"); // true
// myFunction("false"); //true
// myFunction(" "); //true
// myFunction(""); //false

// myFunction({"myAttr1": 5, "myAttr2": "hello"}); //true
// myFunction({"false": false}); //true
// myFunction({}); //true

// myFunction([2,4,6]); //true
// myFunction([false]); //true
// myFunction([]); //true


// myFunction(()=>{console.log("hello")}); //true
// myFunction(()=>false); //true


// myFunction(null); //false
// myFunction(undefined); //false


// myFunction(NaN); //false
// myFunction(Infinity); //true
// myFunction(-Infinity); //true

// myFunction(-0); //false

//What are the truthy values in JS?
//    Anything that isn't a falsey value

//What are the falsey values in JS?
//      false, 0 (also -0 for some reason), "", null, undefined, NaN





var myVar=0;

console.log(myVar);
console.log(!myVar);
console.log(!!myVar); //this is a way to "hardcast" a truthy/falsey value into a boolean





/*
    WHY are truthy and falsey values useful at all?
*/

if(myVar!=0) //this is what we'd have to do in java
    console.log("stuff");

if(myVar) //this is what we can do in JS
    console.log("stuff");

//or this happens in Java
// if(myObj == null)   but in JS you can just do   if(myObj)




/* Short circuiting

    T and T     =   T
    T and F     =   F
    F and T     =   F
    F and F     =   F

    T or T     =   T
    T or F     =   T
    F or T     =   T
    F or F     =   F

    shortcircuiting operators:   &&  , ||
    bitwise operators:   & , |,  ^, etc
*/
function trueFunction(){
    console.log("in true function");
    return true;
}
function falseFunction(){
    console.log("in false function");
    return false;
}

let circuitVar = false;

//if(circuitVar & falseFunction()){
if(circuitVar && falseFunction()){
    //console.log("if block");
}else{
    //console.log("else block");
}




