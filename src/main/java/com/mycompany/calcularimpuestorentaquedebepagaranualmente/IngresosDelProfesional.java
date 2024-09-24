/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularimpuestorentaquedebepagaranualmente;
//ir a comprar zanahorias ahora mas tarde
/**
 *
 * @author esteb
 */
//importacion

import javax.swing.JOptionPane;

public class IngresosDelProfesional {

    private String fecha, numeroDeFactura, montoCobrado;
    private StringBuilder concatenado;  
    private int cantRepeticon, ingresos;

    // Constructor
    public IngresosDelProfesional() {
        this.numeroDeFactura = "";
        this.fecha = "";
        this.montoCobrado = "";
        this.concatenado = new StringBuilder();  
        this.cantRepeticon = 0;
    }

    // Constructor con parámetros
    public IngresosDelProfesional(String numeroDeFactura, String fecha, String montoCobrado, StringBuilder concatenado, int cantRepeticon) {
        this.numeroDeFactura = numeroDeFactura;
        this.fecha = fecha;
        this.montoCobrado = montoCobrado;
        this.concatenado = concatenado;
        this.cantRepeticon = cantRepeticon;
    }

    // Métodos set y get
    public void setNumeroDeFactura(String numeroDeFactura) {
        this.numeroDeFactura = numeroDeFactura;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMontoCobrado(String montoCobrado) {
        this.montoCobrado = montoCobrado;
    }

    public String getNumeroDeFactura() {
        return numeroDeFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMontoCobrado() {
        return montoCobrado;
    }

    public void setConcatenado(StringBuilder concatenado) {
        this.concatenado = concatenado;
    }

    public StringBuilder getConcatenado() {
        return concatenado;
    }

    public void setCantRepeticon(int cantRepeticon) {
        this.cantRepeticon = cantRepeticon;
    }

    public int getCantRepeticon() {
        return cantRepeticon;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }
    
    

    // Métodos de acción
    public String preguntarDatos() {
        setCantRepeticon(getCantRepeticon() + 1);
        System.out.println("|---GUARDANDO INGRESOS NUMERO " + getCantRepeticon() + "---|");

        setNumeroDeFactura(JOptionPane.showInputDialog("Introduzca su numero de factura"));
        setFecha(JOptionPane.showInputDialog("Introduzca su fecha"));
        setMontoCobrado(JOptionPane.showInputDialog("Introduzca su monto cobrado"));

        setIngresos(getIngresos() + Integer.parseInt(getMontoCobrado()));
        return concatenarInfoIngresos();
    }

    public String concatenarInfoIngresos() {
        
        
        
        String info = "|--INGRESO-" + getCantRepeticon() + "--|"+"\n" +
                      "Numero de factura: " + getNumeroDeFactura() + "\n" +
                      "Fecha: " + getFecha() + "\n" +
                      "Monto cobrado: " + getMontoCobrado() + "\n";

        
        concatenado.append(info);

        
        return info;
    }

    public String mostrarConcatenar() {
        
        
        
        
        String allInfo = concatenado.toString();
        System.out.println(allInfo);
        
        JOptionPane.showMessageDialog(null, ""+allInfo);
        
        return allInfo;
    }
    
    public int darValorIngresos(){
        
        getIngresos();
        
        return getIngresos();
        
    }
}

