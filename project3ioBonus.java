import java.io.*;

class project3ioBonus{
    public static void main(String[]args){
	InputStreamReader q = new InputStreamReader(System.in);
	BufferedReader j = new BufferedReader (q);
	System.out.println("Enter height of the Triangle:");
	double height =0.0;
	try{
	    height=Integer.valueOf(j.readLine());
	}
	catch(Exception p){
	    System.out.println("Invalid number!");
			
	}
	for(int w=1; w<=height; w++){
	    for(int z=1; z<height -(w-1); z++){
		System.out.print(" ");
	    }
	    for(int v=1; v<=w; v++){
		System.out.print("*");
		for(int q1=1; q1<v; q1+=v){
		System.out.print("*");
		}
	    }
	    System.out.println("");
	}
    }
}