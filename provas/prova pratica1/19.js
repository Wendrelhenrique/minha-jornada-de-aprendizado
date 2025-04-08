const maior = [1,2,2,3,3,4,5,6,7,9,0,22,111,10,2,3,4,6,7,8,99,18,19,20,22,30]
let somadedois=0
for(i = 0 ;i<(maior.length-1);i++){
    somadedois = maior[i] + maior[i+1]
   console.log("O soma do indice atual com o proximo numero é ",somadedois)
}
