package foo01;

import java.util.Date;

public class Patient {
	private String name;
	private Date dob;
	private String mrnVidant;
	private String mrnPE;

	public Patient(String name, Date dob, String mrnVidant, String mrnPE) {
		this.name = name;
		this.dob = dob;
		this.mrnVidant = mrnVidant;
		this.mrnPE = mrnPE;
	}

	public Patient(String name, Date dob, String mrnVidant) {
		this(name, dob, mrnVidant, null);
	}

	public String getMrnPE() {
		return mrnPE;
	}

	public void setMrnPE(String mrnPE) {
		this.mrnPE = mrnPE;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public String getMrnVidant() {
		return mrnVidant;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", dob=" + dob + ", mrnVidant=" + mrnVidant + ", mrnPE=" + mrnPE + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((mrnVidant == null) ? 0 : mrnVidant.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (mrnVidant == null) {
			if (other.mrnVidant != null)
				return false;
		} else if (!mrnVidant.equals(other.mrnVidant))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
