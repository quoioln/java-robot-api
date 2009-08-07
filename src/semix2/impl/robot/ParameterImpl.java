package semix2.impl.robot;

import semix2.robot.Parameter;

public class ParameterImpl implements Parameter {
	private final byte[] 		_bytes;
	
	public ParameterImpl(byte[] bytes) {
		_bytes = bytes.clone();
	}
	
	public int getLength() {
		return _bytes.length;
	}
	
	public byte[] getBytes() {
		return _bytes.clone();
	}
}
