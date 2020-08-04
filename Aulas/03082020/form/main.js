const formulario = document.forms[0];
const dados = formulario.elements[0];

formulario.elements[0].onfocus =  function() {
    console.log('Focus');
};
formulario.elements[0].onblur =  function() {
    console.log('Blur');
};
formulario.elements[0].onchange =  function() {
    console.log('Change');
};
formulario.elements[0].oninput =  function() {
    console.log('input');
};

/* formulario.elements[0].value = "Guilherme Silva Saraiva";
formulario.elements[1].value = "guilhermesilva93@hotmail.com";
formulario.elements[2].value = "12345"; */

formulario.onsubmit = function(event)
{
   // event.preventDefault();
    const element = formulario.elements[3].options[formulario.elements[3].selectedIndex].value;
    console.log(element)
}

console.log(formulario)