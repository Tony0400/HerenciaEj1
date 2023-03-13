public class Abogado extends Empleado{
    @Override
    public int GetVacaiones(){
        return super.GetVacaiones() / 2;
    }
}
