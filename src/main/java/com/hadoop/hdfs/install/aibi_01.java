package com.hadoop.hdfs.install;

/**
 * Linux编译Hadoop
 */
public class aibi_01 {

    /**
     * @1 所需软件
     */

    /*@1 apache-ant-1.9.4-bin.tar.gz
     *
     *@2 findbugs-3.0.0.tar.gz
     *
     *@3 protobuf-2.5.0.tar.gz
     *
     *@4 apache-maven-3.0.5-bin.tar.gz
     *
     *@5 hadoop-2.4.0-src.tar.gz(源码包)
     * */

    /**
     * @2 软件安装
     *
     * */

    /*@1 apache-ant <https://blog.csdn.net/biexf/article/details/6000968?utm_source=blogxgwz0>
     *
     *@2 findbugs   <https://blog.csdn.net/hlx20080808/article/details/80061282>
     *
     *@3 protobuf   <https://blog.csdn.net/u011596455/article/details/64622830>
     *
     *@4 apache-maven  <https://blog.csdn.net/l05199179/article/details/78982212>
     *
     */
    /**
     * @3 必要yum (必须连接外网)（yum install -y gcc-c++这个也是必须的）
     */

    /*@1 yum install cmake
     *
     *@2 yum install openssl-devel
     *
     *@3 yum install ncurses-devel
     */

    /**
     * @4 解压缩Hadoop
     */
    /*
     * tar -zxvf hadoop-2.4.0-src.tar.gz
     */

    /**
     * @5 编译hadoop
     *
     *
     * ##### 已经编译好的hadoop cenos-6.5-hadoop-2.6.4.tar.gz
     */
    /* @1  cd hadoop-2.4.0-src
     *
     * @2  执行 mvn clean install -DskipTests
     *
     * 这个过程会很漫长很漫长联网下载好多好多东西
     *
     * @3 上一步完成,开始编译,执行命令
     *
     * mvn package -Pdist,native -DskipTests -Dtar
     *
     * 这个过程也很漫长
     *
     * @4 BUILD SUCCESS 出现这个表示编译成功
     *
     * ##### 已经编译好的hadoop cenos-6.5-hadoop-2.6.4.tar.gz
     */

    /***
     * @6 Hadoop集群简介
     */
    /*@1 HDFS集群 负责文件读写
     *
     * name node 默认端口9000,针对客户端访问
     * （记录用户上传的文件分布在哪个datanode上）
     *
     * data node
     *
     *@2 yarn集群为mapreduce程序分配运算硬件资源
     *
     *   yarn集群节点放在HDFS datanode上
     */

    /**
     * @6 集群配置
     */
    /*@1 配置文件修改 路径(/usr/local/hadoop/hadoop-2.6.4/etc/hadoop)
     *
     *1.1 首先找到JAVA_HOME路径
     *
     *命令 echo $JAVA_HOME (得到JAVA_HOME路径)
     *
     *1.2 vim hadoop-env.sh 修改JAVA_HOME
     *
     *export JAVA_HOME=/usr/local/apps/jdk1.7.0_45
     *
     *1.3 更改工具使用EditPlus 更改内容参照包目录下 <core-site.xml hdfs-site.xml mapred-site.xml yarn-site.xml>
     *
     *###注意,更改以上任何一个文件都不允许出现中文,否则在hdfs格式化的时候回报错,我在示例中写的注释中文在实际配置的时候要去掉
     *
     *1.4 将hadoop加入到环境变量中 export HADOOP_HOME=/usr/local/hadoop/hadoop-2.6.4
     *
     *1.5 格式化 hadoop
     *
     *命令 hdfs namenode -format (hadoop namenode -format)
     *
     *1.5.1 查看格式化namenode是否成功
     *
     *格式化过程中出现  Storage directory /home/hadoop/hadoop-2.4.1/tmp/dfs/has been successfully formatted
     *
     *证明格式化成功
     *
     *1.6 启动hadoop 进入hadoop目录下的sbin目录
     *
     * 先启动hdfs ./start-dfs.sh
     *
     * 再启动YARN ./start-yarn.sh
     *
     *1.7 查看hadoop是否启动成功
     *
     * 命令 jps (出现以下内容证明启动成功)
     *
     *  27408 NameNode
     *	28218 Jps
     *	27643 SecondaryNameNode
     *	28066 NodeManager
     *	27803 ResourceManager
     *	27512 DataNode
     *
     *1.8 外部访问  http://192.168.25.136:50070 访问成功证明namenode启动成功
     */

    /**
     * @#####查看日志
     */

    /* starting datanode, logging to /usr/local/hadoop/hadoop-2.6.4/logs/hadoop-root-datanode-hadoop04.out
     *
     * 进入  /usr/local/hadoop/hadoop-2.6.4/logs/
     *
     * 查看已log结尾的文件 cat一下即可
     *
     */

}