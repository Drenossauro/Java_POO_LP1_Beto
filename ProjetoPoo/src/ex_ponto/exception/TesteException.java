package ex_ponto.exception;

public class TesteException {
    public static void main(String[] args) {

        String frase = null;
        String novaFrase = null;

        try {
            // novaFrase = frase.toUpperCase();
        } catch (NullPointerException ex) {
            System.out.println("\nError: Frase Nula!\nUsando uma frase default!\n");
            frase = "\nEstou aprendendo";
            novaFrase = frase.toUpperCase();
        } catch (IllegalArgumentException ex) {
            System.out.println("\nArgumento Inválido!\n");
        }
        System.out.println("\nFrase amtiga: " + frase + "\n");
        System.out.println("\nFrase nova: " + novaFrase + "\n");


        // ====================================================================================================

        String novaMsg = null;
        String msgCaixaAlta;
        try {
            msgCaixaAlta = caixaAlta(novaMsg);
        } catch (NullPointerException e) {
            novaMsg = "\nNova Frase\n";
            msgCaixaAlta = caixaAlta(novaMsg);
            e.printStackTrace();
        }
        System.out.println("\nMsg Caixa Alta: " + msgCaixaAlta + "\n");
    }

    public static String caixaAlta(String msg) throws NullPointerException{
        // pode acontecer um nullPointerException
        String ca = msg.toUpperCase();
        return ca;

        

    }


}
