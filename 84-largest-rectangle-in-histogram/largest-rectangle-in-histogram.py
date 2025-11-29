class Solution(object):
    def largestRectangleArea(self, heights):
        """
        :type heights: List[int]
        :rtype: int
        """
        st = []  
        max_area = 0
        heights.append(0) 

        for i, h in enumerate(heights):
            while st and heights[st[-1]] > h:
                height = heights[st.pop()]
                width = i if not st else i - st[-1] - 1
                max_area = max(max_area, height * width)
            st.append(i)

        return max_area

