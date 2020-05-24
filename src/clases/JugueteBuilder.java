package clases;

// ABSTRACT BUILDER.
public abstract class JugueteBuilder {
    protected Juguete juguete;
 
    public Juguete getJuguete() { 
        return juguete; 
    }
    
    public void crearNuevoJuguete() { 
        juguete = new Juguete(); 
    }
 
    public abstract void buildEstructura();
    public abstract void buildColor();
}
