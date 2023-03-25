
Program punto1;

Uses sysutils;

Var 
    fichero :   Text;
    busqueda, linea :   String;
    i, code, linea2  :   Integer;
    numeros :   array [0..10] Of Integer;
    noPrimos :   array Of String;

Procedure generarArchivo;
Begin
    If FileExists('datos.txt') Then
        Begin
            Rewrite(fichero);
            For i := Low(numeros) To High(numeros) Do
                Begin
                    numeros[i] := random(10) + 1;
                    WriteLn(fichero, numeros[i])
                End;
            Close(fichero)
        End
    Else
        WriteLn('No se ha encontrado el fichero')
End;

Procedure buscarNumero;
Begin
    i := 0;
    If FileExists('datos.txt') Then
        Begin
            Reset(fichero);
            Write('Que numero deseas buscar?: ');
            Read(busqueda);
            While Not Eof(fichero) Do
                Begin
                    ReadLn(fichero, linea);
                    If busqueda = linea Then
                        i := i + 1
                End;
            WriteLn('Se ha encontrado ', i, ' resultados del numero ', busqueda,
                    '.');
            Close(fichero);
        End
    Else
        WriteLn('No se ha encontrado el fichero.');
End;

Procedure borrarPrimos;
Begin
    If FileExists('datos.txt') Then
        Begin
            Reset(fichero);
            While Not Eof(fichero) Do
                Begin
                    ReadLn(fichero, linea);
                    val(linea, linea2, code);
                    If ((linea2 Div linea2 = 1) And (linea2 Div 1 = linea2)) And ((linea2 Mod 3 <> 0) And (linea2 Mod 2 <> 0)) Then
                        Continue
                    Else
                        Begin
                            SetLength(noPrimos, Length(noPrimos) + 1);
                            noPrimos[High(noPrimos)] := linea
                        End
                End;
            Rewrite(fichero);
            For i := low(noPrimos) To High(noPrimos) Do
                WriteLn(fichero, noPrimos[i]);
            Close(fichero)
        End
    Else
        WriteLn('No se ha encontrado el fichero.')
End;

Begin
    Assign(fichero, 'datos.txt');
    randomize;
    //generarArchivo;
    //buscarNumero;
    borrarPrimos;
End.
