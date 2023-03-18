
package Principal;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModeloTabla implements TableModel{
    
    List a;
    
    public ModeloTabla(List Estudiantes){
        this.a = Estudiantes;
    }

    @Override
    public int getRowCount() {//numero de filas que va a tener
        return a.size();
    }

    @Override
    public int getColumnCount() {//numero de columnas que va a tener
        return 9;
    }

    @Override
    public String getColumnName(int columnIndex) {//nombres de las columnas
        String titulo = null;
        switch(columnIndex){
            case 0:
                titulo = "Nombre";
                break;
            case 1:
                titulo = "Apellido";
                break;
            case 2:
                titulo = "Fecha de Nacimiento";
                break;
            case 3:
                titulo = "N° de Documento";
                break;
            case 4:
                titulo = "Tipo de Documento";
                break;
            case 5:
                titulo = "Celular";
                break;
            case 6:
                titulo = "Correo";
                break;
            case 7:
                titulo = "Nota";
                break;
            case 8:
                titulo = "Programa";
                break;
        }
        return titulo;        
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {//clase de la columna
        return String.class;        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {//si es editable
        return false;//quiero que ninguna celda sea editable
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {//mostrar los datos en la tabla
        Estudiante p = (Estudiante) a.get(rowIndex);
        
        String valor = null;
        
        switch(columnIndex){
            case 0:
                valor = p.nombre;
                break;
            case 1:
                valor = p.apellido;
                break;
            case 2:
                valor = p.Fecha_Naci;
                break;
            case 3:
                valor = p.numDoc;
                break;
            case 4:
                valor = p.tipoDoc;
                break;
            case 5:
                valor = p.celular;
                break;
            case 6:
                valor = p.correo;
                break;
            case 7:
                valor = p.nota;
                break;
            case 8:
                valor = p.programa;
                break;
        }
        return valor; 
           
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {//modificar los datos de la tabla

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    
}
