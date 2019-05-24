
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

    private int numeroOpositor;
    private String NIF;
    private String apellido1;
    private String apellido2;
    private String nombre;

    public Persona(int numeroOpositor, String NIF, String apellido1, String apellido2, String nombre) {
        this.numeroOpositor = numeroOpositor;
        this.NIF = NIF;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
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
