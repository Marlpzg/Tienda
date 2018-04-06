package tienda;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class ListadoProductos {
    private ArrayList<Producto> productos;
    private ArrayList<Proveedor> proveedores;
    
    public ListadoProductos(){
        productos = new ArrayList<Producto>();
        proveedores = new ArrayList<Proveedor>();
    }
    
    public void agregarProv(){
    
    }
    
    public void agregarProd(){
    
    }
    
    public void modificarProv(String codProv){
    
    }
    
    //Desde estte método se habilitan o deshabilitan los productos.
    public void modificarProd(String codProd){
    
    }
    
    public void eliminarProv(String codProv){
    
    }
    
    public void eliminarProd(String codProd){
    
    }
    
    public void mostrarProvs(){
    
    }
    
    //Si un producto está deshabilitado no se mostrará.
    public void mostrarProds(){
    
    }
    
    //Los dos métodos siguientes son para buscar un elemento específico.
    public void mostrarProv(String codProv){
    
    }
    
    public void mostrarProd(String codProd){
    
    }
    
    //Los dos métodos siguientes son los que modificarán el inventario.
    public void comprar(String codProd, int cant){
    
    }
    
    public void vender(String codProd, int cant){
    
    }
    
}
