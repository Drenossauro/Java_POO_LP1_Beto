package lp.arvore;

public class Teste {
    public static void main(String[] args) {
        //istanciar
        Tree testTree = new Tree();
    
        testTree.inserir(9, testTree.root);
        testTree.inserir(5, testTree.root);
        testTree.inserir(14, testTree.root);
        testTree.inserir(2, testTree.root);
        testTree.inserir(7, testTree.root);
        testTree.inserir(2, testTree.root);
        testTree.inserir(11, testTree.root);
        testTree.inserir(16, testTree.root);
        testTree.inserir(14, testTree.root);
        testTree.inserir(17, testTree.root);
       
        
        

        testTree.procurar(testTree.root, 14);


        System.out.println(testTree);
    }
}
