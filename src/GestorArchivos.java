
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
    private final static String ARCHIVO_PERSONAS = "";
    
    public static Persona[] leerPersonas(){
		
		Persona personaActual;
		ArrayList<Persona> solucion = new ArrayList<>();
		String infoPersonaActual[];
		try (BufferedReader lector = new BufferedReader(new FileReader(GestorArchivos.ARCHIVO_PERSONAS)))
		{
			do
			{
				infoPersonaActual = new String[]{lector.readLine()};
				if(infoPersonaActual[0] != null)
				{
					infoPersonaActual = infoPersonaActual[0].split(";");
					personaActual = new Persona(Integer.parseInt(infoPersonaActual[0]), 
									infoPersonaActual[1], 
									infoPersonaActual[2], 
									infoPersonaActual[3],
                                                                        infoPersonaActual[4]);
					solucion.add(personaActual);
				}
			}while(infoPersonaActual[0] != null);
			return solucion.toArray(new Persona[solucion.size()]);	
		} catch (FileNotFoundException ex)
		{
			Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex)
		{
			Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
}