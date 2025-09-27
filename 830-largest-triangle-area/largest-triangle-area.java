class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxarea=0.0;
        int n=points.length;
        for(int i=0;i<n;i++){
            int[]a=points[i];
            for(int j=i+1;j<n;j++){
                int[]b=points[j];
                for(int k=j+1;k<n;k++){
                    int[]c=points[k];
                    double area=trianglearea(a,b,c);
                    maxarea=Math.max(maxarea,area);
                }
            }
        }
        return maxarea;
    }
    private double trianglearea(int[]a,int[]b,int[]c){
        double x1=a[0],y1=a[1];
        double x2=b[0],y2=b[1];
        double x3=c[0],y3=c[1];
        return 0.5*Math.abs(
            x1*(y2-y3)+
            x2*(y3-y1)+
            x3*(y1-y2)
        );
    }
}