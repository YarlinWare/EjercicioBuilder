package clases;

// CONCRETE BUILDER.
public class MaderaBuilder extends JugueteBuilder {
    
    @Override
    public void buildEstructura() { 
        juguete.setEstructura("Caballo"); 
    }
    
    @Override
    public void buildColor() { 
        juguete.setColor("Marron");
    }
    
}
