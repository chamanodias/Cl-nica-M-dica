🏥 Sistema de Gerenciamento de Clínica Médica

📋 Descrição
Este projeto é um sistema de gerenciamento de clínica médica desenvolvido em Java, que permite o cadastro de médicos e pacientes, agendamento de consultas e geração de relatórios. O sistema oferece um terminal interativo para facilitar a utilização, proporcionando uma experiência de uso intuitiva e agradável.

🚀 Funcionalidades
Cadastrar médicos com especialidade e horários de atendimento.
Agendar consultas para pacientes com médicos cadastrados.
Buscar pacientes por CPF e exibir informações.
Listar consultas agendadas e médicos cadastrados.
Gerar relatórios detalhados de todas as consultas realizadas.
Interface de linha de comando simples e fácil de usar.
📦 Estrutura do Projeto
📦 SistemaClinicaMedica
├── 📂 src
│   ├── Agenda.java
│   ├── Consulta.java
│   ├── Main.java
│   ├── Medico.java
│   └── Paciente.java
├── .gitignore
├── README.md
└── pom.xml (caso use Maven)
🛠️ Tecnologias Utilizadas
Java: Linguagem de programação principal.
Scanner: Para leitura de entradas do usuário no terminal.
ArrayList: Para armazenar listas dinâmicas de pacientes e médicos.
IDE: Visual Studio Code (ou qualquer outra IDE de sua preferência).
🔧 Pré-requisitos
Antes de começar, verifique se você possui os seguintes requisitos:

Java 8 ou superior
Um ambiente de desenvolvimento Java configurado (IDE como VS Code, IntelliJ, Eclipse, etc.)
▶️ Como Executar o Projeto
Clone o repositório:

bash
Copiar código
git clone (copiar URL do projeto)
cd ClinicaMedica_java
Compile o projeto:

bash
Copiar código
javac src/*.java
Execute a aplicação:

bash
Copiar código
java src.Main
Siga as instruções no terminal para interagir com o sistema.

💡 Exemplo de Uso
Cadastrar um médico:
Informe o nome do médico, especialidade, horário de início e fim do atendimento.
Agendar uma consulta:
Escolha um médico cadastrado, insira as informações do paciente e a data da consulta.
Buscar paciente:
Digite o CPF do paciente para buscar informações.
Gerar relatório de consultas:
Veja um resumo de todas as consultas realizadas até o momento.

Criado por: Lucas Dias


