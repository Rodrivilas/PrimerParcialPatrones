package Parcial1FilaA.Pregunta3;

public class Refrigerador implements IArtefactoElectronico{
    private String precio;


    public Refrigerador() {
    }


    @Override
    public void crear() {
        System.out.println("Precio:"+precio);
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
