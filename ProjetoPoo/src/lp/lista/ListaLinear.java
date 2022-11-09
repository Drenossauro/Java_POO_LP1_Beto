package lp.lista;

public class ListaLinear {

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
    }

    // ----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Lista l = iniciarLista();
        l = addInicio(l, 10);
        l = addInicio(l, 5);
        l = addInicio(l, 1);
        l = addFim(l, 2);
        l = addFim(l, 3);
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

        if(isEmpty(l)){
            n1.prox = l.inicio;
            l.inicio = n1;
            l.fim = n1;
            return l;
        }

        n1.prox = l.inicio;
        l.inicio = n1;
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
        System.out.println("L -> ");
        No aux = l.inicio;
        while (aux != null) {
            System.out.println(aux.info + " -> ");
            aux = aux.prox;
        }

        System.out.println("NULL");
    }

}
