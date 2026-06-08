# Robot Vacuum Cleaning Simulation

## Description
A robot vacuum cleaning simulation developed with Java and JavaFX as part of the BZ 214 Visual Programming course. The simulation features a virtual robot that autonomously navigates a room, detects and cleans different types of dirt, avoids obstacles, and manages its battery level by returning to a charging station when necessary.

## Features
- **Three cleaning algorithms:**
    - **Random** — moves to unvisited cells randomly, uses BFS to find nearest unvisited cell when stuck
    - **Spiral (Boustrophedon)** — scans the room in an S-shaped pattern row by row
    - **Wall Follow (Frontier-Based)** — explores the boundary between visited and unvisited areas
- **Three dirt types** with different cleaning times and battery costs:
    - Dust — 1 tick, 1 battery
    - Liquid — 3 ticks, 3 battery
    - Stain — 5 ticks, 5 battery
- **BFS pathfinding** — robot returns to charging station via shortest path
- **Unreachable area detection** — areas blocked by furniture are highlighted in red
- **Real-time statistics** — cleaned area, remaining area, elapsed time, collected dirt
- **Smooth robot movement animation**
- **Robot path visualization** — shows the robot's trajectory
- **Manual battery control** — adjust battery level via slider
- **Furniture and dirt placement** — add obstacles and dirt interactively

## Technologies
- Java 21
- JavaFX 21
- Maven

## Architecture
The project follows the **Model-View-Controller (MVC)** architectural pattern:
- **Model** — data and business logic (Robot, Room, Cell, Dirt, Battery, etc.)
- **View** — user interface (JavaFX, FXML, RoomPane)
- **Controller** — simulation logic and coordination (SimulationController, SimulationLoop)

The **Strategy Pattern** is used for cleaning algorithms, allowing runtime switching between Random, Spiral, and Wall Follow strategies without modifying existing code.

## Requirements
- Java 21+
- IntelliJ IDEA (recommended)
- Maven 3.8+

## Project Structure
```
src/
├── model/       # Data and business logic
├── view/        # UI components
├── controller/  # Simulation logic
├── strategy/    # Cleaning algorithms
└── util/        # Enums and utilities
```

## How to Run
1. Clone the repository:
```bash
git clone https://github.com/SerenK00/BZ214-school-project.git
```
2. Open the project with IntelliJ IDEA
3. `File` → `Project Structure` → `Project` → `SDK` → Java 21 or higher select
4. Click `Load` on the Maven popup (bottom right)
5. Run `Launcher.java`

### Opening from ZIP
1. Extract the ZIP file
2. Open with IntelliJ IDEA
3. `File` → `Project Structure` → `Project` → `SDK` → Java 21 or higher select
4. Click `Load` on the Maven popup (bottom right)
5. Run `Launcher.java`

## How to Use
- **Add dirt** — click "Kir Ekle" button, select dirt type, click on the grid
- **Add furniture** — click "Mobilya Ekle" button, click on the grid
- **Select algorithm** — choose from Random, Spiral, or Wall Follow
- **Adjust speed** — use the Robot Hizi slider
- **Control simulation** — Start, Pause, Reset buttons
- **Return to station** — click "Istasyona Don" button
- **Manual battery** — use the Manuel Batarya slider

## Known Issues
- When battery is manually increased while robot is returning to station, robot continues returning instead of resuming cleaning
- Rapidly clicking the manual battery slider causes the robot to teleport to its current position
- Robot may visit the charging station cell as an unvisited area and attempt to clean it instead of charging

## Future Improvements
- Multiple room layouts
- Sound effects
- PathFinder refactor for strategies

## Contributors
- Yusuf Somuncu — Model layer, Strategy layer, Util layer
- Seren Kaya — Controller layer
- Doğukan Türker — View layer

## Acknowledgment
This project was developed as part of the BZ 214 Visual Programming course. Special thanks to the course instructor and contributors.