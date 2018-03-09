package patterns.creational.builder.example1;

public enum Storage {
    SSD("ssd"), HDD("hdd");

    private String type;

    Storage(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "type='" + type + '\'' +
                '}';
    }
}
