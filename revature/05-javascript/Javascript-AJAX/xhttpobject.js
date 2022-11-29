
/*
    What is AJAX?

    -Asynchronous JavaScript And XML
    -It's a series of steps that will allow JS to perform tasks asynchronously
    (btw, we'll be using JSON)
    -AJAX is NOT a specific technology, there are many types of ways to do AJAX

    What is asynchronous?
    -it means "non blocking"
    -a task that can be performed concurrently with other tasks
    -it won't stop other threads from functioning at their own pace
*/


window.onload = function(){//this is essentially a callback function for the window's completion signal
    document.getElementById("pokeButton").addEventListener('click', getPoke);
    document.getElementById("pokeButton2").addEventListener('click', getPokeForm);
}


function getPokeForm(daEvent){
    daEvent.preventDefault();
    getPoke();
}

function getPoke(){
    // console.log("poke button clicked!!");

    const textField = document.getElementById("pokeText").value; //<--- .value gets the text contents

    console.log("Our text contents: ", textField);


    /*
        We're going to be using the XMLHttpRequest object (aka xhttp) to perform an AJAX request

        STEP 1: create the XMLHttpRequest Object
            this object allows us to make requests and get back data (response)
            in short, this is our data retriever object (it calls servers/apis)
    */
    let xhttp = new XMLHttpRequest();


    /*
        STEP 2: create the callback function for readyState changes

        
        READY STATES:
            The XMLHttpRequest object has serveral states we need to know about

            state 0:    not initialized
            state 1:    server connection established
            state 2:    request received
            state 3:    processing request
            state 4:    complete, request finished and response is ready
    */
   xhttp.onreadystatechange = function(){
        // console.log("readyState is changing:", xhttp.readyState);

        if(xhttp.readyState==4 && xhttp.status==200){
            console.log("readyState is 4!!! AND....status is 200 OK");

            // console.log(xhttp.responseText); //<--this is a JSON string
                //...remember JSON is a string not an object

            let pokeObj = JSON.parse(xhttp.responseText);
            console.log(pokeObj); //<---this is an actual javascript object

            //sidenote: if we want to turn a javascript object into a JSOn we can use
            //          JSON.stringify(objReference);

            ourDOMManipulationFunction(pokeObj);
        }
   }


   /*
        STEP 3: prepare connection/request details
            (readyState goes from 0 to 1 here)

            xhttp.open(httpMethod, url);
            OR
            xhttp.open(httpMethod, url, ?optional? boolean async); <-----defaults to true for the boolean
   */
                                        //          this is: template literals in action
  xhttp.open('GET', `https://pokeapi.co/api/v2/pokemon/${textField}`);
  //for your project 2 you'll do something like this:
  //xhttp.open('POST', 'http://localhost:9001/my/api/uri'); <---PLS put the "http" otherwise you'll
                                      // likely get a "CORS" error



   /*
        STEP 4: send the request, proving any body object the request needs
            (readState will go througgh the REST of thenumbers here)

        (in our case we're using a GET method, and we aren't utilizing any data in body of the request)

        example of how to send something in the body of a request

        let myRequestBodyObject = {......stuff........}

        xhttp.setRequestHeader("content-type", "application/json");

        xhttp.send(JSON.stringify(myRequestBodyObject));
   */
   let myObject= {
    "textFieldFromAbove": textField
    //I can make an object using html fields that I've extract data from
    //then I could send this using JSON.stringify() with xhttp.send()
   }

  xhttp.send();


}


function ourDOMManipulationFunction( ourObjectMadeFromAJson){
    document.getElementById("pokeName").innerText = ourObjectMadeFromAJson.name;
    document.getElementById("pokedexNumber").innerText = ourObjectMadeFromAJson.id;
    document.getElementById("pokeImage").setAttribute("src", ourObjectMadeFromAJson.sprites.front_default);
}

