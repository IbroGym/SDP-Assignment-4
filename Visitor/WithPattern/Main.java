package BehavioralPatterns2.Visitor.WithPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File textFile = new TextFile("Sample text content");
        File exeFile = new ExecutableFile("Binary data...");

        Visitor antivirus = new AntivirusVisitor();
        Visitor reportGenerator = new ReportVisitor();

        textFile.accept(antivirus);
        exeFile.accept(antivirus);

        textFile.accept(reportGenerator);
        exeFile.accept(reportGenerator);
    }
}