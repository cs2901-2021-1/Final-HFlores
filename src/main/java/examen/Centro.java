package examen;

public class Centro {

        // Atributos
        private String nombre;
        private boolean operativo;
        private int TotalCompletas;
        private int TotalParciales;
        // Métodos

        Centro(String nombre,int vacunasParciales, int vacunasCompletas, boolean operativo) {
                this.operativo = operativo;
                this.TotalParciales = vacunasParciales;
                this.TotalCompletas = vacunasCompletas;
        }
        // setters

        public void Bajarlo() {
                operativo = false;
        }

        public void Subirlo() {
                operativo = true;
        }

        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }
        // getters
        public String getNombre()
        {
            return nombre;
        }

        public int getVacunasCompletas() {
                return TotalCompletas;
        }

        public int getVacunasParciales() {
                return TotalParciales;
        }


}
