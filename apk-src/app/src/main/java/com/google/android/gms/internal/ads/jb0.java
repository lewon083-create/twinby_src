package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9.u f6803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua.a f6804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f6805c;

    public jb0(t9.u uVar, ua.a aVar, gx gxVar) {
        this.f6803a = uVar;
        this.f6804b = aVar;
        this.f6805c = gxVar;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        this.f6804b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z5 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z5).length());
            om1.u(sb2, "Decoded image w: ", width, " h:", height);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j10);
            sb2.append(" on ui thread: ");
            sb2.append(z5);
            t9.c0.m(sb2.toString());
        }
        return bitmapDecodeByteArray;
    }
}
