const media = [1,2,2,3,3,4,5,6,7,9,0,22,111,10,2,3,4,6,7,8,99,18,19,20,22,30]
let soma=0
for(i = 0 ;i<media.length;i++){
    soma = soma+ media[i]
}
let med=(soma/media.length)
console.log("A media do array é ",med)
console.log("arrendondando ",Math.round(med))
