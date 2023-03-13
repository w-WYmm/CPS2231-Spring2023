package week5;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[][] stuAns = new String[][]{{"A","B","A","C","C","D","E","E","A","D"},
                {"D","B","A","B","C","A","E","E","A","D"},
                {"E","D","D","A","C","B","E","E","A","D"},
                {"C","B","A","E","D","C","E","E","A","D"},
                {"A","B","D","C","C","D","E","E","A","D"},
                {"B","B","E","C","C","D","E","E","A","D"},
                {"B","B","A","C","C","D","E","E","A","D"},
                {"E","B","E","C","C","D","E","E","A","D"}};
        String[] ans = new String[]{"D","B","D","C","C","D","A","E","A","D"};
        for(int i = 0 ; i <  stuAns.length;i++) {
        	int correctAns = 0;
        	for(int j = 0; j < stuAns[i].length;j++) {
        		if(stuAns[i][j].equals(ans[j])) {
        			correctAns ++;
        		}
        	}
        	System.out.println(" Student "+ i + " the number of correct answers " + correctAns);
        } 
	}

}
