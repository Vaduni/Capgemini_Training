package capgemini;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String[] input = {
		            "12-4-1978",
		            "21.4.2001",
		            "5-6-99",
		            "04-11-01"
		        };
		        for(String date : input){
		            System.out.println(convertDate(date));
		        }
		    }
		    static String convertDate(String date){
		        date = date.replace('.', '-');
		        String[] parts = date.split("-");
		        String day = String.format("%02d", Integer.parseInt(parts[0]));
		        String month = String.format("%02d", Integer.parseInt(parts[1]));
		        String year = parts[2];
		        if(year.length() == 2){
		            int y = Integer.parseInt(year);
		            if(y <= 50) year = "20" + year;
		            else year = "19" + year;
		        }
		        return day + month + year;
	}

}
