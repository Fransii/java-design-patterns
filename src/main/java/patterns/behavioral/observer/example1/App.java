package patterns.behavioral.observer.example1;

public class App {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        YoutubeUser user1 = new YoutubeUser("David");
        youtubeChannel.registerObserver(user1);

        YoutubeUser user2 = new YoutubeUser("Frank");
        youtubeChannel.registerObserver(user2);

        youtubeChannel.notifyObservers();

        youtubeChannel.unregisterObserver(user1);

        youtubeChannel.notifyObservers();
    }
}
