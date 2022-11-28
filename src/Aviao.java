public class Aviao {

public Passageiros lugares[][];
private int fileira,assento;

    public Aviao(int fileira,int assento){
    lugares = new Passageiros[fileira][assento];
    this.fileira = fileira;
    this.assento = assento;
    }
    public boolean lugarVazio(int fileira,int assento) {
        if (lugares[fileira][assento] != null) {
            return true;
        }else {
            return false;
        }
    }

     public Passageiros getpassageiros(int fileira, int assento){
         if (lugares[fileira][assento] != null){
             return  lugares[fileira][assento];
         }else{
             return null;
         }

    }

    public void setpassageiros(int fileira, int assento, Passageiros cliente){
        lugares[fileira][assento] = cliente;
    }


}
