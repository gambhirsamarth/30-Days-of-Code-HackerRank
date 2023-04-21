static void levelOrder(Node root){
       Queue<Node> q = new LinkedList<>();
  q.add(root);

  while(!q.isEmpty()){
      Node rm = q.poll();
      System.out.print(rm.data+" ");

      if(rm.left != null){
          q.add(rm.left);
      }
      if(rm.right != null){
          q.add(rm.right);
      }
  }
}
