package univs.edu.denuncia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import univs.edu.dao.GenericDAO;
import univs.edu.usuario.Usuario;

public class DenunciaTableModel extends AbstractTableModel {

    GenericDAO dao = new GenericDAO();
    private List<Denuncia> denuncias = new ArrayList<>();
    private String[] colunas = {"Número", "Remetente", "Data de Envio", "Cidade", "Complemento"};

    public DenunciaTableModel(List<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }

    @Override
    public int getRowCount() {
        return denuncias.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Denuncia denuncia = denuncias.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return denuncia.getIdDenuncia();
            case 1:
                Usuario usuario = denuncia.getUsuario();
                return usuario.getNomeUsuario();
            case 2:
                String[] nova = denuncia.getDataEnvio().split("-");
                return nova[0];
            case 3:
                return denuncia.getCidade();
            case 4:
                return denuncia.getComplemento();
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
