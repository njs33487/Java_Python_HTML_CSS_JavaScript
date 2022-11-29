
///////////////////
/*
    ARRAY METHODS!
*/

let myTestArray = ["steak", "apples", "baked salmon","bbq chicken", "booze"];
// console.log(myTestArray);



/*
    POP
    removes the last element from the array, then returns the removed element
*/
// console.log(myTestArray.pop());
// console.log(myTestArray);

/*
    SHIFT
    removes the first element from the array, then returns the removed element
*/
// console.log(myTestArray.shift());
// console.log(myTestArray);


/*
    PUSH
    adds an element to the end of the array, then returns the size of the new array
*/
// console.log(myTestArray.push("carbadahydrates"));
// console.log(myTestArray);



/*
    UNSHIFT
    adds an element to the start of the array, then returns the size of the new array
*/
// console.log(myTestArray.unshift("cheese"));
// console.log(myTestArray);



/*
    SPLICE
    removes elements at a given index, optionally it then inserts new values
    into the array at a given index, then resizes the array. THEN it returns the deleted elements.

    splice( startingIndex, howManyToDelete, ...optional-elements)
*/
// console.log(myTestArray.splice(2,2, "booze aint foods"));
// console.log(myTestArray.splice(2, 3));
// console.log(myTestArray.splice(2));
// console.log(myTestArray);




/*
    SLICE
    returns a subarray based on an index provided
    (doesn't modify original array)

    slice(first index inclusive, second index exclusive)
*/
// console.log(myTestArray.slice(2));
// console.log(myTestArray.slice(2,4));

// console.log(myTestArray);








///////////////////////////////////////////////////
/*
    ITERATIVE ARRAY FUNCTIONS
*/


/*
    FOR EACH
    executes logic on each element of an array; in short, it iterates through the array to perform logic
                     
                callback function does here
                         |
                         v
    forEachArray.forEach( );
*/
let forEachArray = ["steak", "apples", "baked salmon","bbq chicken", "booze"];

forEachArray.forEach(
    //(myValue){  //you could ALSO just use one of the parameters, because JS is versatile
    (myValue, myIndex, myArray)=>{
        // console.log("current iteration's value:", myValue);
        // console.log("current iteration's index:", myIndex, myArray[myIndex]);
        // console.log("current iteration's array:", myArray);
        // console.log("---------------------END OF ITERATION---------------------")
    }
);

// console.log(forEachArray);



/*
    MAP
    creates a new array by performing a callback function on each element of the original array
    the return of the map callback function will be the new value in the same position of the new array
*/

let mapArray = [5,8,11];
let newMapArray = mapArray.map(
    (myValue, myIndex, myArray)=>{
        return myValue*10;
            //JS is loosely typed remember, the datatypes do NOT have to match
    }
);
// console.log(newMapArray); //[10, 16, 22]
// console.log(mapArray);





/*
    FILTER

    return a boolean value, anything true will appear in the new array, anything false will not

    Filter essentially asks "Can you tell me WHICH elements pass my 'test'?"
*/
let filterArray = [55, 10, 88, 15];
let newFilterArray = filterArray.filter(
    (myValue, myIndex, myArray)=>{
        //return a boolean value, anything true will appear in the new array, anything false will not
        
        return myValue>15;

        //IF you're dealing with objects in your array, then just compare the fields
        //for example:
        //  return myObj.attr1 >25;
        //  OR
        //  return myObj.attr2 === "approved"
    }
);

// console.log(newFilterArray);
// console.log(filterArray);




/*
    SOME
    searches each element  of the array to see if ANY of the elements pass a "test". If even a single
    element passes the test, then some() returns true. Else it returns false.

    note: every() is a similar method, but it needs to check to make sure EVERY element passes the "test"

    every() is similar to the "and" logical operator while some() is similar to the "or" logical operator

    Some essentially asks "does ANYONE pass the 'test'?"
*/
let someArray = [5, 8, 10, 12];
let someReturnValue = someArray.some(
    (myValue, myIndex, myArray)=>{
        //return a boolean value
        return myValue>110;
    }
);

// console.log(someReturnValue);
// console.log(someArray);




/*
    REDUCE
    The purpose of reduce is to reduce the entire array down to a single value.

    reduces will skip over the first index, and start with the second index.
    Also that first myTotal will contain the value of the first index's value (if no initial value)

*/  
let reduceArray = [10, 20, 60, 64];
let reduceReturnValue = reduceArray.reduce(
    (myTotal, myValue, myIndex, myArray)=>{
        console.log("MyIndex: ",myIndex); //it actually SKIPS the first index
        // console.log("currentTotal:", myTotal);
        return myTotal+myValue;
    }
);
// console.log(reduceReturnValue);
// console.log(reduceArray);


let reduceArrayTWO = [" The", " big", " bad", " wolf", " ",true, " ",NaN];
let reduceReturnValueTWO = reduceArrayTWO.reduce(
    (myTotal, myValue, myIndex, myArray)=>{
        return myTotal+myValue; //+"EMPTINESS";
    }
);
console.log(reduceReturnValueTWO);
console.log(reduceArrayTWO);

