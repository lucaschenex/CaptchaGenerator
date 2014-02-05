import java.awt.Toolkit;
import java.util.Random;


public class Code_Generator {
	/*
	 * Code_Generator produce random value for each information
	 * contains in Character and store that value in a Character 
	 * object;
	 */
	
	public static final String sample = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";	// all possible values for a character content;
	@SuppressWarnings("deprecation")
	public static final String[] fonts_set = Toolkit.getDefaultToolkit().getFontList();						// get the set for all font style;
	private static final int NUM_FONTS = fonts_set.length;					// the number of the font set;
	private static final int NUM_SIZES = Pic_Generator.height;				// Max possible size for a character;
	private static final int MAX_POS = sample.length();						// the length of 'sample';			

	private Character[] code;  												// the information code to be returned to Pic_Generator for further processing;
	private int NUM_DIGITS;													// required number of characters in the picture, can be edited in Pic_Generator;
	private Random rdm_generator = new Random();							// initilize the random generator;
	
	
	public Code_Generator(int digits_number, boolean color_style){
		/*
		 * Code_Generator initializer
		 */
		NUM_DIGITS = digits_number;
		code = new Character[NUM_DIGITS];
		
		// for each NUM_DIGIT place, assign a random value to the code;
		for (int i = 0; i < NUM_DIGITS; i++){
			int character_code = rdm_generator.nextInt(MAX_POS);		// 0 inclusive, MAX_POS exclusive;
			String font_code = fonts_set[rdm_generator.nextInt(NUM_FONTS)];		// 0 inclusive, NUM_FONTS exclusive;
			float red_code = Math.round(rdm_generator.nextFloat() * 10)/10.0f;
			float green_code = Math.round(rdm_generator.nextFloat() * 10)/10.0f;
			float blue_code = Math.round(rdm_generator.nextFloat() * 10)/10.0f;
			int size_code = rdm_generator.nextInt(NUM_SIZES);
			if(character_code < 0){
				System.out.println("Fatal Error: illegal character recognized");
			}
			else{
				// store random values to a new Character object and add to code for processing;
				String character = sample.substring(character_code, character_code+1);
				if(color_style){
					code[i] = new Character(character, font_code, size_code, red_code, green_code, blue_code);
				}else{
					code[i] = new Character(character, font_code, size_code);
				}
			}
		}
	}

	public Character[] code(){
		return code;
	}
}
