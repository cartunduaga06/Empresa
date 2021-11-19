public class Programa {
    public static void main(String[] args) {
        EmpleadoMarketing empleado1 = new EmpleadoMarketing("Roberto","andrade","123","comercial");
        empleado1.trabajar();
        empleado1.trabajar(4);
        System.out.println(empleado1.toString());

    }
}
