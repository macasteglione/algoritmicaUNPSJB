
Program punto10;

Uses crt, sysutils;

Var 
    coche :   array Of String;
    marca, menu, aux :   String;
    i, j, borrar :   Integer;

Procedure agregarMarca();
Begin
    WriteLn('Escriba el nombre de la marca: ');
    ReadLn(marca);
    SetLength(coche, Length(coche) + 1);
    coche[High(coche)] := uppercase(marca)
End;

Procedure borrarMarca();
Begin
    WriteLn('Escriba el numero de la marca a borrar: ');
    ReadLn(borrar);
    For i := borrar To High(coche) Do
        coche[i] := coche[i + 1];
    SetLength(coche, Length(coche) - 1)
End;

Begin
    SetLength(coche, 6);
    coche[1] := 'ALFA ROMEO';
    coche[2] := 'FIAT';
    coche[3] := 'FORD';
    coche[4] := 'LANCIA';
    coche[5] := 'RENAULT';
    coche[6] := 'SEAT';
    Repeat
        For i := Low(coche) + 1 To High(coche) Do
            For j := Low(coche) To High(coche) - 1 Do
                If Ord((coche[j])[1]) > Ord((coche[j + 1])[1]) Then
                    Begin
                        aux := coche[j];
                        coche[j] := coche[j + 1];
                        coche[j + 1] := aux
                    End;
        WriteLn('');
        Write('Marcas: ');
        Begin
            For i := Low(coche) To High(coche) Do
                WriteLn(i, ') ', coche[i]);
            WriteLn('OPRIMA "a" PARA AGREGAR UNA MARCA. OPRIMA "b" PARA BORRAR UNA MARCA. OPRIMA "q" PARA SALIR.');
            ReadLn(menu);
            Case menu Of 
                'a' :   agregarMarca();
                'b' :   borrarMarca()
            End
        End
    Until menu = 'q'
End.
