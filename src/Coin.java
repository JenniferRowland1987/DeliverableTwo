
public class Coin {

	private final int heads = 0; //heads is 0, tails is 1
	private int face; //current showing side of coin
	
	public Coin() {
		flip();
	}

	public void flip() {
		face = (int)(Math.random() * 2); // 0.00...whatever times 2 will be either 0 or 1 when cast as int
	}
	
	public boolean isHeads() {
		return (face == heads);
	}
	public String toString() {
		if(face == heads) {
			return  "Heads";
		}else {
			return "Tails";
		}
	}

}

