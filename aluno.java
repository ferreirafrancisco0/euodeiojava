public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double media;

        public void calcularMedia(){
            media = (nota1 + nota2) / 2.0;
    }
        public void imprimirInformacoes(){
            System.out.println(" nome: " + nome + " Matricula " + matricula + " Média " + media );
    }
    Aluno(String nome, int matricula, double nota1, double nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
}
