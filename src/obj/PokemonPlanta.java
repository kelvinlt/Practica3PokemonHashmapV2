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
public class PokemonPlanta extends Pokemon{
    private String habitat;

    public PokemonPlanta(String habitat, String nombre, double atk, double def, double hp) {
        super(nombre, atk, def, hp);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    } 
}
