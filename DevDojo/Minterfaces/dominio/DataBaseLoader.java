package Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void Load() {
        System.out.println("Carregando dados do banco de dados! ");

    }

    @Override
    public void Remove() {
        System.out.println("Removendo dados do banco de dados");
    }
}
