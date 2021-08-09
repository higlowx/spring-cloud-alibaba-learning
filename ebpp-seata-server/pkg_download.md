```shell
cd ebpp-seata-server/ && mkdir -p target && cd target 
wget https://github.com/seata/seata/releases/download/v1.3.0/seata-server-1.3.0.tar.gz
tar -zvxf *.gz
mv seata/lib ../lib
cd .. && rm -rf target/
```