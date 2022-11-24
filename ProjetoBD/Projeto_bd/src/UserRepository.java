import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

    public void selectAll(){

    }

    public void update(User _user){

    }

    public void delete(User _user){

    }





}
