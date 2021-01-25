package com.company;

public class Nome1 extends Cidadao implements Presidente{

    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleição no Brasil.");
    }
}
