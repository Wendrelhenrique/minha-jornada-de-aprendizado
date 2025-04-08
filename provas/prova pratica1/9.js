const numerico = [1,2,2,3,3,4,5,6,7,9,0,22,111,10]
for(i = 0 ;i<numerico.length;i++){
    if(numerico[i]==7){
    console.log( "o item de index ",i," é ",7)}

}
if(numerico.indexOf(7) != -1){
    console.log("toma esse array tem esse numero é ele está na posição ",numerico.indexOf(7));
    }else{
console.log ("não tem o numero procurado")
    }