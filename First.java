class Greet {
	public static void main(String abc[]) 	{
		System.out.println("Greetings from java");
		SavingsAccount savObj = new SavingsAccount();
		savObj.withdraw();
		Flight fliObj = new Flight();
		fliObj.fly();
	}
}
class SavingsAccount {
	public void withdraw() {
		System.out.println("withdraw() from SavingsAccount");
	}
}
class Flight{
	public void fly() 	{
		System.out.println("fly() of the Flight");
	}
}


