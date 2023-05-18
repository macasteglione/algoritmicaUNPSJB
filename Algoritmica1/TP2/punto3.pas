
Program punto3;

Var 
    vector :   array [0..50] of Integer;
    n, i, t :   Integer;
Begin
    ReadLn(n);
    For i := 0 To n Do
        Begin
            vector[i] := random(10) - random(10);
            //WriteLn(vector[i]);
            If vector[i] > 0 Then
                writeln('positivo ', vector[i])
            Else
                WriteLn('negativo ', vector[i]);
        End;
End.
