package Kenum.dominio;

public enum TipoPagamento {
    CRÉDITO {
        @Override
        public double calcularDesconto(double valor) {
            System.out.println("Desconto de 5%");
            return valor * 0.05;
        }

    },
    DÉBITO {

        @Override
        public double calcularDesconto(double valor) {
            System.out.println("Desconto de 10%");
            return valor * 0.1;
        }
    },
    PIX {
        @Override
        public double calcularDesconto(double valor) {
            System.out.println("Não tem desconto!");
            return valor;
        }
    },
    BOLETO {
        @Override
        public double calcularDesconto(double valor) {
            System.out.println("Não tem desconto!");
            return valor;

        }
    };

    public abstract double calcularDesconto (double valor);


}

