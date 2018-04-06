package tienda;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Menu {
    
    private static Menu menu;
    
    private Menu(){
        
    }
    
    public static Menu getInstance(){
        if(menu == null){
            menu = new Menu();
        }        
        return menu;
    }
    
    public void opciones(){
        System.out.println("\n----------- Menu -----------");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Modificar Producto");
        System.out.println("3. Mostrar Productos");
        System.out.println("4. Buscar Productos");
        System.out.println("5. Eliminar Productos");
        System.out.println("6. Agregar Proveedor");
        System.out.println("7. Modificar Proveedor");
        System.out.println("8. Mostrar Proveedores");
        System.out.println("9. Buscar Proveedores");
        System.out.println("10. Eliminar Proveedores");
        System.out.println("11. Comprar");
        System.out.println("12. Vender");
        System.out.println("13. Cerrar Sesión");
        System.out.print("Seleccione una opción: ");
    }
    
    public void mostrar(){
        
        int opcion = 14;
        Scanner leer = new Scanner(System.in);
        ListadoProductos productos = new ListadoProductos();

        while (opcion != 13) {
            opciones();
            try {
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
                        break;
                    case 7:
                        
                        break;
                    case 8:
                        
                        break;
                    case 9:
                        
                        break;
                    case 10:
                        
                        break;
                    case 11:
                        
                        break;
                    case 12:
                        
                        break;
                    case 13:
                        System.out.println("\n¡Hasta pronto!\n");  
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion válida.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número.");
                leer.nextLine();
            }
        }
        
    }
}
