package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class ServiceCategory {

    @Id
    private int serviceCat_id;
    private String serviceCat_Name;

    @OneToMany(mappedBy = "serviceCategory")
    private Set<Service> services;

    protected ServiceCategory() {

    }

    private ServiceCategory(Builder builder) {
        this.serviceCat_id = builder.serviceCat_id;
        this.serviceCat_Name = builder.serviceCat_Name;
        this.services = (Set<Service>) builder.services;
    }

    public int getServiceCat_id() {
        return serviceCat_id;
    }

    public String getServiceCat_Name() {
        return serviceCat_Name;
    }

    public Set<Service> getServices() {
        return services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiceCategory that)) return false;
        return getServiceCat_id() == that.getServiceCat_id() && Objects.equals(getServiceCat_Name(), that.getServiceCat_Name()) && Objects.equals(getServices(), that.getServices());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServiceCat_id(), getServiceCat_Name(), getServices());
    }

    @Override
    public String toString() {
        return "ServiceCategory{" +
                "serviceCat_id=" + serviceCat_id +
                ", serviceCat_Name='" + serviceCat_Name + '\'' +
                ", services=" + services +
                '}';
    }

    public static class Builder {
        private int serviceCat_id;
        private String serviceCat_Name;
        private Set<Service> services;

        public Builder setServiceCat_id(int serviceCat_id) {
            this.serviceCat_id = serviceCat_id;
            return this;
        }

        public Builder setServiceCat_Name(String serviceCat_Name) {
            this.serviceCat_Name = serviceCat_Name;
            return this;
        }

        public Builder setServices(Set<Service> services) {
            this.services = services;
            return this;
        }

        public Builder copy(ServiceCategory serviceCategory) {
            this.serviceCat_id = serviceCategory.getServiceCat_id();
            this.serviceCat_Name = serviceCategory.getServiceCat_Name();
            this.services = serviceCategory.getServices();
            return this;
        }

        public ServiceCategory build() {
            return new ServiceCategory(this);
        }
    }
}
