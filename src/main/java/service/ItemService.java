package service;

import org.springframework.stereotype.Service;
import pojo.Item;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemService {

    private static final Map<Long, Item> MAP = new HashMap<Long, Item>();

    static {//临时数据
        MAP.put(1L, new Item(1, "测试1", "/img/001.jpg", "商品描述1", 100.01));
    }

    public Item queryItemById(Long id) {
        return MAP.get(id);
    }
}
