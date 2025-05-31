package labs_examples.arrays.examples;

// Use length variable to help copy an array.
class ACopy {
    public static void main(String[] args) { // Ty: moved brackets to String
        int i;
        int[] nums1 = new int[10]; // Ty: moved brackets for nums1
        int[] nums2 = new int[10]; // Ty: moved brackets for nums2

        for(i = 0; i < nums1.length; i++)
            nums1[i] = i;

        // copy nums1 to nums2
        // Ty: removed if as nums2.length >= nums1.length always true
        for(i = 0; i < nums2.length; i++)
            nums2[i] = nums1[i];

        for(i = 0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }
}