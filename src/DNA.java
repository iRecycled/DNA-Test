public class DNA 
{
	private String sequence;

	public DNA(String sequence)
	{
		this.sequence = sequence;
		//make sure it has only A C G T letters inside
		validate(sequence);
	}
	
	public String getSequence()
	{
		return sequence;
	}
	
	private boolean validate(String test)
	{
		//If string in has the letters A C G T return true
		//Else return false
		boolean tester = false;
		for(int i = 0;i < sequence.length();i++)
		{
			// if only letters A C G T are in the code
			if(sequence.charAt(i) == 'G' || sequence.charAt(i) == 'C' || sequence.charAt(i) == 'T' || sequence.charAt(i) == 'A')
			{
				tester = true;
			}
			else
			{
				//letters other than A C G T are in the code
				sequence = "";
				tester = false;
			}
		}
		return tester;
	}
	public int getLength()
	{
		//return length
		return sequence.length();
	}
	public int occurrences(char ch)
	{
		//Compare character ch to the sequence and return the number of occurrences
		int occur = 0;
		for(int i = 0;i < sequence.length();i++)
		{
			if(sequence.charAt(i) == ch)
			{
				occur++;
			}
		}
		return occur;
	}
	
	public boolean contains(String in)
	{
		//Check if sequence contains String in
		boolean test = false;
		for(int i = 0; i < sequence.length()-1;i++)
		{
			test = false;
			//If start of 'in' is the start of sequence then loop through sequence
			if(sequence.charAt(i) == in.charAt(0))
			{
				//then make sure each character inside 'in' is inside sequence
				test = true; //set true once enters inside of sequence
				for(int l = 1;l <= in.length()-1;l++)
				{
					//check that i + l is still inside sequence	
					//if 'in' check is not in sequence return false
					if(i + l > sequence.length()-1 || sequence.charAt(i+l) != in.charAt(l))
					{					
						test = false;
						break;
					}
				}
				if(test == true)
				{
					return test;
				}
			}
		}
			// backwards
			// Start from right side of sequence going backwards
			// example search for AG would now be searching for GA
		for(int j = sequence.length()-1; j >= 0;j--)
			{
				if(sequence.charAt(j) == in.charAt(0))
				{	
					//then make sure each character inside 'in' is inside sequence
					test = true; //set true once enters inside of sequence
					for(int k = 1;k <= in.length()-1 ;k++)
					{
						//check that i + l is still inside sequence
						if(j - k < 0 || sequence.charAt(j-k) != in.charAt(k))
						{
							test = false;
							break;
						}
					}
					if(test == true)
					{
						return test;
					}
				}
			}
		return test;
	}
	
	public String complement()
	{
		//Initialize 'compl'ement as empty string
		String comp = "";
		for(int i = sequence.length() - 1;i >= 0;i--)
		{
			//if sequence has letter G inside add letter C to complement
			if(sequence.charAt(i) == 'G')
			{
				comp += 'C';
			}
			//if sequence has letter C inside add letter G to complement
			else if(sequence.charAt(i) == 'C')
			{
				comp += 'G';
			}
			//if sequence has letter A inside add letter T to complement
			else if(sequence.charAt(i) == 'A')
			{
				comp += 'T';
			}
			//if sequence has letter T inside add letter A to complement
			else if(sequence.charAt(i) == 'T')
			{
				comp += 'A';
			}
		}
		return comp;
	}
}
