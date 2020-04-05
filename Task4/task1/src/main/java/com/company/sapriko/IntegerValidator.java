package com.company.sapriko;

/**
 * Class describes model of IntegerValidator
 * - implements – names of IValidator.
 * @author – Artyom Sapriko.
 */
class IntegerValidator implements IValidator<Integer> {

    /**
     * This field contains information about leftMin
     */
    private Integer leftMin;
    /**
     * This field contains information about leftMax
     */
    private Integer leftMax;
    /**
     * This field contains information about rightMin
     */
    private Integer rightMin;
    /**
     * This field contains information about rightMax
     */
    private Integer rightMax;

    /**
     * This method describes logic getLeftMin
     *
     * @return – describe return value.
     */
    public Integer getLeftMin() {
        return leftMin;
    }

    /**
     * This method describes logic getLeftMax
     *
     * @return – describe return value.
     */
    public Integer getLeftMax() {
        return leftMax;
    }

    /**
     * This method describes logic getRightMin
     *
     * @return – describe return value.
     */
    public Integer getRightMin() {
        return rightMin;
    }

    /**
     * This method describes logic getRightMax
     *
     * @return – describe return value.
     */
    public Integer getRightMax() {
        return rightMax;
    }

    //constructor
    IntegerValidator(Integer leftMin, Integer leftMax, Integer rightMin, Integer rightMax) {
        this.leftMin = leftMin;
        this.leftMax = leftMax;
        this.rightMin = rightMin;
        this.rightMax = rightMax;
    }

    /**
     * This method describes logic validate
     *
     * @param value – name of value
     * @return – describe return value.
     */
    public boolean validate(Integer value) {
        return (value >= leftMin && value <= leftMax) || (value >= rightMin && value <= rightMax);
    }
}