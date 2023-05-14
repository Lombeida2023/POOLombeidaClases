/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lombeidaanapractica6;

/**
 *
 * @author USER
 */
public class LombeidaAnaPractica6 {

    public static void main(String[] args) {
        
        CarroLombeida ford1 = new CarroLombeida();//llamanda de la clase
        
        ford1.marca="Ford";//Atributos
        ford1.modelo="Ranger";
        ford1.color="Negro";
        ford1.anio =2022;
        ford1.placa="A12-L456";
        
        ford1.Enciende();
        ford1.Acelera();///Llamda de nuestros metodos 
        ford1.Frena();
        System.out.println(ford1.marca);
        System.out.println(ford1.modelo);
        System.out.println(ford1.color);
        System.out.println(ford1.anio);
        System.out.println(ford1.placa);
  
    }
}
