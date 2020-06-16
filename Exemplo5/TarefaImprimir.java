// Usando Thread
public class TarefaImprimir extends Thread {
    int idTarefa;
    int tempo;
    public TarefaImprimir(int idTarefa, int tempo){
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