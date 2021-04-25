import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         02) Faça um programa que receba três status do jogador: vida, ataque e defesa. A experiência do jogador (XP) é a média entre os três status. Imprima o nível do jogador conforme a seguir: 
         ● (0 a 25 XP): novato 
         ● (26 a 50 XP): mago 
         ● (51 a 75 XP) mago supremo 
         ● (76 a 100 XP) lorde das magias
         */
        Scanner input = new Scanner(System.in);

        int vida, ataque, defesa;
        System.out.println();
        System.out.print("Digite a vida do seu jogador: ");
        vida = input.nextInt();
        System.out.print("Digite o ataque do seu jogador: ");
        ataque = input.nextInt();
        System.out.print("Digite a defesa do seu jogador: ");
        defesa = input.nextInt();
        int media = (vida + ataque + defesa) / 3;
        System.out.println();

        if (media >= 0 & media <= 25) {
            System.out.println("O nível do seu jogador é " + media + "XP. Você é novato");
        } else if (media >= 26 & media <= 50) {
            System.out.println("O nível do seu jogador é " + media + "XP. Você é um mago");
        } else if (media >= 51 & media <= 75) {
            System.out.println("O nível do seu jogador é " + media + "XP. Você é um mago supremo");
        } else if (media >= 76 & media <= 100) {
            System.out.println("O nível do seu jogador é " + media + "XP. Você é um lorde das magias");
        } else {
            System.out.println("Atributos informados incorretos");
        }
        System.out.println();

        input.close();
    }
}
