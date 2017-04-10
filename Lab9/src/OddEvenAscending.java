import java.util.Comparator;
public class OddEvenAscending implements Comparator<Integer>{
	
	public int compare(Integer o1,Integer o2){
		if(o1.intValue()%2==o2.intValue()%2){
			if(o1.intValue()>o2.intValue()){
				return 1;
			}
			if(o1.intValue()<o2.intValue()){
				return -1;
			}
		}
		
		if(o1.intValue()%2==1&&o2.intValue()%2==0){
			return -1;
		}
		if(o1.intValue()%2==0&&o2.intValue()%2==1){
			return 1;
		}
		return 0;
		
	}
}
