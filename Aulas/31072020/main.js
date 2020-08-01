let h1 = document.getElementById("titulo");
//h1.style.display = 'none';
//console.log(h1.hasAttribute('class'));
const body = document.querySelector('body');
const vermelhos = document.querySelectorAll('.vermelho');

//h1.setAttribute('class',  'vermelho');
/* h1.onclick = function (){
    //alert('Aparece aqui !!');
    vermelhos[0].style.marginLeft = "30px";
}; */

h1.addEventListener("click", function(){
    console.log("Clicou aqui!")
})
//console.log(h1.hasAttribute('class'));
//vermelho.style.color = 'red';

vermelhos.forEach(vermelho => {
    vermelho.style.color = 'red';
});

const btn = document.createElement("button");
const text = document.createTextNode("Clique Aqui");

btn.appendChild(text);
body.appendChild(btn);
