package Controle;
import Utilidades.Data;
import java.lang.IllegalArgumentException;

public class ContaCorrente extends Conta{
    double taxaMovimentacao;
    public ContaCorrente(final int nroConta, final double monto, final Data dataApertura, final Cliente[] clientes, final double taxaMovimentacao){
        super(nroConta, monto, dataApertura, clientes);
        this.taxaMovimentacao=taxaMovimentacao;
    }
    public void fazerDeposito(double monto){
        System.out.println("taxa de: "+taxaMovimentacao);
        super.fazerDeposito(monto-taxaMovimentacao);
    }
    public void fazerSaque(double monto) throws IllegalArgumentException{
        System.out.println("Será cobrada uma taxa de: "+taxaMovimentacao+" "+"caso exista saldo suficiente");
        try {
            super.fazerSaque(monto+taxaMovimentacao);
        } catch (final IllegalArgumentException illegal) {
            throw illegal;
    }
    
}
}
    
    
     