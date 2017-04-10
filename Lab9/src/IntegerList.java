import java.util.*;


public class IntegerList {
	
	ArrayList<Integer> integers;
	
	public IntegerList(int contain, int max){
		integers = new ArrayList<Integer>();
		for(int i = 1;i<=contain;i++){
			integers.add((int) Math.floor(Math.random() * max));
		}	
		
	}
	
	public void sort(){
		Collections.sort(integers);
	}
	
	public void sort(Comparator<Integer> integer){
		Collections.sort(integers,integer);
	}
	
	public boolean isSorted(Comparator<Integer>integer){
		if(integer==null){
			for(int i = 1;i<integers.size();i++){
				if(integers.get(i-1).compareTo(integers.get(i))>0){
					return false;
				}
			}
			return true;
		}
		else{
		for(int i = 1;i<integers.size();i++){
			if(integer.compare(integers.get(i-1),integers.get(i))>0){
				return false;
			}
			
		}
		return true;
		}
	}
	
	public String toString(){
		String integervalue = "";
		for(int i = 0;i<integers.size();i++){
			integervalue = integervalue + integers.get(i) + "\n";
		}
		
		return integervalue;
	}
	
	public void mySLOsort(){
        int length = integers.size();
        for(int n = length; n>1; n--){
                int iMax = 0;
                for(int i = 1; i < n; i++){
                        if(integers.get(i)>integers.get(iMax))
                                iMax = i;
                          
                        }
                        int aTemp = integers.get(iMax);
                        int bTemp = integers.get(n-1);
                        integers.set(iMax, bTemp);
                        integers.set(n-1, aTemp);
                        
                }
	}
	
	public void mySLOsort(Comparator<Integer> c){

        int length = integers.size();
        for(int n = length; n>1; n--){
                int iMax = 0;
                for(int i = 1; i < n; i++){
                        if(c.compare(integers.get(iMax),integers.get(i))<0)
                                iMax = i;
                        }
                        int aTemp = integers.get(iMax);
                        int bTemp = integers.get(n-1);
                        integers.set(iMax, bTemp);
                        integers.set(n-1, aTemp);
 
                }
	}
	
	public int binarySearch(int key){
		int min,mid,max;
		min =0;
		max = integers.size()-1;
		while(min<=max){
			mid = (min+max)/2;
			if(integers.get(mid)<key){
				min = mid+1;
			}
			else if(integers.get(mid)>key){
				max = mid-1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	
	public int recBinarySearch(int key){
		int found = recBinarySearch(key,0,integers.size()-1);
		return found;
		
	}
	
	private int recBinarySearch(int key,int min,int max){
		if(min>max){
			return -1;
		}
		int mid = (min+max)/2;
		if(integers.get(mid)<key){
			return recBinarySearch(key,mid+1,max);
		}
		else if(integers.get(mid)>key){
			return recBinarySearch(key,min,mid-1);
		}
		else{
			return mid;
		}
	}

}
