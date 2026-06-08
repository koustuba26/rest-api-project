package com.thinkconstructive.restdemo.model;

public class CloudService {

    public String serviceId;
    public String serviceName;
    public String serviceDescription;

    public CloudService(){
        
    }

    public CloudService(String serviceId, String serviceName, String serviceDescription) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

}
