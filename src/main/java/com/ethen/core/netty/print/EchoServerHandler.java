package com.ethen.core.netty.print;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;

/**
 * 服务端接受客服端的信息并且打印
 */
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
//        super.channelRead(ctx, msg);
        ByteBuf byteBuf = (ByteBuf) msg;
        System.err.print(byteBuf.toString(Charset.forName("utf-8")));
        ctx.writeAndFlush(byteBuf);
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
//        super.exceptionCaught(ctx, cause);
        //如果出现异常 则关闭连接！
        cause.printStackTrace();
        ctx.close();
    }
}
