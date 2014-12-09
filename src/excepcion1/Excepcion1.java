package excepcion1;



public class Excepcion1 {

    public static void main(String[] args) {

        Division obx = new Division(8, 4);

        try {
            System.out.println(obx.dividirthrows(8, 4));
        } catch (ArithmeticException ex) {
            System.out.println("erro2 " + ex.getMessage());
        }
        try{
            System.out.println(obx.dividirthrows(8, 0));
        }catch(ArithmeticException ex){
            System.out.println("Erro4"+ex.toString());
        }
        obx.dividircontrycatch(8, 4);
        System.out.println(obx.dividircontrycatch(8, 0));

    }

}
