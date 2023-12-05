nota1 = float(input("Digite a primeira nota:"))
nota2 = float(input("Digite a segunda nota:"))
média = (nota1 + nota2)/2
examefinal = 0

if média >= 70:
    print("O aluno está aprovado.")

elif 40<média<69:
    print("O aluno está em exame final.")
    examefinal = float(input("Digite a nota do exame final:"))
    if (examefinal + média)/2 >= 100:
        print("O aluno está aprovado.")
    else:
        print("O aluno está reprovado")

else:
    print("O aluno está reprovado.")
