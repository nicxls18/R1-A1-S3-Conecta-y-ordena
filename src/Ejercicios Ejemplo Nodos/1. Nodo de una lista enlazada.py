class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None


n1 = Nodo(10)
n2 = Nodo(20)

n1.siguiente = n2

print(n1.dato)
print(n1.siguiente.dato)