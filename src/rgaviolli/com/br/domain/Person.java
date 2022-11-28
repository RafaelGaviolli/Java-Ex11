package rgaviolli.com.br.domain;

public class Person {

        private String nome;

        private String nome2;

        public Person(String nome, String nome2) {
            this.nome = nome;
            this.nome2 = nome2;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome2() {
            return nome2;
        }

        public void setNome2(String nome2){
            this.nome2 = nome2;
        }

}

