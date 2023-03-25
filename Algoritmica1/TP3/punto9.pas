
Program punto9;

Uses typ, omv;

Const 
    M =   4;
    N =   2;
    O =   5;

Var 
    A :   array [1..M, 1..N] Of ArbFloat;
    B :   array [1..N, 1..O] Of ArbFloat;
    C :   array [1..M, 1..O] Of ArbFloat;
    i, j :   Integer;

Begin
    randomize;
    For i := Low(A) To M Do
        Begin
            For j := Low(A) To N Do
                Begin
                    A[i, j] := random(10) - 5;
                    Write(Trunc(A[i, j]), ' ')
                End;
            WriteLn
        End;
    WriteLn;

    For i := Low(B) To N Do
        Begin
            For j := Low(B) To O Do
                Begin
                    B[i, j] := random(10) - 5;
                    Write(Trunc(B[i, j]), ' ')
                End;
            WriteLn
        End;
    WriteLn;

    omvmmm(A[1, 1], M, N, N, 
            B[1, 1], O, O, 
            C[1, 1], O);

    For i := Low(C) To M Do
        Begin
            For j := Low(C) To O Do
                Write(Trunc(C[i, j]), ' ');
            WriteLn
        End
End.
