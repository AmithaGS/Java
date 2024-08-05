class PaperRunner{
	public static void main(String[] args){
		Paper paper=new Paper('M',"good","white");
		paper.paperDisplay();
		paper.setPaper('S',"bad","pink");
					System.out.println();

		
		Paper paper1=new Paper('S',"bad","green");
		paper1.paperDisplay();
		paper1.setPaper('L',"good","white");
					System.out.println();

		
		Paper paper2=new Paper('S',"good","red");
		paper2.paperDisplay();
		paper2.setPaper('M',"bad","blue");
	}
}