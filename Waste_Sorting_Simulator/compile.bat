@echo off
echo ========================================
echo   Waste Sorting Simulator - Compiler
echo ========================================
echo.

REM Create bin directory if it doesn't exist
if not exist "bin" mkdir bin

echo Compiling Java files...
javac -cp "lib/*;." -d bin src/*.java

if %errorlevel% equ 0 (
    echo.
    echo [SUCCESS] Compilation completed successfully!
    echo.
    echo Compiled files are in the 'bin' directory.
    echo.
    echo To run the GUI: run_gui.bat
    echo To run Console: run_console.bat
) else (
    echo.
    echo [ERROR] Compilation failed. Please check the errors above.
    echo.
    echo Common issues:
    echo - Make sure JDK is installed and in PATH
    echo - Verify lib folder contains jfreechart-1.5.4.jar and jcommon-1.0.24.jar
)

echo.
pause
