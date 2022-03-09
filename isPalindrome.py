def isPalindrome(head):
        from collections import deque
        q = deque()

        if not head:
            return True
        print(head)

        while len(head) != 0:
            q.append(head.pop(0))

        while len(q) > 1:
            if q.popleft() != q.pop():
                return False
        return True

print(isPalindrome([1,2,2,1,1]))