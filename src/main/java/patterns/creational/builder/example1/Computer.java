package patterns.creational.builder.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Computer {

    private String name;
    private Processor processor;
    private Storage storage;

    public Computer(Builder builder){
        this.name = builder.name;
        this.processor = builder.processor;
        this.storage = builder.storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", processor=" + processor +
                ", storage=" + storage +
                '}';
    }

    public static class Builder{

        private static final Logger LOGGER = LoggerFactory.getLogger(Computer.class);

        private String name;
        private Processor processor;
        private Storage storage;

        public Builder(String name) {
            if(name == null)
                throw new IllegalArgumentException("Name can not be null");
            LOGGER.info("Seting name...");
            this.name = name;
        }

        public Builder setProcessor(Processor processor) {
            LOGGER.info("Seting processor...");
            this.processor = processor;
            return this;
        }

        public Builder setStorage(Storage storage) {
            LOGGER.info("Seting storage...");
            this.storage = storage;
            return this;
        }

        public Computer build(){
            LOGGER.info("Building computer...");
            return new Computer(this);
        }
    }
}
