class MaskRunner{
	public static void main(String[] args){
		Mask mask=new Mask();
		System.out.println("cost of mask:"+mask.cost);
		System.out.println("size of mask:"+mask.size);
		System.out.println("material of mask:"+mask.material);
		System.out.println();

		
		Mask mask1=new Mask(100);
		System.out.println("cost of mask1:"+mask1.cost);
		System.out.println("size of mask1:"+mask1.size);
		System.out.println("material of mask1:"+mask1.material);
		System.out.println();

		Mask mask2=new Mask('M');
		System.out.println("cost of mask2:"+mask2.cost);
		System.out.println("size of mask2:"+mask2.size);
		System.out.println("material of mask2:"+mask2.material);
		System.out.println();
		
		Mask mask3=new Mask("cotton");
		System.out.println("cost of mask3:"+mask3.cost);
		System.out.println("size of mask3:"+mask3.size);
		System.out.println("material of mask3:"+mask3.material);
		System.out.println();
		
		Mask mask4=new Mask(150,'s',"cotton");
		System.out.println("cost of mask4:"+mask4.cost);
		System.out.println("size of mask4:"+mask4.size);
		System.out.println("material of mask4:"+mask4.material);
		System.out.println();
		
		Mask mask5=new Mask(150,'s');
		System.out.println("cost of mask5:"+mask5.cost);
		System.out.println("size of mask5:"+mask5.size);
		System.out.println("material of mask5:"+mask5.material);
		System.out.println();
	}
}