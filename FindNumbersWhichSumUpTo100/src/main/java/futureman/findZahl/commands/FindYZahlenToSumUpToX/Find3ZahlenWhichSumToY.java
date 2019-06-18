package futureman.findZahl.commands.FindYZahlenToSumUpToX;

import futureman.findZahl.commands.FindZahlen;

public class Find3ZahlenWhichSumToY extends FindXZahlenWhichSumToY{
	
	public Find3ZahlenWhichSumToY(int[] zahlen, int desiredSum) {
		super(zahlen, desiredSum);
	}
	
	@Override
	public int[] execute() {

		if(_zahlen.length < 3) {
			throw new RuntimeException("At last 3 numbers need to be given!");
		}
		
		for(int i = 0; i < _zahlen.length -2;  i++) {
			for(int j = i+1; j < _zahlen.length -1; j++) {
				for(int k = j+1; k < _zahlen.length; k++) {
					if(_zahlen[i] + _zahlen[j] + _zahlen[k] == _desiredSum) {
						return new int[] {_zahlen[i],_zahlen[j],_zahlen[k]};
					}
				}
			}
			
		}
		return new int[3];
	}
}
