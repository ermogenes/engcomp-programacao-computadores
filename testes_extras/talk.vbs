Dim message, sapi
message=InputBox("Enter text to speak!!","ATT Text To Speak")
Set sapi=CreateObject("sapi.spvoice")
sapi.Speak message