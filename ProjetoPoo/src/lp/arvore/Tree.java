package lp.arvore;

public class Tree {

    Node root = null;
    
    public void inserir(int info, Node node) {
        if (node == null) {
            root = new Node(info);
            return;
        }
        if (root.info > info) {
            // inserir a esquerda
            if (node.esq == null) {
                node.esq = new Node(info);
                return;
            }

            inserir(info, node.esq);

        } else {
            // inserir a direita
            if (node.dir == null) {
                node.dir = new Node(info);
                return;
            }

            inserir(info, node.dir);

        }

    }
    public boolean isNode(Node n){
        return n != null;
    }

    public void procurar(){}

    public void pre_ordem(Node node){
        if(node == null) {
            System.out.println("Árvore Vazia");
            return;
        }

        System.out.println(node.info);
        if(node.esq != null)
            pre_ordem(node.esq);

        if(node.dir != null)
            pre_ordem(node.dir);

        // System.out.println(node.info);
        // if(isNode(node.esq))
        //     pre_ordem(node.esq);

        // if(isNode(node.dir))
        //     pre_ordem(node.dir);


    }

    public void in_ordem(Node node){
        if(node == null) {
            System.out.println("Árvore Vazia");
            return;
        }
        



    }

    public void pos_ordem(){}


}
