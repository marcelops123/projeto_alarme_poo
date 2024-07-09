import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int escolha;
    static Scanner scan = new Scanner(System.in);

    static Pessoa user = new Pessoa();
    static ArrayList<Pessoa> pss = new ArrayList<Pessoa>();

    public static void main(String[] args) {
        System.out.println("---SISTEMA DE ALARMES---");
        System.out.println("---MENU---");
        System.out.println("Digite 1 para selecionar o cliente responsável");
        do {
        escolha = scan.nextInt();
        switch (escolha) {
            case 1: {
                System.out.println("Cadastro de usuário...");
                System.out.println("Digite o ID do usuário a ser cadastrado");
                Pessoa user = new Pessoa();
                int ID = scan.nextInt();
                String nome = scan.next();
                user.setId(ID);
                user.setNome(nome);
                pss.add(user);
            }
            case 2: {
                System.out.println("Pesquisa de usuário por ID");
                System.out.println("Digite o ID do usuário que deseja buscar");
                int idBusca = scan.nextInt();
                for(int i=0;i<pss.size();i++) {
                    if(pss.get(i).getId() == idBusca) {
                        System.out.println(pss.get(i).getId());
                        System.out.println(pss.get(i).getNome());
                        break;
                    } else
                        System.out.println("Usuário não cadastrado");
                }
            }
        }
        } while (escolha != 0);
    }
}
