package me.brucezz.viewfinder;

import me.brucezz.viewfinder.provider.Provider;

public interface Finder<T> {
    /**
     * @param host 表示注解 View 变量所在的类，也就是注解类
     * @param source 表示查找 View 的地方，Activity & View 自身就可以查找，Fragment 需要在自己的 itemView 中查找
     * @param provider 是一个接口，定义了不同对象（比如 Activity、View 等）如何去查找目标 View
     */
    void inject(T host, Object source, Provider provider);
}
