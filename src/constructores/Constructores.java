package constructores;
/**
 *
 * @author adria
 */
public class Constructores {
    public static void main(String[] args) {
        persona obj = new persona();
        obj = new persona("mucho", "demaciado");
        
        camiones truck = new camiones();
        truck = new camiones("10", "100 km/h");
        
        correr rapido = new correr();
        rapido = new correr("10 litros", "10 km");
        
        filete trozo = new filete();
        trozo = new filete("Chido", "Tres cuartos");
        
        partido americano = new partido();
        americano = new partido("nike", "90 minutos");
    }
    
}
