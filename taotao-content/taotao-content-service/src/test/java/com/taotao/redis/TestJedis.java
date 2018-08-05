package com.taotao.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/8/5 14:36
 */
public class TestJedis {
    @Test
    public void testJedis() {
        Jedis jedis = new Jedis("192.168.16.30", 6379);
        jedis.set("str2", "456");
        System.out.println(jedis.get("str2"));
        jedis.close();
    }

    @Test
    public void testJedisCluster(){

    }
}
