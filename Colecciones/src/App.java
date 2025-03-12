// import java.util.HashSet;
// import java.util.Set;

// import java.util.ArrayList;
// import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Bienvenidos a la fiesta de los superheroes");

        // los Set no guarda duplicados
        // HashSet  no tiene un orden
        // TreeSet si guarda un orden alfabetico
        // LinkedHashSet se guarda un orden segun como se ordenan
        // Set<String> superHeroes = new HashSet<>();
        // superHeroes.add("Spiderman");
        // superHeroes.add("Batman");
        // superHeroes.add("La Mujer Maravilla");
        // superHeroes.add("Deadpool");
        // superHeroes.add("Ciclope");

        // // despues llego tarde el super heroe estrella
        // superHeroes.add("Iron Man");


        // if(superHeroes.contains("Spiderman")){
        //     System.out.println("Spiderman en la fiesta");
        // }


        // superHeroes.remove("Ciclope");

        // if(!superHeroes.contains("Ciclope")){
        //     System.out.println("Ciclope se ha ido de la fiesta");
        // }

        // // fue y volvio tan rapido de la tienda que no nos dimos cuenta que se fue 
        // superHeroes.add("Batman");


        // if(superHeroes.isEmpty()){
        //     System.out.println("La fiesta ha terminado todos se han ido");
        // } else{
        //     System.out.println("La fiesta continua aun hay " + superHeroes.size() + " superheroes");
        // }



        // Los List si pueden guardar duplicados y mantienen un orden segun como se agrega
        // permite ingresar un indice
        // ArrayList es bueno para usar set y get pero no mucho para eliminar o agregar
        // LinkedList es mejor para eliminar o agregar
        // Vector es bueno para multihilos
        // List<String> superHeroes = new ArrayList<>();
        // superHeroes.add("Spiderman");
        // superHeroes.add("Batman");
        // superHeroes.add("La Mujer Maravilla");
        // superHeroes.add("Deadpool");
        // superHeroes.add("Ciclope");

        // // despues llego tarde el super heroe estrella
        // superHeroes.add("Iron Man");


        // if(superHeroes.contains("Spiderman")){
        //     System.out.println("Spiderman en la fiesta");
        // }



        // System.out.println("Hay un superheroe que ya esta ebrio, el superheroe es: " + superHeroes.get(0));
        

        // superHeroes.remove(3);
        // if(!superHeroes.contains("Ciclope")){
        //     System.out.println("Ciclope se ha ido de la fiesta");
        // }


        // superHeroes.set(5, "Tony Stark");
        // System.out.println("Iron Man se saca la mascara mostrando su verdadera identidad que es: " + superHeroes.get(5));
        // // fue y volvio tan rapido de la tienda que no nos dimos cuenta que se fue 
        // superHeroes.add("Batman");


        // if(superHeroes.isEmpty()){
        //     System.out.println("La fiesta ha terminado todos se han ido");
        // } else{
        //     System.out.println("La fiesta continua aun hay " + superHeroes.size() + " superheroes");
        // }

        System.out.println("Bienvenidos a nuestra verduleria");

        Map<String, Double> inventario = new HashMap<>();

        inventario.put("Banana", 0.89);
        inventario.put("Tomate", 0.75);
        inventario.put("Aguacate", 0.95);
        inventario.put("Fresa", 0.65);
        inventario.put("Chile Verde", 0.77);
        
        System.out.println("Este es el inventario de frutas y verduras");

        // KeySet me da un arreglo con las keys
        for (String fruta:  inventario.keySet() ) {
            System.out.println(fruta + ":  $" + inventario.get(fruta));
        }

        String frutaBuscada =  "Manzana";
        System.out.println("Se acerca un cliente y nos pide la siguiente fruta: ");


        if(inventario.containsKey(frutaBuscada)){
            System.out.println(frutaBuscada + "Esta en el iventario, encantados de venderle");
            inventario.remove(frutaBuscada);

            System.out.println("Nos quedamos sin : " + frutaBuscada);
        }else{
            System.out.println("Lamentablemente nos quedamos sin: " + frutaBuscada);
        }


        System.out.println("Inventario Actualizado");
        for (String fruta:  inventario.keySet() ) {
            System.out.println(fruta + "$" + inventario.get(fruta));
        }

        System.out.println("La cantidad de mercaderia es: " + inventario.size());

    }
}
