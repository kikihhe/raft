package com.alipay.sofa.jraft.util;

import com.codahale.metrics.Timer;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;

/**
 * 提供监控线程执行任务功能的定时任务调度器
 */
public class MetricScheduledThreadPoolExecutor extends LogScheduledThreadPoolExecutor {

    public MetricScheduledThreadPoolExecutor(int corePoolSize, String name) {
        super(corePoolSize, name);
    }

    public MetricScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory, String name) {
        super(corePoolSize, threadFactory, name);
    }

    public MetricScheduledThreadPoolExecutor(int corePoolSize, RejectedExecutionHandler handler, String name) {
        super(corePoolSize, handler, name);
    }

    public MetricScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory,
                                             RejectedExecutionHandler handler, String name) {
        super(corePoolSize, threadFactory, handler, name);
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        try {
            ThreadPoolMetricRegistry.timerThreadLocal()
                    .set(ThreadPoolMetricRegistry.metricRegistry().timer("scheduledThreadPool." + getName()).time());
        } catch (final Throwable ignored) {
            // ignored
        }
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        try {
            final ThreadLocal<Timer.Context> tl = ThreadPoolMetricRegistry.timerThreadLocal();
            final Timer.Context ctx = tl.get();
            if (ctx != null) {
                ctx.stop();
                tl.remove();
            }
        } catch (final Throwable ignored) {
            // ignored
        }
    }
}
