package za.ac.cput.factory;

import za.ac.cput.domain.Service;
import za.ac.cput.domain.ServiceCategory;
import za.ac.cput.util.Helper;

import java.math.BigDecimal;
import java.util.Collections;

public class ServiceFactory {

    public static Service buildService(int serviceId, String serviceName, String serviceDescription,
                                       String servicePrice, String serviceStatus, ServiceCategory serviceCategory) {
        if (Helper.isZero(serviceId) || Helper.isNullOrEmpty(serviceName) || Helper.isNullOrEmpty(serviceDescription) || Helper.isDouble(servicePrice)
        || Helper.isNullOrEmpty(serviceStatus)|| serviceCategory == null)
            return null;
        return new Service.Builder().setServiceId(serviceId)
                .setServiceName(serviceName)
                .setServiceDescription(serviceDescription)
                .setServicePrice(servicePrice)
                .setServiceStatus(serviceStatus)
                .setServiceCategory(serviceCategory)
                .build();
    }

    public static Service buildService(int serviceId, String serviceName, String serviceDescription,
                                       String servicePrice, String serviceStatus) {
        if (Helper.isZero(serviceId) || Helper.isNullOrEmpty(serviceName) || Helper.isNullOrEmpty(serviceDescription) || Helper.isDouble(servicePrice)
                || Helper.isNullOrEmpty(serviceStatus))
            return null;
        return new Service.Builder().setServiceId(serviceId)
                .setServiceName(serviceName)
                .setServiceDescription(serviceDescription)
                .setServicePrice(servicePrice)
                .setServiceStatus(serviceStatus)
                .build();
    }
}