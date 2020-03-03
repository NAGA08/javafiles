package Introtri;

public class Bird {
		
		public String birdName;
		public String birdColor;
		private boolean singStatus;
		protected static int legs;
		protected static int wings;
		
			Bird()
			{
				legs=2;
				wings=2;
				System.out.println("Bird created");
				
			}
			public Bird(String birdName, String birdColor, boolean singStatus){
				super();
				this.birdName = birdName;
				this.birdColor = birdColor;
				this.singStatus = singStatus;
				
			}
			public void fly()
			{
				System.out.println("check wings");
				System.out.println("bird is flying");
				
			}
			public boolean isSingStatus(){
				return singStatus;
				
			}
			public void setSingStatus(boolean singStatus){
				this.singStatus	 =singStatus;
				
			}
			
}
