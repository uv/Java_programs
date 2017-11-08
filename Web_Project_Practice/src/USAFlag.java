public class USAFlag {

	public static void stars(int x){
		for (int i=0; i<12;i++){
		if (x==0 || x%2==0){
		if (i==0 || i%2==0) 
			System.out.print("*");
		else System.out.print(" ");
		}
		else{
		if (i%2==1 && i<11) System.out.print("*");
		else System.out.print(" ");
		}
		}
		}
		public static void fullLine(){
		for(int i=0; i<50;i++){
		System.out.print("=");
		}
		System.out.println();
		}
		public static void main(String[] args) {
		int i, j;
		for(i=0; i<9;i++){
		stars(i);
		for(j=0;j<38;j++){
		System.out.print("=");
		}
		System.out.println();
		}
		for(i=0;i<6;i++){
		fullLine();
		}
		}
		}