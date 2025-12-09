@echo off
echo ========================================
echo   Launching Console Simulator
echo ========================================
echo.

if not exist "bin\Simulator.class" (
    echo [ERROR] Console application not compiled yet!
    echo Please run compile.bat first.
    echo.
    pause
    exit /b 1
)

echo Starting console application...
echo.
java -cp "bin;lib/*" Simulator

if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Failed to run the application.
    echo.
    pause
)
