/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
          
        if(root==null)
            return -1;
        int depth_left = height(root.left);
        int depth_right = height(root.right);
        int depth = Math.max(depth_left, depth_right) + 1;
        return depth;

    }