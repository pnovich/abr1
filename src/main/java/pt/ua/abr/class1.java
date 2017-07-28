package pt.ua.abr;

/**
 * Created by Pavel Vasianovych on 28.07.2017.
 */
public class class1 {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "class1{" +
                "id=" + id +
                '}';
    }

    public boolean isNew() {
        return (this.id == null);
    }
}
