					

						// GIT

// Verifica se o Git est? instalado corretamente:
git


// Consulta as informa??es e verifica se possui usu?rio logado:
git config --list


// Vincula o usu?rio ao GitHub, para cr?ditos:
git config --global user.name "User Name"
git config --global user.email "UserName@email.com"


// Inicia um novo reposit?rio local na pasta do seu projeto:
git init


// Associa seu reposit?rio local ao reposit?rio remoto, com o apelido de "origin":
// ATEN??O: troque pelo caminho do seu reposit?rio do Github.
git remote add origin https://github.com/username/aula1-github.git


// Atualiza seu reposit?rio local em rela??o ao reposit?rio remoto:
// ATEN??O: este comando s? ? necess?rio se voc? criou o .gitignore pelo Github.
git pull origin main


// Altera o branch padr?o para main:
// NOTA: o branch padr?o master, foi alterado para main.
git checkout -b main


// Verifica arquivos:
git status


// Adiciona todos arquivos ao stage:
git add .


// Salva uma nova vers?o do projeto:
git commit -m "Projeto criado"


// Envia o reposit?rio local para o reposit?rio remoto:
// NOTA: nas pr?ximas vezes basta fazer: 'git push'.
git push -u origin main
git push


// Lista o hist?rico de commits:
git log --oneline


					// Kit de primeiros socorros


// Vai mostrar a ?ltima modifica??o:
git status


// Quero desfazer tudo que eu fiz desde o ?ltimo commit:
// NOTA: o pr?prio Eclipse vai detectar o desfazimento, e vai voltar para a vers?o do ?ltimo commit.
git clean -df
git checkout -- .


// Preciso remover o ?ltimo commit, por?m mantendo os arquivos do jeito que est?o:
git reset --soft HEAD~1


// Vai mostrar a ?ltima modifica??o:
git status


// Lista o hist?rico de commits:
git log --oneline


// NOTA: por?m o GitHub n?o aceitar? um novo 'git commit -m ""' criado, usando o comando 'git push',
// pelo fato de serem commits com c?digos de identifica??o diferentes. Uma alternativa ?:


// Preciso apagar o ?ltimo commit no Github:
git push -f origin HEAD^:main


// NOTA: agora ele aceita o 'git push'


// Lista o hist?rico de commits:
git log --oneline


// Preciso remover o ?ltimo commit, inclusive as altera??es nos arquivos:
// ATEN??O: Perigoso!
git reset --hard HEAD~1


// Lista o hist?rico de commits:
git log --oneline


// Atualiza seu reposit?rio local em rela??o ao reposit?rio remoto:
git pull origin main


// NOTA: retorna o ?ltimo commit salvo no GitHub, e atualiza o arquivo no Eclipse


// Lista o hist?rico de commits:
git log --oneline


// Quero alterar temporariamente os arquivos do projeto de modo a ficarem no estado do commit informado:
// ATEN??O: n?o podem haver modifica??es n?o commitadas no projeto.
// EXEMPLO: git checkout e8a52f3
git checkout <c?digo do commit>


// Lista o hist?rico de commits:
git log --oneline


// NOTA: Se por algum acidente, voc? alterar alguma coisa:
git clean -df
git checkout -- .


// NOTA: para voltar ao ?ltimo commit fa?a:
git checkout main


// Quero mudar o meu reposit?rio remoto "origin":
git remote set-url origin https://github.com/username/teste-novo-repo.git


// Envia o reposit?rio local para o reposit?rio remoto:
// NOTA: nas pr?ximas vezes basta fazer: 'git push'.
git push -u origin main
git push


// NOTA: com isso o reposit?rio ? alterado para um novo, por?m com os mesmos arquivos do ?ltimo.


// Entrei no VIM por engano. Como sair?
// NOTA: alterei o arquivo do c?digo, fiz um 'git add .' e um 'git commit', esqueci de colocar o restante,
// ent?o o Git vai entrar no editor VIM, para sair:
// Tecle ESC, depois digite :q! e tecle ENTER
ESC :q! ENTER

