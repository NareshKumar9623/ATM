
public class AtmBalance {
	int $2000;
	int $500;
	int $200;
	int $100;
	int total;
	public AtmBalance(int $2000, int $500, int $200, int $100, int total) {
		super();
		this.$2000 = $2000;
		this.$500 = $500;
		this.$200 = $200;
		this.$100 = $100;
		this.total = total;
	}
	@Override
	public String toString() {
		return "AtmBalance [$2000=" + $2000 + ", $500=" + $500 + ", $200=" + $200 + ", $100=" + $100 + ", total="
				+ total + "]";
	}
	public int get$2000() {
		return $2000;
	}
	public void set$2000(int $2000) {
		this.$2000 = $2000;
	}
	public int get$500() {
		return $500;
	}
	public void set$500(int $500) {
		this.$500 = $500;
	}
	public int get$200() {
		return $200;
	}
	public void set$200(int $200) {
		this.$200 = $200;
	}
	public int get$100() {
		return $100;
	}
	public void set$100(int $100) {
		this.$100 = $100;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

}
