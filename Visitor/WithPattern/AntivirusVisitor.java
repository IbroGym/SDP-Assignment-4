package BehavioralPatterns2.Visitor.WithPattern;

public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for malicious content...");
        // Check text content for forbidden words
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file for malicious code...");
        // Check binary data for malware
    }
}
