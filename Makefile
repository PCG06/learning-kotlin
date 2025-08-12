SRC_DIR := src
BUILD_DIR := build

KOTLINC := kotlinc
JAVA := java

SOURCES := $(wildcard $(SRC_DIR)/*.kt)
JARS := $(patsubst $(SRC_DIR)/%.kt,$(BUILD_DIR)/%.jar,$(SOURCES))

all: $(JARS)

$(BUILD_DIR)/%.jar: $(SRC_DIR)/%.kt | $(BUILD_DIR)
	$(KOTLINC) $< -include-runtime -d $@

$(BUILD_DIR):
	mkdir -p $(BUILD_DIR)

run: $(BUILD_DIR)
	@if [ -z "$(FILE)" ]; then \
		echo "Usage: make run FILE=Example.kt"; \
		exit 1; \
	fi
	$(KOTLINC) $(SRC_DIR)/$(basename $(FILE)).kt -include-runtime -d $(BUILD_DIR)/$(basename $(FILE)).jar
	$(JAVA) -jar $(BUILD_DIR)/$(basename $(FILE)).jar

clean:
	rm -rf $(BUILD_DIR)

cleanbuild: clean all

.PHONY: all run clean cleanbuild
