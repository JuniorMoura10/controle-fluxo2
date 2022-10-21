public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "A";

        switch(sigla){
            case "P":{
                System.out.println("PEQUENA");
                break;
            }
            case "M":{
                System.out.println("MÉDIA");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDA");
            

        }
    }
}
