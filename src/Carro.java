public class Carro extends Veiculo{

    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas){
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    public void abrirPortas(){
        System.out.println("As " + quantidadePortas + " portas foram abertas");
    }

    @Override
    public void mover() {
        System.out.print("O carro está andando.");
    }
}