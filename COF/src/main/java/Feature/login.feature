# language: pt
Funcionalidade: Acessar e Logar no e-mail CWI

  Contexto: 
    Dado que estou na tela de login

  @login
  Cenario: Realizar login no e-mail CWI
    Quando informar usuario e senha validos
    |usuario       |senha|
    |user.sobrenome|12345|
    E clico em login
    Entao a tela home do sistema deve aparecer
