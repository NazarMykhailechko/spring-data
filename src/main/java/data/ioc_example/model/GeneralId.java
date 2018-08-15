package data.ioc_example.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class GeneralId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public GeneralId() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeneralId)) return false;

        GeneralId generalId = (GeneralId) o;

        return getId() == generalId.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }

    @Override
    public String toString() {
        return "GeneralId{" +
                "id=" + id +
                '}';
    }
}
