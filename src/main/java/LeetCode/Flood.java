/*
 * Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
 *	Output: [[2,2,2],[2,2,0],[2,0,1]]
 */
package LeetCode;
public class Flood {
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if(image[sr][sc] != color)
			fill(image, sr, sc, image[sr][sc], color);
		return image;
	}

	public void fill(int[][] image, int sr, int sc, int oldColor, int color){
		// Base cases
		if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc]==color){
			return;
		}
		image[sr][sc] = color;
		// Recur for north, east, south and west
		if(sr+1 < image.length && image[sr+1][sc] == oldColor)
			fill(image, sr+1, sc, oldColor, color);
		if(sr-1 < image.length && sr-1 >=0 && image[sr-1][sc] == oldColor)    
			fill(image, sr-1, sc, oldColor, color);
		if(sc+1 < image[0].length && image[sr][sc+1] == oldColor)
			fill(image, sr, sc+1, oldColor, color);
		if(sc-1 < image[0].length && sc-1 >=0 && image[sr][sc-1] == oldColor)    
			fill(image, sr, sc-1, oldColor, color);
	}
	
	public static void main(String[] args) {	
		//String s = "A man, a plan, a canal: Panama";
    	int[][] nums1 = new int[][] {{1,1,1},{1,1,0},{1,0,1}};
    	int m = 1,  n = 1;
    	Flood flood = new Flood();
    	nums1 = flood.floodFill(nums1, m, n, 2);
    	for (int i = 0; i<nums1.length; i++) {
    	    for (int j = 0; j<nums1[0].length; j++) {
    	        System.out.print(nums1[i][j]);
    	    }
    	    System.out.println();
    	}
    	
		//Palindrome:
    	/*s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    	String revStr = new StringBuffer(s).reverse().toString();
    	System.out.println(s);*/
    	
    }
}