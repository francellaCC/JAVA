public class Persona {
 String nombre;
 String apelledio;
 int edad;
 Carrera carrera;

//  contructor

public Persona(String nombre, String apellido , int edad){
  this.nombre = nombre;
  this.apelledio = apellido;
  this.edad = edad;
}

 public String darNombreCompleto(){
    return apelledio + " , " + nombre ;
 }

 public String enviarSaludo(String saludo){
    return "Hola , como estas " + saludo + "?";
 }

}
