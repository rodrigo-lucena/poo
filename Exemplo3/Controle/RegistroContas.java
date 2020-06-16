package Controle;
import Utilidades.Data;
import java.lang.IllegalArgumentException;

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
        //System.out.println(conta1);

        conta1.fazerSaque(900);
        //System.out.println(conta1);
/*
        try {
            conta1.fazerSaque(900);
        } catch (IllegalArgumentException illegal) {
            System.out.println(illegal.getMessage());
        }
        System.out.println(conta1);
        try {
            conta1.fazerSaque(5000);
        } catch (IllegalArgumentException illegal) {
            System.out.println(illegal.getMessage());
        }
        System.out.println(conta1); 
        conta2.fazerDeposito(700);
        System.out.println(conta2);
        System.out.println(conta2.consultarSaldo());
        */
        
    }
    
}