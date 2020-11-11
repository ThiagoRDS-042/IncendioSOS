package univs.edu.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import univs.edu.dao.GenericDAO;

public class UsuarioTableModel extends AbstractTableModel {

    GenericDAO dao = new GenericDAO();
    private List<Usuario> usuarios = new ArrayList<>();
    private String[] colunas = {"Nome", "E-mail", "Cidade", "Rua", "Telefone", "Último Login"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getNomeUsuario();
            case 1:
                return usuario.getEmailUsuario();
            case 2:
                return usuario.getCidadeUsuario();
            case 3:
                return usuario.getRuaUsuario();
            case 4:
                return usuario.getTelefoneUsuario();
            case 5:
                return usuario.getUtimoLogin();
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
            case 5:
                return colunas[5];
        }
        return null;
    }

}
