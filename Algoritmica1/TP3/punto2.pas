
Program punto2;

Var 
    matrix :   array [0..3, 0..6] Of Integer;
    i, j :   Integer;
Begin
    For i := Low(matrix) To High(matrix) Do
        Begin
            For j := Low(matrix[0]) To High(matrix[0]) Do
                Begin
                    matrix[i, j] :=  1 + (2 * i) + (j * 8);
                    Write(matrix[i, j], ' ')
                End;
            WriteLn
        End
End.
