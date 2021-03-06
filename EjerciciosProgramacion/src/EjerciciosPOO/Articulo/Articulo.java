/*
 * Proyecto EjerciciosProgramacion - Archivo Articulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package EjerciciosPOO.Articulo;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:27:14
 */
public class Articulo {

    private String nombre;
    private double precio;
    private double iva = 1.21;
    private int stock;

    public Articulo(String nombre, double precio, int stock) {

        this.nombre = nombre;
        if (precio <= 0) {
            System.out.println("Error no puede ser gratis!");
        } else {
            this.precio = precio;
        }
        if (stock <= 0) {
            System.out.println("Error no puedes comprar si no hay stock");
        } else {
            this.stock = stock;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIva() {
        return iva;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("Error no puede ser gratis!");
        } else {
            this.precio = precio;
        }
    }

    public void setIva(double iva) {
        if (iva == 1.21) {
            this.iva = iva;
        } else {
            System.err.println("Error");
        }

    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.err.println("Error");
        }
    }
    public void imprimir(){
        System.out.println(getNombre() + ", " + getPrecio() + ", " + getIva() + ", " + getStock());
    }
    
    public double getPVP(){
        return (precio * iva);
    }
    
    public double getPVPDescuento(int descuento){
        return (precio * (1 - (descuento/100)));
    }
}
