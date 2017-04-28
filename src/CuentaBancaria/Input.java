package CuentaBancaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam125
 */
public class Input {
    
    private static  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    /**
     * MÃ©todo para  leer la entrada por teclado convertida a tipo byte.
     * Se pide la entrada de datos hasta que el dato proporcionado sea compatible
     * con el valor de retorno.
     * @return byte - Devuelve lo que se escriba por el teclado en formato byte.
     * @exception IOException
     */
      
    public static byte leerByte () throws IOException {
        boolean correcto;
        byte numero = 0;
        
        do {
            correcto = true;
            
            try {
                numero = Byte.parseByte(teclado.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Error: Valor no válido para variable tipo byte.\n");
                correcto = false;
            }
        } while (!correcto);

        return numero;
    }

    /**
     * MÃ©todo para leer la entrada por tecla convertida a tipo int.
     * Se pide la entrada de datos hasta que el dato proporcionado sea compatible
     * con el valor de retorno.
     * @return int - Devuelve lo que se escriba por el teclado en formato int.
     * @exception NumberFormatException
     */
    
    public static int leerEntero () throws IOException {
        boolean correcto;
        int numero =Integer.MIN_VALUE;
        

        do {
            correcto = true;
            System.out.print("dato entero ");
            try {
                numero = Integer.parseInt(teclado.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Error: Valor no válido para variable tipo int.\n");
                correcto = false;
            
            }
        } while (!correcto);

        return numero;
    }
    
    /**
     * Leer dato double
     * @return
     * @throws IOException 
     */
    
    protected static double leerDouble () throws IOException {
        double numero = 0;
        boolean correcto;
        
        do {
            correcto = true;
            try {
                 System.out.print("dato double ");
                numero = Double.parseDouble(teclado.readLine());
            } catch (NumberFormatException ex) { // double no válido
                System.out.println("El número introducido no es válido.\n");
                correcto = false;
            }
        } while (!correcto);

        return numero;
    }
    
    /**
 * Leer cadena
 * @return
 * @throws IOException 
 */
    
    public static String leerCadena () throws IOException {
	String cadena ="";
       
        try{
             
           cadena= teclado.readLine();
       }catch(IOException e){
        System.out.println("error I/O");
       }
       return cadena;
    }
    
}
