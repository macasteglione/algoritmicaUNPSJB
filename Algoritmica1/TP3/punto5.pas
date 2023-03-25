
Program punto5;

Uses crt;

Const 
    N =   10;
    M =   10;

Var 
    laMatrix :   array [1..N, 1..M] Of Integer;
    i, j, aux, dirI, dirJ, zero :   Integer;
Begin
    randomize;
    aux := 0;
    For i := Low(laMatrix) To High(laMatrix) Do
        Begin
            For j := Low(laMatrix[0]) To High(laMatrix[0]) Do
                Begin
                    laMatrix[i, j] := random(10) - 5;
                    If laMatrix[i, j] = 0 Then
                        textColor(red);
                    If laMatrix[i, j] > aux Then
                        Begin
                            aux := laMatrix[i, j];
                            dirI := i;
                            dirJ := j
                        End;
                    Write(laMatrix[i, j], ' ');
                    NormVideo;
                    If laMatrix[i,j] = 0 Then
                        zero := zero + 1
                End;
            WriteLn
        End;
    Writeln('Numero mas grande: ', aux, '. Ubicacion: ', 'Fila ', dirI, ', columna ', dirJ,
            '. Ceros: ', zero, '.')
End.
