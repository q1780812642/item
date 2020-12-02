package pojo;

import lombok.Data;

@Data
public class Item {

    private Integer id;//主键
    private String title;//标题
    private String pic;//图片地址
    private String context;//描述
    private Double price;//价格

    public Item(int i, String t, String p, String c, double pi) {
        this.id = i;
        this.title = t;
        this.pic = p;
        this.context = c;
        this.price = pi;
    }
}
