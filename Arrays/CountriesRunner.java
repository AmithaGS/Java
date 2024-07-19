class CountriesRunner{
	public static void main(String[] args){
		String[] names={"Jammu and kashmir","Himachal Pradesh","Punjab","Haryana","Uttarakhand","Rajasthan",
		"Uttar pradesh","Bihar","Sikkim","Meghalaya","Assam","Arunachal pradesh","Telangana","Gujurath",
		"Madhya Pradesh","Chhattisgarh","Jharkhand","West Bengal","Tripura","Mizoram","Manipur","Nagaland",
		"Maharastra","Odisha","Goa","Andra Pradesh","Karnataka","Kerala","Tamil Nadu"};
		Countries.stateNames(names);
		
		int[] codes={577528,577204,577506,530068,560001,560002,560003,564398,568765,562367};
		Countries.codesOf(codes);
		
		String[] primeMinisterNames={"Jawaharlal Nehru","Gulzarilal nanda","Lal Bahadur Shastri","Indira gandhi",
		"Morarji Desai","Charan singh","rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar",
		"P V Narasimha Rao","Atal Bihari Vajpayee","H D Deve Gowda","Inder kumar Gujaral","Manamohan Singh",
		"Narendra Modi"};
		Countries.ministerNames(primeMinisterNames);
		
		String[] ministers={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin jairam Gadkari",
		"smt.Nirmala Sitaraman","Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda",
		"Shri Manohar Lal","Shri H D Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra pradhan","Shri Jitan Ram Manjhi",
		"Shri rajiv Ranjan Singh Alias Lalan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Pralhad Joshi",
		"Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M Scindia","Shri Bhupender Yadav",
		"Shri Gajendra Singh Shekhawat","smt Annapurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri",
		"Dr. Mansukh Mandaviya","Shri G Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
		Countries.ministerOfCabinet(ministers);
		
		String[] partiesNames={"Bharatiya Janatha Party","Indian National Congress","Aam Aadmi Party",
		"National Peoples party","Communist party of India"};
		Countries.parties(partiesNames);

	}
}