1. BFS (Breath-First Search) using Queue
Time Complexity: O(N). N is the number of nodes in the binary tree.
Space Complexity: O(N). N is the number of nodes in the binary tree.

2. BFS (Breath-First Search) using Recursion
Time Complexity: O(N^2). N is the number of nodes in the binary tree. It needs to traverse all the nodes in the binary tree for a given level.
Space Complexity: O(N). N is the number of nodes in the binary tree.

3. DFS (Depth-First Search) printing all possible paths from up-left to bottom-right
Time Complexity : O(2^(N*M))
Space Complexity : O(N + M). M and N are dimension of matrix.
The total number of combinations of possible paths: C(N-1, N+M-2), e.g. N=4, M=4, the result is 20.