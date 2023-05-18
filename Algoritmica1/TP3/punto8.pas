
Program punto8;

Const 
    N =   5;

Var 
    vector :   array [0..N] Of Integer;
    histograma :   array [0..N, 0..N] Of String;
    i, j :   Integer;
Begin
    randomize;
    For i := low(vector) To High(vector) Do
        Begin
            vector[i] := random(N);
            Write(vector[i]:4)
        End;
    WriteLn;
    For j := High(histograma) Downto Low(histograma) Do
        Begin
            For i := Low(histograma[0]) To High(histograma[0]) Do
                Begin
                    If j < vector[i] Then
                        histograma[j, i] := '*';
                    Write(histograma[j, i]:4);
                End;
            WriteLn;
        End;
End.
