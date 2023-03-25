
Program punto6;

Var 
    numeros :   array [0..10] Of Integer;
    i, j, aux :   Integer;
Begin
    Randomize();
    For i := Low(numeros) To High(numeros) Do
        Begin
            numeros[i] := random(10);
            Write(numeros[i], ', ')
        End;
    WriteLn;
    For i := Low(numeros) + 1 To High(numeros) Do
        For j := Low(numeros) To High(numeros) - 1 Do
            If numeros[j] > numeros[j + 1] Then
                Begin
                    aux := numeros[j];
                    numeros[j] := numeros[j + 1];
                    numeros[j + 1] := aux;
                End;
    WriteLn('El numero mayor es ', numeros[High(numeros)], '. Y el menor es ', numeros[Low(numeros)])
End.
