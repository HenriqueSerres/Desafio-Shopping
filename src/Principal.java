import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Data finalDate = new Data(20,10,2023);
        finalDate.setDia(20);
        finalDate.setMes(10);
        finalDate.setAno(2023);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a opção:\n(1) criar uma loja\n(2) criar um produto\n(3) sair");
        byte option = sc.nextByte();
        while (option != 3) {
            if (option == 1) {
                Loja.criaLoja();
            } else if (option == 2) {
                System.out.println(finalDate);
            } else {
                System.out.println("Opção inválida");
            }
            System.out.println("Escolha a opção:\n(1) criar uma loja\n(2) criar um produto\n(3) sair");
            option = sc.nextByte();
        }
        sc.close();
    }
}