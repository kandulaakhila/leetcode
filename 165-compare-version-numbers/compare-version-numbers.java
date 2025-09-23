class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1parts=version1.split("\\.");
        String[] v2parts=version2.split("\\.");
        int maxlength=Math.max(v1parts.length,v2parts.length);
        for(int i=0;i<maxlength;i++){
            int v1=i<v1parts.length?Integer.parseInt(v1parts[i]):0;
            int v2=i<v2parts.length?Integer.parseInt(v2parts[i]):0;
            if(v1>v2)return 1;
            if(v1<v2)return -1;
        }
        return 0;
    }
}