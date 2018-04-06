package tienda;

/**
 *
 * @author mario
 */
public class Producto {
    private String nombre, codigo, codigoProv;
    private double costo;
    private int cantidad;
    private boolean estado;
    
    public Producto(){}
    
    public Producto(String codigo, String nombre, String codigoProv){
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoProv = codigoProv;
        estado = true;
    }
    
    public Producto(String codigo, String nombre, String codigoProv, double costo, int cantidad){
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoProv = codigoProv;
        this.costo = costo;
        this.cantidad = cantidad;
        estado = true;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoProv(String codigoProv) {
        this.codigoProv = codigoProv;
    }
    
    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCodigoProv() {
        return codigoProv;
    }
    
    public double getCosto() {
        return costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isEstado() {
        return estado;
    }
    
    @Override
    public String toString(){
        return codigo+" "+nombre+" Costo: $"+costo+" Cantidad: "+cantidad;
    }
    
    public static void main(String[] args) {
        
        Sesion login = new Sesion();
        Menu menu = Menu.getInstance();
        
        while(true){
            
            login.solicitar();

            menu.mostrar();
            
            login.cerrar();
            
        }
        
    }
}
