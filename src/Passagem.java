import Execoes.AviaoLotadoException;

import java.util.Random;
import java.lang.Math;
    public class Passagem{
    private  static int id;

    private  double valor;
    private int assento;
    private Assento NumDeAssentos[] = new Assento[220];

    private double ValorDaPassagem = (100 + Math.pow(5, Math.log10(0)));

    public String IdAleatorio(){
        Random aleatorio = new Random();
        id = aleatorio.nextInt(220)+1;
        return "Seu id e: "+ getId();
    }

    public int AssentoAleatorio(){
            Random al = new Random();
            assento = al.nextInt(220)+1;
            return  getAssento();

        }

    public  boolean AddPassageiro(int lugar, Passageiros p) throws Execoes.AviaoLotadoException {
        if(lugar<this.NumDeAssentos.length & lugar>=0){
            if (NumDeAssentos[lugar]==null){
                Assento a = new Assento();
                a.setPassageiros(p);
                this.NumDeAssentos[lugar]=a;
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }

    public String ListarPassageiros(){
        String listar="";
        for (int i=0; i<this.NumDeAssentos.length; i++){
            if (NumDeAssentos[i]!=null)
                listar+=" Passageiro: "+NumDeAssentos[i].getPassageiros().getNome()+" \nCPF "+NumDeAssentos[i].
                        getPassageiros().getCpf() + "\nAssento "+(i+1)+"\nID: "+id;
        }
        return listar;
    }
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Passagem.id = id;
    }
        public int getAssento() {
            return assento;
        }

        public void setAssento(int assento) {
            this.assento = assento;
        }


    }



