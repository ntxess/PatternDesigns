public class Window {
    private static Window w = null;
    private Window() {}
    public static Window getInstance() {
        if(w == null) {
            w = new Window();
            System.out.println("New Window Instance created!");
        }
        else {
            System.out.println("Previous Window Instance returned!");
        }
        return w;
    }
}
