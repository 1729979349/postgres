from cryptography.fernet import Fernet
import sys

KEY = "vAziQ89LMeMThcJJPeDvirfMfgDsuaZyy2pGeuv7mvo="


def decript(text_tobe_decripted):
    password = text_tobe_decripted
    fernet = Fernet(KEY.encode())
    dec_password = fernet.decrypt(password.encode()).decode()
    return dec_password


print(decript(sys.argv[1]))
