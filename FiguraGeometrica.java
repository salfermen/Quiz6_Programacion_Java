// Clase base abstracta FiguraGeometrica
public abstract class FiguraGeometrica {
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Métodos abstractos para obtener el área y el perímetro
    public abstract double obtenerArea();
    public abstract double obtenerPerimetro();
}
