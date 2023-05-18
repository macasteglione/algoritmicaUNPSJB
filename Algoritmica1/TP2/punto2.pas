Program punto2;

Var
    t, i: integer;
    A, B, C: array [1..50] Of integer;
Begin
    writeln('Escribe un numero para el vector');
    readln(t);
    For i:= 1 To t Do
        Begin
            A[i] := random(9);
            B[i] := random(9);
            writeln(A[i],'     ',B[i]);
        End;

    For i:= 1 To t Do
        Begin
            C[i] := A[i]+B[i];
            writeln(C[i]);
        End
End.
