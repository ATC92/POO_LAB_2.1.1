public class Estudiante {
    private String NombreCompleto;
    private int Matricula;
    private String Correo;
    // Constructor
    public Estudiante() {
        this.NombreCompleto = "";
        this.Matricula = 0;
        this.Correo = "";
    }
    // Getters
    public int getMatricula() {
        return Matricula;
    }
    public String getCorreo() {
        return Correo;
    }
    public String getNombreCompleto() {
        return NombreCompleto;
    }

    // Setters
    public void setMatricula(int matricula) {
        this.Matricula = matricula;
    }
    public void setCorreo(String correo) {
        this.Correo = correo;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.NombreCompleto = nombreCompleto;
    }

    // Set&&Get
    public void setgetMatricula(int matricula) {
        if(matricula > 0) {
            this.Matricula = matricula;
            System.out.println("Matricula del alumno: " + this.Matricula);
        }
        else
            System.out.println("Matricula del alumno: " + this.Matricula);

    }
    public void setgetCorreo(String correo) {
        if(!correo.isEmpty()){
            this.Correo = correo;
            System.out.println("Correo del alumno: " + this.Correo);
        }
        else
            System.out.println("Correo del alumno: " + this.Correo);
    }
    public void setgetNombreCompleto(String nombreCompleto) {
        if(!nombreCompleto.isEmpty()){
            this.NombreCompleto = nombreCompleto;
            System.out.println("Nombre del alumno: " + this.NombreCompleto);
        }
        else
            System.out.println("Nombre del alumno: " + this.NombreCompleto);
    }
}
