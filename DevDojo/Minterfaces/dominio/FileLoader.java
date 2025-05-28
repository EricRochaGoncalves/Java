package Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void Load() {
        System.out.println("Carregando dados de um arquivo ");
    }

    @Override
    public void Remove() {
        System.out.println("Deletando dados de um arquivo");
    }
}
