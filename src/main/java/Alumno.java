

/**
 *
 * @author Pablo
 */
public class Alumno {
    private int nota;
    private String nombre;
    private int numero;
    
    public Alumno (int nota, String nombre, int numero){
        this.nota = nota;
        this.nombre = nombre;
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int calcularnota(Alumno Alumno){
        int notas = 0;
        
        notas = notas + Alumno.getNota();
        return notas;
    }
}
