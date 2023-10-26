public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método para obtener el área
    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    // Implementación del método para obtener el perímetro
    // Nota: Este método asume que el triángulo es equilátero para simplificar el ejemplo
    @Override
    public double obtenerPerimetro() {
        return 3 * base;
    }
}
