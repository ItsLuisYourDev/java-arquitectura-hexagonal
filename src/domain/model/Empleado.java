package domain.model;

public class Empleado {
    private final IdEmpleado id;
    private final String nombre;
    private final double salarioBase;

    public Empleado(IdEmpleado id,String nombre, double salarioBase){
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public IdEmpleado getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        // Aquí iría cualquier cálculo adicional o regla
        return salarioBase;
    }
}

