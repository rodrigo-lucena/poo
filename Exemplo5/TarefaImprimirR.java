// Usando Runnable
public class TarefaImprimirR implements Runnable{
    int idTarefa;
    int tempo;
    public TarefaImprimirR(int idTarefa, int tempo){
        this.idTarefa = idTarefa;
        this.tempo = tempo;
    }
    public void run(){
        try {
            System.out.println("Tarefa #"+idTarefa+" vai dormir "+tempo+" milisegundos");
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();//TODO: handle exception
        }
        System.out.println("Tarefa #"+idTarefa+" parou de dormir ");
    }
}