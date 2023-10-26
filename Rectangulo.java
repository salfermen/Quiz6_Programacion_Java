public class Rectangulo extends FiguraGeometrica {
    private double largo;
    private double ancho;

    public Rectangulo(String nombre, String color, double largo, double ancho) {
        super(nombre, color);
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método para obtener el área
    @Override
    public double obtenerArea() {
        return largo * ancho;
    }

    // Implementación del método para obtener el perímetro
    @Override
    public double obtenerPerimetro() {
        return 2 * (largo + ancho);
    }
}
