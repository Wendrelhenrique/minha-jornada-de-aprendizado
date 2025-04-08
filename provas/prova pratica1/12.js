const numerico = [1,2,2,3,3,4,5,6,7,9,0,22,111,10,2,3,4,6,7,8,99]
const numerico2 = [1,2,2,3,3,4,5,6,7,9,0,22,111,10,2,3,4,6,7,8,99]
let tamanho = (numerico.length)
for(i = 0 ;i<numerico.length;i++){
    tamanho= tamanho-1
    numerico[i]= numerico2[tamanho]
}
console.log ("meu array era assim ",numerico2,"\né agora é assim ", numerico)
