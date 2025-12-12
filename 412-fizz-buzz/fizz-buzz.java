class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz"); // divisible by both
            } else if (i % 3 == 0) {
                answer.add("Fizz");     // divisible by 3
            } else if (i % 5 == 0) {
                answer.add("Buzz");     // divisible by 5
            } else {
                answer.add(String.valueOf(i)); // default case
            }
        }
        return answer;
    }
}