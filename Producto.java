public class Producto {

    // Atributos de la clase Producto
    String nombre;
    double precio;
    int cantidad;

    // Constructor para inicializar los atributos de la clase Producto
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Sobrescribimos equals() para comparar productos por nombre, ignorando mayúsculas y minúsculas
    @Override
    public boolean equals(Object obj) {

        // Comprueba si ambos son exactamente el mismo objeto en memoria
        if (this == obj) {
            return true;
        }

        // Comprueba si el objeto recibido es null
        if (obj == null) {
            return false;
        }

        // Comprueba si  el objeto recibido pertenece a Producto
        if (!(obj instanceof Producto)) {
            return false;
        }

        // Convertimos Object en Producto para poder comparar sus atributos
        Producto otroProducto = (Producto) obj;

        // Compara Los nombres ignorando mayúsculas y minúsculas
        return nombre.equalsIgnoreCase(otroProducto.nombre);
    }
}
