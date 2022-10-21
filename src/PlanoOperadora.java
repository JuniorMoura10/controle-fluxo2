public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B";

        switch (plano) {
            case "T":
                System.out.println("\n5Gb de Youtube");
                
            case "M":
                System.out.println("\nWhats e Instagram grátis");
                
            case "B":
                System.out.println("\n100 minutos de ligação");                
                break;

            default:
                System.out.println("\nFavor, escolher entre os planos B, M ou T");
                break;
        }
    }
}
