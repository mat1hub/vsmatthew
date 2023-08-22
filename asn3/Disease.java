package edu.disease.asn3;
import java.io.Serializable;
import java.util.UUID;

/**
 * Abstract base class representing a disease.
 */
public abstract class Disease implements Serializable {

    /** Unique identifier for the disease. */
     UUID diseaseId;

    /** Name of the disease. */
     String name;

    /**
     * Abstract method to get examples of disease names.
     *
     * @return An array of example disease names.
     */
    public abstract String[] getExamples();

    /**
     * Get the unique identifier for the disease.
     *
     * @return The unique identifier (UUID) for the disease.
     */
    public UUID getDiseaseId() {
        return diseaseId;
    }

    /**
     * Set the unique identifier for the disease.
     *
     * @param diseaseld The unique identifier (UUID) to set for the disease.
     */
    public void setDiseaseld(UUID diseaseId) {
        this.diseaseId = diseaseId;
    }

    /**
     * Get the name of the disease.
     *
     * @return The name of the disease.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the disease.
     *
     * @param name The name to set for the disease.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Calculate the hash code for the disease.
     *
     * @return The hash code value for the disease.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
        return result;
    }

    /**
     * Compare two disease objects for equality.
     *
     * @param obj The object to compare with.
     * @return True if the diseases are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Disease other = (Disease) obj;
        if (diseaseId == null) {
            return other.diseaseId == null;
        } else {
            return diseaseId.equals(other.diseaseId);
        }
    }

    /**
     * Get a string representation of the disease.
     *
     * @return A string representation of the disease.
     */
    @Override
    public String toString() {
        return "Disease [diseaseld=" + diseaseId + ", name=" + name
                + ", getDiseaseld()=" + getDiseaseId() + ", getName()=" + getName() + "]";
    }
}

/**
 * Subclass representing an infectious disease.
 */
class InfectiousDisease extends Disease {

    /**
     * Get examples of infectious disease names.
     *
     * @return An array of example infectious disease names.
     */
    @Override
    public String[] getExamples() {
        String[] d1 = {"corona", "diabetics", "virus", "AIDS"};
        return d1;
    }
}

/**
 * Subclass representing a non-infectious disease.
 */
class NonInfectiousDisease extends Disease {

    /**
     * Get examples of non-infectious disease names.
     *
     * @return An array of example non-infectious disease names.
     */
    @Override
    public String[] getExamples() {
        String[] d2 = {"corona-2023", "diabetics-12", "virus-23", "fever-12"};
        return d2;
    }

	
	
}

