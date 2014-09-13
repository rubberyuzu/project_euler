class Calculator
	def initialize(num)
		@prime_factors = []
		prime_factors(num)
	end
	
	def is_prime?(num)
		if num <= 1
			return false
		elsif num == 2
			return true
		end
		for i in 2..num-1
			if num % i == 0
				return false
			end
		end
		return true
	end

	def prime_factors(num)
		if num <= 1
			return @prime_factors
		end
		for i in 2..num
			if num % i == 0 && is_prime?(i)
				@prime_factors << i
				prime_factors(num/i)
				break
			end
		end
	end

end



p Calculator.new(13195)
p Calculator.new(600851475143)