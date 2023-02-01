class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    public static class ComputerBuilder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public ComputerBuilder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + ", storage=" + storage + "]";
    }
}

class BuilderExample {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().setCPU("Intel Core i7").setGPU("Nvidia RTX 3080").setRAM(16)
                .setStorage(1000).build();
        System.out.println(computer);
    }
}
