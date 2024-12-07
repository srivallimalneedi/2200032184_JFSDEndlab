package com.klu.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "smartphone")
public class Smartphone extends Device {
    private String operatingSystem;
    private String cameraResolution;

    
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}
