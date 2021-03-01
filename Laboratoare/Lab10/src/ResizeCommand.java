public class ResizeCommand extends ImageCommand {
    private String previousSize;

    public ResizeCommand(Image image, String size) {
        super(image);
        previousSize = size;
    }

    @Override
    public void execute(String newSize) {
        super.getImage().setSize(newSize);
        super.display();
    }

    @Override
    public void undo() {
        super.getImage().setSize(previousSize);
        super.display();
    }
}
