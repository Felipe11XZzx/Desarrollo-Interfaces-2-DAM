/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservas.dto;

/**
 *
 * @author lfelipeh
 */
public class Customer {
    
    private int id;
    private String name;
    private String dni;
    private int quantity;
    private String date;

    public Customer(int id, String name, String dni, int quantity, String date) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.quantity = quantity;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String[] toArrayString() {
        String Client [] = new String [5];
        Client[0] = Integer.toString(id);
        Client[1] = name;
        Client[2] = dni;
        Client[3] = Integer.toString(quantity);
        Client[4] = date;
        return Client;
    }
    
}
