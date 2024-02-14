public class usingMethods {
    public static void main(String[] args) {
        Track track1 = new Track("Fernando", "ABBA", 354);
    int total = track1.getDuration();
    String ron = track1.remove(0);
        System.out.println(ron);
    }
}
