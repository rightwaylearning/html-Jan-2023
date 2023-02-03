# f=open("C:\\Users\\Intel\\Desktop\\New Text Document.txt", "w")
# f.write("hi  \n my name is rohan vyavahare \n is am writing this line in new file")
# f.close

f=open("C:\\Users\\Intel\\Desktop\\New Text Document.txt", "r")
a=f.read()
print(a)
print(f.read())

char =0
freq=0
lines = a.split("\n")
words =a.split()
for i in words:
    if i=="is":
        freq=freq+1

for i in words:
    char+=len(i)
f.close()

print("No of word in file" , len(words))
print("no of line in file" , len(lines))
print("the no of character in file" , char)
print("The frequency of is word is" , freq)

