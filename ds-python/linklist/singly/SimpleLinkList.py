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


if __name__ == '__main__':
    list = LinkedList()
    # list.push(3)
    # list.append(5)
    # list.insertAfter(list.head, 4)
    # list.printList()

    # Check delete
    list.append(1)
    list.append(2)
    list.append(3)
    list.deleteNode(2)
    list.printList()




