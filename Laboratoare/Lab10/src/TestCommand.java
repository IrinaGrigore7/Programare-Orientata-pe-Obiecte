public class TestCommand {
    public static void main(String[] args) {
        Image image = new Image("no", "0x0", "0");

        ResizeCommand resizeCommand = new ResizeCommand(image, "0x0");
        RotateCommand rotateCommand = new RotateCommand(image, "0");
        BlurCommand blurCommand = new BlurCommand(image, "no");

        blurCommand.execute("yes");
        resizeCommand.execute("50x50");
        blurCommand.undo();
        rotateCommand.execute("180");
        resizeCommand.undo();
        rotateCommand.undo();
    }
}
