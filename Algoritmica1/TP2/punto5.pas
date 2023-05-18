
Program punto5;

Var 
    nombres :   array[0..5] Of String =   ('pepe', 'maria', 'carmen', 'fulana', 'folanon', 'seba');
    busqueda :   String;
    encontrado : Boolean;
    i :   Integer;
Begin
    WriteLn('Escriba un nombre!!');
    Readln(busqueda);
    For i := 0 To 5 Do
        If busqueda = nombres[i] Then
            encontrado := True;
    if encontrado then
        WriteLn('se encontro')
    else
        WriteLn('No se encontro.')
End.
