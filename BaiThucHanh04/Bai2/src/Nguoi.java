
public class Nguoi {
	private String ten;
	private String gioiTinh;
	private int tuoi;
	public Nguoi() {}
	public Nguoi(String ten,int tuoi,String gioiTinh) {
		this.ten=ten;
		this.tuoi=tuoi;
		this.gioiTinh=gioiTinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "| Ten: " + ten + "| Gioi Tinh=" + gioiTinh + "| Tuoi: " + tuoi + "|";
	}
	
}
