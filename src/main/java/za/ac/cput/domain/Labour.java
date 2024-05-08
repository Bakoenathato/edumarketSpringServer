package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Labour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String labourName;
    private String labourDescription;
    private String labourType;
    private String labourStatus;

    protected Labour() {

    }

    private Labour(Builder builder) {
        this.id = builder.id;
        this.labourDescription = builder.labourDescription;
        this.labourName = builder.labourName;
        this.labourType = builder.labourType;
        this.labourStatus = builder.labourStatus;
    }

    public int getId() {
        return id;
    }

    public String getLabourName() {
        return labourName;
    }

    public String getLabourDescription() {
        return labourDescription;
    }

    public String getLabourType() {
        return labourType;
    }

    public String getLabourStatus() {
        return labourStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Labour labour)) return false;
        return getId() == labour.getId() && Objects.equals(getLabourName(), labour.getLabourName()) && Objects.equals(getLabourDescription(), labour.getLabourDescription()) && Objects.equals(getLabourType(), labour.getLabourType()) && Objects.equals(getLabourStatus(), labour.getLabourStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLabourName(), getLabourDescription(), getLabourType(), getLabourStatus());
    }

    @Override
    public String toString() {
        return "Labour{" +
                "id=" + id +
                ", labourName='" + labourName + '\'' +
                ", labourDescription='" + labourDescription + '\'' +
                ", labourType='" + labourType + '\'' +
                ", labourStatus='" + labourStatus + '\'' +
                '}';
    }

    public static class Builder {
        private int id;
        private String labourName;
        private String labourDescription;
        private String labourType;
        private String labourStatus;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setLabourName(String labourName) {
            this.labourName = labourName;
            return this;
        }

        public Builder setLabourDescription(String labourDescription) {
            this.labourDescription = labourDescription;
            return this;
        }

        public Builder setLabourType(String labourType) {
            this.labourType = labourType;
            return this;
        }

        public Builder setLabourStatus(String labourStatus) {
            this.labourStatus = labourStatus;
            return this;
        }

        public Builder copy(Labour l) {
            this.id = l.getId();
            this.labourName = l.getLabourName();
            this.labourDescription = l.getLabourDescription();
            this.labourType = l.getLabourType();
            this.labourStatus = l.getLabourStatus();
            return this;
        }

        public Labour build() {
            return new Labour(this);
        }
    }

}
