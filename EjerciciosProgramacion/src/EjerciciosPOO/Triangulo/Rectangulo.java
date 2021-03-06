/*
 * Proyecto EjerciciosProgramacion - Archivo Rectangulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package EjerciciosPOO.Triangulo;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:07:00
 */
public class Rectangulo {

    private int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (x2 > x1 && y2 > y1) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("Error");
        }

    }

    public int sumalado(int a, int b, int c, int d) {
        a = x1;
        b = x2;
        c = y1;
        d = y2;
        int e = Math.abs(b - a);
        int i = Math.abs(d - c);
        int suma = e + i;
        return suma;
    }

    public int areas(int a, int b, int c, int d) {
        a = x1;
        b = x2;
        c = y1;
        d = y2;
        int e = Math.abs(b - a);
        int i = Math.abs(d - c);
        int area = e * i;
        return area;

    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {

        if (x2 > x1) {
            this.x1 = x1;

        } else {
            System.err.println("Muy mal x2 no puede ser menor a x1");
        }

    }

    public void setX2(int x2) {

        if (x2 > x1) {
            this.x2 = x2;

        } else {
            System.err.println("Muy mal x2 no puede ser menor a x1");
        }

    }

    public void setY1(int y1) {
        if (y2 > y1) {
            this.y1 = y1;

        } else {
            System.out.println("Mal y2 no puede ser menor a y1");
        }
    }

    public void setY2(int y2) {
        if (y2 > y1) {
            this.y2 = y2;

        } else {
            System.out.println("Mal y2 no puede ser menor a y1");
        }
    }

    public void imprimir() {
        System.out.println("La informacion del triangulo es: " + getX1() + ", " + getX2() + ", " + getY1() + ", " + getY2());
    }

    public void setX1Y1(int x1, int y1) {
        setX1(x1);
        setY1(y1);

    }

    public void setX2Y2(int x2, int y2) {
        setX2(x2);
        setY2(y2);

    }

    public void setX1X2Y1Y2(int x1, int x2, int y1, int y2) {
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
    }

}
