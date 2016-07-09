package karan.xgeneral;

import java.util.HashMap;

public class dateFormat {
	
	
	private static String getValue(String s) {
	     if (s == "Jan") return "01";
	     else if (s == "Feb") return "02";
	     else if (s == "Mar") return "03";
	     else if (s == "Apr") return "04";
	     else if (s == "May") return "05";
	     else if (s == "Jun") return "06";
	     else if (s == "Jul") return "07";
	     else if (s == "Aug") return "08";
	     else if (s == "Sep") return "09";
	     else if (s == "Oct") return "10";
	     else if (s == "Nov") return "11";
	     else return "12";
	}
	
	static String Reformat(String dates) {
       
		StringBuilder res = new StringBuilder();
		String[] record = dates.split(" ");
		res.append(record[2]);
		res.append("-"+getValue(record[1]));
		if(record[0].length() == 4){
			res.append("-"+record[0].substring(0, 2));
		}else{

			res.append("-"+record[0].substring(0, 1));
		}
		return res.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Reformat("4th Oct 1992"));
	}

}
