public class Main {
    public static void main(String[] args) {
        // CREACION DE OBJETOS
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();
        Estudiante est3 = new Estudiante();
        System.out.println("----- AGREGAMOS LA INFORMACION DE ALUMNOS -----");
        // FUNCION PARA AGREGAR LOS ESTUDIANTES
        Funciones.addInfoEstudiantes(est1);
        Funciones.addInfoEstudiantes(est2);
        Funciones.addInfoEstudiantes(est3);
        // DESPLEGAMOS LOS ESTUDIANTES
        System.out.println("----- DESPLEGAMOS LA INFORMACION DE ALUMNOS -----");
        Funciones.desplegarEstudiantes(est1);
        Funciones.desplegarEstudiantes(est2);
        Funciones.desplegarEstudiantes(est3);
    }
}