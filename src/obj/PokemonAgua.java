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
public class PokemonAgua extends Pokemon{
    private String tipo;

    public PokemonAgua(String tipo, String nombre, double atk, double def, double hp) {
        super(nombre, atk, def, hp);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "PokemonAgua{" + "tipo=" + tipo + ", nombre=" + getNombre()+ ", atk=" + getAtk() + ", def=" + getDef() + ", hp=" + getHp()+ '}';
    }    
}
