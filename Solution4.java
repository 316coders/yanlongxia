class Solution {
public int[] smallerNumbersThanCurrent(int[] nums) {
int[] result = new int[nums.length]; //���������鳤��
int index = 0; //�������±�
for (int i =0;i<nums.length;i++){ //ð��ѭ�����ж�С��nums[i]��ֵ
int sum = 0; //ÿ��nums[i]�ж���ϣ�����С����ֵ����������Ϊ0
for(int j =0;j<nums.length;j++)
if(nums[i]>nums[j]){
sum++; //С����+1
}
result[index]=sum; //���������
index++; //�±��1�������¸�nums[i]�ж�
}
return result;
}
}