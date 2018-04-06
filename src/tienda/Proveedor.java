package tienda;

/**
 *
 * @author mario
 */
public class Proveedor {
    
    private String codigo, nombre, telefono, empresa;
    
    public Proveedor(String codigo, String nombre, String telefono, String empresa){
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.empresa = empresa;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
