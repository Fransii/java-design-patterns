package patterns.behavioral.observer.example1;

public class YoutubeUser implements Observer{

    private String name;

    YoutubeUser(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + ", the channel you subscribe has added new video!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
