public class Organic extends Waste {

    public Organic(String name, double weightKg, int decompositionDays) {
        super(name, weightKg, "Organic", decompositionDays);
    }

    @Override
    public WasteCategory getCategory() {
        return WasteCategory.ORGANIC;
    }

    @Override
    public boolean isRecyclable() {
        // Organic wastes are compostable, not recycled
        return false;
    }

    @Override
    public String getSortHint() {
        return "Place in ORGANIC  bin.";
    }
}
