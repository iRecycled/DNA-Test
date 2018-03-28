
public class DNAdriver {

	public static void main(String[] args) 
	{
		DNA rna = new DNA("AGCT");
		System.out.println("Length: " + rna.getLength());
		System.out.println("Sequence: " + rna.getSequence());
		System.out.println("Occurances of 'A': " + rna.occurrences('A'));
		boolean result = rna.contains("CA");
		System.out.println("Contains : "+ result);
		System.out.println("Compliment: " + rna.complement());

	}

}
