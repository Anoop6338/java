package recursion.level2;
// this prohram return the possibilities of getting to the target using valid scores only
public class ways_to_score {
    public static void main(String[] args) {
        int valid_score[] ={1,3,5};
        int target = 13;
        ways(valid_score, target);
    }

    static void ways(int valid_score[], int target){
        int sum=0;
        int max = target;
        int count_tail[]={0};

        System.out.println("tail recursion");
        results_tail(valid_score, target,sum, "",max, count_tail);
        System.out.println("total number of possible count for tail recursion = "+count_tail[0]);

        System.out.println();
        System.out.println();

        int count_head[]={0};
        System.out.println("head recursion");
        System.out.println(results_head(valid_score, target, max,"", count_head));
        System.out.println("total number of possible count for head recursion = "+count_head[0]);
    }

    static void results_tail(int valid_score[], int target, int sum, String ans, int max, int count_tail[]){   //max is extra parameter to ensure non repetition of the possiblities
        if(sum==target){
            System.out.println(ans+ "= "+sum);
            count_tail[0]++;
        }
        else if(sum>target){
            // do nothing
        }
        else{
            for(int i = 0; i<valid_score.length; i++){
                if(i<=max){
                    results_tail(valid_score, target, sum+valid_score[i], ans+valid_score[i]+" ", i, count_tail);
                }
            }
        }
    }


    static String results_head(int valid_score[], int target, int max, String ans, int count_head[]){
        if(target==0){
            count_head[0]++;
            return ans.trim()+"\n";
        }
        else if(target<0){
            return "";
        }
        else{
            String final_result ="";
            for(int i=0; i<valid_score.length; i++){
                if(i<=max){
                    final_result  += results_head(valid_score, target-valid_score[i], i, ans+valid_score[i]+" ", count_head);
                }
            }
            return final_result;
        }
    }


    // static String results_head(int valid_score[], int target, int sum, int max, String ans){ 
    //     if(sum == target){
    //         return ans.trim()+"\n";
    //     }
    //     else if(sum>target){
    //         return "";
    //     }
    //     else{
    //         String final_result ="";
    //         for(int i=0; i<valid_score.length; i++){
    //             if(i<=max){
    //                 final_result  += results_head(valid_score, target, sum+valid_score[i], i, ans+valid_score[i]+" ");
    //             }
    //         }
    //         return final_result;
    //     }
    // }


}
