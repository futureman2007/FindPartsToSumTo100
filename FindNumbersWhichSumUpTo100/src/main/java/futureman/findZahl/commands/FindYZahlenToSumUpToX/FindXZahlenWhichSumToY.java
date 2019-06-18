package futureman.findZahl.commands.FindYZahlenToSumUpToX;

import futureman.findZahl.commands.FindZahlen;

public abstract class FindXZahlenWhichSumToY implements FindZahlen{

	protected int[] _zahlen;
	protected int _desiredSum;
	
	public FindXZahlenWhichSumToY(int[] zahlen, int desiredSum) {
		_zahlen = zahlen;
		_desiredSum = desiredSum;
	}
	
	@Override
	public int[] execute() {
		throw new RuntimeException("Execute Method not implemented yet!");
	}
	
}
