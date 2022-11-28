public class App {
    public static void main(String[] args) {
        // abrir uma conexao com bd mysql
        //chamar um metodo static
        ConnectionFactory.createConnection();

        User beto = new User();
 
        beto.setUsername("beto");
        beto.setPassword("admin");
        beto.setStatus(1);
        beto.setToken(3.1415);

        // salvar o obj do tipo user noBD
        UserRepository userRepository = new UserRepository();
        userRepository.save(beto);
     
    }
}
