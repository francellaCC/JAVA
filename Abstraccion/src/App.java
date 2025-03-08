public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(2, 4.5);

        System.err.println(" el radio del circulo es: " +  circulo.calcularArea());
        System.out.println("el area del rectangulo es: " + rectangulo.calcularArea());

    }
}
