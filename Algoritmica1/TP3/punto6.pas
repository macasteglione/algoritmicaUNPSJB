
Program punto6;

Const 
    F =   5;
    C =   5;

Var 
    A :   array [0..F, 0..C] Of Integer;
    V :   array Of Integer;
    W :   array Of Integer;
    i, j, aux, dirI, dirJ :   Integer;

Procedure agregarElemento();
Begin
    SetLength(V, Length(V)+1);
    v[High(v)] := aux;
    SetLength(W, Length(W)+1);
    W[High(W)] := dirI;
    SetLength(W, Length(W)+1);
    W[High(W)] := dirJ;
End;

Begin
    SetLength(V, 0);
    SetLength(W, 0);
    randomize;
    aux := 6;
    For i := Low(A) To High(A) Do
        Begin
            For j := Low(A[0]) To High(A[0]) Do
                Begin
                    A[i, j] := random(10) - 5;
                    Write(A[i, j], ' ');
                    If A[i, j] < aux Then
                        Begin
                            aux := A[i, j];
                            dirI := i;
                            dirJ := j;
                        End;
                End;
            WriteLn;
            agregarElemento();
            aux := 6;
        End;
    For i := Low(V) To High(V) Do
        Write(V[i], ' ');
    WriteLn;
    For i := Low(W) To High(W) Do
        Write(W[i], ' ');
End.
