package com.example.pay.bytecode;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class PrintTimeTransformer implements ClassFileTransformer {
    //实现字节码转化接口，一个小技巧建议实现接口方法时写@Override，方便重构
    //loader:定义要转换的类加载器，如果是引导加载器，则为 null(在这个小demo暂时还用不到)
    //className:完全限定类内部形式的类名称和中定义的接口名称，例如"java.lang.instrument.ClassFileTransformer"
    //classBeingRedefined:如果是被重定义或重转换触发，则为重定义或重转换的类；如果是类加载，则为 null
    //protectionDomain:要定义或重定义的类的保护域
    //classfileBuffer:类文件格式的输入字节缓冲区（不得修改）
    //一个格式良好的类文件缓冲区（转换的结果），如果未执行转换,则返回 null。
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        return new byte[0];
    }
}
