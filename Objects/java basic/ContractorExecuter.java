class ContractorExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in ContractorExecuter");
		Contractor.contract("Darshan");
		Contractor.contract("Darshan",120000);
		Contractor.contract("Darshan",12);
		Contractor.location("Bangalore");
		Contractor.location(1000);
		Contractor.workers(10);
		Contractor.contractorWork("Building Home");
		Contractor.contractorSupervise();
		Contractor.payAmount(10000);
		Contractor.bid(1000);
	}
}