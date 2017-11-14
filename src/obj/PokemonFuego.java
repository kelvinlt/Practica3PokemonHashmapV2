/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

/**
 *
 * @author DAM
 */
public class PokemonFuego extends Pokemon{

    public PokemonFuego(String nombre, double atk, double def, double hp) {
        super(nombre, atk, def, hp);
    }

    @Override
    public String toString() {
        return "PokemonFuego{" + ", nombre=" + getNombre()+ ", atk=" + getAtk() + ", def=" + getDef() + ", hp=" + getHp()+ '}';
    }  
    
    
}
