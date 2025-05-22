package Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("Professor:" + this.nome);
       
        if(this.seminarios == null) return;

         System.out.println("Seminarios cadastrados:");

         for(Seminario seminarios : seminarios){
            System.out.println(seminarios.getTitulo());
            System.out.println(seminarios.getLocal().getEndereco());
            if (seminarios.getAlunos() == null) continue;
            System.out.println("Alunos");

            for(Aluno aluno: seminarios.getAlunos()){
                System.out.println("Alunos: " + aluno.getNome() + " idade: " + aluno.getIdade());
            }

         }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
    
    
    
}
