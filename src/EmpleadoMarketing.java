public class EmpleadoMarketing extends Empleado{

    private String area;

    public EmpleadoMarketing(String nombre, String apellido, String dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de RRHH " + getNombre() + " Trabajando en  " + area  );
    }

    public void  trabajar (int horasextras) {
        System.out.println("Empleado de RRHH " + getNombre() + " Trabajando en  " + area + "con horas extras " + horasextras  );

    }


}
