class Point:
    def __init__(self):
        self.point=(0,0)
    
    def set_point(self,x,y):
        self.point=(x,y)
        return self.point
   


class Rectangle(Point):
    def __init__(self,top_right,bottom_corner):
        Point.__init__(self)
        self.p1=top_right
        self.p2=bottom_corner
        self.top_right=(0,0)
        self.bottom_corner=(0,0)
        
    def Top_right(self):
        Point1=Point()
        self.top_right=Point1.set_point(self.p1[0],self.p1[1])
        return self.top_right
    
    def Bottom_left(self):
        Point1=Point()
        self.bottom_corner=Point1.set_point(self.p2[0],self.p2[1])
        return self.bottom_corner
    
    def get_area(self):
        len= self.top_right[0]
        breath=self.top_right[1]
        area=len*breath
        return area
    
    def get_perimeter(self):
        len=self.top_right[0]
        breath=self.top_right[1]
        perimeter=2*(len*breath)
        return perimeter
    
    def Intersection(RectA,RectB):
        top_right1=RectA.Top_right()
        botom_left1=RectA.Bottom_left()
        top_right2=RectB.Top_right()
        botom_left2=RectB.Bottom_left()
        isintersect=True
        if top_right1[0]>=botom_left2[0] | top_right2[0]>=botom_left1[0]:
            isintersect=False
            print(isintersect)
        elif top_right1[1]<=botom_left2[1] | top_right2[1]<=botom_left[1]:
            isintersect=False
            print(isintersect)
        else:
            print(isintersect)
        
        
    
rect12=Rectangle((5,10),(10,0))
rect13=Rectangle((5,5),(15,0))
rect12.Top_right()
print(rect12.get_area())
print(rect12.get_perimeter())
rect45=Rectangle
rect45.Intersection(rect12,rect13)


