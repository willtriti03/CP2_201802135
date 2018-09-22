package chocolatejar;

public class ChocolateJar implements Jar{
	
	private int chocolate;
	private int chilli;
	
	public  ChocolateJar() {
		chocolate = 13;
		chilli = 1;
	}
	
	public  ChocolateJar(int chocolate) {
		this.chocolate = chocolate;
		chilli = 1;
	}


	@Override
	public int getItem() {
		return chocolate + chilli;
	}
	
	public int getChocolate() {
		return chocolate;
	}
	
	public int getChilli() {
		return chilli;
	}
	
	@Override
	public void takeItem(int hand) {
		if(getItem() - hand < 0) {
			System.out.println("남은 개수보다 많습니다");
		}
		else {
			if(chocolate - hand >= 0)
				chocolate -= hand;
			else {
				chocolate = 0;
				chilli = 0;
			}
		}
		
	}

	@Override
	public String status() {
		String jar  = "[ ";
		if(chilli > 0)
			jar +="■ ";
		for(int i = 0; i < chocolate; ++i) {
			jar +="□ ";
		}
		jar +="]";
		return jar;
	}

	@Override
	public boolean isEmpty() {
		if (getItem() == 0)
				return true;
		else
			return false;
	}

}