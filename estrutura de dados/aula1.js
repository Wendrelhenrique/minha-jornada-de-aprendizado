const personagem=[]
const digivice=[]
const estatisticas=[]

const Factoryloop = (personage,estatistica) =>{
    return{
        nome : personage,
        status : estatistica
    }
}

for(let i=0;i < 10; i++){
    var stats = Math.floor(Math.random()*256)
    personagem[i]= i
    estatisticas[i]= stats
    digivice[i]=Factoryloop(personagem[i],estatisticas[i])
}
console.log (digivice)