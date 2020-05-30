package Controle;
import Utilidades.Data;

public class Conta {
    private int nroConta;
    private double saldo;
    private Data dataApertura;
    private Correntista [] correntistas;

    public Conta(int nroConta, double monto,Data dataApertura, Correntista [] correntistas){
        this.nroConta=nroConta;
        this.saldo=monto;
        this.dataApertura=dataApertura;
        this.correntistas=correntistas;

    }
    public String toString(){
        String rpta=" nroConta: "+nroConta+" saldo: "+saldo+" data de abertura: "+dataApertura+"\n";
        for(int i=0;i<correntistas.length;i++){
            rpta=rpta+correntistas[i];
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
    public double consultarSaldo(){
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
    