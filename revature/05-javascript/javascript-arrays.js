
/*  ARRAYS

    What is an array?
        -a group of data entries
        -Each data entry has an index associated with it. indeces begin with (0) to (arraySize -1)

 */





// how do we declare an array?
var arrayOne= ['Billy', 'Katherine'];
// remember, JS is loosely typed
var arrayTwo= ['Billy', 'Katherine', 77, false];
//              0           1         2    3

// how do you see all the contents of an array?
// console.log(arrayTwo);



// how do you obtain the length of the array (the # of elements)?
// console.log(arrayTwo.length); // prints "4"



// how do you access elements in an array?
// console.log(arrayTwo[0]); // prints "Billy"



//what if you attempt to access an element that doesn't exist?
// console.log(arrayTwo[50]); //prints "undefined"


//how do you modifying/update elements in an array
// arrayTwo[1]= "barnacles";

//what if you attempt to update an element that doesn't exist?
// console.log(arrayTwo[9]); // prints undefined
arrayTwo[9]="does this work?";
// console.log(arrayTwo[9]); // prints "does this work?"
// console.log(arrayTwo);

//how do I dynamically remove elements from an array?
var arrayDelete = [6,8,10,12];

// console.log(arrayDelete);
// delete arrayDelete[1];
// console.log(arrayDelete);


// arrayDelete.length=2; //this is HORIFFYINGLY dangerous...it'll delete end elements sometimes




// is it possible to put an array inside of an array?
// YES you may have a 2-dimensional array
var arrayThree= [[6,false], [5,true, true], ["eat", "pray", "love"]];

// in fact, you may have as many dimensions as you'd like
var arrayFour= [[[[],[[],[]]]],[],[]]; // I won't fill in the values because it'll get messy



// Are you able to replace 2nd dimension array with a different array?
var arrayFive= ['Trevin', 'Chester', ['blue', true]];
var arraySix= [true, true, 'water'];
// console.log(arrayFive);

arrayFive[2]=arraySix; // yes, you may
// console.log(arrayFive);


/*
    JUST FOR KICKS

    Can we delete an element outside the bounds of an array?
*/

var arrayEight = ["uno", "dos", "tres"];
// console.log(arrayEight);
// delete arrayEight[10];
// console.log(arrayEight);


/*
    JUST FOR KICKS

    Can I have an array's element bee a refernce to itself?
*/
arrayEight[0]= arrayEight;
// console.log(arrayEight);

/*
    JUST FOR KICKS

    Can we have a negtive index in an array in JS?
*/

var arraySeven= ["uno", "dos", "tres"];
arraySeven[-5]= "barnacles";
arraySeven[6]= "barnacles2";
arraySeven[-1]= "barnacles3";

arraySeven[NaN]= "barnacles";
arraySeven[Infinity]= "barnacles";
arraySeven[-Infinity]= "barnacles";
arraySeven[null]= "barnacles";
arraySeven[undefined]= "barnacles";
arraySeven[NaN]= "barnaclesNaNAgain";

arraySeven["index"]= "barnacles";


arraySeven[()=>{console.log("no freakin' way");}]= "barnacles";



//let's print the indices of the array, using a enhanced for loop
for(var temp in arraySeven){
    console.log(temp);
    //yup, it prints everything
}

console.log(arraySeven);


