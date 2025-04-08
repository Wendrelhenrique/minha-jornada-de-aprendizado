const idades = [1,2,2,3,3,4,5,6,7,9,0,22,111,10,2,3,4,6,7,8,99,18,19,20,22,30]
const maiordeidade =[]
let r=0
for(i = 0 ;i<idades.length;i++){
    if (idades[i]>17){
        maiordeidade[r]=idades[i]
        r++
        console.log("o indice ",i," é maior de idade ","é tem ",idades[i])
    }
}