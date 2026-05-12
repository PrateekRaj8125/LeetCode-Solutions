class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        for img in image:
            img.reverse()
            for i in range(len(img)):
                img[i]=int(not img[i])
        return image