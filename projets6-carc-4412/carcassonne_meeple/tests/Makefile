CC=gcc
CFLAGS=-std=c99 -Wall -Wextra -I ${SRC_DIR}
EXE=main
SRC_DIR=../src
SOURCES=$(wildcard *.c)
OBJECTS=$(SOURCES:.c=)
INCLUDES=$(filter-out ${SRC_DIR}/server.h, $(wildcard ${SRC_DIR}/*.h))
FUNCTIONS=$(INCLUDES:.h=.c)

.PHONY: all
all: ${EXE}

${EXE}: ${OBJECTS}
	@echo -e "\n\033[31;1mLes fonctions tests compilent et s'éxécutent !\033[0m"


%: %.c $(INCLUDES) $(FUNCTIONS) ${SOURCES}
	@$(CC) $(CFLAGS) $< $(FUNCTIONS) -o $@
	@echo""
	./$@


.PHONY: clean
clean:
	rm -f ${OBJECTS}



