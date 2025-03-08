import interfaces.Alimentable;
import interfaces.Comunicacion;

public class Pulpo extends CriaturasMarinas implements Comunicacion , Alimentable{

   Pulpo(String nombre){
      super(nombre);
   }
   @Override
   void nadar() {
      System.out.println(nombre + "esta nadando con sus 8 tentaculos");
   }

   @Override
   public void comunicarse() {
      System.out.println(nombre + " esaluda con sus 8 tentaculos");
   }
   @Override
   public void alimentar() {
    System.out.println(" Estamos alimentando con peces a " + nombre);
   }
}
