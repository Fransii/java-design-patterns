package patterns.creational.builder.example1;

public enum Processor {
    INTEL("intel"), AMD("amd");

    private String type;

    Processor (String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                '}';
    }
}
