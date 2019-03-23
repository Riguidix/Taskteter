# TASKTETER
> A copy of the actual and working ToDo List application, see the docs in https://taskwarrior.org/


Simulated of a "Terminal" with the forcing usage of one program for it
```
  >>>Welcome to Tasketer
```

![](https://github.com/Riguidix/Taskteter/blob/master/web_hi_res_512.png)

## Usage

Software that manages your TODO list from the command line. It is flexible, fast, and unobtrusive. It does its job then gets out of your way.

You must type the command "TASK" at the beginning of the input cause it will cause trouble, then you could use some of the 6 commands (add, list, edit, done, help, exit) followed by a " - " and the command, as the:

### SYNTAX
| task | - | Command-Keyword

### -ADD:
| task | - | add | Description of the Task
```
> task -add Make some Coffee
```

### -LIST:
| task | - | add | Description of the Task
```
> task -list
          ID         |          DESCRIPTION          
------------------------------------------------------
          1          |             Make Coffee           
```

### -EDIT:
| task | - | add | Description of the Task

```
> task -edit 1
Edit this task #1 to : >Better Make a Latte
```

### -DONE:
| task | - | add | Description of the Task
```
> task -done 1
Removing the task #1 cause it's done.
```

### -HELP:
| task | - | help
```
> task -help
Tasketer Guide:
task [-add][-list][-edit][-done][-help][-exit] 
 
Tasketer Guide: Please don't use '-' in the description of the task, it's just in commands sections
add      Add a new task
list     Make a list of the pending tasks
edit     Launch a line to modify a task
done     Complete a task, delete for complete from the list
exit      Set all to close the program
```

There's another option, it works only if you type something wrong so it takes you what you should type
```
> task -a
The '-a' command don't exists 
Tasketer Guide:
task [-add][-list][-edit][-done][-help][-exit] 
```

### -EXIT:
| task | - | exit
```
> task -exit
Closing Tasketer.
See you soon....
```

## Meta

Riguidix Rodríguez – riguidixrodriguez@gmail.com

Distribuido bajo la licencia MIT. Ver ``LICENSE`` para más información.
