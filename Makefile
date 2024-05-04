remove:=rm
removeFolder:=rm -rf

ifeq ($(OS),Windows_NT)
	remove:=del
	removeFolder:=rd /s/q
endif

all:
	@javac -d bin -sourcepath src src/utilidades/*.java
	@javac -d bin -sourcepath src src/modelo/*.java
	@javac -d bin -sourcepath src src/presentacion/*.java
	@javac -d bin -sourcepath src src/*.java -cp bin
	@jar cf app.jar -C bin . 
	@java -cp app.jar Main

run: app.jar
	@java -cp app.jar Main

clean:
	@$(remove) *.jar
	@$(removeFolder) bin
	
