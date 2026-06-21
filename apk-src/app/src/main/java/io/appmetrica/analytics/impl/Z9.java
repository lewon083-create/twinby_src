package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f23377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLock f23378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f23379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f23380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23381e;

    public Z9(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f23377a, "rw");
            this.f23379c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f23380d = channel;
            if (this.f23381e == 0) {
                this.f23378b = channel.lock();
            }
            this.f23381e++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            this.f23377a.getAbsolutePath();
            int i = this.f23381e - 1;
            this.f23381e = i;
            if (i == 0) {
                Ka.a(this.f23378b);
            }
            ko.a((Closeable) this.f23379c);
            ko.a((Closeable) this.f23380d);
            this.f23379c = null;
            this.f23378b = null;
            this.f23380d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Z9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public Z9(File file) {
        this.f23381e = 0;
        this.f23377a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
