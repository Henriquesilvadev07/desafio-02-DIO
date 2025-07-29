import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String resposta = "s";
        int salario = 2300;
        String[] candidatos = new String[5];
        int idades[] = new int[5];
        

        try {
            while (resposta.equalsIgnoreCase("s")) {
                boolean cheio = true;
                System.out.println("1- Candidatar-se ");
                System.out.println("2-Ver Candidatos ");
                int r1 = sc.nextInt();
                    if (r1 == 1) {
                        sc.nextLine();
                        System.out.println("Qual o seu nome: ");
                        String nome = sc.nextLine();
                        
                        System.out.println("Qual a sua idade: ");
                        int idade = sc.nextInt();
                        System.out.println("Nosso salario base é de " + salario + " R$ reais, qual é a sua pretenção salarial? : ");
                            double pretencao = sc.nextDouble();
                            
                        if (pretencao <= salario) {
                            System.out.println("Okay! iremos retornar para você");
                            for (int i = 0; i < candidatos.length; i++) {
                                if (candidatos[i] == null) {
                                    candidatos[i] = nome;
                                    idades[i] = idade;
                                    cheio = false;
                                    break;
                                }
                            }
                            if (cheio) {
                                System.out.println("O limite de candidatos foi atingido, quem sabe na proxima.1");
                            }
                        }else if (pretencao > salario) {
                            System.out.println("Iremos ligar para renegociar");
                        }
                    }else if (r1 == 2) {
                        System.out.println("Candidatos cadastrados: ");
                        for (int i = 0; i < candidatos.length; i++) {
                            if (candidatos[i] != null) {
                                System.out.println((i + 1) + "-" + candidatos[i] + ", idade: " + idades[i]);
                            }
                        }
                    }
            }
        } catch (Exception e) {
            System.out.println("Verifique se não deixou informação em branco ou se usou apenas caracteres numericos nas opções,idades e pretenção");
            // TODO: handle exception
        }


    }
}
