package BehavioralPatterns2.Template.WithPattern;

public abstract class QualityCheck {
    public void checkQuality() {
        checkAppearance();
        checkCharacteristics();
        generateReport();
    }

    private void checkAppearance() {
        System.out.println("Checking appearance...");
    }

    protected abstract void checkCharacteristics();

    private void generateReport() {
        System.out.println("Generating quality report...");
    }
}
