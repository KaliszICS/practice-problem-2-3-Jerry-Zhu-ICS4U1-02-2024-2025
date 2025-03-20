public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String[] strings) {
		boolean hasSwitched = true;
		String temp;
		//for(int i = 0; i < strings.length; i++){
		//	strings[i] = strings[i].toLowerCase();		
		//}
		for(int i = 0; i < strings.length - 1 && hasSwitched; i++){
			hasSwitched = false;
			for(int j = 0; j < strings.length - 1 - i; j++){
				if ((strings[j].toLowerCase()).compareTo((strings[j+1].toLowerCase())) > 0){
temp = strings[j];
strings[j] = strings[j+1];
strings[j+1] = temp;
hasSwitched = true;
				}
	
			}
		}
	}

}
