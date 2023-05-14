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
        CarroLombeida ford2 = new CarroLombeida();//llamanda de la clase
        Animales TipoAnimal1=new Animales();//Llamada de clase
        Animales TipoAnimal2=new Animales();//Llamada de clase
        Persona dato1=new Persona();
        Persona dato2=new Persona();
        /////////////////////////////////////////////CARRO
        ford1.marca="Ford";//Atributos
        ford1.modelo="Ranger";
        ford1.color="Negro";
        ford1.anio =2022;
        ford1.placa="A12-L456";
        //////////////////////////////////////////
        ford2.marca="Ford";//Atributos
        ford2.modelo="Explore";
        ford2.color="Blanco";
        ford2.anio =2023;
        ford2.placa="A17-F459";
        
        ///Llamda de nuestros metodos Carro
        System.out.println("===============================================");
        ford1.Enciende();
        ford1.Acelera();
        ford1.Frena();
        ford2.PonerCombustible();
        ford2.GastoMecanicos();
        ford2.GastosdDocumentacion();
        
        System.out.println("===============================================");
        System.out.println(ford1.marca);
        System.out.println(ford1.modelo);
        System.out.println(ford1.color);
        System.out.println(ford1.anio);
        System.out.println(ford1.placa);
        
        System.out.println("===============================================");
        System.out.println(ford2.marca);
        System.out.println(ford2.modelo);
        System.out.println(ford2.color);
        System.out.println(ford2.anio);
        System.out.println(ford2.placa);
        System.out.println("===============================================");
        
        
        
        System.out.println("===============================================");
        ///Animales
        
       TipoAnimal1.ClasedAnimal="Perro";
       TipoAnimal1.nombre="Rufo";
       TipoAnimal1.color="Amarillo";
       TipoAnimal1.sexo="Masculino";
       TipoAnimal1.edad=5;
       TipoAnimal1.anioNacimiento=2009;
       
       TipoAnimal2.ClasedAnimal="Gato";
       TipoAnimal2.nombre="Susii";
       TipoAnimal2.color="Negro";
       TipoAnimal2.sexo="Femenino";
       TipoAnimal2.edad=3;
       TipoAnimal2.anioNacimiento=2020;
      
       
        System.out.println("===============================================");
        System.out.println(TipoAnimal1.ClasedAnimal);
        System.out.println(TipoAnimal1.nombre);
        System.out.println(TipoAnimal1.color);
        System.out.println(TipoAnimal1.sexo);
        System.out.println(TipoAnimal1.edad);
        System.out.println(TipoAnimal1.anioNacimiento);
        System.out.println("===============================================");
        
        
        System.out.println("===============================================");
        System.out.println(TipoAnimal2.ClasedAnimal);
        System.out.println(TipoAnimal2.nombre);
        System.out.println(TipoAnimal2.color);
        System.out.println(TipoAnimal2.sexo);
        System.out.println(TipoAnimal2.edad);
        System.out.println(TipoAnimal2.anioNacimiento);
        System.out.println("===============================================");
        
        
        //Dato persona
        
        System.out.println("===============================================");
        dato1.nombreApelli="Edgar Romero";
        dato1.sexo="Masculino";
        dato1.colorPiel="Blanco";
        dato1.edad=20;
        dato1.anioNacimiento=2002;
        
        System.out.println("===============================================");
        dato2.nombreApelli="Ana Lombeida";
        dato2.sexo="Femenino";
        dato2.colorPiel="Blanco";
        dato2.edad=19;
        dato2.anioNacimiento=2003;
        
        System.out.println("===============================================");
        System.out.println(dato1.nombreApelli);
        System.out.println(dato1.sexo);
        System.out.println(dato1.colorPiel);
        System.out.println(dato1.edad);
        System.out.println(dato1.anioNacimiento);
        System.out.println("===============================================");
        
   
        System.out.println("===============================================");
        System.out.println(dato2.nombreApelli);
        System.out.println(dato2.sexo);
        System.out.println(dato2.colorPiel);
        System.out.println(dato2.edad);
        System.out.println(dato2.anioNacimiento);
        System.out.println("===============================================");
        
        
        
        
        
        
        
        
    }
}
