
Program punto4;
uses crt;

Var 
    edades:   array [1..25] Of integer;
    i,prom:   integer;
Begin
    randomize();
    For i:= 0 To 25 Do
        Begin
            edades[i] := abs(random(60) - random(60));
            writeln(edades[i]:10);
            prom := prom + edades[i];
        End;
    writeln('Promedio de edades es igual a: ', trunc(prom/25));
            NoSound;
End.
