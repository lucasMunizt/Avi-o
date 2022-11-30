import Execoes.AviaoLotadoException;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                int l = 0;
               int confirmar= 0;
                String nome=null;
                String cpf=null;
                int leId=0;
                Scanner b = new Scanner(System.in);
                Passageiros pa = new Passageiros("PEDRO","100");
                Passagem ba = new Passagem();
                while(l != 6) {
                    System.out.println("1:Comprar a passagem:");
                    System.out.println("2:Alterar o assento:");
                    System.out.println("3:Alterar a titulariedade da rezerva:");
                    System.out.println("4:Cancela a reserva:");
                    System.out.println("5:Lista de passageiros:");
                    System.out.println("6:Sair:");
                    l = b.nextInt();
                    switch (l) {
                    case 1:
                        try {
                            Voo.adicionar();
                            while (confirmar != 1) {
                                System.out.println("Digite sua origem");
                                String leitura = b.next();
                                Voo.checaOLocal(leitura);
                                System.out.println("Digite sua Destino");
                                String leitura1 = b.next();
                                Voo.checaOLocal(leitura1);
                                Voo a = new Voo(leitura,leitura1);
                                System.out.println("Confirmar");
                                System.out.println("1:sim");
                                System.out.println("2:nao");
                                 confirmar = b.nextInt();
                               // ba.AddPassageiro(confirmar);
                                if (confirmar == 1) {
                                    System.out.println("Digite seu nome: ");
                                    pa.setNome(nome = b.next());
                                    System.out.println("Digite seu cpf: ");
                                    pa.setCpf(cpf = b.next());
                                }
                                System.out.println("Confirmar compra de parsagem ");
                               // String confirmar1 = b.next(ba.AddPassageiro(ba.AssentoAleatorio(),pa));
                                System.out.println("\nnome: " + pa.getNome() + "\ncpf: " + pa.getCpf() + "\norigem: " + leitura + " Destino " + leitura1 +
                                        "\n"+"Assento: " +ba.AssentoAleatorio()+"\n"+"ID: "+ba.IdAleatorio());
                            }
                        } catch (Execoes.LocalInvalidoException e) {
                            System.out.println("Erro");
                        }
                        break;
                        case 2:
                            System.out.println("Digite o id da sua passagem");
                            break;
                        case 3:
                                break;
                        case 4:
                                break;
                        case 5:
                            System.out.println("ola "+ba.ListarPassageiros());
                            break;
                        case 6:
                            break;
                    }
            }
    }
 }


