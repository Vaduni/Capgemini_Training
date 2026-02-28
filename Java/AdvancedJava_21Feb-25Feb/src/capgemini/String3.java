package capgemini;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is Java lang";
		         String res="";
		         String w[]=s.split(" ");
		         for(int i=0;i<w.length;i++){
		        res=res+Character.toUpperCase(w[i].charAt(0)) + w[i].substring(1) + " ";
		       }
		        System.out.println(res); 
	}

}
