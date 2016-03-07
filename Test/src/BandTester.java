
public class BandTester {

	public static void main(String[] args){
		
		Instrument trumpet = new Trumpet("Andrew", "A");
		Instrument sax = new Sax("Annah", "B");
		
		Band band = new Band();
		
		band.addInstrument(trumpet);
		band.addInstrument(sax);
		
		System.out.println(band.allPlay());
		
	}
	
}
