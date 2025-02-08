/**
 * Clase que representa un coche específico.
 * <p>
 * Extiende la funcionalidad básica de un vehículo añadiendo características
 * específicas de automóviles.
 * </p>
 *
 * @author Peter Parker
 * @version 1.0
 * @see com.example.vehiculos.Vehiculo
 * @since 1.0
 */
public class Coche extends com.example.vehiculos.Vehiculo {
    private int numPuertas;
    private double potenciaMotor;

    /**
     * Constructor para crear un objeto Coche
     * @param marca Marca del coche
     * @param anyo Año de fabricación
     * @param numPuertas Número de puertas
     * @param potenciaMotor Potencia del motor en caballos
     */
    public Coche(String marca, int anyo, int numPuertas, double potenciaMotor) {
        super(marca, anyo);
        this.numPuertas = numPuertas;
        this.potenciaMotor = potenciaMotor;
    }

    /**
     * Obtiene información detallada del coche
     * @return Cadena con todos los datos del coche
     * @see com.example.vehiculos.Vehiculo#obtenerInfo()
     */
    public String obtenerInfoCoche() {
        return super.obtenerInfo() +
                ", Puertas: " + numPuertas +
                ", Potencia: " + potenciaMotor + " CV";
    }

    /**
     * Calcula el impuesto de circulación basado en la potencia
     * @param tasaBase Importe base para el cálculo
     * @return Valor del impuesto a pagar
     */
    public double calcularImpuesto(double tasaBase) {
        return tasaBase * (potenciaMotor / 100);
    }

    /**
     * Actualiza la potencia del motor
     * @param nuevaPotencia Nueva potencia en caballos (debe ser mayor a 0)
     */
    public void actualizarPotencia(double nuevaPotencia) {
        if(nuevaPotencia > 0) {
            this.potenciaMotor = nuevaPotencia;
        }
    }
}
