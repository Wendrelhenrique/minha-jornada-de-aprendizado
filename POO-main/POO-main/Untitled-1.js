
const ref =  document.querySelector('.foguete')



const fogueteObj = {
    
    tamanho: 'normal',
   
    decolar: function() {
        
        ref.classList.add('decolar')
        console.log(ref)
    },
    rodar: function(){
        ref.classList.add('rodar')
    }
   
}