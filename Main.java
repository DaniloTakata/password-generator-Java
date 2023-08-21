import br.com.code.controller.PasswordGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        String options = "\n** TIPO DE SENHA **" +
                "\n0 -> Letras minúsculas com números" +
                "\n1 -> Letras minúsculas e maiúsculas com números" +
                "\n2 -> Letras minúsculas e maiúsculas com números e caracteres especiais" +
                "\n3 -> Apenas números" +
                "\n4 -> Apenas letras minúsculas" +
                "\n5 -> Apenas letras maiúsculas" +
                "\n6 -> Apenas caracteres especiais" +
                "\nDigite a opção desejada: ";

        System.out.print("Digite o tamanho da senha: ");
        int passwordsLenght = sc.nextInt();

        System.out.println(options);
        int passwordsType = sc.nextInt();

        System.out.println(PasswordGenerator.generatePassword(passwordsLenght, passwordsType));

    }

}