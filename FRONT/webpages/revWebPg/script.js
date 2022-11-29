console.log("inside my script.js")

let body = document.querySelector('body');

body.addEventListener('mousemove', mouseColorChange);

function mouseColorChange(eventSSS){
    console.log(eventSSS.type);
    body.style.backgroundColor = 'rgb (   ${eventSSS.offsetX}    ,   ${eventSSS.offsetY} , 40  )';
}
