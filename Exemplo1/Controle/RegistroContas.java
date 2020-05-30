package Controle;
import Utilidades.Data;

public class RegistroContas {
    public static void main(String[] args) {
        Data d=new Data(07,04,2017);
        Correntista c1=new Correntista("223454","Ana");
        Correntista c2=new Correntista("4434", "Joe");
        Correntista [] correntistas=new Correntista[2];
        correntistas[0]=c1;
        correntistas[1]=c2;
        Conta conta1=new Conta(3455, 200, d, correntistas);
        System.out.println(conta1); 
        /* Reparei q quando chama pra imprimir a conta1 (objeto da classe Conta()), o método toString() é chamada dentro da classe Conta().
        Isso ocorre porque toString() é um método de superclasse e ao reproduzir esse método na classe Conta(), por polimorfismo, há a 
        substituição desse método de superclasse pelo método criado na classe. Caso não fosse criado esse método, a impressão em
        System.out.println(conta1); seria o código do objeto (resultado padrão do método toString() na superclasse).*/
        
    }
}