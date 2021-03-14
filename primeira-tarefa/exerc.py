'''
Linguagem: Phyton
Enunciado:
Escreva um algoritmo (se possível incluindo função) 
que dado um total de anos de estudo retorna o quão experiente o usuário é.
// De 0-1 ano: Iniciante
// De 1-3 anos: Intermediário
// De 3-6 anos: Avançado
// De 7 acima: Jedi Master
Algorítimo:
'''

def xp(idade):
    if (idade < 2):
        print("Iniciante")
    elif (idade < 4):
        print("Intermediário")
    elif (idade < 7):
        print("Avançado")
    else:
        print("Jedi Master")


idade = int(input ("Digite sua quantidade de anos de experiência: "))
print("Seu nível de experiência é: ")
xp(idade)
