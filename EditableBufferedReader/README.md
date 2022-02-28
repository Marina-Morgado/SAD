# Editable Buffered Reader Project
Aquest projecte consisteix en programar una classe EditableBufferedReader que implementi les funcionalitats d'un editor de consola.

## Escape key codes:
- <kbd>RIGHT</kbd> ^[[C, <kbd>LEFT</kbd> ^[[D : caràcter dreta, caràcter esquerra amb les fletxes.
- <kbd>Home</kbd>, <kbd>End</kbd> : principi, final de línia.
- <kbd>ins</kbd> : commuta mode inserció/sobre-escriptura.
- <kbd>DEL</kbd>, <kbd>bksp</kbd> : esborra caràcter actual o caràcter a l’esquerra. :

Veure https://gist.github.com/fnky/458719343aabd01cfb17a3a4f7296797
## Passar de modecooked a raw:
```console
stty -echo raw 
stty -echo cooked
```