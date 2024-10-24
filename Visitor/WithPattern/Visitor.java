package BehavioralPatterns2.Visitor.WithPattern;

public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}
