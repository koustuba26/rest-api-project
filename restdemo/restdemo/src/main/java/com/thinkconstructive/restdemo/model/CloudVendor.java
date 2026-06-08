package com.thinkconstructive.restdemo.model;

public class CloudVendor 
{
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhno;

    

    public CloudVendor (){

    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhno){

        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhno = vendorPhno;
    }
    
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhno() {
        return vendorPhno;
    }

    public void setVendorPhno(String vendorPhno) {
        this.vendorPhno = vendorPhno;
    }

}
