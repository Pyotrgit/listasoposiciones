
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saleh
 */
class TableModel extends DefaultTableModel{

    private static Persona[] personas;

    public TableModel(Persona[] personas) {
    this.personas=personas;
    }

    
    
    @Override
    public int getRowCount() {
        return personas==null? 0 : personas.length;
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public String getColumnName(int i) {
        String[] nombres={"POSICION","NIF","APELLIDOS","NOMBRE","EX PART1","EX PART2","NOTA EXAMEN","EXPERIENCIA","TITULOS","CURSOS","NOTA EXPERIENCIA"};
    return nombres[i];
    }

    @Override
    public Class<?> getColumnClass(int i) {
        Class<?>[] lasClases={Integer.class,String.class,String.class,String.class,Float.class,Float.class,Float.class,Float.class,Float.class,Float.class,Float.class};
        
        return lasClases[i];
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int i, int i1) {

    Persona laPersona=personas[i];
    
    Object[] lasPersonas={laPersona.getNumeroOpositor(),laPersona.getNIF(),laPersona.getApellidos(),laPersona.getNombre(),
        laPersona.getExamenParte1(),laPersona.getExamenParte2(),laPersona.getNotaExamen(),laPersona.getExperiencia(),laPersona.getTitulos(),laPersona.getCursos(),laPersona.getNotaExperiencia()};
        
    return lasPersonas[i1];    
    }

     

}
