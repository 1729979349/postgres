from cryptography.fernet import Fernet
import sys

KEY = "vAziQ89LMeMThcJJPeDvirfMfgDsuaZyy2pGeuv7mvo="


def encript(text_tobe_encripted):
    password = text_tobe_encripted
    fernet = Fernet(KEY.encode())
    enc = fernet.encrypt(password.encode())
    return enc


print(encript(sys.argv[1]))