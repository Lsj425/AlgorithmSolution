public class Solution {
    public void reOrderArray(int [] array) {
        if(array == null || array.length == 0){
            return;
        }
        mergeSort(array,0,array.length-1);
    }
    
    private void mergeSort(int[] array,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);
    }
    
    private void merge(int[] array,int low,int mid,int high){
        int[] tmp=new int[high-low+1];
        int idx=0;
        //low到mid找奇数
        for(int i=low;i<=mid;i++){
            if((array[i]&1)==1){
                tmp[idx++]=array[i];
            }
        }
        //mid＋1到high找奇数
        for(int i=mid+1;i<=high;i++){
            if((array[i]&1)==1){
                tmp[idx++]=array[i];
            }
        }
        //low到mid找偶数
        for(int i=low;i<=mid;i++){
            if((array[i]&1)==0){
                tmp[idx++]=array[i];
            }
        }
        //mid＋1到high找偶数
        for(int i=mid+1;i<=high;i++){
            if((array[i]&1)==0){
                tmp[idx++]=array[i];
            }
        }
        //拷贝tmp数据到array
        for(int i=0;i<tmp.length;i++){
            array[low++]=tmp[i];
        }
    }
}
