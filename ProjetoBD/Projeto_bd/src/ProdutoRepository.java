import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoRepository {
    private  Connection conn = null;

    public ProdutoRepository(){
        this.conn = ConnectionFactory.createConnection();
    }

    public void save(Produto _produto){
        String pSql = "INSERT INTO tb_carro (nomeProduto, marcaProduto, precoProduto, categoria) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(pSql);
            ps.setString(1, _produto.getNomeProduto());
            ps.setString(2, _produto.getMarcaProduto());
            ps.setFloat(3, _produto.getPrecoProduto());
            ps.setString(4, _produto.getCategoria());

            //insert,update e delete
            ps.executeUpdate();

        } catch (Exception e) {
            //sys
           System.out.println("Erro: Não foi possivel inserir o usuário");
        }
    }

    public Produto getOne(int id){
        String sql = "SELECT * FROM tb_user WHERE id = ?";
        Produto p = new Produto();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setNomeProduto(rs.getString("nomeProduto"));
                p.setMarcaProduto(rs.getString("marcaProduto"));
                p.setPrecoProduto(rs.getFloat("precoProduto"));
                p.setCategoria(rs.getString("categoria"));
            }

        } catch (SQLException ps) {
            System.out.println("Erro:");
        }

        return null;
                
    }

}
