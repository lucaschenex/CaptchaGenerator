	/*
	 * 
	 */
public class Character {
	/*
	 * Character data container, maintains variables that need to be
	 * randomized; each Character object refer to one character on
	 * the captcha picture;
	 */

	// configurable to more fields;
	private String character;					// character content;
	private String font;						// font style;
	private float color_r;						// red component of the color;
	private float color_g;						// green component of the color;
	private float color_b;						// blue component of the color;
	private int size;							// size of the character
	
	// data initializer;
	public Character(String chr, String f, int size, float r, float g, float b){
		this.character = chr;
		this.font = f;
		this.color_r = r;
		this.color_g = g;
		this.color_b = b;
		this.size = size;
	}
	
	public Character(String chr, String f, int size){
		this(chr, f, size, 0, 0, 0);
	}
	
	// data getters
	public String font(){
		return font;
	}
	
	public float red(){
		return color_r;
	}
	
	public float green(){
		return color_g;
	}

	public float blue(){
		return color_b;
	}

	public int size(){
		return size;
	}
	public String character(){
		return character;
	}
	
}
