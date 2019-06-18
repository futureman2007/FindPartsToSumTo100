package futureman.findZahl.commands.FindYZahlenToSumUpToX;import futureman.findZahl.Zahlfinder;
import futureman.findZahl.commands.FindZahlen;

public class Find4ZahlenWhichSumToY extends FindXZahlenWhichSumToY {

	public Find4ZahlenWhichSumToY(int[] zahlen, int desiredSum) {
		super(zahlen, desiredSum);
	}
	@Override
	public int[] execute() {

		if(_zahlen.length < 4) {
			throw new RuntimeException("At last 3 numbers need to be given!");
		}
		
		for(int i = 0; i < _zahlen.length -3;  i++) {
			for(int j = i+1; j < _zahlen.length -2; j++) {
				for(int k = j+1; k < _zahlen.length -1; k++) {
					for(int l = k+1; l < _zahlen.length; l++) {
						if(_zahlen[i] + _zahlen[j] + _zahlen[k] + _zahlen[i] == _desiredSum) {
							return new int[] {_zahlen[i],_zahlen[j],_zahlen[k], _zahlen[l]};
						}
					}
				}
			}
			
		}
		return new int[4];
	}
}
