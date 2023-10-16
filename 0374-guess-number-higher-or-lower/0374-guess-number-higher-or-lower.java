/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        while(low <= n){
            int mid = (n-low)/2 + low;
            if(guess(mid) == -1){
                n = mid-1;
            }else if(guess(mid) == 1){
                low = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}