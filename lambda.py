print("*****THE SUM OF SQUARES USING LAMBDA*****\n")
x=int(input("Enter the first number"))
y=int(input("Enter the second number"))
def fuc(x,y):
  a=lambda x:x*x
  b=lambda x,y:x+y*y
  return(b(a(x),y))
print("The result is: ",fuc(x,y))