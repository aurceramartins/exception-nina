/**
 * nesta clase imos capturar e tratar a excepcion
 */
package excepcion1;

public class Division {

    public Division() {
    }

    public Division(int nume, int deno) {

    }

    public int dividircontrycatch(int nume, int deno) {
        //tratamos a excepcion
        int resultado = 0;
        try {
            resultado = nume / deno; //se deno = 0 excepcion
            System.out.println("Despois da excepcion");

        } catch (ArithmeticException ex) {
            System.out.println("Erro :" + ex.getMessage());
        }
        return resultado;
    }

    public int dividirthrows(int nume, int deno) throws ArithmeticException {
        int resul = 0;
        if (deno == 0) 
            throw new ArithmeticException("non dividas entre 0");
          resul = nume / deno;
          System.out.println("despois da exception");
            
        return resul;
    }

}
