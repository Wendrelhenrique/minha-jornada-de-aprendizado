const tres = [1,2,2,3,3,4,5,6,7,9,0,22,111,10,2,3,4,6,7,8,99,18,19,20,22,30,3]
let treis = 0
for(i = 0 ;i<tres.length;i++){
    if (tres[i]==3){
        treis++
    }
}
console.log("O numero de tres no array é ",treis)