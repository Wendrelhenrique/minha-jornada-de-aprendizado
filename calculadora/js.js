let valores = [];
const formulasExibidas = new Set();

function adicionarValor() {
    const input = document.getElementById("display");
    const valor = parseFloat(input.value);
    if (!isNaN(valor)) {
        valores.push(valor);
        input.value = "";
        console.log("Valores:", valores);
     
    }
    return valores;
}
function limpar() {
    valores = [];
    document.getElementById("display").value = "";
    console.clear();
    console.log("Limpo");
    const resultados = document.querySelectorAll(".calculadora h3");
    resultados.forEach(r => r.remove());
}
const formulasMap = {
    adicao: "a + b + ... + n",
    subtracao: "a - b - ... - n",
    multiplicar: "a × b × ... × n",
    dividir: "a ÷ b ÷ ... ÷ n",
    porcento: "(base × porcentagem) ÷ 100",
    hipotenusa: "√(a^2 + b^2)",
    jurossimples: "J = C × i × t",
    juroscomposto: "M = C × (1 + i)^t",
    fatorial: "n! = n × (n-1) × ... × 1",
    raiz: "n√x = x^(1/n)",
    volts: "V = R × I",
    resistencia: "R = V ÷ I",
    ampers: "I = V ÷ R",
    energia: "E(J)= m(kg)·299 792 458(metros/segundo)^2",
    quadradica: "exemplo: f(x) = x^2 – 5x + 6 ==> a=1 b=(-5) c=6",
    progresaogeral: "resultado = a1 + (n - 1) r",
    progresaosoma: "resultado = ((a1+a2)*n)/2",
    progresaogeo: "resultado = a1 . q^(n-1)",
    progresaogeos: "resultado = a1*((1-q^n)/(1-q))",
};

function mostrarFormulaFundo(nomeFuncao) {
    const container = document.getElementById("fundoFormulas");

    if (formulasMap[nomeFuncao] && !formulasExibidas.has(nomeFuncao)) {
        const span = document.createElement("span");
        span.innerText = formulasMap[nomeFuncao];
        container.appendChild(span);
        formulasExibidas.add(nomeFuncao);
    }
}
function renderOnScreen(newValue) {
    const screen =   document.querySelector('.calculadora');
    console.log('hi! ', screen)
    console.log('hi! ', newValue)
    screen.innerHTML += ` <h3>R: ${newValue}    </h3> `

}
function multiplicar() {
    if (valores.length === 0) return 0;
    let resposta = (valores.reduce((produto, numero) => produto * numero, 1))
    console.log("multiplicação",resposta);
    mostrarFormulaFundo("multiplicar")
    return resposta;
}
function dividir() {
    if (valores.length === 0) return 0;
    let resposta =(valores.reduce((resultado, numero) => resultado / numero))
    console.log("divisão", resposta);
    renderOnScreen(resposta)
    mostrarFormulaFundo("dividir")
    return resposta;
}
function adicao() {
    if (valores.length === 0) return 0;
    let resposta =(valores.reduce((soma, numero) => soma + numero, 0))
    console.log(resposta);
    renderOnScreen(resposta)
    mostrarFormulaFundo("adicao")
    return resposta;
}
function subtracao() {
    if (valores.length === 0) return 0;
    let resposta =(valores.reduce((resultado, numero) => resultado - numero))
    console.log(resposta);
    renderOnScreen(resposta)
    mostrarFormulaFundo("subtracao")
    return resposta;
}
function elevar() {
    if (valores.length < 2) return 0;
    let base = valores[0];
    let expoente = valores[1];
    let resultado = 1;
    for (let i = 0; i < expoente; i++) {
        resultado *= base;
    }
    console.log("o valor elevado é",resultado);
    renderOnScreen(resultado)
    mostrarFormulaFundo("elevar")
    return resultado;
}
function raiz() {
    if (valores.length < 2) return 0;
    let radicando = valores[0];
    let indice = valores[1];
    let resposta=(Math.pow(radicando, 1 / indice))
    console.log("a raiz do seu valor é ",resposta);
    renderOnScreen(resposta)
    mostrarFormulaFundo("raiz")
    return resposta;
}
function porcento() {
    if (valores.length < 2) return 0;
    let base = valores[0];
    let porcentagem = valores[1];
    let resposta = (base * (porcentagem / 100));
    console.log("a porcentagem do seu valor é ",resposta);
    renderOnScreen(resposta)
    mostrarFormulaFundo("porcento")
    return resposta
}
function jurossimples() {
    if (valores.length < 3) return 0;
    let capital = valores[0];
    let tempo = valores[1];
    let taxa = valores[2] / 100;
    let juros = capital * tempo * taxa;
    let montante = capital + juros;
    console.log("o montante é o juros respectivamente são ", montante,juros);
    renderOnScreen(resposta)
    mostrarFormulaFundo("jurossimples")
    return { montante, juros };
}
function juroscomposto() {
    if (valores.length < 3) return 0;
    let capital = valores[0];
    let tempo = valores[1];
    let taxa = valores[2] / 100;
    let montante = capital * Math.pow(1 + taxa, tempo);
    let juros = montante - capital;
    console.log("o montante é o juros respectivamente são ",montante,juros);
    renderOnScreen(resposta)
    mostrarFormulaFundo("juroscomposto")
    return { montante, juros };
}
function fatorial() {
    if (valores.length === 0) return 1;
    let numero = valores[0];
    if (numero === 0) return 1;
    let resultado = 1;
    for (let i = 1; i <= numero; i++) {
        resultado *= i;
    }
    console.log("o fatorial é ",resultado);
    renderOnScreen(resultado)
    mostrarFormulaFundo("fatorial")
    return resultado;
}
function hipotenusa() {
    if (valores.length < 2) return 0;
    let a = valores[0];
    let b = valores[1];
    let resposta = Math.sqrt(a * a + b * b);
    console.log("a hipotenusa é ",resposta);
    renderOnScreen(resposta)
    mostrarFormulaFundo("hipotenusa")
    return resposta;
}
function volts(){
    let resposta
    resposta =(valores[0]*valores[1])
    console.log("os volts ",resposta)
    renderOnScreen(resposta)
    mostrarFormulaFundo("volts")
    return resposta;
}
function resistencia(){
    let resposta
    resposta= (valores[0]/valores[1])
    console.log("a resistencia ",resposta)
    renderOnScreen(resposta)
    mostrarFormulaFundo("resistencia")
    return resposta
}
function ampers(){
    let resposta
    resposta = (valores[0]/valores[1])
    console.log("os ampers ",resposta)
    renderOnScreen(resposta)
    mostrarFormulaFundo("ampers")
    return resposta
}
function energia(){
    let resposta
    resposta = (valores[0]*(valores[1]*valores[1]))
    console.log("A energia que compoem tal materia é ",resposta)
    renderOnScreen(resposta)
    mostrarFormulaFundo("energia")
    return resposta
}
function quadradica(){
    let resposta
    let resposta1
    let resposta2
    resposta = ((valores[1]*valores[1])-(4*valores[0]*valores[2]))
    resposta1 = (((-valores[1])+Math.sqrt(resposta))/(2*valores[0]))
    console.log("respectivamente o discriminante ,x positivo é x negativo",resposta,resposta1,resposta2)
    renderOnScreen('d',resposta," x1",resposta1," x2",resposta2)
    mostrarFormulaFundo("quadradica")
    return resposta,resposta1,resposta2
}
function progresaogeral(){
    let resposta
    resposta = (valores[0]+(valores[1]-1)*valores[2])
    console.log("O valor do seu item de numero ",valores[1]," é ",resposta)
    renderOnScreen(resposta)
    mostrarFormulaFundo("progresaogeral")
    return resposta
}
function progresaosoma(){
    let resposta
    resposta = (((valores[0]+valores[1])*valores[2])/2)
    console.log("A soma dos deus item da progresao é",resposta)
    renderOnScreen(resposta)
    mostrarFormulaFundo("progresaosoma")
    return resposta
}
function progresaogeos(){
    let resposta
    resposta = (valores[0]*((1-Math.pow(valores[1],valores[2]))/(1-valores[1])))
    console.log("A soma da progresao geometrica é",resposta)
    renderOnScreen(resposta)
    mostrarFormulaFundo("progresaogeos")
    return resposta
}
