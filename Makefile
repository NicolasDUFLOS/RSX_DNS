## Comilateur C et éditeur de liens
CC = gcc

## Options pour la compilation du C
CFLAGS = -Wall -Werror -ansi -pedantic
# Specifie la version de la norme POSIX a respecter
CFLAGS += -D_XOPEN_SOURCE=500
# Active les informations de débogage
CFLAGS += -g

##Première cible
all: send


## Compilation séparée
sendUDP.o: sendUDP.c
	${CC} ${CFLAGS} -c $<

sendUDP: sendUDP.o
	${CC} ${LDFLAGS} -o $@ $^

send:
	./SendUDP "Salutations" 

clean:
	rm *.o || true
