package entities;

public abstract class MultimediaElement {
    protected String title;

    protected MultimediaElement(String title) {
        this.title = title;
    }
    public static void info(){
        System.out.println("Multimedia elements can be images, videos or audio recordings");
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
