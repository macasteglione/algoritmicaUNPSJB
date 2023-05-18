Program punto4;

Var
    dia : Char;
Begin
    WriteLn('Ingrese el numero correspondiente a un dia de la semana: ');
    Read(dia);
    Case dia Of 
        '1' :   WriteLn('Domingo.');
        '2' :   WriteLn('Lunes.');
        '3' :   WriteLn('Martes.');
        '4' :   WriteLn('Miercoles.');
        '5' :   WriteLn('Jueves..');
        '6' :   WriteLn('Viernes.');
        '7' :   WriteLn('Sabado.');
        Else
            WriteLn('Ese numero no esta contemplado.')
    End
End.
