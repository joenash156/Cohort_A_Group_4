public class Paper extends Waste {
    public Paper(String name, double weightKg) {
        super(name, weightKg, "Paper", 180);
    }

    @Override
    public WasteCategory getCategory() {
        return WasteCategory.PAPER;
    }
    @Override
    public boolean isRecyclable() {
        return true;
    }
    @Override
    public String getSortHint() {
        return "Place in PAPER bin. Do not add food-contaminated paper.";
    }
}
