package univs.edu.notificacao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import univs.edu.dao.GenericDAO;
import univs.edu.usuario.Usuario;

public class NotificacaoTableModel extends AbstractTableModel {

    GenericDAO dao = new GenericDAO();
    private List<Notificacao> notificacoes = new ArrayList<>();
    private String[] colunas = {"Número", "Remetente", "Data de Envio", "Cidade", "Rua"};

    public NotificacaoTableModel(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    @Override
    public int getRowCount() {
        return notificacoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Notificacao notificacao = notificacoes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return notificacao.getIdNotificacao();
            case 1:
                Usuario usuario = notificacao.getUsuario();
                return usuario.getNomeUsuario();
            case 2:
                String[] nova = notificacao.getDataEnvio().split("-");
                return nova[0];
            case 3:
                return notificacao.getCidadeOcorrencia();
            case 4:
                return notificacao.getRuaOcorrencia();
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
