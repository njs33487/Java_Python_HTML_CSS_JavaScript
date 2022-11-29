

// console.log("separation of concerns activate!!!");




/*
    What is the DOM?
    -Document Object Model
    -The DOM is a virtual representation of the HTML page
*/

// console.log(document);
// console.log(document.URL);
// console.log(document.title);
// console.log(document.all);
// console.log(document.links);
// console.log(document.images);
// console.log(document.forms);


/*
    even though this WILL work...it isn't a stable solution. What happens if a coworker
    adds an html element between index 4 and 5?
*/
// document.all[13].innerText = "Wait....paragraphs have mailmen?";





/*
    GET ELEMENT BY ID
*/

let para = document.getElementById("para2");

// console.log(para);

//if you put HTML tags in your string then innerText will display the tags as text
// para.innerText = "Things are going <b>HORRIBLY</b> WRONG!!!";


//if you put HTML tags in your string then innerHTML will actually execute the HTML
    //  syntax. Note, subject to HTML injection
// para.innerHTML = "Okay...I <b>think</b> the issue has been resolved...for now...";



/*
    GET BY CLASSNAME
*/
let headers = document.getElementsByClassName("headers");
// console.log(headers);

for(let i=0; i<headers.length; i++){
    // headers[i].innerText= "ice cream";
    // headers[i].style.fontWeight = "normal";
}




/*
    GET BY TAGNAME
*/
//document.getElementsByTagName("");
//basically, the same as elements by classname




////////////////QUERY SELECTOR///////////////////
//you can utilize a pattern similar to CSS selectors (tagname, ".", or "#")

let selection = document.querySelector("#para2");
// console.log(selection);
// selection.innerText = "blahblahblah";

// let selection2 = document.querySelector(".para");
let selection2 = document.querySelectorAll(".para");
// console.log(selection2);

let selection3 = document.querySelectorAll("p");
// console.log(selection3);



/*
    more with query selectors

    query selectors have some more complex queries that you can run
    for example, stuff like:     last-child, first-child, nth-child(n)
*/
let selection4 = document.querySelector('.para:nth-child(2)');
// selection4.innerText = "nth child"; //turns out, it doesn't start at index 0



/*
    WE HAVE EVEN MORE TOOLS TO NAVIGATE THROUGH THE DOM IF NECESSARY:

    You can also do things like:

    .parentNode / .parentElement
    .childNodes / .childElements
    .firstChild / .lastChild
    .firstChildElement / .lastChildElement

    also, next and previous siblings...and the list goes on....

    In short, these are ways to navigate through the DOM relative to your current position

    example syntax:     selection.parentElement

*/




/////note: so far we've only seen the R and U of CRUD...let's look at the C next

//////////////////////////////////CREATING ELEMENTS DYNAMICALLY////////////////////

//Step 1: creating our new element
let newDiv = document.createElement("div");

//Step 2: populate our new element with attributes...and stuff
newDiv.id = "newest div";
newDiv.setAttribute("title", "new div, who dis?");
newDiv.setAttribute("class", "fresh and clean");

//Step 3: create a text node, then append to our new div element
let divText = document.createTextNode("new text node information");
newDiv.appendChild(divText);

//Step 4: appending our new div element onto an existing element that is currently being displayed
let newSelection = document.querySelector("#para1");
newSelection.appendChild(newDiv);
    //there are also functions available like "insertBefore" and "insertAfter"

console.log(newDiv);



//we can ALSO delete elements from the DOM
//////////removeAttribute, removeChild, remove


/*
    Change google's logo

    let selection = document.getElementsByClassName("lnXdpd");
    let mySelection = selection[0];
    mySelection.removeAttribute("srcset");
    mySelection.src="https://variety.com/wp-content/uploads/2020/08/static-shock.jpg?w=1024"

*/




/*
    WARNING!!!!

    Make sure that you have your script tag at the bottom of your HTML file, because
    trying to "getElementById" on an element that hasn't loaded yet will return null
*/

