while [ $? -ne 0 ]; do
    sleep 3
    ./run.xml
done
sleep 10
grunt selenium