uantidadePessoa = int(input("Quantas pessoas estão cadastradas?: "))
nomes = []
idades = []
for i in range(0, quantidadePessoa):
    nomes.append(input("Digite o nome: "))
    idades.append(input("Digite a idade: "))
    maiorIdade = max(nomes)
print(f"A pessoa cadastrada mais velha é: {maiorIdade}")
