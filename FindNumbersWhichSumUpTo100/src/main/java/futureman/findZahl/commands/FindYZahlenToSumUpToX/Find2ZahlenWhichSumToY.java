package futureman.findZahl.commands.FindYZahlenToSumUpToX;

import futureman.findZahl.commands.FindZahlen;

public class Find2ZahlenWhichSumToY extends FindXZahlenWhichSumToY{

	public Find2ZahlenWhichSumToY(int[] zahlen, int desiredSum) {
		super(zahlen, desiredSum);
	}
	
	@Override
	public int[] execute() {

		if(_zahlen.length < 2) {
			throw new RuntimeException("At last 3 numbers need to be given!");
		}
		
		for(int i = 0; i < _zahlen.length -2;  i++) {
			for(int j = i+1; j < _zahlen.length -1; j++) {
				if(_zahlen[i] + _zahlen[j] == _desiredSum) {
					return new int[] {_zahlen[i],_zahlen[j]};
				}
			}
			
		}
		return new int[2];
	}
}
