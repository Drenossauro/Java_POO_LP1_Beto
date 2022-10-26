package ProjetoPoo.src.lp.lista;

public class ListaDuplamenteLigada {

    public static class Lista {
        public No inicio;// primeiro elementoda lista
        public int tam;//tamanho da lista
        public No fim;
        public No fimv2;
    } 

    // inner class
    public static class No {
        public int info;
        public No prox;//armazenando o proximo endereço do elemento
        public No anterior;
    }

    // ----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Lista l = iniciarLista();
        l = addInicio(l, 10);
        l = addInicio(l, 5);
        l = addInicio(l, 1);
        l = addFim(l, 2);
        // l = addFimv2(l, 3);
        l = addInicio(l, 4);
        // 1 = addMeio(1,4);
        printLista(l);

    }

    // -----------------------------------------------------------------------------------------------------------------------
    public static Lista iniciarLista() {
        Lista l = new Lista();
        l.inicio = null;
        l.tam = 0;
        return l;
    }

    // --------------------------------------------------------------------------------------------------------------------------

    public static Lista addInicio(Lista l, int val) {

        No n1 = new No();
        n1.info = val;
        n1.prox = l.inicio;
        l.inicio.anterior = n1;
        l.inicio = n1;

        if(isEmpty(l)){
            l.fim = n1;
        }

        l.tam++;
        return l;
    }

    // --------------------------------------------------------------------------------------------------------------------------

    public static boolean isEmpty(Lista l) {
        return l.tam == 0 ? true : false;
        //return l.inicio == 0;
    }


    // --------------------------------------------------------------------------------------------------------------------------

    public static Lista addMeio(Lista l, int val) {

        No n1 = new No();
        n1.info = val;
        n1.prox = l.inicio;
        l.inicio = n1;
        l.tam++;
        return l;
    }

    // ----------------------------------------------------------------------------------------------
    public static Lista addFim(Lista l, int val) {

        No novo = new No();
        novo.info = val;
        novo.prox = null;
        // verificar se a lista esta vazia | inicio == null
        if (l.inicio == null) {
            l.inicio = novo;
            l.tam++;
            return l;
        }
        No aux = l.inicio;
        while (aux.prox != null) {
            aux = aux.prox;
        }
        aux.prox = novo;
        return l;

    }
    // ---------------------------------------------------------------------------------------------------------

    public static Lista addFimv2(Lista l, int val) {

        if (isEmpty(l)){
            l = addInicio(l, val);//Leticia e Andre
            return l;
        }
        No novo = new No();
        novo.info = val;
        l.fim.prox = novo;
        l.fim = novo;  
        return l;      
    }


    // ---------------------------------------------------------------------------------------------------------
    public static void printLista(Lista l) {
        System.out.print("L -> ");
        No aux = l.inicio;
        while (aux != null) {
            System.out.print(aux.info + " -> ");
            aux = aux.prox;
        }

        System.out.println("NULL");
    }

}
