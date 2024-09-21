import java.util.Scanner;

public class Funciones {
    public static void addInfoEstudiantes(Estudiante estudiante) {
        // DECLARACION DE VARIABLES
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int matricula = 0;
        String correo = "";
        // INGRESO DE NOMBRES, MATRICULA Y CORREO.
        System.out.println("Ingresa nombre del estudiante: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa matricula del estudiante: ");
        matricula = sc.nextInt();
        // Consumimos el salto de linea pendiente
        sc.nextLine();
        System.out.println("Ingresa correo del estudiante: ");
        correo = sc.nextLine();
        System.out.println("\n\n");
        System.out.println("--- FORMA #1 ---");
        //  GUARDAMOS LOS VALORES INGRESADOS. (Forma #1)
        estudiante.setNombreCompleto(nombre);
        estudiante.setMatricula(matricula);
        estudiante.setCorreo(correo);
        System.out.println("\n\n");
        System.out.println("--- FORMA #2 ---");
        // GUARDAMOS LOS VALORES INGRESADOS. (Forma #2)
        estudiante.setgetNombreCompleto(nombre);
        estudiante.setgetMatricula(matricula);
        estudiante.setgetCorreo(correo);
        System.out.println("\n\n");
    }
    public static void desplegarEstudiantes(Estudiante estudiante) {
        // DESPLEGAMOS LOS ESTUDIANTES.
        System.out.println("Estudiante: " + estudiante.getNombreCompleto());
        System.out.println("Matricula: " + estudiante.getMatricula());
        System.out.println("Correo: " + estudiante.getCorreo());
        System.out.println("\n");
    }
}
