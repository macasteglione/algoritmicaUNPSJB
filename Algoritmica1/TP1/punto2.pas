
Program punto2;

Var 
    hora, minutos, dias :   Integer;
    meridium :   String;
Begin
    Writeln('Ingrese la hora: ');
    Read(hora);
    hora := Abs(hora);
    WriteLn('Ahora ingrese los minutos: ');
    Read(minutos);
    minutos := abs(minutos);
    If (hora > 12) Then
        Begin
            meridium := 'PM'
        End
    Else
        Begin
            meridium := 'AM'
        End;
    If (hora > 24) Then
        Begin
            dias := hora Div 24;
            Repeat
                hora := hora - 12;
            Until (hora <= 12);
        End;
    hora := Abs(hora - 12);
    If (minutos > 60) Then
        Begin
            Repeat
                minutos := minutos - 60;
            Until (minutos < 60);
        End;
    Writeln('La hora es ', hora, ':', minutos, ' ',
            meridium,
            ', y ', dias,
            ' dias.')
End.
