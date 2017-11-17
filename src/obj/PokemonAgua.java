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

    public PokemonAgua(String tipo, String nombre, int atk, int def, int hp) {
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

    @Override
    public boolean catchable() {
        int min=20;
        int max=100;
        
        int range = (max - min) +1;
        int randomNum =(int)(Math.random()*range)+min;
        
        int catchNum = randomNum - getHp();
        
        if(catchNum > getDef()){
            return true;
        }
        else{
            return false;
        }
    }
}
