# Agenda com Alarmes - Aplicação Desktop em Java

**Sobre o Projeto:**

Este projeto consiste em uma aplicação desktop desenvolvida em Java para gerenciamento de uma agenda com funcionalidades de criação, leitura, atualização e exclusão (CRUD) de eventos, além da capacidade de definir alarmes para esses eventos. A interface gráfica é construída utilizando a biblioteca Swing.

**Recursos:**

- **CRUD**: Possibilidade de criar, visualizar, atualizar e excluir eventos da agenda.
- **Alarmes**: Capacidade de definir alarmes para eventos específicos.
- **Modais**: Utilização de modais para interações com o usuário, como confirmação de exclusão, edição de eventos, etc.
- **Banco de Dados PostgreSQL**: Persistência dos dados utilizando o PostgreSQL como banco de dados relacional.
- **Hibernate**: Utilização do Hibernate como framework de mapeamento objeto-relacional (ORM) para facilitar a persistência dos dados.

**Requisitos:**

- JDK (Java Development Kit) 8 ou superior
- PostgreSQL
- Hibernate
- Swing (UI)

**Instruções de Uso:**

1. **Configuração do Banco de Dados:**
   - Crie um banco de dados PostgreSQL.

2. **Configuração do Projeto:**
   - Clone este repositório em sua máquina local.
   - Abra o projeto em sua IDE Java preferida (Preferencia: Netbeans).

3. **Configuração do Hibernate:**
   - Edite o arquivo `HibernateUtil.java` localizado em `src/main/resources/entity/HibernateUtil` para configurar a conexão com o banco de dados.

4. **Execução:**
   - Compile e execute o projeto a partir de sua IDE (Preferência: NetBeans).
   - Interaja com a aplicação através da interface gráfica.


**Licença:**

Este projeto é licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.

