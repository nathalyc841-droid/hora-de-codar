
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Animal de Estimação Virtual!");

        System.out.println("Digite o nome do seu animal de estimação:");
        String nomePet = entrada.nextLine();

        System.out.println("Perfeito, o nome de seu pet será " + nomePet + "!");
        System.out.println("Agora vamos cuidar muito bem do seu novo amiguinho!");

        BichinhoVirtual pet = new BichinhoVirtual(nomePet);

        boolean continuar = true;

        while (continuar) {

            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Alimentar " + pet.nome);
            System.out.println("2. Brincar com " + pet.nome);
            System.out.println("3. Verificar o status de " + pet.nome);
            System.out.println("4. Ver nível de fome");
            System.out.println("5. Ver nível de felicidade");
            System.out.println("6. Descansar " + pet.nome);
            System.out.println("7. Sair");

            int escolha = entrada.nextInt();

            switch (escolha) {

                case 1:
                    pet.alimentar();
                    pet.passarTempo();
                    break;

                case 2:
                    pet.brincar();
                    pet.passarTempo();
                    break;

                case 3:
                    pet.verificarStatus();
                    break;

                case 4:
                    pet.verificarFome();
                    break;

                case 5:
                    pet.verificarFelicidade();
                    break;

                case 6:
                    pet.descansar();
                    pet.passarTempo();
                    break;

                case 7:
                    System.out.println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }

            if (continuar && pet.verificarFimDeJogo()) {
                continuar = false;
            }
        }

        entrada.close();
    }
}
