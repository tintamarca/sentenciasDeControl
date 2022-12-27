package com.open_bootcamp;

public class Encapsulacion {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setEdad(18);
        persona.setNombre("Charo");
        persona.setTelefono(112536721);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

class Persona{
   private int edad;
   private String nombre;
   private int telefono;

   public void setEdad(int edad){
       this.edad= edad;
   }
    public int getEdad(){
       return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telef){
        this.telefono= telef;
    }
    public int getTelefono(){
        return this.telefono;
    }
}