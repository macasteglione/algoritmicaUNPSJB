
Program punto1;

Const 
    k =   10;
Var 
    matriz :   array[1..5, 1..10] Of Integer;
    i, j :   Integer;
Begin
    For i := 1 To 5 Do
        For j:= 1 To 10 Do
            matriz[i, j] := k
End.
