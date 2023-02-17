package util;

public enum BuildType {
    HOME("HOME"),
    VILLA("VILLA"),
    SUMMERHOUSE("SUMMERHOUSE");

    private String value;

    BuildType(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
