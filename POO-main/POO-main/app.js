const ref = document.querySelector('.foguete')

const  foguete = {
    tamanho: "normal",
    velocidade: "normal",

    decolar: function(){
        ref.classList.add('decolar')
    },
    descer: function(){
        ref.classList.remove('decolar')
        ref.classList.add('descer')
    },
    rodar: function(){
        ref.classList.add('rodar')
    }
}

const bandasAster = 'Atreyu';


const bandasCharles = ['David Gueta', 'Alok', "Death Maul"];

const bandasUellington = ['Led Zepeling', 'The Purpple'];
const bandasLucas = ['Two Pac', 'Eminem', 'Kendrick Lamar', 'Racionis'];
const bandasMarcelo = ['Queen', 'David Bowie', 'Bon jov', 'Imagine Dragons', 'Jimmie Hendrix'];

console.log(bandasCharles[0])


const cachorro = { 
   //Atributos / Características
    nome: 'Branquinha',
    raca: 'Vira-lata Rebaixado',
    genero: "Fêmea",
    vacinas: ["raiva", "V12", "Leshi"],
    brinquedos: ['bolinha', 'osso', 'ratinho'],
    outrosGastos: [],
    //Métodos / Comportamentos
    registrarVacina: function(novaVacina) {
        this.vacinas.push(novaVacina)
    },

}
