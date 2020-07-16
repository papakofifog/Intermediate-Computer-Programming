import random
# I instantiated ListA and ListB and N

ListA=list()
ListB=list()
N=0
def List(N):
    for element in range(N):
        ListA.append(random.randrange(1,1000))
        ListB.append(random.randrange(1,1000))
    return ListA,ListB

    

def DotProduct(N,ListA,ListB):
    ListA,ListB=List(N)
    ListC=list()
    for bum in range(len(ListA)):
        ListC.append(ListA[bum]*ListB[bum])
    Dot_product=sum(ListC)
    print("ListA: " + str(ListA) + "\n \nListB: " +str(ListB))
    print(" ")
    print("ListC: " + str(ListC))
    print("Dot_product: " , Dot_product)
    return Dot_product



DotProduct(10,ListA,ListB)
print()
DotProduct(100,ListA,ListB)





