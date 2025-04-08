const nomes =["aaaaaa","bbbbbb","ccccccccc","ddd","eeeeeeeeee"]
let nomes5 =0
for(i = 0 ;i<nomes.length;i++){
    if(nomes[i].length>=5){
        nomes5++
    console.log( "o item de numero ",i," é ",nomes[i]," é tem mais de 5 letras")
    }
}