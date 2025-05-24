#############################
##  Detecție de vehicule   ##
#############################
#  32-E5   Paulescu Florin gr 3.2
# Cod refolosit:  https://github.com/Prashikh/CarDetection1/blob/main/Count_Number_of_Cars_in_Less_Than_10_Lines_of_Code_Using_Python.ipynb
#                  și https://github.com/krishnaik06/Computer-Vision-Tutorial/blob/master/Lecture%201-%20Reading%2C%20writing%20and%20displaying%20images.ipynb
# importare module
import cv2
import matplotlib.pyplot as plt
import cvlib as cv
from cvlib.object_detection import draw_bbox
try:
    imagine = cv2.imread('tt2.jpg')  # Citirea imaginii din folder, local
    # imagine = cv2.imread('C:\Users\lenovo\Desktop\Detectie vehicule\venv\tt2.jpg')
except:
    print("\n Nu s-a găsit imaginea \n")  # Returnare mesaj în caz că nu se gasește imaginea dată ca parametru
    exit()

bbox,label,conf = cv.detect_common_objects(imagine)  #Detectează vehicule și crează chenare de evidențiere
imagine_procesată = draw_bbox(imagine, bbox, label, conf) #Inserează chenarele de detecție și denumirile obiectelor detectate pe poză

cv2.imshow('Detecție Vehicule', imagine_procesată) #Deschidere fereastră de afișare cu numele "Detecție Vehicule" în care apare imaginea procesată (cu chenarele de detecție și denumirile lor)

print('|--------------------------------------|')
print('|    DETECȚIE EFECTUATĂ CU SUCCES      |')
print('|--------------------------------------|\n')

#Afișare număr mașini, autobuze și motociclete detectate in imagine
print('Numărul mașinilor din imagine: ' + str(label.count('car')))
print('Numărul autobuzelor din imagine:  ' + str(label.count('bus')))
print('Numărul motocicletelor din imagine: ' + str(label.count('motorcycle')))

print('\n|------------------------------------|')
#print('|   Nume pentru imaginea procesată:  |')#Citirea de la tastatură a unei denumiri pentru imaginea procesată
#parametru_ieșire = input()+ '.jpg'
#cv2.imwrite(parametru_ieșire , imagine_procesată) #Salvează imaginea procesată într-un fișier cu denumirea specificată de utilizator
#print('|------------------------------------|\n')
#print("Finalizare creare")

cv2.waitKey(0)  #Așteaptă ca o tastă să fie apasată
cv2.destroyAllWindows()    #Închiderea tuturor ferestrelor afișate de program imediat după ce a fost apăsată o tastă
                           #Și oprirea rulării programului