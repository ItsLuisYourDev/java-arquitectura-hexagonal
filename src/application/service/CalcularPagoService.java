package application.service;

import  domain.model.Empleado;
import domain.model.IdEmpleado;
import domain.port.in.CalcularPagoUseCase;
import domain.port.out.EmpleadoRepository;
import domain.service.PagoService;

public class CalcularPagoService implements CalcularPagoUseCase {
    private final EmpleadoRepository empleadoRepository;
    private final PagoService pagoService;

    public CalcularPagoService(EmpleadoRepository empleadoRepository, PagoService pagoService){
        this.empleadoRepository = empleadoRepository;
        this.pagoService = pagoService;
    }
    @Override
    public double calcularPago(IdEmpleado idEmpleado){
        Empleado empleado = empleadoRepository.buscarPorId(idEmpleado)
                .orElseThrow(()-> new RuntimeException("Empleado no encontrado"));

        return pagoService.calcularPago(empleado);
    }

}
