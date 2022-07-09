package www.github.ybqdrem.bean;

public class Cat {
    private String name;
    private Person master;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;
        return master != null ? master.equals(cat.master) : cat.master == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (master != null ? master.hashCode() : 0);
        return result;
    }
}
