/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

import javax.swing.JOptionPane;

public class ClasseRetangulo extends Figura{
    public double base;
    public double altura;
    
    public ClasseRetangulo(double b, double h){
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
    
    public double area(){
        return this.base * this.altura;
    }
}
