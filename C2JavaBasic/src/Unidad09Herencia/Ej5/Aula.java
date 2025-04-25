package Unidad09Herencia.Ej5;


import java.util.ArrayList;

public class Aula {
	private int id;
    private int maxEstudiantes;
    private String materia;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Aula(int id, int maxEstudiantes, String materia) {
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.materia = materia;
        this.estudiantes = new ArrayList<>();
    }

	public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public boolean sePuedeDarClase() {
        if (!profesor.estaDisponible()) {
            System.out.println("El profesor no está disponible.");
            return false;
        }

        if (!profesor.getMateria().equals(this.materia)) {
            System.out.println("El profesor no imparte esta materia.");
            return false;
        }

        int estudiantesPresentes = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.estaDisponible()) {
                estudiantesPresentes++;
            }
        }

        if ((double) estudiantesPresentes / estudiantes.size() <= 0.5) {
            System.out.println("No hay suficientes estudiantes presentes.");
            return false;
        }

        return true;
    }

    public void mostrarResultados() {
        int aprobadosHombres = 0;
        int aprobadasMujeres = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCalificacion() >= 5) {
                if (estudiante.getSexo().equalsIgnoreCase("hombre")) {
                    aprobadosHombres++;
                } else if (estudiante.getSexo().equalsIgnoreCase("mujer")) {
                    aprobadasMujeres++;
                }
            }
        }

        System.out.println("Alumnos aprobados (hombres): " + aprobadosHombres);
        System.out.println("Alumnas aprobadas (mujeres): " + aprobadasMujeres);
    }


	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	}