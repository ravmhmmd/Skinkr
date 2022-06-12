import requests
import base64

with open("test/r11.jpg", "rb") as img_file:
    b64_string = base64.b64encode(img_file.read())

resp = requests.post("http://127.0.0.1:8080",
                     json={'base64': b64_string.decode('utf-8')})
print(resp.json())
