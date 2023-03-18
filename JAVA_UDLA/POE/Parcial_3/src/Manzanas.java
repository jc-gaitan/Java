
public class Manzanas {
    
    private int cantidad = 10;
    
    public Manzanas(){
        
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void Vender(int cantidad){
        this.cantidad -= cantidad;
    }
}
