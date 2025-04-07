

class Usuario{
   public nome: string;
   public login: string;
   public senha: string;
   public idade: number;
   public saldo: number;
   public email: string;

    constructor(nome:string, senha:string, idade: number, saldo:number,email:string,login:string){
             this.nome = nome;
             this.login = login;
             this.senha = senha;
             this.idade = idade;
             this.saldo = saldo;
             this.email = email;
    }
    public logar(login: string, senha:string): string {
            if(this.senha === senha && this.login === login){
                    return "welcome back " + this.nome + "!";
            }else {
                return "incorect module"
            }
    }
}
const user1 = new Usuario("jonas","marcopolo",20,9000,"senha","umemailmuitopica@gmail")