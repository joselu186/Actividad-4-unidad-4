package Restaurante;

import java.util.ArrayList;

public class Pedido {

    private static int contador = 1;

    private int id;
    private String nombreCliente;
    private ArrayList<Articulo> articulos;
    private EstadoPedido estado;

    public Pedido(String nombreCliente) {
        this.id = contador;
        contador++;
        this.nombreCliente = nombreCliente;
        this.articulos = new ArrayList<>();
        this.estado = EstadoPedido.EN_PREPARACION;
    }

    public boolean agregarArticulo(Articulo articulo) {
        if (articulos.size() < 5) {
            articulos.add(articulo);
            return true;
        }
        return false;
    }

    public double calcularTotal() {
        double total = 0;
        for (Articulo a : articulos) {
            total += a.getSubtotal();
        }
        return total;
    }

    public boolean cambiarEstado(EstadoPedido nuevoEstado) {
        if (nuevoEstado.ordinal() >= estado.ordinal()) {
            estado = nuevoEstado;
            return true;
        }
        return false;
    }

    public void mostrarResumen() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Estado: " + estado);
        System.out.println("Articulos:");
        for (Articulo a : articulos) {
            System.out.println(a.getNombre() + " x" + a.getCantidad() + " - " + a.getPrecioUnitario());
        }
        System.out.println("Total: " + calcularTotal());
    }
}

