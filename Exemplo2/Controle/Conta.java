package Controle;
import Utilidades.Data;

public abstract class Conta {
    private int nroConta;
    private double saldo;
    private Data dataApertura;
    private Cliente [] clientes;

    public Conta(int nroConta, double monto,Data dataApertura, Cliente [] clientes){
        this.nroConta=nroConta;
        this.saldo=monto;
        this.dataApertura=dataApertura;
        this.clientes=clientes;

    }
    public String toString(){
        String rpta=" nroConta: "+nroConta+" saldo: "+saldo+" data de abertura: "+dataApertura+"\n";
        for(int i=0;i<clientes.length;i++){
            rpta=rpta+clientes[i];
        }
        return rpta;
    }
    public boolean fazerDeposito(double monto){
        if (monto>=0){
            saldo=saldo+monto;
            return true;
        }
        
        else {
            return false;
        } 
    }
    public boolean fazerSaque(double monto){
        if (saldo>=monto){
            saldo=saldo-monto;
            return true;
        }
        else{
            return false;
        }
    }
    public final double consultarSaldo(){
        return saldo;
    }
    public boolean fazerTransferencia(Conta destino,double monto){
        if (this.fazerSaque(monto)==true){
            destino.fazerDeposito(monto);
            return true;
        }
        else{
            return false;
        }
        
        }
    
}