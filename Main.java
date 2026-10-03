//Nomes Integrantes:
//    Josue Nonalaya;
//    Mariana Schneider;
//    Heitor Gonçalves;

import java.util.Scanner;

class Main{
    public static void main (String[] args){

        Arvore arvoreMorse = new Arvore();
        arvoreMorse.inicializar();

        //Adicionando cada letra na arvore
        arvoreMorse.adicionar(".-", "A");
        arvoreMorse.adicionar("-...", "B");
        arvoreMorse.adicionar("-.-.", "C");
        arvoreMorse.adicionar("-..", "D");
        arvoreMorse.adicionar(".", "E");
        arvoreMorse.adicionar("..-.", "F");
        arvoreMorse.adicionar("--.", "G");
        arvoreMorse.adicionar("....", "H");
        arvoreMorse.adicionar("..", "I");
        arvoreMorse.adicionar(".---", "J");
        arvoreMorse.adicionar("-.-", "K");
        arvoreMorse.adicionar(".-..", "L");
        arvoreMorse.adicionar("--", "M");
        arvoreMorse.adicionar("-.", "N");
        arvoreMorse.adicionar("---", "O");
        arvoreMorse.adicionar(".--.", "P");
        arvoreMorse.adicionar("--.-", "Q");
        arvoreMorse.adicionar(".-.", "R");
        arvoreMorse.adicionar("...", "S");
        arvoreMorse.adicionar("-", "T");
        arvoreMorse.adicionar("..-", "U");
        arvoreMorse.adicionar("...-", "V");
        arvoreMorse.adicionar(".--", "W");
        arvoreMorse.adicionar("-..-", "X");
        arvoreMorse.adicionar("-.--", "Y");
        arvoreMorse.adicionar("--..", "Z");

        arvoreMorse.adicionar(".----", "1");
        arvoreMorse.adicionar("..---", "2");
        arvoreMorse.adicionar("...--", "3");
        arvoreMorse.adicionar("....-", "4");
        arvoreMorse.adicionar(".....", "5");
        arvoreMorse.adicionar("-....", "6");
        arvoreMorse.adicionar("--...", "7");
        arvoreMorse.adicionar("---..", "8");
        arvoreMorse.adicionar("----.", "9");
        arvoreMorse.adicionar("-----", "0");



        Scanner scanner = new Scanner(System.in);

        System.out.println("#################### ARVORE ####################");
        arvoreMorse.exibirArvore();

        System.out.println("Digite o seu codigo morse para tradução: ");
        String codigo = scanner.nextLine();

        System.out.println("\n MORSE: " + codigo);
        System.out.println("TRADUÇÃO: " + arvoreMorse.buscar(codigo));



    }
}