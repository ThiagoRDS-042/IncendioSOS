package univs.edu.bombeiro;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import univs.edu.dao.GenericDAO;

public class CorpoDeBombeirosTableModel extends AbstractTableModel {

    GenericDAO dao = new GenericDAO();
    private List<CorpoDeBombeiros> bombeiros = new ArrayList<>();
    private String[] colunas = {"Identificação", "E-mail", "Cidade", "Rua", "Telefone"};

    public CorpoDeBombeirosTableModel(List<CorpoDeBombeiros> bombeiros) {
        this.bombeiros = bombeiros;
    }

    @Override
    public int getRowCount() {
        return bombeiros.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CorpoDeBombeiros bombeiro = bombeiros.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bombeiro.getCompanhiaBatalhao();
            case 1:
                return bombeiro.getEmailBombeiro();
            case 2:
                return bombeiro.getCidadeBombeiro();
            case 3:
                 return bombeiro.getRuaBombeiro();
            case 4:
                return bombeiro.getTelefoneBombeiro();
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
