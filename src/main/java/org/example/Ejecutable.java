package org.example;

public class Ejecutable {
    public static void main(String[] args) {

        Funcion g = new Funcion(new String[]{"Antigua Guatemala","Sumpango","Ciudad Vieja","San Miguel Dueñas",
                "Alotenango","Santa Maria de Jesus","Magdalena Milpas Altas","San Bartolome Milpas Altas",
                "Santo Domingo Xenacoj","Pastores","Santiago Sacatepequez","San Antonio Aguas Calientes",
                "Santa Catarina Barahona","Santa Lucia Milpas Altas","Jocotenango","San Lucas Sacatepequez"});

        g.agregarRuta("Antigua Guatemala","Ciudad Vieja", 6);
        g.agregarRuta("Antigua Guatemala","San Antonio Aguas Calientes", 9);
        g.agregarRuta("Antigua Guatemala", "San Lucas Sacatepequez", 15);
        g.agregarRuta("Antigua Guatemala", "Sumpango", 28);
        g.agregarRuta("Antigua Guatemala", "Jocotenango", 3);
        g.agregarRuta("Antigua Guatemala", "Santa Lucia Milpas Altas", 8);
        g.agregarRuta("Antigua Guatemala", "Alotenango", 12);
        g.agregarRuta("Antigua Guatemala", "Santa Maria de Jesus", 10);
        g.agregarRuta("Antigua Guatemala", "Magdalena Milpas Altas", 10);
        g.agregarRuta("Antigua Guatemala", "San Miguel Dueñas", 11);
        g.agregarRuta("Antigua Guatemala", "San Bartolome Milpas Altas", 11);
        g.agregarRuta("Antigua Guatemala", "Santo Domingo Xenacoj", 29);
        g.agregarRuta("Antigua Guatemala", "Pastores", 8);
        g.agregarRuta("Antigua Guatemala", "Santiago Sacatepequez", 23);
        g.agregarRuta("Antigua Guatemala", "Santa Catarina Barahona", 9);

        g.agregarRuta("Ciudad Vieja","San Antonio Aguas Calientes",5);
        g.agregarRuta("Ciudad Vieja", "San Lucas Sacatepequez", 20);
        g.agregarRuta("Ciudad Vieja","Sumpango",32);
        g.agregarRuta("Ciudad Vieja", "Jocotenango", 12);
        g.agregarRuta("Ciudad Vieja", "Santa Lucia Milpas Altas", 21);
        g.agregarRuta("Ciudad Vieja", "Alotenango", 8);
        g.agregarRuta("Ciudad Vieja", "Santa Maria de Jesus", 11);
        g.agregarRuta("Ciudad Vieja", "Magdalena Milpas Altas", 15);
        g.agregarRuta("Ciudad Vieja", "San Miguel Dueñas", 5);
        g.agregarRuta("Ciudad Vieja", "San Bartolome Milpas Altas", 22);
        g.agregarRuta("Ciudad Vieja", "Santo Domingo Xenacoj", 33);
        g.agregarRuta("Ciudad Vieja","Pastores",13);
        g.agregarRuta("Ciudad Vieja", "Santiago Sacatepequez", 35);
        g.agregarRuta("Ciudad Vieja", "Santa Catarina Barahona", 6);

        g.agregarRuta("Pastores","San Antonio Aguas Calientes",15);
        g.agregarRuta("Pastores", "San Lucas Sacatepequez", 24);
        g.agregarRuta("Pastores","Sumpango",10);
        g.agregarRuta("Pastores", "Jocotenango", 5);
        g.agregarRuta("Pastores", "Santa Lucia Milpas Altas", 28);
        g.agregarRuta("Pastores", "Alotenango", 20);
        g.agregarRuta("Pastores", "Santa Maria de Jesus", 20);
        g.agregarRuta("Pastores", "Magdalena Milpas Altas", 17);
        g.agregarRuta("Pastores", "San Miguel Dueñas", 18);
        g.agregarRuta("Pastores", "San Bartolome Milpas Altas", 22);
        g.agregarRuta("Pastores", "Santo Domingo Xenacoj", 19);
        g.agregarRuta("Pastores", "Santiago Sacatepequez", 22);
        g.agregarRuta("Pastores", "Santa Catarina Barahona", 14);

        g.agregarRuta("Santa Lucia Milpas Altas","San Antonio Aguas Calientes",17);
        g.agregarRuta("Santa Lucia Milpas Altas","San Lucas Sacatepequez", 7);
        g.agregarRuta("Santa Lucia Milpas Altas","Sumpango",20);
        g.agregarRuta("Santa Lucia Milpas Altas", "Jocotenango", 11);
        g.agregarRuta("Santa Lucia Milpas Altas", "Alotenango", 22);
        g.agregarRuta("Santa Lucia Milpas Altas", "Santa Maria de Jesus", 18);
        g.agregarRuta("Santa Lucia Milpas Altas", "Magdalena Milpas Altas", 4);
        g.agregarRuta("Santa Lucia Milpas Altas", "San Miguel Dueñas", 19);
        g.agregarRuta("Santa Lucia Milpas Altas", "San Bartolome Milpas Altas", 9);
        g.agregarRuta("Santa Lucia Milpas Altas", "Santo Domingo Xenacoj", 21);
        g.agregarRuta("Santa Lucia Milpas Altas", "Santiago Sacatepequez", 15);
        g.agregarRuta("Santa Lucia Milpas Altas", "Santa Catarina Barahona", 17);

        g.agregarRuta("Sumpango","San Antonio Aguas Calientes",21);
        g.agregarRuta("Sumpango","San Lucas Sacatepequez", 14);
        g.agregarRuta("Sumpango", "Jocotenango", 11);
        g.agregarRuta("Sumpango", "Alotenango", 33);
        g.agregarRuta("Sumpango", "Santa Maria de Jesus", 26);
        g.agregarRuta("Sumpango", "Magdalena Milpas Altas", 22);
        g.agregarRuta("Sumpango", "San Miguel Dueñas", 23);
        g.agregarRuta("Sumpango", "San Bartolome Milpas Altas", 12);
        g.agregarRuta("Sumpango", "Santo Domingo Xenacoj", 8);
        g.agregarRuta("Sumpango", "Santiago Sacatepequez", 11);
        g.agregarRuta("Sumpango", "Santa Catarina Barahona", 26);

        g.agregarRuta("Alotenango","San Antonio Aguas Calientes",10);
        g.agregarRuta("Alotenango","San Lucas Sacatepequez", 30);
        g.agregarRuta("Alotenango", "Jocotenango", 19);
        g.agregarRuta("Alotenango", "Santa Maria de Jesus", 21);
        g.agregarRuta("Alotenango", "Magdalena Milpas Altas", 23);
        g.agregarRuta("Alotenango", "San Miguel Dueñas", 6);
        g.agregarRuta("Alotenango", "San Bartolome Milpas Altas", 30);
        g.agregarRuta("Alotenango", "Santo Domingo Xenacoj", 39);
        g.agregarRuta("Alotenango", "Santiago Sacatepequez", 36);
        g.agregarRuta("Alotenango", "Santa Catarina Barahona", 11);

        g.agregarRuta("San Miguel Dueñas","San Antonio Aguas Calientes",6);
        g.agregarRuta("San Miguel Dueñas","San Lucas Sacatepequez", 26);
        g.agregarRuta("San Miguel Dueñas", "Jocotenango", 17);
        g.agregarRuta("San Miguel Dueñas", "Santa Maria de Jesus", 18);
        g.agregarRuta("San Miguel Dueñas", "Magdalena Milpas Altas", 20);
        g.agregarRuta("San Miguel Dueñas", "San Bartolome Milpas Altas", 27);
        g.agregarRuta("San Miguel Dueñas", "Santo Domingo Xenacoj", 32);
        g.agregarRuta("San Miguel Dueñas", "Santiago Sacatepequez", 33);
        g.agregarRuta("San Miguel Dueñas", "Santa Catarina Barahona", 5);

        g.agregarRuta("Santa Maria de Jesus","San Antonio Aguas Calientes",17);
        g.agregarRuta("Santa Maria de Jesus","San Lucas Sacatepequez", 24);
        g.agregarRuta("Santa Maria de Jesus", "Jocotenango", 14);
        g.agregarRuta("Santa Maria de Jesus", "Magdalena Milpas Altas", 19);
        g.agregarRuta("Santa Maria de Jesus", "San Bartolome Milpas Altas", 20);
        g.agregarRuta("Santa Maria de Jesus", "Santo Domingo Xenacoj", 39);
        g.agregarRuta("Santa Maria de Jesus", "Santiago Sacatepequez", 32);
        g.agregarRuta("Santa Maria de Jesus", "Santa Catarina Barahona", 17);

        g.agregarRuta("Jocotenango","San Antonio Aguas Calientes",14);
        g.agregarRuta("Jocotenango","San Lucas Sacatepequez", 19);
        g.agregarRuta("Jocotenango", "Magdalena Milpas Altas", 13);
        g.agregarRuta("Jocotenango", "San Bartolome Milpas Altas", 15);
        g.agregarRuta("Jocotenango", "Santo Domingo Xenacoj", 20);
        g.agregarRuta("Jocotenango", "Santiago Sacatepequez", 26);
        g.agregarRuta("Jocotenango", "Santa Catarina Barahona", 14);

        g.agregarRuta("Magdalena Milpas Altas","San Antonio Aguas Calientes",19);
        g.agregarRuta("Magdalena Milpas Altas","San Lucas Sacatepequez", 8);
        g.agregarRuta("Magdalena Milpas Altas", "San Bartolome Milpas Altas", 10);
        g.agregarRuta("Magdalena Milpas Altas", "Santo Domingo Xenacoj", 22);
        g.agregarRuta("Magdalena Milpas Altas", "Santiago Sacatepequez", 16);
        g.agregarRuta("Magdalena Milpas Altas", "Santa Catarina Barahona", 20);

        g.agregarRuta("San Bartolome Milpas Altas","San Antonio Aguas Calientes",22);
        g.agregarRuta("San Bartolome Milpas Altas","San Lucas Sacatepequez", 2);
        g.agregarRuta("San Bartolome Milpas Altas", "Santo Domingo Xenacoj", 13);
        g.agregarRuta("San Bartolome Milpas Altas", "Santiago Sacatepequez", 8);
        g.agregarRuta("San Bartolome Milpas Altas", "Santa Catarina Barahona", 23);

        g.agregarRuta("Santa Catarina Barahona","San Antonio Aguas Calientes",2);
        g.agregarRuta("Santa Catarina Barahona","San Lucas Sacatepequez", 25);
        g.agregarRuta("Santa Catarina Barahona", "Santo Domingo Xenacoj", 31);
        g.agregarRuta("Santa Catarina Barahona", "Santiago Sacatepequez", 32);

        g.agregarRuta("Santiago Sacatepequez","San Antonio Aguas Calientes",27);
        g.agregarRuta("Santiago Sacatepequez","San Lucas Sacatepequez", 6);
        g.agregarRuta("Santiago Sacatepequez", "Santo Domingo Xenacoj", 12);

        g.agregarRuta("Santo Domingo Xenacoj","San Antonio Aguas Calientes",29);
        g.agregarRuta("Santo Domingo Xenacoj","San Lucas Sacatepequez", 15);

        g.agregarRuta("San Lucas Sacatepequez","San Antonio Aguas Calientes",23);

        String inicio = "Antigua Guatemala";
        String fin    = "Santo Domingo Xenacoj";

        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        System.out.println(respuesta);
    }
}
