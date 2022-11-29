import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    // DAO = DATA ACCESS OBJETC => Antigamente
    // DAO => CRUD =>
    //         C > CREATE (INSERT INTO)
    //         R > READ (SELECT FROM)
    //         U > UPDATE (UPDATE SET)
    //         D > DELETE (DELETE FROM)

    private Connection conn = null;
 
    public UserRepository(){
        //nao tratar exeções no construtor
        this.conn = ConnectionFactory.createConnection();
    }

    public void save(User _user){
        String uSql = "INSERT INTO tb_user (username, password, status, token) VALUES (?, ?, ?, ?)";
        try {
            //pre compilada
            //instrução sql pre-estabelecidas
            PreparedStatement ps = conn.prepareStatement(uSql);
            ps.setString(1, _user.getUsername());
            ps.setString(2, _user.getPassword());
            ps.setInt(3, _user.getStatus());
            ps.setDouble(4, _user.getToken());

            //insert,update e delete
            ps.executeUpdate();
            


        } catch (SQLException e) {
            // TODO Auto-generated catch block

            System.out.println("Error: Não foi possivel inserir o usuário");
            e.printStackTrace();
        }
    }


    public User getOne(int id){
        String sql = "SELECT * FROM tb_user WHERE id = ?";
        return null;
    }
    //fazer hojee

    public List <User> selectAll(){
        String sql = "SELECT * FROM tb_user";

        List<User> users = new ArrayList<User>();

        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//retorna um conjunto resultados - varios

            while(rs.next()){ //buscar
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setToken(rs.getDouble("token"));
                System.out.println(
                    rs.getInt(1) + " - " + 
                    rs.getString("username") + " - " + 
                    rs.getString("password"));
            }

            System.out.println(rs);

        } catch (SQLException e) {
            System.out.println("Erro: Não foi possivel buscar os usuários");
            e.printStackTrace();
        }
         
        return users;


    }

    public void update(User _user){

    }

    public void delete(User _user){

    }





}
