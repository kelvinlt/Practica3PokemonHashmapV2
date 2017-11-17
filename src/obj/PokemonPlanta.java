package obj;

public class PokemonPlanta extends Pokemon{
    private String habitat;

    public PokemonPlanta(String habitat, String nombre, int atk, int def, int hp) {
        super(nombre, atk, def, hp);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
        @Override
    public String toString() {
        return "PokemonPlanta{" + "habitat=" + habitat + ", nombre=" + getNombre()+ ", atk=" + getAtk() + ", def=" + getDef() + ", hp=" + getHp()+ '}';
    }  

    @Override
    public boolean catchable() {
        int min=0;
        int max=50;
        
        int range = (max - min) +1;
        int randomNum =(int)(Math.random()*range)+min;
        
        int catchNum = randomNum + getAtk();
        
        if(catchNum > getHp()){
            return true;
        }
        else{
            return false;
        }
    }
}
