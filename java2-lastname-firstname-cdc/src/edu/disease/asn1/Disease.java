package edu.disease.asn1;
import java.util.UUID;

/**
 * The abstract class Disease represents a general concept of a disease.
 * It contains common fields and methods for various types of diseases.
 */
public abstract class Disease {

    /** The universally unique identifier (UUID) of the disease. */
    UUID diseaseId;

    /** The name of the disease. */
    String name;

    /**
     * Abstract method to be implemented by subclasses.
     * Returns an array of example disease names.
     *
     * @return An array of example disease names.
     */
    public abstract String[] getExamples();

    /**
     * Gets the UUID of the disease.
     *
     * @return The UUID of the disease.
     */
    public UUID getDiseaseId() {
        return diseaseId;
    }

    /**
     * Sets the UUID of the disease.
     *
     * @param diseaseId The UUID of the disease to set.
     */
    public void setDiseaseId(UUID diseaseId) {
        this.diseaseId = diseaseId;
    }

    /**
     * Gets the name of the disease.
     *
     * @return The name of the disease.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the disease.
     *
     * @param name The name of the disease to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    // Overrides and other methods

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
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
        Disease other = (Disease) obj;
        if (diseaseId == null) {
            if (other.diseaseId != null)
                return false;
        } else if (!diseaseId.equals(other.diseaseId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Disease [diseaseId=" + diseaseId + ", name=" + name
               + ", getDiseaseId()=" + getDiseaseId() + ", getName()=" + getName()
               + ", hashCode()=" + hashCode() + "]";
    }
}
// class InfectiousDisease extends Disease{
// 	@Override
// 	public String[] getExamples() {
// 		String[] d1 = {"corona","diabetics","virus","AIDS"};
// 		return d1;
// 	}
// }
// class NonInfectiousDisease extends Disease{

// 	@Override
// 	public String[] getExamples() {
// 		String[] d2 = {"corona-2023" ,"diabetics -12","virus-23","fever-12"};
// 		return d2;
// 	}
	
// }
