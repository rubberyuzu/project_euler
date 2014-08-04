def Fib(num):
	fib_list = []
	for x in range(0, num+1):
		if x == 0:
			fib_list.append(1)
		elif x == 1:
			fib_list.append(2)
		else:
			new_el = fib_list[x-1]+fib_list[x-2]
			fib_list.append(new_el)
	return fib_list

def FibMaxIndex(max, guess):
	fib_list = Fib(guess)
	for x in range(0, guess):
		if fib_list[x] >= max:
			return x-1
	return 'error!'

def EvenFibSum(ind):
	fib_list = Fib(ind)
	even_sum = 0
	for x in range(0, ind+1):
		if fib_list[x] % 2 == 0:
			print 'yes!'
			even_sum+=fib_list[x]
	return even_sum

def Solve(max, guess):
	ind = FibMaxIndex(max, guess)
	print str(EvenFibSum(ind))

Solve(4000000, 100)
