class Node(object):
    def __init__(self, v):
        self.value = v
        self.childs = []

    def traverse(self, lvl):
        print(" "*lvl + str(self.value))
        for c in self.childs:
            c.traverse(lvl+1)

root = Node(0)

n13 = Node(13)
n2 = Node(2)
n3 = Node(3)
n4 = Node(4)

root.childs.append(n13)
n13.childs.append(n2)
n13.childs.append(n3)
n2.childs.append(n4)

x = root.traverse(1)