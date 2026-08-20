#especifica a imagem base 
FROM maven:3.9-eclipse-temurin-21-noble

#habilita a instalaçao nao interativa
ENV DEBIAN_FRONTEND=noninteractive
#instala as ferramentas que nao estao na imagem base 
#apt-get update - atualiza os repositorios do software
#apt-get install-Instala as ferramentas 
#curl- testa APIs
#git-lfs - armazenamento de arquivos binarios 
#apt-get clean e rm- 
RUN apt-get update && apt-get install -y \
    mysql-server-8.0 \
    git \
    git-lfs \
    curl \
    unzip \
    zip \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*
