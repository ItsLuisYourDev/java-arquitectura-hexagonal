public class Empleado {
    private String nombre;
    private String apellido;
    private String cargo;
    private double salario;

    public Empleado(String nombre, String apellido, String cargo, double salario){
        this.nombre =  nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getCargo(){
        return this.cargo;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " Apellido: " + apellido
                + " Cargo: " + cargo
                + " Salario: " + salario
                ;
    }
}
