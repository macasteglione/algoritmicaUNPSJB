
Program punto1;

Var 
    edad :   Integer;
    nombre, sexo :   String;
Begin
    WriteLn('¡Hola! ¿Como es tu nombre?');
    ReadLn(nombre);
    writeln('¿Que edad tienes ', nombre, '?');
    ReadLn(edad);
    If edad > 120 Then
        Begin
            WriteLn('Calma matusalen');
        End
    Else
        Begin
            WriteLn('¿Cual es tu sexo ', nombre, '?');
            ReadLn(sexo);
            If edad > 50 Then
                Begin
                    writeln('Aceptado!');
                End
            Else
                Begin
                    WriteLn('Regrese en ', (50 - edad), ' años.');
                End;
        End;
End.
