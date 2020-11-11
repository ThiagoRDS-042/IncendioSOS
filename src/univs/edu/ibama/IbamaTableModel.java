package univs.edu.ibama;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import univs.edu.dao.GenericDAO;

public class IbamaTableModel extends AbstractTableModel {

    GenericDAO dao = new GenericDAO();
    private List<Ibama> ibamas = new ArrayList<>();
    private String[] colunas = {"Nome", "E-mail", "Cidade", "Rua", "Telefone"};

    public IbamaTableModel(List<Ibama> ibamas) {
        this.ibamas = ibamas;
    }

    @Override
    public int getRowCount() {
        return ibamas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ibama ibama = ibamas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ibama.getNomeIbama();
            case 1:
                return ibama.getEmailIbama();
            case 2:
                return ibama.getCidadeIbama();
            case 3:
                 return ibama.getRuaIbama();
            case 4:
                return ibama.getTelefoneIbama();
        }
        return null;
    }

    @Override
    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
        }
        return null;
    }

}
