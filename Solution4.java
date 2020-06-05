class Solution {
public int[] smallerNumbersThanCurrent(int[] nums) {
int[] result = new int[nums.length]; //定义新数组长度
int index = 0; //新数组下标
for (int i =0;i<nums.length;i++){ //冒泡循环，判断小于nums[i]的值
int sum = 0; //每次nums[i]判断完毕，比他小的数值总数就重置为0
for(int j =0;j<nums.length;j++)
if(nums[i]>nums[j]){
sum++; //小于则+1
}
result[index]=sum; //输出新数组
index++; //下标加1，进行下个nums[i]判断
}
return result;
}
}