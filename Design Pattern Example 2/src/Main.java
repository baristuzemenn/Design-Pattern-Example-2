public class Main
{
    public static void main(String[] args) {
        MainPart computer = new MainPart("computer");

        MainPart monitor = new MainPart("monitor");
        monitor.setPrice(30);

        MainPart keyboard = new MainPart("keyboard");
        keyboard.setPrice(11);

        MainPart cpu = new MainPart("cpu");
        cpu.setPrice(14);

        MainPart memory = new MainPart("memory");
        memory.setPrice(15);

        MainPart graphic_card = new MainPart("graphic_card");

        SubPart gpu = new SubPart("gpu", 10);
        gpu.setPrice(10);

        SubPart gpu_memory = new SubPart("Memory", 15);
        gpu_memory.setPrice(15);
        graphic_card.addPart(gpu);
        graphic_card.addPart(gpu_memory);
        graphic_card.setPrice();

        computer.addPart(monitor);
        computer.addPart(keyboard);
        computer.addPart(cpu);
        computer.addPart(memory);
        computer.addPart(graphic_card);
        computer.setPrice();
        computer.printDetails();
    }
}