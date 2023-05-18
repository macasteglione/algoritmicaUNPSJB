
Program punto4;

Const 
    M =   10;
    P =   10;

Var 
    laMatrix :   array [1..M, 1..P] Of Integer;
    i, j, cont :   Integer;
    promedio :   Real;
Begin
    For i := Low(laMatrix) To High(laMatrix) Do
        For j := Low(laMatrix[0]) To High(laMatrix[0]) Do
            laMatrix[i, j] := ((i * 10) + j) - 10;
    For i := Low(laMatrix) To High(laMatrix) Do
        Begin
            For j := Low(laMatrix[0]) To High(laMatrix[0]) Do
                Begin
                    Write(laMatrix[i, j], ' ');
                    If i Mod 2 = 0 Then
                        Begin
                            cont := cont + 1;
                            promedio := promedio + laMatrix[i, j]
                        End
                End;
            WriteLn
        End;
    WriteLn('el promedio es ', Trunc((promedio)/cont))
End.
