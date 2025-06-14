package domain.service;
import domain.model.Empleado;

public class PagoService {
    public double calcularPago(Empleado empleado){
        return empleado.calcularSalario();
    }
}
