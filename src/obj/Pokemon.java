
package obj;

public abstract class Pokemon implements Catchable{
    private String nombre;
    private int atk;
    private int def;
    private int hp;

    public Pokemon(String nombre, int atk, int def, int hp) {
        this.nombre = nombre;
        this.atk = atk;
        this.def = def;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", atk=" + atk + ", def=" + def + ", hp=" + hp + '}';
    }   
}
