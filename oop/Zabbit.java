public class Zabbit extends Animal {

    private String habitat;
    private int feed;

    public Zabbit(String name, int birthYear, String habitat, int feed) {
        super(name, birthYear);
        this.habitat = habitat;
        this.feed = feed; //carrots, grass, neither = 0, 1, 2
    }

    // accessor (getter)
    public String getHabitat() {
        return habitat;
    }
    
    public String getFeed() {
        if(feed == 0){
			return "Carrots";
		} else if (feed == 1){
			return "Grasses";
		} else {
			return "Both";
		}
    }

    public void setFeed(int feed) {
        this.feed = feed;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void talk() {
        System.out.println("Squayk Squayk");
    }

    public void eat() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public String toString() {
        return super.toString() + " | Feed is " + getFeed();
    }
}
