package Hherança.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de 'pessoa' " );
    }
    {
        System.out.println("Dentro do bloco de inicialização");
    }

    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Dentro do construtor de pessoa");
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco.getRua() + " | CEP: " + endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
