/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM108
 */
public class GestoraInformacion {

    private final float porcentajeAprobados = 0.85f;
    private final float porcentajeMeritos = 0.15f;

    public GestoraInformacion() {
    }

    /**
     * 
     * @param t1 es la nota total de la parte de aprobados.
     * @param t2 es la nota total de la parte de meritos.
     * @return la nota final de corte calculada a partir de sus porcentajes.
     */
    
    public Float calcularNotaDeCorte (Float t1, Float t2){
        Float notaFinal = 0f;
        notaFinal += t1 * porcentajeAprobados;
        notaFinal += t2 * porcentajeMeritos;
        return notaFinal;
    }
    
}
