const numerico1 = [1,2,2,3,3,4,5,6,7,9,0,22,111,10]
for(i = 0 ;i<numerico1.length;i++){
    if(numerico1[i]==10){console.log( "o item de index ",i," é ",10)}
    if(numerico1.indexOf(10,i)== -1){console.log("não encontrei o 10 no array")}
}

