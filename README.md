# Projeto de Vendedores e Departamentos com Java JDBC

Este projeto implementa um sistema de gerenciamento de vendedores e departamentos utilizando Java JDBC. O design do projeto segue o padrão de projeto DAO (Data Access Object) e o padrão de projeto Factory para a injeção de dependência.

## Estrutura do Projeto

![image](https://github.com/pedrofernandeslopes/vendedores-departamentos-dao-jdbc/assets/107598871/b619a798-4f04-4586-9f1b-48cdd9a290f0)


### Padrão DAO

![image](https://github.com/pedrofernandeslopes/vendedores-departamentos-dao-jdbc/assets/107598871/d9478db9-05c8-48ca-b079-04476aca46e4)


Para cada entidade, há um objeto responsável por realizar o acesso aos dados relacionados a essa entidade. As principais entidades e seus respectivos DAOs são:

- Cliente: `ClientDao`
- Produto: `ProductDao`
- Pedido: `OrderDao`

Cada DAO é definido por uma interface, e a implementação dos DAOs é feita utilizando JDBC.

### Padrão Factory

A injeção de dependência dos DAOs é feita por meio do padrão de projeto Factory. A `DaoFactory` é responsável por criar instâncias dos DAOs.

## Implementações

As principais implementações do projeto incluem:

- **Department entity class**
- **Seller entity class**
- **DepartmentDao and SellerDao interfaces**
- **SellerDaoJDBC and DaoFactory**
- **findById implementation**
- **findByDepartment implementation**
- **findAll implementation**
- **insert implementation**
- **update implementation**
- **delete implementation**
- **DepartmentDao implementation and test**
