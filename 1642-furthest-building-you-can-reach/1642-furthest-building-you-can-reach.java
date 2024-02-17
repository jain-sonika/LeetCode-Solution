class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
	var n = heights.length;
	var ladderClimbs = new PriorityQueue<Integer>();

	for (var i = 1; i < n; i++) {
		var climb = heights[i] - heights[i - 1];
		if (climb <= 0)
			continue; // descent, skip
			
		ladderClimbs.add(climb);
		if (ladderClimbs.size() <= ladders)
			continue; // use a ladder
		
		if ((bricks -= ladderClimbs.poll()) < 0)
			return i - 1; // insufficient bricks, terminate
	}
	return n - 1;
}
}