package futureman.findZahl;

import futureman.findZahl.commands.FindZahlen;

public class Zahlfinder {

	public FindZahlen _cmd;
	
	public Zahlfinder(FindZahlen cmd) {
		_cmd = cmd;
	}
	//mit command pattern erweitern! lese Daten ein und implementiere einen neuen finder!
	public int[] findZahlen() {
		return _cmd.execute();
	}
	
	
	
}
