package patterns.creational.builder.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void requiredParameterTest(){
        assertThrows(IllegalArgumentException.class, () -> new Computer.Builder(null).build());
    }

    @Test
    void buildComputerTest() {
        final Computer computer = new Computer.Builder("Notebook")
                .setProcessor(Processor.INTEL)
                .setStorage(Storage.SSD)
                .build();

        assertNotNull(computer);
        assertEquals(Processor.INTEL,computer.getProcessor());
        assertEquals(Storage.SSD,computer.getStorage());
    }
}