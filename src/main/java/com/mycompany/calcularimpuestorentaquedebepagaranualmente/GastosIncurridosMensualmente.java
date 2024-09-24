/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularimpuestorentaquedebepagaranualmente;

/**
 *
 * @author esteb
 */
//importacion
import javax.swing.JOptionPane;
//clase
public class GastosIncurridosMensualmente {
   //Atributos
    private String numeroFactura, fecha, montoPagado;
    private int repeticion, gastos; 
    private StringBuilder concatenado;
    //constructor

    public GastosIncurridosMensualmente(){
        
        this.numeroFactura = "";
        this.fecha = "";
        this.montoPagado = "";
        this.repeticion = 0;
        
        this.concatenado = new StringBuilder(); 
    }
    
    public GastosIncurridosMensualmente(String numeroFactura, String fecha, String montoPagado, int repeticion) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.montoPagado = montoPagado;
        this.repeticion = repeticion;
        
    }
    
    

    //set y get

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(String montoPagado) {
        this.montoPagado = montoPagado;
    }

    public int getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(int repeticion) {
        this.repeticion = repeticion;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }
    
    
    
    //metodos de accion
    public String preguntarGastosIncurridos(){
        
        setRepeticion(getRepeticion()+ 1);
        System.out.println("||---GUARDANDO GASTOS NUMERO " + getRepeticion() + "---||");
        
        setNumeroFactura(JOptionPane.showInputDialog("Introduzca su numero de factura"));
        setFecha(JOptionPane.showInputDialog("Introduzca su fecha"));
        setMontoPagado(JOptionPane.showInputDialog("Introduzca su monto pagado"));
        
        setGastos(getGastos()+Integer.parseInt(getMontoPagado()));
        
        return concatenarInfoGastos();
    }

    public String concatenarInfoGastos() {
        
        
        
        String info = "|--GASTOS-" + getRepeticion() + "--|"+"\n" +
                      "Numero de factura: " + getNumeroFactura() + "\n" +
                      "Fecha: " + getFecha() + "\n" +
                      "Monto pagado: " + getMontoPagado() + "\n";

        
        concatenado.append(info);

        
        return info;
    }
    
    
    public String mostrarConcatenar() {
        
        
        
        
        String allInfo = concatenado.toString();
        System.out.println(allInfo);
        
        JOptionPane.showMessageDialog(null, ""+allInfo);
        
        return allInfo;
    }
    
    
     public int darValorGastos(){
        
        getGastos();
        return getGastos();
        
    }
    
}
