package Controle;
import Utilidades.Data;
public class ContaPoupanca extends Conta{
    public ContaPoupanca(int nroConta, double monto, Data dataApertura, Cliente[] clientes){
        super(nroConta, monto, dataApertura, clientes);
    }
    
}