import domain.model.Empleado;
import domain.model.IdEmpleado;
import infrastructure.config.ApplicationConfig;
import infrastructure.adapter.out.EmpleadoRepositoryImpl;

import java.util.UUID;
public class Main {

    public static void main(String[] args) {
        var empleadoRepository = new EmpleadoRepositoryImpl();
        var useCase = ApplicationConfig.crearCalcularPagoUseCase(empleadoRepository);

        IdEmpleado id = new IdEmpleado(UUID.randomUUID());
        empleadoRepository.guardar(new Empleado(id,"Luis",1200));

       double pago = useCase.calcularPago(id);
        System.out.println("Pago calculado: "+ pago);
        System.out.println("Pago calculado: "+ pago);
        System.out.println("Pago calculado: "+ pago);


    }
}