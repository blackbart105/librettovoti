package salso.miracle.libretto;
import java.time.LocalDate;
public class voto {
		private int voto;
		private String corso;
		public voto(int voto, String corso, LocalDate data) {
			super();
			this.voto = voto;
			this.corso = corso;
			this.data = data;
		}
		private LocalDate data;
		public int getVoto() {
			return voto;
		}
		public void setVoto(int voto) {
			this.voto = voto;
		}
		public String getCorso() {
			return corso;
		}
		public void setCorso(String corso) {
			this.corso = corso;
		}
		public LocalDate getData() {
			return data;
		}
		public void setData(LocalDate data) {
			this.data = data;
		}
}
