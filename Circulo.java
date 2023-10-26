// Clase Circulo que hereda de FiguraGeometrica
public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    // Implementación del método para obtener el área
    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Implementación del método para obtener el perímetro
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
