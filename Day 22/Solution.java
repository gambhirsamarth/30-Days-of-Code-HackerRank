public static int getHeight(Node root){
      //Write your code here
      return returnHeight(root)- 1;
    }
    
    public static int returnHeight(Node root){
      if(root == null)
        return 0;
        
      int left = returnHeight(root.left);
      int right = returnHeight(root.right);
    
      if(left > right)
        return (left + 1);
      else
        return (right + 1);
       
    }
