class Solution(object):
    def pacificAtlantic(self, heights):
        """
        :type heights: List[List[int]]
        :rtype: List[List[int]]
        """
        if not heights or not heights[0]:
            return []

        r_len, c_len = len(heights), len(heights[0])
        pac = [[False]*c_len for _ in range(r_len)]
        atl = [[False]*c_len for _ in range(r_len)]

        def flow(row, col, visited):
            visited[row][col] = True
            moves = [(1,0), (-1,0), (0,1), (0,-1)]
            for dr, dc in moves:
                nr, nc = row + dr, col + dc
                if 0 <= nr < r_len and 0 <= nc < c_len and not visited[nr][nc] and heights[nr][nc] >= heights[row][col]:
                    flow(nr, nc, visited)

        for i in range(r_len):
            flow(i, 0, pac)
            flow(i, c_len - 1, atl)
        for j in range(c_len):
            flow(0, j, pac)
            flow(r_len - 1, j, atl)

        res = []
        for i in range(r_len):
            for j in range(c_len):
                if pac[i][j] and atl[i][j]:
                    res.append([i, j])

        return res
        