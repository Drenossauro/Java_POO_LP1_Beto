import java.util.List;

public class App {
    public static void main(String[] args) {
        // abrir uma conexao com bd mysql
        // chamar um metodo static
        // ConnectionFactory.createConnection();

        User vitor = new User();

        vitor.setUsername("vitor");
        vitor.setPassword("admin");
        vitor.setStatus(1);
        vitor.setToken(3.1415);

        UserRepository userRepository = new UserRepository();
        // userRepository.save(vitor);

        // salvar o obj do tipo user noBD
        // UserRepository userRepository = new UserRepository();
        // userRepository.selectAll();
        // UserRepository userRepository = new UserRepository();
        List<User> usuarios = userRepository.selectAll();

    }
}
