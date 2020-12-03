class test {

public static void main(String [] args ){
		
		int len = 5;
		String word = "sabalNiroula";
		
		for(int i =0;i<1;i++){
		int a = word.length();
		
			for(int j = 0;j<word.length()/2;j+=len){
				 
				String str = word.substring(j,j+len);
				String str1 = word.substring(a-len,a);
				
				System.out.println(str+ " "+str1);
				a-=2;
				i=i+len;
			}
			
		}
		
	}

}