@echo off
echo Testing Fruit Service Engine compilation...

REM Test if classes exist
if exist "target\classes\client\FruitClient.class" (
    echo ✓ FruitClient compiled successfully
) else (
    echo ✗ FruitClient compilation failed
)

if exist "target\classes\server\FruitComputeEngine.class" (
    echo ✓ FruitComputeEngine compiled successfully
) else (
    echo ✗ FruitComputeEngine compilation failed
)

if exist "target\classes\server\FruitComputeTaskRegistry.class" (
    echo ✓ FruitComputeTaskRegistry compiled successfully
) else (
    echo ✗ FruitComputeTaskRegistry compilation failed
)

if exist "target\classes\model\FruitPrice.class" (
    echo ✓ FruitPrice compiled successfully
) else (
    echo ✗ FruitPrice compilation failed
)

if exist "target\classes\server\interfaces\Compute.class" (
    echo ✓ Compute interface compiled successfully
) else (
    echo ✗ Compute interface compilation failed
)

if exist "target\classes\server\interfaces\Task.class" (
    echo ✓ Task interface compiled successfully
) else (
    echo ✗ Task interface compilation failed
)

echo.
echo To run the application:
echo 1. First run: start-server.bat
echo 2. Then run: start-client.bat
echo.
pause
