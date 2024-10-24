package BehavioralPatterns2.Template.WithPattern;

public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkCharacteristics() {
        System.out.println("Checking functionality and warranty...");
    }
}
