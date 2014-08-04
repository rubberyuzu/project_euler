def Mult3_5(num):
	sum = 0
	for x in range(1, num):
		if x%3 == 0 or x%5 == 0:
			sum += x
	print str(sum)

Mult3_5(1000)
