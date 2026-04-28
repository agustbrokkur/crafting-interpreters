CC := gcc
CFLAGS := -g -Wall

SRC := $(wildcard src/*.c)
OBJ := $(SRC:.c=.o)

BUILD_DIR := build
OUT := $(BUILD_DIR)/main

all: $(OUT)

$(OUT): $(OBJ)
	mkdir -p $(BUILD_DIR)
	$(CC) $(CFLAGS) -o $@ $^

src/$.o: src/%.c
	$(CC) $(CFLAGS) -c -o $@ $<

.PHONY: clean

clean:
	rm -f $(OBJ) $(OUT)