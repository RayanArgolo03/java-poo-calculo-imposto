# Sistema de Gerenciamento de Contribuintes

Este é um projeto Java que implementa um sistema de gerenciamento de contribuintes, permitindo calcular impostos com base em diferentes critérios para pessoas físicas e jurídicas. O sistema solicita os dados dos contribuintes, como nome, renda anual e informações específicas para cada tipo de contribuinte. Em seguida, calcula o imposto devido por cada contribuinte e exibe o total arrecadado.

## Descrição

O projeto consiste em três classes principais:

- `Contribuinte`: classe abstrata que representa um contribuinte e contém informações básicas como nome e renda anual. Essa classe possui um método abstrato para calcular o imposto, que será implementado nas subclasses.

- `PessoaFisica`: classe que herda de `Contribuinte` e representa uma pessoa física. Além das informações básicas, possui um atributo adicional para gastos com saúde. Essa classe implementa o método para calcular o imposto com base na renda anual e nos gastos com saúde.

- `PessoaJuridica`: classe que herda de `Contribuinte` e representa uma pessoa jurídica. Além das informações básicas, possui um atributo adicional para o número de funcionários. Essa classe implementa o método para calcular o imposto com base na renda anual e no número de funcionários.

## Funcionalidades

O sistema de gerenciamento de contribuintes possui as seguintes funcionalidades:

- Registrar os dados dos contribuintes, como nome, renda anual e informações específicas para pessoas físicas ou jurídicas.
- Calcular o imposto devido por cada contribuinte com base em critérios diferentes para pessoas físicas e jurídicas.
- Exibir o total arrecadado com impostos.

O sistema utiliza a classe `Scanner` para obter os dados dos contribuintes a partir da entrada do usuário.

