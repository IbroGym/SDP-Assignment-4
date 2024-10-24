package BehavioralPatterns2.Template.WithPattern;

public class Main {
    public static void main(String[] args) {
        QualityCheck foodCheck = new FoodQualityCheck();
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();

        foodCheck.checkQuality();
        electronicsCheck.checkQuality();
    }
}
