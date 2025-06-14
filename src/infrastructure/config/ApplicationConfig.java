package infrastructure.config;
import application.service.CalcularPagoService;
import domain.port.in.CalcularPagoUseCase;
import domain.service.PagoService;
import infrastructure.adapter.out.EmpleadoRepositoryImpl;

public class ApplicationConfig {
    public static CalcularPagoUseCase crearCalcularPagoUseCase(EmpleadoRepositoryImpl empleadoRepository){
        var pagoServicio = new PagoService();
        return new CalcularPagoService(empleadoRepository,pagoServicio);
    }
}
