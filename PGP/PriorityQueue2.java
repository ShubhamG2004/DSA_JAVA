class CharFreq implements Comparable<CharFreq> {
    char ch;
    int freq;

    CharFreq(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    @Override
    public int compareTo(CharFreq that) {
        // Higher frequency first
        return Integer.compare(that.freq, this.freq);
    }
}

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Max Heap
        PriorityQueue<CharFreq> pq = new PriorityQueue<>();

        // Add characters to heap
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.offer(new CharFreq(entry.getKey(), entry.getValue()));
        }

        StringBuilder res = new StringBuilder();

        // Process heap
        while (!pq.isEmpty()) {

            CharFreq obj = pq.poll();

            for (int i = 0; i < obj.freq; i++) {
                res.append(obj.ch);
            }
        }

        return res.toString();
    }
}