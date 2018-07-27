import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave micro = new Microwave();
	String flavour = JOptionPane.showInputDialog("What flavour do you want your popcorn?");
	Popcorn pop = new Popcorn(flavour);
	micro.putInMicrowave(pop);
	String time = JOptionPane.showInputDialog("How many minutes do you want to cook it?");
	int time2 = Integer.parseInt(time);
	micro.setTime(time2);
	micro.startMicrowave();
	
}
}
