package Csobrecargadosmetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;

    public Anime(){
        
    }

    public void init(String nome, String tipo, int epsodios){
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
    }
    public void init(String nome, String tipo, int epsodios, String genero){
        this.init(nome, tipo, epsodios);
        this.genero = genero;
    }


    public void inprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    

    

}
