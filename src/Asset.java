public class Asset {
    private String assetId;
    private String assetName;
    private String assetExpiry;
    Asset(String assetId,String assetName,String assetExpiry){
        this.assetId=assetId;
        this.assetName=assetName;
        this.assetExpiry=assetExpiry;
    }

    public String getAssetId() {
        return assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public String getAssetExpiry() {
        return assetExpiry;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public void setAssetExpiry(String assetExpiry) {
        this.assetExpiry = assetExpiry;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "assetId='" + assetId + '\'' +
                ", assetName='" + assetName + '\'' +
                ", assetExpiry='" + assetExpiry + '\'' +
                '}';
    }
}
