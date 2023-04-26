import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a opção:\n(1) criar uma loja\n(2) criar um produto\n(3) sair");
        byte option = sc.nextByte();
        while (option != 3) {
            if (option == 1) {
                Loja.criaLoja();
            } else if (option == 2) {
                Produto.criaProduto();
            } else {
                System.out.println("Opção inválida");
            }
            System.out.println("Escolha a opção:\n(1) criar uma loja\n(2) criar um produto\n(3) sair");
            option = sc.nextByte();
        }
        sc.close();
    }
}