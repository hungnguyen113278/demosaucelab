echo "Waiting for local test server to become available..."
while [ $? -ne 0 ]; do
    sleep 3
    ./run.xml
done

echo "Waiting 10 seconds..."
sleep 10

echo "Running tests..."
grunt selenium