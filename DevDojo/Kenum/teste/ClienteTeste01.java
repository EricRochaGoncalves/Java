package Kenum.teste;

import Kenum.dominio.Cliente;
import Kenum.dominio.TipoCliente;
import Kenum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Josemar", TipoCliente.PESSOA_FISICA, TipoPagamento.BOLETO);
        Cliente cliente2 = new Cliente("Dougras", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CRÉDITO);

        System.out.println(cliente);

        System.out.println(cliente2);

        System.out.println(TipoPagamento.DÉBITO.calcularDesconto(100));

        System.out.println(TipoPagamento.CRÉDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatório());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatório("Pessoa Física");

        System.out.println(tipoCliente2);


    }
}
