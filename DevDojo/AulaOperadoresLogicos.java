package DevDojo;

public class AulaOperadoresLogicos {
    public static void main(String[] args) {
        
      double valorTotalContaCorrente = 200;

      double valorTotalContaPoupanca = 10000;

      float valorPlayStation = 5000F;

      boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;

      System.out.println("isPlayStationCincoCompravel "+isPlayStationCincoCompravel);

      double bonus = 1000;
      double bonusAdcional = 2000;
       double bonusResultado = bonus+bonusAdcional;

       System.out.println(bonusResultado);




    }
    
}
