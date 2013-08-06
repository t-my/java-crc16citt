/*
 * Class for calculating CRC16CITT for byte arrays.
 * @author Tuomas Soikkeli 
 */
public class CRC16CCITT {
	
	public int crc = 0;
	
	private void calc_crc(int character) {
		int crc_tmp;
		crc_tmp = ((crc ^ character) & 0x0F);
		crc = (crc >>> 4) ^ (crc_tmp * 4225);
		crc_tmp = ((crc ^ (character >>> 4)) & 0x0F);
		crc = (crc >>> 4) ^ (crc_tmp * 4225);
	}
	
	public void update(byte b) {
		calc_crc(b);
	}
	
	public void reset() {
		crc = 0;
	}
	
	public int highByte() {
		return (( crc >> 8) & 0xFF);

	}
	
	public int lowByte() {
		return crc & 0xFF;
	}
	
	public int value() {
		return crc;
	}
}
