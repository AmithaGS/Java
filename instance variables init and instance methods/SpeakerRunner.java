class SpeakerRunner{
	public static void main(String[] args){
		Speaker speaker=new Speaker('M',1500,"good hearing");   //ref
		speaker.display();
		speaker.setSpeaker('S',2000,"good volume");
		speaker.display();
		System.out.println();
		
		Speaker speaker1=new Speaker('S',2000,"good noise");   //ref
		speaker1.display();
		speaker1.setSpeaker('S',1000,"good hearing");
		speaker1.display();
		System.out.println();

		
		Speaker speaker2=new Speaker('M',3000,"good hearing");   //ref
		speaker2.display();
		speaker2.setSpeaker('S',3500,"good noise");
		speaker2.display();

	
	}
}