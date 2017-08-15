puts("Enter your marks")
x=gets.to_i
puts x
case x
	when 0..40
		puts("with #{x} you are not promoted")
	when 41..70
		puts("with #{x} you are promoted")
	when 70..100
		puts("with #{x} you are promoted with scholarship")
	else
		puts("Invalid value entered")
end
		puts("--------")
		arr=[1,2,3,4]
		arr<<5
		arr.delete_at(3)
		puts arr
		arr.insert(3,4)
		puts arr.reverse
		puts("--------")
		for i in (1..10)
			next if i%2!=0
				puts i
			
		end
		for i in (1..x)
			puts i
		end

