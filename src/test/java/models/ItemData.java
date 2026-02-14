package models;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class ItemData {

    private int year;
    private double price;

    @JsonProperty("CPU Model")
    private String cpuModel;

    @JsonProperty("Hard Disk Size")
    private String hardDiskSize;

    public ItemData(){}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }
}
