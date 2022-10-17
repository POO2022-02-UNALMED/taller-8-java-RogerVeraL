package futbol;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Roger Vera
 */
public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;
    
    //constructor

    public Jugador(String nombre, int edad, String posicion,short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    //constructor por defecto
    public Jugador(String nombre, int edad, String posicion) {
        super(nombre, edad, posicion);
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
    
    //getter & setter
    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    
    //metodos
    @Override
    public String toString() {
        String cad = super.toString() + " con el dorsal " + getDorsal() + ". Ha marcado " + getGolesMarcados();
	return cad;
    }
    @Override
    public boolean jugarConLasManos() {return false;}
    
    
    
    
    
    
    
}
