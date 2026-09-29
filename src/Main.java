import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        var marcaCarro = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        var modeloCarro = scanner.nextLine();

        System.out.print("Digite o ano do carro: ");
        var anoCarro = scanner.nextInt();

        System.out.print("Digite a quantidade de portas do carro: ");
        var qtdPortas = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite a marca da moto: ");
        var marcaMoto = scanner.nextLine();

        System.out.print("Digite o modelo da moto: ");
        var modeloMoto = scanner.nextLine();

        System.out.print("Digite o ano da moto: ");
        var anoMoto = scanner.nextInt();

        System.out.print("Digite quantas cilindradas tem a moto: ");
        var cilindradas = scanner.nextInt();

        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, qtdPortas);

        Moto moto = new Moto(marcaMoto, modeloMoto, anoMoto, cilindradas);

        carro.exibirInformacoes();
        carro.abrirPortas();
        carro.mover();

        System.out.println("\n");

        moto.exibirInformacoes();
        moto.empinar();
        moto.mover();
    }
}