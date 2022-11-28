import java.util.ArrayList;
public class Voo {
    private String origem;
    private String passagam;
    private String destino;
    private static int assentosDisponiveis;
    private static double valor;
    private  ArrayList<Passageiros> passageiros;
    private int  numDeAssentos = 220;

    public Voo(String origem, String destino) {
        this.origem =origem;
        this.destino = destino;
        if(checaOLocal(origem) && checaOLocal(destino) && origem != destino){
            passageiros = new ArrayList<>();
            assentosDisponiveis = numDeAssentos;
        }
    }


    public static ArrayList<String> adi = new ArrayList<>();
    public void adicionar() {
        adi.add("FOR");
        adi.add("CGH");
        adi.add("SSA");
        adi.add("BSB");
        adi.add("MAO");
        for (int i = 0; i < adi.size(); i++) {
            System.out.println(adi.get(i));
        }
    }
    public boolean checaOLocal(String local) throws DestinoIvalido {
        for (int i = 0; i < adi.size(); i++) {
            if(local == adi.get(i)) {
                return true;
            }else {
                throw new LocalInvalidoException();
            }
        }
        return false;


    }

}
