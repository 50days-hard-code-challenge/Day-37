class Solution {
public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> current;
        sort(nums.begin(), nums.end()); 
        backtrack(result, current, nums, 0);
        return result;
    }
private:
    void backtrack(vector<vector<int>>& result, vector<int>& current, vector<int>& nums, int start) {
        result.push_back(current);
        for (int i = start; i < nums.size(); i++) {
            if (i == start || nums[i] != nums[i - 1]) {
                current.push_back(nums[i]);
                backtrack(result, current, nums, i + 1);
                current.pop_back();
            }
        }
    }
};
