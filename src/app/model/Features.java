package app.model;


public class Features {
    private String featureName;
    private float min;
    private float max;
    private int featureIndex;

    public Features(String featureName, float min, float max, int featureIndex) {
        this.featureName = featureName;
        this.min = min;
        this.max = max;
        this.featureIndex = featureIndex;
    }
//Geters&Seters
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public int getFeatureIndex() {
        return featureIndex;
    }

    public void setFeatureIndex(int featureIndex) {
        this.featureIndex = featureIndex;
    }

}
