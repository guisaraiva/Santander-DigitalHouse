window.addEventListener('load', start);

function start(){
    console.log('Página totalmente carregada...');
    showSlides();
    
}

function exibeCaractere(){
    let bookInput = document.getElementById('search_bar').value;
    console.log(bookInput);
}

/*Function carrossel*/
let index = 0;
;
function showSlides() {
    let count;
    let slides = document.getElementsByClassName("mySlides");
    for (count = 0; count < slides.length; count++) {
        slides[count].style.display = "none";
    }
    index++;
    if (index > slides.length) { 
        index = 1 
    }
    slides[index - 1].style.display = "block";
    setTimeout(showSlides, 3000);
}

let getBooks = document.getElementById("search_bar")
console.log(getBooks.value)

