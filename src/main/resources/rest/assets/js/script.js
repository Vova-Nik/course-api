

// fetch('http://localhost:8081/1')
//   .then((response) => {
//     return response.json();
//   })
//   .then((data) => {
//     console.log(data);
//   });


'use strict';
let element = null;
let rasp = null;


document.addEventListener("DOMContentLoaded", docReady);
function docReady(){
    let rrr = readSceduleTable();
    console.log("Running");
    element = document.querySelector(".for_script");
    element.innerHTML  = '<h2>Hi? Vovchik</h2>';

    console.log("outer rasp is ", rasp);
}


async function readSceduleTable() {
    let response = await fetch('/rest', { method: 'post', headers: { 'Content-Type': 'application/json' }, body: JSON.stringify({ action: 'read' }) });
    // console.log("response is ", response);
    rasp =  await response.json();
    console.log("response 2nd phase is ", rasp);
}
