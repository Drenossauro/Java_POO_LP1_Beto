// import java.sql.Connection;
// import java.sql.Date;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;


// public class CarroRepository {
//     private Connection conn = null;
 

//     public CarroRepository(){
//         //nao tratar exeções no construtor
//         this.conn = ConnectionFactory.createConnection();
//     }

//     public void save(Carro _carro){
//         String cSql = "INSERT INTO tb_carro (name, dt_fabricacao, valor) VALUES (?, ?, ?)";
//         try {
//             //pre compilada
//             //instrução sql pre-estabelecidas
//             PreparedStatement ps = conn.prepareStatement(cSql);
//             ps.setString(1, _carro.getName());
//             ps.setDate(2, Date.valueOf(_carro.getDt_fabricacao()));
//             ps.setDouble(3, _carro.getValor());

//             //insert,update e delete
//             ps.executeUpdate();
            


//         } catch (SQLException e) {
//             // TODO Auto-generated catch block

//             System.out.println("Error: Não foi possivel inserir o carro");
//             e.printStackTrace();
//         }
//     }

//     public void selectAll(){

//     }

//     public void update(User _user){

//     }

//     public void delete(User _user){

//     }

// }
