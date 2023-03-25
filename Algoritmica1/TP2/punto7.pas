
Program punto7;

Type 
    tvector =   array [1..10] Of integer;

Var 
    b,x:   tvector;
    i,j,aux:   integer;

Procedure randomizar;
Begin
    randomize();
    For i:= 1 To 10 Do
        Begin
            b[i] := random(9);
            x[i] := random(9);
        End
End;

Procedure escribir;
Begin
    For i:= 1 To 10 Do
        Begin
            write(b[i],'        ');
            writeln(x[i])
        End;
    WriteLn('---------------------------')
End;


Begin
    randomizar();
    escribir();
    For i:= 1 To 10 Do
        Begin
            aux := x[i];
            x[i] := b[i];
            b[i] := aux;
        End;
    escribir();
    For i:= 1 To 10 Do
        For j:=10 Downto 1 Do
            Begin
                aux := x[j];
                x[j] := x[i];
                x[i] := aux;
            End;
    escribir()
End.
