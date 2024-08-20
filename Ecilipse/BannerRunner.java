package com.xworkz.engineering;

public class BannerRunner {

	public static void main(String[] args) {
		Banner banner1= new Banner("School banner",10000,120.0);
		Banner banner2= new Banner("college banner",2000,200.0);
		Banner banner3= new Banner("election banner",40000,1000.0);
		
		Banner[] bannerStore= {banner1,banner2,banner3};
		int banners=bannerStore.length;
		for(int i=0;i<bannerStore.length;i++) {
			System.out.println("reading banner from index :"+i);
			Banner ref = bannerStore[i];
			ref.displayBanner();
		}

	}

}
