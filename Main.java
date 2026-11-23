import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    String nombreBuscado = "Mouse";
    Producto productoEncontrado = null;

    Producto teclado = new Producto("Teclado",80000, 15);

    System.out.println(teclado.nombre);
    System.out.println(teclado.precio);
    System.out.println(teclado.cantidad);

    teclado.cantidad = teclado.cantidad + 10;

    System.out.println("Cantidad actualizada: " + teclado.cantidad);


    Producto mouse = new Producto("Mouse", 45000, 20);
    
    System.out.println(mouse.nombre);
    System.out.println(mouse.precio);
    System.out.println(mouse.cantidad);

    ArrayList<Producto> inventario = new ArrayList<>();
    
    inventario.add(teclado);
    inventario.add(mouse);

    System.out.println("Total de productos: " + inventario.size());
    System.out.println();


    for (Producto p : inventario) {
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Precio: " + p.precio);
        System.out.println("Cantidad: " + p.cantidad);
        System.out.println();

        if (p.nombre.equals(nombreBuscado)) {
            productoEncontrado = p;
            }
     }

    

        // AQUÍ TERMINA EL FOR-EACH

        if (productoEncontrado != null) {
            System.out.println("Producto encontrado");
            System.out.println("Nombre: " + productoEncontrado.nombre);
            System.out.println("Precio: " + productoEncontrado.precio);
            System.out.println("Cantidad: " + productoEncontrado.cantidad);
            System.out.println();
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}