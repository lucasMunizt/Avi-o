import java.util.ArrayList;
public  class  Voo {
    private static  String origem;
    private static  String destino;
    private  int assentosDisponiveis;
    private  ArrayList<Passageiros> passageiros;
    private int numDEAssentos=220;

    public  Voo(String origem, String destino)  throws Execoes.LocalInvalidoException {
        this.origem =origem;
        this.destino = destino;
        if(checaOLocal(origem) && checaOLocal(destino) && origem != destino){
            passageiros = new ArrayList<>();
            assentosDisponiveis = numDEAssentos;
          }else {
                throw new Execoes.LocalInvalidoException();
            }
    }
    public static final ArrayList<String> adi = new ArrayList<>();
    public  static void adicionar() {

        adi.add("FOR");
        adi.add("CGH");
        adi.add("SSA");
        adi.add("BSB");
        adi.add("MAO");
        for(int i = 0; i < adi.size(); i++) {
            System.out.println(adi.get(i));
        }
    }
    public static boolean checaOLocal(String local)  {
        for(int i = 0; i < adi.size(); i++) {
            if(local.equals( adi.get(i))) {
                return true;
            }
        }
        return false;
    }

}
