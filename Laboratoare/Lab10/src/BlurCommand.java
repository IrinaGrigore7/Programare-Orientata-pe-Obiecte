public class BlurCommand extends ImageCommand{
    private String previousBlurred;

    public BlurCommand(Image image, String blur) {
        super(image);
        previousBlurred = blur;
    }

    @Override
    public void execute(String newBlurred){
        super.getImage().setBlurred(newBlurred);
        super.display();
    }

    @Override
    public void undo() {
        super.getImage().setBlurred(previousBlurred);
        super.display();
    }

}
