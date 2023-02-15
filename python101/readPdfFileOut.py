import pyttsx3
import PyPDF2

speaker = pyttsx3.init()
speaker.say("I'll read out for you.")

pdfFile = open("privacyPolicy-GDPR+Wefox.pdf",mode="rb")
reader = PyPDF2.PdfFileReader(pdfFile)
nPages = reader.numPages
print(nPages)

pdfPage = reader.getPage(0)
content = pdfPage.extractText()
speaker.say(content)
speaker.runAndWait()
