#language:pt

  Caracteristica: Login OLA

    Contexto: Acessando o OLA e entrando no popup de login
      Dado que o usuário acesse o site do OLA e acesse o popup de login

      Cenário: REALIZAR LOGIN COM USUARIO E SENHA INVALIDOS
        Dado que realizei o login com usuario "matheus.bandeira@gmail.com" e "Asdf1234"
        Então o site deverá apresentar a mensagem "O login de acesso é invalido!"