/* STRINGS

    What is a string?
        -a primitive datatype in JS
        -it represents a series of characters
*/





// how do I create a string?
var name= 'Billy "The Warden"';
var name2= "Aster 'The Raver'";

var name3= "Aster \"The Raver\"";
//tangent: escape characters
//   \n    \t     \'     \"    \\      \b



/*
    COMPLEX STRINGS

    backtiks aka template literals
        will evaluate an expression with ${}

    template literals came to us in ECMAScript6 aka ES6 aka ES2015

     ECMAScript is a standardization of functionalities that scripting languages should have.
    Various versions of ECMAScript add different functionalities.
        e.g. it can be denoted like "ES6" or "ES2015" or "ECMAScript2015"
    
*/

var tempNum = 25;
var longString = "Printing longsttring: "+tempNum +
    " and now that we have that....there's more "+
    " and look at this...even more"+
    " a little more \n" +
    " is anyone"+tempNum+" annoyed yet? ${tempNum}";

console.log(longString);
console.log("\n\n\n");


var longStringTwo = `Printing longStringTwo: ${tempNum}
    and now that we have that...there's more ${tempNum+"apples"}
    
    and more ${tempNum+18}
            and even more is 
                this less annoying?`;

console.log(longStringTwo);



////////////////////String Immutability
var myString= "Hello World";

console.log("size of string", myString.length);

myString.concat(" Again");
console.log(myString); //prints "Hello World"

var myString2 = myString.concat(" Again");
// console.log(myString); //prints "Hello World"
console.log(myString2); //prints "Hello World Again"




