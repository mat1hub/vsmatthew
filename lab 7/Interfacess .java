interface playable{
	public void play();
}
class Guitar implements playable{

	@Override
	public void play() {
		System.out.println("guitar class method was called!");
		
	}
	
}
class Piano implements playable
{

	@Override
	public void play() {
		System.out.println("piano class method was called!");
		
	}
	
}
public class Interfacess  {
public static void main(String[] args) {
	Piano p =new Piano();
	Guitar g = new Guitar();
	p.play();
	g.play();
}

}
