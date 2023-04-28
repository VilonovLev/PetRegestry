package data;

public abstract class Animal {
    private long id;
    private String owner;

    public Animal(String owner) {
        this.id = 0;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (this.id == 0) {
            this.id = id;
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                '}';
    }
}
