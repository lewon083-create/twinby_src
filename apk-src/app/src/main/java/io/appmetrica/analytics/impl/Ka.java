package io.appmetrica.analytics.impl;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Ka {
    public static String a(File file) {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        FileChannel channel;
        if (file == null || !file.exists()) {
            bArr = null;
        } else {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                    fileLockLock = channel.lock(0L, Long.MAX_VALUE, true);
                } catch (IOException | SecurityException unused) {
                    fileLockLock = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileLockLock = null;
                }
            } catch (IOException | SecurityException unused2) {
                randomAccessFile = null;
                fileLockLock = null;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
                fileLockLock = null;
            }
            try {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) file.length());
                channel.read(byteBufferAllocate);
                byteBufferAllocate.flip();
                byte[] bArrArray = byteBufferAllocate.array();
                file.getAbsolutePath();
                a(fileLockLock);
                ko.a((Closeable) randomAccessFile);
                bArr = bArrArray;
            } catch (IOException | SecurityException unused3) {
                bArr = null;
            } catch (Throwable th4) {
                th = th4;
                try {
                    Pj pj2 = AbstractC0366nj.f24449a;
                    pj2.getClass();
                    pj2.a(new C0391oj("error_during_file_reading", th));
                    bArr = null;
                } finally {
                    file.getAbsolutePath();
                    a(fileLockLock);
                    ko.a((Closeable) randomAccessFile);
                }
            }
        }
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e3) {
            String str = new String(bArr);
            Pj pj3 = AbstractC0366nj.f24449a;
            pj3.getClass();
            pj3.a(new C0391oj("read_share_file_with_unsupported_encoding", e3));
            return str;
        }
    }

    public static void a(FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    public static void a(String str, FileOutputStream fileOutputStream) {
        FileLock fileLockLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLockLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length);
            byteBufferAllocate.put(bytes);
            byteBufferAllocate.flip();
            channel.write(byteBufferAllocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            a(fileLockLock);
            ko.a((Closeable) fileOutputStream);
        }
    }
}
