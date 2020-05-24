package principal;

// CLASE PRINCIPAL.

import clases.*;

public class Principal {
    public static void main(String[] args) {
        JugueteriaShop toy = new JugueteriaShop(); // Director.
        JugueteBuilder carro = new ControlRemotoBuilder();
        JugueteBuilder caballito = new MaderaBuilder();
 
        toy.setJugueteBuilder(carro );
        toy.construirJuguete();
 
        Juguete toy2 = toy.getJuguete();
    }
}
