const pares = [1,2,2,3,3,4,5,6,7,9,0,22,111,10,2,3,4,6,7,8,99,18,19,20,22,30,1]
let somap=0
for(i = 0 ;i<pares.length;i++){
    if (pares[i]%2 ==0){
        somap = somap+ pares[i]
    }
}
console.log("A soma dos pares é ",somap)