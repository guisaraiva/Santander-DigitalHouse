let search_bar = null;
let search_button = null;
let conteudo = '';
let listBooks ;

let acervo = document.querySelector('.showcase');

window.addEventListener('load', ()=>{
    showSlides();
    //renderAllBooks();
    mapElements();
    addEvents();
})

listBooks = books.map(({titulo, sinopse, autor}) =>{
    return {
        titulo: titulo,
        tituloLowerCase: titulo.toLowerCase(),
        sinopse,
        autor,
    }
}).sort((a,b)=> {
    return a.titulo.localeCompare(b.titulo);
});


function renderAllBooks () {

    listBooks.forEach(book => {
        conteudo += 
        `<div class="card">
            <img class = "formated_img" 
            src="https://cdn.pixabay.com/photo/2017/10/29/11/33/fantasy-2899517_960_720.jpg">
            <div class="overlay">
            <h2>${book.titulo}</h2>
            <p>${book.sinopse}</p>
            </div>
        </div>`
});
    acervo.innerHTML = conteudo;

}




/* --------------------Function carrossel ----------------------*/
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

/** ----------------------------------------------------------- */

function mapElements(){
    search_bar = document.querySelector('#search_bar');
    search_button = document.querySelector('#search_button');

};


function addEvents(){
    search_bar.addEventListener('keyup', handleKeyup);
}

function handleKeyup (event) {
    const currentKey = event.key;

    if ( currentKey !== 'Enter'){
        acervo.innerHTML='';
        return;
    }

    const filterText = event.target.value;
   
    if( filterText.trim() !== ''){
        filterBooks(filterText);
    }

}

function filterBooks(filterText) {

    const filteredLowerCase = filterText.toLowerCase();

    const filteredBooks = listBooks.filter((book) =>{
        return book.tituloLowerCase.includes(filteredLowerCase);
    });

    //console.log(filteredBooks)
    renderBooks(filteredBooks);
}

function renderBooks(result){
    let x ;
    
    for(x = 0; x < result.length; x++){
        conteudo += 
        `<div class="card">
            <img class = "formated_img" 
            src="https://cdn.pixabay.com/photo/2017/10/29/11/33/fantasy-2899517_960_720.jpg">
            <div class="overlay">
            <h2>${result[x].titulo}</h2>
            <p>${result[x].sinopse}</p>
            </div>
        </div>`
    }
    acervo.innerHTML = conteudo;


}