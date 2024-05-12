package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity (name = "Service")
//@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int serviceId;
    private String serviceName;
    private String serviceDescription;
    private String servicePrice;
    private String serviceStatus;

    @ManyToOne
    @JoinColumn(name = "serviceCat_id")
    private ServiceCategory serviceCategory;

    protected Service() {

    }

    private Service(Builder builder) {
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceDescription = builder.serviceDescription;
        this.servicePrice = builder.servicePrice;
        this.serviceStatus = builder.serviceStatus;
        this.serviceCategory = builder.serviceCategory;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public String getServicePrice() {
        return servicePrice;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Service service)) return false;
        return serviceId == service.serviceId && Objects.equals(getServiceName(), service.getServiceName()) && Objects.equals(getServiceDescription(), service.getServiceDescription()) && Objects.equals(getServicePrice(), service.getServicePrice()) && Objects.equals(getServiceStatus(), service.getServiceStatus()) && Objects.equals(getServiceCategory(), service.getServiceCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, getServiceName(), getServiceDescription(), getServicePrice(), getServiceStatus(), getServiceCategory());
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", servicePrice=" + servicePrice +
                ", serviceStatus='" + serviceStatus + '\'' +
                ", serviceCategory=" + serviceCategory +
                '}';
    }

    public static class Builder {
        private int serviceId;
        private String serviceName;
        private String serviceDescription;
        private String servicePrice;
        private String serviceStatus;
        private ServiceCategory serviceCategory;

        public Builder setServiceId(int serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }

        public Builder setServicePrice(String servicePrice) {
            this.servicePrice = servicePrice;
            return this;
        }

        public Builder setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        public Builder setServiceCategory(ServiceCategory serviceCategory) {
            this.serviceCategory = serviceCategory;
            return this;
        }

        public Builder copy(Service s) {
            return this;
        }

        public Service build() {
            return new Service(this);
        }
    }

}
