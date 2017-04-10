import java.util.Comparator;
public class Descending implements Comparator<Integer> {
	public int compare(Integer o1,Integer o2){
		if(o1.intValue()>o2.intValue()){
			return -1;
		}
		else if(o1.intValue()<o2.intValue()){
			return 1;
		}
		else return 0;
	}
}
