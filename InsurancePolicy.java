package in.abc.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InsurancePolicy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyId;
	
	@Column(length = 20)
	private String polictyName;
	
	@Column(length = 20)
	private String policyType;
	
	@Column(length = 20)
	private String company;
	
	private Integer tenure;

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public String getPolictyName() {
		return polictyName;
	}

	public void setPolictyName(String polictyName) {
		this.polictyName = polictyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "InsurancePolicy [policyId=" + policyId + ", polictyName=" + polictyName + ", policyType=" + policyType
				+ ", company=" + company + ", tenure=" + tenure + "]";
	}

}
