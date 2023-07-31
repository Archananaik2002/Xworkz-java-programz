class TrainerExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in TrainerExecuter");
		Trainer.teach();
		Trainer.teach("SQL");
		Trainer.teach("SQL",12);
		Trainer.teach("SQL",12,"Arch");
		Trainer.giveTask();
		Trainer.giveTask(12000);
		Trainer.giveTask("Bengaluru",190);
		Trainer.giveTask("Bengaluru",190,100);
		Trainer.takeTest();
		Trainer.takeTest(120);
	}
}