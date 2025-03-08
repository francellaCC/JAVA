public class App {
    public static void main(String[] args) throws Exception {
       Persona persona = new Persona("Raul", "Cincinaty", 20);
       
       

       Carrera carrera = new Carrera();
       carrera. nombre = "ITM";
       carrera.duracion = 6;
       carrera.estaEnCurso= true;

       persona.carrera = carrera;

       System.out.println(persona.darNombreCompleto());
       System.out.println(persona.enviarSaludo("mi pana"));
       System.out.println(persona.carrera.nombre);

    }
}
