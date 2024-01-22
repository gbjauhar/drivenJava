import java.util.Random;

public class App {
    public static void oQueEhEsseNumero(int num) {
        if (num == 0) {
            System.out.println(num + " é par");
        } else if (num > 0 && num % 2 == 0) {
            System.out.println(num + " é par e positivo");
        } else if (num > 0 && num % 2 != 0) {
            System.out.println(num + " é ímpar e positivo");
        } else if (num < 0 && num % 2 == 0) {
            System.out.println(num + " é par e negativo");
        } else {
            System.out.println(num + " é ímpar e negativo");
        }
    }

    public static void multiplicaAi(int num) {
        System.out.println("Tabela de multiplicação de " + num);
        for(int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }

    public static void duplicadosNao(String[] array1, String[] array2) {
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }

    public static void piramideDeNumeros(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(201) - 100;
        oQueEhEsseNumero(randomNumber);
        multiplicaAi(randomNumber);
        String [] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 =  {"Manga", "Caqui", "Morango", "Amora"};
        duplicadosNao(array1, array2);
        piramideDeNumeros(5);
    }
}
