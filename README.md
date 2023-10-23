# maxmilhas
Para esse projeto foi utilizado o Spring Boot como framework, pois ele possui uma criação inicial bastante rapida. Foi utilizado java por eu ter mais familiaridade com a linguagem.
O banco utlizado fora o MonogoDB, porque que eu já tinha ele preparado no meu computador. Além disso eu tive alguns problemas com a instalação do SQL no passsado.
O sistema foi divizido em camadas de api (controllers), serviços (services) e acesso ao banco (repositories). Esse formato eu já vi sendo utilizado em diversos lugares, além de ter uma boa escalabilidade, ele permite uma maior separação das interações entre o usuario e o banco.

Para se inicia o projeto utiliza-se "gradlew bootRun" no console do Windows ou "./gradlew bootRun" em consoles Unix, é recomendado utilizar no do windows devido a formataçãod dos textos de log.
Para buildar use "gradlew build" ou "./gradlew build"


