
public class Bear implements TotemPole {
	TotemPole rest;
	public Bear(TotemPole rest){
		this.rest = rest;
	}
	
	public int power(){
		return 5 + rest.power();
	}
	
	public int height(){
		return 1 + rest.height();
	}
	public boolean chiefPole(int bearCount){

			return rest.chiefPole(bearCount+1);
		}
	}
	

