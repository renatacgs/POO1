
package forca;

import java.util.Scanner;
        
public class Forca {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bem vindo ao jogo da forca. O jogo funciona da seguinte forma");
        System.out.println("Um jogador coloca uma palavra secreta, e em seguida o outro jogador tenta acertar chutando letras ao acaso. Boa sorte!");
        System.out.println("OBSERVAÇÃO: O tipo de caixa digitada não interfere no acerto do caractere");
        Scanner teclado = new Scanner(System.in); // cria um scanner      
        System.out.println("\nDigite uma palavra secreta para ser adivinhada!");        
        String palavra = teclado.next(); // cria um array para a palavra secreta
        palavra = palavra.toLowerCase();
        for (int i = 0; i < 100; i++) {
            System.out.print("\r\n");
        }
        int tamPalavra = palavra.length(); // cria um inteiro com o tamanho da palavra
        char[] adivinha = new char[tamPalavra]; // cria um array com os espacos e letras acertadas
        char[] letras = new char[26]; //cria um array para as letras ja utilizadas
        for (int i = 0; i < tamPalavra; i++) { //preenche o vetor adivinha com espaços
            adivinha[i] = '_';
        }
        System.out.println("A palavra tem " +tamPalavra+ " letras"); // printa o tamanho da palavra a ser adivinhada
        boolean acertou  = false;  // variavel para saber se o jogador ja acertou a palavra
        int x =0; // variavel para contar as rodadas e as letras digitadas        
        while (0 < 1) {  //cria um laço infinito para que o jogador jogue até que acerte a palavra
            if(acertou == false){       //verifica se o jogador ja acertou a palavra
                System.out.println(" ");
                for (int i = 0; i < tamPalavra; i++) {   
                    System.out.print(" " +adivinha[i]);
                }
                boolean digitada = false;  // inicia a variavel como false para verificar se a palavra ja foi digitada
                System.out.println("\n\nEscolha uma letra !");
                letras[x] = teclado.next().charAt(0);
                String letra = Character.toString(letras[x]);
                letra = letra.toLowerCase();
                letras[x] = letra.charAt(0);
                
                if(x > 0){           // verifica se a letra ja foi digitada 
                    for (int i = x-1; i >= 0; i--) {
                        if(letras [i] == letras[x]){
                            System.out.println("Voce já digitou esta letra:");
                            digitada = true;
                            break;
                        }
                    }
                }
                if(digitada == false ){  //caso a letra nao tenha sido escolhida, verifica se ela pertence a palavra secreta
                    for (int i = 0; i < tamPalavra; i++) {
                        if(letras[x] == palavra.charAt(i)){
                            adivinha[i] = letras[x];
                        }
                    }
                    System.out.print("\nVoce ja usou as letras : ");
                    for (int i = 0; i <= x; i++) {
                        System.out.print( letras[i]+ " , ");
                    }                        
                }
                int contTraco=0; // usando um contador verifica quantos traços existe no array adivinha
                for (int i = 0; i < tamPalavra; i++) {
                    if(adivinha[i] == '_')
                        contTraco++;
                }
                if(contTraco == 0) // se o numero de tracos for 0 o jogador adivinhou a palavra e a variavel acertou recebe true
                    acertou =true;
                x++;
            }
            else{ // caso o jogador tenha acertado exibe uma mensagem de vitoria e encerra o jogo
                System.out.println("\n\n\nParabéns você ganhou! A palavra era " +palavra);
                break;
            }
        }
    }
}
    

