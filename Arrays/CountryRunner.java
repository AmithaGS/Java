class CountryRunner{
	public static void main(String[] args){
		String[] names={"Jammu and kashmir","Himachal Pradesh","Punjab","Haryana","Uttarakhand","Rajasthan",
		"Uttar pradesh","Bihar","Sikkim","Meghalaya","Assam","Arunachal pradesh","Telangana","Gujurath",
		"Madhya Pradesh","Chhattisgarh","Jharkhand","West Bengal","Tripura","Mizoram","Manipur","Nagaland",
		"Maharastra","Odisha","Goa","Andra Pradesh","Karnataka","Kerala","Tamil Nadu"};
		
		Country.stateNames(names);
		Country.codesOf(577528);
		Country.ministerNames("primeMinisterNames");
		Country.ministerOfCabinet("ministers");
		Country.parties("partiesNames");

	}
}