<div align="center">

<img src=".github/assets/banner.svg" width="100%" alt="TRIVIA.CINE · trivia de cine y series por turnos">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Consola](https://img.shields.io/badge/💻_interfaz-consola-1B1035?style=for-the-badge)
![Jugadores](https://img.shields.io/badge/👥_jugadores-2_por_turnos-E63946?style=for-the-badge)
![Preguntas](https://img.shields.io/badge/❓_preguntas-6-F4B400?style=for-the-badge)
![UPA](https://img.shields.io/badge/🎓_trabajo-UPA-6D5BD0?style=for-the-badge)


<a href="https://claude.ai/artifact/6RK7nyF9HsXZztpKUsCuZy"><img src="https://img.shields.io/badge/🗂️_VER_TODOS_LOS_PROYECTOS-en_un_solo_lugar-6D5BD0?style=for-the-badge&labelColor=E0457B" height="40" alt="Ver todos los proyectos en un solo lugar"></a>

</div>

<img src=".github/assets/cards.svg" width="100%" alt="Cola FIFO, excepción propia, Bubble Sort y encapsulamiento">

### 🎞️ Una partida

```mermaid
flowchart LR
    M(["🎬 Menú"]):::dark --> J1["👤 Jugador 1<br/>responde"]:::red
    J1 --> J2["👤 Jugador 2<br/>responde"]:::violet
    J2 -- "quedan preguntas" --> J1
    J2 -- "fin de la cola" --> R["🏆 Ranking<br/>Bubble Sort"]:::gold
    R --> M
    classDef dark fill:#1B1035,stroke:#E63946,color:#fff
    classDef red fill:#E63946,stroke:#9B1D3A,color:#fff
    classDef violet fill:#6D5BD0,stroke:#3F2F9E,color:#fff
    classDef gold fill:#F4B400,stroke:#B8801A,color:#1B1035
```

## 🍿 Qué es

Un juego de preguntas de **cine y series** que se juega en la terminal. Dos jugadores se turnan para responder, cada acierto suma puntos según la dificultad y al final se arma una **tabla de posiciones** ordenada de mayor a menor puntaje.

<img src=".github/assets/divider.svg" width="100%">

## 🎮 Cómo se juega

1. Elegí **Iniciar partida** en el menú principal.
2. Cada jugador responde por turnos con un número del **1 al 4**.
3. Las preguntas más difíciles valen más puntos.
4. Al terminar, mirá el **ranking** desde el menú.

```text
1. Iniciar Partida de 2 Jugadores (Por Turnos)
2. Ver Tabla de Posiciones (Ranking)
3. Ver Instrucciones y Reglas
4. Salir
```

<img src=".github/assets/divider.svg" width="100%">

## ▶️ Cómo ejecutarlo

Hace falta tener instalado el **JDK** (Java 8 o superior).

```bash
javac *.java
java JuegoTriviaCineSeries
```

<img src=".github/assets/divider.svg" width="100%">

## 🧩 Qué se aplicó (Programación)

| Concepto | Dónde |
|---|---|
| **Encapsulamiento** (atributos privados, getters) | `Pregunta`, `Jugador` |
| **Cola FIFO** (`Queue<Pregunta>`) para el flujo de preguntas | `JuegoTriviaCineSeries` |
| **Lista dinámica** (`ArrayList<Jugador>`) para el ranking | `JuegoTriviaCineSeries` |
| **Excepción personalizada** para opciones fuera de rango | `OpcionInvalidaException` |
| **Bubble Sort** para ordenar la tabla de posiciones | `JuegoTriviaCineSeries` |
| **Menú interactivo** con `Scanner` y control de entradas inválidas | `JuegoTriviaCineSeries` |

<img src=".github/assets/divider.svg" width="100%">

## 📁 Archivos

| Archivo | Para qué |
|---|---|
| `JuegoTriviaCineSeries.java` | Programa principal: menú, banco de preguntas, partida y ranking |
| `Pregunta.java` | Una pregunta con sus opciones, respuesta correcta, puntos y categoría |
| `Jugador.java` | Nombre, puntaje, aciertos y errores de cada jugador |
| `OpcionInvalidaException.java` | Error propio cuando la opción no está entre 1 y 4 |

<img src=".github/assets/divider.svg" width="100%">

<div align="center"><sub>Trabajo de la facultad · Universidad Politécnica y Artística del Paraguay (UPA)</sub></div>
