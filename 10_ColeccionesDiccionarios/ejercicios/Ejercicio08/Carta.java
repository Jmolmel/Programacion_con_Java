package Ejercicio08;

public class Carta {

  //////// Atributos
  private static String[] palos = { "Oros", "Copas", "Espadas", "Bastos" }; // Oros, Copas, Espadas y Bastos.
  private static String[] numeros = { "1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey" }; // 1, 2, 3, 4, 5, 6, 7, Sota, Caballo y Rey.

    private String palo;
    private String valor;

    public Carta(){
      this.palo = palos[(int)(Math.random() * 4)];
      this.valor = numeros[(int)(Math.random() * 10)];
    }

    public String getPalo() {
      return palo;
    }

    public String getValor() {
      return valor;
    }

    @Override
    public String toString() {
      return valor + "de " + palo;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Carta other = (Carta) obj;
      if (palo == null) {
        if (other.palo != null)
          return false;
      } else if (!palo.equals(other.palo))
        return false;
      if (valor == null) {
        if (other.valor != null)
          return false;
      } else if (!valor.equals(other.valor))
        return false;
      return true;
    }
    
    
    
}
