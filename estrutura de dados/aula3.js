function precificar(espeto, hora, transporte, klm, dia, qtd, lucro) {
    return ((((espeto * qtd) + (transporte * klm) + (hora * dia)) / qtd) * lucro)
}
class espeto {
    carne;
    palito;
    carvão;
    peso;
    constructor(carne, palito, carvão, peso, tempero) {
        this.carne = carne
        this.palito = palito
        this.carvão = carvão
        this.peso = peso
        this.tempero = tempero
    }
    get preco() {
        let preco = ((this.carne * this.peso) + (this.carvão / 100) + this.palito + (this.tempero / 200))
        return preco
    }
}
class acompanhamento {
    valor;
    tipo;
    peso;
    constructor(valor, tipo, peso) {
        this.tipo = tipo
        this.peso = peso
        this.valor = valor
    }
    get preco() {
        let preco = ((this.valor / 200) * 1.1)
        return "O preço do tempero tipo ", this.tipo, "é ", preco

    }
}
class bebida {
    valor;
    tipo;
    peso;
    constructor(valor, tipo, peso) {
        this.tipo = tipo
        this.peso = peso
        this.valor = valor
    }
    get preco() {
        let preco = ((this.valor) * 1.3)
        return "O valor da bebida tipo ", this.tipo, "é com ", peso, "ml custa", preco

    }
}
let lulinha = new espeto(35, 0.50, 15, 0.2, 50)
let coquinha = new bebida(8, "gaseificada ", 375)
let bbq = new acompanhamento(40, "salgado", 3)
let precoespeto = precificar(lulinha.preco, 30, 9, 22, 8, 2000, 1.2)
console.log("O preco do espeto a minha loja é ", precoespeto, "\n O acompanhamento é", bbq, "\n a bebida é ", coquinha)