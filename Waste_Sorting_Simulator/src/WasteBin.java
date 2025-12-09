

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WasteBin {

    private final WasteCategory category;
    private final double capacityKg;
    private double currentLoadKg = 0.0;
    private final List<Waste> contents = new ArrayList<>();

    public WasteBin(WasteCategory category, double capacityKg) {
        if (category == null) {
            throw new IllegalArgumentException("Category required");
        }
        if (capacityKg <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.category = category;
        this.capacityKg = capacityKg;
    }

    public WasteCategory getCategory() {
        return category;
    }

    public double getCapacityKg() {
        return capacityKg;
    }

    public double getCurrentLoadKg() {
        return currentLoadKg;
    }

    // Category must match AND adding the weight must not exceed capacity
    public boolean canAccept(Waste waste) {
        if (waste == null) {
            return false;
        }
        return waste.getCategory() == category && (currentLoadKg + waste.getWeightKg() <= capacityKg + 1e-9);
    }

    // Add more waste if possible and returns true if successful
    public boolean addWaste(Waste waste) {
        if (!canAccept(waste)) {
            return false;
        }
        contents.add(waste);
        currentLoadKg += waste.getWeightKg();
        return true;
    }

    // Empties the bin and returns the previous contents
    public List<Waste> emptyBin() {
        List<Waste> garbage = new ArrayList<>(contents);
        contents.clear();
        currentLoadKg = 0.0;
        return garbage;
    }

    public double getFillPercentage() {
        return (currentLoadKg / capacityKg) * 100.0;
    }

    public List<Waste> getContents() {
        return Collections.unmodifiableList(contents);
    }

    public String getStatus() {
        return String.format("%s: %.2f / %.2f kg = %.2f%% %n", category, currentLoadKg, capacityKg, getFillPercentage());
    }
}
