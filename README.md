# CineDaVinci

Se pretende desarrollar una aplicación Java para la gestión de las
proyecciones de películas que se llevarán a cabo en el “Cine Da Vinci”. La
información que necesitamos saber del cine es:
• Nombre del cine.
• Localidad en la que se aloja.
• Ciudad en la que se encuentra.
• Año de inauguración.
• Plantas de las que dispone.
• Lista de salas.
• Otras dependencias como baños, cafetería, dispensador de
palomitas, etc….
De cada Sala necesitamos saber:
• Número de Sala.
• Número de butacas que posee.
• Planta en la que se ubica.
• Horarios de los pases.
• Título de la película que se proyecta.
De cada Película necesitamos saber:
• Título de la película.
• Tipo de película: drama, comedia, musical, ciencia ficción, miedo,
etc….
• Año de creación.
• Nombre del director.
• Actores principales.
• Duración de la película.
La aplicación debe:
1. Poder añadir, eliminar, modificar y listar el cine.
2. Poder añadir, eliminar, modificar y listar una sala de cine.
3. Poder añadir, eliminar, modificar y listar películas.
4. Crear el Cine Da Vinci, con al menos cinco salas, aunque en un futuro se
podrán ampliar.
5. Crear al menos 10 películas diferentes con todos sus datos.
6. Asignar a cada una de las salas una película.
7. Poder reiniciar una sala y dejarla sin datos.
8. Poder sacar entradas para una sala determinada en una hora concreta.
---------------------------------------------------------------------------------------------------
Añadir al proyecto Cine Da Vinci las siguientes funcionalidades:
1. Crear la excepción SalaSinPasesExcepcion que controle el hecho de que al
visualizar una sala aún no tenga asignado ningún pase.
2. El cine deberá poder tener al menos una sala de cine adaptada a poder tener
un número de plazas adaptadas a espectadores con silla de ruedas. Utilizar
para esta funcionalidad el concepto de herencia.
3. Crear el archivo cine.dat que guarde el objeto Cine creado en el programa
principal.
4. Recuperar el contenido del archivo cine.dat y visualizarlo en el main.
5. Crear el archivo peliculas.txt que contenga todos los títulos y directores de
todas las películas que se están ofreciendo en las distintas salas de cine,
indicando además el numero de sala en la que se proyectan. Por ejemplo:
Sala 1. Película: Skyfall, Director: Sam Mendes
Sala 2. Película: Fast & Furious 8, Director: Felix Gary Gray
6. Visualizar el archivo peliculas.txt para comprobar que se ha creado bien.
7. Crear el archivo pases_peliculas.dat en donde se guarden los datos de cada
una de las salas, con todos los datos de la película que se proyecta.
8. Visualizar el archivo pases_peliculas.dat para comprobar que se ha creado
bien.
9. Igual que el apartado 5, pero guardando esos mismos datos en el archivo
pases_peliculas.txt.
10. Igual al apartado 6 pero visualizando el archivo pases_peliculas.txt.
