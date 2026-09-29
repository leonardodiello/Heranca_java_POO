public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public void empinar(){
        System.out.println("A moto está empinada");
    }

    @Override
    public void mover() {
        System.out.print("A moto está se movendo.");
    }
}