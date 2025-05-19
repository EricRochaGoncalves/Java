package dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;
    private String estudio;


    public Anime( String nome, String tipo, int epsodios, String genero){

        this(); 
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
        
    }
    public Anime( String nome, String tipo, int epsodios, String genero, String estudio){

        this(nome, tipo, epsodios, genero); 
        this.estudio = estudio;

        System.out.println("dentro do construtor com argumentos");

        
        
       
    }

    public Anime(){
        System.out.println("dentro do construtor sem argumentos");
    }
    

    public void inprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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
