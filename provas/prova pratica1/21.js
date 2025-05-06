function crescente (nume){
    let num=nume
for ( i = 0; i < num.length - 1; i++) {
     for ( j = 0; j < num.length - 1 - i; j++) {
     if (num[j] > num[j + 1]) {
    let atual = num[j];
     num[j] = num[j + 1];
    num[j + 1] = atual;
   } 
 }
}
return num
}

 function decrecente(nume){
    let num= nume
    for ( i = 0; i < num.length - 1; i++) {
         for ( j = 0; j < num.length - 1 - i; j++) {
         if (num[j] < num[j + 1]) {
        let atual = num[j];
         num[j] = num[j + 1];
        num[j + 1] = atual;
       }
     }
    }
    return num
}
    const media = [1,2,2,3,3,4,5,6,7,9,0,22,111,10,2,3,4,6,7,8,99,18,19,20,22,30]
     console.log(decrecente(media))
     console.log(crescente(media))