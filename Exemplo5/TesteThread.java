import java.util.concurrent.ExecutorService;

import java.util.concurrent.*;
public class TesteThread {
    public static void main(String[] args) {
    // Usando Thread - TarefaImprimir
    /*
    TarefaImprimir t1 = new TarefaImprimir(1, 2000);
    t1.start(); // chama o método run()
    TarefaImprimir t2 = new TarefaImprimir(2, 1000);
    t2.start();
    TarefaImprimir t3 = new TarefaImprimir(3, 900);
    t3.start(); 
    */
    // Usando Runnable - TarefaImprimirR 
    /*
    TarefaImprimirR t1 = new TarefaImprimirR(1, 2000);
    Thread thread1 = new Thread(t1);
    thread1.start(); // chama o método run()
    TarefaImprimirR t2 = new TarefaImprimirR(2, 1000);
    Thread thread2 = new Thread(t2);
    thread2.start(); // chama o método run()
    TarefaImprimirR t3 = new TarefaImprimirR(3, 900);
    Thread thread3 = new Thread(t3);
    thread3.start(); // chama o método run()
    */
    // Usando ExecutorService - TarefaImprimirR
    TarefaImprimirR t1 = new TarefaImprimirR(1, 2000);
    TarefaImprimirR t2 = new TarefaImprimirR(2, 1000);
    TarefaImprimirR t3 = new TarefaImprimirR(3, 900);
    ExecutorService ex = Executors.newCachedThreadPool();
    ex.execute(t1);
    ex.execute(t2);
    ex.execute(t3);

    }
}