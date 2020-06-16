package Controle;
import Utilidades.Data;
import java.lang.IllegalArgumentException;

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
    public void fazerDeposito(double monto){
        saldo=saldo+monto;
        } 
    public void fazerSaque(double monto) throws IllegalArgumentException{
        if (monto>saldo){
            IllegalArgumentException illegal = new IllegalArgumentException ("O monto: "+monto+" ultrapassa o saldo: "+saldo);
            throw illegal;
        }
        saldo-=monto;
    }
    public final double consultarSaldo(){
        return saldo;
    }
    public void fazerTransferencia(Conta destino,double monto) throws IllegalArgumentException{
        try{
            this.fazerSaque(monto);
        }
        catch(IllegalArgumentException illegal){
            throw illegal;

        }
        destino.fazerDeposito(monto);      
        }
    
}