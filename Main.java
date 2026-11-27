import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creamos dos productos
        Producto teclado = new Producto("Teclado", 100.0, 20);
        Producto mouse = new Producto("Mouse", 50.0, 30);

        // Creamos el ArrayList para almacenar los productos
        ArrayList<Producto> inventario = new ArrayList<>();

        // Agregamos los productos al inventario
        inventario.add(teclado);
        inventario.add(mouse);
        inventario.add(new Producto("Monitor", 200.0, 15));

        // Comprobamos si el mouse existe en el inventario usando el método contains() que utiliza equals() para la comparación
        System.out.println(inventario.contains(mouse)); // true
        
        // Comprobamos si existe un producto llamado Celular en el inventario, aunque no lo hayamos agregado, para ver si el método equals() funciona correctamente
        System.out.println(inventario.contains(new Producto("Celular", 1000.0, 5))); // false

        // Evita agregar un producto duplicado (mismo nombre) al inventario
        if (!inventario.contains(new Producto("mouse", 50.0, 30))) {
            inventario.add(new Producto("mouse", 50.0, 30));
        }

        // Mostramos la cantidad de productos en el inventario después de intentar agregar un duplicado
        System.out.println("Total de productos: " + inventario.size());
    }

}