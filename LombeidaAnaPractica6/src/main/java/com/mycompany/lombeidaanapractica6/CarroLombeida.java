package com.mycompany.lombeidaanapractica6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class CarroLombeida {//Clase
  String marca ;//Atributos
  String modelo ;
  String color ;
  int  anio ;
  String placa;
  
  
  
  ////////////////////////////////////////METODOS
  public void Enciende(){
        System.out.println("Run Run..............");
  
  
  }
  
  public void Acelera(){
        System.out.println("Aceleracion :Su velocidad aumenta 90km por hora..");
  }
  
 
  public void Frena(){
        System.out.println("Apagacion : Su velocidad cambia a 00km por hora..");
  }
  
  
  
  public void PonerCombustible(){
        System.out.println("Combustible: Consumea 2.2 turbodiesel gasta 7,9 litros cada 100 km/h en ruta (a 120 km/h)  por hora..");
  }
  
   public void GastoMecanicos(){
        System.out.println("Gastos Mecanicos mensuales: $50,005..........");
  }
   
     public void GastosdDocumentacion(){
        System.out.println("Gastos de documentacion: $10,000..........");
  }
}
