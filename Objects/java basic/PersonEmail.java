class PersonEmail{
	static String getEmailByName(String personName)
	{
		System.out.println("invoking getEmailByName in PersonEmail");
		if(personName!=null)
		{
			System.out.println("getAgeByName is valid");
			if("Archana"==personName)
			{
			return "archananaik@gmail.com";
		    }
		    if("akash"==personName)
			{
			return "akash12@gmail.com";
		    }
		    if("harshita"==personName)
			{
			return "harshita@gmail.com";
		    }
		    if("Sai"==personName)
			{
			return "sai2000@gmail.com";
		    }
		    if("mayur"==personName)
			{
			return "mayur@gmail.com";
		    }
		    if("Kavya"==personName)
			{
			return "kavya@gmail.com";
		    }
			if("Shravya"==personName)
			{
			return "shravyan@gmail.com";
		    }
			if("Chaitra"==personName)
			{
			return "chaitraab@gmail.com";
		    }
			if("Prashant"==personName)
			{
			return "prashant@gmail.com";
		    }
			if("Prakash"==personName)
			{
			return "prakashk@gmail.com";
		    }
		}
		else
		{
			System.err.println("getEmailByName is in valid");
		    }
			
		
		return "none@gmail.com";
		
	}
	
}