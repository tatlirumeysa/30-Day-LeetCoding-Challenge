class Solution {
    public int singleNumber(int[] nums) {
     List<Integer> noDuplicatedList = new ArrayList<>();

    for (int i : nums) {
      if (!noDuplicatedList.contains(i)) {
        noDuplicatedList.add(i);
      } else {
        noDuplicatedList.remove(noDuplicatedList.size() - 1);
      }
    }
    return noDuplicatedList.get(0);
  }
}