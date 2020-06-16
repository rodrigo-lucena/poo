import java.util.*;

public class TurmaH {
    private String nome;
    private int codigo;
    public Map<Integer, String> turma;
    public TurmaH(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
        this.turma = new TreeMap<Integer,String>();
    }
    public void adicionarAluno(Integer ra, String a){
        turma.put(ra,a);
        System.out.println("Turma: "+turma.toString());
    }
    public void mostraTurma(){
        System.out.println("Turma: "+nome);
        System.out.println("Código: "+codigo);
        System.out.println("Turma: "+turma.toString());
    }
    
}