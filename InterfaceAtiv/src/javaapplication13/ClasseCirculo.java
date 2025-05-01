
package javaapplication13;

import javax.swing.JOptionPane;

public class ClasseCirculo extends Figura {
    public double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    public double area(){
        return 3.14 * (this.raio*this.raio);

    }
}
