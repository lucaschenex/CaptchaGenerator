import javax.swing.JFrame;

public class Player {

	public static void main(String[] args){
		boolean color = false;
		
		
		if(args.length > 2){
			System.out.println("illegal number of arguments");
		}else{
			try{
				Integer.parseInt(args[0]);
				if(args.length == 2){
					if(args[1].equalsIgnoreCase("color")){
						color = true;
					}
				}
			}catch(Exception e){
				System.out.println("the first argument should be the amount of captchas you want");
			}
		}
		
		for(int i = 0; i < Integer.parseInt(args[0]); i++){
			Pic_Generator j;
			if(color){
				j = new Pic_Generator(true);
			} else {
				j = new Pic_Generator(false);
			}
			
			// create new JFrame to draw on, use for test, can be disabled by setting visible as false;
			JFrame f = new JFrame();
			f.setSize(Pic_Generator.width, Pic_Generator.height);
			f.add(j);
			f.setLocationRelativeTo(null);
			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			f.setVisible(true);
			
			// save panel;
			j.savePanel(i+1);
		}
	}
}

