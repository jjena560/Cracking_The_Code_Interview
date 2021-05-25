# Python3 implementation of the approach
class Node:
    def __init__(self, new_data):
        self.data = new_data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    # createNode and and make linked list
    def push(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node

    def deleteNode(self, n):
        # getting the next node of the node to be deleted
        temp = n.next
        n.data = temp.data
        n.next = temp.next

    def printList(self):
        tmp_head = self.head
        while(tmp_head != None):
            print(tmp_head.data, end=' ')
            tmp_head = tmp_head.next


 # Driver Code
llist = LinkedList()
llist.push(7)
llist.push(1)
llist.push(3)
llist.push(2)
print("Created Linked list is:")
llist.printList()
llist.deleteNode(llist.head.next.next)
print("\nLinked List after Deletion is:")
llist.printList()

# This code is contributed by RaviParkash
