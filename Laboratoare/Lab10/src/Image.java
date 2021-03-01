public class Image {
    private String blurred;
    private String size;
    private String angle;

    public Image(String blurred, String size, String angle) {
        this.blurred = blurred;
        this.size = size;
        this.angle = angle;

        display();
    }

    public void display() {
        System.out.println("blurred: " + blurred);
        System.out.println("size: " + size);
        System.out.println("angle: " + angle);
        System.out.println();
    }

    public String getBlurred() {
        return blurred;
    }

    public void setBlurred(String blurred) {
        this.blurred = blurred;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAngle() {
        return angle;
    }

    public void setAngle(String angle) {
        this.angle = angle;
    }


}
