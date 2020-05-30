package Controle;
import Utilidades.Data;

public class RegistroContas {
    public static void main(String[] args) {
        Data d1=new Data(07,04,2017);
        Data d2=new Data(15,05,2017);
        Cliente c11=new Cliente("223454","Ana");
        Cliente c12=new Cliente("4434", "Joe");
        Cliente c2=new Cliente("4435", "Mario");
        Cliente [] listaClientes1=new Cliente[2];
        listaClientes1[0]=c11;
        listaClientes1[1]=c12;
        Cliente [] listaClientes2=new Cliente[1];
        listaClientes2[0]=c2;
        Conta conta1=new ContaCorrente(12345, 100, d1, listaClientes1, 0.15);
        Conta conta2=new ContaPoupanca(4578, 2000, d2, listaClientes2);

        conta1.fazerDeposito(800);
        System.out.println(conta1);

        if(conta1.fazerSaque(900)==true){
            System.out.println("Saque realizado");
        }
        else{
            System.out.println("Saque não realizado");
        }
        System.out.println(conta1); 
        conta2.fazerDeposito(700);
        System.out.println(conta2);
        System.out.println(conta2.consultarSaldo());
        /* Reparei q quando chama pra imprimir a conta1 (objeto da classe Conta()), o método toString() é chamada dentro da classe Conta().
        Isso ocorre porque toString() é um método de superclasse e ao reproduzir esse método na classe Conta(), por polimorfismo, há a 
        substituição desse método de superclasse pelo método criado na classe. Caso não fosse criado esse método, a impressão em
        System.out.println(conta1); seria o código do objeto (resultado padrão do método toString() na superclasse).*/
        
    }
    
}