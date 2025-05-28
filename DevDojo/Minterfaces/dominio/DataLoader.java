package Minterfaces.dominio;

public interface DataLoader {

    public abstract void Load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões! ");

    }

}
