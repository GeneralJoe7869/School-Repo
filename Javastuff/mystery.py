#Joseph Elias 9/26/2025
import turtle

mysteryfile = open('/Users/eliasjose/Desktop/C&G stuff/Text/mystery.txt','r')  #file
wn = turtle.Screen()					#turtle graphics
tortile = turtle.Turtle()				#setup everything
aline = mysteryfile.readline()			#have the file be read
				#draw the image in question

for aline in mysteryfile:
	items = aline.split()
	if items[0] == "UP": #GO UP
		tortile.up()
	else:
		if items[0] == "DOWN": #GO DOWN
			tortile.down()
		else:    
			tortile.goto(int(items[0]), int(items[1])) #sends to cordinates if not a string
mysteryfile.close()
wn.exitonclick()


















