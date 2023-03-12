#import tkinter, which allows for open a file by choosing-> no hard-coded file name
from tkinter import Tk
from tkinter.filedialog import askopenfilename
Tk().withdraw()
#import Counter, count number of same char in a string
from collections import Counter

path = askopenfilename() #get path of file
text = open(path, "r") #open file
content = text.read() #get content of file into string
frequency = Counter(content) #read each char of file

print(frequency) 
