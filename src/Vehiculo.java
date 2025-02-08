package com.example.vehiculos;


/**
 * Clase que representa un vehículo genérico.
 * <p>
 * Esta clase almacena información básica sobre un vehículo y proporciona
 * métodos para interactuar con sus propiedades.
 * </p>
 *
 * @author Roger Taylor
 * @version 1.2
 * @since 1.0
 */
public class Vehiculo {
    private String marca;
    private int anyo;
    private boolean desguazado;

    /**
     * Constructor para crear un objeto Vehiculo
     * @param marca Marca del vehículo
     * @param anyo Anyo de fabricación
     */
    public Vehiculo(String marca, int anyo) {
        this.marca = marca;
        this.anyo = anyo;
        this.desguazado = false;
    }

    /**
     * Obtiene la información básica del vehículo
     * @return Cadena con la marca y año del vehículo
     */
    public String obtenerInfo() {
        return "Marca: " + marca + ", Año: " + anyo;
    }

    /**
     * Marca el vehículo como desguazado
     * @param motivo Razón del desguace
     * @return Verdadero si se realizó el desguace correctamente
     * @deprecated Usar {@link #marcarComoDesguazado()} en su lugar
     */
    @Deprecated
    public boolean desguazar(String motivo) {
        this.desguazado = true;
        return true;
    }

    /**
     * Nueva implementación para marcar vehículo como desguazado
     * @since 1.1
     */
    public void marcarComoDesguazado() {
        this.desguazado = true;
    }

    /**
     * Verifica el estado del vehículo
     * @return true si el vehículo está desguazado
     */
    public boolean estaDesguazado() {
        return desguazado;
    }
}

    