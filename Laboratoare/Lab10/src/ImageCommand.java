public abstract class ImageCommand {
    private Image image;

    public abstract void execute(String newState);
    public abstract void undo();

    public ImageCommand(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }

    public void display() {
        image.display();
    }
}
