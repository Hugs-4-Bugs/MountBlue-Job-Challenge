 public static int introTutorial(int V, List<Integer> arr) {
    // Write your code here
    int start = 0;
    int end = arr.size()-1;
    int mid  = 0;
    Collections.sort(arr);
    int ans = 0;
    while(end >= start)
    {
        mid = start + (end - start) / 2;
        if(arr.get(mid) == V)
        {
            ans = mid;
            break;
        }
        else if(arr.get(mid) > V)
        {
            end = mid-1;
        }
        else
        {
            start = mid+1;
        }
    }
    return ans;

    }
