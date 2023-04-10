Difference(int[] __elements){
    this.elements = __elements;
    computeDifference();
}

int computeDifference(){
    for(int i=0;i<elements.length;i++){
        for(int j=i+1;j<elements.length;j++){
          Arrays.sort(elements);
          int diff = Math.abs(elements[i]-elements[j]);
          maximumDifference = Math.max(maximumDifference,diff);  
        } 
    }
    return maximumDifference;
}
