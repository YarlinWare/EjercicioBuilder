package clases;

// CLASE DIRECTOR.
public class JugueteriaShop {
    private JugueteBuilder jugueteBuilder;
 
    public void setJugueteBuilder(JugueteBuilder pb) { 
        jugueteBuilder = pb; 
    }
    
    public Juguete getJuguete() { 
        return jugueteBuilder.getJuguete(); 
    }
 
    public void construirJuguete() {
       jugueteBuilder.crearNuevoJuguete();
       jugueteBuilder.buildEstructura();
       jugueteBuilder.buildColor();
    }
}
