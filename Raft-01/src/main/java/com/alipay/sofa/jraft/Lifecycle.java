package com.alipay.sofa.jraft;

/**
 * @author : 小何
 * @Description : 生命周期接口
 * @date : 2024-03-31 14:32
 */
public interface Lifecycle<T> {
    public boolean init(final T opts);

    public void shutdown();
}
