package com.mycompany.desafiodio.poo;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(Cliente cliente) {
       super(cliente);
    }

    ContaCorrente() {
    }
    
    
    
@Override
    public void imprimeExtrato() {
        System.out.println(" === Extrato Conta Poupança === ");
        super.imprimeInfosGerais();
}

        
}