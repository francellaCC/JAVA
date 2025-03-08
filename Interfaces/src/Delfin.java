import interfaces.Alimentable;
import interfaces.Comunicacion;

// las clases solo pueden extender de una clase Abstracta pero pueden implementar muchas Interface
public class Delfin extends CriaturasMarinas implements Comunicacion, Alimentable{

   Delfin(String nombre){
      super(nombre);
   }

   @Override
   void nadar(){
      System.out.print(nombre + "esta nadando en velocidad con su cola y saltando sobre el agua" + '\n' );
   }

   @Override
   public void comunicarse() {
      System.out.println(nombre + " emite sonidos y chasquitos para comunucarse" );
   }
   @Override
   public void alimentar() {
    System.out.println(" Estamos alimentando con peces grandes a " + nombre);
   }
}
