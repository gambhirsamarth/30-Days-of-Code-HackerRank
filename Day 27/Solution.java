static class TestDataEmptyArray{
    public static int[] get_array(){
        return new int[0];
    }
    
}

static class TestDataUniqueValues{
    public static int[] get_array(){
        return new int[]{1,2};
    }
    public static int get_expected_result(){
        return 0;
    }
}

static class TestDataExactlyTwoDifferentMinimums{
    public static int[] get_array(){
        return new int[]{1,1,2,3,4};
    }
    public static int get_expected_result(){
        return 0;
    }
}
