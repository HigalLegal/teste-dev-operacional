# Teste Dev Operacional

- **Mudança 1**: Coloquei as classes de entidades (Cliente, Empresa, etc) no pacote entities, e a classe Main no pacote principal.

- **Mudança 2**: O que era em Double, foi mudado para BigDecimal, para se ter maior precisão nos calculos.

- **Mudança 3**: No método "criarVenda" quando se ia passar a lista de produtos (o carrinho no caso) era transformado em Stream e depois em uma List normal, sendo que a propriedade já era uma List.

- **Mudança 4**: Coloquei a parte de comissao do sistema e o valor para serem um método ao invés de campos da classe, pois ambos são definidos com base em seus valores recebidos, então seria muito mais interessante se a própria classe já calculasse ao invés de um agente externo, como o que era que acontecia no método "criarVenda" da classe "Main".

- **Mudança 5**: Os métodos de verificação do tipo de usuário estavam com a inicial maiúscula, coloquei minúsculo.

- **Mudança 6**: Vi que ele verificava apenas se o usuário era empresa, e já partia pro else. Ou seja, um adm podia fazer ações de usuário empresa, o que poderia até mesmo causar um NullPointer ou algum erro semelhante.

- **Mudança 7**: Na parte de adm, coloquei pra exibir informações das empresas e clientes.

- **Mudança 8**: Ocorria um erro de "NoSuchElementException" após encerrar a seção e em seguida colocar um login não existente, então tratei com try e catch.