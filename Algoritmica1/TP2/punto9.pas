
Program punto9;

Var 
    numeros1 :   array[0..10] Of Integer;
    numeros2 :   array[0..10] Of Integer;
    i, j :   Integer;
Begin
    randomize();
    Write('Antes:');
    For i := Low(numeros1) To High(numeros1) Do
        Begin
            numeros1[i] := random(10);
            Write(numeros1[i]:2)
        End;
    WriteLn(' ');
    Write('Despues:');
    For i := Low(numeros1) To High(numeros1) Do
        Begin
            For j := i + 1 To High(numeros1) Do
                If numeros1[i] = numeros1[j] Then
                    numeros1[i] := numeros1[i] - numeros1[j];
            numeros2[i] := numeros1[i];
            Write(numeros2[i]:2)
        End;
End.
