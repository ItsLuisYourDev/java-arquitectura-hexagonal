package domain.port.in;
import domain.model.IdEmpleado;

public interface CalcularPagoUseCase {
    double calcularPago(IdEmpleado idEmpleado);
}
