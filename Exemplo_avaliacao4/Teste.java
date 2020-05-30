import java.util.ArrayList;
import java.util.List;

public class Teste{
    public static void main(String[] args){
        /*Turma t=new Turma("POO",001);
        t.adicionaAluno("João");
        t.adicionaAluno("Pedro");
        t.adicionaAluno("Ana");
        t.ordenaTurma();
        t.mostraTurma();
        */
        List <Integer> lista= new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            lista.add(i);
        } 
        System.out.println(lista); 
        int numero=lista.get(0)+127;
        System.out.println(numero);
    }
}