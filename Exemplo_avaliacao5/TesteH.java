public class TesteH {
    public static void main(String[] args){
        TurmaH t= new TurmaH("POO", 001);
        t.adicionarAluno(1234, "João");
        t.adicionarAluno(1234, "Pedro");
        t.adicionarAluno(2345, "Ana");
        //t.mostraTurma();
        t.adicionarAluno(3456, "Ana");
        t.adicionarAluno(4567, "Ana");
        t.adicionarAluno(5678, "Pedro");
        t.mostraTurma();
        //System.out.println(t.turma);
    }
}