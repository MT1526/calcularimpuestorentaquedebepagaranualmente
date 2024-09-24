/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularimpuestorentaquedebepagaranualmente;

/**
 *
 * @author esteb
 */


//-importaciones

import javax.swing.JOptionPane;


//-clase
public class Menu {
    IngresosDelProfesional idp = new IngresosDelProfesional();
    GastosIncurridosMensualmente gim = new GastosIncurridosMensualmente();
    
    
    
   //-atributos
    private String respMenu;
    private int respMenuInt, totalValor;
    private double impuesto, TotalValorDouble;
    
    //-set y get (set:  /get: return)
    public void setRespMenu(String respMenu) {
        this.respMenu = respMenu;
    }

    public String getRespMenu() {
        return respMenu;
    }

    public void setRespMenuInt(int respMenuInt) {
        this.respMenuInt = respMenuInt;
    }

    public int getRespMenuInt() {
        return respMenuInt;
    }

    public int getTotalValor() {
        return totalValor;
    }

    public void setTotalValor(int totalValor) {
        this.totalValor = totalValor;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotalValorDouble() {
        return TotalValorDouble;
    }

    public void setTotalValorDouble(double TotalValorDouble) {
        this.TotalValorDouble = TotalValorDouble;
    }
    
    
    
    //-informativo
    
    
    
    //-metodos de accion
    
    public  double calcularImpuesto() {
         impuesto = 0;
         
        if (getTotalValor() <= 4127000) {
            impuesto = 0;
        } else if (getTotalValor() <= 6164000) {
            impuesto = (getTotalValor() - 4127000) * 0.10;
            System.out.println("se aplica un impuesto de 10%");
        } else if (getTotalValor() <= 10281000) {
            impuesto = (6164000 - 4127000) * 0.10 + (getTotalValor() - 6164000) * 0.15;
            System.out.println("se aplica un impuesto de 15%");
        } else if (getTotalValor() <= 20605000) {
            impuesto = (6164000 - 4127000) * 0.10 + (10281000 - 6164000) * 0.15 + (getTotalValor() - 10281000) * 0.20;
            System.out.println("se aplica un impuesto de 20%");
        } else {
            impuesto = (6164000 - 4127000) * 0.10 + (10281000 - 6164000) * 0.15 + (20605000 - 10281000) * 0.20 + (getTotalValor() - 20605000) * 0.25;
            System.out.println("se aplica un impuesto de 25%");
        }

        return impuesto;
    }
    
    
    //----------------------------
    public String mostrarMenu(){
        
        do{
            
           setRespMenu(JOptionPane.showInputDialog("""
                                                1. Ingresar las facturas por servicios profesionales.
                                                2. Ingresar gastos.
                                                3. Listado de ingresos.
                                                4. Listado de gastos.
                                                5. C\u00e1lculo del impuesto de renta.
                                                6. Salir"""));
           setRespMenuInt(Integer.parseInt(getRespMenu()));
           
           switch(getRespMenuInt()){
               
               case 1:
                   
                   idp.preguntarDatos();
                   
                   break;
                   
               case 2:
                   
                   gim.preguntarGastosIncurridos();
                   
                   break;
                
               case 3:
                   
                   idp.mostrarConcatenar();
                   
                   break;
                   
               case 4:
                   
                   gim.mostrarConcatenar();
                   
                   break;
                
               case 5:
                   
                    //cambiar aqui cantidad de HIJOS y Conyugues
                   int hijos = 2;
                   int conyugue = 1;
                   
                   int valorIngresos=idp.darValorIngresos();
                   JOptionPane.showMessageDialog(null,"|---TOTAL DE INGRESOS: "+ valorIngresos+"---|");
                   
                   int valorGastos=gim.darValorGastos();
                   JOptionPane.showMessageDialog(null,"|---TOTAL DE GASTOS: "+ valorGastos+"---|");
                   
                   setTotalValor(valorIngresos-valorGastos);
                   JOptionPane.showMessageDialog(null,"|---UNIDADES: " + getTotalValor()+"---|");
                   
                   //---------------------------
                   double impuestoCalculado = calcularImpuesto();
                   JOptionPane.showMessageDialog(null,"|---IMPUESTO CALCULADO: " + impuestoCalculado+"---|");
                   //---------------------------
                    JOptionPane.showMessageDialog(null,"""
                                       ---TOTAL LUEGO DE RESTAR EL DINERO DE LOS HIJOS Y CONYUGUE---
                                       TOTAL DE HIJOS: """+hijos+"\nTOTAL DE CONYUGUES: "+conyugue);
                   JOptionPane.showMessageDialog(null,impuestoCalculado-(hijos*20760)-(conyugue*31440));
                   
                   
                   
                   
                    break;
                   
               case 6:
                   
                   JOptionPane.showMessageDialog(null, "|---Cerrando programa---|");
                   System.out.println("|---EL PROGRAMA SE CERRO---|");
                   
                   break;
               
           }
           
         
            
        }while(getRespMenuInt() != 6 );
        
        return getRespMenu();
        
    }
     
    
    
}
