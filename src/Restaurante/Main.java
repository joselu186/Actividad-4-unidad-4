package Restaurante;
public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido("Juan Perez");

        pedido.agregarArticulo(new Articulo("Hamburguesa", 2, 5.5));
        pedido.agregarArticulo(new Articulo("Papas fritas", 1, 2.0));
        pedido.agregarArticulo(new Articulo("Refresco", 2, 1.5));

        pedido.mostrarResumen();

        pedido.cambiarEstado(EstadoPedido.LISTO_PARA_ENTREGAR);
        pedido.cambiarEstado(EstadoPedido.ENTREGADO);

        pedido.mostrarResumen();
    }
}
