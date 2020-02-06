from collections import deque

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insertAfter(self, prev_node, new_value):
        if prev_node is None:
            return
        new_node = Node(new_value)
        new_node.next = prev_node.next
        prev_node.next = new_node

    def append(self, new_value):
        new_node = Node(new_value)
        if self.head is None:
            self.head = new_node
            return
        last = self.head
        while(last.next):
            last = last.next
        last.next = new_node

    def printList(self):
        tNode = self.head
        while(tNode):
            print(tNode.data, end=" ")
            tNode = tNode.next

    def deleteNode(self, key):
        temp = self.head

        if(temp is not None and temp.data == key):
            self.head = temp.next
            temp = None
            return

        while(temp is not None and temp.data != key):
            prev = temp
            temp = temp.next

        if(temp == None):
            return

        prev.next = temp.next
        temp = None

    def deleteNodeAtPosition(self, pos):

        if(self.head == None):
            return

        temp = self.head

        if(pos == 0):
            self.head = temp.next
            return

        index = 0
        while(index < pos-1):
            temp = temp.next
            index+=1

        if(temp == None or temp.next == None):
            return

        temp.next = temp.next.next

    def getCount(self):
        temp = self.head
        count = 0
        while(temp):
            count+=1;
            temp = temp.next
        return count

    def printNthFromLast(self, n):
        temp = self.head
        count = 0
        while(temp):
            temp = temp.next
            count+=1

        if(n > count):
            return

        temp = self.head
        # i = 1
        # while(i<count-n+1):
        #     temp = temp.next
        #     i+=1
        for i in range(1, count-n+1):
            temp = temp.next
            i+=1

        print(temp.data)

    def checkPalindrom(self):
        temp = self.head
        stack = deque() #https://www.geeksforgeeks.org/stack-in-python/

        while(temp):
            stack.append(temp.data)
            temp = temp.next

        temp = self.head
        while(temp):
            if(temp.data != stack.pop()):
                return False
            temp = temp.next

        return True





if __name__ == '__main__':
    list = LinkedList()
    # list.push(3)
    # list.append(5)
    # list.insertAfter(list.head, 4)
    # list.printList()

    # Check delete
    # list.append(1)
    # list.append(2)
    # list.append(3)
    # list.append(4)
    #list.printList()
    #list.deleteNodeAtPosition(0)
    print('\n')
    #list.deleteNode(2)
    #list.printList()
    #print('\n')
    #print("Count : ", list.getCount())

    #print nth node from last
    #list.printNthFromLast(1)

    #---------- palindrome ---------------
    list.append(1)
    list.append(2)
    list.append(1)
    list.append(2)
    list.append(1)
    print(list.checkPalindrom())



