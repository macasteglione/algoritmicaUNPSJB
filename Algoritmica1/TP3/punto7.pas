
Program punto7;

Const 
    S =   5;
    D =   5;
    N =   5;

Var 
    matrix :   array [0..S, 0..D] Of Integer;
    vector :   array [0..N] Of Integer;
    i, j :   Integer;
    encontrado :   Boolean;
Begin
    randomize;
    Write('[ ');
    For i := Low(vector) To High(vector) Do
        Begin
            vector[i] := random(10) - 5;
            Write(vector[i], ', ')
        End;
    Write(' ]');
    WriteLn;
    For i := Low(matrix) To High(matrix) Do
        Begin
            For j := Low(matrix[0]) To High(matrix[0]) Do
                Begin
                    matrix[i, j] := random(10) - 3;
                    Write(matrix[i, j], ' ');
                    If vector[i] = matrix[i, j] Then
                        encontrado := True
                End;
            WriteLn
        End;
    WriteLn('Todos los elementos del vector estan en la matriz? ', encontrado, '!')
End.
