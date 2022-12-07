// import java.util.List;

public class App {
    public static void main(String[] args) {
        
        UserRepository userRepository = new UserRepository();
        
        
        // abrir uma conexao com bd mysql
        // chamar um metodo static
        // ConnectionFactory.createConnection();


        // ----------------------------------------------------------------------------------
        // SALVAR UM USUARIO
        // ----------------------------------------------------------------------------------

        // User vitor = new User();

        // vitor.setUsername("eduardo");
        // vitor.setPassword("admin");
        // vitor.setStatus(1);
        // vitor.setToken(3.1415);


        // salvar o obj do tipo user noBD
        // userRepository.save(vitor);
        // ----------------------------------------------------------------------------------



        // UserRepository userRepository = new UserRepository();
        // userRepository.selectAll();
        // UserRepository userRepository = new UserRepository();
        
        // ----------------------------------------------------------------------------------
        //BUSCAR TODOS OS USUARIOS
        // ----------------------------------------------------------------------------------
        // List <User> activeUsers = userRepository.getActiveUsers();
        // for (User u : activeUsers)
        // System.out.println(u);

        //BUSCAR UM UNICO USUARIO PELO ID
        // User loc = userRepository.getOne(2);

        // if(loc.getUsername() != null){
        //     System.out.println("Usuario encontrado!\n" + loc);
        // }else{
        //     System.out.println("Usuario não encontrado!");
        // }

        // ----------------------------------------------------------------------------------

        // ----------------------------------------------------------------------------------
        // DELETAR P USUARIO PELO ID /OBJ
        // ----------------------------------------------------------------------------------
        // if(userRepository.delete(1)){
        //     System.out.println("Usuário deletado!");
        // } else {
        //     System.out.println("Não foi possível deletar o usuário!");
        // }
        


    }
}
