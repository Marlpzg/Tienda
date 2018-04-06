package tienda;

import java.util.Scanner;

public class Sesion {
    private String usuario, tipo;
    private boolean estado;
    
    public Sesion(){
        estado = false;
    }
    
    public boolean iniciar(String usu, String pass){
        if("Maria".equals(usu) && "contraSegura2018".equals(pass)){
            estado = true;
            usuario = usu;
            tipo = "admin";
            System.out.println("Se ha iniciado la sesión.");
        }else{
            System.err.println("Datos erróneos.\n");
        }
        
        return estado;
    }
    
    public void cerrar(){
        usuario = null;
        tipo = null;
        estado = false;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void solicitar(){
        String usu, pass;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("------Inicio de Sesión------");
            System.out.print("Usuario: ");
            usu = leer.nextLine();
            System.out.print("Contraseña: ");
            pass = leer.nextLine();
        }while(!iniciar(usu, pass));
    }
}
