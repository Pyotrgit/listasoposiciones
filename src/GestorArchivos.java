
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adryp
 */
public class GestorArchivos {

    //En este archivo irán los datos de todas las personas.
    private final static String ARCHIVO_Notas = "./archivos/notasNotasFinal.txt";
    private final static String ARCHIVO_Meritos = "./archivos/notasMeritoFinal.txt";

    private static Persona[] personas;

    public static Persona[] leerNotas() {
        //crear el arrayList de los datos de todas las personas
        ArrayList<Persona> listaNotas=new ArrayList<Persona>();
        
        //leer Notas
        BufferedReader leerNotas=null;
        //leer Meritos
        BufferedReader leerMeritos=null;
        
        try {
            leerNotas=new BufferedReader(new FileReader(ARCHIVO_Notas));
            leerMeritos=new BufferedReader(new FileReader(ARCHIVO_Meritos));
            
            // leemos la linea de cada archivo
            String lineaLeidaNotas=leerNotas.readLine();
            String lineaLeidaMeritos=leerMeritos.readLine();
            
            while(lineaLeidaNotas!=null && lineaLeidaMeritos!=null){
            // convertimos en array el String leido y separamos el nombre de los apellidos
            String[] notasPersona=lineaLeidaNotas.split(";+");
            String[] nombreYapellidosNotas=notasPersona[2].split(",");
            
            String[] meritosPersona=lineaLeidaNotas.split(";+");
            //String[] nombreYapellidosMeritos=meritosPersona[2].split(",");
            
            // creamos una persona con todos los campos
            Persona laPersona=new Persona(Integer.parseInt(notasPersona[0]), notasPersona[1], nombreYapellidosNotas[0], nombreYapellidosNotas[1], Float.parseFloat(notasPersona[3]), Float.parseFloat(notasPersona[4]), Float.parseFloat(notasPersona[5]), Float.parseFloat(meritosPersona[3]), Float.parseFloat(meritosPersona[4]), Float.parseFloat(meritosPersona[5]),Float.parseFloat(meritosPersona[6]));
            listaNotas.add(laPersona);
            
            lineaLeidaNotas=leerNotas.readLine();
            lineaLeidaMeritos=leerMeritos.readLine();
        }
            
            // copiamos el ArrayList que contiene todas las personas en un array
            personas=new Persona[listaNotas.size()];
            personas=listaNotas.toArray(personas);
            
            return personas;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                leerMeritos.close();
                leerNotas.close();
            } catch (IOException ex) {
                Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }
    return null;
    }
}
