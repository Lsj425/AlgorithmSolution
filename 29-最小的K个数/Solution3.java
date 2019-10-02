import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int len = input.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(input == null || k <= 0 || k > len) return list; //判断输入的合法性
        for(int i = 0; i < k; i++){    //循环建堆
            buildMaxHeap(input,len-1-i);
            swap(input,0,len-1-i);  //将找到的最小的值放在数组末端
            list.add(input[len-1-i]);
        }
        return list;
    }
    // 交换2个数
    private void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }   
    private void buildMaxHeap(int[] arr,int m){
        for(int i = (m-1)/2; i >= 0; i--){
            int k = i;
            // 该节点的子树存在
            while(k*2+1 <= m){    
                int minindex = k*2+1;
                 // 右子节点存在              
                if(minindex < m && arr[minindex] > arr[minindex+1]){
                    // minindex指的必须是该节点的俩个子节点的较小节点                        
                    minindex++;      
                }
                // 若子节点中的较小值比父节点小，向上调整
                if(arr[k] > arr[minindex]){   
                    swap(arr,k,minindex);
                // 调整后其下的部分也要调整
                    k = minindex;         
                }else{
                    break;
                }
            }     
        }      
    }
}
