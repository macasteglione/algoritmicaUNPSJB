
Program punto3;

Var 
    matrix1, matrix2, matrix3 :   array [0..9, 0..9] Of Integer;
    i, j :   Integer;
Begin
    randomize;
    For i := Low(matrix1) To High(matrix1) Do
        For j := Low(matrix1[0]) To High(matrix1[0]) Do
            Begin
                matrix1[i, j] := random(10);
                matrix2[i, j] := random(10);
                matrix3[i, j] := random(10);
                matrix3[i, j] := matrix1[i, j] + matrix2[i, j]
            End;
    For i := Low(matrix1) To High(matrix1) Do
        Begin
            For j := Low(matrix1[0]) To High(matrix1[0]) Do
                Write(matrix3[i, j], ' ');
            WriteLn;
        End
End.
