const pontos = [0,10,4,5,6,8,9,10,15,30,2,0,3,4]
const pontos3=[]
const pares = []
const impares = []
const repetidos = []

let resposta = 0
let maiornum=pontos[0]
let menornum=pontos[0]
let medidor = 0
let imp =0
let pa= 0
let duplicatas = 0

for(let i = 0; i<pontos.length;i++){
    pontos3[i]=pontos[i] * 3
    resposta= resposta + pontos[i]
    console.log(resposta)
    if (maiornum<pontos[i]){maiornum = pontos[i]}
    if (menornum>pontos[i]){menornum = pontos[i]}
    medidor = pontos[i]
    if (medidor%2){impares[imp]=pontos[i],imp++}else{pares[pa]=pontos[i],pa++}
}

    

for (let i = 0 ;i<pontos.length;i++){
    for (let j = i+1 ;j<pontos.length;j++){
        if (pontos[i] == pontos[j]){
            repetidos[duplicatas]=pontos[i]
            duplicatas++
        }
    }
}

console.log("A media é ",resposta/pontos.length)
console.log("A rsposta final da soma do array sera ",resposta)
console.log("O maior item do array é ", maiornum)
console.log("O menor item do array é ",menornum)
console.log("O triplo do array é ", pontos3)
console.log("Os numeros pares são ", pares)
console.log("Os numeros impares são ", impares)
console.log("Os numeros repetidos são ", duplicatas)
console.log("Os numeros repetidos são ", repetidos)
