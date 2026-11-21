class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

     
        List<Integer>[] children = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            children[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            children[parent[i]].add(i);
        }

     
        int[] newParent = parent.clone();

        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);

        int[] previous = new int[n];

     
        int[] stack = new int[2 * n];
        int top = 0;

        stack[top++] = 0;

        while (top > 0) {

            int event = stack[--top];

            int node = event / 2;
            int ch = s.charAt(node) - 'a';

            if (event % 2 == 0) {

             
                previous[node] = lastSeen[ch];

                if (lastSeen[ch] != -1) {
                    newParent[node] = lastSeen[ch];
                }

                lastSeen[ch] = node;

                
                stack[top++] = 2 * node + 1;

              
                for (int child : children[node]) {
                    stack[top++] = 2 * child;
                }

            } else {

               
                lastSeen[ch] = previous[node];
            }
        }


        List<Integer>[] finalChildren = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            finalChildren[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            finalChildren[newParent[i]].add(i);
        }

        
        int[] order = new int[n];
        top = 0;

        int count = 0;
        stack[top++] = 0;

        while (top > 0) {

            int node = stack[--top];

            order[count++] = node;

            for (int child : finalChildren[node]) {
                stack[top++] = child;
            }
        }

    
        int[] answer = new int[n];
        Arrays.fill(answer, 1);

        for (int i = count - 1; i > 0; i--) {

            int node = order[i];

            answer[newParent[node]] += answer[node];
        }

        return answer;
    }
}