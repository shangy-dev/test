package com.shangy.sy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Document(indexName = "tky_test",type = "default")
@Document(indexName = "logstash-2019.12.10-000001",type = "_doc")
public class FileBeat {
    @Id
    private String id;
    //private String timestamp;
    //private String jcsx_rksx_zjh;
    //private String jcsx_rksx_zjlx;
    private int port;
    private String message;
    //private String timestamp;
    //private String version;
    private String host;
}
