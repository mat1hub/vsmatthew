package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * The class Exposure represents an exposure event that occurred to a patient.
 * It includes information about the patient, the exposure date and time, and the type of exposure.
 */
public class Exposure {

    /** The unique identifier of the patient. */
    UUID patientId;

    /** The date and time of the exposure event. */
    LocalDateTime dateTime;

    /** The type of exposure, either "D" (direct) or "I" (indirect). */
    String exposureType;

    /**
     * Constructor to create an instance of Exposure with a specified patient ID.
     *
     * @param patientId The unique identifier of the patient associated with the exposure.
     */
    public Exposure(UUID patientId) {
        this.patientId = patientId;
    }

    /**
     * Gets the date and time of the exposure event.
     *
     * @return The date and time of the exposure event.
     */
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the date and time of the exposure event.
     *
     * @param dateTime The date and time of the exposure event to set.
     */
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Gets the type of exposure.
     *
     * @return The type of exposure ("D" for direct or "I" for indirect).
     */
    public String getExposureType() {
        return exposureType;
    }

    /**
     * Sets the type of exposure.
     *
     * @param exposureType The type of exposure to set ("D" for direct or "I" for indirect).
     * @throws IllegalArgumentException if the provided exposure type is not "D" or "I".
     */
    public void setExposureType(String exposureType) {
        if ((exposureType.equalsIgnoreCase("D")) || (exposureType.equalsIgnoreCase("I")))
            this.exposureType = exposureType;
        else
            throw new IllegalArgumentException("Kindly Enter 'D' or 'I' !");
    }

    /**
     * Gets the unique identifier of the patient associated with the exposure.
     *
     * @return The patient's unique identifier.
     */
    public UUID getPatientId() {
        return patientId;
    }

    // Overrides for hashCode, equals, and toString methods

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
        result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
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
        Exposure other = (Exposure) obj;
        if (dateTime == null) {
            if (other.dateTime != null)
                return false;
        } else if (!dateTime.equals(other.dateTime))
            return false;
        if (patientId == null) {
            if (other.patientId != null)
                return false;
        } else if (!patientId.equals(other.patientId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Exposure [patientId=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
    }
}
