package BehavioralPatterns2.Template.WithPattern;

public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkCharacteristics() {
        System.out.println("Checking expiration date and ingredients...");
    }
}
