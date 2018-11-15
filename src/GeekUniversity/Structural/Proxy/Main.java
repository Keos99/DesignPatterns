package GeekUniversity.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutorProxy("Warlord", "Admin");
        try {
            commandExecutor.runCommand("ls -ltr");
            commandExecutor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
