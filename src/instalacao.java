//T.M
import java.util.Scanner;
public class instalacao{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
    String avista;
    double invest;
    double Energia;
    double P;
    double t;
    double C;
    double TUSD;
    double TE;
    double tarifa;
    double Parcela;
    double poten;
    double area;
    double Ganho;
    double payback;
    double juros;
    double valor;
    double PrazoPagamento;
    double PrestaValor;
    double TotalPago;
    double conta;
    double TempoRetorno;
    double I;

    System.out.printf("Tarifa TUSD:");
    TUSD = ler.nextDouble();

    System.out.printf("Tarifa TE:");
    TE = ler.nextDouble();

    System.out.printf("Consumo de energia atual(kWh):");
    P = ler.nextDouble();

    System.out.printf("Tempo de cunsumo:");
    t = ler.nextDouble();
 
    Energia = P * t;
    tarifa = TE + TUSD;
    C = Energia * tarifa;

    System.out.printf("Foi a vista ou a prazo? ");
    avista = ler.nextLine();

    switch (avista){

        case "a vista":
        System.out.printf("qual o valor? ");
        valor = ler.nextDouble();
        break;

        case "a prazo":
        System.out.printf("qual o parcelamento de juros? ");
        Parcela = ler.nextDouble();
        System.out.printf("Qual a taxa de juros da parcela?");
        I = ler.nextDouble();
        break;
    }

    System.out.printf("Qual o prazo de pagamento do financiamento?");
    PrazoPagamento = ler.nextDouble();

    // juros = Parcela + I + PrazoPagamento; ESTA COM PROBLEMAS 

    System.out.printf("Qual o valor da prestação?");
    PrestaValor = ler.nextDouble();

    System.out.printf("Custo do sistema: ");
    invest = ler.nextDouble();

    System.out.printf("Valor total da conta bancária atual:");
    conta = ler.nextDouble();

    // TotalPago = PrestaValor + juros + invest; ESTA COM PROBLEMAS
    Ganho = PrestaValor / conta;

    System.out.print("Potência das placas: ");
    poten = ler.nextDouble();

    System.out.printf("Área onde serão inseridos:");
    area= ler.nextDouble();

    payback = invest / Ganho;

    System.out.println("O tempo necessário para o retorno do investimento é de " + payback);
 }
}