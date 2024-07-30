public class Ex_3_Computer {
    private final String CPU;
    private final String RAM;
    private final String Storage;
    private final boolean hasGraphicsCard;
    private final boolean hasWiFi;

    private Ex_3_Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasWiFi = builder.hasWiFi;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + Storage
                + ", Graphics Card=" + (hasGraphicsCard ? "Yes" : "No")
                + ", WiFi=" + (hasWiFi ? "Yes" : "No") + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String Storage;
        private boolean hasGraphicsCard;
        private boolean hasWiFi;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Ex_3_Computer build() {
            return new Ex_3_Computer(this);
        }
    }
}
