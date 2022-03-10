import sys
count = int(sys.stdin.readline())

stack = []
while count != 0:
    command = sys.stdin.readline().split()

    if command[0] == "push":
        stack.append(command[1])

    elif command[0] == "pop":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop(0))

    elif command[0] == "size":
        print(len(stack))

    elif command[0] == "empty":
        if len(stack) == 0:
            print(1)
        else:
            print(0)

    elif command[0] == "front":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[0])

    elif command[0] == "back":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[-1])

    count -= 1