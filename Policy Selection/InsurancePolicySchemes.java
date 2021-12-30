package Assignment3Dec9;

import java.util.Scanner;

public class InsurancePolicySchemes implements PolicyInterface {

	Scanner sc = new Scanner(System.in);

	public PolicyHolder userDetails() {
		PolicyHolder ph = new PolicyHolder();
		System.out.println("Enter your Name");
		ph.setName(sc.next());
		System.out.println("Enter your Age");
		ph.setAge(sc.nextInt());
		System.out.println("Aadhar card no :");
		ph.setAadhar(sc.next());
		System.out.println("PAN card no :");
		ph.setPAN(sc.next());
		System.out.println("Enter your mobile no :");
		ph.setMobile(sc.nextLong());
		return ph;
	}

	@Override
	public void PensionPlans() {
		System.out.println("************* PENSION POLICY ***************");
		PolicyHolder ph = userDetails();

		System.out.println("Choose your Scheme   :");
		System.out.println("1  = GOLD (Monthly deposite = 500 and interest :3.80 )");
		System.out.println("2  = DIAMOND (Monthly deposite = 1000 and interest :3.85)");
		System.out.println("3  = PLATINUM (Monthly deposite = 1500 and interest :4.00)");
		int scheme = sc.nextInt();
		if (scheme == 1) {

			double goldSchemeInterest = ((500 * 12 * 3.80) / 100);
			System.out.println("After 1 year of deposited Amount with interest" + goldSchemeInterest);

		} else if (scheme == 2) {
			double diamondSchemeInterest = ((1000 * 12 * 3.85));
			System.out.println("After 1 year of deposited Amount with interest" + diamondSchemeInterest);
		} else if (scheme == 3) {

			double platinumSchemeInterest = ((1500 * 12 * 4.00));
			System.out.println("After 1 year of deposited Amount with interest" + platinumSchemeInterest);
		} else

		{
			System.out.println("Invalid Scheme no");
		}

	}

	@Override
	public void healthPlans() {
		PolicyHolder ph = userDetails();
		System.out.println("************* HEALTH POLICY ***************");

		System.out.println("Choose your Scheme   :");
		System.out.println("1  = GOLD (Monthly deposite = 500 and interest :3.80 )");
		System.out.println("2  = DIAMOND (Monthly deposite = 1000 and interest :3.85)");
		System.out.println("3  = PLATINUM (Monthly deposite = 1500 and interest :4.00)");
		int scheme = sc.nextInt();
		if (scheme == 1) {

			double goldSchemeInterest = ((500 * 12 * 3.80) / 100);
			System.out.println("After 1 year of deposited Amount with interest" + goldSchemeInterest);
		} else if (scheme == 2) {
			double diamondSchemeInterest = ((1000 * 12 * 3.85));
			System.out.println("After 1 year of deposited Amount with interest" + diamondSchemeInterest);
		} else if (scheme == 3) {
			double platinumSchemeInterest = ((1500 * 12 * 4.00));
			System.out.println("After 1 year of deposited Amount with interest" + platinumSchemeInterest);
		} else

		{
			System.out.println("Invalid Scheme no");
		}

	}

	@Override
	public void individualPlans() {
		System.out.println("************* SELF POLICY ***************");
		PolicyHolder ph = userDetails();

		System.out.println("Choose your Scheme   :");
		System.out.println("1  = GOLD (Monthly deposite = 500 and interest :3.80 )");
		System.out.println("2  = DIAMOND (Monthly deposite = 1000 and interest :3.85)");
		System.out.println("3  = PLATINUM (Monthly deposite = 1500 and interest :4.00)");
		int scheme = sc.nextInt();
		if (scheme == 1) {
			double goldSchemeInterest = ((500 * 12 * 3.80) / 100);
			System.out.println("After 1 year of deposited Amount with interest" + goldSchemeInterest);
		} else if (scheme == 2) {
			double diamondSchemeInterest = ((1000 * 12 * 3.85));
			System.out.println("After 1 year of deposited Amount with interest" + diamondSchemeInterest);
		} else if (scheme == 3) {
			double platinumSchemeInterest = ((1500 * 12 * 4.00));
			System.out.println("After 1 year of deposited Amount with interest" + platinumSchemeInterest);
		} else {
			System.out.println("Invalid Scheme no");
		}

	}

	@Override
	public void GroupSchemes() {
		System.out.println("************* FAMILY POLICY ***************");
		PolicyHolder ph = userDetails();

		System.out.println("Choose your Scheme   :");
		System.out.println("1  = GOLD (Monthly deposite = 500 and interest :3.80 )");
		System.out.println("2  = DIAMOND (Monthly deposite = 1000 and interest :3.85)");
		System.out.println("3  = PLATINUM (Monthly deposite = 1500 and interest :4.00)");
		int scheme = sc.nextInt();
		if (scheme == 1) {
			double goldSchemeInterest = ((500 * 12 * 3.80) / 100);
			System.out.println("After 1 year of deposited Amount with interest :" + goldSchemeInterest);
		} else if (scheme == 2) {
			double diamondSchemeInterest = ((1000 * 12 * 3.85));
			System.out.println("After 1 year of deposited Amount with interest :" + diamondSchemeInterest);
		} else if (scheme == 3) {
			double platinumSchemeInterest = ((1500 * 12 * 4.00));
			System.out.println("After 1 year of deposited Amount with interest :" + platinumSchemeInterest);
		} else

		{
			System.out.println("Invalid Scheme no");
		}

	}

	public void display(PolicyHolder ph) {
		System.out.println("NAME :" + ph.getName());
		System.out.println("Age :" + ph.getAge());
		System.out.println("Aadhar :" + ph.getAadhar());
		System.out.println("PAN no :" + ph.getPAN());
		System.out.println("Mobile no :" + ph.getMobile());
	}
}
