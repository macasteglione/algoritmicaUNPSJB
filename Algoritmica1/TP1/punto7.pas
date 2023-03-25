Program punto7;

Var 
    a, b, c :   Integer;
Begin
    Randomize;
    a := Random(20);
    b := Random(20);
    c := Random(20);
    If (a >= b) And (a >= c) Then
        Begin
            If b >= c Then
                WriteLn(a, b:3, c:3)
            Else
                WriteLn(a, c:3, b:3)
        End
    Else
        Begin
            If (b >= a) And (b >= c) Then
                Begin
                    If a >= c Then
                        WriteLn(b, a:3, c:3)
                    Else
                        WriteLn(b, c:3, a:3)
                End
            Else
                Begin
                    If (c >= a) And (c >= b) Then
                        Begin
                            If a >= b Then
                                WriteLn(c, a:3, b:3)
                            Else
                                WriteLn(c, b:3, a:3)
                        End
                End
        End
End.
