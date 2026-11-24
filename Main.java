import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Variable con el nombre del producto que queremos buscar
        String nombreBuscado = "Mouse";

        // 2. Inicializamos la variable en null porque todavía no encontramos ningún producto
        Producto productoEncontrado = null;

        // 3. Creamos los objetos Producto utilizando su constructor
        Producto teclado = new Producto("Teclado", 80000, 15);
        Producto mouse = new Producto("Mouse", 45000, 20);
    
    // 4. Mostramos los datos iniciales del teclado
        System.out.println(teclado.nombre);
        System.out.println(teclado.precio);
        System.out.println(teclado.cantidad);

        // 5. Actualizamos directamente la cantidad del teclado
        teclado.cantidad = teclado.cantidad + 10;

        // 6. Mostramos la cantidad actualizada del teclado
        System.out.println("Cantidad actualizada: " + teclado.cantidad);

        // 7. Mostramos los datos iniciales del mouse
        System.out.println(mouse.nombre);
        System.out.println(mouse.precio);
        System.out.println(mouse.cantidad);

        // 8. Creamos el ArrayList que almacenará los productos
        ArrayList<Producto> inventario = new ArrayList<>();

        // 9. Agregamos los objetos al inventario
        inventario.add(teclado);
        inventario.add(mouse);

        // 10. Mostramos cuántos productos tenemos registrados
        System.out.println("Total de productos: " + inventario.size());
        System.out.println();

        // 11. Recorremos todos los productos del inventario
        for (Producto p : inventario) {

            // Mostramos los datos de cada producto
            System.out.println("Nombre: " + p.nombre);
            System.out.println("Precio: " + p.precio);
            System.out.println("Cantidad: " + p.cantidad);
            System.out.println();

            // 12. Comparamos el nombre del producto con el nombre buscado
            if (p.nombre.equals(nombreBuscado)) {

                // Si coinciden, guardamos la referencia al objeto encontrado
                productoEncontrado = p;
            }
        }

        // 13. Cantidad de unidades que queremos agregar al producto
        int cantidadAgregar = 5;

        // 14. Comprobamos si encontramos el producto
        if (productoEncontrado != null) {

            System.out.println("Producto encontrado");
            System.out.println("Nombre: " + productoEncontrado.nombre);
            System.out.println("Precio: " + productoEncontrado.precio);
            System.out.println("Cantidad inicial: " + productoEncontrado.cantidad);

            // 15. Aumentamos la cantidad del producto encontrado
            productoEncontrado.cantidad += cantidadAgregar;

            // 16. Mostramos la nueva cantidad
            System.out.println("Cantidad actualizada: " + productoEncontrado.cantidad);

        } else {

            // 17. Si no encontramos el producto, mostramos este mensaje
            System.out.println("Producto no encontrado");
        }
    }
}