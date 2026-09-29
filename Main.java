
class Main{
    public static void main (String[] args){

        Arvore arvoreMorse = new Arvore();
        arvoreMorse.inicializar();

        arvoreMorse.adicionar("...", "S");
        arvoreMorse.adicionar("---", "O");


        System.out.println(arvoreMorse.buscar("...")); // Saída: 'S';
        System.out.println(arvoreMorse.buscar("---")); // Saída: 'O';
        System.out.println(arvoreMorse.buscar("... --- ...")); // Saída: 'SOS';
    }
}