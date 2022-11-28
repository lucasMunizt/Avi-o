import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner b = new Scanner(System.in);
            int l = 0;
             String leitura = null;
              String leitura1=null;
              int confirmar=0;
              String nome=null;
              String cpf=null;
            Passageiros pa = new Passageiros("Lucas","82376424042");
            Voo a = new Voo("Fortaleza","Manaus");
            while (l != 6) {
                    System.out.println("1:Comprar a passagem:");
                    System.out.println("6:Sair:");
                    l = b.nextInt();

                switch (l) {
                case 1:
                    a.adicionar();
                while (confirmar!=1) {
                     System.out.println("Digite sua origem");
                     leitura = b.next();
                     a.checaOLocal(leitura);
                     System.out.println("Digite sua Destino");
                     leitura1 = b.next();
                     a.checaOLocal(leitura1);
                    System.out.println("Confirmar");
                    System.out.println("1:sim");
                    System.out.println("2:nao");
                    confirmar= b.nextInt();
                    if (confirmar == 1) {
                        System.out.println("Digite seu nome: ");
                        nome = b.next();
                        System.out.println("Digite seu cpf: ");
                        cpf = b.next();
                    }
                }
                 System.out.println( "\nnome: "+nome +"\ncpf: "+ cpf +"\norigem: "+ leitura + " Destino " + leitura1);
                case 6:
                break;
                }
            }

    }

 }


