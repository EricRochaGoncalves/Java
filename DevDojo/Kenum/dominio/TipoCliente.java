package Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA("Pessoa Física", 1),
    PESSOA_JURIDICA("Pessoa Jurídica", 2);

    private int valor;
    private String nomeRelatório;

    TipoCliente(String nomeRelatório, int valor) {
        this.nomeRelatório = nomeRelatório;
        this.valor = valor;
    }
    public static TipoCliente tipoClientePorNomeRelatório (String nomeRelatório){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatório().equals(nomeRelatório)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatório() {
        return nomeRelatório;
    }
    public int getValor() { return valor;}

}
