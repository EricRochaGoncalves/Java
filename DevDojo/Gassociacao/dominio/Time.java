package Gassociacao.dominio;

public class Time {
    private String nome;
    private Time time;
    private Jogador [] jogadores;



    public Time(String nome) {
        this.nome = nome;
    }

    

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if ( jogadores == null){
            System.out.println("Não possui jogadores");
            return;
        }
        for( Jogador jogador: jogadores){
            System.out.println(jogador.getNome());
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }



    public Jogador[] getJogadores() {
        return jogadores;
    }



    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    
}
