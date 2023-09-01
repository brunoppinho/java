**S.O.L.I.D**:

- **S** - Single Responsiblity Principle
- **O** - Open-Closed Principle
- **L** - Liskov Substitution Principle
- **I** - Interface Segregation Principle
- **D** - Dependency Inversion Principle

# S - Single Responsiblity Principle

O princípio da responsabilidade única diz que uma classe deve ter apenas uma responsabilidade, e consequentemente,
apenas um motivo para ser alterada.

Isso evita que tenhamos que mexer em uma classe devido a um motivo e quebremos alguma outra funcionalidade que independe
do motivo daquela alteração.

![img.png](img.png)

Fonte: https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898

# O

![img_1.png](img_1.png)

Fonte: https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898

# L

![img_2.png](img_2.png)

Fonte: https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898

# I - Interface Segregation Principle

O princípio da segregação das interfaces diz que uma interface deve ser o mais específica possível, de modo que uma
pessoa que queira implementar ela não tenha que implementar um método que não faça sentido para aquela classe.

![img_3.png](img_3.png)

Fonte: https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898

# D

Fala-se em inversão de dependência, pois nesse caso temos duas coisas, classes nesse nosso caso, aonde elas dependem uma
da outra. Por exemplo, temos um robô que para ser construído ele depende de comprarmos um cortador de pizza para
instalar
nele. Como o robô é um item mais importante que o cortador de pizza nós invertemos a ordem de dependência. Nós criamos
um robô com um conector, que quem quiser fornecer um cortador compatível vai ter que se adaptar ao nosso "contrato".
Nesse caso construímos o robô e quem for construir o cortador de pizza vai ter que construir de acordo com as nossas
especificações.
Ou seja, ao invertermos a dependência nós utilizamos uma interface aonde a nossa classe mais importante define o
contrato do que vamos utilizar e quem quiser implementar algo a ser utilizado deve respeitar esse contrato.
Em vias de regra, todo caso de uso que criarmos vamos criar antes uma interface, assim nunca dependeremos diretamente de
uma implementação. E como classe mais importante consideramos aquela aonde para construí-la precisamos de outras classes
que agregam ou compões ela.

![img_4.png](img_4.png)

Fonte: https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898
