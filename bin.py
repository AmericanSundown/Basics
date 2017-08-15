num1=int(input("Enter the number"))
def bin(num):
	binary=[]
	i = 0
	
	while(num > 0):
		p=num%2
		binary.insert(i,p)
		i+1
		num = num//2
	print(binary[::-1])
bin(num1)	

	
	
