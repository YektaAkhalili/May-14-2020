print("How old are you?")
age = int(input())

if age >= 21:
	print("You're old enough to vote.")
else:
	print("In ", (21-age), " more years, you'll be able to vote!")