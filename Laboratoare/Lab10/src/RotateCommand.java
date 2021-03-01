public class RotateCommand extends ImageCommand {
    private String previousAngle;

    public RotateCommand(Image image, String angle){
        super(image);
        previousAngle = angle;
    }

    @Override
    public void execute(String newAngle) {
        super.getImage().setAngle(newAngle);
        super.display();
    }

    @Override
    public void undo() {
        super.getImage().setAngle(previousAngle);
        super.display();
    }
}
