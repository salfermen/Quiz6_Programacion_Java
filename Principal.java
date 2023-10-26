public class Principal {
    public static void main(String[] args) {
        // Crear un círculo
        Circulo circulo = new Circulo("Círculo", "Rojo", 5.0);
        System.out.println("Área del círculo: " + circulo.obtenerArea());
        System.out.println("Perímetro del círculo: " + circulo.obtenerPerimetro());

        // Crear un rectángulo
        Rectangulo rectangulo = new Rectangulo("Rectángulo", "Verde", 4.0, 7.0);
        System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());

        // Crear un triángulo
        Triangulo triangulo = new Triangulo("Triángulo", "Azul", 3.0, 6.0);
        System.out.println("Área del triángulo: " + triangulo.obtenerArea());
        System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());
    }
}
