program test;

var
    estruct : array [0..99] of Integer;
    i, j, aux : Integer;

procedure ordenar;
begin
    for i := Low(estruct) to High(estruct) do
        for j := low(estruct) to High(estruct) do
            if estruct[j] > estruct[j + 1] then
                begin
                    aux := estruct[j];
                    estruct[j] :=  estruct[j + 1];
                    estruct[j + 1] := aux;
                end;
end;

procedure llenar;
begin
    for i := Low(estruct) to High(estruct) do
        estruct[i] := random(100);
    ordenar;
end;

function buscar(arr : array of Integer; d : Integer) : Integer;
var
    a, b, m : Integer;
begin
    a := estruct[Low(estruct)];
    b := estruct[High(estruct)];
    buscar := 0;
    repeat
        m := (a + b) div 2
    until (a > b) or (buscar <> 0);
end;

begin
    randomize;
    llenar;
end.