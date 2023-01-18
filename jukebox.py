from tkinter import *
from tkinter import filedialog

aken = Tk()
aken.title("jukebox")

def faili_nimi():
    
    faili_tyyp = [("Teksti failid (.txt)", ".txt"), ("Kõik failid (*.*)", "*.*")]
    nimi = filedialog.askopenfile(filetypes=faili_tyyp)
    valik = nimi.readlines()
    loend = ""
    list = ""
    arv = 0
    for i in valik:
        arv += 1
        loend += f' {arv}. {i} '
        list += i
    rlist = list.split('\n')
    
    
    label1 = Label(aken, text=loend)
    label1.grid(row=0,column=0)
    
    
    def kuulamine():
        

        try:
            entget = int(entry.get())
        except:
            entget -= 1
        label1.config(text=f"{rlist[entget]}")
     
    button.config(text="vajuta siia", command=kuulamine)

button = Button(aken, text="vajuta et mussi kuulata", command=faili_nimi)
button.grid(row=1,column=0)

entry=Entry(aken)
entry.grid(row=2)




aken.mainloop()