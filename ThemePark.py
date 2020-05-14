print("How old are you?")
age = int(input())

if age <= 4: 
	print("Your admission is free!")
elif age < 18: 
	print("Your admission is $5.")
else: 
	print("Your admission is $10.")