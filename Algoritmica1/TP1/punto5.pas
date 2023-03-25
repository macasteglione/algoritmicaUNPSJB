program punto5;
var
    clave : String;
    precio, tiempo : Real;
begin
    WriteLn('------------- CLAVES DE ZONAS -------------');
    Writeln('Especifique la clave de zona: ');
    ReadLn(clave);
    WriteLn('Ahora exprese en segundos la duracion de la llamada: ');
    ReadLn(tiempo);
    Case clave of
        '12' :   WriteLn('Zona: America del Norte ---', ' Tiempo: ', Abs(Trunc(tiempo)), ' segundos. ---', ' Precio: $', Abs(Trunc(tiempo * 2)));
        '15' :   WriteLn('Zona: America Central ---', ' Tiempo: ', Abs(Trunc(tiempo)), ' segundos. ---', ' Precio: $', Abs(Trunc(tiempo * 2.2)));
        '18' :   WriteLn('Zona: America del Sur ---', ' Tiempo: ', Abs(Trunc(tiempo)), ' segundos. ---', ' Precio: $', Abs(Trunc(tiempo * 4.5)));
        '19' :   WriteLn('Zona: Europa ---', ' Tiempo: ', Abs(Trunc(tiempo)), ' segundos. ---', ' Precio: $', Abs(Trunc(tiempo * 3.5)));
        '23' :   WriteLn('Zona: Asia ---', ' Tiempo: ', Abs(Trunc(tiempo)), ' segundos. ---', ' Precio: $', Abs(Trunc(tiempo * 6)));
        '25' :   WriteLn('Zona: Africa ---', ' Tiempo: ', Abs(Trunc(tiempo)), ' segundos. ---', ' Precio: $', Abs(Trunc(tiempo * 6)));
        '29' :   WriteLn('Zona: Oceania ---', ' Tiempo: ', Abs(Trunc(tiempo)), ' segundos. ---', ' Precio: $', Abs(Trunc(tiempo * 5)));
        else
            WriteLn('Ese codigo no esta contemplado')
    end
end.