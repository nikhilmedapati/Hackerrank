from math import factorial
def fact(n):
	return math.factorial(n)


print('Enter any number, 0 to quit: ')
n = int(input())
while n!=0:
	print(factorial(n))
	n = int(input())

print('Bye!!')