import futureman.findZahl.Zahlfinder;
import futureman.findZahl.commands.FindYZahlenToSumUpToX.Find2ZahlenWhichSumToY;
import futureman.findZahl.commands.FindYZahlenToSumUpToX.Find3ZahlenWhichSumToY;
import futureman.findZahl.commands.FindYZahlenToSumUpToX.Find4ZahlenWhichSumToY;

public class ZahlfinderTest {

	public static void main(String[] args) {
		int[] testzahlen = {58,27,31,26,82,51,43,33,42,36,44,20,28,25,43,44,59,11,17,13,7,23,11};
		
		Find2ZahlenWhichSumToY f2 = new Find2ZahlenWhichSumToY(testzahlen,100);
		Find3ZahlenWhichSumToY f3 = new Find3ZahlenWhichSumToY(testzahlen, 100);
		Find4ZahlenWhichSumToY f4 = new Find4ZahlenWhichSumToY(testzahlen, 100);
		
		Zahlfinder zf = new Zahlfinder(f2); 
		int[] ergebniss = zf.findZahlen();
		for(int i = 0; i < ergebniss.length; i++) {
			System.out.print("[" + ergebniss[i] + "], ");
		}
		System.out.println();
		zf._cmd = f3;
		ergebniss = zf.findZahlen();
		for(int i = 0; i < ergebniss.length; i++) {
			System.out.print("[" + ergebniss[i] + "], ");
		}
		System.out.println();
		zf._cmd = f4;
		ergebniss = zf.findZahlen();
		for(int i = 0; i < ergebniss.length; i++) {
			System.out.print("[" + ergebniss[i] + "], ");
		}
		System.out.println();
	}
}
