package univs.edu.notificacao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import univs.edu.dao.GenericDAO;
import univs.edu.usuario.Usuario;

public class NotificacaoTableModel extends AbstractTableModel {

    GenericDAO dao = new GenericDAO();
    private List<Notificacao> notificacoes = new ArrayList<>();
    private String[] colunas = {"ID", "Remetente", "Data de Envio", "Cidade da Ocorrência"};
    
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
                Usuario usuario = (Usuario) dao.pesquisarId(notificacao.getIdUsuario());
                return usuario.getNomeUsuario();
            case 2:
                return notificacao.getDataHoje();
            case 3:
                return notificacao.getCidadeOcorrencia();
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
        }
        return null;
    }

}
