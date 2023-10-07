import java.util.Random;

public class parameters {
	static String websitUrl="https://magento.softwaretestingboard.com/";
	
	public static String[] firstName= {"Dana","Ahmad","Khaled","lama"};
	public static String[] lastName= {"Mohammed","Rami","Ahmad","Marwan"};
	static String name=chooseRandomName(firstName);
	static String secondName=chooseRandomFamily(lastName);
	static String Email=name+"."+secondName+"159"+"@gmail.com";
    static String randomPassword = generateRandomPassword();

	public static void main (String []args) {
		
		
		
	
	
}
	private static String generateRandomPassword() {
		Random randomPassword=new Random();
		int passwordLength=9;
        StringBuilder password = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = randomPassword.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
   
	}
	private static String chooseRandomFamily(String[] lastName2) {
		Random randomFamily=new Random();
		int randomIndex2=randomFamily.nextInt(lastName.length);
		return lastName2[randomIndex2];
	}
	private static String chooseRandomName(String[] firstName2) {
		Random randomName=new Random();
		int randomIndex=randomName.nextInt(firstName.length);
		return firstName2[randomIndex];
	}

}