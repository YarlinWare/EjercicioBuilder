package clases;

// CONCRETE BUILDER.
public class ControlRemotoBuilder extends JugueteBuilder {
    @Override
    public void buildEstructura() { 
        juguete.setEstructura("Carro"); 
    }
    
    @Override
    public void buildColor() { 
        juguete.setColor("Rojo"); 
    }
    
}
