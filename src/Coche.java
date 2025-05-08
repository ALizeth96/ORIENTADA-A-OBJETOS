public class Coche {
    // Atributos privados
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;

    // Constructor vacío
    public Coche() {
        this.kilometraje = 0;
    }

    // Constructor con parámetros
    public Coche(String marca, String modelo, int anio, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    // Mostrar información básica
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    // Mostrar información detallada
    public void mostrarInformacion(boolean detallado) {
        mostrarInformacion();
        if (detallado) {
            System.out.println("Kilometraje: " + kilometraje + " km");
        }
    }

    // Actualizar kilometraje
    public void actualizarKilometraje(int km) {
        if (km > 0) {
            kilometraje += km;
            System.out.println("Kilometraje actualizado con éxito.");
        } else {
            System.out.println("Error: El kilometraje debe ser positivo.");
        }
    }
}
