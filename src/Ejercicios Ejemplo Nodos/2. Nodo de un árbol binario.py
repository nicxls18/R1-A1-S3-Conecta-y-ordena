class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.izquierdo = None
        self.derecho = None


raiz = Nodo(50)
raiz.izquierdo = Nodo(30)
raiz.derecho = Nodo(70)

print(raiz.dato)
print(raiz.izquierdo.dato)
print(raiz.derecho.dato)