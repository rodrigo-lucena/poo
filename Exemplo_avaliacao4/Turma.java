import java.util.*;
public class Turma{
    private String nome;
    private int codigo;
    private List<String> turma;
    
    public Turma(String nome, int codigo){
        this.nome=nome;
        this.codigo=codigo;
        turma=new ArrayList<String>(); 
    }
    public void adicionaAluno(String a){
        turma.add(a);
    }
    public void ordenaTurma(){
        Collections.sort(turma);
    }
    public void mostraTurma(){
        System.out.println("Turma: "+nome);
        System.out.println("Código: "+codigo);
        for(String elemento:turma){
            System.out.println("Turma: "+elemento);
        }
    }

}