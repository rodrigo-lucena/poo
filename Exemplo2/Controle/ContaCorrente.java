package Controle;
import Utilidades.Data;

public class ContaCorrente extends Conta{
    double taxaMovimentacao;
    public ContaCorrente(int nroConta, double monto, Data dataApertura, Cliente[] clientes, double taxaMovimentacao){
        super(nroConta, monto, dataApertura, clientes);
        this.taxaMovimentacao=taxaMovimentacao;
    }
    public boolean fazerDeposito(double monto){
        System.out.println("taxa de: "+taxaMovimentacao);
        return super.fazerDeposito(monto-taxaMovimentacao);
    }
    public boolean fazerSaque(double monto){
        System.out.println("taxa de: "+taxaMovimentacao);
        return super.fazerSaque(monto+taxaMovimentacao);
    }
    
}