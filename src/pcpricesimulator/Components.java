/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcpricesimulator;

import java.util.HashMap;

/**
 *
 * @author gazel
 */
public class Components {
    // ALL THIS CODE MADE BY GAZEL AVERROUS
    // INITIATE ALL COMPONENTS LIST
    private String cpu, cpuCooler, motherboard, memory, storage, graphicsCard, case1, powerSupply, monitor;
    private Double total;

    
    
    
    public static HashMap<String, Double> cpuList = new HashMap<String, Double>();
    public static HashMap<String, Double> cpuCoolerList = new HashMap<String, Double>();
    public static HashMap<String, Double> motherboardList = new HashMap<String, Double>();
    public static HashMap<String, Double> memoryList = new HashMap<String, Double>();
    public static HashMap<String, Double> storageList = new HashMap<String, Double>();
    public static HashMap<String, Double> graphicsCardList = new HashMap<String, Double>();
    public static HashMap<String, Double> caseList = new HashMap<String, Double>();
    public static HashMap<String, Double> powerSupplyList = new HashMap<String, Double>();
    public static HashMap<String, Double> monitorList = new HashMap<String, Double>();

    public Components(String cpu, String cpuCooler, String motherboard, String memory, String storage, String graphicsCard, String case1, String powerSupply, String monitor, Double total) {
        this.cpu = cpu;
        this.cpuCooler = cpuCooler;
        this.motherboard = motherboard;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.case1 = case1;
        this.powerSupply = powerSupply;
        this.monitor = monitor;
        this.total = total;
    }
    
    public String getCpu() {
        return this.cpu;
    }

    public String getCpuCooler() {
        return this.cpuCooler;
    }

    public String getMotherboard() {
        return this.motherboard;
    }

    public String getMemory() {
        return this.memory;
    }

    public String getStorage() {
        return this.storage;
    }

    public String getGraphicsCard() {
        return this.graphicsCard;
    }

    public String getCase1() {
        return this.case1;
    }

    public String getPowerSupply() {
        return this.powerSupply;
    }

    public String getMonitor() {
        return this.monitor;
    }

    public Double getTotal() {
        return this.total;
    }
}
