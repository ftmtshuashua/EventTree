package com.acap.ec.listener;

import com.acap.ec.Event;

/**
 * <pre>
 * Tip:
 *      链的状态改变监听
 *
 * Created by ACap on 2021/3/31 13:59
 * </pre>
 */
public interface OnChainStateChangeListener<R> extends OnChainListener<R> {

    @Override
    default void onChainStart() {
        onChange(true);
    }

    @Override
    default void onStart(Event event) {
    }

    @Override
    default void onError(Event event, Throwable throwable) {

    }

    @Override
    default void onNext(Event event, R result) {

    }

    @Override
    default void onChainComplete() {
        onChange(false);
    }

    /**
     * 链状态变化监听
     *
     * @param isStarted 链是否开始
     */
    void onChange(boolean isStarted);


}
