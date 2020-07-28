package test;

public class ProductDO {
	// Field
	private int pro_index;
	private String pro_subject;
	private String pro_release;
	private String pro_assessment;
	private String pro_distributor;
	private String pro_production;
	private String pro_explanation;
	private int pro_price;
	
	// Constructor
	public ProductDO() {}
	
	// Method
	public ProductDO(int pro_index, String product_subject, String product_release, String product_assessment, String product_distributor, String product_production, String product_explanation, int product_price) {
		this.pro_subject = product_subject;
		this.pro_distributor = product_distributor;
		this.pro_explanation = product_explanation;
		this.pro_assessment = product_assessment;
		this.pro_price = product_price;
		this.pro_release = product_release;
		this.pro_production = product_production;
	}

	public int getPro_index() {
		return pro_index;
	}

	public void setPro_index(int pro_index) {
		this.pro_index = pro_index;
	}

	public String getPro_subject() {
		return pro_subject;
	}

	public void setPro_subject(String pro_subject) {
		this.pro_subject = pro_subject;
	}

	public String getPro_release() {
		return pro_release;
	}

	public void setPro_release(String pro_release) {
		this.pro_release = pro_release;
	}

	public String getPro_assessment() {
		return pro_assessment;
	}

	public void setPro_assessment(String pro_assessment) {
		this.pro_assessment = pro_assessment;
	}

	public String getPro_distributor() {
		return pro_distributor;
	}

	public void setPro_distributor(String pro_distributor) {
		this.pro_distributor = pro_distributor;
	}

	public String getPro_production() {
		return pro_production;
	}

	public void setPro_production(String pro_production) {
		this.pro_production = pro_production;
	}

	public String getPro_explanation() {
		return pro_explanation;
	}

	public void setPro_explanation(String pro_explanation) {
		this.pro_explanation = pro_explanation;
	}

	public int getPro_price() {
		return pro_price;
	}

	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}	
}
