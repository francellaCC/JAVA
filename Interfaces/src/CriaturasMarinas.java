public abstract class CriaturasMarinas {

   // Atributo
   String nombre;

   CriaturasMarinas(String nombre){
      this.nombre = nombre;
   }

   // obliga a sobreescribir a las clases que hereden
   abstract void nadar();
}
