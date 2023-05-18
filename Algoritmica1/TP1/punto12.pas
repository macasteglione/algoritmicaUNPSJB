Program punto12;

Var 
    fecha1, fecha2 : String;
    dia1, dia2, mes1, mes2, anio1, anio2, code, i, mesMenor, anioMenor,
    resultado, aniosTranscurridos : Integer;
    diasDelMes : array[1..12] Of Integer = (31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
Begin
    Writeln('Escriba una fecha en formato dd/mm/aaaa.');
    ReadLn(fecha1);
    Writeln('Ahora escriba otra fecha en el mismo formato.');
    ReadLn(fecha2);
    Val(Copy(fecha1, 1, 2), dia1, code);
    Val(Copy(fecha2, 1, 2), dia2, code);
    Val(Copy(fecha1, 4, 2), mes1, code);
    Val(Copy(fecha2, 4, 2), mes2, code);
    Val(Copy(fecha1, 7, 10), anio1, code);
    Val(Copy(fecha2, 7, 10), anio2, code);
    If mes1 < mes2 Then
        mesMenor := mes1
    Else
        mesMenor := mes2;
    If anio1 < anio2 Then
        anioMenor := anio1
    Else
        anioMenor := anio2;
    aniosTranscurridos := Abs(anio1 - anio2) * 365;
    For i := anioMenor To anioMenor + abs(anio1 - anio2) Do
        If i Mod 4 = 0 Then
            aniosTranscurridos := aniosTranscurridos + 1;
    If mes1 <> mes2 Then
        Begin
            resultado := 0;
            For i := mesMenor To mesMenor + abs(mes1 - mes2) - 1 Do
                resultado := resultado + diasDelMes[i];
            WriteLn('Hay una diferencia de ', Abs(aniosTranscurridos - (resultado - Abs(dia1 - dia2))), ' dias en las fechas introducidas.')
        End
    Else
        WriteLn('Hay una diferencia de ', Abs(aniosTranscurridos - Abs(dia1 - dia2)), ' dias en las fechas introducidas.')
End.
