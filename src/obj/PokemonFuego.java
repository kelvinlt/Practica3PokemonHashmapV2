package obj;


public class PokemonFuego extends Pokemon {

    public PokemonFuego(String nombre, int atk, int def, int hp) {
        super(nombre, atk, def, hp);
    }

    @Override
    public String toString() {
        return "PokemonFuego{" + "nombre=" + getNombre()+ ", atk=" + getAtk() + ", def=" + getDef() + ", hp=" + getHp()+ '}';
    }  

    @Override
    public boolean catchable() {
        int min=10;
        int max=60;
        
        int range = (max - min) +1;
        int randomNum =(int)(Math.random()*range)+min;
        
        int catchNum = randomNum + getHp();
        int antiCatch = getAtk()+getDef();
        if(catchNum > antiCatch){
            return true;
        }
        else{
            return false;
        }
    }
}
