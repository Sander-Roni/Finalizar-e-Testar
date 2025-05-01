
package javaapplication13;

import javax.swing.JOptionPane;

public class ClasseTriangulo extends Figura {
    public double base;
    public double altura;
    
    public ClasseTriangulo(double b, double h){
        this.base = b;
        this.altura = h;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void Area(){
        JOptionPane.showMessageDialog(null,"A Area do Triangulo é: "+(this.base*this.altura)/2);
    }
    
}
