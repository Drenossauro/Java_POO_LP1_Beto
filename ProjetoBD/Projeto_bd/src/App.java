import java.util.List;

public class App {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        // abrir uma conexao com bd mysql
        // chamar um metodo static
        // ConnectionFactory.createConnection();

        // User vitor = new User();

        // vitor.setUsername("eduardo");
        // vitor.setPassword("admin");
        // vitor.setStatus(1);
        // vitor.setToken(3.1415);

        // userRepository.save(vitor);

        // salvar o obj do tipo user noBD
        // UserRepository userRepository = new UserRepository();
        // userRepository.selectAll();
        // UserRepository userRepository = new UserRepository();

        //Buscar todos os usuarios-----------------------------------------------------------
        // List<User> usuarios = userRepository.selectAll();
        // for (User u : usuarios) {
        //     System.out.println(u);
        // }

        //buscar um unico usuario pelo id ---------------------------------------------------
        // User loc = userRepository.getOne(2);
        // if(loc != null){
        //     System.out.println("Usuario encontrado!\n" + loc);
        // }else{
        //     System.out.println("Usuario encontrado!");
        // }

    }
}
