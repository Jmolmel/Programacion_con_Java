package EjercicioTrasnparencia;

public class Alumno {

    // Atributos
    private String matricula = "LIBRE";
    private String nombre;
    private int edad;
    private int curso;
    private String modulo;
    private String numeroAlumno;

    // Constructores
    public Alumno() {
    }

    public Alumno(String matricula, String nombre, int edad, int curso, String modulo, String numeroAlumno) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.modulo = modulo;
        this.numeroAlumno = numeroAlumno;
    }

    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getnumeroAlumno() {
        return numeroAlumno;
    }

    public void setnumeroAlumno(String numeroAlumno) {
        this.numeroAlumno = numeroAlumno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Reset method
    public void reset() {
        if (this.numeroAlumno.equals(numeroAlumno)) {
            this.matricula = "LIBRE";
            this.nombre = null;
            this.edad = 0;
            this.curso = 0;
            this.modulo = null;
            this.numeroAlumno = null;
        }
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nNúmero Alumno: " + this.numeroAlumno;
        cadena += "\nEstado de matrícula: " + this.matricula;
        cadena += "\nNombre: " + this.nombre;
        cadena += "\nEdad: " + this.edad;
        cadena += "\nAño de curso: " + this.curso;
        cadena += "\nMódulo: " + this.modulo;
        cadena += "\n------------------------------------------";
        return cadena;
    }
    
}
