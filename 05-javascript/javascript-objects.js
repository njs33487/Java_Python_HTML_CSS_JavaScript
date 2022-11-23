
/* OBJECTS

    What is an object?
        -a model of a real world physical object
        -it has state and behavior
        -in JS, objects are key-value pairs
*/





// how do I create an object?
var objectOne = {
    // to declare a member of an object, you use key-value pairs
    // attribute: value

    name: "Danny Boy",
    'ability': 'electromagnetism',
    'official bounty': 250_000,

    // this is how you'd add a method
    doCrimeMethod: function(){
        // method logic
        console.log("inside doCrimeMethod()")
    }
}

// how do I see all the contents of the object?
console.log(objectOne);

//how do I access an attribute of an object?
// console.log(objectOne.name); //prints "Danny Boy"
// console.log(objectOne.ability); //prints "electromagnetism"
// objectOne.doCrimeMethod();

// console.log(objectOne.official bounty); //doesnt work
// console.log(objectOne.official_bounty); //doesnt work
// console.log(objectOne."official bounty"); //doesnt work
// console.log(objectOne['official bounty']); //prints 250000
// console.log(objectOne["ability"]);


/*
    How useful is objectOne["name"] syntax?

    imagine we have an object field titled "y2.k-18"
    this will NOT work:         console.log(objectOne.y2.k-18);

    this WILL work:
        var a = "y2.k-18";   <---the user could ALSO type in the field's name
        console.log(objectOne[a]);
*/



//how do I update the value of an attribute?
objectOne['official bounty'] = 280000;
// console.log(objectOne['official bounty']);

//what happens if I attempt to update an attribute that doesn't exist?
// console.log(objectOne.jobTitle); //undefined
objectOne.jobTitle = "Mob Boss";
// console.log(objectOne.jobTitle); //Mob Boss


//can I dynamically add methods to an object?
objectOne.myMethod = function () {console.log("in dynamically added method");};
// objectOne.myMethod(); //prints just fine
// console.log(objectOne);


/*
    NOTE: in the devtools console of the browser, when you look at the firstVersion of objectOne vs
        the second version of objectOne you can see there is a different in the attributes.

        HOWEVER...if you expand those objects in the browser you'll see the expanded version is
            identical. Why is this? Because the top line is the object as the time of printing
            and the expanded version is the ACTUAL CURRENT version of the object.
*/


/*
    Do you guys understand how cool this idea is?

    var myObjectThatTheUserWillPopulateIdkEvenKnowTheFieldsYet = {};

    var userInputFieldName = fadfojasiofjasasfasfdsa;
    var userInputFieldValue = asdfasfafasf;

    var myObjectThatTheUserWillPopulateIdkEvenKnowTheFieldsYet[userInputFieldName] = userInputFieldValue;
*/


//how do I dynamically remove an attribute?
delete objectOne["official bounty"];
// console.log(objectOne);

/*
    JUST FOR KICKS
*/
objectOne.newAttribute = objectOne;
console.log(objectOne);
