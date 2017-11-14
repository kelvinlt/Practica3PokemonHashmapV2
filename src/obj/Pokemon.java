
package obj;

public abstract class Pokemon {
    private String nombre;
    private double atk;
    private double def;
    private double hp;

    public Pokemon(String nombre, double atk, double def, double hp) {
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

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", atk=" + atk + ", def=" + def + ", hp=" + hp + '}';
    }   
}
