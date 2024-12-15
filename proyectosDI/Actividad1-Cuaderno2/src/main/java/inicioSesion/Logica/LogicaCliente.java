/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicioSesion.Logica;
import inicioSesion.dto.client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ortiz
 */
public class LogicaCliente {
    
     private static List<client> listaClientes = new ArrayList<>();
    
    public static void agregarCliente(client Pclient){
        listaClientes.add(Pclient);
    }
    
    public static List<client> getListaClientes(){
        return listaClientes;
    }
}
