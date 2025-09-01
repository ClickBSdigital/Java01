########## FUNÇÃO PARA IMPRIMIR LISTAS

def imprime_lista(lista):
    for item in lista:
        print(item)
        
frutas = ["maçã", "banana", "laranja", "uva", "pera"]
carros = ["fusca", "gol", "palio", "celta", "uno"]
tupla = [20, 30, 40, 50, 60]

imprime_lista(frutas)
print("-----")  
imprime_lista(carros)
print("-----")  
imprime_lista(tupla)