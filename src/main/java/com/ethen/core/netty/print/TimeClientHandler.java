package com.ethen.core.netty.print;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

public class TimeClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)  {
//        super.channelRead(ctx, msg);
        try {
            ByteBuf byteBuf = (ByteBuf) msg;
            int len = byteBuf.readableBytes();
            byte[] buff = new byte[1024];
            byteBuf.readBytes(buff, 0, len);
            System.err.println("当前时间：" + new String(buff, 0, len));
            ctx.close();
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//        super.exceptionCaught(ctx, cause);
        cause.printStackTrace();
        ctx.close();
    }
}
