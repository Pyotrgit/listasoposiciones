
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adryp
 */
public class Persona implements Serializable, Comparable<Persona> {

    // Datos de Notas
    private int numeroOpositor;
    private String NIF;
    private String apellido1;
    private String apellido2;
    private String nombre;
    private float examenParte1;
    private float examenParte2;
    private float notaExamen;
    
    // Datos de Meritos
    private float experiencia;
    private float titulos;
    private float cursos;
    private float notaExperiencia;

    public Persona(int numeroOpositor, String NIF, String apellido1, String apellido2, String nombre,float examenParte1,float examenParte2,float notaExamen ,float experiencia,float titulos, float cursos, float notaExperiencia) {
        this.numeroOpositor = numeroOpositor;
        this.NIF = NIF;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.examenParte1=examenParte1;
        this.examenParte2=examenParte2;
        this.notaExamen=notaExamen;
        
        this.experiencia=experiencia;
        this.titulos=titulos;
        this.cursos=cursos;
        this.notaExperiencia=notaExperiencia;
    }

    
    public float getExamenParte1() {
        return examenParte1;
    }

    public void setExamenParte1(float examenParte1) {
        this.examenParte1 = examenParte1;
    }

    public float getExamenParte2() {
        return examenParte2;
    }

    public void setExamenParte2(float examenParte2) {
        this.examenParte2 = examenParte2;
    }

    public float getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(float notaExamen) {
        this.notaExamen = notaExamen;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    public float getTitulos() {
        return titulos;
    }

    public void setTitulos(float titulos) {
        this.titulos = titulos;
    }

    public float getCursos() {
        return cursos;
    }

    public void setCursos(float cursos) {
        this.cursos = cursos;
    }

    public float getNotaExperiencia() {
        return notaExperiencia;
    }

    public void setNotaExperiencia(float notaExperiencia) {
        this.notaExperiencia = notaExperiencia;
    }

    
    public int getNumeroOpositor() {
        return numeroOpositor;
    }

    public void setNumeroOpositor(int numeroOpositor) {
        this.numeroOpositor = numeroOpositor;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona t) {
        if (t == null) {
            //Primero salen los null
            //return 1;
            //Los últimos son los null
            return -1;
        }

        int[] criterios = {
            this.NIF.compareTo(t.NIF),
            this.nombre.compareTo(t.nombre),
            this.apellido1.compareTo(t.apellido1),
            this.apellido2.compareTo(t.apellido2)
        };
        for (int unCriterio : criterios) {
            if (unCriterio != 0) {
                return unCriterio;
            }
        }
        return 0;
    }

}
