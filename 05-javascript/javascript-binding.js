
console.log("in binding");


//we started with "name" instead of "shumanname" BUT...the window object already has a this.name property that is empty string
let apple = {
    "shumanname": "Apple Jupiter",
    "superpower": "Flesh Fruit"
};

let pepper = {
    "shumanname": "Pepper Jupiter",
    "superpower": "Drowsy Fist",
    "embeddedPrintState": function (){console.log("embeddedname:", this.shumanname,
                                            "\t\t\tsuperpower:", this.superpower);}
};

        //      the first argument is suddenly bound
function printState(arg1, arg2, arg3, arg4){
    console.log("args: ", arg1, arg2, arg3, arg4);
    console.log("shumannaame: ", this.shumanname, "\t\t\tsuperpower: ", this.superpower);

    // console.log(this.name); //<----referring to the window object
}



// printState();
// pepper.embeddedPrintState();

                    //         bind(thisReferenceFrame, boundParameter1, bounderParamter2, boundN...);
let applePrintState = printState.bind(apple, "BoneLance", "PoisonFruitOfTheThief");
let pepperPrintState = printState.bind(pepper, "Nightmare", "SleepCurse");

applePrintState(25, 50);
pepperPrintState(28, 56);
printState(30, 60); //<---I can still call the original


/*
    The bind() method alters the reference frame of the "this" keyword.

    Inside our printState() method the "this" keyword referred to the window object BUT when we use the
    bind() method it produces a SECONDARY method with its "this" reference frame referring to whatever
    entity you put in as an argument to the bind() method, so bind(newReferenceFrame)


    bind(thisReferenceFrame, boundParameter1, bounderParamter2, boundN...);
*/