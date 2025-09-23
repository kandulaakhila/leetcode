class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1parts=version1.split("\\.");
        String[] v2parts=version2.split("\\.");
        int i=0;
        while(i<v1parts.length||i<v2parts.length){
            int num1=i<v1parts.length?Integer.parseInt(v1parts[i]):0;
            int num2=i<v2parts.length?Integer.parseInt(v2parts[i]):0;
            if(num1>num2)return 1;
            if(num2>num1) return -1;
            i++;
        }
        return 0;
    }
}
       