velmax = int(input("Digite a velocidade máxima na avenida:"))
velmot = int(input("digite a velocidade do motorista:"))
multa = 0
if velmot > velmax:
    multa = 5*(velmot-velmax)
    print(f'A multa será de {multa:.2f}')
else:
    print("Não há multa")
