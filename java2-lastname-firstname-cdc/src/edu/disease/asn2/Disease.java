package edu.disease.asn2;
import java.util.UUID;

/**
 * The abstract class Disease represents a general concept of a disease.
 * It contains common fields and methods for both infectious and non-infectious diseases.
 */
public abstract class Disease {

    /** The universally unique identifier (UUID) of the disease. */
    UUID diseaseld;

    /** The name of the disease. */
    String name;

    /**
     * Abstract method to be implemented by subclasses.
     * Returns an array of example disease names.
     *
     * @return An array of example disease names.
     */
    public abstract String[] getExamples1();

    /**
     * Gets the UUID of the disease.
     *
     * @return The UUID of the disease.
     */
    public UUID getDiseaseld() {
        return diseaseld;
    }

    /**
     * Sets the UUID of the disease.
     *
     * @param diseaseld The UUID of the disease to set.
     */
    public void setDiseaseld(UUID diseaseld) {
        this.diseaseld = diseaseld;
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
        result = prime * result + ((diseaseld == null) ? 0 : diseaseld.hashCode());
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
        if (diseaseld == null) {
            if (other.diseaseld != null)
                return false;
        } else if (!diseaseld.equals(other.diseaseld))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Disease [diseaseld=" + diseaseld + ", name=" + name
               + ", getDiseaseld()=" + getDiseaseld() + ", getName()=" + getName()
               + ", hashCode()=" + hashCode() + "]";
    }
}

/**
 * The class InfectiousDisease is a subclass of Disease that represents infectious diseases.
 */
class InfectiousDisease extends Disease {
    @Override
    public String[] getExamples1() {
        String[] d1 = {"corona", "diabetics", "virus", "AIDS"};
        return d1;
    }
}

/**
 * The class NonInfectiousDisease is a subclass of Disease that represents non-infectious diseases.
 */
class NonInfectiousDisease extends Disease {

    @Override
    public String[] getExamples1() {
        String[] d2 = {"corona-2023", "diabetics -12", "virus-23", "fever-12"};
        return d2;
    }
}
