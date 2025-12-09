@echo off
echo ========================================
echo   Launching Waste Sorter GUI
echo ========================================
echo.

if not exist "bin\WasteSorterGUI.class" (
    echo [ERROR] GUI application not compiled yet!
    echo Please run compile.bat first.
    echo.
    pause
    exit /b 1
)

echo Starting GUI application...
echo.
java -cp "bin;lib/*" WasteSorterGUI

if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Failed to run the application.
    echo.
    echo Troubleshooting:
    echo - Make sure Java Runtime is installed
    echo - Verify lib folder contains required JAR files
    echo - Try recompiling with compile.bat
    echo.
    pause
)
