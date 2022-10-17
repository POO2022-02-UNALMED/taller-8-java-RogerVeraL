package futbol;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger Vera
 */
public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;
    
    //constructor

    public Portero(String nombre, int edad,short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    
    //getter & setter

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    
    
    
    //métodos
    @Override
    public String toString() {
        String cad = super.toString() + " con el dorsal " + getDorsal() + ". Le han marcado " + getGolesRecibidos();
	return cad;
    }
    @Override
    public boolean jugarConLasManos() {return true;}
    
    @Override
    public int compareTo(Object player) {
        Portero p = (Portero)player;
        return  Math.abs(this.getGolesRecibidos() - p.getGolesRecibidos());
    }
    
    
}
