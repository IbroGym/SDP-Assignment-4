package BehavioralPatterns2.Visitor.WithPattern;

public class ExecutableFile implements File {
    private String binaryData;

    public ExecutableFile(String binaryData) {
        this.binaryData = binaryData;
    }

    public String getBinaryData() {
        return binaryData;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
