vector<int> subsetSum(vector<int> &num)
{
    int n = num.size();
    int totalSubsets = 1 << n; // Total number of subsets is 2^n
    vector<int> ans(totalSubsets, 0);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < totalSubsets; j++) {
            if (j & (1 << i)) {
                ans[j] += num[i];
            }
        }
    }

    sort(ans.begin(), ans.end());
    return ans;
}
