import java.util.ArrayList;
import java.util.Random;

public  class  Voo {
    private String origem;

    private Cliente cliente;
    private String destino;
    private int assentosDisponiveis;
    private  ArrayList<Cliente> passageiros;
    private int AssentosOcupados;
    private Assento NumDeAssentos[] = new Assento[220];
    private double ValorDaPassagem;
    private Passagem passagem;
    private  int id;
   // private int assento;
    private static int assento;
    private int numPassageiros = 0;
    private int valorTotal;

    public  Voo(String origem, String destino)  throws Execoes.LocalInvalidoException {
        this.origem =origem;
        this.destino = destino;
        if(checaOLocal(origem) && checaOLocal(destino) && origem != destino){
            passageiros = new ArrayList<>();
            assentosDisponiveis = NumDeAssentos.length;
          }else {
                throw new Execoes.LocalInvalidoException();
            }
    }

//    public  void  cancelarReserva ( Reserva  reserva ){
//        valorTotal -= reserva . obterValor ();
//        assentosOcupados . remove ( assentosOcupados . indexOf ( reserva . getNumAssento ()));
//        passageiros . remove ( reserva . getCliente ());
//        numPassageiros --;
//        numAssentosDisponiveis ++;
//        checaPassageiros ();
//    }



    public  int AddPassageiro( Cliente p) throws Execoes.AviaoLotadoException {
        int lugar = this.AssentoAleatorio();
        if(lugar<this.NumDeAssentos.length && lugar>=0){
            if (NumDeAssentos[lugar]==null){
                Assento a = new Assento();
                a.setPassageiros(p);
                this.NumDeAssentos[lugar]=a;
                AssentosOcupados++;
                return setAssento(lugar,AssentoAleatorio());
            }else{
                while(NumDeAssentos[lugar] != null){
                    lugar++;
                }
                Assento a = new Assento();
                a.setPassageiros(p);
                this.NumDeAssentos[lugar]=a;
                AssentosOcupados++;
                return setAssento(lugar,AssentoAleatorio());
            }
        }else {
            throw new Execoes.AviaoLotadoException();
        }
    }

    public double ValordaPassgem(){
        for(int j=0;j<this.NumDeAssentos.length;j++){
            if (AssentosOcupados>0){
                ValorDaPassagem = (100+Math.pow( 5,Math.log10(AssentosOcupados)));
                break;
            }
            if(AssentosOcupados<=6){
                ValorDaPassagem = (100+Math.pow( 5,Math.log10(AssentosOcupados)+50));
                break;
            }
        }
        return ValorDaPassagem;
    }
    public  void  ListarPassageiros (){
        for ( int  i = 0 ; i < this.NumDeAssentos.length ; i ++){
            if ( NumDeAssentos[ i ]!= null )
                System.out.println("Passageiro: " + NumDeAssentos [ i ]. getPassageiros (). getNome ()+ " \nCPF " + NumDeAssentos [ i ].
                        getPassageiros (). getCpf () + "\nAssento " +NumDeAssentos[i].getGuadarassento()+ "\nID: " + getId() +"\nvalor total:" + ValordaPassgem()*AssentosOcupados);
        }
    }
    public int IdAleatorio(){
        Random aleatorio = new Random();
        id = aleatorio.nextInt(220)+1;
        return getId();
    }
    public int AssentoAleatorio(){
            Random al = new Random();
            return  (al.nextInt(220)+1);
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  int getAssento() {
        return assento;
    }

    public  int setAssento(int lugar,int assento) {
        NumDeAssentos[lugar].setGuadarassento(assento);
        return lugar;
    }

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void setAssentosDisponiveis(int assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public int getAssentosOcupados() {
        return AssentosOcupados;
    }

    public void setAssentosOcupados(int assentosOcupados) {
        AssentosOcupados = assentosOcupados;
    }

    public Assento[] getNumDeAssentos() {
        return NumDeAssentos;
    }

    public void setNumDeAssentos(Assento[] numDeAssentos) {
        NumDeAssentos = numDeAssentos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}



