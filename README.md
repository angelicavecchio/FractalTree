# Fractal Tree (JavaFX)

This project is a  JavaFX application that draws a recursive **fractal tree** using lines and basic geometry. The tree is rendered in a static gray canvas with white branches, recursively branching left and right with a fixed angle and scale.

## Features

- Recursive fractal drawing using JavaFX
- Customizable tree parameters (angle, length)
- Clean and minimal GUI
- Easily extendable to support colors or animations

## Preview

The application opens a 500x500 pixel window showing a white fractal tree on a gray background.

## Technologies Used

- **Java 17+**
- **JavaFX SDK**

## How It Works

- The application starts drawing from the bottom-center of the window.
- It recursively draws lines at ±35 degrees from the current direction.
- Each new branch is 67% the length of the previous one.
- The recursion stops when the branch length is less than 4 pixels.

![image](https://github.com/user-attachments/assets/badffea0-cf7e-4c76-a57a-067ed3125e84)

