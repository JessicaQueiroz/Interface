package com.company;

public class Nome2 extends Cidadao implements Presidente{
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleição nos Estados Unidos");
    }
}
