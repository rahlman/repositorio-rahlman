package CuentaBancaria;

/**
 *
 * @author dam125
 */
public class AppCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
        
        CuentaBancaria cuenta1 = new CuentaBancaria(500, "Titular1", "cuenta1" );
        CuentaBancaria cuenta2 = new CuentaBancaria(700, "Titular2", "cuenta1" );
        
        cuenta1.retirarDinero(100);
        cuenta1.ingresarDinero(100);
        cuenta1.establecerTipoDeInteres();
        
        cuenta1.estado=estadoCB.ACTIVADA;
        
        } catch (ErrorTipoDeInteresException e) {
        } catch (ErrorRetirarDineroException e) {
        } catch (ErrorIngresarDineroException e) {
        } catch (Exception e) {
        }
    }
    
}
