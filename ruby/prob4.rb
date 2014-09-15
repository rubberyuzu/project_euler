def is_palindrome?(num)
	if num < 0
		return false
	elsif num < 10
		return true
	end
	num = num.to_s
	digits = num.length
	for i in 0..digits-1
		unless num[i] == num[digits-i-1]
			return false
			break
		end
	end
	return true
end

def is_divisible?(num)
	999.downto(100){|i|
		if num%i == 0
			if (num/i).to_s.length == 3
				return true
			end
		end
	}
	return false
end

def largest_palindrome
	999999.downto(10000){|num|
		if is_palindrome?(num)
			if is_divisible?(num)
				return num
				break
			end
		end
	}
end

p largest_palindrome