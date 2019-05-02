# Sourch_Cep

Aplicação Spring-boot para busca de CEP, a aplicação utiliza jersey para facilitar na conexão da API de busca de CEP via cep (https://viacep.com.br/).


# Comandos de deploy utilizando Docker!

```sh
$ cd docker-cep
$ docker-composer up
```

# End-point da aplicação

  | Descrição | URL |
| ------ | ------ |
| Endereço completo | http://localhost:8080/api/getAddressByCep/09841510 |
| Nome da Rua  | http://localhost:8080/api/getStreetByCep/09841510 |
| Nome da cidade | http://localhost:8080/api/getCityByCep/09841510 |
| Nome do bairro | http://localhost:8080/api/getDistrictByCep/09841510 |
| Nome do Estado | http://localhost:8080/api/getStateByCep/09841510 |

