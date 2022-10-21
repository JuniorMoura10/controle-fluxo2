public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 25.0;

        if (valorSolicitado <= saldo){
            saldo -= valorSolicitado;
            System.out.println("\nSaque efetuado com sucesso!\nNovo saldo: " + saldo);
        } else
            System.out.println("\nSaldo insuficiente!");    

        
    }
}
