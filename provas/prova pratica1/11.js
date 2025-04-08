const elementos = [1,2,3,4,5,7,8,9,0]
console.log(elementos)
let prim= elementos[0]
let arr= (elementos.length-1)
let ult=elementos[arr]
elementos[0]= ult
elementos[arr]=prim
console.log(elementos)

