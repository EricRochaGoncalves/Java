package Minterfaces.teste;

import Minterfaces.dominio.DataBaseLoader;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.Load();
        fileLoader.Load();

        dataBaseLoader.Remove();
        fileLoader.Remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
