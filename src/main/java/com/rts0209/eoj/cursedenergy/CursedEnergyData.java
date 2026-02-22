package com.rts0209.eoj.cursedenergy;

public class CursedEnergyData {

    private int energy;
    private int maxEnergy;

    public CursedEnergyData() {
        this.maxEnergy = 100;
        this.energy = maxEnergy;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setEnergy(int energy) {
        this.energy = Math.min(energy, maxEnergy);
    }

    public void addEnergy(int amount) {
        this.energy = Math.min(this.energy + amount, maxEnergy);
    }

    public void removeEnergy(int amount) {
        this.energy = Math.max(this.energy - amount, 0);
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }
}
